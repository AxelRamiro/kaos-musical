/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Agentes.AgPlaneador;
import Interfaces.guiARecomendar;
import Interfaces.guiAFusionar;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import Clustering.*;
import static Comportamientos.CExtraer.arrayTempoXTprueba;
import static Comportamientos.CExtraer.emocion3;

import ObjeAux.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class CFusionarXM  extends SimpleBehaviour 

{
    
        public static String arreglotempoXNCX;
        public static String arreglotempoXNIX;
        
        public static String arreglopruebaX;
        public static String arregloprueba1X;
        public static String arregloprueba2X;
        
        public static String arreglotempoYNCX;
        public static String arreglotempoYNIX;
        
        public static String arregloprueba3X;
        public static String arregloprueba4X;
        public static String arregloprueba5X;
         
        public static String arreglotempoZNCX;
        public static String arreglotempoZNIX;
        
        public static String arregloprueba6X;
        public static String arregloprueba7X;
        public static String arregloprueba8X;
        
        public static ArrayList arregloInstanciasTXX;
        public static ArrayList arregloInstanciasTYX;
        public static ArrayList arregloInstanciasTZX;
        
        public static ArrayList arregloInstanciasTX1X;
         public static ArrayList arregloInstanciasTY1X;
        public static ArrayList arregloInstanciasTZ1X;

        public static ArrayList arregloPPTXX;
        public static ArrayList arregloPPTYX;
        public static ArrayList arregloPPTZX;
        
        public static ArrayList arregloPPTX1X;
        public static ArrayList arregloPPTY1X;
        public static ArrayList arregloPPTZ1X;
        
        public static ArrayList arregloPATXX;
        public static ArrayList arregloPATYX;
        public static ArrayList arregloPATZX;
        
         public static ArrayList arregloPATX1X;
        public static ArrayList arregloPATY1X;
        public static ArrayList arregloPATZ1X;
        
        ////////////// DURACION /////////////////
        
        public static String arregloduracionXNCX;
        public static String arregloduracionXNIX;
        
        public static String arreglopruebaDX;
        public static String arregloprueba1DX;
        public static String arregloprueba2DX;
        
        public static String arregloduracionYNCX;
        public static String arregloduracionYNIX;
        
        public static String arregloprueba3DX;
        public static String arregloprueba4DX;
        public static String arregloprueba5DX;
         
        public static String arregloduracionZNCX;
        public static String arregloduracionZNIX;
        
        public static String arregloprueba6DX;
        public static String arregloprueba7DX;
        public static String arregloprueba8DX;
        
        public static ArrayList arregloInstanciasDXX;
        public static ArrayList arregloInstanciasDYX;
        public static ArrayList arregloInstanciasDZX;
        
         public static ArrayList arregloInstanciasDX1X;
        public static ArrayList arregloInstanciasDY1X;
        public static ArrayList arregloInstanciasDZ1X;

        public static ArrayList arregloPPDXX;
        public static ArrayList arregloPPDYX;
        public static ArrayList arregloPPDZX;
        
        public static ArrayList arregloPPDX1X;
        public static ArrayList arregloPPDY1X;
        public static ArrayList arregloPPDZ1X;
        
        public static ArrayList arregloPADXX;
        public static ArrayList arregloPADYX;
        public static ArrayList arregloPADZX;
        
         public static ArrayList arregloPADX1X;
        public static ArrayList arregloPADY1X;
        public static ArrayList arregloPADZ1X;
        
        ////////////// OCTAVAS /////////////////
        
        public static String arreglooctavaXNCX;
        public static String arreglooctavaXNIX;
        
        public static String arreglopruebaOX;
        public static String arregloprueba1OX;
        public static String arregloprueba2OX;
        
        public static String arreglooctavaYNCX;
        public static String arreglooctavaYNIX;
        
        public static String arregloprueba3OX;
        public static String arregloprueba4OX;
        public static String arregloprueba5OX;
         
        public static String arreglooctavaZNCX;
        public static String arreglooctavaZNIX;
        
        public static String arregloprueba6OX;
        public static String arregloprueba7OX;
        public static String arregloprueba8OX;
        
        public static ArrayList arregloInstanciasOXX;
        public static ArrayList arregloInstanciasOYX;
        public static ArrayList arregloInstanciasOZX;
        
        public static ArrayList arregloInstanciasOX1X;
        public static ArrayList arregloInstanciasOY1X;
        public static ArrayList arregloInstanciasOZ1X;

        public static ArrayList arregloPPOXX;
        public static ArrayList arregloPPOYX;
        public static ArrayList arregloPPOZX;
        
         public static ArrayList arregloPPOX1X;
        public static ArrayList arregloPPOY1X;
        public static ArrayList arregloPPOZ1X;
        
        public static ArrayList arregloPAOXX;
        public static ArrayList arregloPAOYX;
        public static ArrayList arregloPAOZX;
         public static ArrayList arregloPAOX1X;
        public static ArrayList arregloPAOY1X;
        public static ArrayList arregloPAOZ1X;

      private boolean fin = false;
      
    public CFusionarXM(Agent a)
  {
      super(a);
     
  }
    
      @Override
       public void action() {
          
          
          System.out.println(" ** Receptor xm Preparandose para recibir ** ");
         ACLMessage mensaje91 = myAgent.blockingReceive();
                if (mensaje91!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje91.toString());
                    //fin = true;
                    arreglopruebaX = mensaje91.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje91.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglopruebaX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();                    
                }
                
             ///////// RECIBIENDO MENSAJE 2 //////////  
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje93 = myAgent.blockingReceive();
                if (mensaje93!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje93);
                    //fin = true;                  
                    arregloprueba1X = mensaje93.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje93.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba1X);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();       
                }
                
                ///////// RECIBIENDO MENSAJE 3 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje95 = myAgent.blockingReceive();
                if (mensaje95!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje95);
                    //fin = true;
                    arregloprueba2X = mensaje95.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje95.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba2X);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */   
                }       
                ///////// RECIBIENDO MENSAJE 4 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje97 = myAgent.blockingReceive();
                if (mensaje97!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje97.toString());
                    arregloprueba3X = mensaje97.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje97.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba3X);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 5 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje99 = myAgent.blockingReceive();
                if (mensaje99!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje99.toString());
                    //fin = true;
                    arregloprueba4X = mensaje99.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje99.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba4X);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 6 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje101 = myAgent.blockingReceive();
                if (mensaje101!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje101);
                    //fin = true;
                    arregloprueba5X = mensaje101.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje101.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba5X   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 7 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje103 = myAgent.blockingReceive();
                if (mensaje103!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje103);
                    //fin = true;
                    arregloprueba6X = mensaje103.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje103.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba6X   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 8 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje105 = myAgent.blockingReceive();
                if (mensaje105!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje105);
                    //fin = true;
                    arregloprueba7X = mensaje105.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje105.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba7X);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                ///////// RECIBIENDO MENSAJE 9 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje107 = myAgent.blockingReceive();
                if (mensaje107!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje107);
                    //fin = true;
                    arregloprueba8X = mensaje107.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje107.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba8X   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 10 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje109 = myAgent.blockingReceive();
                if (mensaje109!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje109);
                    //fin = true;
                    arreglotempoXNCX= mensaje109.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje109.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglotempoXNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 11 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje111 = myAgent.blockingReceive();
                if (mensaje111!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje111);
                    //fin = true;
                    arreglotempoXNIX = mensaje111.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje111.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglotempoXNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 12 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje113 = myAgent.blockingReceive();
                if (mensaje113!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje113);
                    //fin = true;
                    arreglotempoYNCX = mensaje113.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje113.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglotempoYNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 13 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje115 = myAgent.blockingReceive();
                if (mensaje115!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje115);
                    //fin = true;
                    arreglotempoYNIX = mensaje115.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje115.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglotempoYNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 14 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje117 = myAgent.blockingReceive();
                if (mensaje117!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje117);
                    //fin = true;
                    arreglotempoZNCX = mensaje117.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje117.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglotempoZNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 15 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje119 = myAgent.blockingReceive();
                if (mensaje119!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje119);
                    //fin = true;
                    arreglotempoZNIX = mensaje119.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje119.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglotempoZNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                /////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                         ///////// RECIBIENDO MENSAJE UNO DURACION //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje121 = myAgent.blockingReceive();
                if (mensaje121!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje121);
                    //fin = true;
                    arreglopruebaDX = mensaje121.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje121.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" +  arreglopruebaDX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 2 //////////  
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje123 = myAgent.blockingReceive();
                if (mensaje123!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje123);
                    //fin = true;                  
                    arregloprueba1DX = mensaje123.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje123.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba1DX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */       
                }
                
                ///////// RECIBIENDO MENSAJE 3 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje125 = myAgent.blockingReceive();
                if (mensaje125!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje125);
                    //fin = true;
                    arregloprueba2DX = mensaje125.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje125.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba2DX   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */   
                }  
                
                 ///////// RECIBIENDO MENSAJE 4 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje127 = myAgent.blockingReceive();
                if (mensaje127!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje127.toString());
                    arregloprueba3DX = mensaje127.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje127.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba3DX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 5 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje129 = myAgent.blockingReceive();
                if (mensaje129!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje129.toString());
                    //fin = true;
                    arregloprueba4DX = mensaje129.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje129.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba4DX   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                
                 ///////// RECIBIENDO MENSAJE 6 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje131 = myAgent.blockingReceive();
                if (mensaje131!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje131);
                    //fin = true;
                    arregloprueba5DX = mensaje131.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje131.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba5DX   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 7 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje133 = myAgent.blockingReceive();
                if (mensaje133!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje133);
                    //fin = true;
                    arregloprueba6DX = mensaje133.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje133.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba6DX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
             
                }
                
                ///////// RECIBIENDO MENSAJE 8 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje135 = myAgent.blockingReceive();
                if (mensaje135!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje135);
                    //fin = true;
                    arregloprueba7DX = mensaje135.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje135.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba7DX   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                
                ///////// RECIBIENDO MENSAJE 9 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje137 = myAgent.blockingReceive();
                if (mensaje137!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje137);
                    //fin = true;
                    arregloprueba8DX = mensaje137.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje137.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba8DX   );
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 10 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje139 = myAgent.blockingReceive();
                if (mensaje139!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje139);
                    //fin = true;
                    arregloduracionXNCX= mensaje139.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje139.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloduracionXNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 11 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje141 = myAgent.blockingReceive();
                if (mensaje141!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje141);
                    //fin = true;
                    arregloduracionXNIX = mensaje141.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje141.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloduracionXNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 12 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje143 = myAgent.blockingReceive();
                if (mensaje143!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje143);
                    //fin = true;
                    arregloduracionYNCX = mensaje143.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje143.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloduracionYNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 13 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje145 = myAgent.blockingReceive();
                if (mensaje145!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje145);
                    //fin = true;
                    arregloduracionYNIX = mensaje145.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje145.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloduracionYNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 14 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje147 = myAgent.blockingReceive();
                if (mensaje147!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje147);
                    //fin = true;
                    arregloduracionZNCX = mensaje147.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje147.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloduracionZNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 15 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje149 = myAgent.blockingReceive();
                if (mensaje149!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje149);
                    //fin = true;
                    arregloduracionZNIX = mensaje149.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje149.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloduracionZNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                
                /////////////////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                         ///////// RECIBIENDO MENSAJE UNO OCTAVA //////////
                
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje151 = myAgent.blockingReceive();
                if (mensaje151!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje151);
                    //fin = true;
                    arreglopruebaOX = mensaje151.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje151.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" +  arreglopruebaOX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 2 //////////  
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje153 = myAgent.blockingReceive();
                if (mensaje153!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje153);
                    //fin = true;                  
                    arregloprueba1OX = mensaje153.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje153.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba1OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */       
                }
                
                ///////// RECIBIENDO MENSAJE 3 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje155 = myAgent.blockingReceive();
                if (mensaje155!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje155);
                    //fin = true;
                    arregloprueba2OX = mensaje155.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje155.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba2OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */   
                }  
                
                 ///////// RECIBIENDO MENSAJE 4 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje157 = myAgent.blockingReceive();
                if (mensaje157!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje157.toString());
                    arregloprueba3OX = mensaje157.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje157.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba3OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 5 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje159 = myAgent.blockingReceive();
                if (mensaje159!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje159.toString());
                    //fin = true;
                    arregloprueba4OX = mensaje159.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje159.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba4OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 6 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje161 = myAgent.blockingReceive();
                if (mensaje161!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje161);
                    //fin = true;
                    arregloprueba5OX = mensaje161.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje161.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba5OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                ///////// RECIBIENDO MENSAJE 7 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje163 = myAgent.blockingReceive();
                if (mensaje163!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje163);
                    //fin = true;
                    arregloprueba6OX = mensaje163.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje163.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba6OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                
                ///////// RECIBIENDO MENSAJE 8 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje165 = myAgent.blockingReceive();
                if (mensaje165!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje165);
                    //fin = true;
                    arregloprueba7OX = mensaje165.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje165.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba7OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                    /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
                     * hasta que termina el comportamiento sobre el que se aplica
                     */
                }
                
                ///////// RECIBIENDO MENSAJE 9 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje167 = myAgent.blockingReceive();
                if (mensaje167!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje167);
                    //fin = true;
                    arregloprueba8OX = mensaje167.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje167.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arregloprueba8OX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 10 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje169 = myAgent.blockingReceive();
                if (mensaje169!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje169);
                    //fin = true;
                    arreglooctavaXNCX= mensaje169.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje169.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglooctavaXNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                ///////// RECIBIENDO MENSAJE 11 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje171 = myAgent.blockingReceive();
                if (mensaje171!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje171);
                    //fin = true;
                    arreglooctavaXNIX = mensaje171.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje171.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglooctavaXNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 12 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje173 = myAgent.blockingReceive();
                if (mensaje173!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje173);
                    //fin = true;
                    arreglooctavaYNCX = mensaje173.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje173.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglooctavaYNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                ///////// RECIBIENDO MENSAJE 13 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje175 = myAgent.blockingReceive();
                if (mensaje175!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje175);
                    //fin = true;
                    arreglooctavaYNIX = mensaje175.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje175.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglooctavaYNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                 ///////// RECIBIENDO MENSAJE 14 ///////////*
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje177 = myAgent.blockingReceive();
                if (mensaje177!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje177);
                    //fin = true;
                    arreglooctavaZNCX = mensaje177.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje177.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglooctavaZNCX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor **");
                    System.out.println(respuesta.toString());
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                } 
               ///////// RECIBIENDO MENSAJE 15 //////////
                System.out.println(" ** Receptor Preparandose para recibir ** ");
                ACLMessage mensaje179 = myAgent.blockingReceive();
                if (mensaje179!= null)
                {
                    System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
                    System.out.println(mensaje179);
                    //fin = true;
                    arreglooctavaZNIX = mensaje179.getContent();
                    // Envia constestación con INFORM createReply
                    System.out.println(myAgent.getLocalName() +"** : Enviando contestacion **");
                    ACLMessage respuesta = mensaje179.createReply();
                    respuesta.setPerformative( ACLMessage.INFORM );
                    respuesta.setContent( "Voy a procesar el arreglo :" + arreglooctavaZNIX);
                    myAgent.send(respuesta);
                    System.out.println(myAgent.getLocalName() +"** : Enviando mensaje a emisor ********");
                    System.out.println(respuesta.toString());
                 
                    fin = true;                    
                }
                else
                {
                    System.out.println("Receptor: Esperando a recibir mensaje");
                    block();
                }
                
                System.out.println("Iniciare el proceso de Fusion con xmeans");
      /////// intancia calculo tempo X //////
      calculo_tempo cal = new calculo_tempo();
       calculo_duracion cal1 = new calculo_duracion();
       calculo_octava cal2 = new calculo_octava();
        consultas_arreglos cons = new consultas_arreglos();
      calculoIndiceValidezCH indCH = new calculoIndiceValidezCH();
      calculoIndiceValidezDB indDB = new calculoIndiceValidezDB();
      
      /////////////// Numero de Cumulos /////////////
      ArrayList<String> myListTempoXNC = new ArrayList<String>(Arrays.asList(arreglotempoXNCX.split(",")));
      ArrayList arrayTempoXNC1  = new ArrayList();
      arrayTempoXNC1  = myListTempoXNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListTempoXNI = new ArrayList<String>(Arrays.asList(arreglotempoXNIX.split(",")));
      ArrayList arrayTempoXNI1  = new ArrayList(); 
      arrayTempoXNI1  = myListTempoXNI;
      ///////// Arreglo pruba lopasa a array /////
      ArrayList<String> myList = new ArrayList<String>(Arrays.asList(arreglopruebaX.split(",")));
      ArrayList arrayTempoXI  = new ArrayList();
      arrayTempoXI = myList;
     //////////////////////////
      ArrayList<String> myList1 = new ArrayList<String>(Arrays.asList(arregloprueba1X.split(",")));
      ArrayList arrayTempoXC  = new ArrayList(); 
      arrayTempoXC = myList1;
     //////////////////////
      ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList(arregloprueba2X.split(",")));
      ArrayList arrayTempoXT  = new ArrayList(); 
      arrayTempoXT = myList2;
     ////////////////////////// tempo en x ///////////
       ArrayList calculoTX1 = new ArrayList(); ///// Asiganción a la lanmark segun refrencia
       ArrayList calculoTX2 = new ArrayList(); //// Promedio Aritmetico Centroide
       ArrayList calculoTX3 = new ArrayList();
       ArrayList calculoTX4 = new ArrayList();
       ArrayList calculoTX5 = new ArrayList();
       ArrayList calculoTXprueba = new ArrayList();
       ArrayList calculoTXprueba2 = new ArrayList();
       double calculoTX6 = 0;
      
       ArrayList calculoTX7 = new ArrayList();
       ArrayList calculoTX8 = new ArrayList();
       double numCluster = 0;
       double numElementos = 0;
       double numClusterPA = 0;
       double numElementosPA = 0;
       ArrayList arraySCKX = new ArrayList();
       Object comboFusion;
       
       comboFusion = guiARecomendar.jcboF.getSelectedItem();
       
       System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" + comboFusion );
       
             for (int i = 0; i < arrayTempoXNC1.size(); i++)
                {
                guiAFusionar.jTextNCNITXX.append((String) "Cluster "+ arrayTempoXNC1.get(i) +  (String) "Instancia "+ arrayTempoXNI1.get(i) + " \n");
                numElementos = i;
                numElementosPA = i;
                }
            for (int i = 0; i < arrayTempoXI.size(); i++)
                {
                guiAFusionar.jTextGCTXX.append((String) "Cluster ["+i+"]"+arrayTempoXI.get(i)+" Instancias"+ "-->" + "Centroide: " + (String) arrayTempoXC.get(i)+ " \n");
                }
            for (int i = 0; i < arrayTempoXT.size(); i++)
                {
                guiAFusionar.jTextALTXX.append((String) "[Cluster "+i+"]"+ arrayTempoXT.get(i)+ " \n");
                }
              
                                   
 ////////// ASIGNACIONES A LANMAKR ////////////////
             String [] lanmark = arregloprueba2X.split(","); ////// Convertir string a String []
             calculoTX1 = cal.fusionTempo(lanmark);
            for (int i = 0; i < calculoTX1.size(); i++)
            {     
                guiAFusionar.jTextFusionTXX.append((String)calculoTX1.get(i)+ "\n");
            }           
