/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MamdaniLopez;
import Ensambladores.*;
import Lorenz.*;
/**
 *
 * @author Omar López Ortega
 */
public class GMamdaniLopez extends GeneradorMusical
{
    EnsambladorNotas ensamblador = new EnsambladorNotas();
    FractalDifuso fd;// = new FractalDifuso();
    public double aa, bb, cc;
    public double[] xActual;
    public double[] xSiguiente;
    public double[] yActual;
    public double[] ySiguiente;
    public int[] xEscaladas;
    public int[] yEscaladas;
    public double xSig, ySig;
    public double notaXinicial;
    public double notaYinicial;
    public double dX, dY;
    public int tX, tY, sgn;
    public double sigmo;
    public double[] durasX;
    public double[] durasY;
    public int[] temposX;
    public int[] temposY;

    public void llamaFractal()
    {
        fd = new FractalDifuso();
    }
    @Override
    public void cicloGenerador()
    {
        this.llamaFractal();
        fd.mostrarRegiones();
        xActual = new double[super.iteraciones];
        xSiguiente = new double[super.iteraciones];
        yActual = new double[super.iteraciones];
        ySiguiente = new double[super.iteraciones];
        xEscaladas = new int[super.iteraciones];
        yEscaladas = new int[super.iteraciones];
        temposX = new int[super.iteraciones];
        temposY = new int[super.iteraciones];
        durasX = new double[super.iteraciones];
        durasY = new double[super.iteraciones];
        notaXinicial = super.x;
        notaYinicial = super.y;
        this.tX = super.tempoX;
        this.tY = super.tempoY;
        this.dX = super.duracionX;
        this.dY = super.duracionY;
        this.aa = super.a;
        this.bb = super.b;
        this.cc = super.c;
        System.out.println("Nota X Inicial: " + this.notaXinicial + " Nota Y Inicial: " + this.notaYinicial);
        cicloML();
    }
    public double calculaXSiguiente(double x, double y)
    {
         xSig = fd.calculaFractalDifuso(x, y);
        //return (y- xSig);
        return(aa - xSig);
    }
    public double calculaYSiguiente(double x, double y)
    {
        //Opcion no lineal 1
        /*ySig =  Math.sqrt((x - this.aa)*(x -this.aa)+(y - this.bb)*(y-this.bb))/Math.sqrt((x - this.bb)*(x-this.bb)+(y - this.cc)*(y-this.cc))+Math.sqrt((x - this.aa)*(x-this.aa)+(y - this.cc)*(y-this.cc))/Math.sqrt((x - this.aa)*(x -this.aa)+(y - this.bb)*(y-this.bb));//*(Math.sin(this.aa+this.bb+this.cc));
        return (x - ySig);*/
        //Opcion no lineal 2
            //opcion signum
        //sgn = (y>0)?1:(y<0)?-1:0;
            //opcion sigmoide
        sigmo = Sigmoide.calculaSigmoide(y);
        ySig = x - sigmo*Math.abs(Math.sin(Math.toRadians(y))*Math.cos(Math.toRadians(bb))+cc-y*Math.sin(Math.toRadians(aa+bb+cc)));
        return ySig;
    }
    public void obtenValoresEscalados()
    {
        xEscaladas = Mandelbrot.Escalamiento.regresaArregloBytes3P(xSiguiente);
        yEscaladas = Mandelbrot.Escalamiento.regresaArregloBytes3P(ySiguiente);
        for(int k = 0; k < super.iteraciones; k++)
        {
            durasX[k] = Math.abs(xSiguiente[k])*this.dX;
            durasY[k] = Math.abs(ySiguiente[k])*this.dY;
            temposX[k] = (int)Math.abs((xEscaladas[k]*(140/127))+120);
            temposY[k] = (int)Math.abs((yEscaladas[k]*(140/127))+120);
        }
    }
    public void cicloML()
    {
        xActual[0] = notaXinicial;
        yActual[0] = notaYinicial;
        try
        {
            for(int i = 0; i < super.iteraciones; i++)
            {
                xSiguiente[i] = this.calculaXSiguiente(xActual[i], yActual[i]);
                ySiguiente[i] = this.calculaYSiguiente(xActual[i], yActual[i]);
                xActual[i+1] = this.xSiguiente[i];
                yActual[i+1] = this.ySiguiente[i];
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Fin de iteraciones");
        }
        for(int i = 0; i < super.iteraciones; i++)
        {
            System.out.println("i: " + i + " X: " + xSiguiente[i] + " Y: " + ySiguiente[i]);
        }
    }
    @Override
    public void ensamblaNotas()
    {
            obtenValoresEscalados();
            ensamblador.recibeInstrumento(super.instrumento);
            ensamblador.recibePlantilla(super.plantilla);
            ensamblador.recibeNombreArchivo(super.nombreArchivo);
            if(this.escala == null)
            {
                if(super.dv == false && super.tv == false)
                {
                    ensamblador.ensamblaPatron(xEscaladas, yEscaladas, tX, tY, dX, dY, super.acorde);
                }
                if(super.dv == true && super.tv == false)
                {
                    ensamblador.ensamblaPatron(xEscaladas, yEscaladas, tX, tY, durasX, durasY, super.acorde);
                }
                if(super.dv == false && super.tv == true)
                {
                    ensamblador.ensamblaPatron(xEscaladas, yEscaladas, temposX, temposY, dX, dY, super.acorde);
                }
                if(super.dv == true && super.tv == true)
                {
                    ensamblador.ensamblaPatron(xEscaladas, yEscaladas, temposX, temposY, durasX, durasY, super.acorde);
                }
            }
            if(this.escala != null)
            {
                if(super.dv == false && super.tv == false)
                {
                    ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, tX, tY, dX, dY, super.acorde);
                }
                if(super.dv == true && super.tv == false)
                {
                    ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, tX, tY, durasX, durasY, super.acorde);
                }
                if(super.dv == false && super.tv == true)
                {
                    ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, temposX, temposY, dX, dY, super.acorde);
                }
                if(super.dv == true && super.tv == true)
                {
                    ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, temposX, temposY, durasX, durasY, super.acorde);
                }
            }
            ensamblador.interpretaPatron();
    }
}
