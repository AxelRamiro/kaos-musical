/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentesCreativos;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.*;
import InterfazUsuario.InterfazKaos;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

/**
 * @author Omar López Ortega
 * Profesor - Investigador CITIS - UAEH
 */
public class CExploradorOneShot extends OneShotBehaviour
{
    ACLMessage msg;
    MessageTemplate plantillaRecepcion;
    AID idP;
    String keGenerador, keCambio, instrumento, escala, acorde;
    ContainerController cc;
    AgentController ac;
    public CExploradorOneShot(Agent a)
    {
        super(a);
    }
    /**
     *
     */
    @Override
    public void onStart()
    {
        InterfazKaos.TextAreaAgentes.append("\n" + myAgent.getLocalName() + " listo para iniciar Exploracion OneShot!!!");
        idP = new AID("AgentePlaneador", AID.ISLOCALNAME);
        plantillaRecepcion = MessageTemplate.and(MessageTemplate.MatchPerformative(ACLMessage.INFORM), MessageTemplate.MatchSender(idP));
        msg = myAgent.blockingReceive(plantillaRecepcion);
        keGenerador = msg.getContent();
        InterfazKaos.TextAreaAgentes.append("\n" + myAgent.getLocalName() + " recibe "+ msg.getContent() + " de " + msg.getSender().getLocalName());
        //AgenteExplorador (this) confirma recepción de datos a AgentePlaneador
        ACLMessage reply = msg.createReply();
        reply.setPerformative(ACLMessage.CONFIRM);
        reply.setContent("RECEPCION DE DATOS CORRECTA");
        myAgent.send(reply);
    }
    @Override
    public void action()
    {
        escala = InterfazKaos.escalaMusical;
        acorde = InterfazKaos.elAcorde;
        instrumento = InterfazKaos.elInstrumento;
        ComputadorExploracion.defineExploracion(keGenerador);   
        ComputadorExploracion.computaExploracion(keGenerador, instrumento, escala, acorde);
        InterfazKaos.TextAreaAgentes.append("\nExploracion OneShot terminada!!!");
        //AgenteExplorador (this) informa exploraciones terminadas a AgentePleaneador
        msg = new ACLMessage(ACLMessage.INFORM);
        msg.setContent("TERMINADO");
        msg.addReceiver(idP);
        myAgent.send(msg);
        myAgent.doDelete();
    }
}
