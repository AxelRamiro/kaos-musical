/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import Interfaces.guiARecomendar;
import Interfaces.guiAFusionar;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;

import ObjeAux.*;
import jade.core.AID;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Eder Lopez Olguin
 */
public class CFusionarEM extends SimpleBehaviour {

    public static String arreglotempoXNCEM;
    public static String arreglotempoXNIEM;

    public static String arreglopruebaEM;
    public static String arregloprueba1EM;
    public static String arregloprueba2EM;

    public static String arreglotempoYNCEM;
    public static String arreglotempoYNIEM;

    public static String arregloprueba3EM;
    public static String arregloprueba4EM;
    public static String arregloprueba5EM;

    public static String arreglotempoZNCEM;
    public static String arreglotempoZNIEM;

    public static String arregloprueba6EM;
    public static String arregloprueba7EM;
    public static String arregloprueba8EM;

    public static ArrayList arregloInstanciasTXEM;
    public static ArrayList arregloInstanciasTYEM;
    public static ArrayList arregloInstanciasTZEM;

    public static ArrayList arregloInstanciasTX1EM;
    public static ArrayList arregloInstanciasTY1EM;
    public static ArrayList arregloInstanciasTZ1EM;

    public static ArrayList arregloPPTXEM;
    public static ArrayList arregloPPTYEM;
    public static ArrayList arregloPPTZEM;

    public static ArrayList arregloPPTX1EM;
    public static ArrayList arregloPPTY1EM;
    public static ArrayList arregloPPTZ1EM;

    public static ArrayList arregloPATXEM;
    public static ArrayList arregloPATYEM;
    public static ArrayList arregloPATZEM;

    public static ArrayList arregloPATX1EM;
    public static ArrayList arregloPATY1EM;
    public static ArrayList arregloPATZ1EM;

        ////////////// DURACION /////////////////
    public static String arregloduracionXNCEM;
    public static String arregloduracionXNIEM;

    public static String arreglopruebaDEM;
    public static String arregloprueba1DEM;
    public static String arregloprueba2DEM;

    public static String arregloduracionYNCEM;
    public static String arregloduracionYNIEM;

    public static String arregloprueba3DEM;
    public static String arregloprueba4DEM;
    public static String arregloprueba5DEM;

    public static String arregloduracionZNCEM;
    public static String arregloduracionZNIEM;

    public static String arregloprueba6DEM;
    public static String arregloprueba7DEM;
    public static String arregloprueba8DEM;

    public static ArrayList arregloInstanciasDXEM;
    public static ArrayList arregloInstanciasDYEM;
    public static ArrayList arregloInstanciasDZEM;

    public static ArrayList arregloInstanciasDX1EM;
    public static ArrayList arregloInstanciasDY1EM;
    public static ArrayList arregloInstanciasDZ1EM;

    public static ArrayList arregloPPDXEM;
    public static ArrayList arregloPPDYEM;
    public static ArrayList arregloPPDZEM;

    public static ArrayList arregloPPDX1EM;
    public static ArrayList arregloPPDY1EM;
    public static ArrayList arregloPPDZ1EM;

    public static ArrayList arregloPADXEM;
    public static ArrayList arregloPADYEM;
    public static ArrayList arregloPADZEM;

    public static ArrayList arregloPADX1EM;
    public static ArrayList arregloPADY1EM;
    public static ArrayList arregloPADZ1EM;

        ////////////// OCTAVAS /////////////////
    public static String arreglooctavaXNCEM;
    public static String arreglooctavaXNIEM;

    public static String arreglopruebaOEM;
    public static String arregloprueba1OEM;
    public static String arregloprueba2OEM;

    public static String arreglooctavaYNCEM;
    public static String arreglooctavaYNIEM;

    public static String arregloprueba3OEM;
    public static String arregloprueba4OEM;
    public static String arregloprueba5OEM;

    public static String arreglooctavaZNCEM;
    public static String arreglooctavaZNIEM;

    public static String arregloprueba6OEM;
    public static String arregloprueba7OEM;
    public static String arregloprueba8OEM;

    public static ArrayList arregloInstanciasOXEM;
    public static ArrayList arregloInstanciasOYEM;
    public static ArrayList arregloInstanciasOZEM;

    public static ArrayList arregloInstanciasOX1EM;
    public static ArrayList arregloInstanciasOY1EM;
    public static ArrayList arregloInstanciasOZ1EM;

    public static ArrayList arregloPPOXEM;
    public static ArrayList arregloPPOYEM;
    public static ArrayList arregloPPOZEM;

    public static ArrayList arregloPPOX1EM;
    public static ArrayList arregloPPOY1EM;
    public static ArrayList arregloPPOZ1EM;

    public static ArrayList arregloPAOXEM;
    public static ArrayList arregloPAOYEM;
    public static ArrayList arregloPAOZEM;
    public static ArrayList arregloPAOX1EM;
    public static ArrayList arregloPAOY1EM;
    public static ArrayList arregloPAOZ1EM;

    private boolean fin = false;

    public CFusionarEM(Agent a) {
        super(a);

    }

    @Override
    public void action() {

        System.out.println(" ** Receptor xm Preparandose para recibir ** ");
        ACLMessage mensaje181 = myAgent.blockingReceive();
        if (mensaje181 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje181.toString());
            //fin = true;
            arreglopruebaEM = mensaje181.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje181.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglopruebaEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 2 //////////  
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje183 = myAgent.blockingReceive();
        if (mensaje183 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje183);
            //fin = true;                  
            arregloprueba1EM = mensaje183.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje183.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba1EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 3 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje185 = myAgent.blockingReceive();
        if (mensaje185 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje185);
            //fin = true;
            arregloprueba2EM = mensaje185.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje185.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba2EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 4 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje187 = myAgent.blockingReceive();
        if (mensaje187 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje187.toString());
            arregloprueba3EM = mensaje187.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje187.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba3EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 5 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje189 = myAgent.blockingReceive();
        if (mensaje189 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje189.toString());
            //fin = true;
            arregloprueba4EM = mensaje189.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje189.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba4EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 6 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje191 = myAgent.blockingReceive();
        if (mensaje191 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje191);
            //fin = true;
            arregloprueba5EM = mensaje191.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje191.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba5EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 7 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje193 = myAgent.blockingReceive();
        if (mensaje193 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje193);
            //fin = true;
            arregloprueba6EM = mensaje193.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje193.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba6EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 8 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje195 = myAgent.blockingReceive();
        if (mensaje195 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje195);
            //fin = true;
            arregloprueba7EM = mensaje195.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje195.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba7EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 9 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje197 = myAgent.blockingReceive();
        if (mensaje197 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje197);
            //fin = true;
            arregloprueba8EM = mensaje197.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje197.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba8EM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 10 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje199 = myAgent.blockingReceive();
        if (mensaje199 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje199);
            //fin = true;
            arreglotempoXNCEM = mensaje199.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje199.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoXNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 11 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje201 = myAgent.blockingReceive();
        if (mensaje201 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje201);
            //fin = true;
            arreglotempoXNIEM = mensaje201.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje201.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoXNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 12 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje203 = myAgent.blockingReceive();
        if (mensaje203 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje203);
            //fin = true;
            arreglotempoYNCEM = mensaje203.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje203.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoYNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 13 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje205 = myAgent.blockingReceive();
        if (mensaje205 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje205);
            //fin = true;
            arreglotempoYNIEM = mensaje205.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje205.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoYNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 14 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje207 = myAgent.blockingReceive();
        if (mensaje207 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje207);
            //fin = true;
            arreglotempoZNCEM = mensaje207.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje207.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoZNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 15 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje209 = myAgent.blockingReceive();
        if (mensaje209 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje209);
            //fin = true;
            arreglotempoZNIEM = mensaje209.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje209.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoZNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

                /////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        ///////// RECIBIENDO MENSAJE UNO DURACION //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje211 = myAgent.blockingReceive();
        if (mensaje211 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje211);
            //fin = true;
            arreglopruebaDEM = mensaje211.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje211.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglopruebaDEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 2 //////////  
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje213 = myAgent.blockingReceive();
        if (mensaje213 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje213);
            //fin = true;                  
            arregloprueba1DEM = mensaje213.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje213.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba1DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }

