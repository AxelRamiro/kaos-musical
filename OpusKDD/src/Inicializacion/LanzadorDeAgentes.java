/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicializacion;

import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

/**
 *
 *@author Eder López Olguín
 */
public class LanzadorDeAgentes extends Agent{
    
    Runtime rt = Runtime.instance();
    AgentController ac;
    ContainerController cc;
    Profile p;
    
    public LanzadorDeAgentes(String host, String port)
    {
        
        p = new ProfileImpl ();
        p.setParameter(Profile.MAIN_HOST, host);
        p.setParameter(Profile.MAIN_PORT, port);
        
        cc = rt.createMainContainer(p);
        
    }
    
    public AgentController iniciaAgente(String name, String nameClass)
    {
       if (cc!= null)
       {
           try
           {
            //   ac=cc.createNewAgent(name, nameClass,null);
               ac=cc.createNewAgent(name, nameClass,null);
               ac.start();
               return ac;
               
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }
       }
       else
       {
           System.out.println("--> Contenedor Vacio");
       }
       return null;
    }

    public AgentController iniciaAgente(String host, String port, String name, String nameClass) {
       
        ac = this.iniciaAgente(name, nameClass);
        return ac;
    }
    
}
