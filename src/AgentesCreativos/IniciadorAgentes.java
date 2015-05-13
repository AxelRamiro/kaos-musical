

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentesCreativos;
import jade.wrapper.AgentController;
/**
 * @author Omar Lopez Ortega
 * Profesor Investigador CITIS - UAEH
 */
public class IniciadorAgentes
{
    public static void main(String[] args)
    {
        LanzadorDeAgentes ag = new LanzadorDeAgentes(null,null);
        AgentController ag1= ag.iniciaAgente("AgentePlaneador", "AgentesCreativos.AgentePlaneador");
        //AgentController ag2= ag.iniciaAgente("AgenteExplorador", "AgentesCreativos.AgenteExplorador");
        //AgentController ag3= ag.iniciaAgente("emisor","losAgentes.EmisorCiclico1");
        //AgentController ag4= ag.iniciaAgente("emisor1","losAgentes.EmisorTicker1");
        //AgentController ag5= ag.iniciaAgente("receptor1", "losAgentes.ReceptorCiclico1");
        //AgentController ag6= ag.iniciaAgente("receptor2", "losAgentes.ReceptorCiclico1");
        //AgentController ag7= ag.iniciaAgente("receptor1", "losAgentes.ReceptorTicker1");
        //AgentController ag8= ag.iniciaAgente("receptor2", "losAgentes.ReceptorTicker1");
    }
}
