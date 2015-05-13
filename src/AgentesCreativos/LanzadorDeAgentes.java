/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentesCreativos;

import jade.core.Profile;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.*;
import jade.core.Runtime;
import InterfazUsuario.InterfazKaos;

/**
 * @author Omar Lopez Ortega Profesor Investigador CITIS - UAEH
 */
public class LanzadorDeAgentes extends Agent {

    public Runtime rt = Runtime.instance();
    public AgentController ac;
    public ContainerController cc;
    public Profile p;

    //Crea instancia de LanzadorDeAgentes
    public LanzadorDeAgentes(String host, String port) {
        p = new ProfileImpl();
        p.setParameter(Profile.MAIN_HOST, host);
        p.setParameter(Profile.MAIN_PORT, port);
        cc = rt.createMainContainer(p);
        System.out.println("Agente lanzador creado");
    }

    public AgentController iniciaAgente(String name, String nameClass) {
        if (cc != null) {
            try {
                ac = cc.createNewAgent(name, nameClass, null);
                ac.start();
                return ac;
            } catch (Exception e) {
            }
        } else {
            //System.out.println("-> Contenedor vacio");
            InterfazKaos.TextAreaAgentes.append("Contenedor vacio");
        }
        return null;
    }

    public AgentController iniciaAgente(String host, String port, String name, String nameClass) {
        ac = this.iniciaAgente(name, nameClass);
        System.out.println("Agente " + nameClass + " creado" + ac);
        return ac;
        /*if(cc!=null)
         {
         try
         {
         ac=cc.createNewAgent(name,nameClass,null);
         ac.start();
         return ac;
         }
         catch(Exception e)
         {
         e.printStackTrace();
         }
         }
         else
         {
         System.out.println("->Contenedor vacio");
         }
         return null;*/
    }
}