////////// FUSIÓN DE CLUSTER ////////////////
             calculoTX2 = cal.fusionTempoPMC(lanmark,arrayTempoXC); // Promedio Aritmetico
             arregloPATXX = cal.fusionTempoPMC1(lanmark,arrayTempoXC);
            arregloPATX1X = cal.fusionTempoPMC2(lanmark, arrayTempoXC);
            for (int i = 0; i < calculoTX2.size(); i++)
            {
                guiAFusionar.jTextFusionTXFX.append((String)calculoTX2.get(i)+ "\n");
            }
            
            
            calculoTX3 = cal.fusionTempoSI(lanmark,arrayTempoXI,arrayTempoXC);
            arregloInstanciasTXX = cal.fusionTempoSI1(lanmark, arrayTempoXI,arrayTempoXC); 
            arregloInstanciasTX1X = cal.fusionTempoSI2(lanmark, arrayTempoXI,arrayTempoXC);
            
            for (int i = 0; i < calculoTX3.size(); i++)
            {  
                guiAFusionar.jTextFusionTXFIX.append((String)calculoTX3.get(i)+ "\n");
            }    
            calculoTX4 = cal.fusionTempoPPC(lanmark,arrayTempoXC,arrayTempoXI);
            arregloPPTXX = cal.fusionTempoPPC1(lanmark,arrayTempoXC,arrayTempoXI);
            arregloPPTX1X = cal.fusionTempoPPC2(lanmark,arrayTempoXC,arrayTempoXI);
            
            
            for (int i = 0; i < calculoTX4.size(); i++)
            {
                guiAFusionar.jTextFusionTXFPPX.append((String)calculoTX4.get(i)+ "\n");
                numCluster = i;
                numClusterPA = i;
            }
            
            calculoTX5 = cal.fusionTempoInstancias(lanmark,arrayTempoXNC1,arrayTempoXNI1);
            for (int i = 0; i < calculoTX5.size(); i++)
            {
                guiAFusionar.jTextFusionTXFNCIX.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
            
            if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoTXprueba = indCH.fusionTempoPPC(lanmark,arrayTempoXC,arrayTempoXI);
            calculoTX6 = indCH.distanciaClusterFusionados(lanmark,arrayTempoXNC1,arrayTempoXNI1);
            sumad = calculoTX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayTempoXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoTX7 = cal.fusionTempoPPC1(lanmark,arrayTempoXC,arrayTempoXI);
         calculoTX8 = cal.fusionTempoSI1(lanmark,arrayTempoXI,arrayTempoXC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoTX7,cenGeneral,calculoTX8);
        System.out.println("Numerador " + sumad1);
        numElementos = numElementos + 1;
        numCluster = numCluster + 1;
        System.out.println("Numero de elementos " + numElementos);
        System.out.println("Numero de Cluster " + numCluster);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementos - numCluster) / (numCluster - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jTXFIndiceCHX.setText(String.valueOf(indiceValidezfinal)); 
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoTXprueba2 = indDB.fusionTempoPPC(lanmark,arrayTempoXC,arrayTempoXI);
            arraySCKX  = indDB.distanciaClusterFusionados(lanmark,arrayTempoXNC1,arrayTempoXNI1);
            
             for (int i = 0; i < arraySCKX .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKX.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoTX7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoTX7, arraySCKX);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jTXFIndiceDBX.setText(String.valueOf(indiceDB));
             
            }
            
                    if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
                System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");
                
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoTXprueba = indCH.fusionTempoPMC(lanmark,arrayTempoXC);
            calculoTX6 = indCH.distanciaClusterFusionados(lanmark,arrayTempoXNC1,arrayTempoXNI1);
            sumad = calculoTX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayTempoXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoTX7 = cal.fusionTempoPMC1(lanmark,arrayTempoXC);
         calculoTX8 = cal.fusionTempoSI1(lanmark,arrayTempoXI,arrayTempoXC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoTX7,cenGeneral,calculoTX8);
        System.out.println("Numerador " + sumad1);
        numElementosPA = numElementosPA + 1;
        numClusterPA = numClusterPA + 1;
        System.out.println("Numero de elementos " + numElementosPA);
        System.out.println("Numero de Cluster " + numClusterPA);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosPA - numClusterPA) / (numClusterPA - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jTXFIndiceCHPAX.setText(String.valueOf(indiceValidezfinal)); 
        
         System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoTXprueba2 = indDB.fusionTempoPMC(lanmark,arrayTempoXC);
            arraySCKX  = indDB.distanciaClusterFusionados(lanmark,arrayTempoXNC1,arrayTempoXNI1);
            
             for (int i = 0; i < arraySCKX .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKX.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoTX7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoTX7, arraySCKX);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jTXFIndiceDBPAX.setText(String.valueOf(indiceDB));
             
            }
         //////////////////////////////////////////////////////////////////////////////////////////////////
      //////////////////////////  tempo en y ///////////////////////////
             /////////////// Numero de Cumulos /////////////
      ArrayList<String> myListTempoYNC = new ArrayList<String>(Arrays.asList(arreglotempoYNCX.split(",")));
      ArrayList arrayTempoYNC1  = new ArrayList();
      arrayTempoYNC1  = myListTempoYNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListTempoYNI = new ArrayList<String>(Arrays.asList(arreglotempoYNIX.split(",")));
      ArrayList arrayTempoYNI1  = new ArrayList(); 
      arrayTempoYNI1  = myListTempoYNI;
     //////////////////
     ArrayList<String> myList3 = new ArrayList<String>(Arrays.asList(arregloprueba3X.split(",")));
     ArrayList arrayTempoYI  = new ArrayList();
     arrayTempoYI = myList3;
     /////////////////
     ArrayList<String> myList4 = new ArrayList<String>(Arrays.asList(arregloprueba4X.split(",")));
     ArrayList arrayTempoYC  = new ArrayList();
     arrayTempoYC = myList4;
     ////////////////
     ArrayList<String> myList5 = new ArrayList<String>(Arrays.asList(arregloprueba5X.split(",")));
     ArrayList arrayTempoYT  = new ArrayList();
     arrayTempoYT = myList5;
     ///////////////
     ArrayList calculoTY = new ArrayList();
     ArrayList calculoTY2 = new ArrayList();  
     ArrayList calculoTY3 = new ArrayList();    
     ArrayList calculoTY4 = new ArrayList();     
     ArrayList calculoTY5 = new ArrayList();
     ArrayList calculoTYprueba = new ArrayList();
     ArrayList calculoTYprueba2 = new ArrayList();
     double calculoTY6 = 0;
     ArrayList calculoTY7 = new ArrayList();
     ArrayList calculoTY8 = new ArrayList();
     double numClusterY = 0;
     double numElementosY = 0;
     double numClusterYPA = 0;
     double numElementosYPA = 0;
     
     ArrayList arraySCKY = new ArrayList();
           
                for (int i = 0; i < arrayTempoYNC1.size(); i++)
                {
                guiAFusionar.jTextNCNITYX.append((String) "Cluster "+ arrayTempoYNC1.get(i) +  (String) "Instancia "+ arrayTempoYNI1.get(i) + " \n");
                numElementosY = i;
                numElementosYPA = i;
                }
           
                for (int i = 0; i < arrayTempoYI.size(); i++)
                {
                guiAFusionar.jTextGCTYX.append((String) "Cluster ["+i+"]"+ arrayTempoYI.get(i)+ "-->" + "Centroide: " + (String) arrayTempoYC.get(i)+ " \n");
                }
    
                for (int i = 0; i < arrayTempoYT.size(); i++)
                {       
                guiAFusionar.jTextALTYX.append((String) "[Cluster "+i+"]"+ arrayTempoYT.get(i)+ " \n");
                }
              
      ////////// ASIGNACIONES A LANMAKR ////////////////
             String [] lanmark1 = arregloprueba5X.split(","); ////// Convertir string a String []
             calculoTY = cal.fusionTempo(lanmark1);
            for (int i = 0; i < calculoTY.size(); i++)
            {
                guiAFusionar.jTextFusionTYX.append((String)calculoTY.get(i)+ "\n");
             }
            ////////// FUSIÓN DE CLUSTER ////////////////
            calculoTY3 = cal.fusionTempoSI(lanmark1,arrayTempoYI,arrayTempoYC);
            arregloInstanciasTYX = cal.fusionTempoSI1(lanmark1, arrayTempoYI,arrayTempoYC);
            arregloInstanciasTY1X = cal.fusionTempoSI2(lanmark1, arrayTempoYI,arrayTempoYC);
            for (int i = 0; i < calculoTY3.size(); i++)
            {
                guiAFusionar.jTextFusionTYFIX.append((String)calculoTY3.get(i)+ "\n");
            }
            calculoTY2 = cal.fusionTempoPMC(lanmark1,arrayTempoYC);
            arregloPATYX = cal.fusionTempoPMC1(lanmark1,arrayTempoYC);
             arregloPATY1X = cal.fusionTempoPMC2(lanmark1,arrayTempoYC);
            for (int i = 0; i < calculoTY2.size(); i++)
            {
                guiAFusionar.jTextFusionTYFX.append((String)calculoTY2.get(i)+ "\n");
             }
            calculoTY4 = cal.fusionTempoPPC(lanmark1,arrayTempoYC,arrayTempoYI);
            arregloPPTYX = cal.fusionTempoPPC1(lanmark1,arrayTempoYC,arrayTempoYI);
            arregloPPTY1X = cal.fusionTempoPPC2(lanmark1,arrayTempoYC,arrayTempoYI);
            
            for (int i = 0; i < calculoTY4.size(); i++)   
            {
                guiAFusionar.jTextFusionTYFPPX.append((String)calculoTY4.get(i)+ "\n");
                numClusterY = i;
                numClusterYPA = i;
            }
            calculoTY5 = cal.fusionTempoInstancias(lanmark1,arrayTempoYNC1,arrayTempoYNI1);
            for (int i = 0; i < calculoTY5.size(); i++)
            {
                guiAFusionar.jTextFusionTYFNCIX.append((String)"Cluster "+i+" "+calculoTY5.get(i)+ "\n");
            }
            
             if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneraly  = 0;
            double sumady  = 0;
            double sumad1y  = 0;
            double indiceValidezy = 0;
            double indiceValidez1y = 0;
            double indiceValidezfinaly = 0;
            ////////// DENOMINADOR /////////
            calculoTYprueba = indCH.fusionTempoPPC(lanmark1,arrayTempoYC,arrayTempoYI);
            calculoTY6 = indCH.distanciaClusterFusionados(lanmark1,arrayTempoYNC1,arrayTempoYNI1);
            sumady = calculoTY6;
            System.out.println("Denominador " + sumady);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneraly = indCH.calculoCentroideGeneral(arrayTempoYNI1);
            System.out.println("Centroide Genral: " + cenGeneraly);
         
         calculoTY7 = cal.fusionTempoPPC1(lanmark1,arrayTempoYC,arrayTempoYI);
         calculoTY8 = cal.fusionTempoSI1(lanmark1,arrayTempoYI,arrayTempoYC);
         
        sumad1y = indCH.distanciaSeparacionCluster(calculoTY7,cenGeneraly,calculoTY8);
        System.out.println("Numerador " + sumad1y);
        numElementosY = numElementosY + 1;
        numClusterY = numClusterY + 1;
        System.out.println("Numero de elementos " + numElementosY);
        System.out.println("Numero de Cluster " + numClusterY);
          
        indiceValidezy = sumad1y / sumady;      
        indiceValidez1y = (numElementosY - numClusterY) / (numClusterY - 1) ;
        indiceValidezfinaly = indiceValidezy * indiceValidez1y;
        
        guiAFusionar.jTYFIndiceCHX.setText(String.valueOf(indiceValidezfinaly));
        
        
        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDBY  = 0;
                    double sumaMaxTotalY = 0;
                   double numClusterDBY = 0;
                   double indiceDBY = 0;
                    ArrayList sumamaxY = new ArrayList();
                    
            ////////// DENOMINADOR /////////
            calculoTYprueba2 = indDB.fusionTempoPPC(lanmark1,arrayTempoYC,arrayTempoYI);
            arraySCKY  = indDB.distanciaClusterFusionados(lanmark1,arrayTempoYNC1,arrayTempoYNI1);
            
             for (int i = 0; i < arraySCKY .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKY.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoTY7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamaxY = indDB.distanciaSeparacionCluster1(calculoTY7, arraySCKY);
             for (int i = 0; i < sumamaxY.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamaxY.get(i));
                 sumaMaxTotalY = sumaMaxTotalY + Double.parseDouble((String) sumamaxY.get(i));
                 numClusterDBY = numClusterDBY + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotalY);
             indiceDBY = (1/numClusterDBY) * sumaMaxTotalY;
             System.out.println("El indice Davies Bouldin es:  " + indiceDBY);
             guiAFusionar.jTYFIndiceDBX.setText(String.valueOf(indiceDBY));
            }
             
                      if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneraly  = 0;
            double sumady  = 0;
            double sumad1y  = 0;
            double indiceValidezy = 0;
            double indiceValidez1y = 0;
            double indiceValidezfinaly = 0;
            ////////// DENOMINADOR /////////
            calculoTYprueba = indCH.fusionTempoPMC(lanmark1,arrayTempoYC);
            calculoTY6 = indCH.distanciaClusterFusionados(lanmark1,arrayTempoYNC1,arrayTempoYNI1);
            sumady = calculoTY6;
            System.out.println("Denominador " + sumady);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneraly = indCH.calculoCentroideGeneral(arrayTempoYNI1);
            System.out.println("Centroide Genral: " + cenGeneraly);
         
         calculoTY7 = cal.fusionTempoPMC1(lanmark1,arrayTempoYC);
         calculoTY8 = cal.fusionTempoSI1(lanmark1,arrayTempoYI,arrayTempoYC);
         
        sumad1y = indCH.distanciaSeparacionCluster(calculoTY7,cenGeneraly,calculoTY8);
        System.out.println("Numerador " + sumad1y);
        numElementosYPA = numElementosYPA + 1;
        numClusterYPA = numClusterYPA + 1;
        System.out.println("Numero de elementos " + numElementosYPA);
        System.out.println("Numero de Cluster " + numClusterYPA);
          
        indiceValidezy = sumad1y / sumady;      
        indiceValidez1y = (numElementosYPA - numClusterYPA) / (numClusterYPA - 1) ;
        indiceValidezfinaly = indiceValidezy * indiceValidez1y;
        
        guiAFusionar.jTYFIndiceCHPAX.setText(String.valueOf(indiceValidezfinaly));
        
        
        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDBY  = 0;
                    double sumaMaxTotalY = 0;
                   double numClusterDBY = 0;
                   double indiceDBY = 0;
                    ArrayList sumamaxY = new ArrayList();
                    
            ////////// DENOMINADOR /////////
            calculoTYprueba2 = indDB.fusionTempoPMC(lanmark1,arrayTempoYC);
            arraySCKY  = indDB.distanciaClusterFusionados(lanmark1,arrayTempoYNC1,arrayTempoYNI1);
            
             for (int i = 0; i < arraySCKY .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKY.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoTY7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamaxY = indDB.distanciaSeparacionCluster1(calculoTY7, arraySCKY);
             for (int i = 0; i < sumamaxY.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamaxY.get(i));
                 sumaMaxTotalY = sumaMaxTotalY + Double.parseDouble((String) sumamaxY.get(i));
                 numClusterDBY = numClusterDBY + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotalY);
             indiceDBY = (1/numClusterDBY) * sumaMaxTotalY;
             System.out.println("El indice Davies Bouldin es:  " + indiceDBY);
             guiAFusionar.jTYFIndiceDBPAX.setText(String.valueOf(indiceDBY));
            }
                      
                      
                      /////////////////// Tempo en Z //////////////////
              ///////// Arreglo pruba lopasa a array /////
        
        /////////////// Numero de Cumulos /////////////
      ArrayList<String> myListTempoZNC = new ArrayList<String>(Arrays.asList(arreglotempoZNCX.split(",")));
      ArrayList arrayTempoZNC1  = new ArrayList();
      arrayTempoZNC1  = myListTempoZNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListTempoZNI = new ArrayList<String>(Arrays.asList(arreglotempoZNIX.split(",")));
      ArrayList arrayTempoZNI1  = new ArrayList(); 
      arrayTempoZNI1  = myListTempoZNI;
      
     ArrayList<String> myListintz = new ArrayList<String>(Arrays.asList(arregloprueba6X.split(",")));
     ArrayList arrayTempoZI  = new ArrayList();
     arrayTempoZI = myListintz;
     //////////////////////////
     ArrayList<String> myListcenz = new ArrayList<String>(Arrays.asList(arregloprueba7X.split(",")));
     ArrayList arrayTempoZC  = new ArrayList();  
     arrayTempoZC = myListcenz;
     //////////////////////
      ArrayList<String> myListrefz = new ArrayList<String>(Arrays.asList(arregloprueba8X.split(",")));
      ArrayList arrayTempoZT  = new ArrayList(); 
      arrayTempoZT = myListrefz;
     ////////////////////////// tempo en x ///////////
      ArrayList calculoTZ1 = new ArrayList();
      ArrayList calculoTZ2 = new ArrayList();
      ArrayList calculoTZ3 = new ArrayList();
      ArrayList calculoTZ4 = new ArrayList();
      
     ArrayList calculoTZ5 = new ArrayList();
     ArrayList calculoTZprueba = new ArrayList();
      ArrayList calculoTZprueba2 = new ArrayList();
     double calculoTZ6 = 0;
     ArrayList calculoTZ7 = new ArrayList();
     ArrayList calculoTZ8 = new ArrayList();
     double numClusterZ = 0;
     double numElementosZ = 0;
     double numClusterZPA = 0;
     double numElementosZPA = 0;
     
     ArrayList arraySCKZ = new ArrayList();
       
                 for (int i = 0; i < arrayTempoZNC1.size(); i++)
                {
                guiAFusionar.jTextNCNITZX.append((String) "Cluster "+ arrayTempoZNC1.get(i) +  (String) "Instancia "+ arrayTempoZNI1.get(i) + " \n");
                numElementosZ = i;
                numElementosZPA = i;
                }
                for (int i = 0; i < arrayTempoZI.size(); i++)
                {
                    guiAFusionar.jTextGCTZX.append((String) "Cluster ["+i+"]"+ arrayTempoZI.get(i)+ "-->" + "Centroide: " + (String) arrayTempoZC.get(i)+ " \n");
                }
                for (int i = 0; i < arrayTempoZT.size(); i++)
                {
                    guiAFusionar.jTextALTZX.append((String) "[Cluster "+i+"]"+ arrayTempoZT.get(i)+ " \n");
                }
     ////////// ASIGNACIONES A LANMAKR ////////////////
             String [] lanmark2 = arregloprueba8X.split(","); ////// Convertir string a String []
             calculoTZ1 = cal.fusionTempo(lanmark2);
                 for (int i = 0; i < calculoTZ1.size(); i++)
                {
                    guiAFusionar.jTextFusionTZX.append((String)calculoTZ1.get(i)+ "\n");
                } 
    ////////// FUSIÓN DE CLUSTER ////////////////
            calculoTZ3 = cal.fusionTempoSI(lanmark2,arrayTempoZI,arrayTempoZC);
            arregloInstanciasTZX = cal.fusionTempoSI1(lanmark2, arrayTempoZI,arrayTempoZC);
            arregloInstanciasTZ1X = cal.fusionTempoSI2(lanmark2, arrayTempoZI,arrayTempoZC);
            for (int i = 0; i < calculoTZ3.size(); i++)
            { 
                guiAFusionar.jTextFusionTZFIX.append((String)calculoTZ3.get(i)+ "\n");  
            }
            calculoTZ2 = cal.fusionTempoPMC(lanmark2,arrayTempoZC);
            arregloPATZX = cal.fusionTempoPMC1(lanmark2,arrayTempoZC);
            arregloPATZ1X = cal.fusionTempoPMC2(lanmark2,arrayTempoZC);
            
            for (int i = 0; i < calculoTZ2.size(); i++)
            {
                guiAFusionar.jTextFusionTZFX.append((String)calculoTZ2.get(i)+ "\n");  
            } 
            calculoTZ4 = cal.fusionTempoPPC(lanmark2,arrayTempoZC,arrayTempoZI);
            arregloPPTZX = cal.fusionTempoPPC1(lanmark2,arrayTempoZC,arrayTempoZI); //// Calculo promedio ponderado
            arregloPPTZ1X = cal.fusionTempoPPC2(lanmark2,arrayTempoZC,arrayTempoZI); //// Calculo promedio ponderado
            for (int i = 0; i < calculoTZ4.size(); i++)
            { 
            guiAFusionar.jTextFusionTZFPPX.append((String)calculoTZ4.get(i)+ "\n"); 
             numClusterZ = i;
              numClusterZPA = i;
            }
            calculoTZ5 = cal.fusionTempoInstancias(lanmark2,arrayTempoZNC1,arrayTempoZNI1);
            for (int i = 0; i < calculoTZ5.size(); i++)
            {
                guiAFusionar.jTextFusionTZFNCIX.append((String)"Cluster "+i+" "+calculoTZ5.get(i)+ "\n");
            }
            
             if (comboFusion == "Promedio Ponderado")
            {
                      ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneralz  = 0;
            double sumadz  = 0;
            double sumad1z  = 0;
            double indiceValidezz = 0;
            double indiceValidez1z = 0;
            double indiceValidezfinalz = 0;
            ////////// DENOMINADOR /////////
            calculoTZprueba = indCH.fusionTempoPPC(lanmark2,arrayTempoZC,arrayTempoZI);
            calculoTZ6 = indCH.distanciaClusterFusionados(lanmark2,arrayTempoZNC1,arrayTempoZNI1);
            sumadz = calculoTZ6;
            System.out.println("Denominador " + sumadz);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneralz = indCH.calculoCentroideGeneral(arrayTempoZNI1);
            System.out.println("Centroide Genral: " + cenGeneralz);
         
         calculoTZ7 = cal.fusionTempoPPC1(lanmark2,arrayTempoZC,arrayTempoZI);
         calculoTZ8 = cal.fusionTempoSI1(lanmark2,arrayTempoZI,arrayTempoZC);
         
        sumad1z = indCH.distanciaSeparacionCluster(calculoTZ7,cenGeneralz,calculoTZ8);
        System.out.println("Numerador " + sumad1z);
        numElementosZ = numElementosZ + 1;
        numClusterZ = numClusterZ + 1;
        System.out.println("Numero de elementos " + numElementosZ);
        System.out.println("Numero de Cluster " + numClusterZ);
          
        indiceValidezz = sumad1z / sumadz;      
        indiceValidez1z = (numElementosZ - numClusterZ) / (numClusterZ - 1) ;
        indiceValidezfinalz = indiceValidezz * indiceValidez1z;
        
        guiAFusionar.jTZFIndiceCHX.setText(String.valueOf(indiceValidezfinalz));
        
        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDBZ  = 0;
                    double sumaMaxTotalZ = 0;
                   double numClusterDBZ = 0;
                   double indiceDBZ = 0;
                    ArrayList sumamaxZ = new ArrayList();
                    
            ////////// DENOMINADOR /////////
            calculoTZprueba2 = indDB.fusionTempoPPC(lanmark2,arrayTempoZC,arrayTempoZI);
            arraySCKZ  = indDB.distanciaClusterFusionados(lanmark2,arrayTempoZNC1,arrayTempoZNI1);
            
             for (int i = 0; i < arraySCKZ .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKZ.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoTZ7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamaxZ = indDB.distanciaSeparacionCluster1(calculoTZ7, arraySCKZ);
             for (int i = 0; i < sumamaxZ.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamaxZ.get(i));
                 sumaMaxTotalZ = sumaMaxTotalZ + Double.parseDouble((String) sumamaxZ.get(i));
                 numClusterDBZ = numClusterDBZ + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotalZ);
             indiceDBZ = (1/numClusterDBZ) * sumaMaxTotalZ;
             System.out.println("El indice Davies Bouldin es:  " + indiceDBZ);
             guiAFusionar.jTZFIndiceDBX.setText(String.valueOf(indiceDBZ));
            }
             
                    if (comboFusion == "Promedio Ponderado")
            {
                      ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneralz  = 0;
            double sumadz  = 0;
            double sumad1z  = 0;
            double indiceValidezz = 0;
            double indiceValidez1z = 0;
            double indiceValidezfinalz = 0;
            ////////// DENOMINADOR /////////
            calculoTZprueba = indCH.fusionTempoPMC(lanmark2,arrayTempoZC);
            calculoTZ6 = indCH.distanciaClusterFusionados(lanmark2,arrayTempoZNC1,arrayTempoZNI1);
            sumadz = calculoTZ6;
            System.out.println("Denominador " + sumadz);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneralz = indCH.calculoCentroideGeneral(arrayTempoZNI1);
            System.out.println("Centroide Genral: " + cenGeneralz);
         
         calculoTZ7 = cal.fusionTempoPMC1(lanmark2,arrayTempoZC);
         calculoTZ8 = cal.fusionTempoSI1(lanmark2,arrayTempoZI,arrayTempoZC);
         
        sumad1z = indCH.distanciaSeparacionCluster(calculoTZ7,cenGeneralz,calculoTZ8);
        System.out.println("Numerador " + sumad1z);
        numElementosZPA = numElementosZPA + 1;
        numClusterZPA = numClusterZPA + 1;
        System.out.println("Numero de elementos " + numElementosZPA);
        System.out.println("Numero de Cluster " + numClusterZPA);
          
        indiceValidezz = sumad1z / sumadz;      
        indiceValidez1z = (numElementosZPA - numClusterZPA) / (numClusterZPA - 1) ;
        indiceValidezfinalz = indiceValidezz * indiceValidez1z;
        
        guiAFusionar.jTZFIndiceCHPAX.setText(String.valueOf(indiceValidezfinalz));
        
        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDBZ  = 0;
                    double sumaMaxTotalZ = 0;
                   double numClusterDBZ = 0;
                   double indiceDBZ = 0;
                    ArrayList sumamaxZ = new ArrayList();
                    
            ////////// DENOMINADOR /////////
            calculoTZprueba2 = indDB.fusionTempoPMC(lanmark2,arrayTempoZC);
            arraySCKZ  = indDB.distanciaClusterFusionados(lanmark2,arrayTempoZNC1,arrayTempoZNI1);
            
             for (int i = 0; i < arraySCKZ .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKZ.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoTZ7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamaxZ = indDB.distanciaSeparacionCluster1(calculoTZ7, arraySCKZ);
             for (int i = 0; i < sumamaxZ.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamaxZ.get(i));
                 sumaMaxTotalZ = sumaMaxTotalZ + Double.parseDouble((String) sumamaxZ.get(i));
                 numClusterDBZ = numClusterDBZ + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotalZ);
             indiceDBZ = (1/numClusterDBZ) * sumaMaxTotalZ;
             System.out.println("El indice Davies Bouldin es:  " + indiceDBZ);
             guiAFusionar.jTZFIndiceDBPAX.setText(String.valueOf(indiceDBZ));
            }
                    //////////////////////////////////////////////////////////////////
                    
       ////////////////////////// DURACION //////////////////////////////
                 ////// Duracion en X ///////////////   
         /////////////// Numero de Cumulos /////////////
     ArrayList<String> myListDuracionXNC = new ArrayList<String>(Arrays.asList(arregloduracionXNCX.split(",")));
      ArrayList arrayDuracionXNC1  = new ArrayList();
      arrayDuracionXNC1  = myListDuracionXNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListDuracionXNI = new ArrayList<String>(Arrays.asList(arregloduracionXNIX.split(",")));
      ArrayList arrayDuracionXNI1  = new ArrayList(); 
      arrayDuracionXNI1  = myListDuracionXNI;
      ///////// Arreglo pruba lopasa a array /////
      ArrayList<String> myListD = new ArrayList<String>(Arrays.asList(arreglopruebaDX.split(",")));
      ArrayList arrayDuracionXI  = new ArrayList();
      arrayDuracionXI = myListD;
     //////////////////////////
      ArrayList<String> myList1D = new ArrayList<String>(Arrays.asList(arregloprueba1DX.split(",")));
      ArrayList arrayDuracionXC  = new ArrayList(); 
      arrayDuracionXC = myList1D;
     //////////////////////
      ArrayList<String> myList2D = new ArrayList<String>(Arrays.asList(arregloprueba2DX.split(",")));
      ArrayList arrayDuracionXT  = new ArrayList(); 
      arrayDuracionXT = myList2D;
     ////////////////////////// tempo en x ///////////
       ArrayList calculoDX1 = new ArrayList(); ///// Asiganción a la lanmark segun refrencia
       ArrayList calculoDX2 = new ArrayList(); //// Promedio Aritmetico Centroide
       ArrayList calculoDX3 = new ArrayList();
       ArrayList calculoDX4 = new ArrayList();
       ArrayList calculoDX5 = new ArrayList();
       ArrayList calculoDXprueba = new ArrayList();
       ArrayList calculoDXprueba2 = new ArrayList();
       double calculoDX6 = 0;
      
       ArrayList calculoDX7 = new ArrayList();
       ArrayList calculoDX8 = new ArrayList();
       double numClusterD = 0;
       double numElementosD = 0;
       double numClusterPAD = 0;
       double numElementosPAD = 0;
       ArrayList arraySCKXD = new ArrayList();

       
       System.out.println("///////////////////////////////////////////////////////////" + comboFusion );
       
            for (int i = 0; i < arrayDuracionXNC1.size(); i++)
                {
                guiAFusionar.jTextNCNIDXX.append((String) "Cluster "+ arrayDuracionXNC1.get(i) +  (String) "Instancia "+ arrayDuracionXNI1.get(i) + " \n");
                numElementosD = i;
                numElementosPAD = i;
                } 
            for (int i = 0; i < arrayDuracionXI.size(); i++)
                {
                guiAFusionar.jTextGCDXX.append((String) "Cluster ["+i+"]"+arrayDuracionXI.get(i)+" Instancias"+ "-->" + "Centroide: " + (String) arrayDuracionXC.get(i)+ " \n");
                }
            
            for (int i = 0; i < arrayDuracionXT.size(); i++)
                {
                guiAFusionar.jTextALDXX.append((String) "[Cluster "+i+"]"+ arrayDuracionXT.get(i)+ " \n");
                }
         
                                   
 ////////// ASIGNACIONES A LANMAKR ////////////////
            String [] lanmarkD = arregloprueba2DX.split(","); ////// Convertir string a String []
            
            calculoDX1 = cal1.fusionDuracion(lanmarkD);
            for (int i = 0; i < calculoDX1.size(); i++)
            {     
                guiAFusionar.jTextFusionDXX.append((String)calculoDX1.get(i)+ "\n");
            }  
            
            
           
