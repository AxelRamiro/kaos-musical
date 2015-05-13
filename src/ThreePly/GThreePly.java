/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreePly;
import Ensambladores.*;
import Lorenz.*;
import Mandelbrot.*;
/**
 *
 * @author Omar López Ortega
 */
public class GThreePly extends GeneradorMusical
{
    EnsambladorNotas ensamblador = new EnsambladorNotas();
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
    public double[] durasX;
    public double[] durasY;
    public int[] temposX;
    public int[] temposY;
    @Override
    public void cicloGenerador()
    {
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
        this.notaXinicial = super.x;
        this.notaYinicial = super.y;
        this.tX = super.tempoX;
        this.tY = super.tempoY;
        this.dX = super.duracionX;
        this.dY = super.duracionY;
        aa = Math.toRadians(15);
        bb = Math.toRadians(30);
        cc = Math.toRadians(60);
        System.out.println("Nota X Inicial: " + this.notaXinicial + " Nota Y Inicial: " + this.notaYinicial);
        ciclo3P();
    }
    public double calculaXSiguiente(double x, double y)
    {
        sgn = (x>0)?1:(x<0)?-1:0;
        xSig = y - sgn*Math.abs(Math.sin(Math.toRadians(x))*Math.cos(Math.toRadians(bb))+cc-x*Math.sin(Math.toRadians(aa+bb+cc)));
        return xSig;
    }
    public double calculaYSiguiente(double x)
    {
        ySig = aa - x;
        return ySig;
    }
    public void obtenValoresEscalados()
    {
        xEscaladas = Escalamiento.regresaArregloBytes3P(xSiguiente);
        yEscaladas = Escalamiento.regresaArregloBytes3P(ySiguiente);        
        for(int k = 0; k < super.iteraciones; k++)
        {
            durasX[k] = Math.abs(xSiguiente[k])*this.dX/25;
            durasY[k] = Math.abs(ySiguiente[k])*this.dY/25;
            temposX[k] = (int)Math.abs((xEscaladas[k]*140/127)+120);
            temposY[k] = (int)Math.abs((yEscaladas[k]*140/127)+120);
        }
    }
    public void ciclo3P()
    {
        xActual[0] = this.notaXinicial;
        yActual[0] = this.notaYinicial;
        try
        {
            for(int i = 0; i < super.iteraciones; i++)
            {
                xSiguiente[i] = this.calculaXSiguiente(xActual[i], yActual[i]);
                ySiguiente[i] = this.calculaYSiguiente(xActual[i]);
                System.out.println("Valor X en Fractal: " + xSiguiente[i] + " Valor Y en Fractal: " + ySiguiente[i] );
                xActual[i+1] = this.xSiguiente[i];
                yActual[i+1] = this.ySiguiente[i];            
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Fin de iteraciones");    
        }
    }
    @Override
    public void ensamblaNotas()
    {
            obtenValoresEscalados();
            ensamblador.recibeInstrumento(super.instrumento);
            ensamblador.recibePlantilla(super.plantilla);
            ensamblador.recibeNombreArchivo(super.nombreArchivo);
            if(super.escala.equals("Ninguna"))
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
            if(super.escala != "Ninguna")
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
