package Comportamientos;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

public class CEmisorPlaneador extends SimpleBehaviour {

    boolean fin = false;
    public static String emocion2;

    public CEmisorPlaneador(Agent a, String emo2) {
        super(a);
        emocion2 = emo2;
    }

    @Override
    public void action() {
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar un mensaje a AGENTE KDD");
        AID id = new AID();
        id.setLocalName("Extrae");
        // Creación del objeto ACLMessage
        ACLMessage mensaje = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje.setSender(myAgent.getAID());
        mensaje.setLanguage("Español");
        mensaje.addReceiver(id);
        mensaje.setContent(emocion2);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje);

        System.out.println(myAgent.getLocalName() + ": Enviando Emoción  a EXTRAE- AGENTE KDD");
        System.out.println(mensaje.toString());
        //fin = true;// quitamos este fin por q a¡hora esperará la respuesta 
        //Espera la respuesta
        ACLMessage mensaje2 = myAgent.blockingReceive();
        if (mensaje2 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje2.toString());
            fin = true;
        }
    }

    @Override
    public boolean done() {
        return fin;
    }

}