        ///////// RECIBIENDO MENSAJE 3 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje215 = myAgent.blockingReceive();
        if (mensaje215 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje215);
            //fin = true;
            arregloprueba2DEM = mensaje215.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje215.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba2DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }

        ///////// RECIBIENDO MENSAJE 4 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje217 = myAgent.blockingReceive();
        if (mensaje217 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje217.toString());
            arregloprueba3DEM = mensaje217.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje217.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba3DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 5 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje219 = myAgent.blockingReceive();
        if (mensaje219 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje219.toString());
            //fin = true;
            arregloprueba4DEM = mensaje219.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje219.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba4DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 6 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje221 = myAgent.blockingReceive();
        if (mensaje221 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje221);
            //fin = true;
            arregloprueba5DEM = mensaje221.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje221.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba5DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 7 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje223 = myAgent.blockingReceive();
        if (mensaje223 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje223);
            //fin = true;
            arregloprueba6DEM = mensaje223.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje223.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba6DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();

        }

        ///////// RECIBIENDO MENSAJE 8 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje225 = myAgent.blockingReceive();
        if (mensaje225 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje225);
            //fin = true;
            arregloprueba7DEM = mensaje225.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje225.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba7DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }

        ///////// RECIBIENDO MENSAJE 9 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje227 = myAgent.blockingReceive();
        if (mensaje227 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje227);
            //fin = true;
            arregloprueba8DEM = mensaje227.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje227.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba8DEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 10 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje229 = myAgent.blockingReceive();
        if (mensaje229 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje229);
            //fin = true;
            arregloduracionXNCEM = mensaje229.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje229.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionXNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 11 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje231 = myAgent.blockingReceive();
        if (mensaje231 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje231);
            //fin = true;
            arregloduracionXNIEM = mensaje231.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje231.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionXNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 12 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje233 = myAgent.blockingReceive();
        if (mensaje233 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje233);
            //fin = true;
            arregloduracionYNCEM = mensaje233.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje233.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionYNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 13 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje235 = myAgent.blockingReceive();
        if (mensaje235 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje235);
            //fin = true;
            arregloduracionYNIEM = mensaje235.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje235.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionYNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 14 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje237 = myAgent.blockingReceive();
        if (mensaje237 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje237);
            //fin = true;
            arregloduracionZNCEM = mensaje237.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje237.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionZNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 15 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje239 = myAgent.blockingReceive();
        if (mensaje239 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje239);
            //fin = true;
            arregloduracionZNIEM = mensaje239.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje239.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionZNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

                /////////////////////////////////////////////////////////////////////////////
        ///////// RECIBIENDO MENSAJE UNO OCTAVA //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje241 = myAgent.blockingReceive();
        if (mensaje241 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje241);
            //fin = true;
            arreglopruebaOEM = mensaje241.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje241.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglopruebaOEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 2 //////////  
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje243 = myAgent.blockingReceive();
        if (mensaje243 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje243);
            //fin = true;                  
            arregloprueba1OEM = mensaje243.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje243.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba1OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }

        ///////// RECIBIENDO MENSAJE 3 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje245 = myAgent.blockingReceive();
        if (mensaje245 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje245);
            //fin = true;
            arregloprueba2OEM = mensaje245.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje245.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba2OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }

        ///////// RECIBIENDO MENSAJE 4 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje247 = myAgent.blockingReceive();
        if (mensaje247 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje247.toString());
            arregloprueba3OEM = mensaje247.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje247.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba3OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 5 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje249 = myAgent.blockingReceive();
        if (mensaje249 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje249.toString());
            //fin = true;
            arregloprueba4OEM = mensaje249.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje249.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba4OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 6 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje251 = myAgent.blockingReceive();
        if (mensaje251 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje251);
            //fin = true;
            arregloprueba5OEM = mensaje251.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje251.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba5OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }
        ///////// RECIBIENDO MENSAJE 7 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje253 = myAgent.blockingReceive();
        if (mensaje253 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje253);
            //fin = true;
            arregloprueba6OEM = mensaje253.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje253.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba6OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }

        ///////// RECIBIENDO MENSAJE 8 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje255 = myAgent.blockingReceive();
        if (mensaje255 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje255);
            //fin = true;
            arregloprueba7OEM = mensaje255.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje255.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba7OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
            /*Bloquea el comportamiento hasta que llegue un msj, el bloque no termina 
             * hasta que termina el comportamiento sobre el que se aplica
             */
        }

        ///////// RECIBIENDO MENSAJE 9 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje257 = myAgent.blockingReceive();
        if (mensaje257 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje257);
            //fin = true;
            arregloprueba8OEM = mensaje257.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje257.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba8OEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 10 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje259 = myAgent.blockingReceive();
        if (mensaje259 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje259);
            //fin = true;
            arreglooctavaXNCEM = mensaje259.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje259.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaXNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 11 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje261 = myAgent.blockingReceive();
        if (mensaje261 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje261);
            //fin = true;
            arreglooctavaXNIEM = mensaje261.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje261.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaXNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 12 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje263 = myAgent.blockingReceive();
        if (mensaje263 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje263);
            //fin = true;
            arreglooctavaYNCEM = mensaje263.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje263.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaYNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 13 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje265 = myAgent.blockingReceive();
        if (mensaje265 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje265);
            //fin = true;
            arreglooctavaYNIEM = mensaje265.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje265.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaYNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        ///////// RECIBIENDO MENSAJE 14 ///////////*
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje267 = myAgent.blockingReceive();
        if (mensaje267 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje267);
            //fin = true;
            arreglooctavaZNCEM = mensaje267.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje267.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaZNCEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }
        ///////// RECIBIENDO MENSAJE 15 //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje269 = myAgent.blockingReceive();
        if (mensaje269 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje269);
            //fin = true;
            arreglooctavaZNIEM = mensaje269.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje269.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaZNIEM);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor ********");
            System.out.println(respuesta.toString());

            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

                /////////////////////////////////////////////////////////////////////////////
        System.out.println("Iniciare el proceso de Fusion con EM");

      ///////////////// TEMPO EN X ///////////
        /////// intancia calculo tempo X //////
        calculo_tempo cal = new calculo_tempo();
        calculo_duracion cal1 = new calculo_duracion();
        calculo_octava cal2 = new calculo_octava();
        consultas_arreglos cons = new consultas_arreglos();
        calculoIndiceValidezCH indCH = new calculoIndiceValidezCH();
        calculoIndiceValidezDB indDB = new calculoIndiceValidezDB();

        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListTempoXNC = new ArrayList<String>(Arrays.asList(arreglotempoXNCEM.split(",")));
        ArrayList arrayTempoXNC1 = new ArrayList();
        arrayTempoXNC1 = myListTempoXNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListTempoXNI = new ArrayList<String>(Arrays.asList(arreglotempoXNIEM.split(",")));
        ArrayList arrayTempoXNI1 = new ArrayList();
        arrayTempoXNI1 = myListTempoXNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(arreglopruebaEM.split(",")));
        ArrayList arrayTempoXI = new ArrayList();
        arrayTempoXI = myList;
        //////////////////////////
        ArrayList<String> myList1 = new ArrayList<String>(Arrays.asList(arregloprueba1EM.split(",")));
        ArrayList arrayTempoXC = new ArrayList();
        arrayTempoXC = myList1;
        //////////////////////
        ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList(arregloprueba2EM.split(",")));
        ArrayList arrayTempoXT = new ArrayList();
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

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayTempoXNC1.size(); i++) {
            guiAFusionar.jTextNCNITXEM.append((String) "Cluster " + arrayTempoXNC1.get(i) + (String) "Instancia " + arrayTempoXNI1.get(i) + " \n");
            numElementos = i;
            numElementosPA = i;
        }
        for (int i = 0; i < arrayTempoXI.size(); i++) {
            guiAFusionar.jTextGCTXEM.append((String) "Cluster [" + i + "]" + arrayTempoXI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayTempoXC.get(i) + " \n");
        }
        for (int i = 0; i < arrayTempoXT.size(); i++) {
            guiAFusionar.jTextALTXEM.append((String) "[Cluster " + i + "]" + arrayTempoXT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmark = arregloprueba2EM.split(","); ////// Convertir string a String []
        calculoTX1 = cal.fusionTempo(lanmark);
        for (int i = 0; i < calculoTX1.size(); i++) {
            guiAFusionar.jTextFusionTXEM.append((String) calculoTX1.get(i) + "\n");
        }

        // FUSIÓN DE CLUSTER ////////////////
        calculoTX2 = cal.fusionTempoPMC(lanmark, arrayTempoXC); // Promedio Aritmetico
        arregloPATXEM = cal.fusionTempoPMC1(lanmark, arrayTempoXC);
        arregloPATX1EM = cal.fusionTempoPMC2(lanmark, arrayTempoXC);
        for (int i = 0; i < calculoTX2.size(); i++) {
            guiAFusionar.jTextFusionTXFEM.append((String) calculoTX2.get(i) + "\n");
        }

        calculoTX3 = cal.fusionTempoSI(lanmark, arrayTempoXI, arrayTempoXC);
        arregloInstanciasTXEM = cal.fusionTempoSI1(lanmark, arrayTempoXI, arrayTempoXC);
        arregloInstanciasTX1EM = cal.fusionTempoSI2(lanmark, arrayTempoXI, arrayTempoXC);

        for (int i = 0; i < calculoTX3.size(); i++) {
            guiAFusionar.jTextFusionTXFIEM.append((String) calculoTX3.get(i) + "\n");
        }
        calculoTX4 = cal.fusionTempoPPC(lanmark, arrayTempoXC, arrayTempoXI);
        arregloPPTXEM = cal.fusionTempoPPC1(lanmark, arrayTempoXC, arrayTempoXI);
        arregloPPTX1EM = cal.fusionTempoPPC2(lanmark, arrayTempoXC, arrayTempoXI);

        for (int i = 0; i < calculoTX4.size(); i++) {
            guiAFusionar.jTextFusionTXFPPEM.append((String) calculoTX4.get(i) + "\n");
            numCluster = i;
            numClusterPA = i;
        }

        calculoTX5 = cal.fusionTempoInstancias(lanmark, arrayTempoXNC1, arrayTempoXNI1);
        for (int i = 0; i < calculoTX5.size(); i++) {
            guiAFusionar.jTextFusionTXFNCIEM.append((String) "Cluster " + i + " " + calculoTX5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoTXprueba = indCH.fusionTempoPPC(lanmark, arrayTempoXC, arrayTempoXI);
            calculoTX6 = indCH.distanciaClusterFusionados(lanmark, arrayTempoXNC1, arrayTempoXNI1);
            sumad = calculoTX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayTempoXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoTX7 = cal.fusionTempoPPC1(lanmark, arrayTempoXC, arrayTempoXI);
            calculoTX8 = cal.fusionTempoSI1(lanmark, arrayTempoXI, arrayTempoXC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoTX7, cenGeneral, calculoTX8);
            System.out.println("Numerador " + sumad1);
            numElementos = numElementos + 1;
            numCluster = numCluster + 1;
            System.out.println("Numero de elementos " + numElementos);
            System.out.println("Numero de Cluster " + numCluster);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementos - numCluster) / (numCluster - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jTXFIndiceCHEM.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            double sumaMaximos = 0;
            ////////// DENOMINADOR /////////
            calculoTXprueba2 = indDB.fusionTempoPPC(lanmark, arrayTempoXC, arrayTempoXI);
            arraySCKX = indDB.distanciaClusterFusionados(lanmark, arrayTempoXNC1, arrayTempoXNI1);

            for (int i = 0; i < arraySCKX.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKX.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoTX7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoTX7, arraySCKX);
            for (int i = 0; i < sumamax.size(); i++) {

                sumaMaximos = Double.parseDouble((String) sumamax.get(i));

                if (Double.isNaN(sumaMaximos) == true) {

                } else {
                    System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                    sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                    numClusterDB = numClusterDB + 1;

                }

            }

            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jTXFIndiceDBEM.setText(String.valueOf(indiceDB));

        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoTXprueba = indCH.fusionTempoPMC(lanmark, arrayTempoXC);
            calculoTX6 = indCH.distanciaClusterFusionados(lanmark, arrayTempoXNC1, arrayTempoXNI1);
            sumad = calculoTX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayTempoXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoTX7 = cal.fusionTempoPMC1(lanmark, arrayTempoXC);
            calculoTX8 = cal.fusionTempoSI1(lanmark, arrayTempoXI, arrayTempoXC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoTX7, cenGeneral, calculoTX8);
            System.out.println("Numerador " + sumad1);
            numElementos = numElementos;
            numCluster = numCluster;
            System.out.println("Numero de elementos " + numElementos);
            System.out.println("Numero de Cluster " + numCluster);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementos - numCluster) / (numCluster - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jTXFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            double sumaMaximos = 0;
            ////////// DENOMINADOR /////////
            calculoTXprueba2 = indDB.fusionTempoPMC(lanmark, arrayTempoXC);
            arraySCKX = indDB.distanciaClusterFusionados(lanmark, arrayTempoXNC1, arrayTempoXNI1);

            for (int i = 0; i < arraySCKX.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKX.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoTX7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoTX7, arraySCKX);
            for (int i = 0; i < sumamax.size(); i++) {

                sumaMaximos = Double.parseDouble((String) sumamax.get(i));

                if (Double.isNaN(sumaMaximos) == true) {

                } else {
                    System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                    sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                    numClusterDB = numClusterDB + 1;

                }

            }

            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jTXFIndiceDBPAEM.setText(String.valueOf(indiceDB));

        }

             ///////////////// TEMPO EN Y ///////////
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////  tempo en y ///////////////////////////
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListTempoYNC = new ArrayList<String>(Arrays.asList(arreglotempoYNCEM.split(",")));
        ArrayList arrayTempoYNC1 = new ArrayList();
        arrayTempoYNC1 = myListTempoYNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListTempoYNI = new ArrayList<String>(Arrays.asList(arreglotempoYNIEM.split(",")));
        ArrayList arrayTempoYNI1 = new ArrayList();
        arrayTempoYNI1 = myListTempoYNI;
        //////////////////
        ArrayList<String> myList3 = new ArrayList<String>(Arrays.asList(arregloprueba3EM.split(",")));
        ArrayList arrayTempoYI = new ArrayList();
        arrayTempoYI = myList3;
        /////////////////
        ArrayList<String> myList4 = new ArrayList<String>(Arrays.asList(arregloprueba4EM.split(",")));
        ArrayList arrayTempoYC = new ArrayList();
        arrayTempoYC = myList4;
        ////////////////
        ArrayList<String> myList5 = new ArrayList<String>(Arrays.asList(arregloprueba5EM.split(",")));
        ArrayList arrayTempoYT = new ArrayList();
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

        for (int i = 0; i < arrayTempoYNC1.size(); i++) {
            guiAFusionar.jTextNCNITYEM.append((String) "Cluster " + arrayTempoYNC1.get(i) + (String) "Instancia " + arrayTempoYNI1.get(i) + " \n");
            numElementosY = i;
            numElementosYPA = i;
        }

        for (int i = 0; i < arrayTempoYI.size(); i++) {
            guiAFusionar.jTextGCTYEM.append((String) "Cluster [" + i + "]" + arrayTempoYI.get(i) + "-->" + "Centroide: " + (String) arrayTempoYC.get(i) + " \n");
        }

        for (int i = 0; i < arrayTempoYT.size(); i++) {
            guiAFusionar.jTextALTYEM.append((String) "[Cluster " + i + "]" + arrayTempoYT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmark1 = arregloprueba5EM.split(","); ////// Convertir string a String []
        calculoTY = cal.fusionTempo(lanmark1);
        for (int i = 0; i < calculoTY.size(); i++) {
            guiAFusionar.jTextFusionTYEM.append((String) calculoTY.get(i) + "\n");
        }
        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoTY3 = cal.fusionTempoSI(lanmark1, arrayTempoYI, arrayTempoYC);
        arregloInstanciasTYEM = cal.fusionTempoSI1(lanmark1, arrayTempoYI, arrayTempoYC);
        arregloInstanciasTY1EM = cal.fusionTempoSI2(lanmark1, arrayTempoYI, arrayTempoYC);
        for (int i = 0; i < calculoTY3.size(); i++) {
            guiAFusionar.jTextFusionTYFIEM.append((String) calculoTY3.get(i) + "\n");
        }
        calculoTY2 = cal.fusionTempoPMC(lanmark1, arrayTempoYC);
        arregloPATYEM = cal.fusionTempoPMC1(lanmark1, arrayTempoYC);
        arregloPATY1EM = cal.fusionTempoPMC2(lanmark1, arrayTempoYC);
        for (int i = 0; i < calculoTY2.size(); i++) {
            guiAFusionar.jTextFusionTYFEM.append((String) calculoTY2.get(i) + "\n");
        }
        calculoTY4 = cal.fusionTempoPPC(lanmark1, arrayTempoYC, arrayTempoYI);
        arregloPPTYEM = cal.fusionTempoPPC1(lanmark1, arrayTempoYC, arrayTempoYI);
        arregloPPTY1EM = cal.fusionTempoPPC2(lanmark1, arrayTempoYC, arrayTempoYI);

        for (int i = 0; i < calculoTY4.size(); i++) {
            guiAFusionar.jTextFusionTYFPPEM.append((String) calculoTY4.get(i) + "\n");
            numClusterY = i;
            numClusterYPA = i;
        }
        calculoTY5 = cal.fusionTempoInstancias(lanmark1, arrayTempoYNC1, arrayTempoYNI1);
        for (int i = 0; i < calculoTY5.size(); i++) {
            guiAFusionar.jTextFusionTYFNCIEM.append((String) "Cluster " + i + " " + calculoTY5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneraly = 0;
            double sumady = 0;
            double sumad1y = 0;
            double indiceValidezy = 0;
            double indiceValidez1y = 0;
            double indiceValidezfinaly = 0;
            ////////// DENOMINADOR /////////
            calculoTYprueba = indCH.fusionTempoPPC(lanmark1, arrayTempoYC, arrayTempoYI);
            calculoTY6 = indCH.distanciaClusterFusionados(lanmark1, arrayTempoYNC1, arrayTempoYNI1);
            sumady = calculoTY6;
            System.out.println("Denominador " + sumady);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneraly = indCH.calculoCentroideGeneral(arrayTempoYNI1);
            System.out.println("Centroide Genral: " + cenGeneraly);

            calculoTY7 = cal.fusionTempoPPC1(lanmark1, arrayTempoYC, arrayTempoYI);
            calculoTY8 = cal.fusionTempoSI1(lanmark1, arrayTempoYI, arrayTempoYC);

            sumad1y = indCH.distanciaSeparacionCluster(calculoTY7, cenGeneraly, calculoTY8);
            System.out.println("Numerador " + sumad1y);
            numElementosY = numElementosY + 1;
            numClusterY = numClusterY + 1;
            System.out.println("Numero de elementos " + numElementosY);
            System.out.println("Numero de Cluster " + numClusterY);

            indiceValidezy = sumad1y / sumady;
            indiceValidez1y = (numElementosY - numClusterY) / (numClusterY - 1);
            indiceValidezfinaly = indiceValidezy * indiceValidez1y;

            guiAFusionar.jTYFIndiceCHEM.setText(String.valueOf(indiceValidezfinaly));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDBY = 0;
            double sumaMaxTotalY = 0;
            double numClusterDBY = 0;
            double indiceDBY = 0;
            ArrayList sumamaxY = new ArrayList();
            double sumaMaximosY = 0;

            ////////// DENOMINADOR /////////
            calculoTYprueba2 = indDB.fusionTempoPPC(lanmark1, arrayTempoYC, arrayTempoYI);
            arraySCKY = indDB.distanciaClusterFusionados(lanmark1, arrayTempoYNC1, arrayTempoYNI1);

            for (int i = 0; i < arraySCKY.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKY.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoTY7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamaxY = indDB.distanciaSeparacionCluster1(calculoTY7, arraySCKY);
            for (int i = 0; i < sumamaxY.size(); i++) {

                sumaMaximosY = Double.parseDouble((String) sumamaxY.get(i));

                if (Double.isNaN(sumaMaximosY) == true) {

                } else {
                    System.out.println("La distancia maxima " + i + " es: " + sumamaxY.get(i));
                    sumaMaxTotalY = sumaMaxTotalY + Double.parseDouble((String) sumamaxY.get(i));
                    numClusterDBY = numClusterDBY + 1;
                }
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalY);
            indiceDBY = (1 / numClusterDBY) * sumaMaxTotalY;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBY);
            guiAFusionar.jTYFIndiceDBEM.setText(String.valueOf(indiceDBY));
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneraly = 0;
            double sumady = 0;
            double sumad1y = 0;
            double indiceValidezy = 0;
            double indiceValidez1y = 0;
            double indiceValidezfinaly = 0;
            ////////// DENOMINADOR /////////
            calculoTYprueba = indCH.fusionTempoPMC(lanmark1, arrayTempoYC);
            calculoTY6 = indCH.distanciaClusterFusionados(lanmark1, arrayTempoYNC1, arrayTempoYNI1);
            sumady = calculoTY6;
            System.out.println("Denominador " + sumady);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneraly = indCH.calculoCentroideGeneral(arrayTempoYNI1);
            System.out.println("Centroide Genral: " + cenGeneraly);

            calculoTY7 = cal.fusionTempoPMC1(lanmark1, arrayTempoYC);
            calculoTY8 = cal.fusionTempoSI1(lanmark1, arrayTempoYI, arrayTempoYC);

            sumad1y = indCH.distanciaSeparacionCluster(calculoTY7, cenGeneraly, calculoTY8);
            System.out.println("Numerador " + sumad1y);
            numElementosY = numElementosY;
            numClusterY = numClusterY;
            System.out.println("Numero de elementos " + numElementosY);
            System.out.println("Numero de Cluster " + numClusterY);

            indiceValidezy = sumad1y / sumady;
            indiceValidez1y = (numElementosY - numClusterY) / (numClusterY - 1);
            indiceValidezfinaly = indiceValidezy * indiceValidez1y;

            guiAFusionar.jTYFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinaly));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDBY = 0;
            double sumaMaxTotalY = 0;
            double numClusterDBY = 0;
            double indiceDBY = 0;
            ArrayList sumamaxY = new ArrayList();
            double sumaMaximosY = 0;

            ////////// DENOMINADOR /////////
            calculoTYprueba2 = indDB.fusionTempoPMC(lanmark1, arrayTempoYC);
            arraySCKY = indDB.distanciaClusterFusionados(lanmark1, arrayTempoYNC1, arrayTempoYNI1);

            for (int i = 0; i < arraySCKY.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKY.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoTY7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamaxY = indDB.distanciaSeparacionCluster1(calculoTY7, arraySCKY);
            for (int i = 0; i < sumamaxY.size(); i++) {

                sumaMaximosY = Double.parseDouble((String) sumamaxY.get(i));

                if (Double.isNaN(sumaMaximosY) == true) {

                } else {
                    System.out.println("La distancia maxima " + i + " es: " + sumamaxY.get(i));
                    sumaMaxTotalY = sumaMaxTotalY + Double.parseDouble((String) sumamaxY.get(i));
                    numClusterDBY = numClusterDBY + 1;
                }
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalY);
            indiceDBY = (1 / numClusterDBY) * sumaMaxTotalY;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBY);
            guiAFusionar.jTYFIndiceDBPAEM.setText(String.valueOf(indiceDBY));
        }

          ///////////////// TEMPO EN Z ///////////
        /////////////////// Tempo en Z //////////////////
        ///////// Arreglo pruba lopasa a array /////
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListTempoZNC = new ArrayList<String>(Arrays.asList(arreglotempoZNCEM.split(",")));
        ArrayList arrayTempoZNC1 = new ArrayList();
        arrayTempoZNC1 = myListTempoZNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListTempoZNI = new ArrayList<String>(Arrays.asList(arreglotempoZNIEM.split(",")));
        ArrayList arrayTempoZNI1 = new ArrayList();
        arrayTempoZNI1 = myListTempoZNI;

        ArrayList<String> myListintz = new ArrayList<String>(Arrays.asList(arregloprueba6EM.split(",")));
        ArrayList arrayTempoZI = new ArrayList();
        arrayTempoZI = myListintz;
        //////////////////////////
        ArrayList<String> myListcenz = new ArrayList<String>(Arrays.asList(arregloprueba7EM.split(",")));
        ArrayList arrayTempoZC = new ArrayList();
        arrayTempoZC = myListcenz;
        //////////////////////
        ArrayList<String> myListrefz = new ArrayList<String>(Arrays.asList(arregloprueba8EM.split(",")));
        ArrayList arrayTempoZT = new ArrayList();
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

        for (int i = 0; i < arrayTempoZNC1.size(); i++) {
            guiAFusionar.jTextNCNITZEM.append((String) "Cluster " + arrayTempoZNC1.get(i) + (String) "Instancia " + arrayTempoZNI1.get(i) + " \n");
            numElementosZ = i;
            numElementosZPA = i;
        }
        for (int i = 0; i < arrayTempoZI.size(); i++) {
            guiAFusionar.jTextGCTZEM.append((String) "Cluster [" + i + "]" + arrayTempoZI.get(i) + "-->" + "Centroide: " + (String) arrayTempoZC.get(i) + " \n");
        }
        for (int i = 0; i < arrayTempoZT.size(); i++) {
            guiAFusionar.jTextALTZEM.append((String) "[Cluster " + i + "]" + arrayTempoZT.get(i) + " \n");
        }
        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmark2 = arregloprueba8EM.split(","); ////// Convertir string a String []
        calculoTZ1 = cal.fusionTempo(lanmark2);
        for (int i = 0; i < calculoTZ1.size(); i++) {
            guiAFusionar.jTextFusionTZEM.append((String) calculoTZ1.get(i) + "\n");
        }
        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoTZ3 = cal.fusionTempoSI(lanmark2, arrayTempoZI, arrayTempoZC);
        arregloInstanciasTZEM = cal.fusionTempoSI1(lanmark2, arrayTempoZI, arrayTempoZC);
        arregloInstanciasTZ1EM = cal.fusionTempoSI2(lanmark2, arrayTempoZI, arrayTempoZC);
        for (int i = 0; i < calculoTZ3.size(); i++) {
            guiAFusionar.jTextFusionTZFIEM.append((String) calculoTZ3.get(i) + "\n");
        }
        calculoTZ2 = cal.fusionTempoPMC(lanmark2, arrayTempoZC);
        arregloPATZEM = cal.fusionTempoPMC1(lanmark2, arrayTempoZC);
        arregloPATZ1EM = cal.fusionTempoPMC2(lanmark2, arrayTempoZC);

        for (int i = 0; i < calculoTZ2.size(); i++) {
            guiAFusionar.jTextFusionTZFEM.append((String) calculoTZ2.get(i) + "\n");
        }
        calculoTZ4 = cal.fusionTempoPPC(lanmark2, arrayTempoZC, arrayTempoZI);
        arregloPPTZEM = cal.fusionTempoPPC1(lanmark2, arrayTempoZC, arrayTempoZI); //// Calculo promedio ponderado
        arregloPPTZ1EM = cal.fusionTempoPPC2(lanmark2, arrayTempoZC, arrayTempoZI); //// Calculo promedio ponderado
        for (int i = 0; i < calculoTZ4.size(); i++) {
            guiAFusionar.jTextFusionTZFPPEM.append((String) calculoTZ4.get(i) + "\n");
            numClusterZ = i;
            numClusterZPA = i;
        }
        calculoTZ5 = cal.fusionTempoInstancias(lanmark2, arrayTempoZNC1, arrayTempoZNI1);
        for (int i = 0; i < calculoTZ5.size(); i++) {
            guiAFusionar.jTextFusionTZFNCIEM.append((String) "Cluster " + i + " " + calculoTZ5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneralz = 0;
            double sumadz = 0;
            double sumad1z = 0;
            double indiceValidezz = 0;
            double indiceValidez1z = 0;
            double indiceValidezfinalz = 0;
            ////////// DENOMINADOR /////////
            calculoTZprueba = indCH.fusionTempoPPC(lanmark2, arrayTempoZC, arrayTempoZI);
            calculoTZ6 = indCH.distanciaClusterFusionados(lanmark2, arrayTempoZNC1, arrayTempoZNI1);
            sumadz = calculoTZ6;
            System.out.println("Denominador " + sumadz);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneralz = indCH.calculoCentroideGeneral(arrayTempoZNI1);
            System.out.println("Centroide Genral: " + cenGeneralz);

            calculoTZ7 = cal.fusionTempoPPC1(lanmark2, arrayTempoZC, arrayTempoZI);
            calculoTZ8 = cal.fusionTempoSI1(lanmark2, arrayTempoZI, arrayTempoZC);

            sumad1z = indCH.distanciaSeparacionCluster(calculoTZ7, cenGeneralz, calculoTZ8);
            System.out.println("Numerador " + sumad1z);
            numElementosZ = numElementosZ + 1;
            numClusterZ = numClusterZ + 1;
            System.out.println("Numero de elementos " + numElementosZ);
            System.out.println("Numero de Cluster " + numClusterZ);

            indiceValidezz = sumad1z / sumadz;
            indiceValidez1z = (numElementosZ - numClusterZ) / (numClusterZ - 1);
            indiceValidezfinalz = indiceValidezz * indiceValidez1z;

            guiAFusionar.jTZFIndiceCHEM.setText(String.valueOf(indiceValidezfinalz));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDBZ = 0;
            double sumaMaxTotalZ = 0;
            double numClusterDBZ = 0;
            double indiceDBZ = 0;
            ArrayList sumamaxZ = new ArrayList();
            double sumaMaximosZ = 0;

            ////////// DENOMINADOR /////////
            calculoTZprueba2 = indDB.fusionTempoPPC(lanmark2, arrayTempoZC, arrayTempoZI);
            arraySCKZ = indDB.distanciaClusterFusionados(lanmark2, arrayTempoZNC1, arrayTempoZNI1);

            for (int i = 0; i < arraySCKZ.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKZ.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoTZ7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamaxZ = indDB.distanciaSeparacionCluster1(calculoTZ7, arraySCKZ);
            for (int i = 0; i < sumamaxZ.size(); i++) {
                sumaMaximosZ = Double.parseDouble((String) sumamaxZ.get(i));

                if (Double.isNaN(sumaMaximosZ) == true) {

                } else {

                    System.out.println("La distancia maxima " + i + " es: " + sumamaxZ.get(i));
                    sumaMaxTotalZ = sumaMaxTotalZ + Double.parseDouble((String) sumamaxZ.get(i));
                    numClusterDBZ = numClusterDBZ + 1;
                }
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalZ);
            indiceDBZ = (1 / numClusterDBZ) * sumaMaxTotalZ;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBZ);
            guiAFusionar.jTZFIndiceDBEM.setText(String.valueOf(indiceDBZ));
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneralz = 0;
            double sumadz = 0;
            double sumad1z = 0;
            double indiceValidezz = 0;
            double indiceValidez1z = 0;
            double indiceValidezfinalz = 0;
            ////////// DENOMINADOR /////////
            calculoTZprueba = indCH.fusionTempoPMC(lanmark2, arrayTempoZC);
            calculoTZ6 = indCH.distanciaClusterFusionados(lanmark2, arrayTempoZNC1, arrayTempoZNI1);
            sumadz = calculoTZ6;
            System.out.println("Denominador " + sumadz);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneralz = indCH.calculoCentroideGeneral(arrayTempoZNI1);
            System.out.println("Centroide Genral: " + cenGeneralz);

            calculoTZ7 = cal.fusionTempoPMC1(lanmark2, arrayTempoZC);
            calculoTZ8 = cal.fusionTempoSI1(lanmark2, arrayTempoZI, arrayTempoZC);

            sumad1z = indCH.distanciaSeparacionCluster(calculoTZ7, cenGeneralz, calculoTZ8);
            System.out.println("Numerador " + sumad1z);
            numElementosZ = numElementosZ;
            numClusterZ = numClusterZ;
            System.out.println("Numero de elementos " + numElementosZ);
            System.out.println("Numero de Cluster " + numClusterZ);

            indiceValidezz = sumad1z / sumadz;
            indiceValidez1z = (numElementosZ - numClusterZ) / (numClusterZ - 1);
            indiceValidezfinalz = indiceValidezz * indiceValidez1z;

            guiAFusionar.jTZFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinalz));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDBZ = 0;
            double sumaMaxTotalZ = 0;
            double numClusterDBZ = 0;
            double indiceDBZ = 0;
            ArrayList sumamaxZ = new ArrayList();
            double sumaMaximosZ = 0;

            ////////// DENOMINADOR /////////
            calculoTZprueba2 = indDB.fusionTempoPMC(lanmark2, arrayTempoZC);
            arraySCKZ = indDB.distanciaClusterFusionados(lanmark2, arrayTempoZNC1, arrayTempoZNI1);

            for (int i = 0; i < arraySCKZ.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKZ.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoTZ7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamaxZ = indDB.distanciaSeparacionCluster1(calculoTZ7, arraySCKZ);
            for (int i = 0; i < sumamaxZ.size(); i++) {
                sumaMaximosZ = Double.parseDouble((String) sumamaxZ.get(i));

                if (Double.isNaN(sumaMaximosZ) == true) {

                } else {

                    System.out.println("La distancia maxima " + i + " es: " + sumamaxZ.get(i));
                    sumaMaxTotalZ = sumaMaxTotalZ + Double.parseDouble((String) sumamaxZ.get(i));
                    numClusterDBZ = numClusterDBZ + 1;
                }
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalZ);
            indiceDBZ = (1 / numClusterDBZ) * sumaMaxTotalZ;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBZ);
            guiAFusionar.jTZFIndiceDBPAEM.setText(String.valueOf(indiceDBZ));
        }

            ////////////////////////// DURACION //////////////////////////////
        ////// Duracion en X ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListDuracionXNC = new ArrayList<String>(Arrays.asList(arregloduracionXNCEM.split(",")));
        ArrayList arrayDuracionXNC1 = new ArrayList();
        arrayDuracionXNC1 = myListDuracionXNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListDuracionXNI = new ArrayList<String>(Arrays.asList(arregloduracionXNIEM.split(",")));
        ArrayList arrayDuracionXNI1 = new ArrayList();
        arrayDuracionXNI1 = myListDuracionXNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListD = new ArrayList<String>(Arrays.asList(arreglopruebaDEM.split(",")));
        ArrayList arrayDuracionXI = new ArrayList();
        arrayDuracionXI = myListD;
        //////////////////////////
        ArrayList<String> myList1D = new ArrayList<String>(Arrays.asList(arregloprueba1DEM.split(",")));
        ArrayList arrayDuracionXC = new ArrayList();
        arrayDuracionXC = myList1D;
        //////////////////////
        ArrayList<String> myList2D = new ArrayList<String>(Arrays.asList(arregloprueba2DEM.split(",")));
        ArrayList arrayDuracionXT = new ArrayList();
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

        System.out.println("///////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayDuracionXNC1.size(); i++) {
            guiAFusionar.jTextNCNIDXEM.append((String) "Cluster " + arrayDuracionXNC1.get(i) + (String) "Instancia " + arrayDuracionXNI1.get(i) + " \n");
            numElementosD = i;
            numElementosPAD = i;
        }
        for (int i = 0; i < arrayDuracionXI.size(); i++) {
            guiAFusionar.jTextGCDXEM.append((String) "Cluster [" + i + "]" + arrayDuracionXI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayDuracionXC.get(i) + " \n");
        }

        for (int i = 0; i < arrayDuracionXT.size(); i++) {
            guiAFusionar.jTextALDXEM.append((String) "[Cluster " + i + "]" + arrayDuracionXT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkD = arregloprueba2DEM.split(","); ////// Convertir string a String []

        calculoDX1 = cal1.fusionDuracion(lanmarkD);
        for (int i = 0; i < calculoDX1.size(); i++) {
            guiAFusionar.jTextFusionDXEM.append((String) calculoDX1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoDX2 = cal1.fusionDuracionPMC(lanmarkD, arrayDuracionXC); // Promedio Aritmetico
        arregloPADXEM = cal1.fusionDuracionPMC1(lanmarkD, arrayDuracionXC);
        arregloPADX1EM = cal1.fusionDuracionPMC2(lanmarkD, arrayDuracionXC);

        for (int i = 0; i < calculoDX2.size(); i++) {
            guiAFusionar.jTextFusionDXFEM.append((String) calculoDX2.get(i) + "\n");
        }

        calculoDX3 = cal1.fusionDuracionSI(lanmarkD, arrayDuracionXI, arrayDuracionXC);
        arregloInstanciasDXEM = cal1.fusionDuracionSI1(lanmarkD, arrayDuracionXI, arrayDuracionXC);
        arregloInstanciasDX1EM = cal1.fusionDuracionSI2(lanmarkD, arrayDuracionXI, arrayDuracionXC);

        for (int i = 0; i < calculoDX3.size(); i++) {
            guiAFusionar.jTextFusionDXFIEM.append((String) calculoDX3.get(i) + "\n");
        }
        calculoDX4 = cal1.fusionDuracionPPC(lanmarkD, arrayDuracionXC, arrayDuracionXI);
        arregloPPDXEM = cal1.fusionDuracionPPC1(lanmarkD, arrayDuracionXC, arrayDuracionXI);
        arregloPPDX1EM = cal1.fusionDuracionPPC2(lanmarkD, arrayDuracionXC, arrayDuracionXI);

        for (int i = 0; i < calculoDX4.size(); i++) {
            guiAFusionar.jTextFusionDXFPPEM.append((String) calculoDX4.get(i) + "\n");
            numClusterD = i;
            numClusterPAD = i;
        }

        calculoDX5 = cal1.fusionDuracionInstancias(lanmarkD, arrayDuracionXNC1, arrayDuracionXNI1);
        for (int i = 0; i < calculoDX5.size(); i++) {
            guiAFusionar.jTextFusionDXFNCIEM.append((String) "Cluster " + i + " " + calculoDX5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDXprueba = indCH.fusionDuracionPPC(lanmarkD, arrayDuracionXC, arrayDuracionXI);
            calculoDX6 = indCH.distanciaClusterFusionadosDuracion(lanmarkD, arrayDuracionXNC1, arrayDuracionXNI1);
            sumad = calculoDX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoDX7 = cal1.fusionDuracionPPC1(lanmarkD, arrayDuracionXC, arrayDuracionXI);
            calculoDX8 = cal1.fusionDuracionSI1(lanmarkD, arrayDuracionXI, arrayDuracionXC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoDX7, cenGeneral, calculoDX8);
            System.out.println("Numerador " + sumad1);
            numElementosD = numElementosD + 1;
            numClusterD = numClusterD + 1;
            System.out.println("Numero de elementos " + numElementosD);
            System.out.println("Numero de Cluster " + numClusterD);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosD - numClusterD) / (numClusterD - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jDXFIndiceCHEM.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDXprueba2 = indDB.fusionDuracionPPC(lanmarkD, arrayDuracionXC, arrayDuracionXI);
            arraySCKXD = indDB.distanciaClusterFusionadosDuracion(lanmarkD, arrayDuracionXNC1, arrayDuracionXNI1);

            for (int i = 0; i < arraySCKXD.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXD.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoDX7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoDX7, arraySCKXD);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jDXFIndiceDBEM.setText(String.valueOf(indiceDB));

        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");

            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDXprueba = indCH.fusionDuracionPMC(lanmarkD, arrayDuracionXC);
            calculoDX6 = indCH.distanciaClusterFusionadosDuracion(lanmarkD, arrayDuracionXNC1, arrayDuracionXNI1);
            sumad = calculoDX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoDX7 = cal1.fusionDuracionPMC1(lanmarkD, arrayDuracionXC);
            calculoDX8 = cal1.fusionDuracionSI1(lanmarkD, arrayDuracionXI, arrayDuracionXC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoDX7, cenGeneral, calculoDX8);
            System.out.println("Numerador " + sumad1);
            numElementosPAD = numElementosPAD + 1;
            numClusterPAD = numClusterPAD + 1;
            System.out.println("Numero de elementos " + numElementosPAD);
            System.out.println("Numero de Cluster " + numClusterPAD);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosPAD - numClusterPAD) / (numClusterPAD - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jDXFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinal));

            System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDXprueba2 = indDB.fusionDuracionPMC(lanmarkD, arrayDuracionXC);
            arraySCKXD = indDB.distanciaClusterFusionadosDuracion(lanmarkD, arrayDuracionXNC1, arrayDuracionXNI1);

            for (int i = 0; i < arraySCKXD.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXD.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoDX7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoDX7, arraySCKXD);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jDXFIndiceDBPAEM.setText(String.valueOf(indiceDB));

        }

              ////// Duracion en Y ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListDuracionYNC = new ArrayList<String>(Arrays.asList(arregloduracionYNCEM.split(",")));
        ArrayList arrayDuracionYNC1 = new ArrayList();
        arrayDuracionYNC1 = myListDuracionYNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListDuracionYNI = new ArrayList<String>(Arrays.asList(arregloduracionYNIEM.split(",")));
        ArrayList arrayDuracionYNI1 = new ArrayList();
        arrayDuracionYNI1 = myListDuracionYNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListDY = new ArrayList<String>(Arrays.asList(arregloprueba3DEM.split(",")));
        ArrayList arrayDuracionYI = new ArrayList();
        arrayDuracionYI = myListDY;
        //////////////////////////
        ArrayList<String> myList1DY = new ArrayList<String>(Arrays.asList(arregloprueba4DEM.split(",")));
        ArrayList arrayDuracionYC = new ArrayList();
        arrayDuracionYC = myList1DY;
        //////////////////////
        ArrayList<String> myList2DY = new ArrayList<String>(Arrays.asList(arregloprueba5DEM.split(",")));
        ArrayList arrayDuracionYT = new ArrayList();
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

        System.out.println("////////////////////////////////////////////////////////////// DURACION Y EM //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

        for (int i = 0; i < arrayDuracionYNC1.size(); i++) {
            guiAFusionar.jTextNCNIDYEM.append((String) "Cluster " + arrayDuracionYNC1.get(i) + (String) "Instancia " + arrayDuracionYNI1.get(i) + " \n");
            numElementosDY = i;
            numElementosPADY = i;
        }
        for (int i = 0; i < arrayDuracionYI.size(); i++) {
            guiAFusionar.jTextGCDYEM.append((String) "Cluster [" + i + "]" + arrayDuracionYI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayDuracionYC.get(i) + " \n");
        }

        for (int i = 0; i < arrayDuracionYT.size(); i++) {
            guiAFusionar.jTextALDYEM.append((String) "[Cluster " + i + "]" + arrayDuracionYT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkDY = arregloprueba5DEM.split(","); ////// Convertir string a String []

        calculoDY1 = cal1.fusionDuracion(lanmarkDY);
        for (int i = 0; i < calculoDY1.size(); i++) {
            guiAFusionar.jTextFusionDYEM.append((String) calculoDY1.get(i) + "\n");
        }

        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoDY2 = cal1.fusionDuracionPMC(lanmarkDY, arrayDuracionYC); // Promedio Aritmetico
        arregloPADYEM = cal1.fusionDuracionPMC1(lanmarkDY, arrayDuracionYC);
        arregloPADY1EM = cal1.fusionDuracionPMC2(lanmarkDY, arrayDuracionYC);
        for (int i = 0; i < calculoDY2.size(); i++) {
            guiAFusionar.jTextFusionDYFEM.append((String) calculoDY2.get(i) + "\n");
        }

        calculoDY3 = cal1.fusionDuracionSI(lanmarkDY, arrayDuracionYI, arrayDuracionYC);
        arregloInstanciasDYEM = cal1.fusionDuracionSI1(lanmarkDY, arrayDuracionYI, arrayDuracionYC);
        arregloInstanciasDY1EM = cal1.fusionDuracionSI2(lanmarkDY, arrayDuracionYI, arrayDuracionYC);

        for (int i = 0; i < calculoDY3.size(); i++) {
            guiAFusionar.jTextFusionDYFIEM.append((String) calculoDY3.get(i) + "\n");
        }
        calculoDY4 = cal1.fusionDuracionPPC(lanmarkDY, arrayDuracionYC, arrayDuracionYI);
        arregloPPDYEM = cal1.fusionDuracionPPC1(lanmarkDY, arrayDuracionYC, arrayDuracionYI);
        arregloPPDY1EM = cal1.fusionDuracionPPC2(lanmarkDY, arrayDuracionYC, arrayDuracionYI);

        for (int i = 0; i < calculoDY4.size(); i++) {
            guiAFusionar.jTextFusionDYFPPEM.append((String) calculoDY4.get(i) + "\n");
            numClusterDY = i;
            numClusterPADY = i;
        }

        calculoDY5 = cal1.fusionDuracionInstancias(lanmarkDY, arrayDuracionYNC1, arrayDuracionYNI1);
        for (int i = 0; i < calculoDY5.size(); i++) {
            guiAFusionar.jTextFusionDYFNCIEM.append((String) "Cluster " + i + " " + calculoDY5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDYprueba = indCH.fusionDuracionPPC(lanmarkDY, arrayDuracionYC, arrayDuracionYI);
            calculoDY6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDY, arrayDuracionYNC1, arrayDuracionYNI1);
            sumad = calculoDY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoDY7 = cal1.fusionDuracionPPC1(lanmarkDY, arrayDuracionYC, arrayDuracionYI);
            calculoDY8 = cal1.fusionDuracionSI1(lanmarkDY, arrayDuracionYI, arrayDuracionYC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoDY7, cenGeneral, calculoDY8);
            System.out.println("Numerador " + sumad1);
            numElementosDY = numElementosDY + 1;
            numClusterDY = numClusterDY + 1;
            System.out.println("Numero de elementos " + numElementosDY);
            System.out.println("Numero de Cluster " + numClusterDY);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosDY - numClusterDY) / (numClusterDY - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jDYFIndiceCHEM.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDYprueba2 = indDB.fusionDuracionPPC(lanmarkDY, arrayDuracionYC, arrayDuracionYI);
            arraySCKXDY = indDB.distanciaClusterFusionadosDuracion(lanmarkDY, arrayDuracionYNC1, arrayDuracionYNI1);

            for (int i = 0; i < arraySCKXDY.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXDY.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoDY7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoDY7, arraySCKXDY);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jDYFIndiceDBEM.setText(String.valueOf(indiceDB));

        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");

            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDYprueba = indCH.fusionDuracionPMC(lanmarkDY, arrayDuracionYC);
            calculoDY6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDY, arrayDuracionYNC1, arrayDuracionYNI1);
            sumad = calculoDY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoDY7 = cal1.fusionDuracionPMC1(lanmarkDY, arrayDuracionYC);
            calculoDY8 = cal1.fusionDuracionSI1(lanmarkDY, arrayDuracionYI, arrayDuracionYC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoDY7, cenGeneral, calculoDY8);
            System.out.println("Numerador " + sumad1);
            numElementosPADY = numElementosPADY + 1;
            numClusterPADY = numClusterPADY + 1;
            System.out.println("Numero de elementos " + numElementosPADY);
            System.out.println("Numero de Cluster " + numClusterPADY);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosPADY - numClusterPADY) / (numClusterPADY - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jDYFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinal));

            System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDYprueba2 = indDB.fusionDuracionPMC(lanmarkDY, arrayDuracionYC);
            arraySCKXDY = indDB.distanciaClusterFusionadosDuracion(lanmarkDY, arrayDuracionYNC1, arrayDuracionYNI1);

            for (int i = 0; i < arraySCKXDY.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXDY.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoDY7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoDY7, arraySCKXDY);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jDYFIndiceDBPAEM.setText(String.valueOf(indiceDB));

        }

      /////////////////////////////////////////////////////////////////////////////////////////////////////////////
              //////////////////////////////////////////////////////////////////////////////////////////////////        
       ////// Duracion en Z ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListDuracionZNC = new ArrayList<String>(Arrays.asList(arregloduracionZNCEM.split(",")));
        ArrayList arrayDuracionZNC1 = new ArrayList();
        arrayDuracionZNC1 = myListDuracionZNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListDuracionZNI = new ArrayList<String>(Arrays.asList(arregloduracionZNIEM.split(",")));
        ArrayList arrayDuracionZNI1 = new ArrayList();
        arrayDuracionZNI1 = myListDuracionZNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListDZ = new ArrayList<String>(Arrays.asList(arregloprueba6DEM.split(",")));
        ArrayList arrayDuracionZI = new ArrayList();
        arrayDuracionZI = myListDZ;
        //////////////////////////
        ArrayList<String> myList1DZ = new ArrayList<String>(Arrays.asList(arregloprueba7DEM.split(",")));
        ArrayList arrayDuracionZC = new ArrayList();
        arrayDuracionZC = myList1DZ;
        //////////////////////
        ArrayList<String> myList2DZ = new ArrayList<String>(Arrays.asList(arregloprueba8DEM.split(",")));
        ArrayList arrayDuracionZT = new ArrayList();
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

        System.out.println("///////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayDuracionZNC1.size(); i++) {
            guiAFusionar.jTextNCNIDZEM.append((String) "Cluster " + arrayDuracionZNC1.get(i) + (String) "Instancia " + arrayDuracionZNI1.get(i) + " \n");
            numElementosDZ = i;
            numElementosPADZ = i;
        }
        for (int i = 0; i < arrayDuracionZI.size(); i++) {
            guiAFusionar.jTextGCDZEM.append((String) "Cluster [" + i + "]" + arrayDuracionZI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayDuracionZC.get(i) + " \n");
        }

        for (int i = 0; i < arrayDuracionZT.size(); i++) {
            guiAFusionar.jTextALDZEM.append((String) "[Cluster " + i + "]" + arrayDuracionZT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkDZ = arregloprueba8DEM.split(","); ////// Convertir string a String []

        calculoDZ1 = cal1.fusionDuracion(lanmarkDZ);
        for (int i = 0; i < calculoDZ1.size(); i++) {
            guiAFusionar.jTextFusionDZEM.append((String) calculoDZ1.get(i) + "\n");
        }

        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoDZ2 = cal1.fusionDuracionPMC(lanmarkDZ, arrayDuracionZC); // Promedio Aritmetico
        arregloPADZEM = cal1.fusionDuracionPMC1(lanmarkDZ, arrayDuracionZC);
        arregloPADZ1EM = cal1.fusionDuracionPMC2(lanmarkDZ, arrayDuracionZC);
        for (int i = 0; i < calculoDZ2.size(); i++) {
            guiAFusionar.jTextFusionDZFEM.append((String) calculoDZ2.get(i) + "\n");
        }

        calculoDZ3 = cal1.fusionDuracionSI(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);
        arregloInstanciasDZEM = cal1.fusionDuracionSI1(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);
        arregloInstanciasDZ1EM = cal1.fusionDuracionSI2(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);

        for (int i = 0; i < calculoDZ3.size(); i++) {
            guiAFusionar.jTextFusionDZFIEM.append((String) calculoDZ3.get(i) + "\n");
        }
        calculoDZ4 = cal1.fusionDuracionPPC(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);
        arregloPPDZEM = cal1.fusionDuracionPPC1(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);
        arregloPPDZ1EM = cal1.fusionDuracionPPC2(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);

        for (int i = 0; i < calculoDZ4.size(); i++) {
            guiAFusionar.jTextFusionDZFPPEM.append((String) calculoDZ4.get(i) + "\n");
            numClusterDZ = i;
            numClusterPADZ = i;
        }

        calculoDZ5 = cal1.fusionDuracionInstancias(lanmarkDZ, arrayDuracionZNC1, arrayDuracionZNI1);
        for (int i = 0; i < calculoDZ5.size(); i++) {
            guiAFusionar.jTextFusionDZFNCIEM.append((String) "Cluster " + i + " " + calculoDZ5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDZprueba = indCH.fusionDuracionPPC(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);
            calculoDZ6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDZ, arrayDuracionZNC1, arrayDuracionZNI1);
            sumad = calculoDZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoDZ7 = cal1.fusionDuracionPPC1(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);
            calculoDZ8 = cal1.fusionDuracionSI1(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoDZ7, cenGeneral, calculoDZ8);
            System.out.println("Numerador " + sumad1);
            numElementosDZ = numElementosDZ + 1;
            numClusterDZ = numClusterDZ + 1;
            System.out.println("Numero de elementos " + numElementosDZ);
            System.out.println("Numero de Cluster " + numClusterDZ);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosDZ - numClusterDZ) / (numClusterDZ - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jDZFIndiceCHEM.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDZprueba2 = indDB.fusionDuracionPPC(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);
            arraySCKXDZ = indDB.distanciaClusterFusionadosDuracion(lanmarkDZ, arrayDuracionZNC1, arrayDuracionZNI1);

            for (int i = 0; i < arraySCKXDZ.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXDZ.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoDZ7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoDZ7, arraySCKXDZ);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jDZFIndiceDBEM.setText(String.valueOf(indiceDB));

        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");

            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoDZprueba = indCH.fusionDuracionPMC(lanmarkDZ, arrayDuracionZC);
            calculoDZ6 = indCH.distanciaClusterFusionadosDuracion(lanmarkDZ, arrayDuracionZNC1, arrayDuracionZNI1);
            sumad = calculoDZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayDuracionZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoDZ7 = cal1.fusionDuracionPMC1(lanmarkDZ, arrayDuracionZC);
            calculoDZ8 = cal1.fusionDuracionSI1(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoDZ7, cenGeneral, calculoDZ8);
            System.out.println("Numerador " + sumad1);
            numElementosPADZ = numElementosPADZ + 1;
            numClusterPADZ = numClusterPADZ + 1;
            System.out.println("Numero de elementos " + numElementosPADZ);
            System.out.println("Numero de Cluster " + numClusterPADZ);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosPADZ - numClusterPADZ) / (numClusterPADZ - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jDZFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinal));

            System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoDZprueba2 = indDB.fusionDuracionPMC(lanmarkDZ, arrayDuracionZC);
            arraySCKXDZ = indDB.distanciaClusterFusionadosDuracion(lanmarkDZ, arrayDuracionZNC1, arrayDuracionZNI1);

            for (int i = 0; i < arraySCKXDZ.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXDZ.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoDZ7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoDZ7, arraySCKXDZ);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jDZFIndiceDBPAEM.setText(String.valueOf(indiceDB));

        }

            //////////////////////////////////////////////////////////////////////////////////////////////////        
        ////////////// OCTAVA ////////////
        System.out.println("////////////////////////// OCTAVA EN EM/////////////////////////////////");
                     ////// OCTAVA en X ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListOctavaXNC = new ArrayList<String>(Arrays.asList(arreglooctavaXNCEM.split(",")));
        ArrayList arrayOctavaXNC1 = new ArrayList();
        arrayOctavaXNC1 = myListOctavaXNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListOctavaXNI = new ArrayList<String>(Arrays.asList(arreglooctavaXNIEM.split(",")));
        ArrayList arrayOctavaXNI1 = new ArrayList();
        arrayOctavaXNI1 = myListOctavaXNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListO = new ArrayList<String>(Arrays.asList(arreglopruebaOEM.split(",")));
        ArrayList arrayOctavaXI = new ArrayList();
        arrayOctavaXI = myListO;
        //////////////////////////
        ArrayList<String> myList1O = new ArrayList<String>(Arrays.asList(arregloprueba1OEM.split(",")));
        ArrayList arrayOctavaXC = new ArrayList();
        arrayOctavaXC = myList1O;
        //////////////////////
        ArrayList<String> myList2O = new ArrayList<String>(Arrays.asList(arregloprueba2OEM.split(",")));
        ArrayList arrayOctavaXT = new ArrayList();
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

        System.out.println("///////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayOctavaXNC1.size(); i++) {
            guiAFusionar.jTextNCNIOXEM.append((String) "Cluster " + arrayOctavaXNC1.get(i) + (String) "Instancia " + arrayOctavaXNI1.get(i) + " \n");
            numElementosO = i;
            numElementosPAO = i;
        }
        for (int i = 0; i < arrayOctavaXI.size(); i++) {
            guiAFusionar.jTextGCOXEM.append((String) "Cluster [" + i + "]" + arrayOctavaXI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayOctavaXC.get(i) + " \n");

        }

        for (int i = 0; i < arrayOctavaXT.size(); i++) {
            guiAFusionar.jTextALOXEM.append((String) "[Cluster " + i + "]" + arrayOctavaXT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkO = arregloprueba2OEM.split(","); ////// Convertir string a String []
        /////////////////

        calculoOX1 = cal2.fusionOctava(lanmarkO);
        for (int i = 0; i < calculoOX1.size(); i++) {
            guiAFusionar.jTextFusionOXEM.append((String) calculoOX1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoOX2 = cal2.fusionOctavaPMC(lanmarkO, arrayOctavaXC); // Promedio Aritmetico
        arregloPAOXEM = cal2.fusionOctavaPMC1(lanmarkO, arrayOctavaXC);
        arregloPAOX1EM = cal2.fusionOctavaPMC2(lanmarkO, arrayOctavaXC);
        for (int i = 0; i < calculoOX2.size(); i++) {
            guiAFusionar.jTextFusionOXFEM.append((String) calculoOX2.get(i) + "\n");
        }

        calculoOX3 = cal2.fusionOctavaSI(lanmarkO, arrayOctavaXI, arrayOctavaXC);
        arregloInstanciasOXEM = cal2.fusionOctavaSI1(lanmarkO, arrayOctavaXI, arrayOctavaXC);
        arregloInstanciasOX1EM = cal2.fusionOctavaSI2(lanmarkO, arrayOctavaXI, arrayOctavaXC);

        for (int i = 0; i < calculoOX3.size(); i++) {
            guiAFusionar.jTextFusionOXFIEM.append((String) calculoOX3.get(i) + "\n");
        }
        calculoOX4 = cal2.fusionOctavaPPC(lanmarkO, arrayOctavaXC, arrayOctavaXI);
        arregloPPOXEM = cal2.fusionOctavaPPC1(lanmarkO, arrayOctavaXC, arrayOctavaXI);
        arregloPPOX1EM = cal2.fusionOctavaPPC2(lanmarkO, arrayOctavaXC, arrayOctavaXI);

        for (int i = 0; i < calculoOX4.size(); i++) {
            guiAFusionar.jTextFusionOXFPPEM.append((String) calculoOX4.get(i) + "\n");
            numClusterO = i;
            numClusterPAO = i;
        }

        calculoOX5 = cal2.fusionOctavaInstancias(lanmarkO, arrayOctavaXNC1, arrayOctavaXNI1);
        for (int i = 0; i < calculoOX5.size(); i++) {
            guiAFusionar.jTextFusionOXFNCIEM.append((String) "Cluster " + i + " " + calculoOX5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOXprueba = indCH.fusionOctavaPPC(lanmarkO, arrayOctavaXC, arrayOctavaXI);
            calculoOX6 = indCH.distanciaClusterFusionadosOctava(lanmarkO, arrayOctavaXNC1, arrayOctavaXNI1);
            sumad = calculoOX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoOX7 = cal2.fusionOctavaPPC1(lanmarkO, arrayOctavaXC, arrayOctavaXI);
            calculoOX8 = cal2.fusionOctavaSI1(lanmarkO, arrayOctavaXI, arrayOctavaXC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoOX7, cenGeneral, calculoOX8);
            System.out.println("Numerador " + sumad1);
            numElementosO = numElementosO + 1;
            numClusterO = numClusterO + 1;
            System.out.println("Numero de elementos " + numElementosO);
            System.out.println("Numero de Cluster " + numClusterO);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosO - numClusterO) / (numClusterO - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jOXFIndiceCHEM.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOXprueba2 = indDB.fusionOctavaPPC(lanmarkO, arrayOctavaXC, arrayOctavaXI);
            arraySCKXO = indDB.distanciaClusterFusionadosOctava(lanmarkO, arrayOctavaXNC1, arrayOctavaXNI1);

            for (int i = 0; i < arraySCKXO.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXO.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoOX7);
            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoOX7, arraySCKXO);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jOXFIndiceDBEM.setText(String.valueOf(indiceDB));

        }
        System.out.println("////////////////////////// OCTAVA 2 EN X MEANS/////////////////////////////////");

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////

            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOXprueba = indCH.fusionOctavaPMC(lanmarkO, arrayOctavaXC);
            calculoOX6 = indCH.distanciaClusterFusionadosOctava(lanmarkO, arrayOctavaXNC1, arrayOctavaXNI1);
            sumad = calculoOX6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaXNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoOX7 = cal2.fusionOctavaPMC1(lanmarkO, arrayOctavaXC);
            calculoOX8 = cal2.fusionOctavaSI1(lanmarkO, arrayOctavaXI, arrayOctavaXC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoOX7, cenGeneral, calculoOX8);
            System.out.println("Numerador " + sumad1);
            numElementosPAO = numElementosPAO + 1;
            numClusterPAO = numClusterPAO + 1;
            System.out.println("Numero de elementos " + numElementosPAO);
            System.out.println("Numero de Cluster " + numClusterPAO);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosPAO - numClusterPAO) / (numClusterPAO - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jOXFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinal));

            System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOXprueba2 = indDB.fusionOctavaPMC(lanmarkO, arrayOctavaXC);
            arraySCKXO = indDB.distanciaClusterFusionadosOctava(lanmarkO, arrayOctavaXNC1, arrayOctavaXNI1);

            for (int i = 0; i < arraySCKXO.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKXO.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoOX7);
            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoOX7, arraySCKXO);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jOXFIndiceDBPAEM.setText(String.valueOf(indiceDB));

        }

            //////////////////////////////////////////////////////////////////////////////////////////////////
                    ////// OCTAVA en Y ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListOctavaYNC = new ArrayList<String>(Arrays.asList(arreglooctavaYNCEM.split(",")));
        ArrayList arrayOctavaYNC1 = new ArrayList();
        arrayOctavaYNC1 = myListOctavaYNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListOctavaYNI = new ArrayList<String>(Arrays.asList(arreglooctavaYNIEM.split(",")));
        ArrayList arrayOctavaYNI1 = new ArrayList();
        arrayOctavaYNI1 = myListOctavaYNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListOY = new ArrayList<String>(Arrays.asList(arregloprueba3OEM.split(",")));
        ArrayList arrayOctavaYI = new ArrayList();
        arrayOctavaYI = myListOY;
        //////////////////////////
        ArrayList<String> myList1OY = new ArrayList<String>(Arrays.asList(arregloprueba4OEM.split(",")));
        ArrayList arrayOctavaYC = new ArrayList();
        arrayOctavaYC = myList1OY;
        //////////////////////
        ArrayList<String> myList2OY = new ArrayList<String>(Arrays.asList(arregloprueba5OEM.split(",")));
        ArrayList arrayOctavaYT = new ArrayList();
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

        System.out.println("///////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayOctavaYNC1.size(); i++) {
            guiAFusionar.jTextNCNIOYEM.append((String) "Cluster " + arrayOctavaYNC1.get(i) + (String) "Instancia " + arrayOctavaYNI1.get(i) + " \n");
            numElementosOY = i;
            numElementosPAOY = i;
        }
        for (int i = 0; i < arrayOctavaYI.size(); i++) {
            guiAFusionar.jTextGCOYEM.append((String) "Cluster [" + i + "]" + arrayOctavaYI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayOctavaYC.get(i) + " \n");
        }

        for (int i = 0; i < arrayOctavaYT.size(); i++) {
            guiAFusionar.jTextALOYEM.append((String) "[Cluster " + i + "]" + arrayOctavaYT.get(i) + " \n");

        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkOY = arregloprueba5OEM.split(","); ////// Convertir string a String []

        calculoOY1 = cal2.fusionOctava(lanmarkOY);
        for (int i = 0; i < calculoOY1.size(); i++) {
            guiAFusionar.jTextFusionOYEM.append((String) calculoOY1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoOY2 = cal2.fusionOctavaPMC(lanmarkOY, arrayOctavaYC); // Promedio Aritmetico
        arregloPAOYEM = cal2.fusionOctavaPMC1(lanmarkOY, arrayOctavaYC);
        arregloPAOY1EM = cal2.fusionOctavaPMC2(lanmarkOY, arrayOctavaYC);
        for (int i = 0; i < calculoOY2.size(); i++) {
            guiAFusionar.jTextFusionOYFEM.append((String) calculoOY2.get(i) + "\n");
        }

        calculoOY3 = cal2.fusionOctavaSI(lanmarkOY, arrayOctavaYI, arrayOctavaYC);
        arregloInstanciasOYEM = cal2.fusionOctavaSI1(lanmarkOY, arrayOctavaYI, arrayOctavaYC);
        arregloInstanciasOY1EM = cal2.fusionOctavaSI2(lanmarkOY, arrayOctavaYI, arrayOctavaYC);

        for (int i = 0; i < calculoOY3.size(); i++) {
            guiAFusionar.jTextFusionOYFIEM.append((String) calculoOY3.get(i) + "\n");
        }
        calculoOY4 = cal2.fusionOctavaPPC(lanmarkOY, arrayOctavaYC, arrayOctavaYI);
        arregloPPOYEM = cal2.fusionOctavaPPC1(lanmarkOY, arrayOctavaYC, arrayOctavaYI);
        arregloPPOY1EM = cal2.fusionOctavaPPC2(lanmarkOY, arrayOctavaYC, arrayOctavaYI);

        for (int i = 0; i < calculoOY4.size(); i++) {
            guiAFusionar.jTextFusionOYFPPEM.append((String) calculoOY4.get(i) + "\n");
            numClusterOY = i;
            numClusterPAOY = i;
        }

        calculoOY5 = cal2.fusionOctavaInstancias(lanmarkOY, arrayOctavaYNC1, arrayOctavaYNI1);
        for (int i = 0; i < calculoOY5.size(); i++) {
            guiAFusionar.jTextFusionOYFNCIEM.append((String) "Cluster " + i + " " + calculoOY5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOYprueba = indCH.fusionOctavaPPC(lanmarkOY, arrayOctavaYC, arrayOctavaYI);
            calculoOY6 = indCH.distanciaClusterFusionadosOctava(lanmarkOY, arrayOctavaYNC1, arrayOctavaYNI1);
            sumad = calculoOY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoOY7 = cal2.fusionOctavaPPC1(lanmarkOY, arrayOctavaYC, arrayOctavaYI);
            calculoOY8 = cal2.fusionOctavaSI1(lanmarkOY, arrayOctavaYI, arrayOctavaYC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoOY7, cenGeneral, calculoOY8);
            System.out.println("Numerador " + sumad1);
            numElementosOY = numElementosOY + 1;
            numClusterOY = numClusterOY + 1;
            System.out.println("Numero de elementos " + numElementosOY);
            System.out.println("Numero de Cluster " + numClusterOY);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosOY - numClusterOY) / (numClusterOY - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;
            System.out.println("(" + sumad1 + " / " + sumad + ")" + " * " + "( " + numElementosOY + " - " + numClusterOY + ")" + " / " + numClusterOY + " - " + " 1");

            System.out.println("CALINSKI - HARABAZ " + indiceValidezfinal);
            guiAFusionar.jOYFIndiceCHEM.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
           ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOYprueba2 = indDB.fusionOctavaPPC(lanmarkOY, arrayOctavaYC, arrayOctavaYI);
            arraySCKYO = indDB.distanciaClusterFusionadosOctava(lanmarkOY, arrayOctavaYNC1, arrayOctavaYNI1);

            for (int i = 0; i < arraySCKYO.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKYO.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoOY7);
            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoOY7, arraySCKYO);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jOYFIndiceDBEM.setText(String.valueOf(indiceDB));

        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");

            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOYprueba = indCH.fusionOctavaPMC(lanmarkOY, arrayOctavaYC);
            calculoOY6 = indCH.distanciaClusterFusionadosOctava(lanmarkOY, arrayOctavaYNC1, arrayOctavaYNI1);
            sumad = calculoOY6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaYNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoOY7 = cal2.fusionOctavaPMC1(lanmarkOY, arrayOctavaYC);
            calculoOY8 = cal2.fusionOctavaSI1(lanmarkOY, arrayOctavaYI, arrayOctavaYC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoOY7, cenGeneral, calculoOY8);
            System.out.println("Numerador " + sumad1);
            numElementosPAOY = numElementosPAOY + 1;
            numClusterPAOY = numClusterPAOY + 1;
            System.out.println("Numero de elementos " + numElementosPAOY);
            System.out.println("Numero de Cluster " + numClusterPAOY);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosPAOY - numClusterPAOY) / (numClusterPAOY - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jOYFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinal));
            System.out.println("(" + sumad1 + " / " + sumad + ")" + " * " + "( " + numElementosPAOY + " - " + numClusterPAOY + ")" + " / " + numClusterPAOY + " - " + " 1");

            System.out.println("CALINSKI - HARABAZ " + indiceValidezfinal);

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOYprueba2 = indDB.fusionOctavaPMC(lanmarkOY, arrayOctavaYC);
            arraySCKYO = indDB.distanciaClusterFusionadosOctava(lanmarkOY, arrayOctavaYNC1, arrayOctavaYNI1);

            for (int i = 0; i < arraySCKYO.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKYO.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoOY7);
            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoOY7, arraySCKYO);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jOYFIndiceDBPAEM.setText(String.valueOf(indiceDB));

        }
         //////////////////////////////////////////////////////////////////////////////////////////////////

                       ////// OCTAVA en Z ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListOctavaZNC = new ArrayList<String>(Arrays.asList(arreglooctavaZNCEM.split(",")));
        ArrayList arrayOctavaZNC1 = new ArrayList();
        arrayOctavaZNC1 = myListOctavaZNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListOctavaZNI = new ArrayList<String>(Arrays.asList(arreglooctavaZNIEM.split(",")));
        ArrayList arrayOctavaZNI1 = new ArrayList();
        arrayOctavaZNI1 = myListOctavaZNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListOZ = new ArrayList<String>(Arrays.asList(arregloprueba6OEM.split(",")));
        ArrayList arrayOctavaZI = new ArrayList();
        arrayOctavaZI = myListOZ;
        //////////////////////////
        ArrayList<String> myList1OZ = new ArrayList<String>(Arrays.asList(arregloprueba7OEM.split(",")));
        ArrayList arrayOctavaZC = new ArrayList();
        arrayOctavaZC = myList1OZ;
        //////////////////////
        ArrayList<String> myList2OZ = new ArrayList<String>(Arrays.asList(arregloprueba8OEM.split(",")));
        ArrayList arrayOctavaZT = new ArrayList();
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

        System.out.println("///////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayOctavaZNC1.size(); i++) {
            guiAFusionar.jTextNCNIOZEM.append((String) "Cluster " + arrayOctavaZNC1.get(i) + (String) "Instancia " + arrayOctavaZNI1.get(i) + " \n");
            numElementosOZ = i;
            numElementosPAOZ = i;
        }
        for (int i = 0; i < arrayOctavaZI.size(); i++) {
            guiAFusionar.jTextGCOZEM.append((String) "Cluster [" + i + "]" + arrayOctavaZI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayOctavaZC.get(i) + " \n");
        }

        for (int i = 0; i < arrayOctavaZT.size(); i++) {
            guiAFusionar.jTextALOZEM.append((String) "[Cluster " + i + "]" + arrayOctavaZT.get(i) + " \n");

        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkOZ = arregloprueba8OEM.split(","); ////// Convertir string a String []

        calculoOZ1 = cal2.fusionOctava(lanmarkOZ);
        for (int i = 0; i < calculoOZ1.size(); i++) {
            guiAFusionar.jTextFusionOZEM.append((String) calculoOZ1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoOZ2 = cal2.fusionOctavaPMC(lanmarkOZ, arrayOctavaZC); // Promedio Aritmetico
        arregloPAOZEM = cal2.fusionOctavaPMC1(lanmarkOZ, arrayOctavaZC);
        arregloPAOZ1EM = cal2.fusionOctavaPMC2(lanmarkOZ, arrayOctavaZC);
        for (int i = 0; i < calculoOZ2.size(); i++) {
            guiAFusionar.jTextFusionOZFEM.append((String) calculoOZ2.get(i) + "\n");
        }

        calculoOZ3 = cal2.fusionOctavaSI(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);
        arregloInstanciasOZEM = cal2.fusionOctavaSI1(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);
        arregloInstanciasOZ1EM = cal2.fusionOctavaSI2(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);

        for (int i = 0; i < calculoOZ3.size(); i++) {
            guiAFusionar.jTextFusionOZFIEM.append((String) calculoOZ3.get(i) + "\n");
        }
        calculoOZ4 = cal2.fusionOctavaPPC(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);
        arregloPPOZEM = cal2.fusionOctavaPPC1(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);
        arregloPPOZ1EM = cal2.fusionOctavaPPC2(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);

        for (int i = 0; i < calculoOZ4.size(); i++) {
            guiAFusionar.jTextFusionOZFPPEM.append((String) calculoOZ4.get(i) + "\n");
            numClusterOZ = i;
            numClusterPAOZ = i;
        }

        calculoOZ5 = cal2.fusionOctavaInstancias(lanmarkOZ, arrayOctavaZNC1, arrayOctavaZNI1);
        for (int i = 0; i < calculoOZ5.size(); i++) {
            guiAFusionar.jTextFusionOZFNCIEM.append((String) "Cluster " + i + " " + calculoOZ5.get(i) + "\n");
        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOZprueba = indCH.fusionOctavaPPC(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);
            calculoOZ6 = indCH.distanciaClusterFusionadosOctava(lanmarkOZ, arrayOctavaZNC1, arrayOctavaZNI1);
            sumad = calculoOZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoOZ7 = cal2.fusionOctavaPPC1(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);
            calculoOZ8 = cal2.fusionOctavaSI1(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoOZ7, cenGeneral, calculoOZ8);
            System.out.println("Numerador " + sumad1);
            numElementosOZ = numElementosOZ + 1;
            numClusterOZ = numClusterOZ + 1;
            System.out.println("Numero de elementos " + numElementosOZ);
            System.out.println("Numero de Cluster " + numClusterOZ);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosOZ - numClusterOZ) / (numClusterOZ - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;
            System.out.println("(" + sumad1 + " / " + sumad + ")" + " * " + "( " + numElementosOZ + " - " + numClusterOZ + ")" + " / " + numClusterOZ + " - " + " 1");
            guiAFusionar.jOZFIndiceCHEM.setText(String.valueOf(indiceValidezfinal));
            System.out.println("Indice Calinsky Harabaz es" + indiceValidezfinal);

         //////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOZprueba2 = indDB.fusionOctavaPPC(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);
            arraySCKZO = indDB.distanciaClusterFusionadosOctava(lanmarkOZ, arrayOctavaZNC1, arrayOctavaZNI1);

            for (int i = 0; i < arraySCKZO.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKZO.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoOZ7);
            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoOZ7, arraySCKZO);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jOZFIndiceDBEM.setText(String.valueOf(indiceDB));

        }

        if (comboFusion == "Promedio Ponderado") {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");

            double cenGeneral = 0;
            double sumad = 0;
            double sumad1 = 0;
            double indiceValidez = 0;
            double indiceValidez1 = 0;
            double indiceValidezfinal = 0;
            ////////// DENOMINADOR /////////
            calculoOZprueba = indCH.fusionOctavaPMC(lanmarkOZ, arrayOctavaZC);
            calculoOY6 = indCH.distanciaClusterFusionadosOctava(lanmarkOZ, arrayOctavaZNC1, arrayOctavaZNI1);
            sumad = calculoOZ6;
            System.out.println("Denominador " + sumad);
            System.out.println("xxxxxxxx  Calcular el centroide general xxxxxxxxx");
            cenGeneral = indCH.calculoCentroideGeneral(arrayOctavaZNI1);
            System.out.println("Centroide Genral: " + cenGeneral);

            calculoOZ7 = cal2.fusionOctavaPMC1(lanmarkOZ, arrayOctavaZC);
            calculoOZ8 = cal2.fusionOctavaSI1(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);

            sumad1 = indCH.distanciaSeparacionCluster(calculoOZ7, cenGeneral, calculoOZ8);
            System.out.println("Numerador " + sumad1);
            numElementosPAOZ = numElementosPAOZ + 1;
            numClusterPAOZ = numClusterPAOZ + 1;
            System.out.println("Numero de elementos " + numElementosPAOZ);
            System.out.println("Numero de Cluster " + numClusterPAOZ);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosPAOZ - numClusterPAOZ) / (numClusterPAOZ - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jOZFIndiceCHPAEM.setText(String.valueOf(indiceValidezfinal));
            System.out.println("(" + sumad1 + " / " + sumad + ")" + " * " + "( " + numElementosPAOZ + " - " + numClusterPAOZ + ")" + " / " + numClusterPAOZ + " - " + " 1");

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
            ////////// DENOMINADOR /////////
            calculoOZprueba2 = indDB.fusionOctavaPMC(lanmarkOZ, arrayOctavaZC);
            arraySCKZO = indDB.distanciaClusterFusionadosOctava(lanmarkOZ, arrayOctavaZNC1, arrayOctavaZNI1);

            for (int i = 0; i < arraySCKZO.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKZO.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoOY7);
            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK / SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamax = indDB.distanciaSeparacionCluster1(calculoOZ7, arraySCKZO);
            for (int i = 0; i < sumamax.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jOZFIndiceDBPAEM.setText(String.valueOf(indiceDB));
            ACLMessage msg = new ACLMessage(ACLMessage.UNKNOWN);
            msg.addReceiver(new AID("Planeador", AID.ISLOCALNAME));
            myAgent.send(msg);
        }
    }

    @Override
    public boolean done() {

        return fin;
    }

}
