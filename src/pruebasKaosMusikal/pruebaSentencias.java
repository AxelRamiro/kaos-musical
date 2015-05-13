/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebasKaosMusikal;
import Almacenamiento.EjecutorSentencias;

/**
 *
 * @author Omar
 */
public class pruebaSentencias
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String[] ps;
        int i = 0, j=0;
        //int id = EjecutorSentencias.buscarProyecto("pruebaBD");
        //System.out.println(id);
        //EjecutorSentencias.insertarLorenz("lor1", 4, 2, 5, 2.1,3.5, 2.1,"nombreArchivo");
        //EjecutorSentencias.insertarMandelbrot("mandel1", 10,"nombreArchivo");
        //EjecutorSentencias.insertarClifford("Clifford1", 2, 3, 4, 4, 5, 6, 7, 8,"nombreArchivo");
        //EjecutorSentencias.insertar3P("3P1", 2, 3,"nombreArchivo");
        //EjecutorSentencias.insertarLyapunov("lyap1", 2, 3, 4, 5, "aaabbb","nombreArchivo");
        //EjecutorSentencias.insertarML("ml1", 2, 3, 4, 5, 6,"nombreArchivo");
        ps = EjecutorSentencias.entregaNombresProyectos();
        //for(i=0; i<ps.length;i++)
        //{
        //    System.out.println(ps[i]);
        //}
        ps = EjecutorSentencias.entregaObrasPrimarias("3PP2");
    }
}
