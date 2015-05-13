package Comportamientos;
import ObjeAux.OpusPrimaria;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Axel Ramiro
 */

public class Sender extends OneShotBehaviour {
    
    OpusPrimaria[] opus;
    
    public Sender(Agent a, OpusPrimaria[] opus){
        super(a);
        this.opus = opus;
    }
    
    @Override
    public void action() {
        try {
            ACLMessage msg = new ACLMessage(ACLMessage.UNKNOWN);
            msg.addReceiver(new AID("AgentePlaneador", AID.ISLOCALNAME));
            msg.setContentObject(opus);
            myAgent.send(msg);
            System.out.println("Opus enviada");
        } catch (IOException ex) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
