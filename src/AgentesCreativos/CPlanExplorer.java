/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AgentesCreativos;
import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.*;
import jade.gui.*;

/**
 *
 * @author Omar
 */
public class CPlanExplorer extends SequentialBehaviour
{
    public AgentePlaneador agente = new AgentePlaneador();
    CExploradorSimple ces;
    CPlaneadorSimple cps;
    public CPlanExplorer(AgentePlaneador a)
    {
        super(a);
        agente = a;
        cps = new CPlaneadorSimple(agente, agente.generador, agente.elCambio);
        ces = new CExploradorSimple(myAgent);
    }
    @Override
    public void onStart()
    {
        addSubBehaviour(ces);
        addSubBehaviour(cps);
    }
}
