/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Mandelbrot;
import Lorenz.*;
import Ensambladores.*;
import java.util.*;
/**
 *
 * @author OMAR LÓPEZ ORTEGA
 */
public class GMandelbrot extends GeneradorMusical
{
    public char porTocar;
    public double realConstante;
    public double imaginarioConstante;
    public double realSiguiente;
    public double imaginarioSiguiente;
    public double realAnterior;
    public double imaginarioAnterior;
    public double[] notaReal;
    public double[] notaImaginario;
    public double[] notaRealNM;
    public double[] notaImaginarioNM;
    public int[] realesEscalados;
    public int[] imaginariosEscalados;
    public int[] realesEscaladosNM;
    public int[] imaginariosEscaladosNM;
    public int[] temposMReales;
    public int[] temposMImaginarios;
    public int[] temposNMReales;
    public int[] temposNMImaginarios;
    public double[] durasMReales;
    public double[] durasMImaginarios;
    public double[] durasNMReales;
    public double[] durasNMImaginarios;
    public int discriminador;
    public double realCuadrado;
    public double imaginarioCuadrado;
    public double magnitud;    
    public boolean estaEnMandelbrot;
    public int tempoNotas;
    public double duracionMR, duracionMI, duracionNMR, duracionNMI;
    public int tempoNotasNM;
    public double duracionNotasNM;
    //public String escala = new String();
    List <Double> nReal = new ArrayList<Double>();
    List <Double> nImaginario = new ArrayList<Double>();
    public EnsambladorNotas ensamblador = new EnsambladorNotas();
    
