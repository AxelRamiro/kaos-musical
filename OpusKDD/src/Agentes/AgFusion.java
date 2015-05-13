package Agentes;

import Comportamientos.*;
import jade.core.Agent;

public class AgFusion extends Agent {

    @Override
    public void setup() {
        System.out.println("El Agente Fusion esta listo");
        addBehaviour(new CFusionar(this));
        addBehaviour(new CFusionarXM(this));
        addBehaviour(new CFusionarEM(this));
    }
}