package Comportamientos;

import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.core.Agent;
import java.util.ArrayList;

public class CEmisorPlaneador1EM extends SimpleBehaviour {

    boolean fin = false;
    ContainerController cc;
    AgentController ac;

    public CEmisorPlaneador1EM(Agent a) {
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
        tempoXNC = CExtraer.arrayTempoXNCEM;
        tempoXNI = CExtraer.arrayTempoXNIEM;
        tempoXInstancias = CExtraer.arrayTempoXIpruebaEM;
        tempoXCentroide = CExtraer.arrayTempoXCpruebaEM;
        tempoXLanmark = CExtraer.arrayTempoXTpruebaEM;
        ////// TEMPO EN Y //////////
        tempoYNC = CExtraer.arrayTempoYNCEM;
        tempoYNI = CExtraer.arrayTempoYNIEM;
        tempoYInstancias = CExtraer.arrayTempoYIpruebaEM;
        tempoYCentroide = CExtraer.arrayTempoYCpruebaEM;
        tempoYLanmark = CExtraer.arrayTempoYTpruebaEM;

        ////// TEMPO EN Z /////////
        tempoZNC = CExtraer.arrayTempoZNCEM;
        tempoZNI = CExtraer.arrayTempoZNIEM;
        tempoZInstancias = CExtraer.arrayTempoZIpruebaEM;
        tempoZCentroide = CExtraer.arrayTempoZCpruebaEM;
        tempoZLanmark = CExtraer.arrayTempoZTpruebaEM;
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
        duracionXNC = CExtraer.arrayDuracionXNCEM;
        duracionXNI = CExtraer.arrayDuracionXNIEM;
        duracionXInstancias = CExtraer.arrayDuracionXIpruebaEM;
        duracionXCentroide = CExtraer.arrayDuracionXCpruebaEM;
        duracionXLanmark = CExtraer.arrayDuracionXTpruebaEM;
        ////// duracion EN Y //////////
        duracionYNC = CExtraer.arrayDuracionYNCEM;
        duracionYNI = CExtraer.arrayDuracionYNIEM;
        duracionYInstancias = CExtraer.arrayDuracionYIpruebaEM;
        duracionYCentroide = CExtraer.arrayDuracionYCpruebaEM;
        duracionYLanmark = CExtraer.arrayDuracionYTpruebaEM;
        ////// duracion EN Z /////////
        duracionZNC = CExtraer.arrayDuracionZNCEM;
        duracionZNI = CExtraer.arrayDuracionZNIEM;
        duracionZInstancias = CExtraer.arrayDuracionZIpruebaEM;
        duracionZCentroide = CExtraer.arrayDuracionZCpruebaEM;
        duracionZLanmark = CExtraer.arrayDuracionZTpruebaEM;
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
        octavaXNC = CExtraer.arrayOctavaXNCEM;
        octavaXNI = CExtraer.arrayOctavaXNIEM;
        octavaXInstancias = CExtraer.arrayOctavaXIpruebaEM;
        octavaXCentroide = CExtraer.arrayOctavaXCpruebaEM;
        octavaXLanmark = CExtraer.arrayOctavaXTpruebaEM;
        ////// octava EN Y //////////
        octavaYNC = CExtraer.arrayOctavaYNCEM;
        octavaYNI = CExtraer.arrayOctavaYNIEM;
        octavaYInstancias = CExtraer.arrayOctavaYIpruebaEM;
        octavaYCentroide = CExtraer.arrayOctavaYCpruebaEM;
        octavaYLanmark = CExtraer.arrayOctavaYTpruebaEM;
        ////// octava EN Z /////////
        octavaZNC = CExtraer.arrayOctavaZNCEM;
        octavaZNI = CExtraer.arrayOctavaZNIEM;
        octavaZInstancias = CExtraer.arrayOctavaZIpruebaEM;
        octavaZCentroide = CExtraer.arrayOctavaZCpruebaEM;
        octavaZLanmark = CExtraer.arrayOctavaZTpruebaEM;
        ///////// MENSAJE UNO //////////
        String listaint = "";
        for (String s : tempoXInstancias) {
            listaint += s + ",";
        }

        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias Tempo X a AGENTE FUSION");
        AID id90 = new AID();
        id90.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje181 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje181.setSender(myAgent.getAID());
        mensaje181.setLanguage("Español");
        mensaje181.addReceiver(id90);
        mensaje181.setContent(listaint);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje181);