////////// FUSIÓN DE CLUSTER ////////////////
             calculoDX2 = cal1.fusionDuracionPMC(lanmarkD,arrayDuracionXC); // Promedio Aritmetico
             arregloPADXX = cal1.fusionDuracionPMC1(lanmarkD,arrayDuracionXC);
             arregloPADX1X = cal1.fusionDuracionPMC2(lanmarkD,arrayDuracionXC);
             
            for (int i = 0; i < calculoDX2.size(); i++)
            {
                guiAFusionar.jTextFusionDXFX.append((String)calculoDX2.get(i)+ "\n");
            }
            
            
            calculoDX3 = cal1.fusionDuracionSI(lanmarkD,arrayDuracionXI,arrayDuracionXC);
            arregloInstanciasDXX = cal1.fusionDuracionSI1(lanmarkD, arrayDuracionXI,arrayDuracionXC);
            arregloInstanciasDX1X = cal1.fusionDuracionSI2(lanmarkD, arrayDuracionXI,arrayDuracionXC);
   
            
            for (int i = 0; i < calculoDX3.size(); i++)
            {  
                guiAFusionar.jTextFusionDXFIX.append((String)calculoDX3.get(i)+ "\n");
            }    
            calculoDX4 = cal1.fusionDuracionPPC(lanmarkD,arrayDuracionXC,arrayDuracionXI);
            arregloPPDXX = cal1.fusionDuracionPPC1(lanmarkD,arrayDuracionXC,arrayDuracionXI);
            arregloPPDX1X = cal1.fusionDuracionPPC2(lanmarkD,arrayDuracionXC,arrayDuracionXI);
            
            
            for (int i = 0; i < calculoDX4.size(); i++)
            {
                guiAFusionar.jTextFusionDXFPPX.append((String)calculoDX4.get(i)+ "\n");
                numClusterD = i;
                numClusterPAD = i;
            }
            
           calculoDX5 = cal1.fusionDuracionInstancias(lanmarkD,arrayDuracionXNC1,arrayDuracionXNI1);
            for (int i = 0; i < calculoDX5.size(); i++)
            {
                guiAFusionar.jTextFusionDXFNCIX.append((String)"Cluster "+i+" "+calculoDX5.get(i)+ "\n");
            }
             
            if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDXprueba = indCH.fusionDuracionPPC(lanmarkD,arrayDuracionXC,arrayDuracionXI);
            calculoDX6 = indCH.distanciaClusterFusionadosDuracion(lanmarkD,arrayDuracionXNC1,arrayDuracionXNI1);
            sumad = calculoDX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoDX7 = cal1.fusionDuracionPPC1(lanmarkD,arrayDuracionXC,arrayDuracionXI);
         calculoDX8 = cal1.fusionDuracionSI1(lanmarkD,arrayDuracionXI,arrayDuracionXC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoDX7,cenGeneral,calculoDX8);
        System.out.println("Numerador " + sumad1);
        numElementosD = numElementosD + 1;
        numClusterD = numClusterD + 1;
        System.out.println("Numero de elementos " + numElementosD);
        System.out.println("Numero de Cluster " + numClusterD);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosD - numClusterD) / (numClusterD - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jDXFIndiceCHX.setText(String.valueOf(indiceValidezfinal)); 
        
            
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
            double sumadDB  = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDXprueba2 = indDB.fusionDuracionPPC(lanmarkD,arrayDuracionXC,arrayDuracionXI);
            arraySCKXD  = indDB.distanciaClusterFusionadosDuracion(lanmarkD,arrayDuracionXNC1,arrayDuracionXNI1);
            
             for (int i = 0; i < arraySCKXD .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXD.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoDX7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoDX7, arraySCKXD);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jDXFIndiceDBX.setText(String.valueOf(indiceDB));
             
           }
            
            
                    if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
                System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");
                
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDXprueba = indCH.fusionDuracionPMC(lanmarkD,arrayDuracionXC);
            calculoDX6 = indCH.distanciaClusterFusionadosDuracion(lanmarkD,arrayDuracionXNC1,arrayDuracionXNI1);
            sumad = calculoDX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoDX7 = cal1.fusionDuracionPMC1(lanmarkD,arrayDuracionXC);
         calculoDX8 = cal1.fusionDuracionSI1(lanmarkD,arrayDuracionXI,arrayDuracionXC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoDX7,cenGeneral,calculoDX8);
        System.out.println("Numerador " + sumad1);
        numElementosPAD = numElementosPAD + 1;
        numClusterPAD = numClusterPAD + 1;
        System.out.println("Numero de elementos " + numElementosPAD);
        System.out.println("Numero de Cluster " + numClusterPAD);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosPAD - numClusterPAD) / (numClusterPAD - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jDXFIndiceCHPAX.setText(String.valueOf(indiceValidezfinal)); 
        
         System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDXprueba2 = indDB.fusionDuracionPMC(lanmarkD,arrayDuracionXC);
            arraySCKXD  = indDB.distanciaClusterFusionadosDuracion(lanmarkD,arrayDuracionXNC1,arrayDuracionXNI1);
            
             for (int i = 0; i < arraySCKXD.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXD.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoDX7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoDX7, arraySCKXD);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jDXFIndiceDBPAX.setText(String.valueOf(indiceDB));
             
            }
         //////////////////////////////////////////////////////////////////////////////////////////////////        
      
                     ////// Duracion en Y ///////////////   
         /////////////// Numero de Cumulos /////////////
     ArrayList<String> myListDuracionYNC = new ArrayList<String>(Arrays.asList(arregloduracionYNCX.split(",")));
      ArrayList arrayDuracionYNC1  = new ArrayList();
      arrayDuracionYNC1  = myListDuracionYNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListDuracionYNI = new ArrayList<String>(Arrays.asList(arregloduracionYNIX.split(",")));
      ArrayList arrayDuracionYNI1  = new ArrayList(); 
      arrayDuracionYNI1  = myListDuracionYNI;
      ///////// Arreglo pruba lopasa a array /////
      ArrayList<String> myListDY = new ArrayList<String>(Arrays.asList(arregloprueba3DX.split(",")));
      ArrayList arrayDuracionYI  = new ArrayList();
      arrayDuracionYI = myListDY;
     //////////////////////////
      ArrayList<String> myList1DY = new ArrayList<String>(Arrays.asList(arregloprueba4DX.split(",")));
      ArrayList arrayDuracionYC  = new ArrayList(); 
      arrayDuracionYC = myList1DY;
     //////////////////////
      ArrayList<String> myList2DY = new ArrayList<String>(Arrays.asList(arregloprueba5DX.split(",")));
      ArrayList arrayDuracionYT  = new ArrayList(); 
      arrayDuracionYT = myList2DY;
     ////////////////////////// tempo en x ///////////
       ArrayList calculoDY1 = new ArrayList(); ///// Asiganción a la lanmark segun refrencia
       ArrayList calculoDY2 = new ArrayList(); //// Promedio Aritmetico Centroide
       ArrayList calculoDY3 = new ArrayList();
       ArrayList calculoDY4 = new ArrayList();
       ArrayList calculoDY5 = new ArrayList();
       ArrayList calculoDYprueba = new ArrayList();
       ArrayList calculoDYprueba2 = new ArrayList();
       double calculoDY6 = 0;
      
       ArrayList calculoDY7 = new ArrayList();
       ArrayList calculoDY8 = new ArrayList();
       double numClusterDY = 0;
       double numElementosDY = 0;
       double numClusterPADY = 0;
       double numElementosPADY = 0;
       ArrayList arraySCKXDY = new ArrayList();

       
       System.out.println("///////////////////////////////////////////////////////////" + comboFusion );
       
            for (int i = 0; i < arrayDuracionYNC1.size(); i++)
                {
                guiAFusionar.jTextNCNIDYX.append((String) "Cluster "+ arrayDuracionYNC1.get(i) +  (String) "Instancia "+ arrayDuracionYNI1.get(i) + " \n");
                numElementosDY = i;
                numElementosPADY = i;
                } 
            for (int i = 0; i < arrayDuracionYI.size(); i++)
                {
                guiAFusionar.jTextGCDYX.append((String) "Cluster ["+i+"]"+arrayDuracionYI.get(i)+" Instancias"+ "-->" + "Centroide: " + (String) arrayDuracionYC.get(i)+ " \n");
                }
            
            for (int i = 0; i < arrayDuracionYT.size(); i++)
                {
                guiAFusionar.jTextALDYX.append((String) "[Cluster "+i+"]"+ arrayDuracionYT.get(i)+ " \n");
                }
            
             ////////// ASIGNACIONES A LANMAKR ////////////////
            String [] lanmarkDY = arregloprueba5DX.split(","); ////// Convertir string a String []
            
            calculoDY1 = cal1.fusionDuracion(lanmarkDY);
            for (int i = 0; i < calculoDY1.size(); i++)
            {     
                guiAFusionar.jTextFusionDYX.append((String)calculoDY1.get(i)+ "\n");
            }  
            
            ////////// FUSIÓN DE CLUSTER ////////////////
             calculoDY2 = cal1.fusionDuracionPMC(lanmarkDY,arrayDuracionYC); // Promedio Aritmetico
             arregloPADYX = cal1.fusionDuracionPMC1(lanmarkDY,arrayDuracionYC);
             arregloPADY1X = cal1.fusionDuracionPMC2(lanmarkDY,arrayDuracionYC);
            for (int i = 0; i < calculoDY2.size(); i++)
            {
                guiAFusionar.jTextFusionDYFX.append((String)calculoDY2.get(i)+ "\n");
            }
            
            
            calculoDY3 = cal1.fusionDuracionSI(lanmarkDY,arrayDuracionYI,arrayDuracionYC);
            arregloInstanciasDYX = cal1.fusionDuracionSI1(lanmarkDY, arrayDuracionYI,arrayDuracionYC);
            arregloInstanciasDY1X = cal1.fusionDuracionSI2(lanmarkDY, arrayDuracionYI,arrayDuracionYC);
   
            
            for (int i = 0; i < calculoDY3.size(); i++)
            {  
                guiAFusionar.jTextFusionDYFIX.append((String)calculoDY3.get(i)+ "\n");
            }    
            calculoDY4 = cal1.fusionDuracionPPC(lanmarkDY,arrayDuracionYC,arrayDuracionYI);
            arregloPPDYX = cal1.fusionDuracionPPC1(lanmarkDY,arrayDuracionYC,arrayDuracionYI);
            arregloPPDY1X = cal1.fusionDuracionPPC2(lanmarkDY,arrayDuracionYC,arrayDuracionYI);
            
            
            
            for (int i = 0; i < calculoDY4.size(); i++)
            {
                guiAFusionar.jTextFusionDYFPPX.append((String)calculoDY4.get(i)+ "\n");
                numClusterDY = i;
                numClusterPADY = i;
            }
            
              calculoDY5 = cal1.fusionDuracionInstancias(lanmarkDY,arrayDuracionYNC1,arrayDuracionYNI1);
            for (int i = 0; i < calculoDY5.size(); i++)
            {
                guiAFusionar.jTextFusionDYFNCIX.append((String)"Cluster "+i+" "+calculoDY5.get(i)+ "\n");
            }
            
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDYprueba = indCH.fusionDuracionPPC(lanmarkDY,arrayDuracionYC,arrayDuracionYI);
            calculoDY6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDY,arrayDuracionYNC1,arrayDuracionYNI1);
            sumad = calculoDY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoDY7 = cal1.fusionDuracionPPC1(lanmarkDY,arrayDuracionYC,arrayDuracionYI);
         calculoDY8 = cal1.fusionDuracionSI1(lanmarkDY,arrayDuracionYI,arrayDuracionYC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoDY7,cenGeneral,calculoDY8);
        System.out.println("Numerador " + sumad1);
        numElementosDY = numElementosDY + 1;
        numClusterDY = numClusterDY + 1;
        System.out.println("Numero de elementos " + numElementosDY);
        System.out.println("Numero de Cluster " + numClusterDY);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosDY - numClusterDY) / (numClusterDY - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jDYFIndiceCHX.setText(String.valueOf(indiceValidezfinal)); 
        
            
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
            double sumadDB  = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDYprueba2 = indDB.fusionDuracionPPC(lanmarkDY,arrayDuracionYC,arrayDuracionYI);
            arraySCKXDY  = indDB.distanciaClusterFusionadosDuracion(lanmarkDY,arrayDuracionYNC1,arrayDuracionYNI1);
            
             for (int i = 0; i < arraySCKXDY .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXDY.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoDY7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoDY7, arraySCKXDY);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jDYFIndiceDBX.setText(String.valueOf(indiceDB));
             
           }
            
            
             if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
                System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");
                
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDYprueba = indCH.fusionDuracionPMC(lanmarkDY,arrayDuracionYC);
            calculoDY6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDY,arrayDuracionYNC1,arrayDuracionYNI1);
            sumad = calculoDY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoDY7 = cal1.fusionDuracionPMC1(lanmarkDY,arrayDuracionYC);
         calculoDY8 = cal1.fusionDuracionSI1(lanmarkDY,arrayDuracionYI,arrayDuracionYC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoDY7,cenGeneral,calculoDY8);
        System.out.println("Numerador " + sumad1);
        numElementosPADY = numElementosPADY + 1;
        numClusterPADY = numClusterPADY + 1;
        System.out.println("Numero de elementos " + numElementosPADY);
        System.out.println("Numero de Cluster " + numClusterPADY);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosPADY - numClusterPADY) / (numClusterPADY - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jDYFIndiceCHPAX.setText(String.valueOf(indiceValidezfinal)); 
        
      
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDYprueba2 = indDB.fusionDuracionPMC(lanmarkDY,arrayDuracionYC);
            arraySCKXDY = indDB.distanciaClusterFusionadosDuracion(lanmarkDY,arrayDuracionYNC1,arrayDuracionYNI1);
            
             for (int i = 0; i < arraySCKXDY.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXDY.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoDY7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoDY7, arraySCKXDY);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jDYFIndiceDBPAX.setText(String.valueOf(indiceDB));
             
            }
         //////////////////////////////////////////////////////////////////////////////////////////////////        

       ////// Duracion en Z ///////////////   
         /////////////// Numero de Cumulos /////////////
     ArrayList<String> myListDuracionZNC = new ArrayList<String>(Arrays.asList(arregloduracionZNCX.split(",")));
      ArrayList arrayDuracionZNC1  = new ArrayList();
      arrayDuracionZNC1  = myListDuracionZNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListDuracionZNI = new ArrayList<String>(Arrays.asList(arregloduracionZNIX.split(",")));
      ArrayList arrayDuracionZNI1  = new ArrayList(); 
      arrayDuracionZNI1  = myListDuracionZNI;
      ///////// Arreglo pruba lopasa a array /////
      ArrayList<String> myListDZ = new ArrayList<String>(Arrays.asList(arregloprueba6DX.split(",")));
      ArrayList arrayDuracionZI  = new ArrayList();
      arrayDuracionZI = myListDZ;
     //////////////////////////
      ArrayList<String> myList1DZ = new ArrayList<String>(Arrays.asList(arregloprueba7DX.split(",")));
      ArrayList arrayDuracionZC  = new ArrayList(); 
      arrayDuracionZC = myList1DZ;
     //////////////////////
      ArrayList<String> myList2DZ = new ArrayList<String>(Arrays.asList(arregloprueba8DX.split(",")));
      ArrayList arrayDuracionZT  = new ArrayList(); 
      arrayDuracionZT = myList2DZ;
     ////////////////////////// tempo en x ///////////
       ArrayList calculoDZ1 = new ArrayList(); ///// Asiganción a la lanmark segun refrencia
       ArrayList calculoDZ2 = new ArrayList(); //// Promedio Aritmetico Centroide
       ArrayList calculoDZ3 = new ArrayList();
       ArrayList calculoDZ4 = new ArrayList();
       ArrayList calculoDZ5 = new ArrayList();
       ArrayList calculoDZprueba = new ArrayList();
       ArrayList calculoDZprueba2 = new ArrayList();
       double calculoDZ6 = 0;
      
       ArrayList calculoDZ7 = new ArrayList();
       ArrayList calculoDZ8 = new ArrayList();
       double numClusterDZ = 0;
       double numElementosDZ = 0;
       double numClusterPADZ = 0;
       double numElementosPADZ = 0;
       ArrayList arraySCKXDZ = new ArrayList();

       
       System.out.println("///////////////////////////////////////////////////////////" + comboFusion );
       
            for (int i = 0; i < arrayDuracionZNC1.size(); i++)
                {
                guiAFusionar.jTextNCNIDZX.append((String) "Cluster "+ arrayDuracionZNC1.get(i) +  (String) "Instancia "+ arrayDuracionZNI1.get(i) + " \n");
                numElementosDZ = i;
                numElementosPADZ = i;
                } 
            for (int i = 0; i < arrayDuracionZI.size(); i++)
                {
                guiAFusionar.jTextGCDZX.append((String) "Cluster ["+i+"]"+arrayDuracionZI.get(i)+" Instancias"+ "-->" + "Centroide: " + (String) arrayDuracionZC.get(i)+ " \n");
                }
            
            for (int i = 0; i < arrayDuracionZT.size(); i++)
                {
                guiAFusionar.jTextALDZX.append((String) "[Cluster "+i+"]"+ arrayDuracionZT.get(i)+ " \n");
                }
            
               ////////// ASIGNACIONES A LANMAKR ////////////////
            String [] lanmarkDZ = arregloprueba8DX.split(","); ////// Convertir string a String []
            
            calculoDZ1 = cal1.fusionDuracion(lanmarkDZ);
            for (int i = 0; i < calculoDZ1.size(); i++)
            {     
                guiAFusionar.jTextFusionDZX.append((String)calculoDZ1.get(i)+ "\n");
            } 
            
             ////////// FUSIÓN DE CLUSTER ////////////////
             calculoDZ2 = cal1.fusionDuracionPMC(lanmarkDZ,arrayDuracionZC); // Promedio Aritmetico
             arregloPADZX = cal1.fusionDuracionPMC1(lanmarkDZ,arrayDuracionZC);
              arregloPADZ1X = cal1.fusionDuracionPMC2(lanmarkDZ,arrayDuracionZC);
            for (int i = 0; i < calculoDZ2.size(); i++)
            {
                guiAFusionar.jTextFusionDZFX.append((String)calculoDZ2.get(i)+ "\n");
            }
            
            
            calculoDZ3 = cal1.fusionDuracionSI(lanmarkDZ,arrayDuracionZI,arrayDuracionZC);
            arregloInstanciasDZX = cal1.fusionDuracionSI1(lanmarkDZ, arrayDuracionZI,arrayDuracionZC);
             arregloInstanciasDZ1X = cal1.fusionDuracionSI2(lanmarkDZ, arrayDuracionZI,arrayDuracionZC);
   
            
            for (int i = 0; i < calculoDZ3.size(); i++)
            {  
                guiAFusionar.jTextFusionDZFIX.append((String)calculoDZ3.get(i)+ "\n");
            }    
            calculoDZ4 = cal1.fusionDuracionPPC(lanmarkDZ,arrayDuracionZC,arrayDuracionZI);
            arregloPPDZX = cal1.fusionDuracionPPC1(lanmarkDZ,arrayDuracionZC,arrayDuracionZI);
            arregloPPDZ1X = cal1.fusionDuracionPPC2(lanmarkDZ,arrayDuracionZC,arrayDuracionZI);
            
            
            for (int i = 0; i < calculoDZ4.size(); i++)
            {
                guiAFusionar.jTextFusionDZFPPX.append((String)calculoDZ4.get(i)+ "\n");
                numClusterDZ = i;
                numClusterPADZ = i;
            }
            
             calculoDZ5 = cal1.fusionDuracionInstancias(lanmarkDZ,arrayDuracionZNC1,arrayDuracionZNI1);
            for (int i = 0; i < calculoDZ5.size(); i++)
            {
                guiAFusionar.jTextFusionDZFNCIX.append((String)"Cluster "+i+" "+calculoDZ5.get(i)+ "\n");
            }
            
            
            if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDZprueba = indCH.fusionDuracionPPC(lanmarkDZ,arrayDuracionZC,arrayDuracionZI);
            calculoDZ6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDZ,arrayDuracionZNC1,arrayDuracionZNI1);
            sumad = calculoDZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoDZ7 = cal1.fusionDuracionPPC1(lanmarkDZ,arrayDuracionZC,arrayDuracionZI);
         calculoDZ8 = cal1.fusionDuracionSI1(lanmarkDZ,arrayDuracionZI,arrayDuracionZC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoDZ7,cenGeneral,calculoDZ8);
        System.out.println("Numerador " + sumad1);
        numElementosDZ = numElementosDZ + 1;
        numClusterDZ = numClusterDZ + 1;
        System.out.println("Numero de elementos " + numElementosDZ);
        System.out.println("Numero de Cluster " + numClusterDZ);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosDZ - numClusterDZ) / (numClusterDZ - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jDZFIndiceCHX.setText(String.valueOf(indiceValidezfinal)); 
        
            
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
            double sumadDB  = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDZprueba2 = indDB.fusionDuracionPPC(lanmarkDZ,arrayDuracionZC,arrayDuracionZI);
            arraySCKXDZ  = indDB.distanciaClusterFusionadosDuracion(lanmarkDZ,arrayDuracionZNC1,arrayDuracionZNI1);
            
             for (int i = 0; i < arraySCKXDZ .size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXDZ.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoDZ7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoDZ7, arraySCKXDZ);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jDZFIndiceDBX.setText(String.valueOf(indiceDB));
             
           }
            
            
            if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
                System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");
                
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDZprueba = indCH.fusionDuracionPMC(lanmarkDZ,arrayDuracionZC);
            calculoDZ6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDZ,arrayDuracionZNC1,arrayDuracionZNI1);
            sumad = calculoDZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoDZ7 = cal1.fusionDuracionPMC1(lanmarkDZ,arrayDuracionZC);
         calculoDZ8 = cal1.fusionDuracionSI1(lanmarkDZ,arrayDuracionZI,arrayDuracionZC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoDZ7,cenGeneral,calculoDZ8);
        System.out.println("Numerador " + sumad1);
        numElementosPADZ = numElementosPADZ + 1;
        numClusterPADZ = numClusterPADZ + 1;
        System.out.println("Numero de elementos " + numElementosPADZ);
        System.out.println("Numero de Cluster " + numClusterPADZ);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosPADZ - numClusterPADZ) / (numClusterPADZ - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jDZFIndiceCHPAX.setText(String.valueOf(indiceValidezfinal)); 
        
         System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                   double sumadDB  = 0;
                   double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                   ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDZprueba2 = indDB.fusionDuracionPMC(lanmarkDZ,arrayDuracionZC);
            arraySCKXDZ = indDB.distanciaClusterFusionadosDuracion(lanmarkDZ,arrayDuracionZNC1,arrayDuracionZNI1);
            
             for (int i = 0; i < arraySCKXDZ.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXDZ.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoDZ7);
             
             
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoDZ7, arraySCKXDZ);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jDZFIndiceDBPAX.setText(String.valueOf(indiceDB));
             
            }
         //////////////////////////////////////////////////////////////////////////////////////////////////        
   ////////////// OCTAVA ////////////
        
      System.out.println("////////////////////////// OCTAVA EN X MEANS/////////////////////////////////" );       
                     ////// OCTAVA en X ///////////////   
         /////////////// Numero de Cumulos /////////////
     ArrayList<String> myListOctavaXNC = new ArrayList<String>(Arrays.asList(arreglooctavaXNCX.split(",")));
      ArrayList arrayOctavaXNC1  = new ArrayList();
      arrayOctavaXNC1  = myListOctavaXNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListOctavaXNI = new ArrayList<String>(Arrays.asList(arreglooctavaXNIX.split(",")));
      ArrayList arrayOctavaXNI1  = new ArrayList(); 
      arrayOctavaXNI1  = myListOctavaXNI;
      ///////// Arreglo pruba lopasa a array /////
      ArrayList<String> myListO = new ArrayList<String>(Arrays.asList(arreglopruebaOX.split(",")));
      ArrayList arrayOctavaXI  = new ArrayList();
      arrayOctavaXI = myListO;
     //////////////////////////
      ArrayList<String> myList1O = new ArrayList<String>(Arrays.asList(arregloprueba1OX.split(",")));
      ArrayList arrayOctavaXC  = new ArrayList(); 
      arrayOctavaXC = myList1O;
     //////////////////////
      ArrayList<String> myList2O = new ArrayList<String>(Arrays.asList(arregloprueba2OX.split(",")));
      ArrayList arrayOctavaXT  = new ArrayList(); 
      arrayOctavaXT = myList2O;
     ////////////////////////// tempo en x ///////////
       ArrayList calculoOX1 = new ArrayList(); ///// Asiganción a la lanmark segun refrencia
       ArrayList calculoOX2 = new ArrayList(); //// Promedio Aritmetico Centroide
       ArrayList calculoOX3 = new ArrayList();
       ArrayList calculoOX4 = new ArrayList();
       ArrayList calculoOX5 = new ArrayList();
       ArrayList calculoOXprueba = new ArrayList();
       ArrayList calculoOXprueba2 = new ArrayList();
       double calculoOX6 = 0;
      
       ArrayList calculoOX7 = new ArrayList();
       ArrayList calculoOX8 = new ArrayList();
       double numClusterO = 0;
       double numElementosO = 0;
       double numClusterPAO = 0;
       double numElementosPAO = 0;
       ArrayList arraySCKXO = new ArrayList();

       
       System.out.println("///////////////////////////////////////////////////////////" + comboFusion );
       
            for (int i = 0; i < arrayOctavaXNC1.size(); i++)
                {
                guiAFusionar.jTextNCNIOXX.append((String) "Cluster "+ arrayOctavaXNC1.get(i) +  (String) "Instancia "+ arrayOctavaXNI1.get(i) + " \n");
                numElementosO = i;
                numElementosPAO = i;
                } 
            for (int i = 0; i < arrayOctavaXI.size(); i++)
                {
                guiAFusionar.jTextGCOXX.append((String) "Cluster ["+i+"]"+arrayOctavaXI.get(i)+" Instancias"+ "-->" + "Centroide: " + (String) arrayOctavaXC.get(i)+ " \n");
                }
            
            for (int i = 0; i < arrayOctavaXT.size(); i++)
                {
                guiAFusionar.jTextALOXX.append((String) "[Cluster "+i+"]"+ arrayOctavaXT.get(i)+ " \n");
                }
         
                                   
 ////////// ASIGNACIONES A LANMAKR ////////////////
            String [] lanmarkO = arregloprueba2OX.split(","); ////// Convertir string a String []
    /////////////////
          
            calculoOX1 = cal2.fusionOctava(lanmarkO);
            for (int i = 0; i < calculoOX1.size(); i++)
            {     
                guiAFusionar.jTextFusionOXX.append((String)calculoOX1.get(i)+ "\n");
            }  
            
            
           
