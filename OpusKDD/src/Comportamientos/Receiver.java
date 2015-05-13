package Comportamientos;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

/**
 *
 * @author Axel Ramiro
 */
public class Receiver extends CyclicBehaviour implements ObjeAux.Actions {

    public Receiver(Agent a) {
        super(a);
    }

    @Override
    public void action() {
        ACLMessage msg = myAgent.receive(MessageTemplate.MatchPerformative(ACLMessage.UNKNOWN));
        if (msg != null) {
            switch (msg.getSender().getLocalName()) {
                case "Extrae":
                    GuiEvent e = new GuiEvent(this, FUSION);
                    ((GuiAgent) myAgent).postGuiEvent(e);
                    break;
                case "Fusiona":
                    GuiEvent f = new GuiEvent(this, EVALUATE);
                    ((GuiAgent) myAgent).postGuiEvent(f);
                    break;
            }
        }
    }
}
