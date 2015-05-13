/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clifford;
import Ensambladores.*;
import Lorenz.*;
import Mandelbrot.*;
import java.util.ArrayList;
//import javax.vecmath.Point3d;
/**
 *
 * @author Omar López Ortega
 */
public class GClifford extends GeneradorMusical
{
    private double Xn;
    private double Yn;
    private double Zn;
    /*private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    public int tempoX, tempoY, tempoZ;
    public double duracionX, duracionY, duracionZ;*/
    private double [] arregloX;
    private double [] arregloY;
    private double [] arregloZ;
    public int[] xEscaladas;
    public int[] yEscaladas;
    public int[] zEscaladas;
    public int[] temposX;
    public int[] temposY;
    public int[] temposZ;
    public double[] duracionesX;
    public double[] duracionesY;
    public double[] duracionesZ;
    protected ArrayList points;
    protected String name;
    EnsambladorNotas ensamblador = new EnsambladorNotas();

    public void cicloGenerador()
    {
        this.Xn = super.x;
        this.Yn = super.y;
        this.Zn = super.z;
        /*this.a = super.a;
        this.b = super.b;
        this.c = super.c;
        this.d = super.d;
        this.e = super.e;
        this.tempoX = super.tempoX;
        this.tempoY = super.tempoY;
        this.tempoZ = super.tempoZ;
        this.duracionX = super.duracionX;
        this.duracionY = super.duracionY;
        this.duracionZ = super.duracionZ;*/
        xEscaladas = new int[super.iteraciones];
        yEscaladas = new int[super.iteraciones];
        zEscaladas = new int[super.iteraciones];
        temposX = new int[super.iteraciones];
        temposY = new int[super.iteraciones];
        temposZ = new int[super.iteraciones];
        duracionesX = new double[super.iteraciones];
        duracionesY = new double[super.iteraciones];
        duracionesZ = new double[super.iteraciones];
        cicloClifford();
    }
    public void cicloClifford()
    {
        points = new ArrayList();
//        points.add(new Point3d(Xn,Yn,Zn));
        for (int i = 1; i < super.iteraciones; i++)
        {
            double Xnt = Math.sin(Math.toRadians(super.a*Yn))+super.c*Math.cos(Math.toRadians(super.a*Xn));
            double Ynt = Math.sin(Math.toRadians(super.b*Xn))+super.d*Math.cos(Math.toRadians(super.b*Yn));
            double Znt = Math.sin(Math.toRadians(Xn))+super.e*Math.cos(Math.toRadians(super.d*Zn));
            Xn = Xnt;
            Yn = Ynt;
            Zn = Znt;
//            points.add(new Point3d(Xn,Yn,Zn));
        }
    }
    public void obtenerArreglos()
    {
        int tam = points.size();
        arregloX = new double[tam];
        arregloY = new double[tam];
        arregloZ = new double[tam];
//        for (int i = 0; i < arregloX.length; i++)
//        {
//            Point3d p = (Point3d) points.get(i);
//            arregloX[i]=p.x;
//            arregloY[i]=p.y;
//            arregloZ[i]=p.z;
//        }
    }
    public double[] obtenerArregloX()
    {
        return arregloX;
    }
    public double[] obtenerArregloY()
    {
        return arregloY;
    }
    public double[] obtenerArregloZ()
    {
        return arregloZ;
    }
    public void obtenValoresEscalados()
    {
        xEscaladas = Escalamiento.regresaArregloBytes3P(this.obtenerArregloX());
        yEscaladas = Escalamiento.regresaArregloBytes3P(this.obtenerArregloY());
        zEscaladas = Escalamiento.regresaArregloBytes3P(this.obtenerArregloZ());
        for(int k = 0; k < super.iteraciones; k++)
        {
            duracionesX[k] = Math.abs(xEscaladas[k]*super.duracionX/127);
            duracionesY[k] = Math.abs(yEscaladas[k]*super.duracionY/127);
            duracionesZ[k] = Math.abs(zEscaladas[k]*super.duracionZ/127);
            temposX[k] = (int)Math.abs((xEscaladas[k]*140/127) + 120);
            temposY[k] = (int)Math.abs((yEscaladas[k]*140/127) + 120);
            temposZ[k] = (int)Math.abs((zEscaladas[k]*140/127) + 127);
            //System.out.println(duracionesX[k]);
        }
    }
    @Override
    public void ensamblaNotas()
    {
        this.obtenerArreglos();
        this.obtenValoresEscalados();
        ensamblador.recibeInstrumento(super.instrumento);
        ensamblador.recibePlantilla(super.plantilla);
        ensamblador.recibeNombreArchivo(super.nombreArchivo);
        if(super.escala == null)
        {
            if(super.tv == true && super.dv == true)
            {
            ensamblador.ensamblaPatron(xEscaladas, yEscaladas, zEscaladas, temposX, temposY, temposZ, duracionesX, duracionesY, duracionesZ, super.acorde);
            }
            if(super.tv == false && super.dv == false)
            {
            ensamblador.ensamblaPatron(xEscaladas, yEscaladas, zEscaladas, super.tempoX, super.tempoY, super.tempoZ, super.duracionX, super.duracionY, super.duracionZ, super.acorde);
            }
            if(super.tv == false && super.dv == true)
            {
            ensamblador.ensamblaPatron(xEscaladas, yEscaladas, zEscaladas, super.tempoX, super.tempoY, super.tempoZ, duracionesX, duracionesY, duracionesZ, super.acorde);
            }
            if(super.tv == true && super.dv == false)
            {
            ensamblador.ensamblaPatron(xEscaladas, yEscaladas, zEscaladas, temposX, temposY, temposZ, super.duracionX, super.duracionY, super.duracionZ, super.acorde);
            }
        }
        if(super.escala != null)
        {
            if(super.tv== true && super.dv == true)
            {
            ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, zEscaladas, temposX, temposY, temposZ, duracionesX, duracionesY, duracionesZ, super.acorde);
            }
            if(super.tv == false && super.dv == false)
            {
            ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, zEscaladas, super.tempoX, super.tempoY, super.tempoZ, super.duracionX, super.duracionY, super.duracionZ, super.acorde);
            }
            if(super.tv == false && super.dv == true)
            {
            ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, zEscaladas, super.tempoX, super.tempoY, super.tempoZ, duracionesX, duracionesY, duracionesZ, super.acorde);
            }
            if(super.tv == true && super.dv == false)
            {
            ensamblador.ensamblaPatron(super.escala, xEscaladas, yEscaladas, zEscaladas, temposX, temposY, temposZ, super.duracionX, super.duracionY, super.duracionZ, super.acorde);
            }
        }
        ensamblador.interpretaPatron();
    }
}
