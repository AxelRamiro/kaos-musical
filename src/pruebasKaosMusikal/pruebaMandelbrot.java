/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebasKaosMusikal;
import Mandelbrot.*;
import Lorenz.*;

/**
 *
 * @author OMAR LÓPEZ ORTEGA
 */
public class pruebaMandelbrot
{    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //GeneradorMusical mandelbrot = new GMandelbrot();
        GeneradorMusical mandelbrot1 = new GMandelbrot();
        //ComplejoInicial(-.1155989, 0.7639405);//Sí pertenece        
        //ComplejoInicial(-1.04039, 0.2509294);//No pertenece
        //ComplejoInicial(.04039, -0.509294);//Sí pertenece
        //mandelbrot.estableceIteraciones(50);//Numero de Iteraciones
        //mandelbrot.estableceInstrumento("Bright_Acoustic");//Bright_Acoustic
        //mandelbrot.generaPatron(-.1155989, 0.7639405, 200, 0.25);//Real, Imaginario, Tempo, Duracion        
        //mandelbrot.ensamblaNotas();        
        mandelbrot1.estableceIteraciones(30);//Numero de Iteraciones
        mandelbrot1.estableceInstrumento("Bright_Acoustic");//Bright_Acoustic
        mandelbrot1.establecePlantilla("SECUENCIAL");//
        mandelbrot1.generaPatron(200, 0.2, 0.25);//Real, Imaginario, Tempo, Duracion
        mandelbrot1.ensamblaNotas();        
    }
}