////////// FUSIÓN DE CLUSTER ////////////////
             calculoOX2 = cal2.fusionOctavaPMC(lanmarkO,arrayOctavaXC); // Promedio Aritmetico
             arregloPAOXX = cal2.fusionOctavaPMC1(lanmarkO,arrayOctavaXC);
              arregloPAOX1X = cal2.fusionOctavaPMC2(lanmarkO,arrayOctavaXC);
            for (int i = 0; i < calculoOX2.size(); i++)
            {
                guiAFusionar.jTextFusionOXFX.append((String)calculoOX2.get(i)+ "\n");
            }
            
            
            calculoOX3 = cal2.fusionOctavaSI(lanmarkO,arrayOctavaXI,arrayOctavaXC);
            arregloInstanciasOXX = cal2.fusionOctavaSI1(lanmarkO, arrayOctavaXI,arrayOctavaXC);
             arregloInstanciasOX1X = cal2.fusionOctavaSI2(lanmarkO, arrayOctavaXI,arrayOctavaXC);
   
            
            for (int i = 0; i < calculoOX3.size(); i++)
            {  
                guiAFusionar.jTextFusionOXFIX.append((String)calculoOX3.get(i)+ "\n");
            }    
            calculoOX4 = cal2.fusionOctavaPPC(lanmarkO,arrayOctavaXC,arrayOctavaXI);
            arregloPPOXX = cal2.fusionOctavaPPC1(lanmarkO,arrayOctavaXC,arrayOctavaXI);
            arregloPPOX1X = cal2.fusionOctavaPPC2(lanmarkO,arrayOctavaXC,arrayOctavaXI);
            
            
            for (int i = 0; i < calculoOX4.size(); i++)
            {
                guiAFusionar.jTextFusionOXFPPX.append((String)calculoOX4.get(i)+ "\n");
                numClusterO = i;
                numClusterPAO = i;
            }
            
           calculoOX5 = cal2.fusionOctavaInstancias(lanmarkO,arrayOctavaXNC1,arrayOctavaXNI1);
            for (int i = 0; i < calculoOX5.size(); i++)
            {
                guiAFusionar.jTextFusionOXFNCIX.append((String)"Cluster "+i+" "+calculoOX5.get(i)+ "\n");
            }
             
            
            if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOXprueba = indCH.fusionOctavaPPC(lanmarkO,arrayOctavaXC,arrayOctavaXI);
            calculoOX6 = indCH.distanciaClusterFusionadosOctava(lanmarkO,arrayOctavaXNC1,arrayOctavaXNI1);
            sumad = calculoOX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoOX7 = cal2.fusionOctavaPPC1(lanmarkO,arrayOctavaXC,arrayOctavaXI);
         calculoOX8 = cal2.fusionOctavaSI1(lanmarkO,arrayOctavaXI,arrayOctavaXC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoOX7,cenGeneral,calculoOX8);
        System.out.println("Numerador " + sumad1);
        numElementosO = numElementosO + 1;
        numClusterO = numClusterO + 1;
        System.out.println("Numero de elementos " + numElementosO);
        System.out.println("Numero de Cluster " + numClusterO);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosO - numClusterO) / (numClusterO - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jOXFIndiceCHX.setText(String.valueOf(indiceValidezfinal)); 
        
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
           ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOXprueba2 = indDB.fusionOctavaPPC(lanmarkO,arrayOctavaXC,arrayOctavaXI);
            arraySCKXO  = indDB.distanciaClusterFusionadosOctava(lanmarkO,arrayOctavaXNC1,arrayOctavaXNI1);
            
             for (int i = 0; i < arraySCKXO.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXO.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoOX7);
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoOX7, arraySCKXO);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jOXFIndiceDBX.setText(String.valueOf(indiceDB));
             
            }
   System.out.println("////////////////////////// OCTAVA 2 EN X MEANS/////////////////////////////////" );          
            
                    if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
 
                
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOXprueba = indCH.fusionOctavaPMC(lanmarkO,arrayOctavaXC);
            calculoOX6 = indCH.distanciaClusterFusionadosOctava(lanmarkO,arrayOctavaXNC1,arrayOctavaXNI1);
            sumad = calculoOX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoOX7 = cal2.fusionOctavaPMC1(lanmarkO,arrayOctavaXC);
         calculoOX8 = cal2.fusionOctavaSI1(lanmarkO,arrayOctavaXI,arrayOctavaXC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoOX7,cenGeneral,calculoOX8);
        System.out.println("Numerador " + sumad1);
        numElementosPAO = numElementosPAO + 1;
        numClusterPAO = numClusterPAO + 1;
        System.out.println("Numero de elementos " + numElementosPAO);
        System.out.println("Numero de Cluster " + numClusterPAO);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosPAO - numClusterPAO) / (numClusterPAO - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jOXFIndiceCHPAX.setText(String.valueOf(indiceValidezfinal)); 
        
         System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOXprueba2 = indDB.fusionOctavaPMC(lanmarkO,arrayOctavaXC);
            arraySCKXO  = indDB.distanciaClusterFusionadosOctava(lanmarkO,arrayOctavaXNC1,arrayOctavaXNI1);
            
             for (int i = 0; i < arraySCKXO.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKXO.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoOX7);
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoOX7, arraySCKXO);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jOXFIndiceDBPAX.setText(String.valueOf(indiceDB));
             
            }
         //////////////////////////////////////////////////////////////////////////////////////////////////
            
                    ////// OCTAVA en Y ///////////////   
         /////////////// Numero de Cumulos /////////////
     ArrayList<String> myListOctavaYNC = new ArrayList<String>(Arrays.asList(arreglooctavaYNCX.split(",")));
      ArrayList arrayOctavaYNC1  = new ArrayList();
      arrayOctavaYNC1  = myListOctavaYNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListOctavaYNI = new ArrayList<String>(Arrays.asList(arreglooctavaYNIX.split(",")));
      ArrayList arrayOctavaYNI1  = new ArrayList(); 
      arrayOctavaYNI1  = myListOctavaYNI;
      ///////// Arreglo pruba lopasa a array /////
      ArrayList<String> myListOY = new ArrayList<String>(Arrays.asList(arregloprueba3OX.split(",")));
      ArrayList arrayOctavaYI  = new ArrayList();
      arrayOctavaYI = myListOY;
     //////////////////////////
      ArrayList<String> myList1OY = new ArrayList<String>(Arrays.asList(arregloprueba4OX.split(",")));
      ArrayList arrayOctavaYC  = new ArrayList(); 
      arrayOctavaYC = myList1OY;
     //////////////////////
      ArrayList<String> myList2OY = new ArrayList<String>(Arrays.asList(arregloprueba5OX.split(",")));
      ArrayList arrayOctavaYT  = new ArrayList(); 
      arrayOctavaYT = myList2OY;
     ////////////////////////// tempo en x ///////////
       ArrayList calculoOY1 = new ArrayList(); ///// Asiganción a la lanmark segun refrencia
       ArrayList calculoOY2 = new ArrayList(); //// Promedio Aritmetico Centroide
       ArrayList calculoOY3 = new ArrayList();
       ArrayList calculoOY4 = new ArrayList();
       ArrayList calculoOY5 = new ArrayList();
       ArrayList calculoOYprueba = new ArrayList();
       ArrayList calculoOYprueba2 = new ArrayList();
       double calculoOY6 = 0;
      
       ArrayList calculoOY7 = new ArrayList();
       ArrayList calculoOY8 = new ArrayList();
       double numClusterOY = 0;
       double numElementosOY = 0;
       double numClusterPAOY = 0;
       double numElementosPAOY = 0;
       ArrayList arraySCKYO = new ArrayList();

       
       System.out.println("///////////////////////////////////////////////////////////" + comboFusion );
       
           
       for (int i = 0; i < arrayOctavaYNC1.size(); i++)
                {
                guiAFusionar.jTextNCNIOYX.append((String) "Cluster "+ arrayOctavaYNC1.get(i) +  (String) "Instancia "+ arrayOctavaYNI1.get(i) + " \n");
                numElementosOY = i;
                numElementosPAOY = i;
                } 
          for (int i = 0; i < arrayOctavaYI.size(); i++)
                {
                guiAFusionar.jTextGCOYX.append((String) "Cluster ["+i+"]"+arrayOctavaYI.get(i)+" Instancias"+ "-->" + "Centroide: " + (String) arrayOctavaYC.get(i)+ " \n");
                }
            
            for (int i = 0; i < arrayOctavaYT.size(); i++)
                {
                guiAFusionar.jTextALOYX.append((String) "[Cluster "+i+"]"+ arrayOctavaYT.get(i)+ " \n");
                }
         
                                   
 ////////// ASIGNACIONES A LANMAKR ////////////////
            String [] lanmarkOY = arregloprueba5OX.split(","); ////// Convertir string a String []
            
            calculoOY1 = cal2.fusionOctava(lanmarkOY);
            for (int i = 0; i < calculoOY1.size(); i++)
            {     
                guiAFusionar.jTextFusionOYX.append((String)calculoOY1.get(i)+ "\n");
            }  
            
            
           
