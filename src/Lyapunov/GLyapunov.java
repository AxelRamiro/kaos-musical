/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Lyapunov;
import Lorenz.*;
import Ensambladores.*;

/**
 * @author Omar Lopez Ortega
 */
public class GLyapunov extends GeneradorMusical
{
    public double[] iterados;
    public double[][] matrizLambdas;
    public int[][] matrizLambdasEscaladas;
    public int[][] matrizTempos;
    public double[][] matrizDuraciones;
    public double rn;
    public double lambda;
    public char navegador;
    public double xInicial, xFinal, yInicial, yFinal;
    EnsambladorNotas ensamblador = new EnsambladorNotas();
    public int tempoL, tempoI;
    public double duracionL, duracionI;
    public int longitudX;
    public int longitudY;
    public String tempstr = new String();

    public void cicloGenerador()
    {
        tempstr = super.iterador;
        xInicial = super.xd;
        xFinal = super.yd;
        yInicial = super.zd;
        yFinal = super.wd;
        longitudX = (int)(xFinal - xInicial);//*10
        longitudY = (int)(yFinal - yInicial);//*10
        matrizLambdas = new double[longitudX][longitudY];//+1
        matrizLambdasEscaladas = new int[longitudX][longitudY];//+1
        matrizTempos = new int[longitudX][longitudY];
        matrizDuraciones = new double[longitudX][longitudY];
        iterados = new double[super.iteraciones];
        iterados[0] = 0.5;
        System.out.println(longitudX + " " + longitudY + " " + super.iteraciones);
        System.out.println("Cadena iterador " + tempstr);
        System.out.println("Valaores iniciales " + xInicial + " " + xFinal + " " + yInicial + " " + yFinal);
        int j = 0;
        for(double xx = xInicial; xx < xFinal; xx+=1, j++)//xx+=0.1
	{
            int k = 0;
            for(double yy = yFinal; yy > yInicial; yy-=1, k++)//yy-=0.1
            {
                for(int i = 0; i < (super.iteraciones - 1); i++)
		{
                    navegador = tempstr.charAt(i);
                    if(navegador == 'A') rn = xx*4/127;
                    if(navegador == 'B') rn = yy*4/127;
                    iterados[i+1] = rn*iterados[i]*(1-iterados[i]);
                    lambda += Math.log(Math.abs(rn * (1 - 2 * iterados[i+1])));                    
		}
                lambda = lambda/super.iteraciones;
                System.out.println("valor lambda " + lambda);
                matrizLambdas[j][k]=lambda;
                matrizDuraciones[j][k] = Math.abs(lambda*super.duracionX);
                matrizLambdasEscaladas[j][k]=(int)Math.abs(lambda*127);
                if (matrizLambdasEscaladas[j][k] >= 127) matrizLambdasEscaladas[j][k] = matrizLambdasEscaladas[j][k]%127;
                matrizTempos[j][k] = ((matrizLambdasEscaladas[j][k]*140/127) + 120);
            }
        }
        //imprimeLambdas();
    }
    public void imprimeLambdas()
    {
        System.out.println("Matriz lambdas...");
        for(int i = 0; i < longitudX; i++)
        {
            for(int l = 0; l < longitudY; l++)
            {
                    System.out.print(matrizLambdas[i][l]+" ");
            }
                System.out.println();
        }
        System.out.println("Notas generadas...");
        for(int i = 0; i < longitudX; i++)
        {
            for(int l = 0; l < longitudY; l++)
            {
                    System.out.print(matrizLambdasEscaladas[i][l]+" ");
            }
                System.out.println();
        }
    }
@Override
    public void ensamblaNotas()
    {
            ensamblador.recibeInstrumento(super.instrumento);
            ensamblador.recibePlantilla(super.plantilla);
            ensamblador.recibeNombreArchivo(super.nombreArchivo);
            if(super.escala == null)
            {
                if(super.dv==true && super.tv==true)
                {
                    ensamblador.ensamblaPatron(this.matrizLambdasEscaladas, this.matrizTempos, this.matrizDuraciones, this.longitudX, this.longitudY, super.acorde);
                }
                if(super.dv==true && super.tv == false)
                {
                    ensamblador.ensamblaPatron(this.matrizLambdasEscaladas, super.tempoX, matrizDuraciones, this.longitudX, this.longitudY, super.acorde);
                }
                if(super.dv==false && super.tv == true)
                {
                    ensamblador.ensamblaPatron(this.matrizLambdasEscaladas, matrizTempos, super.duracionX, this.longitudX, this.longitudY, super.acorde);
                }
                if(super.dv==false && super.tv==false)
                {
                    ensamblador.ensamblaPatron(this.matrizLambdasEscaladas, super.tempoX, super.duracionX, this.longitudX, this.longitudY, super.acorde);
                }
            }
            if(super.escala != null)
            {
                if(super.dv==true && super.tv==true)
                {
                    ensamblador.ensamblaPatron(super.escala, this.matrizLambdasEscaladas, this.matrizTempos, this.matrizDuraciones, this.longitudX, this.longitudY, super.acorde);
                }
                if(super.dv==true && super.tv == false)
                {
                    ensamblador.ensamblaPatron(super.escala, this.matrizLambdasEscaladas, super.tempoX, matrizDuraciones, this.longitudX, this.longitudY, super.acorde);
                }
                if(super.dv==false && super.tv == true)
                {
                    ensamblador.ensamblaPatron(super.escala, this.matrizLambdasEscaladas, matrizTempos, super.duracionX, this.longitudX, this.longitudY, super.acorde);
                }
                if(super.dv==false && super.tv==false)
                {
                    ensamblador.ensamblaPatron(super.escala, this.matrizLambdasEscaladas, super.tempoX, super.duracionX, this.longitudX, this.longitudY, super.acorde);
                }
            }
            ensamblador.interpretaPatron();
    }
}
