/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasKaosMusikal;
import Lorenz.*;
/*
 * @author OMAR LÓPEZ ORTEGA
 */
public class pruebaLorenzEuler
{    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        double  x= 55, y = 45, z = 35;
        int numeroIteraciones = 9, laOpcion = 26;//Melodía - Armonía - NotasLigadas - Ties - Acordes
        double duracion1= 0.20, duracion2= 0.5, duracion3=0.15;
        double tempo1= 190, tempo2= 190, tempo3 = 190;//
        String elInstrumento = new String("Bright_Acoustic");
        String laPlantilla = new String("INCREMENTAL");//INCREMENTAL, CANON o SECUENCIAL siempre con mayúsculas
        GeneradorMusical generador = new GLorenz();        
        generador.estableceIteraciones(numeroIteraciones);
        generador.estableceInstrumento(elInstrumento);
        generador.establecePlantilla(laPlantilla);
        generador.estableceOpcion(laOpcion);
        //generador.generaPatron(x,y,z, 'n');//n para las notas
        //generador.generaPatron(duracion1, duracion2, duracion3, 'd');//d para la duración de las notas
        //generador.generaPatron(tempo1, tempo2, tempo3, 't');//t para el tempo
    }
}