////////// FUSIÓN DE CLUSTER ////////////////
             calculoOY2 = cal2.fusionOctavaPMC(lanmarkOY,arrayOctavaYC); // Promedio Aritmetico
             arregloPAOYX = cal2.fusionOctavaPMC1(lanmarkOY,arrayOctavaYC);
             arregloPAOY1X = cal2.fusionOctavaPMC2(lanmarkOY,arrayOctavaYC);
            for (int i = 0; i < calculoOY2.size(); i++)
            {
                guiAFusionar.jTextFusionOYFX.append((String)calculoOY2.get(i)+ "\n");
            }
            
            
            calculoOY3 = cal2.fusionOctavaSI(lanmarkOY,arrayOctavaYI,arrayOctavaYC);
            arregloInstanciasOYX = cal2.fusionOctavaSI1(lanmarkOY, arrayOctavaYI,arrayOctavaYC);
            arregloInstanciasOY1X = cal2.fusionOctavaSI2(lanmarkOY, arrayOctavaYI,arrayOctavaYC);
   
            
            for (int i = 0; i < calculoOY3.size(); i++)
            {  
                guiAFusionar.jTextFusionOYFIX.append((String)calculoOY3.get(i)+ "\n");
            }    
            calculoOY4 = cal2.fusionOctavaPPC(lanmarkOY,arrayOctavaYC,arrayOctavaYI);
            arregloPPOYX = cal2.fusionOctavaPPC1(lanmarkOY,arrayOctavaYC,arrayOctavaYI);
            arregloPPOY1X = cal2.fusionOctavaPPC2(lanmarkOY,arrayOctavaYC,arrayOctavaYI);
            
            
            for (int i = 0; i < calculoOY4.size(); i++)
            {
                guiAFusionar.jTextFusionOYFPPX.append((String)calculoOY4.get(i)+ "\n");
                numClusterOY = i;
                numClusterPAOY = i;
            }
            
           calculoOY5 = cal2.fusionOctavaInstancias(lanmarkOY,arrayOctavaYNC1,arrayOctavaYNI1);
            for (int i = 0; i < calculoOY5.size(); i++)
            {
                guiAFusionar.jTextFusionOYFNCIX.append((String)"Cluster "+i+" "+calculoOY5.get(i)+ "\n");
            }
            
            
          if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOYprueba = indCH.fusionOctavaPPC(lanmarkOY,arrayOctavaYC,arrayOctavaYI);
            calculoOY6 = indCH.distanciaClusterFusionadosOctava(lanmarkOY,arrayOctavaYNC1,arrayOctavaYNI1);
            sumad = calculoOY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoOY7 = cal2.fusionOctavaPPC1(lanmarkOY,arrayOctavaYC,arrayOctavaYI);
         calculoOY8 = cal2.fusionOctavaSI1(lanmarkOY,arrayOctavaYI,arrayOctavaYC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoOY7,cenGeneral,calculoOY8);
        System.out.println("Numerador " + sumad1);
        numElementosOY = numElementosOY + 1;
        numClusterOY = numClusterOY + 1;
        System.out.println("Numero de elementos " + numElementosOY);
        System.out.println("Numero de Cluster " + numClusterOY);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosOY - numClusterOY) / (numClusterOY - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jOYFIndiceCHX.setText(String.valueOf(indiceValidezfinal)); 
        
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
           ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOYprueba2 = indDB.fusionOctavaPPC(lanmarkOY,arrayOctavaYC,arrayOctavaYI);
            arraySCKYO  = indDB.distanciaClusterFusionadosOctava(lanmarkOY,arrayOctavaYNC1,arrayOctavaYNI1);
            
             for (int i = 0; i < arraySCKYO.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKYO.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoOY7);
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoOY7, arraySCKYO);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jOYFIndiceDBX.setText(String.valueOf(indiceDB));
             
            }
            
            
                    if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
                System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");
                
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOYprueba = indCH.fusionOctavaPMC(lanmarkOY,arrayOctavaYC);
            calculoOY6 = indCH.distanciaClusterFusionadosOctava(lanmarkOY,arrayOctavaYNC1,arrayOctavaYNI1);
            sumad = calculoOY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoOY7 = cal2.fusionOctavaPMC1(lanmarkOY,arrayOctavaYC);
         calculoOY8 = cal2.fusionOctavaSI1(lanmarkOY,arrayOctavaYI,arrayOctavaYC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoOY7,cenGeneral,calculoOY8);
        System.out.println("Numerador " + sumad1);
        numElementosPAOY = numElementosPAOY + 1;
        numClusterPAOY = numClusterPAOY + 1;
        System.out.println("Numero de elementos " + numElementosPAOY);
        System.out.println("Numero de Cluster " + numClusterPAOY);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosPAOY - numClusterPAOY) / (numClusterPAOY - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jOYFIndiceCHPAX.setText(String.valueOf(indiceValidezfinal)); 
        
         System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOYprueba2 = indDB.fusionOctavaPMC(lanmarkOY,arrayOctavaYC);
            arraySCKYO  = indDB.distanciaClusterFusionadosOctava(lanmarkOY,arrayOctavaYNC1,arrayOctavaYNI1);
            
             for (int i = 0; i < arraySCKYO.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKYO.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoOY7);
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoOY7, arraySCKYO);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jOYFIndiceDBPAX.setText(String.valueOf(indiceDB));
             
            }
         //////////////////////////////////////////////////////////////////////////////////////////////////
            
                     ////// OCTAVA en Z ///////////////   
         /////////////// Numero de Cumulos /////////////
     ArrayList<String> myListOctavaZNC = new ArrayList<String>(Arrays.asList(arreglooctavaZNCX.split(",")));
      ArrayList arrayOctavaZNC1  = new ArrayList();
      arrayOctavaZNC1  = myListOctavaZNC;
      /////////////// Todas las Instancias /////////////
      ArrayList<String> myListOctavaZNI = new ArrayList<String>(Arrays.asList(arreglooctavaZNIX.split(",")));
      ArrayList arrayOctavaZNI1  = new ArrayList(); 
      arrayOctavaZNI1  = myListOctavaZNI;
      ///////// Arreglo pruba lopasa a array /////
      ArrayList<String> myListOZ = new ArrayList<String>(Arrays.asList(arregloprueba6OX.split(",")));
      ArrayList arrayOctavaZI  = new ArrayList();
      arrayOctavaZI = myListOZ;
     //////////////////////////
      ArrayList<String> myList1OZ = new ArrayList<String>(Arrays.asList(arregloprueba7OX.split(",")));
      ArrayList arrayOctavaZC  = new ArrayList(); 
      arrayOctavaZC = myList1OZ;
     //////////////////////
      ArrayList<String> myList2OZ = new ArrayList<String>(Arrays.asList(arregloprueba8OX.split(",")));
      ArrayList arrayOctavaZT  = new ArrayList(); 
      arrayOctavaZT = myList2OZ;
     ////////////////////////// tempo en x ///////////
       ArrayList calculoOZ1 = new ArrayList(); ///// Asiganción a la lanmark segun refrencia
       ArrayList calculoOZ2 = new ArrayList(); //// Promedio Aritmetico Centroide
       ArrayList calculoOZ3 = new ArrayList();
       ArrayList calculoOZ4 = new ArrayList();
       ArrayList calculoOZ5 = new ArrayList();
       ArrayList calculoOZprueba = new ArrayList();
       ArrayList calculoOZprueba2 = new ArrayList();
       double calculoOZ6 = 0;
      
       ArrayList calculoOZ7 = new ArrayList();
       ArrayList calculoOZ8 = new ArrayList();
       double numClusterOZ = 0;
       double numElementosOZ = 0;
       double numClusterPAOZ = 0;
       double numElementosPAOZ = 0;
       ArrayList arraySCKZO = new ArrayList();

       
       System.out.println("///////////////////////////////////////////////////////////" + comboFusion );
       
           
       for (int i = 0; i < arrayOctavaZNC1.size(); i++)
                {
                guiAFusionar.jTextNCNIOZX.append((String) "Cluster "+ arrayOctavaZNC1.get(i) +  (String) "Instancia "+ arrayOctavaZNI1.get(i) + " \n");
                numElementosOZ = i;
                numElementosPAOZ = i;
                } 
          for (int i = 0; i < arrayOctavaZI.size(); i++)
                {
                guiAFusionar.jTextGCOZX.append((String) "Cluster ["+i+"]"+arrayOctavaZI.get(i)+" Instancias"+ "-->" + "Centroide: " + (String) arrayOctavaZC.get(i)+ " \n");
                }
            
            for (int i = 0; i < arrayOctavaZT.size(); i++)
                {
                guiAFusionar.jTextALOZX.append((String) "[Cluster "+i+"]"+ arrayOctavaZT.get(i)+ " \n");
                }
         
                                   
 ////////// ASIGNACIONES A LANMAKR ////////////////
            String [] lanmarkOZ = arregloprueba8OX.split(","); ////// Convertir string a String []
            
            calculoOZ1 = cal2.fusionOctava(lanmarkOZ);
            for (int i = 0; i < calculoOZ1.size(); i++)
            {     
                guiAFusionar.jTextFusionOZX.append((String)calculoOZ1.get(i)+ "\n");
            }  
            
            
           
