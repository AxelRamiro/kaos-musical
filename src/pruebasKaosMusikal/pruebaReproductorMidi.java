/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebasKaosMusikal;
import PlantillasDeCanciones.Plantilla;
import Almacenamiento.EjecutorSentencias;

/**
 *
 * @author Omar Lopez Ortega
 * Profesor - Investigador CITIS - UAEH
 */
public class pruebaReproductorMidi
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Plantilla rep = new Plantilla();
        String[] ps;
        ps = EjecutorSentencias.entregaObrasPrimarias("LorenzP2");
        for(int i = 0; i < ps.length; i++)
        {
            System.out.println("Ejecutando: " + ps[i]);
            rep.abreArchivoMidi(ps[i]);
        }
    }
}
