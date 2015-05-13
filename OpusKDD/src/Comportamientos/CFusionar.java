package Comportamientos;

import Interfaces.guiARecomendar;
import Interfaces.guiAFusionar;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import static Comportamientos.CExtraer.emocion3;
import ObjeAux.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CFusionar extends SimpleBehaviour {

    public static String arreglotempoXNC;
    public static String arreglotempoXNI;

    public static String arregloprueba;
    public static String arregloprueba1;
    public static String arregloprueba2;

    public static String arreglotempoYNC;
    public static String arreglotempoYNI;

    public static String arregloprueba3;
    public static String arregloprueba4;
    public static String arregloprueba5;

    public static String arreglotempoZNC;
    public static String arreglotempoZNI;

    public static String arregloprueba6;
    public static String arregloprueba7;
    public static String arregloprueba8;

    public static ArrayList arregloInstanciasTX;
    public static ArrayList arregloInstanciasTY;
    public static ArrayList arregloInstanciasTZ;

    public static ArrayList arregloInstanciasTX1;
    public static ArrayList arregloInstanciasTY1;
    public static ArrayList arregloInstanciasTZ1;

    public static ArrayList arregloPPTX;
    public static ArrayList arregloPPTY;
    public static ArrayList arregloPPTZ;

    public static ArrayList arregloPPTX1;
    public static ArrayList arregloPPTY1;
    public static ArrayList arregloPPTZ1;

    public static ArrayList arregloPATX;
    public static ArrayList arregloPATY;
    public static ArrayList arregloPATZ;

    public static ArrayList arregloPATX1;
    public static ArrayList arregloPATY1;
    public static ArrayList arregloPATZ1;

        ////////////// DURACION /////////////////
    public static String arregloduracionXNC;
    public static String arregloduracionXNI;

    public static String arreglopruebaD;
    public static String arregloprueba1D;
    public static String arregloprueba2D;

    public static String arregloduracionYNC;
    public static String arregloduracionYNI;

    public static String arregloprueba3D;
    public static String arregloprueba4D;
    public static String arregloprueba5D;

    public static String arregloduracionZNC;
    public static String arregloduracionZNI;

    public static String arregloprueba6D;
    public static String arregloprueba7D;
    public static String arregloprueba8D;

    public static ArrayList arregloInstanciasDX;
    public static ArrayList arregloInstanciasDY;
    public static ArrayList arregloInstanciasDZ;

    public static ArrayList arregloInstanciasDX1;
    public static ArrayList arregloInstanciasDY1;
    public static ArrayList arregloInstanciasDZ1;

    public static ArrayList arregloPPDX;
    public static ArrayList arregloPPDY;
    public static ArrayList arregloPPDZ;

    public static ArrayList arregloPPDX1;
    public static ArrayList arregloPPDY1;
    public static ArrayList arregloPPDZ1;

    public static ArrayList arregloPADX;
    public static ArrayList arregloPADY;
    public static ArrayList arregloPADZ;

    public static ArrayList arregloPADX1;
    public static ArrayList arregloPADY1;
    public static ArrayList arregloPADZ1;

        ////////////// OCTAVAS /////////////////
    public static String arreglooctavaXNC;
    public static String arreglooctavaXNI;

    public static String arreglopruebaO;
    public static String arregloprueba1O;
    public static String arregloprueba2O;

    public static String arreglooctavaYNC;
    public static String arreglooctavaYNI;

    public static String arregloprueba3O;
    public static String arregloprueba4O;
    public static String arregloprueba5O;

    public static String arreglooctavaZNC;
    public static String arreglooctavaZNI;

    public static String arregloprueba6O;
    public static String arregloprueba7O;
    public static String arregloprueba8O;

    public static ArrayList arregloInstanciasOX;
    public static ArrayList arregloInstanciasOY;
    public static ArrayList arregloInstanciasOZ;

    public static ArrayList arregloInstanciasOX1;
    public static ArrayList arregloInstanciasOY1;
    public static ArrayList arregloInstanciasOZ1;

    public static ArrayList arregloPPOX;
    public static ArrayList arregloPPOY;
    public static ArrayList arregloPPOZ;

    public static ArrayList arregloPPOX1;
    public static ArrayList arregloPPOY1;
    public static ArrayList arregloPPOZ1;

    public static ArrayList arregloPAOX;
    public static ArrayList arregloPAOY;
    public static ArrayList arregloPAOZ;

    public static ArrayList arregloPAOX1;
    public static ArrayList arregloPAOY1;
    public static ArrayList arregloPAOZ1;

    private boolean fin = false;

    public CFusionar(Agent a) {
        super(a);

    }

    @Override
    public void action() {

        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje = myAgent.blockingReceive();
        if (mensaje != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje.toString());
            //fin = true;
            arregloprueba = mensaje.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba);
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

        ///////// RECIBIENDO MENSAJE 2 //////////  
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje3 = myAgent.blockingReceive();
        if (mensaje3 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje3);
            //fin = true;                  
            arregloprueba1 = mensaje3.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje3.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba1);
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
        ACLMessage mensaje5 = myAgent.blockingReceive();
        if (mensaje5 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje5);
            //fin = true;
            arregloprueba2 = mensaje5.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje5.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba2);
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
        ACLMessage mensaje7 = myAgent.blockingReceive();
        if (mensaje7 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje7.toString());
            arregloprueba3 = mensaje7.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje7.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba3);
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
        ACLMessage mensaje9 = myAgent.blockingReceive();
        if (mensaje9 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje9.toString());
            //fin = true;
            arregloprueba4 = mensaje9.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje9.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba4);
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
        ACLMessage mensaje11 = myAgent.blockingReceive();
        if (mensaje11 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje11);
            //fin = true;
            arregloprueba5 = mensaje11.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje11.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba5);
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
        ACLMessage mensaje13 = myAgent.blockingReceive();
        if (mensaje13 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje13);
            //fin = true;
            arregloprueba6 = mensaje13.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje11.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba6);
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
        ACLMessage mensaje15 = myAgent.blockingReceive();
        if (mensaje15 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje15);
            //fin = true;
            arregloprueba7 = mensaje15.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje11.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba7);
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
        ACLMessage mensaje17 = myAgent.blockingReceive();
        if (mensaje17 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje17);
            //fin = true;
            arregloprueba8 = mensaje17.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje11.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba8);
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
        ACLMessage mensaje19 = myAgent.blockingReceive();
        if (mensaje19 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje19);
            //fin = true;
            arreglotempoXNC = mensaje19.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje19.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoXNC);
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
        ACLMessage mensaje21 = myAgent.blockingReceive();
        if (mensaje21 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje21);
            //fin = true;
            arreglotempoXNI = mensaje21.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje21.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoXNI);
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
        ACLMessage mensaje23 = myAgent.blockingReceive();
        if (mensaje23 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje23);
            //fin = true;
            arreglotempoYNC = mensaje23.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje23.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoYNC);
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
        ACLMessage mensaje25 = myAgent.blockingReceive();
        if (mensaje25 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje25);
            //fin = true;
            arreglotempoYNI = mensaje25.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje25.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoYNI);
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
        ACLMessage mensaje27 = myAgent.blockingReceive();
        if (mensaje27 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje27);
            //fin = true;
            arreglotempoZNC = mensaje27.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje27.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoZNC);
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
        ACLMessage mensaje29 = myAgent.blockingReceive();
        if (mensaje29 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje29);
            //fin = true;
            arreglotempoZNI = mensaje29.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje29.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglotempoZNI);
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
        ///////// RECIBIENDO MENSAJE UNO DURACION //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje31 = myAgent.blockingReceive();
        if (mensaje31 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje31);
            //fin = true;
            arreglopruebaD = mensaje31.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje31.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglopruebaD);
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
        ACLMessage mensaje33 = myAgent.blockingReceive();
        if (mensaje33 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje33);
            //fin = true;                  
            arregloprueba1D = mensaje33.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje33.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba1D);
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
        ACLMessage mensaje35 = myAgent.blockingReceive();
        if (mensaje35 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje35);
            //fin = true;
            arregloprueba2D = mensaje35.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje35.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba2D);
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
        ACLMessage mensaje37 = myAgent.blockingReceive();
        if (mensaje37 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje37.toString());
            arregloprueba3D = mensaje37.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje37.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba3D);
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
        ACLMessage mensaje39 = myAgent.blockingReceive();
        if (mensaje39 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje39.toString());
            //fin = true;
            arregloprueba4D = mensaje39.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje39.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba4D);
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
        ACLMessage mensaje41 = myAgent.blockingReceive();
        if (mensaje41 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje41);
            //fin = true;
            arregloprueba5D = mensaje41.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje41.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba5D);
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
        ACLMessage mensaje43 = myAgent.blockingReceive();
        if (mensaje43 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje43);
            //fin = true;
            arregloprueba6D = mensaje43.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje43.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba6D);
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
        ACLMessage mensaje45 = myAgent.blockingReceive();
        if (mensaje45 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje45);
            //fin = true;
            arregloprueba7D = mensaje45.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje45.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba7D);
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
        ACLMessage mensaje47 = myAgent.blockingReceive();
        if (mensaje47 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje47);
            //fin = true;
            arregloprueba8D = mensaje47.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje47.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba8D);
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
        ACLMessage mensaje49 = myAgent.blockingReceive();
        if (mensaje49 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje49);
            //fin = true;
            arregloduracionXNC = mensaje49.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje49.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionXNC);
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
        ACLMessage mensaje51 = myAgent.blockingReceive();
        if (mensaje51 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje51);
            //fin = true;
            arregloduracionXNI = mensaje51.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje51.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionXNI);
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
        ACLMessage mensaje53 = myAgent.blockingReceive();
        if (mensaje53 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje53);
            //fin = true;
            arregloduracionYNC = mensaje53.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje53.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionYNC);
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
        ACLMessage mensaje55 = myAgent.blockingReceive();
        if (mensaje55 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje55);
            //fin = true;
            arregloduracionYNI = mensaje55.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje55.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionYNI);
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
        ACLMessage mensaje57 = myAgent.blockingReceive();
        if (mensaje57 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje57);
            //fin = true;
            arregloduracionZNC = mensaje57.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje57.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionZNC);
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
        ACLMessage mensaje59 = myAgent.blockingReceive();
        if (mensaje59 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje59);
            //fin = true;
            arregloduracionZNI = mensaje59.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje59.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloduracionZNI);
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
        ///////// RECIBIENDO MENSAJE UNO OCTAVA //////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje61 = myAgent.blockingReceive();
        if (mensaje61 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje61);
            //fin = true;
            arreglopruebaO = mensaje61.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje61.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglopruebaO);
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
        ACLMessage mensaje63 = myAgent.blockingReceive();
        if (mensaje63 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje63);
            //fin = true;                  
            arregloprueba1O = mensaje63.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje63.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba1O);
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
        ACLMessage mensaje65 = myAgent.blockingReceive();
        if (mensaje65 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje65);
            //fin = true;
            arregloprueba2O = mensaje65.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje65.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba2O);
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
        ACLMessage mensaje67 = myAgent.blockingReceive();
        if (mensaje67 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje67.toString());
            arregloprueba3O = mensaje67.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje67.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba3O);
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
        ACLMessage mensaje69 = myAgent.blockingReceive();
        if (mensaje69 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje69.toString());
            //fin = true;
            arregloprueba4O = mensaje69.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje69.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba4O);
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
        ACLMessage mensaje71 = myAgent.blockingReceive();
        if (mensaje71 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje71);
            //fin = true;
            arregloprueba5O = mensaje71.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje71.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba5O);
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
        ACLMessage mensaje73 = myAgent.blockingReceive();
        if (mensaje73 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje73);
            //fin = true;
            arregloprueba6O = mensaje73.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje73.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba6O);
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
        ACLMessage mensaje75 = myAgent.blockingReceive();
        if (mensaje75 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje75);
            //fin = true;
            arregloprueba7O = mensaje75.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje75.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba7O);
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
        ACLMessage mensaje77 = myAgent.blockingReceive();
        if (mensaje77 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje77);
            //fin = true;
            arregloprueba8O = mensaje77.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje77.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arregloprueba8O);
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
        ACLMessage mensaje79 = myAgent.blockingReceive();
        if (mensaje79 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje79);
            //fin = true;
            arreglooctavaXNC = mensaje79.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje79.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaXNC);
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
        ACLMessage mensaje81 = myAgent.blockingReceive();
        if (mensaje81 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje81);
            //fin = true;
            arreglooctavaXNI = mensaje81.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje81.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaXNI);
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
        ACLMessage mensaje83 = myAgent.blockingReceive();
        if (mensaje83 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje83);
            //fin = true;
            arreglooctavaYNC = mensaje83.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje83.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaYNC);
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
        ACLMessage mensaje85 = myAgent.blockingReceive();
        if (mensaje85 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje85);
            //fin = true;
            arreglooctavaYNI = mensaje85.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje85.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaYNI);
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
        ACLMessage mensaje87 = myAgent.blockingReceive();
        if (mensaje87 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje87);
            //fin = true;
            arreglooctavaZNC = mensaje87.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje87.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaZNC);
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
        ACLMessage mensaje89 = myAgent.blockingReceive();
        if (mensaje89 != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje89);
            //fin = true;
            arreglooctavaZNI = mensaje89.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje89.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar el arreglo :" + arreglooctavaZNI);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Receptor: Esperando a recibir mensaje");
            block();
        }

        System.out.println("Iniciare el proceso de Fusion con Kmeans");
        /////// intancia calculo tempo X //////
        calculo_tempo cal = new calculo_tempo();
        calculo_duracion cal1 = new calculo_duracion();
        calculo_octava cal2 = new calculo_octava();
        consultas_arreglos cons = new consultas_arreglos();
        calculoIndiceValidezCH indCH = new calculoIndiceValidezCH();
        calculoIndiceValidezDB indDB = new calculoIndiceValidezDB();

        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListTempoXNC = new ArrayList<String>(Arrays.asList(arreglotempoXNC.split(",")));
        ArrayList arrayTempoXNC1 = new ArrayList();
        arrayTempoXNC1 = myListTempoXNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListTempoXNI = new ArrayList<String>(Arrays.asList(arreglotempoXNI.split(",")));
        ArrayList arrayTempoXNI1 = new ArrayList();
        arrayTempoXNI1 = myListTempoXNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(arregloprueba.split(",")));
        ArrayList arrayTempoXI = new ArrayList();
        arrayTempoXI = myList;
        //////////////////////////
        ArrayList<String> myList1 = new ArrayList<String>(Arrays.asList(arregloprueba1.split(",")));
        ArrayList arrayTempoXC = new ArrayList();
        arrayTempoXC = myList1;
        //////////////////////
        ArrayList<String> myList2 = new ArrayList<String>(Arrays.asList(arregloprueba2.split(",")));
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

        System.out.println("///////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayTempoXNC1.size(); i++) {
            guiAFusionar.jTextNCNITX.append((String) "Cluster " + arrayTempoXNC1.get(i) + (String) "Instancia " + arrayTempoXNI1.get(i) + " \n");
            numElementos = i;
            numElementosPA = i;
        }
        for (int i = 0; i < arrayTempoXI.size(); i++) {
            guiAFusionar.jTextGCTX.append((String) "Cluster [" + i + "]" + arrayTempoXI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayTempoXC.get(i) + " \n");
        }
        for (int i = 0; i < arrayTempoXT.size(); i++) {
            guiAFusionar.jTextALTX.append((String) "[Cluster " + i + "]" + arrayTempoXT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmark = arregloprueba2.split(","); ////// Convertir string a String []
        calculoTX1 = cal.fusionTempo(lanmark);
        for (int i = 0; i < calculoTX1.size(); i++) {
            guiAFusionar.jTextFusionTX.append((String) calculoTX1.get(i) + "\n");
        }
////////// FUSIÓN DE CLUSTER ////////////////
        calculoTX2 = cal.fusionTempoPMC(lanmark, arrayTempoXC); // Promedio Aritmetico
        arregloPATX = cal.fusionTempoPMC1(lanmark, arrayTempoXC);
        arregloPATX1 = cal.fusionTempoPMC2(lanmark, arrayTempoXC);
        for (int i = 0; i < calculoTX2.size(); i++) {
            guiAFusionar.jTextFusionTXF.append((String) calculoTX2.get(i) + "\n");
        }

        calculoTX3 = cal.fusionTempoSI(lanmark, arrayTempoXI, arrayTempoXC);
        arregloInstanciasTX = cal.fusionTempoSI1(lanmark, arrayTempoXI, arrayTempoXC);
        arregloInstanciasTX1 = cal.fusionTempoSI2(lanmark, arrayTempoXI, arrayTempoXC);

        for (int i = 0; i < calculoTX3.size(); i++) {
            guiAFusionar.jTextFusionTXFI.append((String) calculoTX3.get(i) + "\n");
        }
        calculoTX4 = cal.fusionTempoPPC(lanmark, arrayTempoXC, arrayTempoXI);
        arregloPPTX = cal.fusionTempoPPC1(lanmark, arrayTempoXC, arrayTempoXI);
        arregloPPTX1 = cal.fusionTempoPPC2(lanmark, arrayTempoXC, arrayTempoXI);

        for (int i = 0; i < calculoTX4.size(); i++) {
            guiAFusionar.jTextFusionTXFPP.append((String) calculoTX4.get(i) + "\n");
            numCluster = i;
            numClusterPA = i;
        }

        calculoTX5 = cal.fusionTempoInstancias(lanmark, arrayTempoXNC1, arrayTempoXNI1);
        for (int i = 0; i < calculoTX5.size(); i++) {
            guiAFusionar.jTextFusionTXFNCI.append((String) "Cluster " + i + " " + calculoTX5.get(i) + "\n");
        }
        System.out.println("///////////////////////////////////////////////////////// TEMPO X PROMEDIO PONDERADO ///////////////////////////////////////////////////////////////////////////////");
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

            guiAFusionar.jTXFIndiceCH.setText(String.valueOf(indiceValidezfinal));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
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
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jTXFIndiceDB.setText(String.valueOf(indiceDB));

        }

        if (comboFusion == "Promedio Ponderado") {
            System.out.println("///////////////////////////////////////////////////////// TEMPO X PROMEDIO ARITMETICO ///////////////////////////////////////////////////////////////////////////////");
        }

        {
            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
            System.out.println("//////////////////////////** CALINSKY HARABAZ /////////////////////////////////////////////////////");

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
            numElementosPA = numElementosPA + 1;
            numClusterPA = numClusterPA + 1;
            System.out.println("Numero de elementos " + numElementosPA);
            System.out.println("Numero de Cluster " + numClusterPA);

            indiceValidez = sumad1 / sumad;
            indiceValidez1 = (numElementosPA - numClusterPA) / (numClusterPA - 1);
            indiceValidezfinal = indiceValidez * indiceValidez1;

            guiAFusionar.jTXFIndiceCHPA.setText(String.valueOf(indiceValidezfinal));

            System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");

         //////////////////////////////////////////////////////////////////////////////////////////////////
                ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDB = 0;
            double sumaMaxTotal = 0;
            double numClusterDB = 0;
            double indiceDB = 0;
            ArrayList sumamax = new ArrayList();
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
                System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
                sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
                numClusterDB = numClusterDB + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotal);
            indiceDB = (1 / numClusterDB) * sumaMaxTotal;
            System.out.println("El indice Davies Bouldin es:  " + indiceDB);
            guiAFusionar.jTXFIndiceDBPA.setText(String.valueOf(indiceDB));

        }
         //////////////////////////////////////////////////////////////////////////////////////////////////

 ///////////////////////////  tempo en y ///////////////////////////
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListTempoYNC = new ArrayList<String>(Arrays.asList(arreglotempoYNC.split(",")));
        ArrayList arrayTempoYNC1 = new ArrayList();
        arrayTempoYNC1 = myListTempoYNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListTempoYNI = new ArrayList<String>(Arrays.asList(arreglotempoYNI.split(",")));
        ArrayList arrayTempoYNI1 = new ArrayList();
        arrayTempoYNI1 = myListTempoYNI;
        //////////////////
        ArrayList<String> myList3 = new ArrayList<String>(Arrays.asList(arregloprueba3.split(",")));
        ArrayList arrayTempoYI = new ArrayList();
        arrayTempoYI = myList3;
        /////////////////
        ArrayList<String> myList4 = new ArrayList<String>(Arrays.asList(arregloprueba4.split(",")));
        ArrayList arrayTempoYC = new ArrayList();
        arrayTempoYC = myList4;
        ////////////////
        ArrayList<String> myList5 = new ArrayList<String>(Arrays.asList(arregloprueba5.split(",")));
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
            guiAFusionar.jTextNCNITY.append((String) "Cluster " + arrayTempoYNC1.get(i) + (String) "Instancia " + arrayTempoYNI1.get(i) + " \n");
            numElementosY = i;
            numElementosYPA = i;
        }

        for (int i = 0; i < arrayTempoYI.size(); i++) {
            guiAFusionar.jTextGCTY.append((String) "Cluster [" + i + "]" + arrayTempoYI.get(i) + "-->" + "Centroide: " + (String) arrayTempoYC.get(i) + " \n");
        }

        for (int i = 0; i < arrayTempoYT.size(); i++) {
            guiAFusionar.jTextALTY.append((String) "[Cluster " + i + "]" + arrayTempoYT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmark1 = arregloprueba5.split(","); ////// Convertir string a String []
        calculoTY = cal.fusionTempo(lanmark1);
        for (int i = 0; i < calculoTY.size(); i++) {
            guiAFusionar.jTextFusionTY.append((String) calculoTY.get(i) + "\n");
        }
        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoTY3 = cal.fusionTempoSI(lanmark1, arrayTempoYI, arrayTempoYC);
        arregloInstanciasTY = cal.fusionTempoSI1(lanmark1, arrayTempoYI, arrayTempoYC);
        arregloInstanciasTY1 = cal.fusionTempoSI2(lanmark1, arrayTempoYI, arrayTempoYC);
        for (int i = 0; i < calculoTY3.size(); i++) {
            guiAFusionar.jTextFusionTYFI.append((String) calculoTY3.get(i) + "\n");
        }
        calculoTY2 = cal.fusionTempoPMC(lanmark1, arrayTempoYC);
        arregloPATY = cal.fusionTempoPMC1(lanmark1, arrayTempoYC);
        arregloPATY1 = cal.fusionTempoPMC2(lanmark1, arrayTempoYC);
        for (int i = 0; i < calculoTY2.size(); i++) {
            guiAFusionar.jTextFusionTYF.append((String) calculoTY2.get(i) + "\n");
        }
        calculoTY4 = cal.fusionTempoPPC(lanmark1, arrayTempoYC, arrayTempoYI);
        arregloPPTY = cal.fusionTempoPPC1(lanmark1, arrayTempoYC, arrayTempoYI);
        arregloPPTY1 = cal.fusionTempoPPC2(lanmark1, arrayTempoYC, arrayTempoYI);

        for (int i = 0; i < calculoTY4.size(); i++) {
            guiAFusionar.jTextFusionTYFPP.append((String) calculoTY4.get(i) + "\n");
            numClusterY = i;
            numClusterYPA = i;
        }
        calculoTY5 = cal.fusionTempoInstancias(lanmark1, arrayTempoYNC1, arrayTempoYNI1);
        for (int i = 0; i < calculoTY5.size(); i++) {
            guiAFusionar.jTextFusionTYFNCI.append((String) "Cluster " + i + " " + calculoTY5.get(i) + "\n");
        }
        System.out.println("///////////////////////////////////////////////////////// TEMPO Y PROMEDIO PONDERADO ///////////////////////////////////////////////////////////////////////////////");

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

            guiAFusionar.jTYFIndiceCH.setText(String.valueOf(indiceValidezfinaly));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDBY = 0;
            double sumaMaxTotalY = 0;
            double numClusterDBY = 0;
            double indiceDBY = 0;
            ArrayList sumamaxY = new ArrayList();

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
                System.out.println("La distancia maxima " + i + " es: " + sumamaxY.get(i));
                sumaMaxTotalY = sumaMaxTotalY + Double.parseDouble((String) sumamaxY.get(i));
                numClusterDBY = numClusterDBY + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalY);
            indiceDBY = (1 / numClusterDBY) * sumaMaxTotalY;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBY);
            guiAFusionar.jTYFIndiceDB.setText(String.valueOf(indiceDBY));
        }
        System.out.println("///////////////////////////////////////////////////////// TEMPO Y PROMEDIO ARITMETICO ///////////////////////////////////////////////////////////////////////////////");

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
            numElementosYPA = numElementosYPA + 1;
            numClusterYPA = numClusterYPA + 1;
            System.out.println("Numero de elementos " + numElementosYPA);
            System.out.println("Numero de Cluster " + numClusterYPA);

            indiceValidezy = sumad1y / sumady;
            indiceValidez1y = (numElementosYPA - numClusterYPA) / (numClusterYPA - 1);
            indiceValidezfinaly = indiceValidezy * indiceValidez1y;

            guiAFusionar.jTYFIndiceCHPA.setText(String.valueOf(indiceValidezfinaly));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDBY = 0;
            double sumaMaxTotalY = 0;
            double numClusterDBY = 0;
            double indiceDBY = 0;
            ArrayList sumamaxY = new ArrayList();

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
                System.out.println("La distancia maxima " + i + " es: " + sumamaxY.get(i));
                sumaMaxTotalY = sumaMaxTotalY + Double.parseDouble((String) sumamaxY.get(i));
                numClusterDBY = numClusterDBY + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalY);
            indiceDBY = (1 / numClusterDBY) * sumaMaxTotalY;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBY);
            guiAFusionar.jTYFIndiceDBPA.setText(String.valueOf(indiceDBY));
        }

            /////////////////// Tempo en Z //////////////////
        ///////// Arreglo pruba lopasa a array /////
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListTempoZNC = new ArrayList<String>(Arrays.asList(arreglotempoZNC.split(",")));
        ArrayList arrayTempoZNC1 = new ArrayList();
        arrayTempoZNC1 = myListTempoZNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListTempoZNI = new ArrayList<String>(Arrays.asList(arreglotempoZNI.split(",")));
        ArrayList arrayTempoZNI1 = new ArrayList();
        arrayTempoZNI1 = myListTempoZNI;

        ArrayList<String> myListintz = new ArrayList<String>(Arrays.asList(arregloprueba6.split(",")));
        ArrayList arrayTempoZI = new ArrayList();
        arrayTempoZI = myListintz;
        //////////////////////////
        ArrayList<String> myListcenz = new ArrayList<String>(Arrays.asList(arregloprueba7.split(",")));
        ArrayList arrayTempoZC = new ArrayList();
        arrayTempoZC = myListcenz;
        //////////////////////
        ArrayList<String> myListrefz = new ArrayList<String>(Arrays.asList(arregloprueba8.split(",")));
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
            guiAFusionar.jTextNCNITZ.append((String) "Cluster " + arrayTempoZNC1.get(i) + (String) "Instancia " + arrayTempoZNI1.get(i) + " \n");
            numElementosZ = i;
            numElementosZPA = i;
        }
        for (int i = 0; i < arrayTempoZI.size(); i++) {
            guiAFusionar.jTextGCTZ.append((String) "Cluster [" + i + "]" + arrayTempoZI.get(i) + "-->" + "Centroide: " + (String) arrayTempoZC.get(i) + " \n");
        }
        for (int i = 0; i < arrayTempoZT.size(); i++) {
            guiAFusionar.jTextALTZ.append((String) "[Cluster " + i + "]" + arrayTempoZT.get(i) + " \n");
        }
        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmark2 = arregloprueba8.split(","); ////// Convertir string a String []
        calculoTZ1 = cal.fusionTempo(lanmark2);
        for (int i = 0; i < calculoTZ1.size(); i++) {
            guiAFusionar.jTextFusionTZ.append((String) calculoTZ1.get(i) + "\n");
        }
        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoTZ3 = cal.fusionTempoSI(lanmark2, arrayTempoZI, arrayTempoZC);
        arregloInstanciasTZ = cal.fusionTempoSI1(lanmark2, arrayTempoZI, arrayTempoZC);
        arregloInstanciasTZ1 = cal.fusionTempoSI2(lanmark2, arrayTempoZI, arrayTempoZC);
        for (int i = 0; i < calculoTZ3.size(); i++) {
            guiAFusionar.jTextFusionTZFI.append((String) calculoTZ3.get(i) + "\n");
        }
        calculoTZ2 = cal.fusionTempoPMC(lanmark2, arrayTempoZC);
        arregloPATZ = cal.fusionTempoPMC1(lanmark2, arrayTempoZC);
        arregloPATZ1 = cal.fusionTempoPMC2(lanmark2, arrayTempoZC);

        for (int i = 0; i < calculoTZ2.size(); i++) {
            guiAFusionar.jTextFusionTZF.append((String) calculoTZ2.get(i) + "\n");
        }
        calculoTZ4 = cal.fusionTempoPPC(lanmark2, arrayTempoZC, arrayTempoZI);
        arregloPPTZ = cal.fusionTempoPPC1(lanmark2, arrayTempoZC, arrayTempoZI); //// Calculo promedio ponderado
        arregloPPTZ1 = cal.fusionTempoPPC2(lanmark2, arrayTempoZC, arrayTempoZI); //// Calculo promedio ponderado
        for (int i = 0; i < calculoTZ4.size(); i++) {
            guiAFusionar.jTextFusionTZFPP.append((String) calculoTZ4.get(i) + "\n");
            numClusterZ = i;
            numClusterZPA = i;
        }
        calculoTZ5 = cal.fusionTempoInstancias(lanmark2, arrayTempoZNC1, arrayTempoZNI1);
        for (int i = 0; i < calculoTZ5.size(); i++) {
            guiAFusionar.jTextFusionTZFNCI.append((String) "Cluster " + i + " " + calculoTZ5.get(i) + "\n");
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

            guiAFusionar.jTZFIndiceCH.setText(String.valueOf(indiceValidezfinalz));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            ////
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

            System.out.println("///////////////////////////////// ERRRORORRR ////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");

            double sumadDBZ = 0;
            double sumaMaxTotalZ = 0;
            double numClusterDBZ = 0;
            double indiceDBZ = 0;
            ArrayList sumamaxZ = new ArrayList();

            ////////// DENOMINADOR /////////
            calculoTZprueba2 = indDB.fusionTempoPPC(lanmark2, arrayTempoZC, arrayTempoZI);
            arraySCKZ = indDB.distanciaClusterFusionados(lanmark2, arrayTempoZNC1, arrayTempoZNI1);

            for (int i = 0; i < arraySCKZ.size(); i++) {
                System.out.println("SCK Cluster: " + i + " es:" + arraySCKZ.get(i));
                // guiAFusionar.jTextFusionTXFNCI.append((String)"Cluster "+i+" "+calculoTX5.get(i)+ "\n");
            }

            indDB.distanciaSeparacionCluster(calculoTZ7);

            ///////// (SCK / SCL) / D(CK, CL) /////////////
            System.out.println("(SCK + SCL) / D(CK, CL)");
            // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
            sumamaxZ = indDB.distanciaSeparacionCluster1(calculoTZ7, arraySCKZ);
            for (int i = 0; i < sumamaxZ.size(); i++) {
                System.out.println("La distancia maxima " + i + " es: " + sumamaxZ.get(i));
                sumaMaxTotalZ = sumaMaxTotalZ + Double.parseDouble((String) sumamaxZ.get(i));
                numClusterDBZ = numClusterDBZ + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalZ);
            indiceDBZ = (1 / numClusterDBZ) * sumaMaxTotalZ;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBZ);
            guiAFusionar.jTZFIndiceDB.setText(String.valueOf(indiceDBZ));
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
            numElementosZPA = numElementosZPA + 1;
            numClusterZPA = numClusterZPA + 1;
            System.out.println("Numero de elementos " + numElementosZPA);
            System.out.println("Numero de Cluster " + numClusterZPA);

            indiceValidezz = sumad1z / sumadz;
            indiceValidez1z = (numElementosZPA - numClusterZPA) / (numClusterZPA - 1);
            indiceValidezfinalz = indiceValidezz * indiceValidez1z;

            guiAFusionar.jTZFIndiceCHPA.setText(String.valueOf(indiceValidezfinalz));

        ////////// INDICE DE VALIDEZ DAVIS - BOULDIN ////////////////
            double sumadDBZ = 0;
            double sumaMaxTotalZ = 0;
            double numClusterDBZ = 0;
            double indiceDBZ = 0;
            ArrayList sumamaxZ = new ArrayList();

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
                System.out.println("La distancia maxima " + i + " es: " + sumamaxZ.get(i));
                sumaMaxTotalZ = sumaMaxTotalZ + Double.parseDouble((String) sumamaxZ.get(i));
                numClusterDBZ = numClusterDBZ + 1;
            }
            System.out.println("La suma de maximos es :" + sumaMaxTotalZ);
            indiceDBZ = (1 / numClusterDBZ) * sumaMaxTotalZ;
            System.out.println("El indice Davies Bouldin es:  " + indiceDBZ);
            guiAFusionar.jTZFIndiceDBPA.setText(String.valueOf(indiceDBZ));
        }
                    //////////////////////////////////////////////////////////////////
        ////////////////////////// DURACION //////////////////////////////
        ////// Duracion en X ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListDuracionXNC = new ArrayList<String>(Arrays.asList(arregloduracionXNC.split(",")));
        ArrayList arrayDuracionXNC1 = new ArrayList();
        arrayDuracionXNC1 = myListDuracionXNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListDuracionXNI = new ArrayList<String>(Arrays.asList(arregloduracionXNI.split(",")));
        ArrayList arrayDuracionXNI1 = new ArrayList();
        arrayDuracionXNI1 = myListDuracionXNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListD = new ArrayList<String>(Arrays.asList(arreglopruebaD.split(",")));
        ArrayList arrayDuracionXI = new ArrayList();
        arrayDuracionXI = myListD;
        //////////////////////////
        ArrayList<String> myList1D = new ArrayList<String>(Arrays.asList(arregloprueba1D.split(",")));
        ArrayList arrayDuracionXC = new ArrayList();
        arrayDuracionXC = myList1D;
        //////////////////////
        ArrayList<String> myList2D = new ArrayList<String>(Arrays.asList(arregloprueba2D.split(",")));
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
            guiAFusionar.jTextNCNIDX.append((String) "Cluster " + arrayDuracionXNC1.get(i) + (String) "Instancia " + arrayDuracionXNI1.get(i) + " \n");
            numElementosD = i;
            numElementosPAD = i;
        }
        for (int i = 0; i < arrayDuracionXI.size(); i++) {
            guiAFusionar.jTextGCDX.append((String) "Cluster [" + i + "]" + arrayDuracionXI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayDuracionXC.get(i) + " \n");
        }

        for (int i = 0; i < arrayDuracionXT.size(); i++) {
            guiAFusionar.jTextALDX.append((String) "[Cluster " + i + "]" + arrayDuracionXT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkD = arregloprueba2D.split(","); ////// Convertir string a String []

        calculoDX1 = cal1.fusionDuracion(lanmarkD);
        for (int i = 0; i < calculoDX1.size(); i++) {
            guiAFusionar.jTextFusionDX.append((String) calculoDX1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoDX2 = cal1.fusionDuracionPMC(lanmarkD, arrayDuracionXC); // Promedio Aritmetico
        arregloPADX = cal1.fusionDuracionPMC1(lanmarkD, arrayDuracionXC);
        arregloPADX1 = cal1.fusionDuracionPMC2(lanmarkD, arrayDuracionXC);

        for (int i = 0; i < calculoDX2.size(); i++) {
            guiAFusionar.jTextFusionDXF.append((String) calculoDX2.get(i) + "\n");
        }

        calculoDX3 = cal1.fusionDuracionSI(lanmarkD, arrayDuracionXI, arrayDuracionXC);
        arregloInstanciasDX = cal1.fusionDuracionSI1(lanmarkD, arrayDuracionXI, arrayDuracionXC);
        arregloInstanciasDX1 = cal1.fusionDuracionSI2(lanmarkD, arrayDuracionXI, arrayDuracionXC);

        for (int i = 0; i < calculoDX3.size(); i++) {
            guiAFusionar.jTextFusionDXFI.append((String) calculoDX3.get(i) + "\n");
        }
        calculoDX4 = cal1.fusionDuracionPPC(lanmarkD, arrayDuracionXC, arrayDuracionXI);
        arregloPPDX = cal1.fusionDuracionPPC1(lanmarkD, arrayDuracionXC, arrayDuracionXI);
        arregloPPDX1 = cal1.fusionDuracionPPC2(lanmarkD, arrayDuracionXC, arrayDuracionXI);

        for (int i = 0; i < calculoDX4.size(); i++) {
            guiAFusionar.jTextFusionDXFPP.append((String) calculoDX4.get(i) + "\n");
            numClusterD = i;
            numClusterPAD = i;
        }

        calculoDX5 = cal1.fusionDuracionInstancias(lanmarkD, arrayDuracionXNC1, arrayDuracionXNI1);
        for (int i = 0; i < calculoDX5.size(); i++) {
            guiAFusionar.jTextFusionDXFNCI.append((String) "Cluster " + i + " " + calculoDX5.get(i) + "\n");
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

            guiAFusionar.jDXFIndiceCH.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jDXFIndiceDB.setText(String.valueOf(indiceDB));

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

            guiAFusionar.jDXFIndiceCHPA.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jDXFIndiceDBPA.setText(String.valueOf(indiceDB));

        }
         //////////////////////////////////////////////////////////////////////////////////////////////////        

               ////// Duracion en Y ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListDuracionYNC = new ArrayList<String>(Arrays.asList(arregloduracionYNC.split(",")));
        ArrayList arrayDuracionYNC1 = new ArrayList();
        arrayDuracionYNC1 = myListDuracionYNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListDuracionYNI = new ArrayList<String>(Arrays.asList(arregloduracionYNI.split(",")));
        ArrayList arrayDuracionYNI1 = new ArrayList();
        arrayDuracionYNI1 = myListDuracionYNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListDY = new ArrayList<String>(Arrays.asList(arregloprueba3D.split(",")));
        ArrayList arrayDuracionYI = new ArrayList();
        arrayDuracionYI = myListDY;
        //////////////////////////
        ArrayList<String> myList1DY = new ArrayList<String>(Arrays.asList(arregloprueba4D.split(",")));
        ArrayList arrayDuracionYC = new ArrayList();
        arrayDuracionYC = myList1DY;
        //////////////////////
        ArrayList<String> myList2DY = new ArrayList<String>(Arrays.asList(arregloprueba5D.split(",")));
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

        System.out.println("///////////////////////////////////////////////////////////" + comboFusion);

        for (int i = 0; i < arrayDuracionYNC1.size(); i++) {
            guiAFusionar.jTextNCNIDY.append((String) "Cluster " + arrayDuracionYNC1.get(i) + (String) "Instancia " + arrayDuracionYNI1.get(i) + " \n");
            numElementosDY = i;
            numElementosPADY = i;
        }
        for (int i = 0; i < arrayDuracionYI.size(); i++) {
            guiAFusionar.jTextGCDY.append((String) "Cluster [" + i + "]" + arrayDuracionYI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayDuracionYC.get(i) + " \n");
        }

        for (int i = 0; i < arrayDuracionYT.size(); i++) {
            guiAFusionar.jTextALDY.append((String) "[Cluster " + i + "]" + arrayDuracionYT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkDY = arregloprueba5D.split(","); ////// Convertir string a String []

        calculoDY1 = cal1.fusionDuracion(lanmarkDY);
        for (int i = 0; i < calculoDY1.size(); i++) {
            guiAFusionar.jTextFusionDY.append((String) calculoDY1.get(i) + "\n");
        }

        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoDY2 = cal1.fusionDuracionPMC(lanmarkDY, arrayDuracionYC); // Promedio Aritmetico
        arregloPADY = cal1.fusionDuracionPMC1(lanmarkDY, arrayDuracionYC);
        arregloPADY1 = cal1.fusionDuracionPMC2(lanmarkDY, arrayDuracionYC);
        for (int i = 0; i < calculoDY2.size(); i++) {
            guiAFusionar.jTextFusionDYF.append((String) calculoDY2.get(i) + "\n");
        }

        calculoDY3 = cal1.fusionDuracionSI(lanmarkDY, arrayDuracionYI, arrayDuracionYC);
        arregloInstanciasDY = cal1.fusionDuracionSI1(lanmarkDY, arrayDuracionYI, arrayDuracionYC);
        arregloInstanciasDY1 = cal1.fusionDuracionSI2(lanmarkDY, arrayDuracionYI, arrayDuracionYC);

        for (int i = 0; i < calculoDY3.size(); i++) {
            guiAFusionar.jTextFusionDYFI.append((String) calculoDY3.get(i) + "\n");
        }
        calculoDY4 = cal1.fusionDuracionPPC(lanmarkDY, arrayDuracionYC, arrayDuracionYI);
        arregloPPDY = cal1.fusionDuracionPPC1(lanmarkDY, arrayDuracionYC, arrayDuracionYI);
        arregloPPDY1 = cal1.fusionDuracionPPC2(lanmarkDY, arrayDuracionYC, arrayDuracionYI);

        for (int i = 0; i < calculoDY4.size(); i++) {
            guiAFusionar.jTextFusionDYFPP.append((String) calculoDY4.get(i) + "\n");
            numClusterDY = i;
            numClusterPADY = i;
        }

        calculoDY5 = cal1.fusionDuracionInstancias(lanmarkDY, arrayDuracionYNC1, arrayDuracionYNI1);
        for (int i = 0; i < calculoDY5.size(); i++) {
            guiAFusionar.jTextFusionDYFNCI.append((String) "Cluster " + i + " " + calculoDY5.get(i) + "\n");
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

            guiAFusionar.jDYFIndiceCH.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jDYFIndiceDB.setText(String.valueOf(indiceDB));

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

            guiAFusionar.jDYFIndiceCHPA.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jDYFIndiceDBPA.setText(String.valueOf(indiceDB));

        }
         //////////////////////////////////////////////////////////////////////////////////////////////////        

                 ////// Duracion en Z ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListDuracionZNC = new ArrayList<String>(Arrays.asList(arregloduracionZNC.split(",")));
        ArrayList arrayDuracionZNC1 = new ArrayList();
        arrayDuracionZNC1 = myListDuracionZNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListDuracionZNI = new ArrayList<String>(Arrays.asList(arregloduracionZNI.split(",")));
        ArrayList arrayDuracionZNI1 = new ArrayList();
        arrayDuracionZNI1 = myListDuracionZNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListDZ = new ArrayList<String>(Arrays.asList(arregloprueba6D.split(",")));
        ArrayList arrayDuracionZI = new ArrayList();
        arrayDuracionZI = myListDZ;
        //////////////////////////
        ArrayList<String> myList1DZ = new ArrayList<String>(Arrays.asList(arregloprueba7D.split(",")));
        ArrayList arrayDuracionZC = new ArrayList();
        arrayDuracionZC = myList1DZ;
        //////////////////////
        ArrayList<String> myList2DZ = new ArrayList<String>(Arrays.asList(arregloprueba8D.split(",")));
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
            guiAFusionar.jTextNCNIDZ.append((String) "Cluster " + arrayDuracionZNC1.get(i) + (String) "Instancia " + arrayDuracionZNI1.get(i) + " \n");
            numElementosDZ = i;
            numElementosPADZ = i;
        }
        for (int i = 0; i < arrayDuracionZI.size(); i++) {
            guiAFusionar.jTextGCDZ.append((String) "Cluster [" + i + "]" + arrayDuracionZI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayDuracionZC.get(i) + " \n");
        }

        for (int i = 0; i < arrayDuracionZT.size(); i++) {
            guiAFusionar.jTextALDZ.append((String) "[Cluster " + i + "]" + arrayDuracionZT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkDZ = arregloprueba8D.split(","); ////// Convertir string a String []

        calculoDZ1 = cal1.fusionDuracion(lanmarkDZ);
        for (int i = 0; i < calculoDZ1.size(); i++) {
            guiAFusionar.jTextFusionDZ.append((String) calculoDZ1.get(i) + "\n");
        }

        ////////// FUSIÓN DE CLUSTER ////////////////
        calculoDZ2 = cal1.fusionDuracionPMC(lanmarkDZ, arrayDuracionZC); // Promedio Aritmetico
        arregloPADZ = cal1.fusionDuracionPMC1(lanmarkDZ, arrayDuracionZC);
        arregloPADZ1 = cal1.fusionDuracionPMC2(lanmarkDZ, arrayDuracionZC);
        for (int i = 0; i < calculoDZ2.size(); i++) {
            guiAFusionar.jTextFusionDZF.append((String) calculoDZ2.get(i) + "\n");
        }

        calculoDZ3 = cal1.fusionDuracionSI(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);
        arregloInstanciasDZ = cal1.fusionDuracionSI1(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);
        arregloInstanciasDZ1 = cal1.fusionDuracionSI2(lanmarkDZ, arrayDuracionZI, arrayDuracionZC);

        for (int i = 0; i < calculoDZ3.size(); i++) {
            guiAFusionar.jTextFusionDZFI.append((String) calculoDZ3.get(i) + "\n");
        }
        calculoDZ4 = cal1.fusionDuracionPPC(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);
        arregloPPDZ = cal1.fusionDuracionPPC1(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);
        arregloPPDZ1 = cal1.fusionDuracionPPC2(lanmarkDZ, arrayDuracionZC, arrayDuracionZI);

        for (int i = 0; i < calculoDZ4.size(); i++) {
            guiAFusionar.jTextFusionDZFPP.append((String) calculoDZ4.get(i) + "\n");
            numClusterDZ = i;
            numClusterPADZ = i;
        }

        calculoDZ5 = cal1.fusionDuracionInstancias(lanmarkDZ, arrayDuracionZNC1, arrayDuracionZNI1);
        for (int i = 0; i < calculoDZ5.size(); i++) {
            guiAFusionar.jTextFusionDZFNCI.append((String) "Cluster " + i + " " + calculoDZ5.get(i) + "\n");
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

            guiAFusionar.jDZFIndiceCH.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jDZFIndiceDB.setText(String.valueOf(indiceDB));

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

            guiAFusionar.jDZFIndiceCHPA.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jDZFIndiceDBPA.setText(String.valueOf(indiceDB));

        }
         //////////////////////////////////////////////////////////////////////////////////////////////////        
        //////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////// OCTAVA ////////////

                     ////// OCTAVA en X ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListOctavaXNC = new ArrayList<String>(Arrays.asList(arreglooctavaXNC.split(",")));
        ArrayList arrayOctavaXNC1 = new ArrayList();
        arrayOctavaXNC1 = myListOctavaXNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListOctavaXNI = new ArrayList<String>(Arrays.asList(arreglooctavaXNI.split(",")));
        ArrayList arrayOctavaXNI1 = new ArrayList();
        arrayOctavaXNI1 = myListOctavaXNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListO = new ArrayList<String>(Arrays.asList(arreglopruebaO.split(",")));
        ArrayList arrayOctavaXI = new ArrayList();
        arrayOctavaXI = myListO;
        //////////////////////////
        ArrayList<String> myList1O = new ArrayList<String>(Arrays.asList(arregloprueba1O.split(",")));
        ArrayList arrayOctavaXC = new ArrayList();
        arrayOctavaXC = myList1O;
        //////////////////////
        ArrayList<String> myList2O = new ArrayList<String>(Arrays.asList(arregloprueba2O.split(",")));
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
            guiAFusionar.jTextNCNIOX.append((String) "Cluster " + arrayOctavaXNC1.get(i) + (String) "Instancia " + arrayOctavaXNI1.get(i) + " \n");
            numElementosO = i;
            numElementosPAO = i;
        }
        for (int i = 0; i < arrayOctavaXI.size(); i++) {
            guiAFusionar.jTextGCOX.append((String) "Cluster [" + i + "]" + arrayOctavaXI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayOctavaXC.get(i) + " \n");
        }

        for (int i = 0; i < arrayOctavaXT.size(); i++) {
            guiAFusionar.jTextALOX.append((String) "[Cluster " + i + "]" + arrayOctavaXT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkO = arregloprueba2O.split(","); ////// Convertir string a String []

        calculoOX1 = cal2.fusionOctava(lanmarkO);
        for (int i = 0; i < calculoOX1.size(); i++) {
            guiAFusionar.jTextFusionOX.append((String) calculoOX1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoOX2 = cal2.fusionOctavaPMC(lanmarkO, arrayOctavaXC); // Promedio Aritmetico
        arregloPAOX = cal2.fusionOctavaPMC1(lanmarkO, arrayOctavaXC);
        arregloPAOX1 = cal2.fusionOctavaPMC2(lanmarkO, arrayOctavaXC);
        for (int i = 0; i < calculoOX2.size(); i++) {
            guiAFusionar.jTextFusionOXF.append((String) calculoOX2.get(i) + "\n");
        }

        calculoOX3 = cal2.fusionOctavaSI(lanmarkO, arrayOctavaXI, arrayOctavaXC);
        arregloInstanciasOX = cal2.fusionOctavaSI1(lanmarkO, arrayOctavaXI, arrayOctavaXC);
        arregloInstanciasOX1 = cal2.fusionOctavaSI2(lanmarkO, arrayOctavaXI, arrayOctavaXC);

        for (int i = 0; i < calculoOX3.size(); i++) {
            guiAFusionar.jTextFusionOXFI.append((String) calculoOX3.get(i) + "\n");
        }
        calculoOX4 = cal2.fusionOctavaPPC(lanmarkO, arrayOctavaXC, arrayOctavaXI);
        arregloPPOX = cal2.fusionOctavaPPC1(lanmarkO, arrayOctavaXC, arrayOctavaXI);
        arregloPPOX1 = cal2.fusionOctavaPPC2(lanmarkO, arrayOctavaXC, arrayOctavaXI);

        for (int i = 0; i < calculoOX4.size(); i++) {
            guiAFusionar.jTextFusionOXFPP.append((String) calculoOX4.get(i) + "\n");
            numClusterO = i;
            numClusterPAO = i;
        }

        calculoOX5 = cal2.fusionOctavaInstancias(lanmarkO, arrayOctavaXNC1, arrayOctavaXNI1);
        for (int i = 0; i < calculoOX5.size(); i++) {
            guiAFusionar.jTextFusionOXFNCI.append((String) "Cluster " + i + " " + calculoOX5.get(i) + "\n");
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

            guiAFusionar.jOXFIndiceCH.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jOXFIndiceDB.setText(String.valueOf(indiceDB));

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

            guiAFusionar.jOXFIndiceCHPA.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jOXFIndiceDBPA.setText(String.valueOf(indiceDB));

        }
         //////////////////////////////////////////////////////////////////////////////////////////////////

               ////// OCTAVA en Y ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListOctavaYNC = new ArrayList<String>(Arrays.asList(arreglooctavaYNC.split(",")));
        ArrayList arrayOctavaYNC1 = new ArrayList();
        arrayOctavaYNC1 = myListOctavaYNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListOctavaYNI = new ArrayList<String>(Arrays.asList(arreglooctavaYNI.split(",")));
        ArrayList arrayOctavaYNI1 = new ArrayList();
        arrayOctavaYNI1 = myListOctavaYNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListOY = new ArrayList<String>(Arrays.asList(arregloprueba3O.split(",")));
        ArrayList arrayOctavaYI = new ArrayList();
        arrayOctavaYI = myListOY;
        //////////////////////////
        ArrayList<String> myList1OY = new ArrayList<String>(Arrays.asList(arregloprueba4O.split(",")));
        ArrayList arrayOctavaYC = new ArrayList();
        arrayOctavaYC = myList1OY;
        //////////////////////
        ArrayList<String> myList2OY = new ArrayList<String>(Arrays.asList(arregloprueba5O.split(",")));
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
            guiAFusionar.jTextNCNIOY.append((String) "Cluster " + arrayOctavaYNC1.get(i) + (String) "Instancia " + arrayOctavaYNI1.get(i) + " \n");
            numElementosOY = i;
            numElementosPAOY = i;
        }
        for (int i = 0; i < arrayOctavaYI.size(); i++) {
            guiAFusionar.jTextGCOY.append((String) "Cluster [" + i + "]" + arrayOctavaYI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayOctavaYC.get(i) + " \n");
        }

        for (int i = 0; i < arrayOctavaYT.size(); i++) {
            guiAFusionar.jTextALOY.append((String) "[Cluster " + i + "]" + arrayOctavaYT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkOY = arregloprueba5O.split(","); ////// Convertir string a String []

        calculoOY1 = cal2.fusionOctava(lanmarkOY);
        for (int i = 0; i < calculoOY1.size(); i++) {
            guiAFusionar.jTextFusionOY.append((String) calculoOY1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoOY2 = cal2.fusionOctavaPMC(lanmarkOY, arrayOctavaYC); // Promedio Aritmetico
        arregloPAOY = cal2.fusionOctavaPMC1(lanmarkOY, arrayOctavaYC);
        arregloPAOY1 = cal2.fusionOctavaPMC2(lanmarkOY, arrayOctavaYC);
        for (int i = 0; i < calculoOY2.size(); i++) {
            guiAFusionar.jTextFusionOYF.append((String) calculoOY2.get(i) + "\n");
        }

        calculoOY3 = cal2.fusionOctavaSI(lanmarkOY, arrayOctavaYI, arrayOctavaYC);
        arregloInstanciasOY = cal2.fusionOctavaSI1(lanmarkOY, arrayOctavaYI, arrayOctavaYC);
        arregloInstanciasOY1 = cal2.fusionOctavaSI2(lanmarkOY, arrayOctavaYI, arrayOctavaYC);

        for (int i = 0; i < calculoOY3.size(); i++) {
            guiAFusionar.jTextFusionOYFI.append((String) calculoOY3.get(i) + "\n");
        }
        calculoOY4 = cal2.fusionOctavaPPC(lanmarkOY, arrayOctavaYC, arrayOctavaYI);
        arregloPPOY = cal2.fusionOctavaPPC1(lanmarkOY, arrayOctavaYC, arrayOctavaYI);
        arregloPPOY1 = cal2.fusionOctavaPPC2(lanmarkOY, arrayOctavaYC, arrayOctavaYI);

        for (int i = 0; i < calculoOY4.size(); i++) {
            guiAFusionar.jTextFusionOYFPP.append((String) calculoOY4.get(i) + "\n");
            numClusterOY = i;
            numClusterPAOY = i;
        }

        calculoOY5 = cal2.fusionOctavaInstancias(lanmarkOY, arrayOctavaYNC1, arrayOctavaYNI1);
        for (int i = 0; i < calculoOY5.size(); i++) {
            guiAFusionar.jTextFusionOYFNCI.append((String) "Cluster " + i + " " + calculoOY5.get(i) + "\n");
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

            guiAFusionar.jOYFIndiceCH.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jOYFIndiceDB.setText(String.valueOf(indiceDB));

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

            guiAFusionar.jOYFIndiceCHPA.setText(String.valueOf(indiceValidezfinal));

            System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");

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
            guiAFusionar.jOYFIndiceDBPA.setText(String.valueOf(indiceDB));

        }
         //////////////////////////////////////////////////////////////////////////////////////////////////

             ////// OCTAVA en Z ///////////////   
        /////////////// Numero de Cumulos /////////////
        ArrayList<String> myListOctavaZNC = new ArrayList<String>(Arrays.asList(arreglooctavaZNC.split(",")));
        ArrayList arrayOctavaZNC1 = new ArrayList();
        arrayOctavaZNC1 = myListOctavaZNC;
        /////////////// Todas las Instancias /////////////
        ArrayList<String> myListOctavaZNI = new ArrayList<String>(Arrays.asList(arreglooctavaZNI.split(",")));
        ArrayList arrayOctavaZNI1 = new ArrayList();
        arrayOctavaZNI1 = myListOctavaZNI;
        ///////// Arreglo pruba lopasa a array /////
        ArrayList<String> myListOZ = new ArrayList<String>(Arrays.asList(arregloprueba6O.split(",")));
        ArrayList arrayOctavaZI = new ArrayList();
        arrayOctavaZI = myListOZ;
        //////////////////////////
        ArrayList<String> myList1OZ = new ArrayList<String>(Arrays.asList(arregloprueba7O.split(",")));
        ArrayList arrayOctavaZC = new ArrayList();
        arrayOctavaZC = myList1OZ;
        //////////////////////
        ArrayList<String> myList2OZ = new ArrayList<String>(Arrays.asList(arregloprueba8O.split(",")));
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
            guiAFusionar.jTextNCNIOZ.append((String) "Cluster " + arrayOctavaZNC1.get(i) + (String) "Instancia " + arrayOctavaZNI1.get(i) + " \n");
            numElementosOZ = i;
            numElementosPAOZ = i;
        }
        for (int i = 0; i < arrayOctavaZI.size(); i++) {
            guiAFusionar.jTextGCOZ.append((String) "Cluster [" + i + "]" + arrayOctavaZI.get(i) + " Instancias" + "-->" + "Centroide: " + (String) arrayOctavaZC.get(i) + " \n");
        }

        for (int i = 0; i < arrayOctavaZT.size(); i++) {
            guiAFusionar.jTextALOZ.append((String) "[Cluster " + i + "]" + arrayOctavaZT.get(i) + " \n");
        }

        ////////// ASIGNACIONES A LANMAKR ////////////////
        String[] lanmarkOZ = arregloprueba8O.split(","); ////// Convertir string a String []

        calculoOZ1 = cal2.fusionOctava(lanmarkOZ);
        for (int i = 0; i < calculoOZ1.size(); i++) {
            guiAFusionar.jTextFusionOZ.append((String) calculoOZ1.get(i) + "\n");
        }

////////// FUSIÓN DE CLUSTER ////////////////
        calculoOZ2 = cal2.fusionOctavaPMC(lanmarkOZ, arrayOctavaZC); // Promedio Aritmetico
        arregloPAOZ = cal2.fusionOctavaPMC1(lanmarkOZ, arrayOctavaZC);
        arregloPAOZ1 = cal2.fusionOctavaPMC2(lanmarkOZ, arrayOctavaZC);
        for (int i = 0; i < calculoOZ2.size(); i++) {
            guiAFusionar.jTextFusionOZF.append((String) calculoOZ2.get(i) + "\n");
        }

        calculoOZ3 = cal2.fusionOctavaSI(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);
        arregloInstanciasOZ = cal2.fusionOctavaSI1(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);
        arregloInstanciasOZ1 = cal2.fusionOctavaSI2(lanmarkOZ, arrayOctavaZI, arrayOctavaZC);

        for (int i = 0; i < calculoOZ3.size(); i++) {
            guiAFusionar.jTextFusionOZFI.append((String) calculoOZ3.get(i) + "\n");
        }
        calculoOZ4 = cal2.fusionOctavaPPC(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);
        arregloPPOZ = cal2.fusionOctavaPPC1(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);
        arregloPPOZ1 = cal2.fusionOctavaPPC2(lanmarkOZ, arrayOctavaZC, arrayOctavaZI);

        for (int i = 0; i < calculoOZ4.size(); i++) {
            guiAFusionar.jTextFusionOZFPP.append((String) calculoOZ4.get(i) + "\n");
            numClusterOZ = i;
            numClusterPAOZ = i;
        }

        calculoOZ5 = cal2.fusionOctavaInstancias(lanmarkOZ, arrayOctavaZNC1, arrayOctavaZNI1);
        for (int i = 0; i < calculoOZ5.size(); i++) {
            guiAFusionar.jTextFusionOZFNCI.append((String) "Cluster " + i + " " + calculoOZ5.get(i) + "\n");
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

            guiAFusionar.jOZFIndiceCH.setText(String.valueOf(indiceValidezfinal));

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
            guiAFusionar.jOZFIndiceDB.setText(String.valueOf(indiceDB));

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

            guiAFusionar.jOZFIndiceCHPA.setText(String.valueOf(indiceValidezfinal));

            System.out.println("////////////////////////////////////** CALINSKI - HARABAZ///////////////////////////////////////////");

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
            guiAFusionar.jOZFIndiceDBPA.setText(String.valueOf(indiceDB));

        }

           //////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////// INSTRUMENTOS //////
        ArrayList<String> inst1 = new ArrayList<String>(); // INSTRUMENTOS
        int cont;

        inst1 = cons.cboInstrumento();

        for (int i = 0; i < inst1.size(); i++) {

            System.out.println((String) inst1.get(i));
            cont = cons.cInstrumento(emocion3, inst1.get(i).toString());
            guiAFusionar.areaInstrumentosKMF.append((String) inst1.get(i) + " " + "Instancias: " + cont + " \n");
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////// ESCALAS //////
        ArrayList<String> esca1 = new ArrayList<String>(); // INSTRUMENTOS
        int cont1;

        esca1 = cons.cboEscala();

        for (int i = 0; i < esca1.size(); i++) {

            System.out.println((String) esca1.get(i));
            cont1 = cons.cEscala(emocion3, esca1.get(i).toString());
            guiAFusionar.areaEscalasKMF.append((String) esca1.get(i) + " " + "Instancias: " + cont1 + " \n");
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////// ACORDES //////
        ArrayList<String> acor1 = new ArrayList<String>(); // INSTRUMENTOS
        int cont2;

        acor1 = cons.cboAcorde();

        for (int i = 0; i < acor1.size(); i++) {

            System.out.println((String) acor1.get(i));
            cont2 = cons.cAcorde(emocion3, acor1.get(i).toString());
            guiAFusionar.areaAcordesKMF.append((String) acor1.get(i) + " " + "Instancias: " + cont2 + " \n");
        }

         //////////////////////////////////////////////////////////////////////////////////////////////////
               // arregloInstanciasTY1 = cal.fusionTempoSI2(lanmark1, arrayTempoYI);
        for (int i = 0; i < arregloInstanciasTX1.size(); i++) {
            System.out.println("Instancias" + arregloInstanciasTX1.get(i));
        }

        for (int i = 0; i < arregloPATX1.size(); i++) {
            System.out.println("Instancias PA" + arregloPATX1.get(i));
        }

        for (int i = 0; i < arregloPPTX1.size(); i++) {
            System.out.println("Instancias PP" + arregloPPTX1.get(i));
        }

    }

    @Override
    public boolean done() {

        return fin;
    }

}
