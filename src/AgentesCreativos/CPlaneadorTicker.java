/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentesCreativos;
import jade.core.behaviours.*;
import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.*;
/**
 * @author Omar Lopez Ortega
 * Profesor Investigador CITIS - UAEH
 */
public class CPlaneadorTicker extends TickerBehaviour
{
    Agent agente = new Agent();
    AID agentID;
    ACLMessage msg;
    public String generador;
    public CPlaneadorTicker(Agent a, String s)
    {
        super(a,10000);
        agente = a;
        generador = s;
    }
    @Override
    public void onStart()
    {
        agentID = new AID("AgenteExplorador", AID.ISLOCALNAME);
        System.out.println(myAgent.getLocalName() +" listo");
    }
    public void onTick()
    {
        //AgentePlaneador (this) envía datos hacia AgenteExplorador
        msg = new ACLMessage(ACLMessage.INFORM);
        msg.setContent(generador);
        msg.addReceiver(agentID);
        agente.send(msg);
        //AgentePlaneador (this) recibe, en primer lugar, confirmación de recepción y después terminación de exploración de AgenteExplorador
        msg= agente.blockingReceive();
        if (msg!=null)
        {
            System.out.println("Respuesta recibida" + " <- "+ msg.getContent()+" from "+msg.getSender().getLocalName());
        }
        else
        {
            System.out.println("No recibo respuesta");
        }
    }
}
