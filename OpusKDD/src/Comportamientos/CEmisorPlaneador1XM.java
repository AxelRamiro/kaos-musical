/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Agentes.AgKDD;
import Comportamientos.CExtraer;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Agent;
import java.util.ArrayList;
/**
 *
 * @author macbookair
 */
public class CEmisorPlaneador1XM extends SimpleBehaviour

{
    
    boolean fin = false; 
    ContainerController cc;
    AgentController ac;
    
    public CEmisorPlaneador1XM (Agent a)
    {
        super (a);
    }
    
    public void action()
    {
        ///////////// TEMPO X ////////////////////////////////
        ArrayList <String> tempoXNC = new ArrayList<String>(); //NUMERO DE CLUSTER X
        ArrayList <String> tempoXNI = new ArrayList<String>(); // INSTANCIAS TODAS TEMPO X
        ArrayList <String> tempoXInstancias = new ArrayList<String>(); // INSTANCIAS TEMPOX
        ArrayList <String> tempoXCentroide = new ArrayList<String>(); // CENTROIDE TEMPOX
        ArrayList <String> tempoXLanmark = new ArrayList<String>(); // ASIGNACIONES LANMARK
        
        ///////////// TEMPO Y ////////////////////////////////
        ArrayList <String> tempoYNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList <String> tempoYNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList <String> tempoYInstancias = new ArrayList <String> (); // INSTANCIAS TEMPO Y
        ArrayList <String> tempoYCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Y
        ArrayList <String> tempoYLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK 
        
        ///////////// TEMPO Z ////////////////////////////////
        ArrayList <String> tempoZNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList <String> tempoZNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList <String> tempoZInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Z
        ArrayList <String> tempoZCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Z
        ArrayList <String> tempoZLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK

        //////// TEMPO EN X ////////
        tempoXNC = CExtraer.arrayTempoXNCX;
        tempoXNI = CExtraer.arrayTempoXNIX;
        tempoXInstancias = CExtraer.arrayTempoXIpruebaX;
        tempoXCentroide = CExtraer.arrayTempoXCpruebaX;
        tempoXLanmark = CExtraer.arrayTempoXTpruebaX;
        ////// TEMPO EN Y //////////
        tempoYNC = CExtraer.arrayTempoYNCX;
        tempoYNI = CExtraer.arrayTempoYNIX;
        tempoYInstancias = CExtraer.arrayTempoYIpruebaX;
        tempoYCentroide = CExtraer.arrayTempoYCpruebaX;
        tempoYLanmark = CExtraer.arrayTempoYTpruebaX;
        
        ////// TEMPO EN Z /////////
        tempoZNC = CExtraer.arrayTempoZNCX;
        tempoZNI = CExtraer.arrayTempoZNIX;
        tempoZInstancias = CExtraer.arrayTempoZIpruebaX;
        tempoZCentroide = CExtraer.arrayTempoZCpruebaX;
        tempoZLanmark = CExtraer.arrayTempoZTpruebaX;
        
        
                ///////////// duracion X ////////////////////////////////
        ArrayList <String> duracionXNC = new ArrayList<String>(); //NUMERO DE CLUSTER X
        ArrayList <String> duracionXNI = new ArrayList<String>(); // INSTANCIAS TODAS TEMPO X
        ArrayList <String> duracionXInstancias = new ArrayList<String>(); // INSTANCIAS TEMPOX
        ArrayList <String> duracionXCentroide = new ArrayList<String>(); // CENTROIDE TEMPOX
        ArrayList <String> duracionXLanmark = new ArrayList<String>(); // ASIGNACIONES LANMARK
        
        ///////////// duracion Y ////////////////////////////////
        ArrayList <String> duracionYNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList <String> duracionYNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList <String> duracionYInstancias = new ArrayList <String> (); // INSTANCIAS TEMPO Y
        ArrayList <String> duracionYCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Y
        ArrayList <String> duracionYLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK 
        
        ///////////// duracion Z ////////////////////////////////
        ArrayList <String> duracionZNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList <String> duracionZNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList <String> duracionZInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Z
        ArrayList <String> duracionZCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Z
        ArrayList <String> duracionZLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK
        
          //////// duracion EN X ////////
        duracionXNC = CExtraer.arrayDuracionXNCX;
        duracionXNI = CExtraer.arrayDuracionXNIX;
        duracionXInstancias = CExtraer.arrayDuracionXIpruebaX;
        duracionXCentroide = CExtraer.arrayDuracionXCpruebaX;
        duracionXLanmark = CExtraer.arrayDuracionXTpruebaX;
        ////// duracion EN Y //////////
        duracionYNC = CExtraer.arrayDuracionYNCX;
        duracionYNI = CExtraer.arrayDuracionYNIX;
        duracionYInstancias = CExtraer.arrayDuracionYIpruebaX;
        duracionYCentroide = CExtraer.arrayDuracionYCpruebaX;
        duracionYLanmark = CExtraer.arrayDuracionYTpruebaX;
        
        ////// duracion EN Z /////////
        duracionZNC = CExtraer.arrayDuracionZNCX;
        duracionZNI = CExtraer.arrayDuracionZNIX;
        duracionZInstancias = CExtraer.arrayDuracionZIpruebaX;
        duracionZCentroide = CExtraer.arrayDuracionZCpruebaX;
        duracionZLanmark = CExtraer.arrayDuracionZTpruebaX;
  
                ///////////// octava X ////////////////////////////////
        ArrayList <String> octavaXNC = new ArrayList<String>(); //NUMERO DE CLUSTER X
        ArrayList <String> octavaXNI = new ArrayList<String>(); // INSTANCIAS TODAS TEMPO X
        ArrayList <String> octavaXInstancias = new ArrayList<String>(); // INSTANCIAS TEMPOX
        ArrayList <String> octavaXCentroide = new ArrayList<String>(); // CENTROIDE TEMPOX
        ArrayList <String> octavaXLanmark = new ArrayList<String>(); // ASIGNACIONES LANMARK
        
        ///////////// octava Y ////////////////////////////////
        ArrayList <String> octavaYNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList <String> octavaYNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList <String> octavaYInstancias = new ArrayList <String> (); // INSTANCIAS TEMPO Y
        ArrayList <String> octavaYCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Y
        ArrayList <String> octavaYLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK 
        
        ///////////// octava Z ////////////////////////////////
        ArrayList <String> octavaZNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList <String> octavaZNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList <String> octavaZInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Z
        ArrayList <String> octavaZCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Z
        ArrayList <String> octavaZLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK
        
          //////// octava EN X ////////
        octavaXNC = CExtraer.arrayOctavaXNCX;
        octavaXNI = CExtraer.arrayOctavaXNIX;
        octavaXInstancias = CExtraer.arrayOctavaXIpruebaX;
        octavaXCentroide = CExtraer.arrayOctavaXCpruebaX;
        octavaXLanmark = CExtraer.arrayOctavaXTpruebaX;
        ////// octava EN Y //////////
        octavaYNC = CExtraer.arrayOctavaYNCX;
        octavaYNI = CExtraer.arrayOctavaYNIX;
        octavaYInstancias = CExtraer.arrayOctavaYIpruebaX;
        octavaYCentroide = CExtraer.arrayOctavaYCpruebaX;
        octavaYLanmark = CExtraer.arrayOctavaYTpruebaX;
        
        ////// octava EN Z /////////
        octavaZNC = CExtraer.arrayOctavaZNCX;
        octavaZNI = CExtraer.arrayOctavaZNIX;
        octavaZInstancias = CExtraer.arrayOctavaZIpruebaX;
        octavaZCentroide = CExtraer.arrayOctavaZCpruebaX;
        octavaZLanmark = CExtraer.arrayOctavaZTpruebaX;
        
  
        ///////// MENSAJE UNO //////////
        String listaint = "";
        for (String s : tempoXInstancias)
        {
            listaint += s + ",";
        }
                
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar instancias Tempo X a AGENTE FUSION");
            AID id45 = new AID();
            id45.setLocalName("Fusiona");
 
        // Creación del objeto ACLMessage
            ACLMessage mensaje91 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje91.setSender(myAgent.getAID());
            mensaje91.setLanguage("Español");
            mensaje91.addReceiver(id45);
            mensaje91.setContent(listaint);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje91);
 
