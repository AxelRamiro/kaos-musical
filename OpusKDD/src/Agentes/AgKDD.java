package Agentes;

import Comportamientos.*;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class AgKDD extends GuiAgent {

    ContainerController cc1;
    AgentController ac1;
    int numEvento;

    @Override
    protected void setup() {
        addBehaviour(new CExtraer(this));
        // addBehaviour(new CExtraerXM(this));
    }

    @Override
    protected void onGuiEvent(GuiEvent ge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
