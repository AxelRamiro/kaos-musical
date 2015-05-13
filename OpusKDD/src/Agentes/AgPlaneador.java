package Agentes;

import Interfaces.*;
import Comportamientos.*;
import jade.gui.*;
import jade.wrapper.*;
import java.util.logging.*;
import ObjeAux.OpusPrimaria;

public class AgPlaneador extends GuiAgent implements ObjeAux.Actions {

    ContainerController cc;
    AgentController ac;
    int numEvento;
    public static String emocion1;
    public guiARecomendar interfaz = new guiARecomendar(this);
    public guiAFusionar fusion;
    public guiAEvaluarIndice indice;
    public guiRecomendarKM last;

    @Override
    public void setup() {
        System.out.println("El Agente Planeador esta listo");
        cc = this.getContainerController();
        emocion1 = this.getArguments()[0].toString();
        interfaz.jcboE.setSelectedItem(emocion1);
    }

    @Override
    protected void onGuiEvent(GuiEvent ge) {
        numEvento = ge.getType();
        if (numEvento == START) {
            emocion1 = interfaz.em;
            System.out.println("Crearé Agente Minero para procesar con WEKA");
            try {
                ac = cc.createNewAgent("Extrae", "Agentes.AgKDD", null);
                ac.start();
                addBehaviour(new CEmisorPlaneador(this, emocion1));
                addBehaviour(new Receiver(this));
            } catch (StaleProxyException ex) {
                Logger.getLogger(AgPlaneador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (numEvento == FUSION) {
            fusion = new guiAFusionar(this);
            System.out.println("Crearé Agente Fusion para agrupar cumulos");
            try {
                ac = cc.createNewAgent("Fusiona", "Agentes.AgFusion", null);
                ac.start();
                addBehaviour(new CEmisorPlaneador1(this));
                addBehaviour(new CEmisorPlaneador1XM(this));
                addBehaviour(new CEmisorPlaneador1EM(this));
            } catch (StaleProxyException ex) {
                Logger.getLogger(AgPlaneador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (numEvento == EVALUATE) {
            System.out.println("Inicio de GUI evaluación de índice");
            indice = new guiAEvaluarIndice(this);
        }
        if (numEvento == SUGGEST) {
            System.out.println("Inicio de GUI RKM");
            last = new guiRecomendarKM(this);
        }
        
        if (numEvento == OPUS) {
            OpusPrimaria[] opus = (OpusPrimaria[]) ge.getParameter(0);
            addBehaviour(new Sender(this, opus));
            System.out.println(opus);
        }
    }

}