            System.out.println(myAgent.getLocalName() +": Enviando arreglo de instancias Tempo X  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje91.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje92 = myAgent.blockingReceive();
            if (mensaje92!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje92.toString());
                fin = true;
            }     
         ////////////    MENSAJE DOS   //////
            String listacen = "";
            for (String s : tempoXCentroide)
                {
                  listacen += s + ",";
                }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglo de centroides Tempo X a AGENTE FUSION");
            AID id46 = new AID();
            id46.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje93 = new ACLMessage(ACLMessage.REQUEST);
            //Rellenar los campos necesarios del mensaje
            mensaje93.setSender(myAgent.getAID());
            mensaje93.setLanguage("Español");
            mensaje93.addReceiver(id46);
            mensaje93.setContent(listacen); ///// String lista centroide ////
            //Envia el mensaje a los destinatarios
            myAgent.send(mensaje93);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje93.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje94 = myAgent.blockingReceive();
            if (mensaje94!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje94.toString());
                fin = true;
            } 
           ///////    MENSAJE TRES   //////
           ////// Convierte en string el arreglo /////  
           String listaref = "";
           for (String s : tempoXLanmark)
           {
            listaref += s + ",";   
           } 
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
            AID id47 = new AID();
            id47.setLocalName("Fusiona"); 
            // Creación del objeto ACLMessage
            ACLMessage mensaje95 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje95.setSender(myAgent.getAID());
            mensaje95.setLanguage("Español");
            mensaje95.addReceiver(id47);
            mensaje95.setContent(listaref);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje95);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje95.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje96 = myAgent.blockingReceive();
            if (mensaje96!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje96.toString());
                fin = true;
            } 
             ///////    MENSAJE CUATRO   //////
                String listainty = "";
               for (String s : tempoYInstancias)
               {
                   listainty += s + ",";  
               }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglod e instancias tempo y a AGENTE FUSION");
            AID id48 = new AID();
            id48.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje97 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje97.setSender(myAgent.getAID());
            mensaje97.setLanguage("Español");
            mensaje97.addReceiver(id48);
            mensaje97.setContent(listainty);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje97);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje97.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje98 = myAgent.blockingReceive();
            if (mensaje98!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje98.toString());
                fin = true;
            } 
             ///////    MENSAJE CINCO   //////
                    String listaceny = "";
               for (String s : tempoYCentroide)
               {
                   listaceny += s + ",";   
               }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
            AID id49 = new AID();
            id49.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje99 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje99.setSender(myAgent.getAID());
            mensaje99.setLanguage("Español");
            mensaje99.addReceiver(id49);
            mensaje99.setContent(listaceny);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje99);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje99.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje100 = myAgent.blockingReceive();
            if (mensaje100!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje100.toString());
                fin = true;
            } 
             ///////    MENSAJE SEIS   //////
                    String listarefy = "";
              for (String s : tempoYLanmark)
              {
                  listarefy += s + ",";  
              }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
            AID id50 = new AID();
            id50.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje101 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje101.setSender(myAgent.getAID());
            mensaje101.setLanguage("Español");
            mensaje101.addReceiver(id50);
            mensaje101.setContent(listarefy);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje101);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje101.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje102 = myAgent.blockingReceive();
            if (mensaje102!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje102.toString());
                fin = true;
            } 
             ///////    MENSAJE SIETE   //////
                    String listaintz = ""; 
             for (String s : tempoZInstancias)
             {
                 listaintz += s + ",";   
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar instancias tempo z a AGENTE FUSION");
            AID id51 = new AID();
            id51.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje103 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje103.setSender(myAgent.getAID());
            mensaje103.setLanguage("Español");
            mensaje103.addReceiver(id51);
            mensaje103.setContent(listaintz);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje103);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje103.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje104 = myAgent.blockingReceive();
            if (mensaje104!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje104.toString());
                fin = true;
            } 
             ///////    MENSAJE OCHO   //////
                        String listacenz = "";
                 for (String s : tempoZCentroide)
                 {
                     listacenz += s + ",";  
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
            AID id52 = new AID();
            id52.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje105 = new ACLMessage(ACLMessage.REQUEST);
 
        //Rellenar los campos necesarios del mensaje
            mensaje105.setSender(myAgent.getAID());
            mensaje105.setLanguage("Español");
            mensaje105.addReceiver(id52);
            mensaje105.setContent(listacenz);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje105);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje105.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje106 = myAgent.blockingReceive();
            if (mensaje106!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje106.toString());
                fin = true;
            } 
             ///////    MENSAJE NUEVE   //////
                        String listatemz = "";
                 for (String s : tempoZLanmark)
                 {
                     listatemz += s + ",";  
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
            AID id53 = new AID();
            id53.setLocalName("Fusiona");         
            // Creación del objeto ACLMessage
            ACLMessage mensaje107 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje107.setSender(myAgent.getAID());
            mensaje107.setLanguage("Español");
            mensaje107.addReceiver(id53);
            mensaje107.setContent(listatemz);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje107);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje107.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje108 = myAgent.blockingReceive();
            if (mensaje108!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje108.toString());
                fin = true;
            } 
            ///////    MENSAJE DIEZ   //////   
                        String listatemxnc = "";
                 for (String s : tempoXNC)
                 {
                     listatemxnc += s + ","; 
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster tempo x a AGENTE FUSION");
            AID id54 = new AID();
            id54.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje109 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje109.setSender(myAgent.getAID());
            mensaje109.setLanguage("Español");
            mensaje109.addReceiver(id54);
            mensaje109.setContent(listatemxnc);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje109);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje109.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje110 = myAgent.blockingReceive();
            if (mensaje110!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje110.toString());
                fin = true;
            } 
            
            ///////    MENSAJE ONCE   //////   
                    String listatemxi = "";
             for (String s : tempoXNI)
             {
                 listatemxi += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
            AID id55 = new AID();
            id55.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje111 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje111.setSender(myAgent.getAID());
            mensaje111.setLanguage("Español");
            mensaje111.addReceiver(id55);
            mensaje111.setContent(listatemxi);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje111);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje111.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje112 = myAgent.blockingReceive();
            if (mensaje112!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje112.toString());
                fin = true;
            }   
            ///////    MENSAJE DOCE   //////   
                    String listatemync = "";
             for (String s : tempoYNC)
             {
                 listatemync += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
            AID id56 = new AID();
            id56.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje113 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje113.setSender(myAgent.getAID());
            mensaje113.setLanguage("Español");
            mensaje113.addReceiver(id56);
            mensaje113.setContent(listatemync);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje113);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje113.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje114 = myAgent.blockingReceive();
            if (mensaje114!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje114.toString());
                fin = true;
            }
             ///////    MENSAJE TRECE   //////   
                    String listatemyi = "";
             for (String s : tempoYNI)
             {
                 listatemyi += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
            AID id57 = new AID();
            id57.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje115 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje115.setSender(myAgent.getAID());
            mensaje115.setLanguage("Español");
            mensaje115.addReceiver(id57);
            mensaje115.setContent(listatemyi);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje115);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje115.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje116 = myAgent.blockingReceive();
            if (mensaje116!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje116.toString());
                fin = true;
            }
            
            ///////    MENSAJE CATORCE   //////   
              String listatemznc = "";
             for (String s : tempoZNC)
             {
                 listatemznc += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
            AID id58 = new AID();
            id58.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje117 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje117.setSender(myAgent.getAID());
            mensaje117.setLanguage("Español");
            mensaje117.addReceiver(id58);
            mensaje117.setContent(listatemznc);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje117);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje117.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje118 = myAgent.blockingReceive();
            if (mensaje118!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje118.toString());
                fin = true;
            }
             ///////    MENSAJE QUINCE   //////   
             String listatemzi = "";
             for (String s : tempoZNI)
             {
                 listatemzi += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
            AID id59 = new AID();
            id59.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje119 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje119.setSender(myAgent.getAID());
            mensaje119.setLanguage("Español");
            mensaje119.addReceiver(id59);
            mensaje119.setContent(listatemzi);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje119);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje119.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje120 = myAgent.blockingReceive();
            if (mensaje120!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje120.toString());
                fin = true;
            }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            //////// DURACION ///////////////////////
            
            ///////// MENSAJE UNO //////////
        String listaintD = "";
        for (String s : duracionXInstancias)
        {
            listaintD += s + ",";
        }
                
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar instancias duracion X a AGENTE FUSION");
            AID id60 = new AID();
            id60.setLocalName("Fusiona");
 
        // Creación del objeto ACLMessage
            ACLMessage mensaje121 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje121.setSender(myAgent.getAID());
            mensaje121.setLanguage("Español");
            mensaje121.addReceiver(id60);
            mensaje121.setContent(listaintD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje121);
 
            System.out.println(myAgent.getLocalName() +": Enviando arreglo de instancias DURACION X  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje121.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje122 = myAgent.blockingReceive();
            if (mensaje122!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje122.toString());
                fin = true;
            } 
            
            ////////////    MENSAJE DOS   //////
            String listacenD = "";
            for (String s :  duracionXCentroide)
                {
                  listacenD += s + ",";
                }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglo de centroides DURACION X a AGENTE FUSION");
            AID id61 = new AID();
            id61.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje123 = new ACLMessage(ACLMessage.REQUEST);
            //Rellenar los campos necesarios del mensaje
            mensaje123.setSender(myAgent.getAID());
            mensaje123.setLanguage("Español");
            mensaje123.addReceiver(id61);
            mensaje123.setContent(listacenD); ///// String lista centroide ////
            //Envia el mensaje a los destinatarios
            myAgent.send(mensaje123);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje123.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje124 = myAgent.blockingReceive();
            if (mensaje124!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje124.toString());
                fin = true;
            } 
           ///////    MENSAJE TRES   //////
           ////// Convierte en string el arreglo /////  
           String listarefD = "";
           for (String s : duracionXLanmark)
           {
            listarefD += s + ",";   
           } 
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
            AID id62 = new AID();
            id62.setLocalName("Fusiona"); 
            // Creación del objeto ACLMessage
            ACLMessage mensaje125 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje125.setSender(myAgent.getAID());
            mensaje125.setLanguage("Español");
            mensaje125.addReceiver(id62);
            mensaje125.setContent(listarefD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje125);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje125.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje126 = myAgent.blockingReceive();
            if (mensaje126!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje126.toString());
                fin = true;
            }
            
            ///////    MENSAJE CUATRO   //////
                String listaintyD = "";
               for (String s : duracionYInstancias)
               {
                   listaintyD += s + ",";  
               }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglod e instancias duracion y a AGENTE FUSION");
            AID id63 = new AID();
            id63.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje127 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje127.setSender(myAgent.getAID());
            mensaje127.setLanguage("Español");
            mensaje127.addReceiver(id63);
            mensaje127.setContent(listaintyD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje127);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje127.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje128 = myAgent.blockingReceive();
            if (mensaje128!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje128.toString());
                fin = true;
            } 
             ///////    MENSAJE CINCO   //////
                    String listacenyD = "";
               for (String s : duracionYCentroide)
               {
                   listacenyD += s + ",";   
               }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
            AID id64 = new AID();
            id64.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje129 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje129.setSender(myAgent.getAID());
            mensaje129.setLanguage("Español");
            mensaje129.addReceiver(id64);
            mensaje129.setContent(listacenyD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje129);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje129.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje130 = myAgent.blockingReceive();
            if (mensaje130!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje130.toString());
                fin = true;
            } 
             ///////    MENSAJE SEIS   //////
                    String listarefyD = "";
              for (String s : duracionYLanmark)
              {
                  listarefyD += s + ",";  
              }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
            AID id65 = new AID();
            id65.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje131 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje131.setSender(myAgent.getAID());
            mensaje131.setLanguage("Español");
            mensaje131.addReceiver(id65);
            mensaje131.setContent(listarefyD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje131);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje131.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje132 = myAgent.blockingReceive();
            if (mensaje132!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje132.toString());
                fin = true;
            }
            
             ///////    MENSAJE SIETE   //////
                    String listaintzD = ""; 
             for (String s : duracionZInstancias)
             {
                 listaintzD += s + ",";   
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar instancias DURACION z a AGENTE FUSION");
            AID id66 = new AID();
            id66.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje133 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje133.setSender(myAgent.getAID());
            mensaje133.setLanguage("Español");
            mensaje133.addReceiver(id66);
            mensaje133.setContent(listaintzD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje133);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje133.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje134 = myAgent.blockingReceive();
            if (mensaje134!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje134.toString());
                fin = true;
            } 
             ///////    MENSAJE OCHO   //////
                        String listacenzD = "";
                 for (String s : duracionZCentroide)
                 {
                     listacenzD += s + ",";  
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
            AID id67 = new AID();
            id67.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje135 = new ACLMessage(ACLMessage.REQUEST);
 
        //Rellenar los campos necesarios del mensaje
            mensaje135.setSender(myAgent.getAID());
            mensaje135.setLanguage("Español");
            mensaje135.addReceiver(id67);
            mensaje135.setContent(listacenzD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje135);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje135.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje136 = myAgent.blockingReceive();
            if (mensaje136!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje136.toString());
                fin = true;
            } 
             ///////    MENSAJE NUEVE   //////
                        String listatemzD = "";
                 for (String s : duracionZLanmark)
                 {
                     listatemzD += s + ",";  
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
            AID id68 = new AID();
            id68.setLocalName("Fusiona");         
            // Creación del objeto ACLMessage
            ACLMessage mensaje137 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje137.setSender(myAgent.getAID());
            mensaje137.setLanguage("Español");
            mensaje137.addReceiver(id68);
            mensaje137.setContent(listatemzD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje137);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje137.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje138 = myAgent.blockingReceive();
            if (mensaje138!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje138.toString());
                fin = true;
            } 
            
             ///////    MENSAJE DIEZ   //////   
                        String listatemxncD = "";
                 for (String s : duracionXNC)
                 {
                     listatemxncD += s + ","; 
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster duracion x a AGENTE FUSION");
            AID id69 = new AID();
            id69.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje139 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje139.setSender(myAgent.getAID());
            mensaje139.setLanguage("Español");
            mensaje139.addReceiver(id69);
            mensaje139.setContent(listatemxncD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje139);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje139.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje140 = myAgent.blockingReceive();
            if (mensaje140!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje140.toString());
                fin = true;
            } 
            
            ///////    MENSAJE ONCE   //////   
                    String listatemxiD = "";
             for (String s : duracionXNI)
             {
                 listatemxiD += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
            AID id70 = new AID();
            id70.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje141 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje141.setSender(myAgent.getAID());
            mensaje141.setLanguage("Español");
            mensaje141.addReceiver(id70);
            mensaje141.setContent(listatemxiD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje141);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje141.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje142 = myAgent.blockingReceive();
            if (mensaje142!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje142.toString());
                fin = true;
            } 
            
            
             ///////    MENSAJE DOCE   //////   
                    String listatemyncD = "";
             for (String s : duracionYNC)
             {
                 listatemyncD += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
            AID id71 = new AID();
            id71.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje143 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje143.setSender(myAgent.getAID());
            mensaje143.setLanguage("Español");
            mensaje143.addReceiver(id71);
            mensaje143.setContent(listatemyncD);
            //Envia el mensaje a los destinatarios
            myAgent.send(mensaje143);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje143.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje144 = myAgent.blockingReceive();
            if (mensaje144!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje144.toString());
                fin = true;
            }
             ///////    MENSAJE TRECE   //////   
                    String listatemyiD = "";
             for (String s : duracionYNI)
             {
                 listatemyiD += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
            AID id72 = new AID();
            id72.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje145 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje145.setSender(myAgent.getAID());
            mensaje145.setLanguage("Español");
            mensaje145.addReceiver(id72);
            mensaje145.setContent(listatemyiD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje145);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje145.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje146 = myAgent.blockingReceive();
            if (mensaje146!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje146.toString());
                fin = true;
            }
            
            
             ///////    MENSAJE CATORCE   //////   
              String listatemzncD = "";
             for (String s : duracionZNC)
             {
                 listatemzncD += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
            AID id73 = new AID();
            id73.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje147 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje147.setSender(myAgent.getAID());
            mensaje147.setLanguage("Español");
            mensaje147.addReceiver(id73);
            mensaje147.setContent(listatemzncD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje147);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje147.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje148 = myAgent.blockingReceive();
            if (mensaje148!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje148.toString());
                fin = true;
            }
             ///////    MENSAJE QUINCE   //////   
             String listatemziD = "";
             for (String s : duracionZNI)
             {
                 listatemziD += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
            AID id74 = new AID();
            id74.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje149 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje149.setSender(myAgent.getAID());
            mensaje149.setLanguage("Español");
            mensaje149.addReceiver(id74);
            mensaje149.setContent(listatemziD);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje149);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje149.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje150 = myAgent.blockingReceive();
            if (mensaje150!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje150.toString());
                fin = true;
            }
            
            /////////////////////////////////////////////////////
            //////////////// OCTAVAS ////////////////////
             ///////// MENSAJE UNO //////////
        String listaintO = "";
        for (String s : octavaXInstancias)
        {
            listaintO += s + ",";
        }
                
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar instancias duracion X a AGENTE FUSION");
            AID id75 = new AID();
            id75.setLocalName("Fusiona");
 
        // Creación del objeto ACLMessage
            ACLMessage mensaje151 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje151.setSender(myAgent.getAID());
            mensaje151.setLanguage("Español");
            mensaje151.addReceiver(id75);
            mensaje151.setContent(listaintO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje151);
 
            System.out.println(myAgent.getLocalName() +": Enviando arreglo de instancias DURACION X  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje151.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje152 = myAgent.blockingReceive();
            if (mensaje152!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje152.toString());
                fin = true;
            } 
            
            ////////////    MENSAJE DOS   //////
            String listacenO = "";
            for (String s :  octavaXCentroide)
                {
                  listacenO += s + ",";
                }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglo de centroides DURACION X a AGENTE FUSION");
            AID id76 = new AID();
            id76.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje153 = new ACLMessage(ACLMessage.REQUEST);
            //Rellenar los campos necesarios del mensaje
            mensaje153.setSender(myAgent.getAID());
            mensaje153.setLanguage("Español");
            mensaje153.addReceiver(id76);
            mensaje153.setContent(listacenO); ///// String lista centroide ////
            //Envia el mensaje a los destinatarios
            myAgent.send(mensaje153);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje153.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje154 = myAgent.blockingReceive();
            if (mensaje154!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje154.toString());
                fin = true;
            }
            
            ///////    MENSAJE TRES   //////
           ////// Convierte en string el arreglo /////  
           String listarefO = "";
           for (String s : octavaXLanmark)
           {
            listarefO += s + ",";   
           } 
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
            AID id77 = new AID();
            id77.setLocalName("Fusiona"); 
            // Creación del objeto ACLMessage
            ACLMessage mensaje155 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje155.setSender(myAgent.getAID());
            mensaje155.setLanguage("Español");
            mensaje155.addReceiver(id77);
            mensaje155.setContent(listarefO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje155);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje155.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje156 = myAgent.blockingReceive();
            if (mensaje156!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje156.toString());
                fin = true;
            }
            
            ///////    MENSAJE CUATRO   //////
                String listaintyO = "";
               for (String s : octavaYInstancias)
               {
                   listaintyO += s + ",";  
               }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglod e instancias duracion y a AGENTE FUSION");
            AID id78 = new AID();
            id78.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje157 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje157.setSender(myAgent.getAID());
            mensaje157.setLanguage("Español");
            mensaje157.addReceiver(id78);
            mensaje157.setContent(listaintyO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje157);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje157.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje158 = myAgent.blockingReceive();
            if (mensaje158!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje158.toString());
                fin = true;
            } 
             ///////    MENSAJE CINCO   //////
                    String listacenyO = "";
               for (String s : octavaYCentroide)
               {
                   listacenyO += s + ",";   
               }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
            AID id79 = new AID();
            id79.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje159 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje159.setSender(myAgent.getAID());
            mensaje159.setLanguage("Español");
            mensaje159.addReceiver(id79);
            mensaje159.setContent(listacenyO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje159);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje159.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje160 = myAgent.blockingReceive();
            if (mensaje160!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje160.toString());
                fin = true;
            }
            
             ///////    MENSAJE SEIS   //////
                    String listarefyO = "";
              for (String s : octavaYLanmark)
              {
                  listarefyO += s + ",";  
              }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
            AID id80 = new AID();
            id80.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje161 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje161.setSender(myAgent.getAID());
            mensaje161.setLanguage("Español");
            mensaje161.addReceiver(id80);
            mensaje161.setContent(listarefyO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje161);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje161.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje162 = myAgent.blockingReceive();
            if (mensaje162!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje162.toString());
                fin = true;
            }
            
             ///////    MENSAJE SIETE   //////
                    String listaintzO = ""; 
             for (String s : octavaZInstancias)
             {
                 listaintzO += s + ",";   
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar instancias DURACION z a AGENTE FUSION");
            AID id81 = new AID();
            id81.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje163 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje163.setSender(myAgent.getAID());
            mensaje163.setLanguage("Español");
            mensaje163.addReceiver(id81);
            mensaje163.setContent(listaintzO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje163);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje163.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje164 = myAgent.blockingReceive();
            if (mensaje164!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje164.toString());
                fin = true;
            } 
             ///////    MENSAJE OCHO   //////
                        String listacenzO = "";
                 for (String s : octavaZCentroide)
                 {
                     listacenzO += s + ",";  
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
            AID id82 = new AID();
            id82.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje165 = new ACLMessage(ACLMessage.REQUEST);
 
        //Rellenar los campos necesarios del mensaje
            mensaje165.setSender(myAgent.getAID());
            mensaje165.setLanguage("Español");
            mensaje165.addReceiver(id82);
            mensaje165.setContent(listacenzO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje165);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje165.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje166 = myAgent.blockingReceive();
            if (mensaje166!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje166.toString());
                fin = true;
            } 
             ///////    MENSAJE NUEVE   //////
                        String listatemzO = "";
                 for (String s : octavaZLanmark)
                 {
                     listatemzO += s + ",";  
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
            AID id83 = new AID();
            id83.setLocalName("Fusiona");         
            // Creación del objeto ACLMessage
            ACLMessage mensaje167 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje167.setSender(myAgent.getAID());
            mensaje167.setLanguage("Español");
            mensaje167.addReceiver(id83);
            mensaje167.setContent(listatemzO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje167);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje167.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje168 = myAgent.blockingReceive();
            if (mensaje168!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje168.toString());
                fin = true;
            } 
            
             ///////    MENSAJE DIEZ   //////   
                        String listatemxncO = "";
                 for (String s : octavaXNC)
                 {
                     listatemxncO += s + ","; 
                 }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster duracion x a AGENTE FUSION");
            AID id84 = new AID();
            id84.setLocalName("Fusiona");
            // Creación del objeto ACLMessage
            ACLMessage mensaje169 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje169.setSender(myAgent.getAID());
            mensaje169.setLanguage("Español");
            mensaje169.addReceiver(id84);
            mensaje169.setContent(listatemxncO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje169);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje169.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje170 = myAgent.blockingReceive();
            if (mensaje170!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje170.toString());
                fin = true;
            }
            
            ///////    MENSAJE ONCE   //////   
                    String listatemxiO = "";
             for (String s : octavaXNI)
             {
                 listatemxiO += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
            AID id85 = new AID();
            id85.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje171 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje171.setSender(myAgent.getAID());
            mensaje171.setLanguage("Español");
            mensaje171.addReceiver(id85);
            mensaje171.setContent(listatemxiO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje171);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje171.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje172 = myAgent.blockingReceive();
            if (mensaje172!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje172.toString());
                fin = true;
            } 

             ///////    MENSAJE DOCE   //////   
                    String listatemyncO = "";
             for (String s : octavaYNC)
             {
                 listatemyncO += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
            AID id86 = new AID();
            id86.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje173 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje173.setSender(myAgent.getAID());
            mensaje173.setLanguage("Español");
            mensaje173.addReceiver(id86);
            mensaje173.setContent(listatemyncO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje173);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje173.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje174 = myAgent.blockingReceive();
            if (mensaje174!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje174.toString());
                fin = true;
            }
             ///////    MENSAJE TRECE   //////   
                    String listatemyiO = "";
             for (String s : octavaYNI)
             {
                 listatemyiO += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
            AID id87 = new AID();
            id87.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje175 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje175.setSender(myAgent.getAID());
            mensaje175.setLanguage("Español");
            mensaje175.addReceiver(id87);
            mensaje175.setContent(listatemyiO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje175);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION");
            System.out.println(mensaje175.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje176 = myAgent.blockingReceive();
            if (mensaje176!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje176.toString());
                fin = true;
            }
            
           
             ///////    MENSAJE CATORCE   //////   
              String listatemzncO = "";
             for (String s : octavaZNC)
             {
                 listatemzncO += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
            AID id88 = new AID();
            id88.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje177 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje177.setSender(myAgent.getAID());
            mensaje177.setLanguage("Español");
            mensaje177.addReceiver(id88);
            mensaje177.setContent(listatemzncO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje177);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION *****");
            System.out.println(mensaje177.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje178 = myAgent.blockingReceive();
            if (mensaje178!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje178.toString());
                fin = true;
            }
             ///////    MENSAJE QUINCE   //////   
             String listatemziO = "";
             for (String s : octavaZNI)
             {
                 listatemziO += s + ",";
             }
            System.out.println("Soy el Agente " + myAgent.getLocalName() +": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
            AID id89 = new AID();
            id89.setLocalName("Fusiona");
            
            // Creación del objeto ACLMessage
            ACLMessage mensaje179 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
            mensaje179.setSender(myAgent.getAID());
            mensaje179.setLanguage("Español");
            mensaje179.addReceiver(id89);
            mensaje179.setContent(listatemziO);
        //Envia el mensaje a los destinatarios
            myAgent.send(mensaje179);
            System.out.println(myAgent.getLocalName() +": Enviando arreglo  a FUSIONA- AGENTE FUSION ******");
            System.out.println(mensaje179.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
            //Espera la respuesta
            ACLMessage mensaje180 = myAgent.blockingReceive();
            if (mensaje180!= null)
            {
                System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
                System.out.println(mensaje180.toString());
                fin = true;
            }
    }
    
     public boolean done()
    {
        return fin = true;
    }
    
}
