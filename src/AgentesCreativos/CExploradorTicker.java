/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentesCreativos;
import jade.core.Agent;
import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.*;
/**
 * @author Omar Lopez Ortega
 * Profesor Investigador CITIS - UAEH
 */
public class CExploradorTicker extends TickerBehaviour
{
    public ACLMessage msg;
    public Agent agente = new Agent();
    AID idP;
    String keGenerador;
    MessageTemplate plantillaRecepcion;
    public CExploradorTicker(Agent a)
    {
        super(a,10000);
        agente = a;
    }
    @Override
    public void onStart()
    {
        //AgenteExplorador (this) recibe datos provenientes de AgentePlaneador
        idP = new AID("AgentePlaneador", AID.ISLOCALNAME);
        plantillaRecepcion = MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.INFORM), MessageTemplate.MatchSender(idP));
        msg = agente.blockingReceive(plantillaRecepcion);
        System.out.println(myAgent.getLocalName() +" listo");
    }
    public void onTick()
    {        
        if (msg!=null)
        {
            keGenerador = msg.getContent();
            System.out.println(myAgent.getLocalName() + " recibe: "+ msg.getContent() + " from " + msg.getSender().getLocalName());
            System.out.println(myAgent.getLocalName() + " ejecuta iteracion creativa empleando " + keGenerador);
            //AgenteExplorador confirma recepción de datos a AgentePlaneador
            ACLMessage reply = msg.createReply();
            reply.setPerformative(ACLMessage.CONFIRM);
            reply.setContent("Confirmo recepcion de " + keGenerador);
            agente.send(reply);
            ComputadorExploracion.defineExploracion(keGenerador);
        }
    }
}
