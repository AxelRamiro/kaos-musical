package Comportamientos;

import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Agent;
import java.util.ArrayList;

public class CEmisorPlaneador1 extends SimpleBehaviour {

    boolean fin = false;
    ContainerController cc;
    AgentController ac;

    public CEmisorPlaneador1(Agent a) {
        super(a);
    }

    @Override
    public void action() {

        ///////////// TEMPO X ////////////////////////////////
        ArrayList<String> tempoXNC = new ArrayList<String>(); //NUMERO DE CLUSTER X
        ArrayList<String> tempoXNI = new ArrayList<String>(); // INSTANCIAS TODAS TEMPO X
        ArrayList<String> tempoXInstancias = new ArrayList<String>(); // INSTANCIAS TEMPOX
        ArrayList<String> tempoXCentroide = new ArrayList<String>(); // CENTROIDE TEMPOX
        ArrayList<String> tempoXLanmark = new ArrayList<String>(); // ASIGNACIONES LANMARK

        ///////////// TEMPO Y ////////////////////////////////
        ArrayList<String> tempoYNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList<String> tempoYNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList<String> tempoYInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Y
        ArrayList<String> tempoYCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Y
        ArrayList<String> tempoYLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK 

        ///////////// TEMPO Z ////////////////////////////////
        ArrayList<String> tempoZNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList<String> tempoZNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList<String> tempoZInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Z
        ArrayList<String> tempoZCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Z
        ArrayList<String> tempoZLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK

        //////// TEMPO EN X ////////
        tempoXNC = CExtraer.arrayTempoXNC;
        tempoXNI = CExtraer.arrayTempoXNI;
        tempoXInstancias = CExtraer.arrayTempoXIprueba;
        tempoXCentroide = CExtraer.arrayTempoXCprueba;
        tempoXLanmark = CExtraer.arrayTempoXTprueba;
        ////// TEMPO EN Y //////////
        tempoYNC = CExtraer.arrayTempoYNC;
        tempoYNI = CExtraer.arrayTempoYNI;
        tempoYInstancias = CExtraer.arrayTempoYIprueba;
        tempoYCentroide = CExtraer.arrayTempoYCprueba;
        tempoYLanmark = CExtraer.arrayTempoYTprueba;

        ////// TEMPO EN Z /////////
        tempoZNC = CExtraer.arrayTempoZNC;
        tempoZNI = CExtraer.arrayTempoZNI;
        tempoZInstancias = CExtraer.arrayTempoZIprueba;
        tempoZCentroide = CExtraer.arrayTempoZCprueba;
        tempoZLanmark = CExtraer.arrayTempoZTprueba;

        ///////////// duracion X ////////////////////////////////
        ArrayList<String> duracionXNC = new ArrayList<String>(); //NUMERO DE CLUSTER X
        ArrayList<String> duracionXNI = new ArrayList<String>(); // INSTANCIAS TODAS TEMPO X
        ArrayList<String> duracionXInstancias = new ArrayList<String>(); // INSTANCIAS TEMPOX
        ArrayList<String> duracionXCentroide = new ArrayList<String>(); // CENTROIDE TEMPOX
        ArrayList<String> duracionXLanmark = new ArrayList<String>(); // ASIGNACIONES LANMARK

        ///////////// duracion Y ////////////////////////////////
        ArrayList<String> duracionYNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList<String> duracionYNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList<String> duracionYInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Y
        ArrayList<String> duracionYCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Y
        ArrayList<String> duracionYLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK 

        ///////////// duracion Z ////////////////////////////////
        ArrayList<String> duracionZNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList<String> duracionZNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList<String> duracionZInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Z
        ArrayList<String> duracionZCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Z
        ArrayList<String> duracionZLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK

        //////// duracion EN X ////////
        duracionXNC = CExtraer.arrayDuracionXNC;
        duracionXNI = CExtraer.arrayDuracionXNI;
        duracionXInstancias = CExtraer.arrayDuracionXIprueba;
        duracionXCentroide = CExtraer.arrayDuracionXCprueba;
        duracionXLanmark = CExtraer.arrayDuracionXTprueba;
        ////// duracion EN Y //////////
        duracionYNC = CExtraer.arrayDuracionYNC;
        duracionYNI = CExtraer.arrayDuracionYNI;
        duracionYInstancias = CExtraer.arrayDuracionYIprueba;
        duracionYCentroide = CExtraer.arrayDuracionYCprueba;
        duracionYLanmark = CExtraer.arrayDuracionYTprueba;

        ////// duracion EN Z /////////
        duracionZNC = CExtraer.arrayDuracionZNC;
        duracionZNI = CExtraer.arrayDuracionZNI;
        duracionZInstancias = CExtraer.arrayDuracionZIprueba;
        duracionZCentroide = CExtraer.arrayDuracionZCprueba;
        duracionZLanmark = CExtraer.arrayDuracionZTprueba;

        ///////////// octava X ////////////////////////////////
        ArrayList<String> octavaXNC = new ArrayList<String>(); //NUMERO DE CLUSTER X
        ArrayList<String> octavaXNI = new ArrayList<String>(); // INSTANCIAS TODAS TEMPO X
        ArrayList<String> octavaXInstancias = new ArrayList<String>(); // INSTANCIAS TEMPOX
        ArrayList<String> octavaXCentroide = new ArrayList<String>(); // CENTROIDE TEMPOX
        ArrayList<String> octavaXLanmark = new ArrayList<String>(); // ASIGNACIONES LANMARK

        ///////////// octava Y ////////////////////////////////
        ArrayList<String> octavaYNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList<String> octavaYNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList<String> octavaYInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Y
        ArrayList<String> octavaYCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Y
        ArrayList<String> octavaYLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK 

        ///////////// octava Z ////////////////////////////////
        ArrayList<String> octavaZNC = new ArrayList<String>(); // NUMERO DE CLUSTER TEMPO Y
        ArrayList<String> octavaZNI = new ArrayList<String>(); // INTANCIAS TODAS TEMPO Y
        ArrayList<String> octavaZInstancias = new ArrayList<String>(); // INSTANCIAS TEMPO Z
        ArrayList<String> octavaZCentroide = new ArrayList<String>(); // CENTROIDE TEMPO Z
        ArrayList<String> octavaZLanmark = new ArrayList<String>(); // ASIGNACIONES A LANMARK

        //////// octava EN X ////////
        octavaXNC = CExtraer.arrayOctavaXNC;
        octavaXNI = CExtraer.arrayOctavaXNI;
        octavaXInstancias = CExtraer.arrayOctavaXIprueba;
        octavaXCentroide = CExtraer.arrayOctavaXCprueba;
        octavaXLanmark = CExtraer.arrayOctavaXTprueba;
        ////// octava EN Y //////////
        octavaYNC = CExtraer.arrayOctavaYNC;
        octavaYNI = CExtraer.arrayOctavaYNI;
        octavaYInstancias = CExtraer.arrayOctavaYIprueba;
        octavaYCentroide = CExtraer.arrayOctavaYCprueba;
        octavaYLanmark = CExtraer.arrayOctavaYTprueba;

        ////// octava EN Z /////////
        octavaZNC = CExtraer.arrayOctavaZNC;
        octavaZNI = CExtraer.arrayOctavaZNI;
        octavaZInstancias = CExtraer.arrayOctavaZIprueba;
        octavaZCentroide = CExtraer.arrayOctavaZCprueba;
        octavaZLanmark = CExtraer.arrayOctavaZTprueba;

        ///////// MENSAJE UNO //////////
        String listaint = "";
        for (String s : tempoXInstancias) {
            listaint += s + ",";
        }

        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias Tempo X a AGENTE FUSION");
        AID id = new AID();
        id.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje.setSender(myAgent.getAID());
        mensaje.setLanguage("Español");
        mensaje.addReceiver(id);
        mensaje.setContent(listaint);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje);