    @Override
    /*public void estableceDiscriminador(int elDiscriminador)
    {
        this.discriminador = elDiscriminador;
    }
    @Override
    public void establecePorTocar(char c)
    {
        this.porTocar = c;
    }*/
    public void cicloGenerador()
    {   
        realesEscalados = new int[super.iteraciones];
        imaginariosEscalados = new int[super.iteraciones];
        realesEscaladosNM = new int[super.iteraciones];
        imaginariosEscaladosNM = new int[super.iteraciones];
        this.porTocar = super.porTocar;
        this.discriminador = super.discriminador;
        this.tempoNotas = super.tempoX;
        this.duracionMR = super.duracionX;
        this.duracionMI = super.duracionY;
        this.tempoNotasNM = super.tempoY;
        this.duracionNMR = super.duracionZ;
        this.duracionNMI = super.duracionW;
        cicloMandelbrot();        
    }
    public double realCuadrado(double real , double imaginario)
    {
        return real*real - imaginario*imaginario;        
    }    
    public double imaginarioCuadrado(double real, double imaginario)
    {
        return 2*real*imaginario;
    }
    public double magnitudComplejo(double real , double imaginario)
    {
        return Math.sqrt((real*real) + (imaginario*imaginario));
    }
    public boolean pertenece(double m)
    {
        if (m <2)return true;
        else return false;            
    }
    public double devuelveReales()
    {
        return realSiguiente;
    }
    public double devuelveImaginarios()
    {        
        return imaginarioSiguiente;
    }
    public void obtenRealesEscalados()
    {
        realesEscalados = Escalamiento.regresaArregloBytes(notaReal);
        realesEscaladosNM = Escalamiento.regresaArregloBytes(notaRealNM);
    }
    public void obtenImaginariosEscalados()
    {        
        imaginariosEscalados = Escalamiento.regresaArregloBytes(notaImaginario);        
        imaginariosEscaladosNM = Escalamiento.regresaArregloBytes(notaImaginarioNM);        
    }
    public void obtenTemposEscalados()
    {
        for(int j = 0; j < super.iteraciones; j++)
        {
            temposNMReales[j] = (int) (Math.abs((this.realesEscaladosNM[j]*140/127)+120));
            temposNMImaginarios[j] = (int) (Math.abs((this.imaginariosEscaladosNM[j]*140/127)+120));
            temposMReales[j] = (int) (Math.abs((this.realesEscalados[j]*140/127)+120));
            temposMImaginarios[j] = (int) (Math.abs((this.imaginariosEscalados[j]*140/127)+120));
        }
    }
    public void cicloMandelbrot()
    {
        notaReal = new double[super.iteraciones];
        notaImaginario = new double[super.iteraciones];
        notaRealNM = new double[super.iteraciones];
        notaImaginarioNM = new double[iteraciones];
        temposMReales = new int[super.iteraciones];
        temposMImaginarios = new int[super.iteraciones];
        temposNMReales = new int[super.iteraciones];
        temposNMImaginarios = new int[iteraciones];
        durasMReales = new double[super.iteraciones];
        durasMImaginarios = new double[super.iteraciones];
        durasNMReales = new double[super.iteraciones];
        durasNMImaginarios = new double[super.iteraciones];
        for(int j = 0; j < super.iteraciones; j++)
        {
            realAnterior = 0;
            imaginarioAnterior = 0;
            this.realConstante = Math.random();
            this.imaginarioConstante = Math.random();
            //System.out.println((j+1) + " Numero complejo a evaluar:\t" + this.realConstante + " " + "+ i"+this.imaginarioConstante);
            for(int i = 0; i < super.discriminador; i++)
            {
                realAnterior = this.realCuadrado(realAnterior, imaginarioAnterior);
                imaginarioAnterior = this.imaginarioCuadrado(realAnterior, imaginarioAnterior);
                realSiguiente = realAnterior + realConstante;
                imaginarioSiguiente = imaginarioAnterior + imaginarioConstante;
                //System.out.println(realSiguiente + " " + imaginarioSiguiente);
                realAnterior = realSiguiente;
                imaginarioAnterior = imaginarioSiguiente;              
            }
            magnitud = this.magnitudComplejo(realAnterior,imaginarioAnterior);
            estaEnMandelbrot = this.pertenece(magnitud);
            if(estaEnMandelbrot == false)
            {
                //System.out.println("\tNumero complejo\t"+this.realConstante + "\t+i "+this.imaginarioConstante+"\tNO pertenece");
                notaRealNM[j] = this.realConstante;
                notaImaginarioNM[j] = imaginarioConstante;
                durasNMReales[j] = Math.abs((this.realConstante)*(duracionNMR));
                if(durasNMReales[j] < 0.001) durasNMReales[j]=0.1;
                durasNMImaginarios[j] = Math.abs((this.imaginarioConstante)*(duracionNMI));
                if(durasNMImaginarios[j]>0.001) durasNMImaginarios[j]=0.1;
                //System.out.println(temposNMReales[j] +"\t"+durasNMReales[j] + "\t" + durasNMImaginarios[j]);
            }
            else if(estaEnMandelbrot == true)
            {
                //System.out.println("\tNumero complejo\t"+this.realConstante + "\t+i"+this.imaginarioConstante+"\tSI pertenece");
                notaReal[j] = realConstante;
                notaImaginario[j] = imaginarioConstante;
                durasMReales[j] = Math.abs((this.realConstante)*(duracionMR));
                if(durasMReales[j] < 0.001) durasMReales[j] =0.1;
                durasMImaginarios[j] = Math.abs((this.imaginarioConstante)*(duracionMI));
                if(durasMImaginarios[j] < 0.001) durasMImaginarios[j]=0.1;
                //System.out.println("TEMPOS: " + temposMReales[j]);
            }       
        }
    }
    @Override
    public void ensamblaNotas()
    {
            obtenRealesEscalados();
            obtenImaginariosEscalados();
            obtenTemposEscalados();
            ensamblador.recibeInstrumento(super.instrumento);
            ensamblador.recibePlantilla(super.plantilla);
            ensamblador.recibeNombreArchivo(super.nombreArchivo);
            if(super.porTocar == 'm' || super.porTocar == 'M')
            {
                if(super.escala == null)
                {
                    if(super.dv == false && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(realesEscalados, imaginariosEscalados, tempoNotas, duracionMR, duracionMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(realesEscalados, imaginariosEscalados, tempoNotas, durasMReales, durasMImaginarios, super.acorde);
                    }
                    if(super.dv == false && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(realesEscalados, imaginariosEscalados, temposMReales, duracionMR, duracionMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(realesEscalados, imaginariosEscalados, temposMReales, durasMReales, durasMImaginarios, super.acorde);
                    }
                }
                if(super.escala != null)
                {
                    if(super.dv == false && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscalados, imaginariosEscalados, tempoNotas, duracionMR, duracionMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscalados, imaginariosEscalados, tempoNotas, durasMReales, durasMImaginarios, super.acorde);
                    }
                    if(super.dv == false && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscalados, imaginariosEscalados, temposMReales, duracionMR, duracionMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscalados, imaginariosEscalados, temposMReales, durasMReales, durasMImaginarios, super.acorde);
                    }    
                }

            }
            if(porTocar == 'a' || porTocar == 'A')
            {
                if(super.escala == null)
                {
                    ensamblador.ensamblaPatron(realesEscalados, imaginariosEscalados, realesEscaladosNM, imaginariosEscaladosNM, tempoNotas, duracionMR, duracionMI, tempoNotasNM, duracionNMR, duracionNMI, super.acorde);
                }
                if(super.escala != null)
                {
                    ensamblador.ensamblaPatron(super.escala, realesEscalados, imaginariosEscalados, realesEscaladosNM, imaginariosEscaladosNM, tempoNotas, duracionMR, duracionMI, tempoNotasNM, duracionNMR, duracionNMI, super.acorde);
                }
            }
            if(porTocar == 'n' || porTocar == 'N')
            {
                if(super.escala == null)
                {
                    if(super.dv == false && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(realesEscaladosNM, imaginariosEscaladosNM, tempoNotasNM, duracionNMR, duracionNMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(realesEscaladosNM, imaginariosEscaladosNM, tempoNotasNM, durasNMReales, durasNMImaginarios, super.acorde);
                    }
                    if(super.dv == false && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(realesEscaladosNM, imaginariosEscaladosNM, temposNMReales, duracionNMR, duracionNMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(realesEscaladosNM, imaginariosEscaladosNM, temposNMReales, durasNMReales, durasNMImaginarios, super.acorde);
                    }
                }
                if(super.escala != null)
                {
                    if(super.dv == false && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscaladosNM, imaginariosEscaladosNM, tempoNotasNM, duracionNMR, duracionNMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == false)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscaladosNM, imaginariosEscaladosNM, tempoNotasNM, durasNMReales, durasNMImaginarios, super.acorde);
                    }
                    if(super.dv == false && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscaladosNM, imaginariosEscaladosNM, temposNMReales, duracionNMR, duracionNMI, super.acorde);
                    }
                    if(super.dv == true && super.tv == true)
                    {
                        ensamblador.ensamblaPatron(super.escala, realesEscaladosNM, imaginariosEscaladosNM, temposNMReales, durasNMReales, durasNMImaginarios, super.acorde);
                    }
                }
            }
            ensamblador.interpretaPatron();            
    }
}