////////// FUSIÓN DE CLUSTER ////////////////
             calculoOZ2 = cal2.fusionOctavaPMC(lanmarkOZ,arrayOctavaZC); // Promedio Aritmetico
             arregloPAOZX = cal2.fusionOctavaPMC1(lanmarkOZ,arrayOctavaZC);
             arregloPAOZ1X = cal2.fusionOctavaPMC2(lanmarkOZ,arrayOctavaZC);
            for (int i = 0; i < calculoOZ2.size(); i++)
            {
                guiAFusionar.jTextFusionOZFX.append((String)calculoOZ2.get(i)+ "\n");
            }
            
            
            calculoOZ3 = cal2.fusionOctavaSI(lanmarkOZ,arrayOctavaZI,arrayOctavaZC);
            arregloInstanciasOZX = cal2.fusionOctavaSI1(lanmarkOZ, arrayOctavaZI,arrayOctavaZC);
             arregloInstanciasOZ1X = cal2.fusionOctavaSI2(lanmarkOZ, arrayOctavaZI,arrayOctavaZC);
   
            
            for (int i = 0; i < calculoOZ3.size(); i++)
            {  
                guiAFusionar.jTextFusionOZFIX.append((String)calculoOZ3.get(i)+ "\n");
            }    
            calculoOZ4 = cal2.fusionOctavaPPC(lanmarkOZ,arrayOctavaZC,arrayOctavaZI);
            arregloPPOZX = cal2.fusionOctavaPPC1(lanmarkOZ,arrayOctavaZC,arrayOctavaZI);
            arregloPPOZ1X = cal2.fusionOctavaPPC2(lanmarkOZ,arrayOctavaZC,arrayOctavaZI);
            
            
            for (int i = 0; i < calculoOZ4.size(); i++)
            {
                guiAFusionar.jTextFusionOZFPPX.append((String)calculoOZ4.get(i)+ "\n");
                numClusterOZ = i;
                numClusterPAOZ = i;
            }
            
           calculoOZ5 = cal2.fusionOctavaInstancias(lanmarkOZ,arrayOctavaZNC1,arrayOctavaZNI1);
            for (int i = 0; i < calculoOZ5.size(); i++)
            {
                guiAFusionar.jTextFusionOZFNCIX.append((String)"Cluster "+i+" "+calculoOZ5.get(i)+ "\n");
            } 
            
               
          if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOZprueba = indCH.fusionOctavaPPC(lanmarkOZ,arrayOctavaZC,arrayOctavaZI);
            calculoOZ6 = indCH.distanciaClusterFusionadosOctava(lanmarkOZ,arrayOctavaZNC1,arrayOctavaZNI1);
            sumad = calculoOZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoOZ7 = cal2.fusionOctavaPPC1(lanmarkOZ,arrayOctavaZC,arrayOctavaZI);
         calculoOZ8 = cal2.fusionOctavaSI1(lanmarkOZ,arrayOctavaZI,arrayOctavaZC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoOZ7,cenGeneral,calculoOZ8);
        System.out.println("Numerador " + sumad1);
        numElementosOZ = numElementosOZ + 1;
        numClusterOZ = numClusterOZ + 1;
        System.out.println("Numero de elementos " + numElementosOZ);
        System.out.println("Numero de Cluster " + numClusterOZ);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosOZ - numClusterOZ) / (numClusterOZ - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jOZFIndiceCHX.setText(String.valueOf(indiceValidezfinal)); 
        
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
           ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOZprueba2 = indDB.fusionOctavaPPC(lanmarkOZ,arrayOctavaZC,arrayOctavaZI);
            arraySCKZO  = indDB.distanciaClusterFusionadosOctava(lanmarkOZ,arrayOctavaZNC1,arrayOctavaZNI1);
            
             for (int i = 0; i < arraySCKZO.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKZO.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoOZ7);
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoOZ7, arraySCKZO);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jOZFIndiceDBX.setText(String.valueOf(indiceDB));
             
            }
            
            
                    if (comboFusion == "Promedio Ponderado")
            {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
                System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");
                
            double cenGeneral  = 0;
            double sumad  = 0;
            double sumad1  = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOZprueba = indCH.fusionOctavaPMC(lanmarkOZ,arrayOctavaZC);
            calculoOY6 = indCH.distanciaClusterFusionadosOctava(lanmarkOZ,arrayOctavaZNC1,arrayOctavaZNI1);
            sumad = calculoOZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);
         
         calculoOZ7 = cal2.fusionOctavaPMC1(lanmarkOZ,arrayOctavaZC);
         calculoOZ8 = cal2.fusionOctavaSI1(lanmarkOZ,arrayOctavaZI,arrayOctavaZC);
         
        sumad1 = indCH.distanciaSeparacionCluster(calculoOZ7,cenGeneral,calculoOZ8);
        System.out.println("Numerador " + sumad1);
        numElementosPAOZ = numElementosPAOZ + 1;
        numClusterPAOZ = numClusterPAOZ + 1;
        System.out.println("Numero de elementos " + numElementosPAOZ);
        System.out.println("Numero de Cluster " + numClusterPAOZ);
          
        indiceValidez = sumad1 / sumad;      
        indiceValidez1 = (numElementosPAOZ - numClusterPAOZ) / (numClusterPAOZ - 1) ;
        indiceValidezfinal = indiceValidez * indiceValidez1;
        
        guiAFusionar.jOZFIndiceCHPAX.setText(String.valueOf(indiceValidezfinal)); 
        
         System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");
         
         //////////////////////////////////////////////////////////////////////////////////////////////////
        
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           
                    double sumadDB  = 0;
                    double sumaMaxTotal = 0;
                   double numClusterDB = 0;
                   double indiceDB = 0;
                    ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOZprueba2 = indDB.fusionOctavaPMC(lanmarkOZ,arrayOctavaZC);
            arraySCKZO  = indDB.distanciaClusterFusionadosOctava(lanmarkOZ,arrayOctavaZNC1,arrayOctavaZNI1);
            
             for (int i = 0; i < arraySCKZO.size(); i++)
            {
                System.out.println("SCK Cluster: " +i+ " es:" + arraySCKZO.get(i));
               // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }
             
             indDB.distanciaSeparacionCluster(calculoOY7);
             ///////// (SCK / SCL) / D(CK, CL) /////////////
             System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
             sumamax = indDB.distanciaSeparacionCluster1(calculoOZ7, arraySCKZO);
             for (int i = 0; i < sumamax.size(); i++)
             {
                 System.out.println("La distancia maxima "+i+ " es: " + sumamax.get(i));
                 sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                 numClusterDB = numClusterDB + 1;
             }
             System.out.println("La suma de maximos es :" + sumaMaxTotal);
             indiceDB = (1/numClusterDB) * sumaMaxTotal;
             System.out.println("El indice Davies Bouldin es:  " + indiceDB);
             guiAFusionar.jOZFIndiceDBPAX.setText(String.valueOf(indiceDB));
             
            }
               
            
            
      }
    
        @Override
    public boolean done() {
        
         return fin;
    }
    
    
}
