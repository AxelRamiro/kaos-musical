package AgentesCreativos;

import jade.core.behaviours.*;
import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.*;
import InterfazUsuario.InterfazKaos;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

/**
 * @author Omar Lopez Ortega Profesor Investigador CITIS - UAEH
 */
public class CPlaneadorSimple extends SimpleBehaviour {

    ACLMessage msg;
    MessageTemplate plantillaRecepcion;
    public String generador;
    public String cambio;
    AID agentID;
    ContainerController cc;
    AgentController ac;

    public CPlaneadorSimple(Agent a, String g, String c) {
        super(a);
        generador = g;
        cambio = c;
        InterfazKaos.TextAreaAgentes.append("\n" + myAgent.getLocalName() + " listo para iniciar proyecto creativo!!!");
    }

    @Override
    public void onStart() {
        agentID = new AID("AgenteExplorador", AID.ISLOCALNAME);
        //AgentePlaneador (this) envía datos hacia AgenteExplorador
        msg = new ACLMessage(ACLMessage.INFORM);
        msg.setContent(generador);
        msg.addReceiver(agentID);
        myAgent.send(msg);
    }

    @Override
    public void action() {

        //AgentePlaneador (this) recibe confirmación de AgenteExplorador
        plantillaRecepcion = MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.CONFIRM), MessageTemplate.MatchSender(agentID));
        plantillaRecepcion = MessageTemplate.and(plantillaRecepcion, MessageTemplate.MatchContent("RECEPCION DE DATOS CORRECTA"));
        msg = myAgent.blockingReceive(plantillaRecepcion);
        if (msg != null) {
            InterfazKaos.TextAreaAgentes.append("\n" + myAgent.getLocalName() + " recibe " + msg.getContent() + " de " + msg.getSender().getLocalName());
            msg = new ACLMessage(ACLMessage.INFORM);
            msg.setContent(cambio);
            msg.addReceiver(agentID);
            myAgent.send(msg);
        }
    }

    @Override
    public boolean done() {
        //AgentePlaneador (this) recibe infome de terminación de exploración proveniente de AgenteExplorador
        plantillaRecepcion = MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.INFORM), MessageTemplate.MatchSender(agentID));
        plantillaRecepcion = MessageTemplate.and(plantillaRecepcion, MessageTemplate.MatchContent("TERMINADO"));
        msg = myAgent.blockingReceive(plantillaRecepcion);
        if (msg != null) {
            InterfazKaos.TextAreaAgentes.append("\nPlaneacion terminada!!!");
            return true;
        } else {
            return false;
        }
    }
}
