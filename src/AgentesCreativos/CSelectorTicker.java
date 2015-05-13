/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AgentesCreativos;
import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.*;
import Almacenamiento.EjecutorSentencias;
import InterfazUsuario.guiSelector;
/**
 *
 * @author Omar
 */
public class CSelectorTicker extends TickerBehaviour
{
    public String[] ps;
    public CSelectorTicker(Agent a)
    {
        super(a,5000);
    }
    public void onTick()
    {
        guiSelector.comboProyectos.removeAllItems();
        ps = EjecutorSentencias.entregaNombresProyectos();
        for(int i = 0; i < ps.length; i++)
        {
            guiSelector.comboProyectos.addItem(ps[i]);
        }
    }
}