        System.out.println(myAgent.getLocalName() + ": Enviando arreglo de instancias Tempo X  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje181.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje182 = myAgent.blockingReceive();
        if (mensaje182 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje182.toString());
            fin = true;
        }
        ////////////    MENSAJE DOS   //////
        String listacen = "";
        for (String s : tempoXCentroide) {
            listacen += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroides Tempo X a AGENTE FUSION");
        AID id91 = new AID();
        id91.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje183 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje183.setSender(myAgent.getAID());
        mensaje183.setLanguage("Español");
        mensaje183.addReceiver(id91);
        mensaje183.setContent(listacen); ///// String lista centroide ////
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje183);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje183.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje184 = myAgent.blockingReceive();
        if (mensaje184 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje184.toString());
            fin = true;
        }
           ///////    MENSAJE TRES   //////
        ////// Convierte en string el arreglo /////  
        String listaref = "";
        for (String s : tempoXLanmark) {
            listaref += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
        AID id92 = new AID();
        id92.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje185 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje185.setSender(myAgent.getAID());
        mensaje185.setLanguage("Español");
        mensaje185.addReceiver(id92);
        mensaje185.setContent(listaref);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje185);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje185.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje186 = myAgent.blockingReceive();
        if (mensaje186 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje186.toString());
            fin = true;
        }
        ///////    MENSAJE CUATRO   //////
        String listainty = "";
        for (String s : tempoYInstancias) {
            listainty += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglod e instancias tempo y a AGENTE FUSION");
        AID id93 = new AID();
        id93.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje187 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje187.setSender(myAgent.getAID());
        mensaje187.setLanguage("Español");
        mensaje187.addReceiver(id93);
        mensaje187.setContent(listainty);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje187);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje187.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje188 = myAgent.blockingReceive();
        if (mensaje188 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje188.toString());
            fin = true;
        }
             ///////    MENSAJE CINCO   //////

        String listaceny = "";
        for (String s : tempoYCentroide) {
            listaceny += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
        AID id94 = new AID();
        id94.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje189 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje189.setSender(myAgent.getAID());
        mensaje189.setLanguage("Español");
        mensaje189.addReceiver(id94);
        mensaje189.setContent(listaceny);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje189);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje189.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje190 = myAgent.blockingReceive();
        if (mensaje190 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje190.toString());
            fin = true;
        }
        ///////    MENSAJE SEIS   //////
        String listarefy = "";
        for (String s : tempoYLanmark) {
            listarefy += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
        AID id95 = new AID();
        id95.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje191 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje191.setSender(myAgent.getAID());
        mensaje191.setLanguage("Español");
        mensaje191.addReceiver(id95);
        mensaje191.setContent(listarefy);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje191);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje191.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje192 = myAgent.blockingReceive();
        if (mensaje192 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje192.toString());
            fin = true;
        }
        ///////    MENSAJE SIETE   //////
        String listaintz = "";
        for (String s : tempoZInstancias) {
            listaintz += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias tempo z a AGENTE FUSION");
        AID id96 = new AID();
        id96.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje193 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje193.setSender(myAgent.getAID());
        mensaje193.setLanguage("Español");
        mensaje193.addReceiver(id96);
        mensaje193.setContent(listaintz);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje193);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje193.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje194 = myAgent.blockingReceive();
        if (mensaje194 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje194.toString());
            fin = true;
        }
        ///////    MENSAJE OCHO   //////
        String listacenz = "";
        for (String s : tempoZCentroide) {
            listacenz += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
        AID id97 = new AID();
        id97.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje195 = new ACLMessage(ACLMessage.REQUEST);

        //Rellenar los campos necesarios del mensaje
        mensaje195.setSender(myAgent.getAID());
        mensaje195.setLanguage("Español");
        mensaje195.addReceiver(id97);
        mensaje195.setContent(listacenz);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje195);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje195.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje196 = myAgent.blockingReceive();
        if (mensaje196 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje196.toString());
            fin = true;
        }
        ///////    MENSAJE NUEVE   //////
        String listatemz = "";
        for (String s : tempoZLanmark) {
            listatemz += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
        AID id98 = new AID();
        id98.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje197 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje197.setSender(myAgent.getAID());
        mensaje197.setLanguage("Español");
        mensaje197.addReceiver(id98);
        mensaje197.setContent(listatemz);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje197);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje197.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje198 = myAgent.blockingReceive();
        if (mensaje198 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje198.toString());
            fin = true;
        }

        ///////    MENSAJE DIEZ   //////   
        String listatemxnc = "";
        for (String s : tempoXNC) {
            listatemxnc += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo x a AGENTE FUSION");
        AID id99 = new AID();
        id99.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje199 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje199.setSender(myAgent.getAID());
        mensaje199.setLanguage("Español");
        mensaje199.addReceiver(id99);
        mensaje199.setContent(listatemxnc);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje199);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje199.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje200 = myAgent.blockingReceive();
        if (mensaje200 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje200.toString());
            fin = true;
        }

        ///////    MENSAJE ONCE   //////   
        String listatemxi = "";
        for (String s : tempoXNI) {
            listatemxi += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id100 = new AID();
        id100.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje201 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje201.setSender(myAgent.getAID());
        mensaje201.setLanguage("Español");
        mensaje201.addReceiver(id100);
        mensaje201.setContent(listatemxi);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje201);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje201.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje202 = myAgent.blockingReceive();
        if (mensaje202 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje202.toString());
            fin = true;
        }
        ///////    MENSAJE DOCE   //////   
        String listatemync = "";
        for (String s : tempoYNC) {
            listatemync += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
        AID id102 = new AID();
        id102.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje203 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje203.setSender(myAgent.getAID());
        mensaje203.setLanguage("Español");
        mensaje203.addReceiver(id102);
        mensaje203.setContent(listatemync);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje203);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje203.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje204 = myAgent.blockingReceive();
        if (mensaje204 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje204.toString());
            fin = true;
        }
        ///////    MENSAJE TRECE   //////   
        String listatemyi = "";
        for (String s : tempoYNI) {
            listatemyi += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id103 = new AID();
        id103.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje205 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje205.setSender(myAgent.getAID());
        mensaje205.setLanguage("Español");
        mensaje205.addReceiver(id103);
        mensaje205.setContent(listatemyi);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje205);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje205.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje206 = myAgent.blockingReceive();
        if (mensaje206 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje206.toString());
            fin = true;
        }

        ///////    MENSAJE CATORCE   //////   
        String listatemznc = "";
        for (String s : tempoZNC) {
            listatemznc += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
        AID id104 = new AID();
        id104.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje207 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje207.setSender(myAgent.getAID());
        mensaje207.setLanguage("Español");
        mensaje207.addReceiver(id104);
        mensaje207.setContent(listatemznc);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje207);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje207.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje208 = myAgent.blockingReceive();
        if (mensaje208 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje208.toString());
            fin = true;
        }
        ///////    MENSAJE QUINCE   //////   
        String listatemzi = "";
        for (String s : tempoZNI) {
            listatemzi += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
        AID id105 = new AID();
        id105.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje209 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje209.setSender(myAgent.getAID());
        mensaje209.setLanguage("Español");
        mensaje209.addReceiver(id105);
        mensaje209.setContent(listatemzi);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje209);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje209.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje210 = myAgent.blockingReceive();
        if (mensaje210 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje210.toString());
            fin = true;
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

             //////// DURACION ///////////////////////
        ///////// MENSAJE UNO //////////
        String listaintD = "";
        for (String s : duracionXInstancias) {
            listaintD += s + ",";
        }

        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias duracion X a AGENTE FUSION");
        AID id106 = new AID();
        id106.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje211 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje211.setSender(myAgent.getAID());
        mensaje211.setLanguage("Español");
        mensaje211.addReceiver(id106);
        mensaje211.setContent(listaintD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje211);

        System.out.println(myAgent.getLocalName() + ": Enviando arreglo de instancias DURACION X  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje211.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje222 = myAgent.blockingReceive();
        if (mensaje222 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje222.toString());
            fin = true;
        }

        ////////////    MENSAJE DOS   //////
        String listacenD = "";
        for (String s : duracionXCentroide) {
            listacenD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroides DURACION X a AGENTE FUSION");
        AID id107 = new AID();
        id107.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje223 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje223.setSender(myAgent.getAID());
        mensaje223.setLanguage("Español");
        mensaje223.addReceiver(id107);
        mensaje223.setContent(listacenD); ///// String lista centroide ////
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje223);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje223.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje224 = myAgent.blockingReceive();
        if (mensaje224 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje224.toString());
            fin = true;
        }
           ///////    MENSAJE TRES   //////
        ////// Convierte en string el arreglo /////  
        String listarefD = "";
        for (String s : duracionXLanmark) {
            listarefD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
        AID id108 = new AID();
        id108.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje225 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje225.setSender(myAgent.getAID());
        mensaje225.setLanguage("Español");
        mensaje225.addReceiver(id108);
        mensaje225.setContent(listarefD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje225);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje225.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje226 = myAgent.blockingReceive();
        if (mensaje226 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje226.toString());
            fin = true;
        }

        ///////    MENSAJE CUATRO   //////
        String listaintyD = "";
        for (String s : duracionYInstancias) {
            listaintyD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglod e instancias duracion y a AGENTE FUSION");
        AID id109 = new AID();
        id109.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje227 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje227.setSender(myAgent.getAID());
        mensaje227.setLanguage("Español");
        mensaje227.addReceiver(id109);
        mensaje227.setContent(listaintyD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje227);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje227.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje228 = myAgent.blockingReceive();
        if (mensaje228 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje228.toString());
            fin = true;
        }
        ///////    MENSAJE CINCO   //////
        String listacenyD = "";
        for (String s : duracionYCentroide) {
            listacenyD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
        AID id110 = new AID();
        id110.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje229 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje229.setSender(myAgent.getAID());
        mensaje229.setLanguage("Español");
        mensaje229.addReceiver(id110);
        mensaje229.setContent(listacenyD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje229);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje229.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje230 = myAgent.blockingReceive();
        if (mensaje230 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje230.toString());
            fin = true;
        }
             ///////    MENSAJE SEIS   //////

        String listarefyD = "";
        for (String s : duracionYLanmark) {
            listarefyD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
        AID id111 = new AID();
        id111.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje231 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje231.setSender(myAgent.getAID());
        mensaje231.setLanguage("Español");
        mensaje231.addReceiver(id111);
        mensaje231.setContent(listarefyD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje231);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje231.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje232 = myAgent.blockingReceive();
        if (mensaje232 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje232.toString());
            fin = true;
        }

        ///////    MENSAJE SIETE   //////
        String listaintzD = "";
        for (String s : duracionZInstancias) {
            listaintzD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias DURACION z a AGENTE FUSION");
        AID id112 = new AID();
        id112.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje233 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje233.setSender(myAgent.getAID());
        mensaje233.setLanguage("Español");
        mensaje233.addReceiver(id112);
        mensaje233.setContent(listaintzD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje233);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje233.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje234 = myAgent.blockingReceive();
        if (mensaje234 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje234.toString());
            fin = true;
        }
        ///////    MENSAJE OCHO   //////
        String listacenzD = "";
        for (String s : duracionZCentroide) {
            listacenzD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
        AID id113 = new AID();
        id113.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje235 = new ACLMessage(ACLMessage.REQUEST);

        //Rellenar los campos necesarios del mensaje
        mensaje235.setSender(myAgent.getAID());
        mensaje235.setLanguage("Español");
        mensaje235.addReceiver(id113);
        mensaje235.setContent(listacenzD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje235);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje235.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje236 = myAgent.blockingReceive();
        if (mensaje236 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje236.toString());
            fin = true;
        }
        ///////    MENSAJE NUEVE   //////
        String listatemzD = "";
        for (String s : duracionZLanmark) {
            listatemzD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
        AID id114 = new AID();
        id114.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje237 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje237.setSender(myAgent.getAID());
        mensaje237.setLanguage("Español");
        mensaje237.addReceiver(id114);
        mensaje237.setContent(listatemzD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje237);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje237.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje238 = myAgent.blockingReceive();
        if (mensaje238 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje238.toString());
            fin = true;
        }

        ///////    MENSAJE DIEZ   //////   
        String listatemxncD = "";
        for (String s : duracionXNC) {
            listatemxncD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster duracion x a AGENTE FUSION");
        AID id115 = new AID();
        id115.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje239 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje239.setSender(myAgent.getAID());
        mensaje239.setLanguage("Español");
        mensaje239.addReceiver(id115);
        mensaje239.setContent(listatemxncD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje239);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje239.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje240 = myAgent.blockingReceive();
        if (mensaje240 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje240.toString());
            fin = true;
        }

        ///////    MENSAJE ONCE   //////   
        String listatemxiD = "";
        for (String s : duracionXNI) {
            listatemxiD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id116 = new AID();
        id116.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje241 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje241.setSender(myAgent.getAID());
        mensaje241.setLanguage("Español");
        mensaje241.addReceiver(id116);
        mensaje241.setContent(listatemxiD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje241);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje241.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje242 = myAgent.blockingReceive();
        if (mensaje242 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje242.toString());
            fin = true;
        }

        ///////    MENSAJE DOCE   //////   
        String listatemyncD = "";
        for (String s : duracionYNC) {
            listatemyncD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
        AID id117 = new AID();
        id117.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje243 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje243.setSender(myAgent.getAID());
        mensaje243.setLanguage("Español");
        mensaje243.addReceiver(id117);
        mensaje243.setContent(listatemyncD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje243);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje243.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje244 = myAgent.blockingReceive();
        if (mensaje244 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje244.toString());
            fin = true;
        }
        ///////    MENSAJE TRECE   //////   
        String listatemyiD = "";
        for (String s : duracionYNI) {
            listatemyiD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id118 = new AID();
        id118.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje245 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje245.setSender(myAgent.getAID());
        mensaje245.setLanguage("Español");
        mensaje245.addReceiver(id118);
        mensaje245.setContent(listatemyiD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje245);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje245.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje246 = myAgent.blockingReceive();
        if (mensaje246 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje246.toString());
            fin = true;
        }

        ///////    MENSAJE CATORCE   //////   
        String listatemzncD = "";
        for (String s : duracionZNC) {
            listatemzncD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
        AID id119 = new AID();
        id119.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje247 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje247.setSender(myAgent.getAID());
        mensaje247.setLanguage("Español");
        mensaje247.addReceiver(id119);
        mensaje247.setContent(listatemzncD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje247);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje247.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje248 = myAgent.blockingReceive();
        if (mensaje248 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje248.toString());
            fin = true;
        }
        ///////    MENSAJE QUINCE   //////   
        String listatemziD = "";
        for (String s : duracionZNI) {
            listatemziD += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
        AID id120 = new AID();
        id120.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje249 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje249.setSender(myAgent.getAID());
        mensaje249.setLanguage("Español");
        mensaje249.addReceiver(id120);
        mensaje249.setContent(listatemziD);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje249);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje249.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje250 = myAgent.blockingReceive();
        if (mensaje250 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje250.toString());
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
        AID id121 = new AID();
        id121.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje251 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje251.setSender(myAgent.getAID());
        mensaje251.setLanguage("Español");
        mensaje251.addReceiver(id121);
        mensaje251.setContent(listaintO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje251);

        System.out.println(myAgent.getLocalName() + ": Enviando arreglo de instancias DURACION X  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje251.toString());
            //fin = true;// quitamos es]ukte fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje252 = myAgent.blockingReceive();
        if (mensaje252 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje252.toString());
            fin = true;
        }

        ////////////    MENSAJE DOS   //////
        String listacenO = "";
        for (String s : octavaXCentroide) {
            listacenO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroides DURACION X a AGENTE FUSION");
        AID id122 = new AID();
        id122.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje253 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje253.setSender(myAgent.getAID());
        mensaje253.setLanguage("Español");
        mensaje253.addReceiver(id122);
        mensaje253.setContent(listacenO); ///// String lista centroide ////
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje253);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje253.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje254 = myAgent.blockingReceive();
        if (mensaje254 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje254.toString());
            fin = true;
        }

            ///////    MENSAJE TRES   //////
        ////// Convierte en string el arreglo /////  
        String listarefO = "";
        for (String s : octavaXLanmark) {
            listarefO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a referecia a AGENTE FUSION");
        AID id123 = new AID();
        id123.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje255 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje255.setSender(myAgent.getAID());
        mensaje255.setLanguage("Español");
        mensaje255.addReceiver(id123);
        mensaje255.setContent(listarefO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje255);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje255.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje256 = myAgent.blockingReceive();
        if (mensaje256 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje256.toString());
            fin = true;
        }

        ///////    MENSAJE CUATRO   //////
        String listaintyO = "";
        for (String s : octavaYInstancias) {
            listaintyO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglod e instancias duracion y a AGENTE FUSION");
        AID id124 = new AID();
        id124.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje257 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje257.setSender(myAgent.getAID());
        mensaje257.setLanguage("Español");
        mensaje257.addReceiver(id124);
        mensaje257.setContent(listaintyO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje257);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje257.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje258 = myAgent.blockingReceive();
        if (mensaje258 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje258.toString());
            fin = true;
        }
        ///////    MENSAJE CINCO   //////
        String listacenyO = "";
        for (String s : octavaYCentroide) {
            listacenyO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar un arreglo de centroides AGENTE FUSION");
        AID id125 = new AID();
        id125.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje259 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje259.setSender(myAgent.getAID());
        mensaje259.setLanguage("Español");
        mensaje259.addReceiver(id125);
        mensaje259.setContent(listacenyO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje259);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje259.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje260 = myAgent.blockingReceive();
        if (mensaje260 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje260.toString());
            fin = true;
        }

        ///////    MENSAJE SEIS   //////
        String listarefyO = "";
        for (String s : octavaYLanmark) {
            listarefyO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark y a AGENTE FUSION");
        AID id126 = new AID();
        id126.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje261 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje261.setSender(myAgent.getAID());
        mensaje261.setLanguage("Español");
        mensaje261.addReceiver(id126);
        mensaje261.setContent(listarefyO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje261);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje261.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje262 = myAgent.blockingReceive();
        if (mensaje262 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje262.toString());
            fin = true;
        }

        ///////    MENSAJE SIETE   //////
        String listaintzO = "";
        for (String s : octavaZInstancias) {
            listaintzO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar instancias DURACION z a AGENTE FUSION");
        AID id127 = new AID();
        id127.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje263 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje263.setSender(myAgent.getAID());
        mensaje263.setLanguage("Español");
        mensaje263.addReceiver(id127);
        mensaje263.setContent(listaintzO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje263);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje263.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje264 = myAgent.blockingReceive();
        if (mensaje264 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje264.toString());
            fin = true;
        }
        ///////    MENSAJE OCHO   //////
        String listacenzO = "";
        for (String s : octavaZCentroide) {
            listacenzO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar arreglo de centroide z AGENTE FUSION");
        AID id128 = new AID();
        id128.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje265 = new ACLMessage(ACLMessage.REQUEST);

        //Rellenar los campos necesarios del mensaje
        mensaje265.setSender(myAgent.getAID());
        mensaje265.setLanguage("Español");
        mensaje265.addReceiver(id128);
        mensaje265.setContent(listacenzO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje265);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje265.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje266 = myAgent.blockingReceive();
        if (mensaje266 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje266.toString());
            fin = true;
        }
        ///////    MENSAJE NUEVE   //////
        String listatemzO = "";
        for (String s : octavaZLanmark) {
            listatemzO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar asignaciones a lanmark z a AGENTE FUSION");
        AID id129 = new AID();
        id129.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje267 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje267.setSender(myAgent.getAID());
        mensaje267.setLanguage("Español");
        mensaje267.addReceiver(id129);
        mensaje267.setContent(listatemzO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje267);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje267.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje268 = myAgent.blockingReceive();
        if (mensaje268 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje268.toString());
            fin = true;
        }

        ///////    MENSAJE DIEZ   //////   
        String listatemxncO = "";
        for (String s : octavaXNC) {
            listatemxncO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster duracion x a AGENTE FUSION");
        AID id130 = new AID();
        id130.setLocalName("Fusiona");
        // Creación del objeto ACLMessage
        ACLMessage mensaje269 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje269.setSender(myAgent.getAID());
        mensaje269.setLanguage("Español");
        mensaje269.addReceiver(id130);
        mensaje269.setContent(listatemxncO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje269);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje269.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje270 = myAgent.blockingReceive();
        if (mensaje270 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje270.toString());
            fin = true;
        }

        ///////    MENSAJE ONCE   //////   
        String listatemxiO = "";
        for (String s : octavaXNI) {
            listatemxiO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id131 = new AID();
        id131.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje271 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje271.setSender(myAgent.getAID());
        mensaje271.setLanguage("Español");
        mensaje271.addReceiver(id131);
        mensaje271.setContent(listatemxiO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje271);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje271.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje272 = myAgent.blockingReceive();
        if (mensaje272 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje272.toString());
            fin = true;
        }

        ///////    MENSAJE DOCE   //////   
        String listatemyncO = "";
        for (String s : octavaYNC) {
            listatemyncO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo y a AGENTE FUSION");
        AID id132 = new AID();
        id132.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje273 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje273.setSender(myAgent.getAID());
        mensaje273.setLanguage("Español");
        mensaje273.addReceiver(id132);
        mensaje273.setContent(listatemyncO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje273);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje273.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje274 = myAgent.blockingReceive();
        if (mensaje274 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje274.toString());
            fin = true;
        }
        ///////    MENSAJE TRECE   //////   
        String listatemyiO = "";
        for (String s : octavaYNI) {
            listatemyiO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo x a AGENTE FUSION");
        AID id133 = new AID();
        id133.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje275 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje275.setSender(myAgent.getAID());
        mensaje275.setLanguage("Español");
        mensaje275.addReceiver(id133);
        mensaje275.setContent(listatemyiO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje275);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION");
        System.out.println(mensaje275.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje276 = myAgent.blockingReceive();
        if (mensaje276 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje276.toString());
            fin = true;
        }

        ///////    MENSAJE CATORCE   //////   
        String listatemzncO = "";
        for (String s : octavaZNC) {
            listatemzncO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar total cluster tempo z a AGENTE FUSION");
        AID id134 = new AID();
        id134.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje277 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje277.setSender(myAgent.getAID());
        mensaje277.setLanguage("Español");
        mensaje277.addReceiver(id134);
        mensaje277.setContent(listatemzncO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje277);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION *****");
        System.out.println(mensaje277.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje278 = myAgent.blockingReceive();
        if (mensaje278 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje278.toString());
            fin = true;
        }
        ///////    MENSAJE QUINCE   //////   
        String listatemziO = "";
        for (String s : octavaZNI) {
            listatemziO += s + ",";
        }
        System.out.println("Soy el Agente " + myAgent.getLocalName() + ": Preparandome para enviar todas las instacias tempo z a AGENTE FUSION");
        AID id135 = new AID();
        id135.setLocalName("Fusiona");

        // Creación del objeto ACLMessage
        ACLMessage mensaje279 = new ACLMessage(ACLMessage.REQUEST);
        //Rellenar los campos necesarios del mensaje
        mensaje279.setSender(myAgent.getAID());
        mensaje279.setLanguage("Español");
        mensaje279.addReceiver(id135);
        mensaje279.setContent(listatemziO);
        //Envia el mensaje a los destinatarios
        myAgent.send(mensaje279);
        System.out.println(myAgent.getLocalName() + ": Enviando arreglo  a FUSIONA- AGENTE FUSION ******");
        System.out.println(mensaje279.toString());
            //fin = true;// quitamos este fin por q a¡hora esperará la respuesta
        //Espera la respuesta
        ACLMessage mensaje280 = myAgent.blockingReceive();
        if (mensaje280 != null) {
            System.out.println(myAgent.getLocalName() + ": recibí mensaje de confirmación: ");
            System.out.println(mensaje280.toString());
            fin = true;
        }
    }

    public boolean done() {
        return fin = true;
    }
}