        System.out.println(myAgent.getLocalName() + ": Enviando arreglo de instancias Tempo X  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje2 = myAgent.blockingReceive();
        if (mensaje2 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje2.toString());
            fin = true;
        }
        ////////////    MENSAJE DOS   //////
        String listacen = "";
        for (String s : tempoXCentroide) {
            listacen += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroides Tempo X a AGENTE FUSION");
        AID id1 = new AID();
        id1.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje3 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje3.setSender(myAgent.getAID());
        mensaje3.setLanguage("Español");
        mensaje3.addReceiver(id1);
        mensaje3.setContent(listacen); ///// String lista centroide ////
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje3);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje3.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje4 = myAgent.blockingReceive();
        if (mensaje4 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje4.toString());
            fin = true;
        }
           ///////    MENSAJE TRES   //////
        ////// Convierte en string el arreglo /////  
        String listaref = "";
        for (String s : tempoXLanmark) {
            listaref += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
        AID id2 = new AID();
        id2.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje5 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje5.setSender(myAgent.getAID());
        mensaje5.setLanguage("Español");
        mensaje5.addReceiver(id2);
        mensaje5.setContent(listaref);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje5);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje5.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje6 = myAgent.blockingReceive();
        if (mensaje6 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje6.toString());
            fin = true;
        }
        ///////    MENSAJE CUATRO   //////
        String listainty = "";
        for (String s : tempoYInstancias) {
            listainty += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglod e instancias tempo y a AGENTE FUSION");
        AID id3 = new AID();
        id3.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje7 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje7.setSender(myAgent.getAID());
        mensaje7.setLanguage("Español");
        mensaje7.addReceiver(id3);
        mensaje7.setContent(listainty);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje7);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje7.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje8 = myAgent.blockingReceive();
        if (mensaje8 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje8.toString());
            fin = true;
        }
        ///////    MENSAJE CINCO   //////
        String listaceny = "";
        for (String s : tempoYCentroide) {
            listaceny += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
        AID id4 = new AID();
        id4.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje9 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje9.setSender(myAgent.getAID());
        mensaje9.setLanguage("Español");
        mensaje9.addReceiver(id4);
        mensaje9.setContent(listaceny);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje9);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje9.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje10 = myAgent.blockingReceive();
        if (mensaje10 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje10.toString());
            fin = true;
        }
        ///////    MENSAJE SEIS   //////
        String listarefy = "";
        for (String s : tempoYLanmark) {
            listarefy += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
        AID id5 = new AID();
        id5.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje11 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje11.setSender(myAgent.getAID());
        mensaje11.setLanguage("Español");
        mensaje11.addReceiver(id5);
        mensaje11.setContent(listarefy);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje11);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje11.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje12 = myAgent.blockingReceive();
        if (mensaje12 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje12.toString());
            fin = true;
        }
        ///////    MENSAJE SIETE   //////
        String listaintz = "";
        for (String s : tempoZInstancias) {
            listaintz += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias tempo z a AGENTE FUSION");
        AID id6 = new AID();
        id6.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje13 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje13.setSender(myAgent.getAID());
        mensaje13.setLanguage("Español");
        mensaje13.addReceiver(id6);
        mensaje13.setContent(listaintz);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje13);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje13.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje14 = myAgent.blockingReceive();
        if (mensaje14 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje14.toString());
            fin = true;
        }
        ///////    MENSAJE OCHO   //////
        String listacenz = "";
        for (String s : tempoZCentroide) {
            listacenz += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
        AID id7 = new AID();
        id7.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje15 = new ACLMessage(ACLMessage.REQUEST);

        //Rellenar los campos necesarios del mensaje
        mensaje15.setSender(myAgent.getAID());
        mensaje15.setLanguage("Español");
        mensaje15.addReceiver(id7);
        mensaje15.setContent(listacenz);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje15);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje15.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje16 = myAgent.blockingReceive();
        if (mensaje16 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje16.toString());
            fin = true;
        }
        ///////    MENSAJE NUEVE   //////
        String listatemz = "";
        for (String s : tempoZLanmark) {
            listatemz += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
        AID id8 = new AID();
        id8.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje17 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje17.setSender(myAgent.getAID());
        mensaje17.setLanguage("Español");
        mensaje17.addReceiver(id8);
        mensaje17.setContent(listatemz);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje17);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje17.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje18 = myAgent.blockingReceive();
        if (mensaje18 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje18.toString());
            fin = true;
        }
        ///////    MENSAJE DIEZ   //////   
        String listatemxnc = "";
        for (String s : tempoXNC) {
            listatemxnc += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo x a AGENTE FUSION");
        AID id9 = new AID();
        id9.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje19 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje19.setSender(myAgent.getAID());
        mensaje19.setLanguage("Español");
        mensaje19.addReceiver(id9);
        mensaje19.setContent(listatemxnc);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje19);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje19.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje20 = myAgent.blockingReceive();
        if (mensaje20 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje20.toString());
            fin = true;
        }

        ///////    MENSAJE ONCE   //////   
        String listatemxi = "";
        for (String s : tempoXNI) {
            listatemxi += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id10 = new AID();
        id10.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje21 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje21.setSender(myAgent.getAID());
        mensaje21.setLanguage("Español");
        mensaje21.addReceiver(id10);
        mensaje21.setContent(listatemxi);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje21);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje21.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje22 = myAgent.blockingReceive();
        if (mensaje22 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje22.toString());
            fin = true;
        }
        ///////    MENSAJE DOCE   //////   
        String listatemync = "";
        for (String s : tempoYNC) {
            listatemync += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
        AID id11 = new AID();
        id11.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje23 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje23.setSender(myAgent.getAID());
        mensaje23.setLanguage("Español");
        mensaje23.addReceiver(id11);
        mensaje23.setContent(listatemync);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje23);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje23.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje24 = myAgent.blockingReceive();
        if (mensaje24 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje24.toString());
            fin = true;
        }
        ///////    MENSAJE TRECE   //////   
        String listatemyi = "";
        for (String s : tempoYNI) {
            listatemyi += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id12 = new AID();
        id12.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje25 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje25.setSender(myAgent.getAID());
        mensaje25.setLanguage("Español");
        mensaje25.addReceiver(id11);
        mensaje25.setContent(listatemyi);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje25);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje25.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje26 = myAgent.blockingReceive();
        if (mensaje26 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje26.toString());
            fin = true;
        }

        ///////    MENSAJE CATORCE   //////   
        String listatemznc = "";
        for (String s : tempoZNC) {
            listatemznc += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
        AID id13 = new AID();
        id13.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje27 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje27.setSender(myAgent.getAID());
        mensaje27.setLanguage("Español");
        mensaje27.addReceiver(id13);
        mensaje27.setContent(listatemznc);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje27);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje27.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje28 = myAgent.blockingReceive();
        if (mensaje28 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje28.toString());
            fin = true;
        }
        ///////    MENSAJE QUINCE   //////   
        String listatemzi = "";
        for (String s : tempoZNI) {
            listatemzi += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
        AID id14 = new AID();
        id14.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje29 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje29.setSender(myAgent.getAID());
        mensaje29.setLanguage("Español");
        mensaje29.addReceiver(id14);
        mensaje29.setContent(listatemzi);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje29);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje29.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje30 = myAgent.blockingReceive();
        if (mensaje30 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje30.toString());
            fin = true;
        }
            //////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////

            //////// DURACION ///////////////////////
        ///////// MENSAJE UNO //////////
        String listaintD = "";
        for (String s : duracionXInstancias) {
            listaintD += s + ",";
        }

        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias duracion X a AGENTE FUSION");
        AID id15 = new AID();
        id15.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje31 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje31.setSender(myAgent.getAID());
        mensaje31.setLanguage("Español");
        mensaje31.addReceiver(id15);
        mensaje31.setContent(listaintD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje31);

        System.out.println(myAgent.getLocalName() + ": Enviando arreglo de instancias DURACION X  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje31.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje32 = myAgent.blockingReceive();
        if (mensaje32 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje32.toString());
            fin = true;
        }

        ////////////    MENSAJE DOS   //////
        String listacenD = "";
        for (String s : duracionXCentroide) {
            listacenD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroides DURACION X a AGENTE FUSION");
        AID id16 = new AID();
        id16.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje33 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje33.setSender(myAgent.getAID());
        mensaje33.setLanguage("Español");
        mensaje33.addReceiver(id16);
        mensaje33.setContent(listacenD); ///// String lista centroide ////
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje33);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje33.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje34 = myAgent.blockingReceive();
        if (mensaje34 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje34.toString());
            fin = true;
        }
           ///////    MENSAJE TRES   //////
        ////// Convierte en string el arreglo /////  
        String listarefD = "";
        for (String s : duracionXLanmark) {
            listarefD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
        AID id17 = new AID();
        id17.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje35 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje35.setSender(myAgent.getAID());
        mensaje35.setLanguage("Español");
        mensaje35.addReceiver(id17);
        mensaje35.setContent(listarefD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje35);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje35.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje36 = myAgent.blockingReceive();
        if (mensaje36 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje36.toString());
            fin = true;
        }

        ///////    MENSAJE CUATRO   //////
        String listaintyD = "";
        for (String s : duracionYInstancias) {
            listaintyD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglod e instancias duracion y a AGENTE FUSION");
        AID id18 = new AID();
        id18.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje37 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje37.setSender(myAgent.getAID());
        mensaje37.setLanguage("Español");
        mensaje37.addReceiver(id18);
        mensaje37.setContent(listaintyD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje37);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje37.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje38 = myAgent.blockingReceive();
        if (mensaje38 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje38.toString());
            fin = true;
        }
        ///////    MENSAJE CINCO   //////
        String listacenyD = "";
        for (String s : duracionYCentroide) {
            listacenyD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
        AID id19 = new AID();
        id19.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje39 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje39.setSender(myAgent.getAID());
        mensaje39.setLanguage("Español");
        mensaje39.addReceiver(id19);
        mensaje39.setContent(listacenyD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje39);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje39.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje40 = myAgent.blockingReceive();
        if (mensaje40 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje40.toString());
            fin = true;
        }
        ///////    MENSAJE SEIS   //////
        String listarefyD = "";
        for (String s : duracionYLanmark) {
            listarefyD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
        AID id20 = new AID();
        id20.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje41 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje41.setSender(myAgent.getAID());
        mensaje41.setLanguage("Español");
        mensaje41.addReceiver(id20);
        mensaje41.setContent(listarefyD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje41);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje41.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje42 = myAgent.blockingReceive();
        if (mensaje42 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje42.toString());
            fin = true;
        }

        ///////    MENSAJE SIETE   //////
        String listaintzD = "";
        for (String s : duracionZInstancias) {
            listaintzD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias DURACION z a AGENTE FUSION");
        AID id21 = new AID();
        id21.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje43 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje43.setSender(myAgent.getAID());
        mensaje43.setLanguage("Español");
        mensaje43.addReceiver(id21);
        mensaje43.setContent(listaintzD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje43);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje43.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje44 = myAgent.blockingReceive();
        if (mensaje44 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje44.toString());
            fin = true;
        }
        ///////    MENSAJE OCHO   //////
        String listacenzD = "";
        for (String s : duracionZCentroide) {
            listacenzD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
        AID id22 = new AID();
        id22.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje45 = new ACLMessage(ACLMessage.REQUEST);

        //Rellenar los campos necesarios del mensaje
        mensaje45.setSender(myAgent.getAID());
        mensaje45.setLanguage("Español");
        mensaje45.addReceiver(id22);
        mensaje45.setContent(listacenzD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje45);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje45.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje46 = myAgent.blockingReceive();
        if (mensaje46 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje46.toString());
            fin = true;
        }
        ///////    MENSAJE NUEVE   //////
        String listatemzD = "";
        for (String s : duracionZLanmark) {
            listatemzD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
        AID id23 = new AID();
        id23.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje47 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje47.setSender(myAgent.getAID());
        mensaje47.setLanguage("Español");
        mensaje47.addReceiver(id23);
        mensaje47.setContent(listatemzD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje47);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje47.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje48 = myAgent.blockingReceive();
        if (mensaje48 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje48.toString());
            fin = true;
        }

        ///////    MENSAJE DIEZ   //////   
        String listatemxncD = "";
        for (String s : duracionXNC) {
            listatemxncD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster duracion x a AGENTE FUSION");
        AID id24 = new AID();
        id24.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje49 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje49.setSender(myAgent.getAID());
        mensaje49.setLanguage("Español");
        mensaje49.addReceiver(id24);
        mensaje49.setContent(listatemxncD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje49);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje49.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje50 = myAgent.blockingReceive();
        if (mensaje50 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje50.toString());
            fin = true;
        }

        ///////    MENSAJE ONCE   //////   
        String listatemxiD = "";
        for (String s : duracionXNI) {
            listatemxiD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id25 = new AID();
        id25.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje51 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje51.setSender(myAgent.getAID());
        mensaje51.setLanguage("Español");
        mensaje51.addReceiver(id25);
        mensaje51.setContent(listatemxiD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje51);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje51.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje52 = myAgent.blockingReceive();
        if (mensaje52 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje52.toString());
            fin = true;
        }

        ///////    MENSAJE DOCE   //////   
        String listatemyncD = "";
        for (String s : duracionYNC) {
            listatemyncD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
        AID id26 = new AID();
        id26.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje53 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje53.setSender(myAgent.getAID());
        mensaje53.setLanguage("Español");
        mensaje53.addReceiver(id26);
        mensaje53.setContent(listatemyncD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje53);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje53.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje54 = myAgent.blockingReceive();
        if (mensaje54 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje54.toString());
            fin = true;
        }
        ///////    MENSAJE TRECE   //////   
        String listatemyiD = "";
        for (String s : duracionYNI) {
            listatemyiD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id27 = new AID();
        id27.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje55 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje55.setSender(myAgent.getAID());
        mensaje55.setLanguage("Español");
        mensaje55.addReceiver(id27);
        mensaje55.setContent(listatemyiD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje55);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje55.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje56 = myAgent.blockingReceive();
        if (mensaje56 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje56.toString());
            fin = true;
        }

        ///////    MENSAJE CATORCE   //////   
        String listatemzncD = "";
        for (String s : duracionZNC) {
            listatemzncD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
        AID id28 = new AID();
        id28.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje57 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje57.setSender(myAgent.getAID());
        mensaje57.setLanguage("Español");
        mensaje57.addReceiver(id28);
        mensaje57.setContent(listatemzncD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje57);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje57.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje58 = myAgent.blockingReceive();
        if (mensaje58 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje58.toString());
            fin = true;
        }
        ///////    MENSAJE QUINCE   //////   
        String listatemziD = "";
        for (String s : duracionZNI) {
            listatemziD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
        AID id29 = new AID();
        id29.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje59 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje59.setSender(myAgent.getAID());
        mensaje59.setLanguage("Español");
        mensaje59.addReceiver(id29);
        mensaje59.setContent(listatemziD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje59);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje59.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje60 = myAgent.blockingReceive();
        if (mensaje60 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje60.toString());
            fin = true;
        }

            /////////////////////////////////////////////////////
        //////////////// OCTAVAS ////////////////////
        ///////// MENSAJE UNO //////////
        String listaintO = "";
        for (String s : octavaXInstancias) {
            listaintO += s + ",";
        }

        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias duracion X a AGENTE FUSION");
        AID id30 = new AID();
        id30.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje61 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje61.setSender(myAgent.getAID());
        mensaje61.setLanguage("Español");
        mensaje61.addReceiver(id30);
        mensaje61.setContent(listaintO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje61);

        System.out.println(myAgent.getLocalName() + ": Enviando arreglo de instancias DURACION X  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje61.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje62 = myAgent.blockingReceive();
        if (mensaje62 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje62.toString());
            fin = true;
        }

        ////////////    MENSAJE DOS   //////
        String listacenO = "";
        for (String s : octavaXCentroide) {
            listacenO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroides DURACION X a AGENTE FUSION");
        AID id31 = new AID();
        id31.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje63 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje63.setSender(myAgent.getAID());
        mensaje63.setLanguage("Español");
        mensaje63.addReceiver(id31);
        mensaje63.setContent(listacenO); ///// String lista centroide ////
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje63);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje63.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje64 = myAgent.blockingReceive();
        if (mensaje64 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje64.toString());
            fin = true;
        }

            ///////    MENSAJE TRES   //////
        ////// Convierte en string el arreglo /////  
        String listarefO = "";
        for (String s : octavaXLanmark) {
            listarefO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
        AID id32 = new AID();
        id32.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje65 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje65.setSender(myAgent.getAID());
        mensaje65.setLanguage("Español");
        mensaje65.addReceiver(id32);
        mensaje65.setContent(listarefO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje65);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje65.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje66 = myAgent.blockingReceive();
        if (mensaje66 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje66.toString());
            fin = true;
        }

        ///////    MENSAJE CUATRO   //////
        String listaintyO = "";
        for (String s : octavaYInstancias) {
            listaintyO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglod e instancias duracion y a AGENTE FUSION");
        AID id33 = new AID();
        id33.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje67 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje67.setSender(myAgent.getAID());
        mensaje67.setLanguage("Español");
        mensaje67.addReceiver(id33);
        mensaje67.setContent(listaintyO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje67);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje67.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje68 = myAgent.blockingReceive();
        if (mensaje68 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje68.toString());
            fin = true;
        }
        ///////    MENSAJE CINCO   //////
        String listacenyO = "";
        for (String s : octavaYCentroide) {
            listacenyO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
        AID id34 = new AID();
        id34.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje69 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje69.setSender(myAgent.getAID());
        mensaje69.setLanguage("Español");
        mensaje69.addReceiver(id34);
        mensaje69.setContent(listacenyO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje69);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje69.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje70 = myAgent.blockingReceive();
        if (mensaje70 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje70.toString());
            fin = true;
        }

        ///////    MENSAJE SEIS   //////
        String listarefyO = "";
        for (String s : octavaYLanmark) {
            listarefyO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
        AID id35 = new AID();
        id35.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje71 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje71.setSender(myAgent.getAID());
        mensaje71.setLanguage("Español");
        mensaje71.addReceiver(id35);
        mensaje71.setContent(listarefyO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje71);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje71.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje72 = myAgent.blockingReceive();
        if (mensaje72 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje72.toString());
            fin = true;
        }

        ///////    MENSAJE SIETE   //////
        String listaintzO = "";
        for (String s : octavaZInstancias) {
            listaintzO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias DURACION z a AGENTE FUSION");
        AID id36 = new AID();
        id36.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje73 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje73.setSender(myAgent.getAID());
        mensaje73.setLanguage("Español");
        mensaje73.addReceiver(id36);
        mensaje73.setContent(listaintzO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje73);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje73.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje74 = myAgent.blockingReceive();
        if (mensaje74 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje74.toString());
            fin = true;
        }
        ///////    MENSAJE OCHO   //////
        String listacenzO = "";
        for (String s : octavaZCentroide) {
            listacenzO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
        AID id37 = new AID();
        id37.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje75 = new ACLMessage(ACLMessage.REQUEST);

        //Rellenar los campos necesarios del mensaje
        mensaje75.setSender(myAgent.getAID());
        mensaje75.setLanguage("Español");
        mensaje75.addReceiver(id37);
        mensaje75.setContent(listacenzO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje75);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje75.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje76 = myAgent.blockingReceive();
        if (mensaje76 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje76.toString());
            fin = true;
        }
        ///////    MENSAJE NUEVE   //////
        String listatemzO = "";
        for (String s : octavaZLanmark) {
            listatemzO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
        AID id38 = new AID();
        id38.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje77 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje77.setSender(myAgent.getAID());
        mensaje77.setLanguage("Español");
        mensaje77.addReceiver(id38);
        mensaje77.setContent(listatemzO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje77);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje77.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje78 = myAgent.blockingReceive();
        if (mensaje78 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje78.toString());
            fin = true;
        }

        ///////    MENSAJE DIEZ   //////   
        String listatemxncO = "";
        for (String s : octavaXNC) {
            listatemxncO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster duracion x a AGENTE FUSION");
        AID id39 = new AID();
        id39.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje79 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje79.setSender(myAgent.getAID());
        mensaje79.setLanguage("Español");
        mensaje79.addReceiver(id39);
        mensaje79.setContent(listatemxncO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje79);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje79.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje80 = myAgent.blockingReceive();
        if (mensaje80 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje80.toString());
            fin = true;
        }

        ///////    MENSAJE ONCE   //////   
        String listatemxiO = "";
        for (String s : octavaXNI) {
            listatemxiO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id40 = new AID();
        id40.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje81 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje81.setSender(myAgent.getAID());
        mensaje81.setLanguage("Español");
        mensaje81.addReceiver(id40);
        mensaje81.setContent(listatemxiO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje81);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje81.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje82 = myAgent.blockingReceive();
        if (mensaje82 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje82.toString());
            fin = true;
        }

        ///////    MENSAJE DOCE   //////   
        String listatemyncO = "";
        for (String s : octavaYNC) {
            listatemyncO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
        AID id41 = new AID();
        id41.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje83 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje83.setSender(myAgent.getAID());
        mensaje83.setLanguage("Español");
        mensaje83.addReceiver(id41);
        mensaje83.setContent(listatemyncO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje83);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje83.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje84 = myAgent.blockingReceive();
        if (mensaje84 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje84.toString());
            fin = true;
        }
        ///////    MENSAJE TRECE   //////   
        String listatemyiO = "";
        for (String s : octavaYNI) {
            listatemyiO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id42 = new AID();
        id42.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje85 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje85.setSender(myAgent.getAID());
        mensaje85.setLanguage("Español");
        mensaje85.addReceiver(id42);
        mensaje85.setContent(listatemyiO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje85);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje85.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje86 = myAgent.blockingReceive();
        if (mensaje86 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje86.toString());
            fin = true;
        }

        ///////    MENSAJE CATORCE   //////   
        String listatemzncO = "";
        for (String s : octavaZNC) {
            listatemzncO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
        AID id43 = new AID();
        id43.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje87 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje87.setSender(myAgent.getAID());
        mensaje87.setLanguage("Español");
        mensaje87.addReceiver(id43);
        mensaje87.setContent(listatemzncO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje87);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje87.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje88 = myAgent.blockingReceive();
        if (mensaje88 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje88.toString());
            fin = true;
        }
        ///////    MENSAJE QUINCE   //////   
        String listatemziO = "";
        for (String s : octavaZNI) {
            listatemziO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
        AID id44 = new AID();
        id44.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje89 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje89.setSender(myAgent.getAID());
        mensaje89.setLanguage("Español");
        mensaje89.addReceiver(id44);
        mensaje89.setContent(listatemziO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje89);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje89.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje90 = myAgent.blockingReceive();
        if (mensaje90 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje90.toString());
            fin = true;
        }

    }

    public boolean done() {
        return fin = true;
    }

}
