/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Agentes.AgPlaneador;
import Interfaces.guiARecomendar;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import Clustering.*;
import ObjeAux.*;
import jade.core.AID;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author macbookair
 */
public class CExtraerXM extends SimpleBehaviour{
    
     ContainerController cc;
    AgentController ac;
    public static String emocion3;
    
    private boolean fin = false;
    
     public CExtraerXM(Agent a)
  {
      super(a); 
  }
      CExtraerXM(CEmisorPlaneador1 aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void action() {  
        
       
        fin = true;
            
        }

     @Override
    public boolean done() {
        
        return fin;
    }
}
