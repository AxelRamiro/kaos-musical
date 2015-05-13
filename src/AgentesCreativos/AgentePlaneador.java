package AgentesCreativos;

import jade.gui.*;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import InterfazUsuario.InterfazKaos;
import InterfazUsuario.guiEmocion;
import ObjeAux.OpusPrimaria;

/**
 * @author Omar Lopez Ortega Profesor Investigador CITIS - UAEH
 */
public class AgentePlaneador extends GuiAgent {

    ContainerController cc;
    AgentController ac;
    public String elCambio, generador;
    public CPlaneadorSimple cps;
    public InterfazKaos interfaz;
    public guiEmocion emo;
    int numeroEvento, opusIndex = 0;
    OpusPrimaria[] opusList;

    @Override
    public void setup() {
        interfaz = new InterfazKaos(this);
        interfaz.setVisible(true);
        cc = this.getContainerController();
        addBehaviour(new Receiver(this));
    }

    @Override
    public void onGuiEvent(GuiEvent e) {
        numeroEvento = e.getType();
        if (numeroEvento == 1) {
            generador = InterfazKaos.nombreGenerador;
            elCambio = InterfazKaos.variableDeCambio;
            cps = new CPlaneadorSimple(this, generador, elCambio);
            addBehaviour(cps);
            try {
                ac = cc.createNewAgent("AgenteExplorador", "AgentesCreativos.AgenteExplorador", null);
                ac.start();
            } catch (Exception e1) {
                InterfazKaos.TextAreaAgentes.append("No se pudo iniciar el Agente Explorador");

            }
            try {
                ac = cc.createNewAgent("AgenteSelector", "AgentesCreativos.AgenteSelector", null);
                ac.start();
            } catch (Exception e1) {
                InterfazKaos.TextAreaAgentes.append("No se pudo inicial el Agente Selector");
            }
        } else if (numeroEvento == 2) {
            try {
                ac = cc.createNewAgent("AgenteSelector", "AgentesCreativos.AgenteSelector", null);
                ac.start();
            } catch (Exception e2) {
                InterfazKaos.TextAreaAgentes.append("No se pudo iniciar el Agente Selector");
            }
        } else if (numeroEvento == 10) {
            opusList = (OpusPrimaria[]) e.getParameter(0);
            interfaz.showOpus(opusList[opusIndex]);
            interfaz.showStatus("Recomendación " + opusList[opusIndex].getMetodo() + " " + opusList[opusIndex].getIndice());
        } else if (numeroEvento == 11) {
            if(opusIndex > 0) {opusIndex--;}
            interfaz.showOpus(opusList[opusIndex]);
            interfaz.showStatus("Recomendación " + opusList[opusIndex].getMetodo() + " " + opusList[opusIndex].getIndice());
        } else if (numeroEvento == 12) {
            if(opusIndex < opusList.length) {opusIndex++;}
            interfaz.showOpus(opusList[opusIndex]);
            interfaz.showStatus("Recomendación " + opusList[opusIndex].getMetodo() + " " + opusList[opusIndex].getIndice());
        }
    }
}
