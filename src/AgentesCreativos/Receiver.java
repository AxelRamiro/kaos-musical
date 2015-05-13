package AgentesCreativos;
import ObjeAux.OpusPrimaria;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.lang.acl.UnreadableException;

/**
 *
 * @author Axel Ramiro
 */

public class Receiver extends CyclicBehaviour {
    public Receiver(Agent a){
        super(a);
    }
    
    @Override
    public void action() {
        ACLMessage msg = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.UNKNOWN));
        if(msg != null) {
            try {
                OpusPrimaria[] opus = (OpusPrimaria[]) msg.getContentObject();
                GuiEvent evt = new GuiEvent(this, 10);
                evt.addParameter(opus);
                ((GuiAgent) myAgent).postGuiEvent(evt);
            } catch (UnreadableException ex) {
                System.out.println("Error en la recepción de opus");;
            }
        }
    }
}
