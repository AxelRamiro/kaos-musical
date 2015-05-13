/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AgentesCreativos;
import jade.core.behaviours.*;
import jade.core.Agent;
import Almacenamiento.EjecutorSentencias;
import InterfazUsuario.guiSelector;
/**
 *
 * @author Omar
 */
public class CSelectorSimple extends SimpleBehaviour
{
    public String[] ps;
    public CSelectorSimple(Agent a)
    {
        super(a);
    }
    public void action()
    {
        guiSelector.comboProyectos.removeAllItems();
        ps = EjecutorSentencias.entregaNombresProyectos();
        for(int i = 0; i < ps.length; i++)
        {
            guiSelector.comboProyectos.addItem(ps[i]);
        }
    }
    public boolean done()
    {
        return true;
    }
}
