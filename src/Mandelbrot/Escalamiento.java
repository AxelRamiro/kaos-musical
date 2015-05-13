/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Mandelbrot;

/**
 *
 * @author OMAR LOPEZ ORTEGA
 */
public class Escalamiento
{
    public static double[] losBaits;
    public static int[] escalados;
    public static int t;
    public static int[] regresaArregloBytes(double[] arregloDobles)
    {
        t = arregloDobles.length;
        losBaits= new double[t];
        escalados = new int[t];
        for(int k = 0; k < t; k++)
        {
            losBaits[k] = arregloDobles[k]*127;
            escalados[k] = (int)(Math.abs(Math.ceil(losBaits[k])));
            //if(escalados[k] == 0 && k > 0) escalados[k] = escalados[k-1];
            if(escalados[k] > 127) escalados[k] = escalados[k]%127;
            //System.out.println("Notas en escala MIDI: " + escalados[k]);
        }
        return escalados;        
    }
    public static int[] regresaArregloBytes3P(double[] arregloDobles)
    {
        t = arregloDobles.length;
        losBaits= new double[t];
        escalados = new int[t];
        for(int k = 0; k < t; k++)
        {
            losBaits[k] = arregloDobles[k];
            escalados[k] = (int)(Math.abs(Math.ceil(losBaits[k])));
            if(escalados[k] > 127) escalados[k] = escalados[k]%127;
            //System.out.println("Notas en escala MIDI: " + escalados[k]);
        }
        return escalados;
    }
}
