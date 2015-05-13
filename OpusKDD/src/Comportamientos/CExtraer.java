package Comportamientos;

import Interfaces.guiARecomendar;
import jade.core.Agent;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import Clustering.*;
import ObjeAux.*;
import jade.core.AID;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import java.util.ArrayList;

public class CExtraer extends SimpleBehaviour {

    ContainerController cc;
    AgentController ac;
    public static String emocion3;

    //////// Staticas Tempo X ////////
    public static ArrayList arrayTempoXNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoXNI; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoXIprueba; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoXCprueba; // EXTRAER CENTROIDES
    public static ArrayList arrayTempoXTprueba; // EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Tempo Y ////////
    public static ArrayList arrayTempoYNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoYNI; // EXTRAER NUMERO DE INSTANCIAS 
    public static ArrayList arrayTempoYIprueba;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoYCprueba;// EXTRAER CENTROIDES
    public static ArrayList arrayTempoYTprueba;// EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Tempo Z ////////
    public static ArrayList arrayTempoZNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoZNI; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoZIprueba;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoZCprueba;// EXTRAER CENTROIDES
    public static ArrayList arrayTempoZTprueba;// EXTRAER ASIGNACIONES A LANMARK

        //////// Staticas Duracion X ////////
    public static ArrayList arrayDuracionXNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionXNI; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayDuracionXIprueba; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionXCprueba; // EXTRAER CENTROIDES
    public static ArrayList arrayDuracionXTprueba; // EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Duracion Y ////////
    public static ArrayList arrayDuracionYNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionYNI; // EXTRAER NUMERO DE INSTANCIAS 
    public static ArrayList arrayDuracionYIprueba;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionYCprueba;// EXTRAER CENTROIDES
    public static ArrayList arrayDuracionYTprueba;// EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Duracion Z ////////
    public static ArrayList arrayDuracionZNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionZNI; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayDuracionZIprueba;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionZCprueba;// EXTRAER CENTROIDES
    public static ArrayList arrayDuracionZTprueba;// EXTRAER ASIGNACIONES A LANMARK

            //////// Staticas Octavas X ////////
    public static ArrayList arrayOctavaXNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaXNI; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayOctavaXIprueba; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaXCprueba; // EXTRAER CENTROIDES
    public static ArrayList arrayOctavaXTprueba; // EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Octava Y ////////
    public static ArrayList arrayOctavaYNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaYNI; // EXTRAER NUMERO DE INSTANCIAS 
    public static ArrayList arrayOctavaYIprueba;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaYCprueba;// EXTRAER CENTROIDES
    public static ArrayList arrayOctavaYTprueba;// EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Octva Z ////////
    public static ArrayList arrayOctavaZNC; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaZNI; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayOctavaZIprueba;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaZCprueba;// EXTRAER CENTROIDES
    public static ArrayList arrayOctavaZTprueba;// EXTRAER ASIGNACIONES A LANMARK

   ///////////////////////// X MEANS /////////////////////////////////////////////
    //////// Staticas Tempo X ////////
    public static ArrayList arrayTempoXNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoXNIX; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoXIpruebaX; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoXCpruebaX; // EXTRAER CENTROIDES
    public static ArrayList arrayTempoXTpruebaX; // EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Tempo Y ////////
    public static ArrayList arrayTempoYNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoYNIX; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoYIpruebaX; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoYCpruebaX; // EXTRAER CENTROIDES
    public static ArrayList arrayTempoYTpruebaX; // EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Tempo Z ////////
    public static ArrayList arrayTempoZNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoZNIX; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoZIpruebaX; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoZCpruebaX; // EXTRAER CENTROIDES
    public static ArrayList arrayTempoZTpruebaX; // EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Duracion x ////////
    public static ArrayList arrayDuracionXNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionXNIX; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayDuracionXIpruebaX; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionXCpruebaX; // EXTRAER CENTROIDES
    public static ArrayList arrayDuracionXTpruebaX; // EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Duracion Y ////////
    public static ArrayList arrayDuracionYNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionYNIX; // EXTRAER NUMERO DE INSTANCIAS 
    public static ArrayList arrayDuracionYIpruebaX;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionYCpruebaX;// EXTRAER CENTROIDES
    public static ArrayList arrayDuracionYTpruebaX;// EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Duracion Z ////////
    public static ArrayList arrayDuracionZNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionZNIX; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayDuracionZIpruebaX;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionZCpruebaX;// EXTRAER CENTROIDES
    public static ArrayList arrayDuracionZTpruebaX;// EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Octavas X ////////
    public static ArrayList arrayOctavaXNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaXNIX; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayOctavaXIpruebaX; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaXCpruebaX; // EXTRAER CENTROIDES
    public static ArrayList arrayOctavaXTpruebaX; // EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Octavas Y ////////
    public static ArrayList arrayOctavaYNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaYNIX; // EXTRAER NUMERO DE INSTANCIAS 
    public static ArrayList arrayOctavaYIpruebaX;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaYCpruebaX;// EXTRAER CENTROIDES
    public static ArrayList arrayOctavaYTpruebaX;// EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Octavas Z ////////
    public static ArrayList arrayOctavaZNCX; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaZNIX; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayOctavaZIpruebaX;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaZCpruebaX;// EXTRAER CENTROIDES
    public static ArrayList arrayOctavaZTpruebaX;// EXTRAER ASIGNACIONES A LANMARK

     ///////////////////////// EM /////////////////////////////////////////////
    //////// Staticas Tempo X ////////
    public static ArrayList arrayTempoXNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoXNIEM; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoXIpruebaEM; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoXCpruebaEM; // EXTRAER CENTROIDES
    public static ArrayList arrayTempoXTpruebaEM; // EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Tempo Y ////////
    public static ArrayList arrayTempoYNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoYNIEM; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoYIpruebaEM; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoYCpruebaEM; // EXTRAER CENTROIDES
    public static ArrayList arrayTempoYTpruebaEM; // EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Tempo Z ////////
    public static ArrayList arrayTempoZNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayTempoZNIEM; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayTempoZIpruebaEM; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayTempoZCpruebaEM; // EXTRAER CENTROIDES
    public static ArrayList arrayTempoZTpruebaEM; // EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Duracion x ////////
    public static ArrayList arrayDuracionXNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionXNIEM; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayDuracionXIpruebaEM; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionXCpruebaEM; // EXTRAER CENTROIDES
    public static ArrayList arrayDuracionXTpruebaEM; // EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Duracion Y ////////
    public static ArrayList arrayDuracionYNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionYNIEM; // EXTRAER NUMERO DE INSTANCIAS 
    public static ArrayList arrayDuracionYIpruebaEM;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionYCpruebaEM;// EXTRAER CENTROIDES
    public static ArrayList arrayDuracionYTpruebaEM;// EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Duracion Z ////////
    public static ArrayList arrayDuracionZNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayDuracionZNIEM; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayDuracionZIpruebaEM;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayDuracionZCpruebaEM;// EXTRAER CENTROIDES
    public static ArrayList arrayDuracionZTpruebaEM;// EXTRAER ASIGNACIONES A LANMARK

    //////// Staticas Octavas X ////////
    public static ArrayList arrayOctavaXNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaXNIEM; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayOctavaXIpruebaEM; // EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaXCpruebaEM; // EXTRAER CENTROIDES
    public static ArrayList arrayOctavaXTpruebaEM; // EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Octavas Y ////////
    public static ArrayList arrayOctavaYNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaYNIEM; // EXTRAER NUMERO DE INSTANCIAS 
    public static ArrayList arrayOctavaYIpruebaEM;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaYCpruebaEM;// EXTRAER CENTROIDES
    public static ArrayList arrayOctavaYTpruebaEM;// EXTRAER ASIGNACIONES A LANMARK
    //////// Staticas Octavas Z ////////
    public static ArrayList arrayOctavaZNCEM; // EXTRAER NUMERO DE CUMULOS
    public static ArrayList arrayOctavaZNIEM; // EXTRAER NUMERO DE INSTANCIAS
    public static ArrayList arrayOctavaZIpruebaEM;// EXTRAER TOTAL DE INSTANCIAS
    public static ArrayList arrayOctavaZCpruebaEM;// EXTRAER CENTROIDES
    public static ArrayList arrayOctavaZTpruebaEM;// EXTRAER ASIGNACIONES A LANMARK

    static double sumaTempoXEM;
    static double sumaTempoYEM;
    static double sumaTempoZEM;

    static double sumaDuracionXEM;
    static double sumaDuracionYEM;
    static double sumaDuracionZEM;

    static double sumaOctavaXEM;
    static double sumaOctavaYEM;
    static double sumaOctavaZEM;

    private boolean fin = false;

    public CExtraer(Agent a) {
        super(a);
    }

    CExtraer(CEmisorPlaneador1 aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void action() {
///////////////////////////////// RECIBE EMOCIÓN ///////////////////////////
        System.out.println(" ** Receptor Preparandose para recibir ** ");
        ACLMessage mensaje = myAgent.blockingReceive();
        if (mensaje != null) {
            System.out.println("Soy el Agente " + myAgent.getLocalName() + "**: acabo de recibir el siguiente mensaje: **");
            System.out.println(mensaje.toString());
            emocion3 = mensaje.getContent();
            // Envia constestación con INFORM createReply
            System.out.println(myAgent.getLocalName() + "** : Enviando contestacion **");
            ACLMessage respuesta = mensaje.createReply();
            respuesta.setPerformative(ACLMessage.INFORM);
            respuesta.setContent("Voy a procesar con la emoción :" + emocion3);
            myAgent.send(respuesta);
            System.out.println(myAgent.getLocalName() + "** : Enviando mensaje a emisor **");
            System.out.println(respuesta.toString());
            fin = true;
        } else {
            System.out.println("Agente KDD: Esperando a recibir mensaje");
            block();
        }
                /////////////// INICIA PROCESOS /////////

        System.out.println("////////////////////////////////////////////////////    Iniciare el proceso con Kmeans   ////////////////////////////////////////////////////////////////");

        calculo_tempo cal = new calculo_tempo();
        calculo_duracion cal1 = new calculo_duracion();
        calculo_octava cal2 = new calculo_octava();
        calculoIndiceValidezCH indCH = new calculoIndiceValidezCH();
        calculoIndiceValidezDB indDB = new calculoIndiceValidezDB();
        consultas_arreglos cons = new consultas_arreglos();

        kMeans km = new kMeans(10, 3000, emocion3);
        kMeans km1 = new kMeans(5, 3000, emocion3);
        kMeans km2 = new kMeans(11, 3000, emocion3);

        km.trainCluster();
        km1.trainCluster();
        km2.trainCluster();

        ArrayList arrayTempoXEC = new ArrayList(); // Extraer cumulos tempo en X solo num cluster
        ArrayList arrayTempoXEC1 = new ArrayList(); // Extraer cumulos tempo en X solo instancia
        ArrayList arrayTempoYEC = new ArrayList(); // Extraer tempo en X
        ArrayList arrayTempoYEC1 = new ArrayList(); // Extraer cumulos tempo en X solo instancia
        ArrayList arrayTempoZEC = new ArrayList(); // Extraer tempo en z
        ArrayList arrayTempoZEC1 = new ArrayList(); // Extraer cumulos tempo en X solo instancia
        ArrayList arrayTempoXI = new ArrayList(); // Extraer total intancias tempo x
        ArrayList arrayTempoYI = new ArrayList(); // Extraer total intancias tempo y
        ArrayList arrayTempoZI = new ArrayList(); // Extraer total intancias tempo z
        ArrayList arrayTempoXC = new ArrayList();  // Extraer centroide tempo x
        ArrayList arrayTempoYC = new ArrayList();  // Extraer centroide tempo y
        ArrayList arrayTempoZC = new ArrayList();  // Extraer centroide tempo z             
        ArrayList calculoTX = new ArrayList(); // Distancias Minima Tempo X
        ArrayList calculoTY = new ArrayList(); // Distancias Minima Tempo Y
        ArrayList calculoTZ = new ArrayList(); // Distancias Minima Tempo Z
        ArrayList calculoTX1 = new ArrayList(); // Asignacion a Referencia Tempo X
        ArrayList calculoTY1 = new ArrayList(); // Asignacion a Referencia  Tempo Y
        ArrayList calculoTZ1 = new ArrayList(); // Asignacion a Referencia  Tempo Z 
        ArrayList calculoTX2 = new ArrayList(); // calculo indece tempo x halinski - harabaz

                  // Intanciamos Arreglos Duración
        ArrayList arrayDuracionXEC = new ArrayList();
        ArrayList arrayDuracionXEC1 = new ArrayList(); // Extraer cumulos tempo en X solo instancia
        ArrayList arrayDuracionYEC = new ArrayList();
        ArrayList arrayDuracionYEC1 = new ArrayList(); // Extraer cumulos tempo en X solo instancia
        ArrayList arrayDuracionZEC = new ArrayList();
        ArrayList arrayDuracionZEC1 = new ArrayList(); // Extraer cumulos tempo en X solo instancia

        ArrayList arrayDuracionXI = new ArrayList();
        ArrayList arrayDuracionYI = new ArrayList();
        ArrayList arrayDuracionZI = new ArrayList();
        ArrayList arrayDuracionXC = new ArrayList();
        ArrayList arrayDuracionYC = new ArrayList();
        ArrayList arrayDuracionZC = new ArrayList();
        ArrayList calculoDX = new ArrayList();
        ArrayList calculoDY = new ArrayList();
        ArrayList calculoDZ = new ArrayList();
        ArrayList calculoDX1 = new ArrayList();
        ArrayList calculoDY1 = new ArrayList();
        ArrayList calculoDZ1 = new ArrayList();

        //////// EXTRAER CUMULOS TEMPO EN X //////////////
        arrayTempoXEC = km.extraerNumClusterTempoX();
        arrayTempoXNC = arrayTempoXEC;
        arrayTempoXEC1 = km.extraerInstanciasTempoXTodas();
        arrayTempoXNI = arrayTempoXEC1;

        for (int i = 0; i < arrayTempoXEC.size(); i++) {
            guiARecomendar.areaTempoXECK.append((String) "Cluster " + arrayTempoXEC.get(i) + " Instancia " + arrayTempoXEC1.get(i) + " \n");
            System.out.println(arrayTempoXEC1.get(i));
        }
        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayTempoXI = km.instanciaTempoX();
        arrayTempoXIprueba = arrayTempoXI;
        for (int i = 0; i < arrayTempoXI.size(); i++) {
            guiARecomendar.areaTempoXI.append((String) "[Cluster " + i + "]" + arrayTempoXI.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayTempoXC = km.centroideTempoX();
        arrayTempoXCprueba = arrayTempoXC;
        for (int i = 0; i < arrayTempoXC.size(); i++) {
            guiARecomendar.areaTempoXC.append((String) "[Cluster " + i + "]" + arrayTempoXC.get(i) + " ]" + " \n");
        }
             ///////// CALCULOS DE DISTANCIA  MINIMA/////////////////

        calculoTX = cal.calcular(arrayTempoXC);
        for (int i = 0; i < calculoTX.size(); i++) {
            guiARecomendar.areaTempoXD.append((String) "[Cluster " + i + "]" + calculoTX.get(i) + " \n");
        }
        ////////// ASIGNACIONES A LANMAKR ////////////////
        calculoTX1 = cal.calculoPosision(arrayTempoXC);
        arrayTempoXTprueba = calculoTX1;
        for (int i = 0; i < calculoTX1.size(); i++) {
            guiARecomendar.areaTempoXT.append((String) "[Cluster " + i + "]" + calculoTX1.get(i) + " \n");
        }

        ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumad = 0;
        double sumad1 = 0;
        double cenGeneral = 0;
        double indiceValidez = 0;
        double indiceValidez1 = 0;
        double indiceValidezfinal = 0;
        double numCluster = 0;
        double numElementos = 0;

        ArrayList arrayTempoXIndiceXNC = new ArrayList();
        ArrayList arrayTempoXIndiceXNI = new ArrayList();
        ArrayList arrayTempoXIndiceXC = new ArrayList();

        for (int i = 0; i < arrayTempoXI.size(); i++) {
            arrayTempoXIndiceXNC = km.extraerNumeroClustersTempoX1(i);
            arrayTempoXIndiceXNI = km.extraerInstanciasTempoX(i);
            arrayTempoXIndiceXC = km.extraercentroideTempoX(i);
            sumad = sumad + indCH.distanciaCluster(arrayTempoXIndiceXNC, arrayTempoXIndiceXNI, arrayTempoXIndiceXC);
        }

        cenGeneral = indCH.calculoCentroideGeneral(arrayTempoXEC1);
        sumad1 = indCH.distanciaSeparacionCluster(arrayTempoXC, cenGeneral, arrayTempoXI);
        numCluster = km.instanciaTempoX2();
        numElementos = km.instanciaTempoX3();

        indiceValidez = sumad1 / sumad;
        indiceValidez1 = (numElementos - numCluster) / (numCluster - 1);
        indiceValidezfinal = indiceValidez * indiceValidez1;
        guiARecomendar.jTXIndiceCH.setText(String.valueOf(indiceValidezfinal));
        System.out.println("(" + sumad1 + " / " + sumad + ")" + " * " + "( " + numElementos + " - " + numCluster + ")" + " / " + numCluster + " - " + " 1");
        System.out.println("El indice Kalinsky Harabaz es: " + indiceValidezfinal);

         //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDB = 0;
        double sumaMaxTotal = 0;
        double numClusterDB = 0;
        double indiceDB = 0;

        ArrayList arrayTempoXIndiceDBNC = new ArrayList();
        ArrayList arrayTempoXIndiceDBNI = new ArrayList();
        ArrayList arrayTempoXIndiceDBNC1 = new ArrayList();
        ArrayList arraySCK = new ArrayList();
        ArrayList sumamax = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayTempoXI.size(); i++) {
            arrayTempoXIndiceDBNC = km.extraerNumeroClustersTempoX1(i);
            arrayTempoXIndiceDBNI = km.extraerInstanciasTempoX(i);
            arrayTempoXIndiceDBNC1 = km.extraercentroideTempoX(i);
            sumadDB = indDB.distanciaCluster(arrayTempoXIndiceDBNC, arrayTempoXIndiceDBNI, arrayTempoXIndiceDBNC1);
            arraySCK.add(String.valueOf(sumadDB));

        }
        indDB.distanciaSeparacionCluster(arrayTempoXC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamax = indDB.distanciaSeparacionCluster1(arrayTempoXC, arraySCK);

        for (int i = 0; i < sumamax.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamax.get(i));
            sumaMaxTotal = sumaMaxTotal + Double.parseDouble((String) sumamax.get(i));
            numClusterDB = numClusterDB + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotal);

        indiceDB = (1 / numClusterDB) * sumaMaxTotal;

        System.out.println("El indice Davies Bouldin es:  " + indiceDB);

        guiARecomendar.jTXIndiceDB.setText(String.valueOf(indiceDB));

        //////////// TEMPO EN Y ///////////////
        arrayTempoYEC = km.extraerNumClusterTempoY();
        arrayTempoYNC = arrayTempoYEC;
        arrayTempoYEC1 = km.extraerInstanciasTempoYTodas();
        arrayTempoYNI = arrayTempoYEC1;
        //////// EXTRAER CUMULOS TEMPO EN Y
        arrayTempoYEC = km.extraerTempoY();
        for (int i = 0; i < arrayTempoYEC.size(); i++) {
            guiARecomendar.areaTempoYEC.append((String) arrayTempoYEC.get(i) + " \n");
        }
        ///// EXTRAER TOTAL DE INSTANCIAS ////////
        arrayTempoYI = km.instanciaTempoY();
        arrayTempoYIprueba = arrayTempoYI;
        for (int i = 0; i < arrayTempoYI.size(); i++) {
            guiARecomendar.areaTempoYI.append((String) "[Cluster " + i + "]" + arrayTempoYI.get(i) + " Instancias" + " \n");
        }
        //////// EXTRAER CENTROIDE ////////////
        arrayTempoYC = km.centroideTempoY();
        arrayTempoYCprueba = arrayTempoYC;
        for (int i = 0; i < arrayTempoYC.size(); i++) {
            guiARecomendar.areaTempoYC.append((String) "[Cluster " + i + "]" + arrayTempoYC.get(i) + " ]" + " \n");
        }

        ///////// CALCULAR DITANCIA MINIMA //////////
        calculoTY = cal.calcular(arrayTempoYC);
        for (int i = 0; i < calculoTY.size(); i++) {
            guiARecomendar.areaTempoYD.append((String) "[Cluster " + i + "]" + calculoTY.get(i) + " \n");
        }
        ///////// ASIGNACIÓN A LAMNARK ////////    
        calculoTY1 = cal.calculoPosision(arrayTempoYC);
        arrayTempoYTprueba = calculoTY1;
        for (int i = 0; i < calculoTY1.size(); i++) {
            guiARecomendar.areaTempoYT.append((String) "[Cluster " + i + "]" + calculoTY1.get(i) + " \n");
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////////////// TEMPO EN Y ///////////////////////////////////////////////////////////////");

            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumady = 0;
        double sumad1y = 0;
        double cenGeneraly = 0;
        double indiceValidezy = 0;
        double indiceValidez1y = 0;
        double indiceValidezfinaly = 0;
        double numClustery = 0;
        double numElementosy = 0;

        ArrayList arrayTempoYIndiceYNC = new ArrayList();
        ArrayList arrayTempoYIndiceYNI = new ArrayList();
        ArrayList arrayTempoYIndiceYC = new ArrayList();
        for (int i = 0; i < arrayTempoYI.size(); i++) {
            arrayTempoYIndiceYNC = km.extraerNumeroClustersTempoY1(i);
            arrayTempoYIndiceYNI = km.extraerInstanciasTempoY(i);
            arrayTempoYIndiceYC = km.extraercentroideTempoY(i);
            sumady = sumady + indCH.distanciaCluster(arrayTempoYIndiceYNC, arrayTempoYIndiceYNI, arrayTempoYIndiceYC);
        }

        cenGeneraly = indCH.calculoCentroideGeneral(arrayTempoYEC1);
        sumad1y = indCH.distanciaSeparacionCluster(arrayTempoYC, cenGeneraly, arrayTempoYI);
        numClustery = km.instanciaTempoY2();
        numElementosy = km.instanciaTempoY3();
        indiceValidezy = sumad1y / sumady;
        indiceValidez1y = (numElementosy - numClustery) / (numClustery - 1);
        indiceValidezfinaly = indiceValidezy * indiceValidez1y;
        guiARecomendar.jTYIndiceCH.setText(String.valueOf(indiceValidezfinaly));
        System.out.println("(" + sumad1y + " / " + sumady + ")" + " * " + "( " + numElementosy + " - " + numClustery + ")" + " / " + numClustery + " - " + " 1");
        System.out.println("El indice Kalinsky Harabaz es: " + indiceValidezfinaly);

////////////////////////////////////////////////////////////////////////////////////////////////// 
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBy = 0;
        double sumaMaxTotaly = 0;
        double numClusterDBy = 0;
        double indiceDBy = 0;

        ArrayList arrayTempoYIndiceDBNC = new ArrayList();
        ArrayList arrayTempoYIndiceDBNI = new ArrayList();
        ArrayList arrayTempoYIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKY = new ArrayList();
        ArrayList sumamaxY = new ArrayList();

        for (int i = 0; i < arrayTempoYI.size(); i++) {
            arrayTempoYIndiceDBNC = km.extraerNumeroClustersTempoY1(i);
            arrayTempoYIndiceDBNI = km.extraerInstanciasTempoY(i);
            arrayTempoYIndiceDBNC1 = km.extraercentroideTempoY(i);
            sumadDBy = indDB.distanciaCluster(arrayTempoYIndiceDBNC, arrayTempoYIndiceDBNI, arrayTempoYIndiceDBNC1);
            arraySCKY.add(String.valueOf(sumadDBy));

        }

        //calculoIndiceValidezDB cal22 = new calculoIndiceValidezDB();
        indDB.distanciaSeparacionCluster(arrayTempoYC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxY = indDB.distanciaSeparacionCluster1(arrayTempoYC, arraySCKY);
        for (int i = 0; i < sumamaxY.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxY.get(i));
            sumaMaxTotaly = sumaMaxTotaly + Double.parseDouble((String) sumamaxY.get(i));
            numClusterDBy = numClusterDBy + 1;
        }
        System.out.println("La suma de maximos es :" + sumaMaxTotaly);
        indiceDBy = (1 / numClusterDBy) * sumaMaxTotaly;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBy);
        guiARecomendar.jTYIndiceDB.setText(String.valueOf(indiceDBy));

        //////////////// TEMPO EN Z //////////////////
        arrayTempoZEC = km.extraerNumClusterTempoZ();
        arrayTempoZNC = arrayTempoZEC;
        arrayTempoZEC1 = km.extraerInstanciasTempoZTodas();
        arrayTempoZNI = arrayTempoZEC1;

        //////// EXTRAER CUMULOS TEMPO EN Y /////
        arrayTempoZEC = km.extraerTempoZ();
        for (int i = 0; i < arrayTempoZEC.size(); i++) {
            guiARecomendar.areaTempoZEC.append((String) arrayTempoZEC.get(i) + " \n");

        }
        ///// EXTRAER TOTAL DE INSTANCIAS ////////
        arrayTempoZI = km.instanciaTempoZ();
        arrayTempoZIprueba = arrayTempoZI;

        for (int i = 0; i < arrayTempoZI.size(); i++) {
            guiARecomendar.areaTempoZI.append((String) "[Cluster " + i + "]" + arrayTempoZI.get(i) + " Instancias" + " \n");
        }
        //////// CENTROIDE TEMPO EN Z //////////
        arrayTempoZC = km.centroideTempoZ();
        arrayTempoZCprueba = arrayTempoZC;

        for (int i = 0; i < arrayTempoZC.size(); i++) {
            guiARecomendar.areaTempoZC.append((String) "[Cluster " + i + "]" + arrayTempoZC.get(i) + " ]" + " \n");
        }
        ////////// CALCULO DE DISTANCIAS ////////////
        calculoTZ = cal.calcular(arrayTempoZC);
        for (int i = 0; i < calculoTZ.size(); i++) {
            guiARecomendar.areaTempoZD.append((String) "[Cluster " + i + "]" + calculoTZ.get(i) + " \n");
        }
        ////////// ASIGNACIONES A LANMARK //////////
        calculoTZ1 = cal.calculoPosision(arrayTempoZC);
        arrayTempoZTprueba = calculoTZ1;

        for (int i = 0; i < calculoTZ1.size(); i++) {
            guiARecomendar.areaTempoZT.append((String) "[Cluster " + i + "]" + calculoTZ1.get(i) + " \n");
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////// TEMPO EN Z ///////////////////////////////////////////////////////////////");

            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadz = 0;
        double sumad1z = 0;
        double cenGeneralz = 0;
        double indiceValidezz = 0;
        double indiceValidez1z = 0;
        double indiceValidezfinalz = 0;
        double numClusterz = 0;
        double numElementosz = 0;

        ArrayList arrayTempoZIndiceZNC = new ArrayList();
        ArrayList arrayTempoZIndiceZNI = new ArrayList();
        ArrayList arrayTempoZIndiceZC = new ArrayList();

        for (int i = 0; i < arrayTempoZI.size(); i++) {
            arrayTempoZIndiceZNC = km.extraerNumeroClustersTempoZ1(i);
            arrayTempoZIndiceZNI = km.extraerInstanciasTempoZ(i);
            arrayTempoZIndiceZC = km.extraercentroideTempoZ(i);
            sumadz = sumadz + indCH.distanciaCluster(arrayTempoZIndiceZNC, arrayTempoZIndiceZNI, arrayTempoZIndiceZC);
        }

        cenGeneralz = indCH.calculoCentroideGeneral(arrayTempoZEC1);
        sumad1z = indCH.distanciaSeparacionCluster(arrayTempoZC, cenGeneralz, arrayTempoZI);
        numClusterz = km.instanciaTempoZ2();
        numElementosz = km.instanciaTempoZ3();

        indiceValidezz = sumad1z / sumadz;
        indiceValidez1z = (numElementosz - numClusterz) / (numClusterz - 1);
        indiceValidezfinalz = indiceValidezz * indiceValidez1z;
        guiARecomendar.jTZIndiceCH.setText(String.valueOf(indiceValidezfinalz));
        System.out.println("(" + sumad1z + " / " + sumadz + ")" + " * " + "( " + numElementosz + " - " + numClusterz + ")" + " / " + numClusterz + " - " + " 1");
        System.out.println("El indice Kalinsky Harabaz es: " + indiceValidezfinalz);

////////////////////////////////////////////////////////////////////////////////////////////////// 
        //PROCESO DAVIES BOLUDIN
        double sumadDBz = 0;
        double sumaMaxTotalz = 0;
        double numClusterDBz = 0;
        double indiceDBz = 0;

        ArrayList arrayTempoZIndiceDBNC = new ArrayList();
        ArrayList arrayTempoZIndiceDBNI = new ArrayList();
        ArrayList arrayTempoZIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKZ = new ArrayList();
        ArrayList sumamaxZ = new ArrayList();

        for (int i = 0; i < arrayTempoYI.size(); i++) {
            arrayTempoZIndiceDBNC = km.extraerNumeroClustersTempoZ1(i);
            arrayTempoZIndiceDBNI = km.extraerInstanciasTempoZ(i);
            arrayTempoZIndiceDBNC1 = km.extraercentroideTempoZ(i);
            sumadDBz = indDB.distanciaCluster(arrayTempoZIndiceDBNC, arrayTempoZIndiceDBNI, arrayTempoZIndiceDBNC1);
            arraySCKZ.add(String.valueOf(sumadDBz));

        }
        //calculoIndiceValidezDB cal22 = new calculoIndiceValidezDB();
        indDB.distanciaSeparacionCluster(arrayTempoZC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxZ = indDB.distanciaSeparacionCluster1(arrayTempoZC, arraySCKZ);
        for (int i = 0; i < sumamaxZ.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxZ.get(i));
            sumaMaxTotalz = sumaMaxTotalz + Double.parseDouble((String) sumamaxZ.get(i));
            numClusterDBz = numClusterDBz + 1;
        }
        System.out.println("La suma de maximos es :" + sumaMaxTotalz);
        indiceDBz = (1 / numClusterDBz) * sumaMaxTotalz;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBz);
        guiARecomendar.jTZIndiceDB.setText(String.valueOf(indiceDBz));

 //////// DURACION EN X /////////////// 
        //////// EXTRAER CUMULOS DURACION EN X //////////////
        arrayDuracionXEC = km1.extraerNumClusterDuracionX();
        arrayDuracionXNC = arrayDuracionXEC;
        arrayDuracionXEC1 = km1.extraerInstanciasDuracionXTodas();
        arrayDuracionXNI = arrayDuracionXEC1;

        for (int i = 0; i < arrayDuracionXEC.size(); i++) {
            guiARecomendar.areaDuracionXEC.append((String) "Cluster " + arrayDuracionXEC.get(i) + " Instancia " + arrayDuracionXEC1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayDuracionXI = km1.instanciaDuracionX();
        arrayDuracionXIprueba = arrayDuracionXI;
        for (int i = 0; i < arrayDuracionXI.size(); i++) {
            guiARecomendar.areaDuracionXI.append((String) "[Cluster " + i + "]" + arrayDuracionXI.get(i) + " Instancias" + " \n");
        }

        //////// CENTROIDE Duracion  EN X //////////
        arrayDuracionXC = km1.centroideDuracionX();
        arrayDuracionXCprueba = arrayDuracionXC;

        for (int i = 0; i < arrayDuracionXC.size(); i++) {
            guiARecomendar.areaDuracionXC.append((String) "[Cluster " + i + "]" + arrayDuracionXC.get(i) + " ]" + " \n");
        }

         ///////// CALCULOS DE DISTANCIA /////////////////
        calculoDX = cal1.calcular(arrayDuracionXC);
        for (int i = 0; i < calculoDX.size(); i++) {
            guiARecomendar.areaDuracionXD.append((String) "[Cluster " + i + "]" + calculoDX.get(i) + " \n");
        }

        ///////////// asignacion a lanmark /////////////////    
        calculoDX1 = cal1.calculoPosision(arrayDuracionXC);
        arrayDuracionXTprueba = calculoDX1;

        for (int i = 0; i < calculoDX1.size(); i++) {
            guiARecomendar.areaDuracionXDD.append((String) "[Cluster " + i + "]" + calculoDX1.get(i) + " \n");
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////////////// DURACION EN X ///////////////////////////////////////////////////////////////");

              ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumaDX = 0;
        double sumaDX1 = 0;
        double cenGeneralDX = 0;
        double indiceValidezDX = 0;
        double indiceValidez1DX = 0;
        double indiceValidezfinalDX = 0;
        double numClusterDX = 0;
        double numElementosDX = 0;

        ArrayList arrayDuracionXIndiceXNC = new ArrayList();
        ArrayList arrayDuracionXIndiceXNI = new ArrayList();
        ArrayList arrayDuracionXIndiceXC = new ArrayList();

        for (int i = 0; i < arrayDuracionXI.size(); i++) {
            arrayDuracionXIndiceXNC = km1.extraerNumeroClustersDuracionX1(i);
            arrayDuracionXIndiceXNI = km1.extraerInstanciasDuracionX(i);
            arrayDuracionXIndiceXC = km1.extraercentroideDuracionX(i);
            sumaDX = sumaDX + indCH.distanciaCluster(arrayDuracionXIndiceXNC, arrayDuracionXIndiceXNI, arrayDuracionXIndiceXC);
        }

        cenGeneralDX = indCH.calculoCentroideGeneral(arrayDuracionXEC1);
        sumaDX1 = indCH.distanciaSeparacionCluster(arrayDuracionXC, cenGeneralDX, arrayDuracionXI);
        numClusterDX = km1.instanciaDuracionX2();
        numElementosDX = km1.instanciaDuracionX3();

        indiceValidezDX = sumaDX1 / sumaDX;
        indiceValidez1DX = (numElementosDX - numClusterDX) / (numClusterDX - 1);
        indiceValidezfinalDX = indiceValidezDX * indiceValidez1DX;
        guiARecomendar.jDXIndiceCH.setText(String.valueOf(indiceValidezfinalDX));

         //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBDX = 0;
        double sumaMaxTotalDX = 0;
        double numClusterDBDX = 0;
        double indiceDBDX = 0;

        ArrayList arrayDuracionXIndiceDBNC = new ArrayList();
        ArrayList arrayDuracionXIndiceDBNI = new ArrayList();
        ArrayList arrayDuracionXIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKDX = new ArrayList();
        ArrayList sumamaxDX = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionXI.size(); i++) {
            arrayDuracionXIndiceDBNC = km1.extraerNumeroClustersDuracionX1(i);
            arrayDuracionXIndiceDBNI = km1.extraerInstanciasDuracionX(i);
            arrayDuracionXIndiceDBNC1 = km1.extraercentroideDuracionX(i);
            sumadDBDX = indDB.distanciaCluster(arrayDuracionXIndiceDBNC, arrayDuracionXIndiceDBNI, arrayDuracionXIndiceDBNC1);
            arraySCKDX.add(String.valueOf(sumadDBDX));

        }

        indDB.distanciaSeparacionCluster(arrayDuracionXC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxDX = indDB.distanciaSeparacionCluster1(arrayDuracionXC, arraySCKDX);

        for (int i = 0; i < sumamaxDX.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxDX.get(i));
            sumaMaxTotalDX = sumaMaxTotalDX + Double.parseDouble((String) sumamaxDX.get(i));
            numClusterDBDX = numClusterDBDX + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalDX);

        indiceDBDX = (1 / numClusterDBDX) * sumaMaxTotalDX;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBDX);

        guiARecomendar.jDXIndiceDB.setText(String.valueOf(indiceDBDX));

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////// DURACION EN Y //////////////
        //////// EXTRAER CUMULOS DURACION EN Y //////////////
        arrayDuracionYEC = km1.extraerNumClusterDuracionY();
        arrayDuracionYNC = arrayDuracionYEC;
        arrayDuracionYEC1 = km1.extraerInstanciasDuracionYTodas();
        arrayDuracionYNI = arrayDuracionYEC1;

        for (int i = 0; i < arrayDuracionYEC.size(); i++) {
            guiARecomendar.areaDuracionYEC.append((String) "Cluster " + arrayDuracionYEC.get(i) + " Instancia " + arrayDuracionYEC1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN Y /////////     
        arrayDuracionYI = km1.instanciaDuracionY();
        arrayDuracionYIprueba = arrayDuracionYI;
        for (int i = 0; i < arrayDuracionYI.size(); i++) {
            guiARecomendar.areaDuracionYI.append((String) "[Cluster " + i + "]" + arrayDuracionYI.get(i) + " Instancias" + " \n");
        }

        //////// CENTROIDE Duracion  EN X //////////
        arrayDuracionYC = km1.centroideDuracionY();
        arrayDuracionYCprueba = arrayDuracionYC;

        for (int i = 0; i < arrayDuracionYC.size(); i++) {
            guiARecomendar.areaDuracionYC.append((String) "[Cluster " + i + "]" + arrayDuracionYC.get(i) + " ]" + " \n");
        }
        ///////// CALCULOS DE DISTANCIA /////////////////
        calculoDY = cal1.calcular(arrayDuracionYC);
        for (int i = 0; i < calculoDY.size(); i++) {
            guiARecomendar.areaDuracionYD.append((String) "[Cluster " + i + "]" + calculoDY.get(i) + " \n");
        }
         ////////////// Asignacion a Lanmark /////////

        calculoDY1 = cal1.calculoPosision(arrayDuracionYC);
        arrayDuracionYTprueba = calculoDY1;
        for (int i = 0; i < calculoDY1.size(); i++) {
            guiARecomendar.areaDuracionYDD.append((String) "[Cluster " + i + "]" + calculoDY1.get(i) + " \n");
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////////////// DURACION EN Y ///////////////////////////////////////////////////////////////");

            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumaDXY = 0;
        double sumaDX1Y = 0;
        double cenGeneralDXY = 0;
        double indiceValidezDXY = 0;
        double indiceValidez1DXY = 0;
        double indiceValidezfinalDXY = 0;
        double numClusterDXY = 0;
        double numElementosDXY = 0;

        ArrayList arrayDuracionYIndiceXNC = new ArrayList();
        ArrayList arrayDuracionYIndiceXNI = new ArrayList();
        ArrayList arrayDuracionYIndiceXC = new ArrayList();

        for (int i = 0; i < arrayDuracionYI.size(); i++) {
            arrayDuracionYIndiceXNC = km1.extraerNumeroClustersDuracionY1(i);
            arrayDuracionYIndiceXNI = km1.extraerInstanciasDuracionY(i);
            arrayDuracionYIndiceXC = km1.extraercentroideDuracionY(i);
            sumaDXY = sumaDXY + indCH.distanciaCluster(arrayDuracionYIndiceXNC, arrayDuracionYIndiceXNI, arrayDuracionYIndiceXC);
        }

        cenGeneralDXY = indCH.calculoCentroideGeneral(arrayDuracionYEC1);
        sumaDX1Y = indCH.distanciaSeparacionCluster(arrayDuracionYC, cenGeneralDXY, arrayDuracionYI);
        numClusterDXY = km1.instanciaDuracionY2();
        numElementosDXY = km1.instanciaDuracionY3();

        indiceValidezDXY = sumaDX1Y / sumaDXY;
        indiceValidez1DXY = (numElementosDXY - numClusterDXY) / (numClusterDXY - 1);
        indiceValidezfinalDXY = indiceValidezDXY * indiceValidez1DXY;
        guiARecomendar.jDYIndiceCH.setText(String.valueOf(indiceValidezfinalDXY));
        System.out.println("El indice kALNSKY:  " + indiceValidezfinalDXY);

         //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBDXY = 0;
        double sumaMaxTotalDXY = 0;
        double numClusterDBDXY = 0;
        double indiceDBDXY = 0;

        ArrayList arrayDuracionYIndiceDBNC = new ArrayList();
        ArrayList arrayDuracionYIndiceDBNI = new ArrayList();
        ArrayList arrayDuracionYIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKDXY = new ArrayList();
        ArrayList sumamaxDXY = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionYI.size(); i++) {
            arrayDuracionYIndiceDBNC = km1.extraerNumeroClustersDuracionY1(i);
            arrayDuracionYIndiceDBNI = km1.extraerInstanciasDuracionY(i);
            arrayDuracionYIndiceDBNC1 = km1.extraercentroideDuracionY(i);
            sumadDBDXY = indDB.distanciaCluster(arrayDuracionYIndiceDBNC, arrayDuracionYIndiceDBNI, arrayDuracionYIndiceDBNC1);
            arraySCKDXY.add(String.valueOf(sumadDBDXY));

        }

        indDB.distanciaSeparacionCluster(arrayDuracionYC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxDXY = indDB.distanciaSeparacionCluster1(arrayDuracionYC, arraySCKDXY);

        for (int i = 0; i < sumamaxDXY.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxDXY.get(i));
            sumaMaxTotalDXY = sumaMaxTotalDXY + Double.parseDouble((String) sumamaxDXY.get(i));
            numClusterDBDXY = numClusterDBDXY + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalDXY);

        indiceDBDXY = (1 / numClusterDBDXY) * sumaMaxTotalDXY;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBDXY);

        guiARecomendar.jDYIndiceDB.setText(String.valueOf(indiceDBDXY));

//////////////////////////////////////////////////////////////////////////////////////////////////////////
          //////// DURACION EN Z //////////////
        //////// EXTRAER CUMULOS DURACION EN Z //////////////
        arrayDuracionZEC = km1.extraerNumClusterDuracionZ();
        arrayDuracionZNC = arrayDuracionZEC;
        arrayDuracionZEC1 = km1.extraerInstanciasDuracionZTodas();
        arrayDuracionZNI = arrayDuracionZEC1;

        for (int i = 0; i < arrayDuracionZEC.size(); i++) {
            guiARecomendar.areaDuracionZEC.append((String) "Cluster " + arrayDuracionZEC.get(i) + " Instancia " + arrayDuracionZEC1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN Y /////////     
        arrayDuracionZI = km1.instanciaDuracionZ();
        arrayDuracionZIprueba = arrayDuracionZI;
        for (int i = 0; i < arrayDuracionZI.size(); i++) {
            guiARecomendar.areaDuracionZI.append((String) "[Cluster " + i + "]" + arrayDuracionZI.get(i) + " Instancias" + " \n");
        }

        //////// CENTROIDE Duracion  EN X //////////
        arrayDuracionZC = km1.centroideDuracionZ();
        arrayDuracionZCprueba = arrayDuracionZC;

        for (int i = 0; i < arrayDuracionZC.size(); i++) {
            guiARecomendar.areaDuracionZC.append((String) "[Cluster " + i + "]" + arrayDuracionZC.get(i) + " ]" + " \n");
        }

        ///////// CALCULOS DE DISTANCIA /////////////////
        calculoDZ = cal1.calcular(arrayDuracionZC);
        for (int i = 0; i < calculoDZ.size(); i++) {
            guiARecomendar.areaDuracionZD.append((String) "[Cluster " + i + "]" + calculoDZ.get(i) + " \n");
        }
        /////////// ASIGNACIONES A LANMARK /////////
        calculoDZ1 = cal1.calculoPosision(arrayDuracionZC);
        arrayDuracionZTprueba = calculoDZ1;
        for (int i = 0; i < calculoDZ1.size(); i++) {
            guiARecomendar.areaDuracionZDD.append((String) "[Cluster " + i + "]" + calculoDZ1.get(i) + " \n");
        }

        System.out.println("/////////////////////////////////////////////////////////////////////////////////// DURACION EN Z ///////////////////////////////////////////////////////////////");

            ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumaDXZ = 0;
        double sumaDX1Z = 0;
        double cenGeneralDXZ = 0;
        double indiceValidezDXZ = 0;
        double indiceValidez1DXZ = 0;
        double indiceValidezfinalDXZ = 0;
        double numClusterDXZ = 0;
        double numElementosDXZ = 0;

        ArrayList arrayDuracionZIndiceXNC = new ArrayList();
        ArrayList arrayDuracionZIndiceXNI = new ArrayList();
        ArrayList arrayDuracionZIndiceXC = new ArrayList();

        for (int i = 0; i < arrayDuracionZI.size(); i++) {
            arrayDuracionZIndiceXNC = km1.extraerNumeroClustersDuracionZ1(i);
            arrayDuracionZIndiceXNI = km1.extraerInstanciasDuracionZ(i);
            arrayDuracionZIndiceXC = km1.extraercentroideDuracionZ(i);
            sumaDXZ = sumaDXZ + indCH.distanciaCluster(arrayDuracionZIndiceXNC, arrayDuracionZIndiceXNI, arrayDuracionZIndiceXC);
        }

        cenGeneralDXZ = indCH.calculoCentroideGeneral(arrayDuracionZEC1);
        sumaDX1Z = indCH.distanciaSeparacionCluster(arrayDuracionZC, cenGeneralDXZ, arrayDuracionZI);
        numClusterDXZ = km1.instanciaDuracionZ2();
        numElementosDXZ = km1.instanciaDuracionZ3();

        indiceValidezDXZ = sumaDX1Z / sumaDXZ;
        indiceValidez1DXZ = (numElementosDXZ - numClusterDXZ) / (numClusterDXZ - 1);
        indiceValidezfinalDXZ = indiceValidezDXZ * indiceValidez1DXZ;
        guiARecomendar.jDZIndiceCH.setText(String.valueOf(indiceValidezfinalDXZ));
        System.out.println("El indice kALNSKY:  " + indiceValidezfinalDXZ);

         //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBDXZ = 0;
        double sumaMaxTotalDXZ = 0;
        double numClusterDBDXZ = 0;
        double indiceDBDXZ = 0;

        ArrayList arrayDuracionZIndiceDBNC = new ArrayList();
        ArrayList arrayDuracionZIndiceDBNI = new ArrayList();
        ArrayList arrayDuracionZIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKDXZ = new ArrayList();
        ArrayList sumamaxDXZ = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionZI.size(); i++) {
            arrayDuracionZIndiceDBNC = km1.extraerNumeroClustersDuracionZ1(i);
            arrayDuracionZIndiceDBNI = km1.extraerInstanciasDuracionZ(i);
            arrayDuracionZIndiceDBNC1 = km1.extraercentroideDuracionZ(i);
            sumadDBDXZ = indDB.distanciaCluster(arrayDuracionZIndiceDBNC, arrayDuracionZIndiceDBNI, arrayDuracionZIndiceDBNC1);
            arraySCKDXZ.add(String.valueOf(sumadDBDXZ));

        }

        indDB.distanciaSeparacionCluster(arrayDuracionZC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxDXZ = indDB.distanciaSeparacionCluster1(arrayDuracionZC, arraySCKDXZ);

        for (int i = 0; i < sumamaxDXZ.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxDXZ.get(i));
            sumaMaxTotalDXZ = sumaMaxTotalDXZ + Double.parseDouble((String) sumamaxDXZ.get(i));
            numClusterDBDXZ = numClusterDBDXZ + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalDXZ);

        indiceDBDXZ = (1 / numClusterDBDXZ) * sumaMaxTotalDXZ;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBDXZ);

        guiARecomendar.jDZIndiceDB.setText(String.valueOf(indiceDBDXZ));

//////////////////////////////////////////////////////////////////////////////////////////////////////////
            ///////////// OCTAVAS /////////////////////
        ArrayList arrayOctavaXEC = new ArrayList();
        ArrayList arrayOctavaXEC1 = new ArrayList();

        ArrayList arrayOctavaXI = new ArrayList();
        ArrayList arrayOctavaXC = new ArrayList();

        ArrayList arrayOctavaYEC = new ArrayList();
        ArrayList arrayOctavaYEC1 = new ArrayList();

        ArrayList arrayOctavaYI = new ArrayList();
        ArrayList arrayOctavaYC = new ArrayList();

        ArrayList arrayOctavaZEC = new ArrayList();
        ArrayList arrayOctavaZEC1 = new ArrayList();
        ArrayList arrayOctavaZI = new ArrayList();
        ArrayList arrayOctavaZC = new ArrayList();

        ArrayList calculoOX = new ArrayList();
        ArrayList calculoOY = new ArrayList();
        ArrayList calculoOZ = new ArrayList();

              /////////// octava x ///////////
                  //////// EXTRAER CUMULOS OCTAVA EN X //////////////
        arrayOctavaXEC = km2.extraerNumClusterOctavaX();
        arrayOctavaXNC = arrayOctavaXEC;
        arrayOctavaXEC1 = km2.extraerInstanciasOctavaXTodas();
        arrayOctavaXNI = arrayOctavaXEC1;

        for (int i = 0; i < arrayOctavaXEC.size(); i++) {
            guiARecomendar.areaOctavaXECK.append((String) "Cluster " + arrayOctavaXEC.get(i) + " Instancia " + arrayOctavaXEC1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN Y /////////     
        arrayOctavaXI = km2.instanciaOctavaX();
        arrayOctavaXIprueba = arrayOctavaXI;
        for (int i = 0; i < arrayOctavaXI.size(); i++) {
            guiARecomendar.areaOctavaXI.append((String) "[Cluster " + i + "]" + arrayOctavaXI.get(i) + " Instancias" + " \n");
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }

        //////// CENTROIDE Octava  EN X //////////
        arrayOctavaXC = km2.centroideOctavaX();
        arrayOctavaXCprueba = arrayOctavaXC;

        for (int i = 0; i < arrayOctavaXC.size(); i++) {
            guiARecomendar.areaOctavaXC.append((String) "[Cluster " + i + "]" + arrayOctavaXC.get(i) + " ]" + " \n");
        }

        calculoOX = cal2.calculoPosision(arrayOctavaXC);
        arrayOctavaXTprueba = calculoOX;

        for (int i = 0; i < calculoOX.size(); i++) {
            guiARecomendar.areaOctavaXT.append((String) "[Cluster " + i + "]" + calculoOX.get(i) + " \n");
        }

                     ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumaOX = 0;
        double sumaOX1 = 0;
        double cenGeneralOX = 0;
        double indiceValidezOX = 0;
        double indiceValidez1OX = 0;
        double indiceValidezfinalOX = 0;
        double numClusterOX = 0;
        double numElementosOX = 0;

        ArrayList arrayOctavaXIndiceXNC = new ArrayList();
        ArrayList arrayOctavaXIndiceXNI = new ArrayList();
        ArrayList arrayOctavaXIndiceXC = new ArrayList();

        for (int i = 0; i < arrayOctavaXI.size(); i++) {
            arrayOctavaXIndiceXNC = km2.extraerNumeroClustersOctavaX1(i);
            arrayOctavaXIndiceXNI = km2.extraerInstanciasOctavaX(i);
            arrayOctavaXIndiceXC = km2.extraercentroideOctavaX(i);
            sumaOX = sumaOX + indCH.distanciaCluster(arrayOctavaXIndiceXNC, arrayOctavaXIndiceXNI, arrayOctavaXIndiceXC);
        }

        cenGeneralOX = indCH.calculoCentroideGeneral(arrayOctavaXEC1);
        sumaOX1 = indCH.distanciaSeparacionCluster(arrayOctavaXC, cenGeneralOX, arrayOctavaXI);
        numClusterOX = km2.instanciaOctavaX2();
        numElementosOX = km2.instanciaOctavaX3();

        System.out.println(numClusterOX);
        System.out.println(numElementosOX);

        indiceValidezOX = sumaOX1 / sumaOX;
        indiceValidez1OX = (numElementosOX - numClusterOX) / (numClusterOX - 1);
        indiceValidezfinalOX = indiceValidezOX * indiceValidez1OX;
        guiARecomendar.jOXIndiceCH.setText(String.valueOf(indiceValidezfinalOX));

         //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBOX = 0;
        double sumaMaxTotalOX = 0;
        double numClusterDBOX = 0;
        double indiceDBOX = 0;

        ArrayList arrayOctavaXIndiceDBNC = new ArrayList();
        ArrayList arrayOctavaXIndiceDBNI = new ArrayList();
        ArrayList arrayOctavaXIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKOX = new ArrayList();
        ArrayList sumamaxOX = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaXI.size(); i++) {
            arrayOctavaXIndiceDBNC = km2.extraerNumeroClustersOctavaX1(i);
            arrayOctavaXIndiceDBNI = km2.extraerInstanciasOctavaX(i);
            arrayOctavaXIndiceDBNC1 = km2.extraercentroideOctavaX(i);
            sumadDBOX = indDB.distanciaCluster(arrayOctavaXIndiceDBNC, arrayOctavaXIndiceDBNI, arrayOctavaXIndiceDBNC1);
            arraySCKOX.add(String.valueOf(sumadDBOX));

        }

        indDB.distanciaSeparacionCluster(arrayOctavaXC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxOX = indDB.distanciaSeparacionCluster1(arrayOctavaXC, arraySCKOX);

        for (int i = 0; i < sumamaxOX.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxOX.get(i));
            sumaMaxTotalOX = sumaMaxTotalOX + Double.parseDouble((String) sumamaxOX.get(i));
            numClusterDBOX = numClusterDBOX + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalOX);

        indiceDBOX = (1 / numClusterDBOX) * sumaMaxTotalOX;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBOX);

        guiARecomendar.jOXIndiceDB.setText(String.valueOf(indiceDBOX));

//////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////// octava y /////////
        arrayOctavaYEC = km2.extraerNumClusterOctavaY();
        arrayOctavaYNC = arrayOctavaYEC;
        arrayOctavaYEC1 = km2.extraerInstanciasOctavaYTodas();
        arrayOctavaYNI = arrayOctavaYEC1;

        for (int i = 0; i < arrayOctavaYEC.size(); i++) {
            guiARecomendar.areaOctavaYECK.append((String) "Cluster " + arrayOctavaYEC.get(i) + " Instancia " + arrayOctavaYEC1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN Y /////////     
        arrayOctavaYI = km2.instanciaOctavaY();
        arrayOctavaYIprueba = arrayOctavaYI;

        for (int i = 0; i < arrayOctavaYI.size(); i++) {
            guiARecomendar.areaOctavaYI.append((String) "[Cluster " + i + "]" + arrayOctavaYI.get(i) + " Instancias" + " \n");
        }

        //////// CENTROIDE Octava  EN X //////////
        arrayOctavaYC = km2.centroideOctavaY();
        arrayOctavaYCprueba = arrayOctavaYC;

        for (int i = 0; i < arrayOctavaYC.size(); i++) {
            guiARecomendar.areaOctavaYC.append((String) "[Cluster " + i + "]" + arrayOctavaYC.get(i) + " ]" + " \n");
        }

        calculoOY = cal2.calculoPosision(arrayOctavaYC);
        arrayOctavaYTprueba = calculoOY;

        for (int i = 0; i < calculoOY.size(); i++) {

            guiARecomendar.areaOctavaYT.append((String) "[Cluster " + i + "]" + calculoOY.get(i) + " \n");

        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumaOY = 0;
        double sumaOY1 = 0;
        double cenGeneralOY = 0;
        double indiceValidezOY = 0;
        double indiceValidez1OY = 0;
        double indiceValidezfinalOY = 0;
        double numClusterOY = 0;
        double numElementosOY = 0;

        ArrayList arrayOctavaYIndiceXNC = new ArrayList();
        ArrayList arrayOctavaYIndiceXNI = new ArrayList();
        ArrayList arrayOctavaYIndiceXC = new ArrayList();

        for (int i = 0; i < arrayOctavaYI.size(); i++) {
            arrayOctavaYIndiceXNC = km2.extraerNumeroClustersOctavaY1(i);
            arrayOctavaYIndiceXNI = km2.extraerInstanciasOctavaY(i);
            arrayOctavaYIndiceXC = km2.extraercentroideOctavaY(i);
            sumaOY = sumaOY + indCH.distanciaCluster(arrayOctavaYIndiceXNC, arrayOctavaYIndiceXNI, arrayOctavaYIndiceXC);
        }

        cenGeneralOY = indCH.calculoCentroideGeneral(arrayOctavaYEC1);
        sumaOY1 = indCH.distanciaSeparacionCluster(arrayOctavaYC, cenGeneralOY, arrayOctavaYI);
        numClusterOY = km2.instanciaOctavaY2();
        numElementosOY = km2.instanciaOctavaY3();

        System.out.println(numClusterOY);
        System.out.println(numElementosOY);

        indiceValidezOY = sumaOY1 / sumaOY;
        indiceValidez1OY = (numElementosOY - numClusterOY) / (numClusterOY - 1);
        indiceValidezfinalOY = indiceValidezOY * indiceValidez1OY;
        guiARecomendar.jOYIndiceCH.setText(String.valueOf(indiceValidezfinalOY));

         //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBOY = 0;
        double sumaMaxTotalOY = 0;
        double numClusterDBOY = 0;
        double indiceDBOY = 0;

        ArrayList arrayOctavaYIndiceDBNC = new ArrayList();
        ArrayList arrayOctavaYIndiceDBNI = new ArrayList();
        ArrayList arrayOctavaYIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKOY = new ArrayList();
        ArrayList sumamaxOY = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaYI.size(); i++) {
            arrayOctavaYIndiceDBNC = km2.extraerNumeroClustersOctavaY1(i);
            arrayOctavaYIndiceDBNI = km2.extraerInstanciasOctavaY(i);
            arrayOctavaYIndiceDBNC1 = km2.extraercentroideOctavaY(i);
            sumadDBOY = indDB.distanciaCluster(arrayOctavaYIndiceDBNC, arrayOctavaYIndiceDBNI, arrayOctavaYIndiceDBNC1);
            arraySCKOY.add(String.valueOf(sumadDBOY));

        }

        indDB.distanciaSeparacionCluster(arrayOctavaYC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxOY = indDB.distanciaSeparacionCluster1(arrayOctavaYC, arraySCKOY);

        for (int i = 0; i < sumamaxOY.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxOY.get(i));
            sumaMaxTotalOY = sumaMaxTotalOY + Double.parseDouble((String) sumamaxOY.get(i));
            numClusterDBOY = numClusterDBOY + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalOY);

        indiceDBOY = (1 / numClusterDBOY) * sumaMaxTotalOY;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBOY);

        guiARecomendar.jOYIndiceDB.setText(String.valueOf(indiceDBOY));

//////////////////////////////////////////////////////////////////////////////////////////////////////////
               //////////// octava z //////////
        arrayOctavaZEC = km2.extraerNumClusterOctavaZ();
        arrayOctavaZNC = arrayOctavaZEC;
        arrayOctavaZEC1 = km2.extraerInstanciasOctavaZTodas();
        arrayOctavaZNI = arrayOctavaZEC1;

        for (int i = 0; i < arrayOctavaZEC.size(); i++) {
            guiARecomendar.areaOctavaZECK.append((String) "Cluster " + arrayOctavaZEC.get(i) + " Instancia " + arrayOctavaZEC1.get(i) + " \n");
        }

                /////// EXTRAER TOTAL INSTANCIAS TEMPO EN Y ///////// 
        arrayOctavaZI = km2.instanciaOctavaZ();
        arrayOctavaZIprueba = arrayOctavaZI;
        for (int i = 0; i < arrayOctavaZI.size(); i++) {
            guiARecomendar.areaOctavaZI.append((String) "[Cluster " + i + "]" + arrayOctavaZI.get(i) + " Instancias" + " \n");
        }

        //////// CENTROIDE Octava  EN X //////////
        arrayOctavaZC = km2.centroideOctavaZ();
        arrayOctavaZCprueba = arrayOctavaZC;

        for (int i = 0; i < arrayOctavaZC.size(); i++) {
            guiARecomendar.areaOctavaZC.append((String) "[Cluster " + i + "]" + arrayOctavaZC.get(i) + " ]" + " \n");
        }

        calculoOZ = cal2.calculoPosision(arrayOctavaZC);
        arrayOctavaZTprueba = calculoOZ;
        for (int i = 0; i < calculoOZ.size(); i++) {

            guiARecomendar.areaOctavaZT.append((String) "[Cluster " + i + "]" + calculoOZ.get(i) + " \n");

        }

                 ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumaOZ = 0;
        double sumaOZ1 = 0;
        double cenGeneralOZ = 0;
        double indiceValidezOZ = 0;
        double indiceValidez1OZ = 0;
        double indiceValidezfinalOZ = 0;
        double numClusterOZ = 0;
        double numElementosOZ = 0;

        ArrayList arrayOctavaZIndiceXNC = new ArrayList();
        ArrayList arrayOctavaZIndiceXNI = new ArrayList();
        ArrayList arrayOctavaZIndiceXC = new ArrayList();

        for (int i = 0; i < arrayOctavaZI.size(); i++) {
            arrayOctavaZIndiceXNC = km2.extraerNumeroClustersOctavaZ1(i);
            arrayOctavaZIndiceXNI = km2.extraerInstanciasOctavaZ(i);
            arrayOctavaZIndiceXC = km2.extraercentroideOctavaZ(i);
            sumaOZ = sumaOZ + indCH.distanciaCluster(arrayOctavaZIndiceXNC, arrayOctavaZIndiceXNI, arrayOctavaZIndiceXC);
        }

        cenGeneralOZ = indCH.calculoCentroideGeneral(arrayOctavaZEC1);
        sumaOZ1 = indCH.distanciaSeparacionCluster(arrayOctavaZC, cenGeneralOZ, arrayOctavaZI);
        numClusterOZ = km2.instanciaOctavaZ2();
        numElementosOZ = km2.instanciaOctavaZ3();

        System.out.println(numClusterOZ);
        System.out.println(numElementosOZ);

        indiceValidezOZ = sumaOZ1 / sumaOZ;
        indiceValidez1OZ = (numElementosOZ - numClusterOZ) / (numClusterOZ - 1);
        indiceValidezfinalOZ = indiceValidezOZ * indiceValidez1OZ;
        guiARecomendar.jOZIndiceCH.setText(String.valueOf(indiceValidezfinalOZ));

         //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBOZ = 0;
        double sumaMaxTotalOZ = 0;
        double numClusterDBOZ = 0;
        double indiceDBOZ = 0;

        ArrayList arrayOctavaZIndiceDBNC = new ArrayList();
        ArrayList arrayOctavaZIndiceDBNI = new ArrayList();
        ArrayList arrayOctavaZIndiceDBNC1 = new ArrayList();
        ArrayList arraySCKOZ = new ArrayList();
        ArrayList sumamaxOZ = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaZI.size(); i++) {
            arrayOctavaZIndiceDBNC = km2.extraerNumeroClustersOctavaZ1(i);
            arrayOctavaZIndiceDBNI = km2.extraerInstanciasOctavaZ(i);
            arrayOctavaZIndiceDBNC1 = km2.extraercentroideOctavaZ(i);
            sumadDBOZ = indDB.distanciaCluster(arrayOctavaZIndiceDBNC, arrayOctavaZIndiceDBNI, arrayOctavaZIndiceDBNC1);
            arraySCKOZ.add(String.valueOf(sumadDBOZ));

        }

        indDB.distanciaSeparacionCluster(arrayOctavaZC);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxOZ = indDB.distanciaSeparacionCluster1(arrayOctavaZC, arraySCKOZ);

        for (int i = 0; i < sumamaxOZ.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxOZ.get(i));
            sumaMaxTotalOZ = sumaMaxTotalOZ + Double.parseDouble((String) sumamaxOZ.get(i));
            numClusterDBOZ = numClusterDBOZ + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalOZ);

        indiceDBOZ = (1 / numClusterDBOZ) * sumaMaxTotalOZ;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBOZ);

        guiARecomendar.jOZIndiceDB.setText(String.valueOf(indiceDBOZ));

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////// INSTRUMENTOS //////
        ArrayList<String> inst1 = new ArrayList<String>(); // INSTRUMENTOS
        int cont;

        inst1 = cons.cboInstrumento();

        for (int i = 0; i < inst1.size(); i++) {
            cont = cons.cInstrumento(emocion3, inst1.get(i).toString());
            guiARecomendar.areaInstrumentosKM.append((String) inst1.get(i) + " " + "Instancias: " + cont + " \n");
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////// ESCALAS //////
        ArrayList<String> esca1 = new ArrayList<String>(); // INSTRUMENTOS
        int cont1;

        esca1 = cons.cboEscala();

        for (int i = 0; i < esca1.size(); i++) {
            cont1 = cons.cEscala(emocion3, esca1.get(i).toString());
            guiARecomendar.areaEscalasKM.append((String) esca1.get(i) + " " + "Instancias: " + cont1 + " \n");
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////// ACORDES //////
        ArrayList<String> acor1 = new ArrayList<String>(); // INSTRUMENTOS
        int cont2;

        acor1 = cons.cboAcorde();

        for (int i = 0; i < acor1.size(); i++) {
            cont2 = cons.cAcorde(emocion3, acor1.get(i).toString());
            guiARecomendar.areaAcordesKM.append((String) acor1.get(i) + " " + "Instancias: " + cont2 + " \n");
        }

 /////////////// TERMINA K MEANS //////////////              
        System.out.println("He Terminado con Kmeans ...");

        System.out.println("////////////////////////////////////////////////////    Iniciare el proceso con Xmeans   ////////////////////////////////////////////////////////////////");

 /////////////////////// X MEANS //////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        xMeans xm = new xMeans(10, 3000, emocion3);
        xMeans xm1 = new xMeans(5, 3000, emocion3);
        xMeans xm2 = new xMeans(11, 3000, emocion3);

        xm.trainCluster();
        xm1.trainCluster();
        xm2.trainCluster();

        ArrayList arrayTempoXECX = new ArrayList();
        ArrayList arrayTempoXECX1 = new ArrayList();

        ArrayList arrayTempoYECX = new ArrayList();
        ArrayList arrayTempoYECX1 = new ArrayList();

        ArrayList arrayTempoZECX = new ArrayList();
        ArrayList arrayTempoZECX1 = new ArrayList();

        ArrayList arrayTempoXIX = new ArrayList();
        ArrayList arrayTempoYIX = new ArrayList();
        ArrayList arrayTempoZIX = new ArrayList();
        ArrayList arrayTempoXCX = new ArrayList();
        ArrayList arrayTempoYCX = new ArrayList();
        ArrayList arrayTempoZCX = new ArrayList();
        ArrayList calculoTXX = new ArrayList();
        ArrayList calculoTYX = new ArrayList();
        ArrayList calculoTZX = new ArrayList();
        ArrayList calculoTX1X = new ArrayList();
        ArrayList calculoTY1X = new ArrayList();
        ArrayList calculoTZ1X = new ArrayList();
        // Intanciamos Arreglos Duración
        ArrayList arrayDuracionXECX = new ArrayList();
        ArrayList arrayDuracionXECX1 = new ArrayList();

        ArrayList arrayDuracionYECX = new ArrayList();
        ArrayList arrayDuracionYECX1 = new ArrayList();

        ArrayList arrayDuracionZECX = new ArrayList();
        ArrayList arrayDuracionZECX1 = new ArrayList();

        ArrayList arrayDuracionXIX = new ArrayList();
        ArrayList arrayDuracionYIX = new ArrayList();
        ArrayList arrayDuracionZIX = new ArrayList();
        ArrayList arrayDuracionXCX = new ArrayList();
        ArrayList arrayDuracionYCX = new ArrayList();
        ArrayList arrayDuracionZCX = new ArrayList();
        ArrayList calculoDXX = new ArrayList();
        ArrayList calculoDYX = new ArrayList();
        ArrayList calculoDZX = new ArrayList();
        ArrayList calculoDX1X = new ArrayList();
        ArrayList calculoDY1X = new ArrayList();
        ArrayList calculoDZ1X = new ArrayList();

        // Intanciamos Arreglos Octavas
        ArrayList arrayOctavaXECX = new ArrayList();
        ArrayList arrayOctavaXECX1 = new ArrayList();

        ArrayList arrayOctavaYECX = new ArrayList();
        ArrayList arrayOctavaYECX1 = new ArrayList();

        ArrayList arrayOctavaZECX = new ArrayList();
        ArrayList arrayOctavaZECX1 = new ArrayList();

        ArrayList arrayOctavaXIX = new ArrayList();
        ArrayList arrayOctavaYIX = new ArrayList();
        ArrayList arrayOctavaZIX = new ArrayList();
        ArrayList arrayOctavaXCX = new ArrayList();
        ArrayList arrayOctavaYCX = new ArrayList();
        ArrayList arrayOctavaZCX = new ArrayList();
        ArrayList calculoOXX = new ArrayList();
        ArrayList calculoOYX = new ArrayList();
        ArrayList calculoOZX = new ArrayList();
        ArrayList calculoOX1X = new ArrayList();
        ArrayList calculoOY1X = new ArrayList();
        ArrayList calculoOZ1X = new ArrayList();

        /////////// TEMPO EN X  XMEANS////////////////////////////
        arrayTempoXECX = xm.extraerNumClusterTempoX();
        arrayTempoXNCX = arrayTempoXECX;
        arrayTempoXECX1 = xm.extraerInstanciasTempoXTodas();
        arrayTempoXNIX = arrayTempoXECX1;

        for (int i = 0; i < arrayTempoXECX.size(); i++) {
            guiARecomendar.areaTempoXECX.append((String) "Cluster " + arrayTempoXECX.get(i) + " Instancia " + arrayTempoXECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayTempoXIX = xm.instanciaTempoX();
        arrayTempoXIpruebaX = arrayTempoXIX;
        for (int i = 0; i < arrayTempoXIX.size(); i++) {
            guiARecomendar.areaTempoXIX.append((String) "[Cluster " + i + "]" + arrayTempoXIX.get(i) + " Instancias" + " \n");
        }

        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayTempoXCX = xm.centroideTempoX();
        arrayTempoXCpruebaX = arrayTempoXCX;
        for (int i = 0; i < arrayTempoXCX.size(); i++) {
            guiARecomendar.areaTempoXCX.append((String) "[Cluster " + i + "]" + arrayTempoXCX.get(i) + " ]" + " \n");
        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoTXX = cal.calcular(arrayTempoXCX);
        for (int i = 0; i < calculoTXX.size(); i++) {
            guiARecomendar.areaTempoXDX.append((String) "[Cluster " + i + "]" + calculoTXX.get(i) + " \n");
        }
        calculoTX1X = cal.calculoPosision(arrayTempoXCX);
        arrayTempoXTpruebaX = calculoTX1X;
        for (int i = 0; i < calculoTX1X.size(); i++) {
            guiARecomendar.areaTempoXDXD.append((String) "[Cluster " + i + "]" + calculoTX1X.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxm = 0;
        double sumad1xm = 0;
        double cenGeneralxm = 0;
        double indiceValidezxm = 0;
        double indiceValidez1xm = 0;
        double indiceValidezfinalxm = 0;
        double numClusterxm = 0;
        double numElementosxm = 0;

        ArrayList arrayTempoXIndiceXNCxm = new ArrayList();
        ArrayList arrayTempoXIndiceXNIxm = new ArrayList();
        ArrayList arrayTempoXIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayTempoXIX.size(); i++) {
            arrayTempoXIndiceXNCxm = xm.extraerNumeroClustersTempoX1(i);
            arrayTempoXIndiceXNIxm = xm.extraerInstanciasTempoX(i);
            arrayTempoXIndiceXCxm = xm.extraercentroideTempoX(i);
            sumadxm = sumadxm + indCH.distanciaCluster(arrayTempoXIndiceXNCxm, arrayTempoXIndiceXNIxm, arrayTempoXIndiceXCxm);
        }

        cenGeneralxm = indCH.calculoCentroideGeneral(arrayTempoXECX1);
        sumad1xm = indCH.distanciaSeparacionCluster(arrayTempoXCX, cenGeneralxm, arrayTempoXIX);
        numClusterxm = xm.instanciaTempoX2();
        numElementosxm = xm.instanciaTempoX3();

        indiceValidezxm = sumad1xm / sumadxm;
        indiceValidez1xm = (numElementosxm - numClusterxm) / (numClusterxm - 1);
        indiceValidezfinalxm = indiceValidezxm * indiceValidez1xm;
        guiARecomendar.jTXIndiceCHX.setText(String.valueOf(indiceValidezfinalxm));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxm = 0;
        double sumaMaxTotalxm = 0;
        double numClusterDBxm = 0;
        double indiceDBxm = 0;

        ArrayList arrayTempoXIndiceDBNCxm = new ArrayList();
        ArrayList arrayTempoXIndiceDBNIxm = new ArrayList();
        ArrayList arrayTempoXIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxm = new ArrayList();
        ArrayList sumamaxxm = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayTempoXIX.size(); i++) {
            arrayTempoXIndiceDBNCxm = xm.extraerNumeroClustersTempoX1(i);
            arrayTempoXIndiceDBNIxm = xm.extraerInstanciasTempoX(i);
            arrayTempoXIndiceDBNC1xm = xm.extraercentroideTempoX(i);
            sumadDBxm = indDB.distanciaCluster(arrayTempoXIndiceDBNCxm, arrayTempoXIndiceDBNIxm, arrayTempoXIndiceDBNC1xm);
            arraySCKxm.add(String.valueOf(sumadDBxm));

        }
        indDB.distanciaSeparacionCluster(arrayTempoXCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxm = indDB.distanciaSeparacionCluster1(arrayTempoXCX, arraySCKxm);

        for (int i = 0; i < sumamaxxm.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxm.get(i));
            sumaMaxTotalxm = sumaMaxTotalxm + Double.parseDouble((String) sumamaxxm.get(i));
            numClusterDBxm = numClusterDBxm + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxm);

        indiceDBxm = (1 / numClusterDBxm) * sumaMaxTotalxm;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxm);

        guiARecomendar.jTXIndiceDBX.setText(String.valueOf(indiceDBxm));

       ///////// TEMPO EN Y ///////////////////////////////////// 
        /////////// TEMPO EN Y  XMEANS////////////////////////////
        arrayTempoYECX = xm.extraerNumClusterTempoY();
        arrayTempoYNCX = arrayTempoYECX;
        arrayTempoYECX1 = xm.extraerInstanciasTempoYTodas();
        arrayTempoYNIX = arrayTempoYECX1;

        for (int i = 0; i < arrayTempoYECX.size(); i++) {
            guiARecomendar.areaTempoYECX.append((String) "Cluster " + arrayTempoYECX.get(i) + " Instancia " + arrayTempoYECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN Y /////////     
        arrayTempoYIX = xm.instanciaTempoY();
        arrayTempoYIpruebaX = arrayTempoYIX;
        for (int i = 0; i < arrayTempoYIX.size(); i++) {
            guiARecomendar.areaTempoYIX.append((String) "[Cluster " + i + "]" + arrayTempoYIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN Y //////////////////              
        arrayTempoYCX = xm.centroideTempoY();
        arrayTempoYCpruebaX = arrayTempoYCX;

        for (int i = 0; i < arrayTempoYCX.size(); i++) {
            guiARecomendar.areaTempoYCX.append((String) "[Cluster " + i + "]" + arrayTempoYCX.get(i) + " ]" + " \n");
        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoTYX = cal.calcular(arrayTempoYCX);
        for (int i = 0; i < calculoTYX.size(); i++) {
            guiARecomendar.areaTempoYDX.append((String) "[Cluster " + i + "]" + calculoTYX.get(i) + " \n");
        }
        calculoTY1X = cal.calculoPosision(arrayTempoYCX);
        arrayTempoYTpruebaX = calculoTY1X;
        for (int i = 0; i < calculoTY1X.size(); i++) {
            guiARecomendar.areaTempoYDXD.append((String) "[Cluster " + i + "]" + calculoTY1X.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmY = 0;
        double sumad1xmY = 0;
        double cenGeneralxmY = 0;
        double indiceValidezxmY = 0;
        double indiceValidez1xmY = 0;
        double indiceValidezfinalxmY = 0;
        double numClusterxmY = 0;
        double numElementosxmY = 0;

        ArrayList arrayTempoYIndiceXNCxm = new ArrayList();
        ArrayList arrayTempoYIndiceXNIxm = new ArrayList();
        ArrayList arrayTempoYIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayTempoYIX.size(); i++) {
            arrayTempoYIndiceXNCxm = xm.extraerNumeroClustersTempoY1(i);
            arrayTempoYIndiceXNIxm = xm.extraerInstanciasTempoY(i);
            arrayTempoYIndiceXCxm = xm.extraercentroideTempoY(i);
            sumadxmY = sumadxmY + indCH.distanciaCluster(arrayTempoYIndiceXNCxm, arrayTempoYIndiceXNIxm, arrayTempoYIndiceXCxm);
        }

        cenGeneralxmY = indCH.calculoCentroideGeneral(arrayTempoYECX1);
        sumad1xmY = indCH.distanciaSeparacionCluster(arrayTempoYCX, cenGeneralxmY, arrayTempoYIX);
        numClusterxmY = xm.instanciaTempoY2();
        numElementosxmY = xm.instanciaTempoY3();

        indiceValidezxmY = sumad1xmY / sumadxmY;
        indiceValidez1xmY = (numElementosxmY - numClusterxmY) / (numClusterxmY - 1);
        indiceValidezfinalxmY = indiceValidezxmY * indiceValidez1xmY;
        guiARecomendar.jTYIndiceCHX.setText(String.valueOf(indiceValidezfinalxmY));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmY = 0;
        double sumaMaxTotalxmY = 0;
        double numClusterDBxmY = 0;
        double indiceDBxmY = 0;

        ArrayList arrayTempoYIndiceDBNCxm = new ArrayList();
        ArrayList arrayTempoYIndiceDBNIxm = new ArrayList();
        ArrayList arrayTempoYIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmY = new ArrayList();
        ArrayList sumamaxxmY = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayTempoYIX.size(); i++) {
            arrayTempoYIndiceDBNCxm = xm.extraerNumeroClustersTempoY1(i);
            arrayTempoYIndiceDBNIxm = xm.extraerInstanciasTempoY(i);
            arrayTempoYIndiceDBNC1xm = xm.extraercentroideTempoY(i);
            sumadDBxmY = indDB.distanciaCluster(arrayTempoYIndiceDBNCxm, arrayTempoYIndiceDBNIxm, arrayTempoYIndiceDBNC1xm);
            arraySCKxmY.add(String.valueOf(sumadDBxmY));

        }
        indDB.distanciaSeparacionCluster(arrayTempoYCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmY = indDB.distanciaSeparacionCluster1(arrayTempoYCX, arraySCKxmY);

        for (int i = 0; i < sumamaxxmY.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmY.get(i));
            sumaMaxTotalxmY = sumaMaxTotalxmY + Double.parseDouble((String) sumamaxxmY.get(i));
            numClusterDBxmY = numClusterDBxmY + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmY);

        indiceDBxmY = (1 / numClusterDBxmY) * sumaMaxTotalxmY;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmY);

        guiARecomendar.jTYIndiceDBX.setText(String.valueOf(indiceDBxmY));

        ///////// TEMPO EN Z //////////////////
        /////////// TEMPO EN Z  XMEANS////////////////////////////
        arrayTempoZECX = xm.extraerNumClusterTempoZ();
        arrayTempoZNCX = arrayTempoZECX;
        arrayTempoZECX1 = xm.extraerInstanciasTempoZTodas();
        arrayTempoZNIX = arrayTempoZECX1;

        for (int i = 0; i < arrayTempoZECX.size(); i++) {
            guiARecomendar.areaTempoZECX.append((String) "Cluster " + arrayTempoZECX.get(i) + " Instancia " + arrayTempoZECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN Y /////////     
        arrayTempoZIX = xm.instanciaTempoZ();
        arrayTempoZIpruebaX = arrayTempoZIX;
        for (int i = 0; i < arrayTempoZIX.size(); i++) {
            guiARecomendar.areaTempoZIX.append((String) "[Cluster " + i + "]" + arrayTempoZIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN Y //////////////////              
        arrayTempoZCX = xm.centroideTempoZ();
        arrayTempoZCpruebaX = arrayTempoZCX;
        for (int i = 0; i < arrayTempoZCX.size(); i++) {
            guiARecomendar.areaTempoZCX.append((String) "[Cluster " + i + "]" + arrayTempoZCX.get(i) + " ]" + " \n");
        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoTZX = cal.calcular(arrayTempoZCX);
        for (int i = 0; i < calculoTZX.size(); i++) {
            guiARecomendar.areaTempoZDX.append((String) "[Cluster " + i + "]" + calculoTZX.get(i) + " \n");
        }
        calculoTZ1X = cal.calculoPosision(arrayTempoZCX);
        arrayTempoZTpruebaX = calculoTZ1X;
        for (int i = 0; i < calculoTZ1X.size(); i++) {
            guiARecomendar.areaTempoZDXD.append((String) "[Cluster " + i + "]" + calculoTZ1X.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmZ = 0;
        double sumad1xmZ = 0;
        double cenGeneralxmZ = 0;
        double indiceValidezxmZ = 0;
        double indiceValidez1xmZ = 0;
        double indiceValidezfinalxmZ = 0;
        double numClusterxmZ = 0;
        double numElementosxmZ = 0;

        ArrayList arrayTempoZIndiceXNCxm = new ArrayList();
        ArrayList arrayTempoZIndiceXNIxm = new ArrayList();
        ArrayList arrayTempoZIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayTempoZIX.size(); i++) {
            arrayTempoZIndiceXNCxm = xm.extraerNumeroClustersTempoZ1(i);
            arrayTempoZIndiceXNIxm = xm.extraerInstanciasTempoZ(i);
            arrayTempoZIndiceXCxm = xm.extraercentroideTempoZ(i);
            sumadxmZ = sumadxmZ + indCH.distanciaCluster(arrayTempoZIndiceXNCxm, arrayTempoZIndiceXNIxm, arrayTempoZIndiceXCxm);
        }

        cenGeneralxmZ = indCH.calculoCentroideGeneral(arrayTempoZECX1);
        sumad1xmZ = indCH.distanciaSeparacionCluster(arrayTempoZCX, cenGeneralxmZ, arrayTempoZIX);
        numClusterxmZ = xm.instanciaTempoZ2();
        numElementosxmZ = xm.instanciaTempoZ3();

        indiceValidezxmZ = sumad1xmZ / sumadxmZ;
        indiceValidez1xmZ = (numElementosxmZ - numClusterxmZ) / (numClusterxmZ - 1);
        indiceValidezfinalxmZ = indiceValidezxmZ * indiceValidez1xmZ;
        guiARecomendar.jTZIndiceCHX.setText(String.valueOf(indiceValidezfinalxmZ));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmZ = 0;
        double sumaMaxTotalxmZ = 0;
        double numClusterDBxmZ = 0;
        double indiceDBxmZ = 0;

        ArrayList arrayTempoZIndiceDBNCxm = new ArrayList();
        ArrayList arrayTempoZIndiceDBNIxm = new ArrayList();
        ArrayList arrayTempoZIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmZ = new ArrayList();
        ArrayList sumamaxxmZ = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayTempoZIX.size(); i++) {
            arrayTempoZIndiceDBNCxm = xm.extraerNumeroClustersTempoZ1(i);
            arrayTempoZIndiceDBNIxm = xm.extraerInstanciasTempoZ(i);
            arrayTempoZIndiceDBNC1xm = xm.extraercentroideTempoZ(i);
            sumadDBxmZ = indDB.distanciaCluster(arrayTempoZIndiceDBNCxm, arrayTempoZIndiceDBNIxm, arrayTempoZIndiceDBNC1xm);
            arraySCKxmZ.add(String.valueOf(sumadDBxmZ));

        }
        indDB.distanciaSeparacionCluster(arrayTempoZCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmZ = indDB.distanciaSeparacionCluster1(arrayTempoZCX, arraySCKxmZ);

        for (int i = 0; i < sumamaxxmZ.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmZ.get(i));
            sumaMaxTotalxmZ = sumaMaxTotalxmZ + Double.parseDouble((String) sumamaxxmZ.get(i));
            numClusterDBxmZ = numClusterDBxmZ + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmZ);

        indiceDBxmZ = (1 / numClusterDBxmZ) * sumaMaxTotalxmZ;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmZ);

        guiARecomendar.jTZIndiceDBX.setText(String.valueOf(indiceDBxmZ));

          ////////////////////////////////////////////////////////////////////////////////////////////    
        ////////////////////////////////////////////////////////////////////////////////////////////  
        //////// DURACION EN X ///////////////   
        arrayDuracionXECX = xm1.extraerNumClusterDuracionX();
        arrayDuracionXNCX = arrayDuracionXECX;
        arrayDuracionXECX1 = xm1.extraerInstanciasDuracionXTodas();
        arrayDuracionXNIX = arrayDuracionXECX1;

        for (int i = 0; i < arrayDuracionXECX.size(); i++) {
            guiARecomendar.areaDuracionXECX.append((String) "Cluster " + arrayDuracionXECX.get(i) + " Instancia " + arrayDuracionXECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayDuracionXIX = xm1.instanciaDuracionX();
        arrayDuracionXIpruebaX = arrayDuracionXIX;
        for (int i = 0; i < arrayDuracionXIX.size(); i++) {
            guiARecomendar.areaDuracionXIX.append((String) "[Cluster " + i + "]" + arrayDuracionXIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayDuracionXCX = xm1.centroideDuracionX();
        arrayDuracionXCpruebaX = arrayDuracionXCX;
        for (int i = 0; i < arrayDuracionXCX.size(); i++) {
            guiARecomendar.areaDuracionXCX.append((String) "[Cluster " + i + "]" + arrayDuracionXCX.get(i) + " ]" + " \n");
        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoDXX = cal1.calcular(arrayDuracionXCX);
        for (int i = 0; i < calculoDXX.size(); i++) {
            guiARecomendar.areaDuracionXDX.append((String) "[Cluster " + i + "]" + calculoDXX.get(i) + " \n");
        }
        calculoDX1X = cal1.calculoPosision(arrayDuracionXCX);
        arrayDuracionXTpruebaX = calculoDX1X;
        for (int i = 0; i < calculoDX1X.size(); i++) {
            guiARecomendar.areaDuracionXDDX.append((String) "[Cluster " + i + "]" + calculoDX1X.get(i) + " \n");
        }

                 ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmD = 0;
        double sumad1xmD = 0;
        double cenGeneralxmD = 0;
        double indiceValidezxmD = 0;
        double indiceValidez1xmD = 0;
        double indiceValidezfinalxmD = 0;
        double numClusterxmD = 0;
        double numElementosxmD = 0;

        ArrayList arrayDuracionXIndiceXNCxm = new ArrayList();
        ArrayList arrayDuracionXIndiceXNIxm = new ArrayList();
        ArrayList arrayDuracionXIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayDuracionXIX.size(); i++) {
            arrayDuracionXIndiceXNCxm = xm1.extraerNumeroClustersDuracionX1(i);
            arrayDuracionXIndiceXNIxm = xm1.extraerInstanciasDuracionX(i);
            arrayDuracionXIndiceXCxm = xm1.extraercentroideDuracionX(i);
            sumadxmD = sumadxmD + indCH.distanciaCluster(arrayDuracionXIndiceXNCxm, arrayDuracionXIndiceXNIxm, arrayDuracionXIndiceXCxm);
        }

        cenGeneralxmD = indCH.calculoCentroideGeneral(arrayDuracionXECX1);
        sumad1xmD = indCH.distanciaSeparacionCluster(arrayDuracionXCX, cenGeneralxmD, arrayDuracionXIX);
        numClusterxmD = xm1.instanciaDuracionX2();
        numElementosxmD = xm1.instanciaDuracionX3();

        indiceValidezxmD = sumad1xmD / sumadxmD;
        indiceValidez1xmD = (numElementosxmD - numClusterxmD) / (numClusterxmD - 1);
        indiceValidezfinalxmD = indiceValidezxmD * indiceValidez1xmD;
        guiARecomendar.jDXIndiceCHX.setText(String.valueOf(indiceValidezfinalxmD));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmD = 0;
        double sumaMaxTotalxmD = 0;
        double numClusterDBxmD = 0;
        double indiceDBxmD = 0;

        ArrayList arrayDuracionXIndiceDBNCxm = new ArrayList();
        ArrayList arrayDuracionXIndiceDBNIxm = new ArrayList();
        ArrayList arrayDuracionXIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmD = new ArrayList();
        ArrayList sumamaxxmD = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionXIX.size(); i++) {
            arrayDuracionXIndiceDBNCxm = xm1.extraerNumeroClustersDuracionX1(i);
            arrayDuracionXIndiceDBNIxm = xm1.extraerInstanciasDuracionX(i);
            arrayDuracionXIndiceDBNC1xm = xm1.extraercentroideDuracionX(i);
            sumadDBxmD = indDB.distanciaCluster(arrayDuracionXIndiceDBNCxm, arrayDuracionXIndiceDBNIxm, arrayDuracionXIndiceDBNC1xm);
            arraySCKxmD.add(String.valueOf(sumadDBxmD));

        }
        indDB.distanciaSeparacionCluster(arrayDuracionXCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmD = indDB.distanciaSeparacionCluster1(arrayDuracionXCX, arraySCKxmD);

        for (int i = 0; i < sumamaxxmD.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmD.get(i));
            sumaMaxTotalxmD = sumaMaxTotalxmD + Double.parseDouble((String) sumamaxxmD.get(i));
            numClusterDBxmD = numClusterDBxmD + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmD);

        indiceDBxmD = (1 / numClusterDBxmD) * sumaMaxTotalxmD;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmD);

        guiARecomendar.jDXIndiceDBX.setText(String.valueOf(indiceDBxmD));

         //////// DURACION EN Y //////////////
        arrayDuracionYECX = xm1.extraerNumClusterDuracionY();
        arrayDuracionYNCX = arrayDuracionYECX;
        arrayDuracionYECX1 = xm1.extraerInstanciasDuracionYTodas();
        arrayDuracionYNIX = arrayDuracionYECX1;

        for (int i = 0; i < arrayDuracionYECX.size(); i++) {
            guiARecomendar.areaDuracionYECX.append((String) "Cluster " + arrayDuracionYECX.get(i) + " Instancia " + arrayDuracionYECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayDuracionYIX = xm1.instanciaDuracionY();
        arrayDuracionYIpruebaX = arrayDuracionYIX;
        for (int i = 0; i < arrayDuracionYIX.size(); i++) {
            guiARecomendar.areaDuracionYIX.append((String) "[Cluster " + i + "]" + arrayDuracionYIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayDuracionYCX = xm1.centroideDuracionY();
        arrayDuracionYCpruebaX = arrayDuracionYCX;

        for (int i = 0; i < arrayDuracionYCX.size(); i++) {
            guiARecomendar.areaDuracionYCX.append((String) "[Cluster " + i + "]" + arrayDuracionYCX.get(i) + " ]" + " \n");
        }

        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoDYX = cal1.calcular(arrayDuracionYCX);
        for (int i = 0; i < calculoDYX.size(); i++) {
            guiARecomendar.areaDuracionYDX.append((String) "[Cluster " + i + "]" + calculoDYX.get(i) + " \n");
        }
        calculoDY1X = cal1.calculoPosision(arrayDuracionYCX);
        arrayDuracionYTpruebaX = calculoDY1X;
        for (int i = 0; i < calculoDY1X.size(); i++) {
            guiARecomendar.areaDuracionYDDX.append((String) "[Cluster " + i + "]" + calculoDY1X.get(i) + " \n");
        }

                      ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmYD = 0;
        double sumad1xmYD = 0;
        double cenGeneralxmYD = 0;
        double indiceValidezxmYD = 0;
        double indiceValidez1xmYD = 0;
        double indiceValidezfinalxmYD = 0;
        double numClusterxmYD = 0;
        double numElementosxmYD = 0;

        ArrayList arrayDuracionYIndiceXNCxm = new ArrayList();
        ArrayList arrayDuracionYIndiceXNIxm = new ArrayList();
        ArrayList arrayDuracionYIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayDuracionYIX.size(); i++) {
            arrayDuracionYIndiceXNCxm = xm1.extraerNumeroClustersDuracionY1(i);
            arrayDuracionYIndiceXNIxm = xm1.extraerInstanciasDuracionY(i);
            arrayDuracionYIndiceXCxm = xm1.extraercentroideDuracionY(i);
            sumadxmYD = sumadxmYD + indCH.distanciaCluster(arrayDuracionYIndiceXNCxm, arrayDuracionYIndiceXNIxm, arrayDuracionYIndiceXCxm);
        }

        cenGeneralxmYD = indCH.calculoCentroideGeneral(arrayDuracionYECX1);
        sumad1xmYD = indCH.distanciaSeparacionCluster(arrayDuracionYCX, cenGeneralxmYD, arrayDuracionYIX);
        numClusterxmYD = xm1.instanciaDuracionY2();
        numElementosxmYD = xm1.instanciaDuracionY3();

        indiceValidezxmYD = sumad1xmYD / sumadxmYD;
        indiceValidez1xmYD = (numElementosxmYD - numClusterxmYD) / (numClusterxmYD - 1);
        indiceValidezfinalxmYD = indiceValidezxmYD * indiceValidez1xmYD;
        guiARecomendar.jDYIndiceCHX.setText(String.valueOf(indiceValidezfinalxmYD));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmYD = 0;
        double sumaMaxTotalxmYD = 0;
        double numClusterDBxmYD = 0;
        double indiceDBxmYD = 0;

        ArrayList arrayDuracionYIndiceDBNCxm = new ArrayList();
        ArrayList arrayDuracionYIndiceDBNIxm = new ArrayList();
        ArrayList arrayDuracionYIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmYD = new ArrayList();
        ArrayList sumamaxxmYD = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionYIX.size(); i++) {
            arrayDuracionYIndiceDBNCxm = xm1.extraerNumeroClustersDuracionY1(i);
            arrayDuracionYIndiceDBNIxm = xm1.extraerInstanciasDuracionY(i);
            arrayDuracionYIndiceDBNC1xm = xm1.extraercentroideDuracionY(i);
            sumadDBxmYD = indDB.distanciaCluster(arrayDuracionYIndiceDBNCxm, arrayDuracionYIndiceDBNIxm, arrayDuracionYIndiceDBNC1xm);
            arraySCKxmYD.add(String.valueOf(sumadDBxmYD));

        }
        indDB.distanciaSeparacionCluster(arrayDuracionYCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmYD = indDB.distanciaSeparacionCluster1(arrayDuracionYCX, arraySCKxmYD);

        for (int i = 0; i < sumamaxxmYD.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmYD.get(i));
            sumaMaxTotalxmYD = sumaMaxTotalxmYD + Double.parseDouble((String) sumamaxxmYD.get(i));
            numClusterDBxmYD = numClusterDBxmYD + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmYD);

        indiceDBxmYD = (1 / numClusterDBxmYD) * sumaMaxTotalxmYD;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmYD);

        guiARecomendar.jDYIndiceDBX.setText(String.valueOf(indiceDBxmYD));

          //////// DURACION EN Z //////////////
        arrayDuracionZECX = xm1.extraerNumClusterDuracionZ();
        arrayDuracionZNCX = arrayDuracionZECX;
        arrayDuracionZECX1 = xm1.extraerInstanciasDuracionZTodas();
        arrayDuracionZNIX = arrayDuracionZECX1;

        for (int i = 0; i < arrayDuracionZECX.size(); i++) {
            guiARecomendar.areaDuracionZECX.append((String) "Cluster " + arrayDuracionZECX.get(i) + " Instancia " + arrayDuracionZECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayDuracionZIX = xm1.instanciaDuracionZ();
        arrayDuracionZIpruebaX = arrayDuracionZIX;
        for (int i = 0; i < arrayDuracionZIX.size(); i++) {
            guiARecomendar.areaDuracionZIX.append((String) "[Cluster " + i + "]" + arrayDuracionZIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayDuracionZCX = xm1.centroideDuracionZ();
        arrayDuracionZCpruebaX = arrayDuracionZCX;
        for (int i = 0; i < arrayDuracionZCX.size(); i++) {
            guiARecomendar.areaDuracionZCX.append((String) "[Cluster " + i + "]" + arrayDuracionZCX.get(i) + " ]" + " \n");
        }

        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoDZX = cal1.calcular(arrayDuracionZCX);
        for (int i = 0; i < calculoDZX.size(); i++) {
            guiARecomendar.areaDuracionZDX.append((String) "[Cluster " + i + "]" + calculoDZX.get(i) + " \n");
        }
        calculoDZ1X = cal1.calculoPosision(arrayDuracionZCX);
        arrayDuracionZTpruebaX = calculoDZ1X;
        for (int i = 0; i < calculoDZ1X.size(); i++) {
            guiARecomendar.areaDuracionZDDX.append((String) "[Cluster " + i + "]" + calculoDZ1X.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmZD = 0;
        double sumad1xmZD = 0;
        double cenGeneralxmZD = 0;
        double indiceValidezxmZD = 0;
        double indiceValidez1xmZD = 0;
        double indiceValidezfinalxmZD = 0;
        double numClusterxmZD = 0;
        double numElementosxmZD = 0;

        ArrayList arrayDuracionZIndiceXNCxm = new ArrayList();
        ArrayList arrayDuracionZIndiceXNIxm = new ArrayList();
        ArrayList arrayDuracionZIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayDuracionZIX.size(); i++) {
            arrayDuracionZIndiceXNCxm = xm1.extraerNumeroClustersDuracionZ1(i);
            arrayDuracionZIndiceXNIxm = xm1.extraerInstanciasDuracionZ(i);
            arrayDuracionZIndiceXCxm = xm1.extraercentroideDuracionZ(i);
            sumadxmZD = sumadxmZD + indCH.distanciaCluster(arrayDuracionZIndiceXNCxm, arrayDuracionZIndiceXNIxm, arrayDuracionZIndiceXCxm);
        }

        cenGeneralxmZD = indCH.calculoCentroideGeneral(arrayDuracionZECX1);
        sumad1xmZD = indCH.distanciaSeparacionCluster(arrayDuracionZCX, cenGeneralxmZD, arrayDuracionZIX);
        numClusterxmZD = xm1.instanciaDuracionZ2();
        numElementosxmZD = xm1.instanciaDuracionZ3();

        indiceValidezxmZD = sumad1xmZD / sumadxmZD;
        indiceValidez1xmZD = (numElementosxmZD - numClusterxmZD) / (numClusterxmZD - 1);
        indiceValidezfinalxmZD = indiceValidezxmZD * indiceValidez1xmZD;
        guiARecomendar.jDZIndiceCHX.setText(String.valueOf(indiceValidezfinalxmZD));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmZD = 0;
        double sumaMaxTotalxmZD = 0;
        double numClusterDBxmZD = 0;
        double indiceDBxmZD = 0;

        ArrayList arrayDuracionZIndiceDBNCxm = new ArrayList();
        ArrayList arrayDuracionZIndiceDBNIxm = new ArrayList();
        ArrayList arrayDuracionZIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmZD = new ArrayList();
        ArrayList sumamaxxmZD = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionZIX.size(); i++) {
            arrayDuracionZIndiceDBNCxm = xm1.extraerNumeroClustersDuracionZ1(i);
            arrayDuracionZIndiceDBNIxm = xm1.extraerInstanciasDuracionZ(i);
            arrayDuracionZIndiceDBNC1xm = xm1.extraercentroideDuracionZ(i);
            sumadDBxmZD = indDB.distanciaCluster(arrayDuracionZIndiceDBNCxm, arrayDuracionZIndiceDBNIxm, arrayDuracionZIndiceDBNC1xm);
            arraySCKxmZD.add(String.valueOf(sumadDBxmZD));

        }
        indDB.distanciaSeparacionCluster(arrayDuracionZCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmZD = indDB.distanciaSeparacionCluster1(arrayDuracionZCX, arraySCKxmZD);

        for (int i = 0; i < sumamaxxmZD.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmZD.get(i));
            sumaMaxTotalxmZD = sumaMaxTotalxmZD + Double.parseDouble((String) sumamaxxmZD.get(i));
            numClusterDBxmZD = numClusterDBxmZD + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmZD);

        indiceDBxmZD = (1 / numClusterDBxmZD) * sumaMaxTotalxmZD;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmZD);

        guiARecomendar.jDZIndiceDBX.setText(String.valueOf(indiceDBxmZD));

 ////////////////////////////////////////////// OCTAVAS /////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        arrayOctavaXECX = xm2.extraerNumClusterOctavaX();
        arrayOctavaXNCX = arrayOctavaXECX;
        arrayOctavaXECX1 = xm2.extraerInstanciasOctavaXTodas();
        arrayOctavaXNIX = arrayOctavaXECX1;

        for (int i = 0; i < arrayOctavaXECX.size(); i++) {
            guiARecomendar.areaOctavaXECX.append((String) "Cluster " + arrayOctavaXECX.get(i) + " Instancia " + arrayOctavaXECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayOctavaXIX = xm2.instanciaOctavaX();
        arrayOctavaXIpruebaX = arrayOctavaXIX;
        for (int i = 0; i < arrayOctavaXIX.size(); i++) {
            guiARecomendar.areaOctavaXIX.append((String) "[Cluster " + i + "]" + arrayOctavaXIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayOctavaXCX = xm2.centroideOctavaX();
        arrayOctavaXCpruebaX = arrayOctavaXCX;
        for (int i = 0; i < arrayOctavaXCX.size(); i++) {
            guiARecomendar.areaOctavaXCX.append((String) "[Cluster " + i + "]" + arrayOctavaXCX.get(i) + " ]" + " \n");
        }
            ///////// CALCULOS DE DISTANCIA ////////////////////////////

        calculoOX1X = cal2.calculoPosision(arrayOctavaXCX);
        arrayOctavaXTpruebaX = calculoOX1X;
        for (int i = 0; i < calculoOX1X.size(); i++) {
            guiARecomendar.areaOctavaXTX.append((String) "[Cluster " + i + "]" + calculoOX1X.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmO = 0;
        double sumad1xmO = 0;
        double cenGeneralxmO = 0;
        double indiceValidezxmO = 0;
        double indiceValidez1xmO = 0;
        double indiceValidezfinalxmO = 0;
        double numClusterxmO = 0;
        double numElementosxmO = 0;

        ArrayList arrayOctavaXIndiceXNCxm = new ArrayList();
        ArrayList arrayOctavaXIndiceXNIxm = new ArrayList();
        ArrayList arrayOctavaXIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayOctavaXIX.size(); i++) {
            arrayOctavaXIndiceXNCxm = xm2.extraerNumeroClustersOctavaX1(i);
            arrayOctavaXIndiceXNIxm = xm2.extraerInstanciasOctavaX(i);
            arrayOctavaXIndiceXCxm = xm2.extraercentroideOctavaX(i);
            sumadxmO = sumadxmO + indCH.distanciaCluster(arrayOctavaXIndiceXNCxm, arrayOctavaXIndiceXNIxm, arrayOctavaXIndiceXCxm);
        }

        cenGeneralxmO = indCH.calculoCentroideGeneral(arrayOctavaXECX1);
        sumad1xmO = indCH.distanciaSeparacionCluster(arrayOctavaXCX, cenGeneralxmO, arrayOctavaXIX);
        numClusterxmO = xm2.instanciaOctavaX2();
        numElementosxmO = xm2.instanciaOctavaX3();

        indiceValidezxmO = sumad1xmO / sumadxmO;
        indiceValidez1xmO = (numElementosxmO - numClusterxmO) / (numClusterxmO - 1);
        indiceValidezfinalxmO = indiceValidezxmO * indiceValidez1xmO;
        guiARecomendar.jOXIndiceCHX.setText(String.valueOf(indiceValidezfinalxmO));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmO = 0;
        double sumaMaxTotalxmO = 0;
        double numClusterDBxmO = 0;
        double indiceDBxmO = 0;

        ArrayList arrayOctavaXIndiceDBNCxm = new ArrayList();
        ArrayList arrayOctavaXIndiceDBNIxm = new ArrayList();
        ArrayList arrayOctavaXIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmO = new ArrayList();
        ArrayList sumamaxxmO = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaXIX.size(); i++) {
            arrayOctavaXIndiceDBNCxm = xm2.extraerNumeroClustersOctavaX1(i);
            arrayOctavaXIndiceDBNIxm = xm2.extraerInstanciasOctavaX(i);
            arrayOctavaXIndiceDBNC1xm = xm2.extraercentroideOctavaX(i);
            sumadDBxmO = indDB.distanciaCluster(arrayOctavaXIndiceDBNCxm, arrayOctavaXIndiceDBNIxm, arrayOctavaXIndiceDBNC1xm);
            arraySCKxmO.add(String.valueOf(sumadDBxmO));

        }
        indDB.distanciaSeparacionCluster(arrayOctavaXCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmO = indDB.distanciaSeparacionCluster1(arrayOctavaXCX, arraySCKxmO);

        for (int i = 0; i < sumamaxxmO.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmO.get(i));
            sumaMaxTotalxmO = sumaMaxTotalxmO + Double.parseDouble((String) sumamaxxmO.get(i));
            numClusterDBxmO = numClusterDBxmO + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmO);

        indiceDBxmO = (1 / numClusterDBxmO) * sumaMaxTotalxmO;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmO);

        guiARecomendar.jOXIndiceDBX.setText(String.valueOf(indiceDBxmO));

    ///////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////
        arrayOctavaYECX = xm2.extraerNumClusterOctavaY();
        arrayOctavaYNCX = arrayOctavaYECX;
        arrayOctavaYECX1 = xm2.extraerInstanciasOctavaYTodas();
        arrayOctavaYNIX = arrayOctavaYECX1;

        for (int i = 0; i < arrayOctavaYECX.size(); i++) {
            guiARecomendar.areaOctavaYECX.append((String) "Cluster " + arrayOctavaYECX.get(i) + " Instancia " + arrayOctavaYECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayOctavaYIX = xm2.instanciaOctavaY();
        arrayOctavaYIpruebaX = arrayOctavaYIX;
        for (int i = 0; i < arrayOctavaYIX.size(); i++) {
            guiARecomendar.areaOctavaYIX.append((String) "[Cluster " + i + "]" + arrayOctavaYIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayOctavaYCX = xm2.centroideOctavaY();
        arrayOctavaYCpruebaX = arrayOctavaYCX;
        for (int i = 0; i < arrayOctavaYCX.size(); i++) {
            guiARecomendar.areaOctavaYCX.append((String) "[Cluster " + i + "]" + arrayOctavaYCX.get(i) + " ]" + " \n");
        }
            ///////// CALCULOS DE DISTANCIA ////////////////////////////

        calculoOY1X = cal2.calculoPosision(arrayOctavaYCX);
        arrayOctavaYTpruebaX = calculoOY1X;
        for (int i = 0; i < calculoOY1X.size(); i++) {
            guiARecomendar.areaOctavaYTX.append((String) "[Cluster " + i + "]" + calculoOY1X.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmYO = 0;
        double sumad1xmYO = 0;
        double cenGeneralxmYO = 0;
        double indiceValidezxmYO = 0;
        double indiceValidez1xmYO = 0;
        double indiceValidezfinalxmYO = 0;
        double numClusterxmYO = 0;
        double numElementosxmYO = 0;

        ArrayList arrayOctavaYIndiceXNCxm = new ArrayList();
        ArrayList arrayOctavaYIndiceXNIxm = new ArrayList();
        ArrayList arrayOctavaYIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayOctavaYIX.size(); i++) {
            arrayOctavaYIndiceXNCxm = xm2.extraerNumeroClustersOctavaY1(i);
            arrayOctavaYIndiceXNIxm = xm2.extraerInstanciasOctavaY(i);
            arrayOctavaYIndiceXCxm = xm2.extraercentroideOctavaY(i);
            sumadxmYO = sumadxmYO + indCH.distanciaCluster(arrayOctavaYIndiceXNCxm, arrayOctavaYIndiceXNIxm, arrayOctavaYIndiceXCxm);
        }

        cenGeneralxmYO = indCH.calculoCentroideGeneral(arrayOctavaYECX1);
        sumad1xmYO = indCH.distanciaSeparacionCluster(arrayOctavaYCX, cenGeneralxmYO, arrayOctavaYIX);
        numClusterxmYO = xm2.instanciaOctavaY2();
        numElementosxmYO = xm2.instanciaOctavaY3();

        indiceValidezxmYO = sumad1xmYO / sumadxmYO;
        indiceValidez1xmYO = (numElementosxmYO - numClusterxmYO) / (numClusterxmYO - 1);
        indiceValidezfinalxmYO = indiceValidezxmYO * indiceValidez1xmYO;
        guiARecomendar.jOYIndiceCHX.setText(String.valueOf(indiceValidezfinalxmYO));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmYO = 0;
        double sumaMaxTotalxmYO = 0;
        double numClusterDBxmYO = 0;
        double indiceDBxmYO = 0;

        ArrayList arrayOctavaYIndiceDBNCxm = new ArrayList();
        ArrayList arrayOctavaYIndiceDBNIxm = new ArrayList();
        ArrayList arrayOctavaYIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmYO = new ArrayList();
        ArrayList sumamaxxmYO = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaYIX.size(); i++) {
            arrayOctavaYIndiceDBNCxm = xm2.extraerNumeroClustersOctavaY1(i);
            arrayOctavaYIndiceDBNIxm = xm2.extraerInstanciasOctavaY(i);
            arrayOctavaYIndiceDBNC1xm = xm2.extraercentroideOctavaY(i);
            sumadDBxmYO = indDB.distanciaCluster(arrayOctavaYIndiceDBNCxm, arrayOctavaYIndiceDBNIxm, arrayOctavaYIndiceDBNC1xm);
            arraySCKxmYO.add(String.valueOf(sumadDBxmYO));

        }
        indDB.distanciaSeparacionCluster(arrayOctavaYCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmYO = indDB.distanciaSeparacionCluster1(arrayOctavaYCX, arraySCKxmYO);

        for (int i = 0; i < sumamaxxmYO.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmYO.get(i));
            sumaMaxTotalxmYO = sumaMaxTotalxmYO + Double.parseDouble((String) sumamaxxmYO.get(i));
            numClusterDBxmYO = numClusterDBxmYO + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmYO);

        indiceDBxmYO = (1 / numClusterDBxmYO) * sumaMaxTotalxmYO;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmYO);

        guiARecomendar.jOYIndiceDBX.setText(String.valueOf(indiceDBxmYO));

       /////////////////////////////////////////////////////////////////////////////////////////
        arrayOctavaZECX = xm2.extraerNumClusterOctavaZ();
        arrayOctavaZNCX = arrayOctavaZECX;
        arrayOctavaZECX1 = xm2.extraerInstanciasOctavaZTodas();
        arrayOctavaZNIX = arrayOctavaZECX1;

        for (int i = 0; i < arrayOctavaZECX.size(); i++) {
            guiARecomendar.areaOctavaZECX.append((String) "Cluster " + arrayOctavaZECX.get(i) + " Instancia " + arrayOctavaZECX1.get(i) + " \n");
        }

        /////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayOctavaZIX = xm2.instanciaOctavaZ();
        arrayOctavaZIpruebaX = arrayOctavaZIX;
        for (int i = 0; i < arrayOctavaZIX.size(); i++) {
            guiARecomendar.areaOctavaZIX.append((String) "[Cluster " + i + "]" + arrayOctavaZIX.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////              
        arrayOctavaZCX = xm2.centroideOctavaZ();
        arrayOctavaZCpruebaX = arrayOctavaZCX;
        for (int i = 0; i < arrayOctavaZCX.size(); i++) {
            guiARecomendar.areaOctavaZCX.append((String) "[Cluster " + i + "]" + arrayOctavaZCX.get(i) + " ]" + " \n");
        }
            ///////// CALCULOS DE DISTANCIA ////////////////////////////

        calculoOZ1X = cal2.calculoPosision(arrayOctavaZCX);
        arrayOctavaZTpruebaX = calculoOZ1X;
        for (int i = 0; i < calculoOZ1X.size(); i++) {
            guiARecomendar.areaOctavaZTX.append((String) "[Cluster " + i + "]" + calculoOZ1X.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadxmZO = 0;
        double sumad1xmZO = 0;
        double cenGeneralxmZO = 0;
        double indiceValidezxmZO = 0;
        double indiceValidez1xmZO = 0;
        double indiceValidezfinalxmZO = 0;
        double numClusterxmZO = 0;
        double numElementosxmZO = 0;

        ArrayList arrayOctavaZIndiceXNCxm = new ArrayList();
        ArrayList arrayOctavaZIndiceXNIxm = new ArrayList();
        ArrayList arrayOctavaZIndiceXCxm = new ArrayList();

        for (int i = 0; i < arrayOctavaZIX.size(); i++) {
            arrayOctavaZIndiceXNCxm = xm2.extraerNumeroClustersOctavaZ1(i);
            arrayOctavaZIndiceXNIxm = xm2.extraerInstanciasOctavaZ(i);
            arrayOctavaZIndiceXCxm = xm2.extraercentroideOctavaZ(i);
            sumadxmZO = sumadxmZO + indCH.distanciaCluster(arrayOctavaZIndiceXNCxm, arrayOctavaZIndiceXNIxm, arrayOctavaZIndiceXCxm);
        }

        cenGeneralxmZO = indCH.calculoCentroideGeneral(arrayOctavaZECX1);
        sumad1xmZO = indCH.distanciaSeparacionCluster(arrayOctavaZCX, cenGeneralxmZO, arrayOctavaZIX);
        numClusterxmZO = xm2.instanciaOctavaZ2();
        numElementosxmZO = xm2.instanciaOctavaZ3();

        indiceValidezxmZO = sumad1xmZO / sumadxmZO;
        indiceValidez1xmZO = (numElementosxmZO - numClusterxmZO) / (numClusterxmZO - 1);
        indiceValidezfinalxmZO = indiceValidezxmZO * indiceValidez1xmZO;
        guiARecomendar.jOZIndiceCHX.setText(String.valueOf(indiceValidezfinalxmZO));

         //////////////////////////////////////////////////////////////////////////////////////////////////
                 //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBxmZO = 0;
        double sumaMaxTotalxmZO = 0;
        double numClusterDBxmZO = 0;
        double indiceDBxmZO = 0;

        ArrayList arrayOctavaZIndiceDBNCxm = new ArrayList();
        ArrayList arrayOctavaZIndiceDBNIxm = new ArrayList();
        ArrayList arrayOctavaZIndiceDBNC1xm = new ArrayList();
        ArrayList arraySCKxmZO = new ArrayList();
        ArrayList sumamaxxmZO = new ArrayList();

                  //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaZIX.size(); i++) {
            arrayOctavaZIndiceDBNCxm = xm2.extraerNumeroClustersOctavaZ1(i);
            arrayOctavaZIndiceDBNIxm = xm2.extraerInstanciasOctavaZ(i);
            arrayOctavaZIndiceDBNC1xm = xm2.extraercentroideOctavaZ(i);
            sumadDBxmZO = indDB.distanciaCluster(arrayOctavaZIndiceDBNCxm, arrayOctavaZIndiceDBNIxm, arrayOctavaZIndiceDBNC1xm);
            arraySCKxmZO.add(String.valueOf(sumadDBxmZO));

        }
        indDB.distanciaSeparacionCluster(arrayOctavaZCX);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        sumamaxxmZO = indDB.distanciaSeparacionCluster1(arrayOctavaZCX, arraySCKxmZO);

        for (int i = 0; i < sumamaxxmZO.size(); i++) {
            System.out.println("La distancia maxima " + i + " es: " + sumamaxxmZO.get(i));
            sumaMaxTotalxmZO = sumaMaxTotalxmZO + Double.parseDouble((String) sumamaxxmZO.get(i));
            numClusterDBxmZO = numClusterDBxmZO + 1;
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalxmZO);

        indiceDBxmZO = (1 / numClusterDBxmZO) * sumaMaxTotalxmZO;

        System.out.println("El indice Davies Bouldin es:  " + indiceDBxmZO);

        guiARecomendar.jOZIndiceDBX.setText(String.valueOf(indiceDBxmZO));

       ////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("He Terminado con Xmeans ...");
        System.out.println("////////////////////////////////////////////////////    Iniciare el proceso con EM   ////////////////////////////////////////////////////////////////");

        AEM aem = new AEM(10, 3000, emocion3);
        aem.EntrenarCluster();
        AEM aem1 = new AEM(5, 3000, emocion3);
        aem1.EntrenarCluster();

        AEM aem2 = new AEM(11, 3000, emocion3);
        aem2.EntrenarCluster();

        ArrayList arrayTempoXECEM = new ArrayList();
        ArrayList arrayTempoXECEM1 = new ArrayList();
        ArrayList arrayTempoXIEM = new ArrayList();
        ArrayList arrayTempoXCEM = new ArrayList();
        ArrayList arrayTempoYECEM = new ArrayList();
        ArrayList arrayTempoYECEM1 = new ArrayList();
        ArrayList arrayTempoYIEM = new ArrayList();
        ArrayList arrayTempoYCEM = new ArrayList();
        ArrayList arrayTempoZECEM = new ArrayList();
        ArrayList arrayTempoZECEM1 = new ArrayList();
        ArrayList arrayTempoZIEM = new ArrayList();
        ArrayList arrayTempoZCEM = new ArrayList();

        double numClusterEM = 0;
        double numElementosEM = 0;
        double numClusterEMY = 0;
        double numElementosEMY = 0;
        double numClusterEMZ = 0;
        double numElementosEMZ = 0;

        ArrayList calculoTXEM = new ArrayList();
        ArrayList calculoTXEM1 = new ArrayList();
        ArrayList calculoTYEM = new ArrayList();
        ArrayList calculoTYEM1 = new ArrayList();
        ArrayList calculoTZEM = new ArrayList();
        ArrayList calculoTZEM1 = new ArrayList();

        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayTempoXECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayTempoXECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayTempoXECEM2 = new ArrayList(); // instancias bandera

        int myArrayTX[][];

        /////////// TEMPO EN EM X ////////////////////////////
        int contEM = -1;
        for (int i = 0; i < 10; i++) {
            // System.out.println("Cluster " + i);
            banarrayTempoXECEM1 = aem.extraerInstanciasTempoX(i);
            if (!(banarrayTempoXECEM1.isEmpty())) {
                contEM = contEM + 1;
                for (int j = 0; j < banarrayTempoXECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayTempoXECEM1.add(String.valueOf(contEM));
                    finalarrayTempoXECEM2.add(banarrayTempoXECEM1.get(j).toString());
                }
            }
        }
        for (int i = 0; i < finalarrayTempoXECEM1.size(); i++) {
            System.out.println(finalarrayTempoXECEM1.get(i) + "," + finalarrayTempoXECEM2.get(i));
        }

        myArrayTX = new int[finalarrayTempoXECEM1.size()][2];

        for (int k = 0; k < finalarrayTempoXECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayTX[k][0] = Integer.parseInt(finalarrayTempoXECEM1.get(k).toString());
            myArrayTX[k][1] = Integer.parseInt(finalarrayTempoXECEM2.get(k).toString());
        }

                  // Intanciamos Arreglos Duración
        /////////// TEMPO EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayTempoXECEM = finalarrayTempoXECEM1; // Estrae numero de cluster
        arrayTempoXNCEM = arrayTempoXECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayTempoXECEM1 = finalarrayTempoXECEM2;
        arrayTempoXNIEM = arrayTempoXECEM1;

        for (int i = 0; i < arrayTempoXECEM.size(); i++) {
            guiARecomendar.areaTempoXECEM.append((String) "Cluster " + arrayTempoXECEM.get(i) + " Instancia " + arrayTempoXECEM1.get(i) + " \n");
        }
        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayTempoXIEM = aem.instanciaTempoX();
        arrayTempoXIpruebaEM = arrayTempoXIEM;
        for (int i = 0; i < arrayTempoXIEM.size(); i++) {
            guiARecomendar.areaTempoXIEM.append((String) "[Cluster " + i + "]" + arrayTempoXIEM.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X //////////////////
        arrayTempoXCEM = aem.centroideTempoX();
        arrayTempoXCpruebaEM = arrayTempoXCEM;
        for (int i = 0; i < arrayTempoXCEM.size(); i++) {
            guiARecomendar.areaTempoXCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayTempoXCEM.get(i) + " ]" + " \n");
            numClusterEM = i;
        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoTXEM = cal.calcular(arrayTempoXCEM);
        // for (int i = 0; i < 10; i++)
        for (int i = 0; i < calculoTXEM.size(); i++) {
            guiARecomendar.areaTempoXDEM.append((String) "[Cluster " + i + "]" + calculoTXEM.get(i) + " \n");
        }
        calculoTXEM1 = cal.calculoPosision(arrayTempoXCEM);
        arrayTempoXTpruebaEM = calculoTXEM1;
        for (int i = 0; i < calculoTXEM1.size(); i++) {
            guiARecomendar.areaTempoXTEM.append((String) "[Cluster " + i + "]" + calculoTXEM1.get(i) + " \n");
        }
                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEM = 0;
        double sumad1EM = 0;
        double cenGeneralEM = 0;
        double indiceValidezEM = 0;
        double indiceValidez1EM = 0;
        double indiceValidezfinalEM = 0;
        int conta = 0;
        ArrayList arrayTempoXIndiceXNCEM = new ArrayList();
        ArrayList arrayTempoXIndiceXNIEM = new ArrayList();
        ArrayList arrayTempoXIndiceXCEM = new ArrayList();

        for (int i = 0; i < arrayTempoXIEM.size(); i++) {
            conta = conta + 1;

            arrayTempoXIndiceXNCEM = aem.extraerNumeroClustersTempoX1(i); // Estraer numero de clusert
            arrayTempoXIndiceXNIEM = aem.extraerInstanciasTempoXN(i, myArrayTX); // Extraer numero de lcuster
            arrayTempoXIndiceXCEM = aem.extraerCentroideTempoXN(i, myArrayTX); // Extraer centroide de acuerdo a bandera

            sumadEM = sumadEM + indCH.distanciaCluster(arrayTempoXIndiceXNCEM, arrayTempoXIndiceXNIEM, arrayTempoXIndiceXCEM);

        }
        System.out.println("Cluster /////////////////////////////////////////////////// " + conta);

        cenGeneralEM = indCH.calculoCentroideGeneral(arrayTempoXECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEM);
        sumad1EM = indCH.distanciaSeparacionCluster(arrayTempoXCEM, cenGeneralEM, arrayTempoXIEM);
        numClusterEM = numClusterEM + 1;
        numElementosEM = aem.instanciaTempoX3();
        indiceValidezEM = sumad1EM / sumadEM;
        System.out.println("Sumad1 " + sumad1EM + "/" + "Sumad " + sumadEM);
        indiceValidez1EM = (numElementosEM - numClusterEM) / (numClusterEM - 1);
        System.out.println("Numero de Elementos:" + numElementosEM + "-" + "Num Cluestr " + numClusterEM + " - " + " Num Elementos " + numElementosEM + " / " + numClusterEM + " - 1");
        System.out.println("1er " + indiceValidez1EM);
        System.out.println("2do " + indiceValidezEM);
        indiceValidezfinalEM = indiceValidezEM * indiceValidez1EM;
        guiARecomendar.jTXIndiceCHEM.setText(String.valueOf(indiceValidezfinalEM));
        System.out.println("Calinsky Harabaz " + indiceValidezfinalEM);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEM = 0;
        double sumaMaxTotalEM = 0;
        double numClusterDBEM = 0;
        double indiceDBEM = 0;
        double sumaMaximos = 0;

        ArrayList arrayTempoXIndiceDBNCEM = new ArrayList();
        ArrayList arrayTempoXIndiceDBNIEM = new ArrayList();
        ArrayList arrayTempoXIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEM = new ArrayList();
        ArrayList sumamaxEM = new ArrayList();

        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayTempoXIEM.size(); i++) {
            arrayTempoXIndiceDBNCEM = aem.extraerNumeroClustersTempoX1(i);
            arrayTempoXIndiceDBNIEM = aem.extraerInstanciasTempoXN(i, myArrayTX);
            arrayTempoXIndiceDBNC1EM = aem.extraerCentroideTempoXN(i, myArrayTX);
            sumadDBEM = indDB.distanciaCluster(arrayTempoXIndiceDBNCEM, arrayTempoXIndiceDBNIEM, arrayTempoXIndiceDBNC1EM);
            arraySCKEM.add(String.valueOf(sumadDBEM));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayTempoXCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEM = indDB.distanciaSeparacionCluster1(arrayTempoXCEM, arraySCKEM);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEM.size(); i++) {
            sumaMaximos = Double.parseDouble((String) sumamaxEM.get(i));

            if (Double.isNaN(sumaMaximos) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximos);
                sumaMaxTotalEM = sumaMaxTotalEM + Double.parseDouble((String) sumamaxEM.get(i));
                numClusterDBEM = numClusterDBEM + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEM);
        System.out.println("Numero de cLUSTER " + numClusterDBEM);
        indiceDBEM = (1 / numClusterDBEM) * sumaMaxTotalEM;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEM);
        guiARecomendar.jTXIndiceDBEM.setText(String.valueOf(indiceDBEM));

              ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
       /////////// TEMPO EN EM Y ////////////////////////////
        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayTempoYECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayTempoYECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayTempoYECEM2 = new ArrayList(); // instancias bandera

        int myArrayTY[][];

        /////////// TEMPO EN EM X ////////////////////////////
        int contEMY = -1;
        for (int i = 0; i < 10; i++) {
            // System.out.println("Cluster " + i);
            banarrayTempoYECEM1 = aem.extraerInstanciasTempoY(i);
            if (!(banarrayTempoYECEM1.isEmpty())) {
                contEMY = contEMY + 1;
                for (int j = 0; j < banarrayTempoYECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayTempoYECEM1.add(String.valueOf(contEMY));
                    finalarrayTempoYECEM2.add(banarrayTempoYECEM1.get(j).toString());
                }
            }
        }

        myArrayTY = new int[finalarrayTempoYECEM1.size()][2];

        for (int k = 0; k < finalarrayTempoYECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayTY[k][0] = Integer.parseInt(finalarrayTempoYECEM1.get(k).toString());
            myArrayTY[k][1] = Integer.parseInt(finalarrayTempoYECEM2.get(k).toString());
        }

                  // Intanciamos Arreglos Duración
        /////////// TEMPO EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayTempoYECEM = finalarrayTempoYECEM1; // Estrae numero de cluster
        arrayTempoYNCEM = arrayTempoYECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayTempoYECEM1 = finalarrayTempoYECEM2;
        arrayTempoYNIEM = arrayTempoYECEM1;

        for (int i = 0; i < arrayTempoYECEM.size(); i++) {
            guiARecomendar.areaTempoYECEM.append((String) "Cluster " + arrayTempoYECEM.get(i) + " Instancia " + arrayTempoYECEM1.get(i) + " \n");
        }

        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayTempoYIEM = aem.instanciaTempoY();
        arrayTempoYIpruebaEM = arrayTempoYIEM;
        for (int i = 0; i < arrayTempoYIEM.size(); i++) {
            guiARecomendar.areaTempoYIEM.append((String) "[Cluster " + i + "]" + arrayTempoYIEM.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X ////////////////// 
        arrayTempoYCEM = aem.centroideTempoY();
        arrayTempoYCpruebaEM = arrayTempoYCEM;
        for (int i = 0; i < arrayTempoYCEM.size(); i++) {
            guiARecomendar.areaTempoYCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayTempoYCEM.get(i) + " ]" + " \n");

            numClusterEMY = i;

        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoTYEM = cal.calcular(arrayTempoYCEM);
        // for (int i = 0; i < 10; i++)
        for (int i = 0; i < calculoTYEM.size(); i++) {
            guiARecomendar.areaTempoYDEM.append((String) "[Cluster " + i + "]" + calculoTYEM.get(i) + " \n");
        }
        calculoTYEM1 = cal.calculoPosision(arrayTempoYCEM);
        arrayTempoYTpruebaEM = calculoTYEM1;
        for (int i = 0; i < calculoTYEM1.size(); i++) {
            guiARecomendar.areaTempoYTEM.append((String) "[Cluster " + i + "]" + calculoTYEM1.get(i) + " \n");
        }
                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMY = 0;
        double sumad1EMY = 0;
        double cenGeneralEMY = 0;
        double indiceValidezEMY = 0;
        double indiceValidez1EMY = 0;
        double indiceValidezfinalEMY = 0;
        int contaY = 0;
        ArrayList arrayTempoYIndiceXNCEM = new ArrayList();
        ArrayList arrayTempoYIndiceXNIEM = new ArrayList();
        ArrayList arrayTempoYIndiceXCEM = new ArrayList();
        for (int i = 0; i < arrayTempoYIEM.size(); i++) {
            contaY = contaY + 1;
            arrayTempoYIndiceXNCEM = aem.extraerNumeroClustersTempoY1(i); // Estraer numero de clusert
            arrayTempoYIndiceXNIEM = aem.extraerInstanciasTempoYN(i, myArrayTY); // Extraer numero de lcuster
            arrayTempoYIndiceXCEM = aem.extraerCentroideTempoYN(i, myArrayTY); // Extraer centroide de acuerdo a bandera
            sumadEMY = sumadEMY + indCH.distanciaCluster(arrayTempoYIndiceXNCEM, arrayTempoYIndiceXNIEM, arrayTempoYIndiceXCEM);
        }
        System.out.println("Contador /////////////////////////////////////////////////// YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY " + contaY);
        cenGeneralEMY = indCH.calculoCentroideGeneral(arrayTempoYECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMY);
        sumad1EMY = indCH.distanciaSeparacionCluster(arrayTempoYCEM, cenGeneralEMY, arrayTempoYIEM);
        numClusterEMY = numClusterEMY + 1;
        numElementosEMY = aem.instanciaTempoY3();
        indiceValidezEMY = sumad1EMY / sumadEMY;
        System.out.println("Sumad1 " + sumad1EMY + "/" + "Sumad " + sumadEMY);
        indiceValidez1EMY = (numElementosEMY - numClusterEMY) / (numClusterEMY - 1);
        System.out.println("Num Elementos " + numElementosEMY + " - " + " Num Elementos " + numElementosEMY + " / " + numClusterEMY);
        indiceValidezfinalEMY = indiceValidezEMY * indiceValidez1EMY;
        guiARecomendar.jTYIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMY));
        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMY);
                //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMY = 0;
        double sumaMaxTotalEMY = 0;
        double numClusterDBEMY = 0;
        double indiceDBEMY = 0;
        double sumaMaximosY = 0;
        ArrayList arrayTempoYIndiceDBNCEM = new ArrayList();
        ArrayList arrayTempoYIndiceDBNIEM = new ArrayList();
        ArrayList arrayTempoYIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMY = new ArrayList();
        ArrayList sumamaxEMY = new ArrayList();
        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayTempoYIEM.size(); i++) {
            arrayTempoYIndiceDBNCEM = aem.extraerNumeroClustersTempoY1(i);
            arrayTempoYIndiceDBNIEM = aem.extraerInstanciasTempoYN(i, myArrayTY);
            arrayTempoYIndiceDBNC1EM = aem.extraerCentroideTempoYN(i, myArrayTY);
            sumadDBEMY = indDB.distanciaCluster(arrayTempoYIndiceDBNCEM, arrayTempoYIndiceDBNIEM, arrayTempoYIndiceDBNC1EM);
            arraySCKEMY.add(String.valueOf(sumadDBEMY));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayTempoYCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMY = indDB.distanciaSeparacionCluster1(arrayTempoYCEM, arraySCKEMY);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMY.size(); i++) {
            sumaMaximosY = Double.parseDouble((String) sumamaxEMY.get(i));

            System.out.println("La distancia maxima " + i + " es: " + sumaMaximosY);
            sumaMaxTotalEMY = sumaMaxTotalEMY + Double.parseDouble((String) sumamaxEMY.get(i));
            numClusterDBEMY = numClusterDBEMY + 1;

        }
        System.out.println("La suma de maximos es :" + sumaMaxTotalEMY);
        System.out.println("Numero de cLUSTER " + numClusterDBEMY);
        indiceDBEMY = (1 / numClusterDBEMY) * sumaMaxTotalEMY;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMY);
        guiARecomendar.jTYIndiceDBEM.setText(String.valueOf(indiceDBEMY));
  ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////        TEMPO EN EM Z         ////////////////////////////
        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayTempoZECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayTempoZECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayTempoZECEM2 = new ArrayList(); // instancias bandera

        int myArrayTZ[][];

        /////////// TEMPO EN EM Z ////////////////////////////
        int contEMZ = -1;
        for (int i = 0; i < 10; i++) {
            // System.out.println("Cluster " + i);
            banarrayTempoZECEM1 = aem.extraerInstanciasTempoZ(i);
            if (!(banarrayTempoZECEM1.isEmpty())) {
                contEMZ = contEMZ + 1;
                for (int j = 0; j < banarrayTempoZECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayTempoZECEM1.add(String.valueOf(contEMZ));
                    finalarrayTempoZECEM2.add(banarrayTempoZECEM1.get(j).toString());
                }
            }
        }

        myArrayTZ = new int[finalarrayTempoZECEM1.size()][2];

        for (int k = 0; k < finalarrayTempoZECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayTZ[k][0] = Integer.parseInt(finalarrayTempoZECEM1.get(k).toString());
            myArrayTZ[k][1] = Integer.parseInt(finalarrayTempoZECEM2.get(k).toString());
        }

                  // Intanciamos Arreglos Duración
        /////////// TEMPO EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayTempoZECEM = finalarrayTempoZECEM1; // Estrae numero de cluster
        arrayTempoZNCEM = arrayTempoZECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayTempoZECEM1 = finalarrayTempoZECEM2;
        arrayTempoZNIEM = arrayTempoZECEM1;

        for (int i = 0; i < arrayTempoZECEM.size(); i++) {
            guiARecomendar.areaTempoZECEM.append((String) "Cluster " + arrayTempoZECEM.get(i) + " Instancia " + arrayTempoZECEM1.get(i) + " \n");
        }
        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayTempoZIEM = aem.instanciaTempoZ();
        arrayTempoZIpruebaEM = arrayTempoZIEM;
        for (int i = 0; i < arrayTempoZIEM.size(); i++) {
            guiARecomendar.areaTempoZIEM.append((String) "[Cluster " + i + "]" + arrayTempoZIEM.get(i) + " Instancias" + " \n");
        }
        /////// EXTRAER CENTROIDE TEMPO EN X ////////////////// 
        arrayTempoZCEM = aem.centroideTempoZ();
        arrayTempoZCpruebaEM = arrayTempoZCEM;
        for (int i = 0; i < arrayTempoZCEM.size(); i++) {
            guiARecomendar.areaTempoZCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayTempoZCEM.get(i) + " ]" + " \n");

            numClusterEMZ = i;

        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoTZEM = cal.calcular(arrayTempoZCEM);
        // for (int i = 0; i < 10; i++)
        for (int i = 0; i < calculoTZEM.size(); i++) {
            guiARecomendar.areaTempoZDEM.append((String) "[Cluster " + i + "]" + calculoTZEM.get(i) + " \n");
        }
        calculoTZEM1 = cal.calculoPosision(arrayTempoZCEM);
        arrayTempoZTpruebaEM = calculoTZEM1;
        for (int i = 0; i < calculoTZEM1.size(); i++) {
            guiARecomendar.areaTempoZTEM.append((String) "[Cluster " + i + "]" + calculoTZEM1.get(i) + " \n");
        }
                 ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMZ = 0;
        double sumad1EMZ = 0;
        double cenGeneralEMZ = 0;
        double indiceValidezEMZ = 0;
        double indiceValidez1EMZ = 0;
        double indiceValidezfinalEMZ = 0;
        int contaZ = 0;
        ArrayList arrayTempoZIndiceXNCEM = new ArrayList();
        ArrayList arrayTempoZIndiceXNIEM = new ArrayList();
        ArrayList arrayTempoZIndiceXCEM = new ArrayList();
        for (int i = 0; i < arrayTempoZIEM.size(); i++) {
            contaZ = contaZ + 1;
            arrayTempoZIndiceXNCEM = aem.extraerNumeroClustersTempoZ1(i); // Estraer numero de clusert
            arrayTempoZIndiceXNIEM = aem.extraerInstanciasTempoZN(i, myArrayTZ); // Extraer numero de lcuster
            arrayTempoZIndiceXCEM = aem.extraerCentroideTempoZN(i, myArrayTZ); // Extraer centroide de acuerdo a bandera
            sumadEMZ = sumadEMZ + indCH.distanciaCluster(arrayTempoZIndiceXNCEM, arrayTempoZIndiceXNIEM, arrayTempoZIndiceXCEM);
        }
        System.out.println("Contador /////////////////////////////////////////////////// " + contaZ);
        cenGeneralEMZ = indCH.calculoCentroideGeneral(arrayTempoZECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMZ);
        sumad1EMZ = indCH.distanciaSeparacionCluster(arrayTempoZCEM, cenGeneralEMZ, arrayTempoZIEM);
        numClusterEMZ = numClusterEMZ + 1;
        numElementosEMZ = aem.instanciaTempoZ3();
        indiceValidezEMZ = sumad1EMZ / sumadEMZ;
        System.out.println("Sumad1 " + sumad1EMZ + "/" + "Sumad " + sumadEMZ);
        indiceValidez1EMZ = (numElementosEMZ - numClusterEMZ) / (numClusterEMZ - 1);
        System.out.println("Num Elementos " + numElementosEMZ + " - " + " Num Elementos " + numElementosEMZ + " / " + numClusterEMZ);
        indiceValidezfinalEMZ = indiceValidezEMZ * indiceValidez1EMZ;
        guiARecomendar.jTZIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMZ));
        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMZ);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMZ = 0;
        double sumaMaxTotalEMZ = 0;
        double numClusterDBEMZ = 0;
        double indiceDBEMZ = 0;
        double sumaMaximosZ = 0;

        ArrayList arrayTempoZIndiceDBNCEM = new ArrayList();
        ArrayList arrayTempoZIndiceDBNIEM = new ArrayList();
        ArrayList arrayTempoZIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMZ = new ArrayList();
        ArrayList sumamaxEMZ = new ArrayList();
        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayTempoZIEM.size(); i++) {
            arrayTempoZIndiceDBNCEM = aem.extraerNumeroClustersTempoZ1(i);
            arrayTempoZIndiceDBNIEM = aem.extraerInstanciasTempoZN(i, myArrayTZ);
            arrayTempoZIndiceDBNC1EM = aem.extraerCentroideTempoZN(i, myArrayTZ);
            sumadDBEMZ = indDB.distanciaCluster(arrayTempoZIndiceDBNCEM, arrayTempoZIndiceDBNIEM, arrayTempoZIndiceDBNC1EM);
            arraySCKEMZ.add(String.valueOf(sumadDBEMZ));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayTempoZCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMZ = indDB.distanciaSeparacionCluster1(arrayTempoZCEM, arraySCKEMZ);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMZ.size(); i++) {
            sumaMaximosZ = Double.parseDouble((String) sumamaxEMZ.get(i));

            if (Double.isNaN(sumaMaximosZ) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximosZ);
                sumaMaxTotalEMZ = sumaMaxTotalEMZ + Double.parseDouble((String) sumamaxEMZ.get(i));
                numClusterDBEMZ = numClusterDBEMZ + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEMZ);
        System.out.println("Numero de cLUSTER " + numClusterDBEMZ);
        indiceDBEMZ = (1 / numClusterDBEMZ) * sumaMaxTotalEMZ;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMZ);
        guiARecomendar.jTZIndiceDBEM.setText(String.valueOf(indiceDBEMZ));

              ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////// DURACION X //////////////////////
        ArrayList arrayDuracionXECEM = new ArrayList();
        ArrayList arrayDuracionXECEM1 = new ArrayList();
        ArrayList arrayDuracionXIEM = new ArrayList();
        ArrayList arrayDuracionXCEM = new ArrayList();

        ArrayList arrayDuracionYECEM = new ArrayList();
        ArrayList arrayDuracionYECEM1 = new ArrayList();
        ArrayList arrayDuracionYIEM = new ArrayList();
        ArrayList arrayDuracionYCEM = new ArrayList();

        ArrayList arrayDuracionZECEM = new ArrayList();
        ArrayList arrayDuracionZECEM1 = new ArrayList();
        ArrayList arrayDuracionZIEM = new ArrayList();
        ArrayList arrayDuracionZCEM = new ArrayList();

        double numClusterEMD = 0;
        double numElementosEMD = 0;
        double numClusterEMYD = 0;
        double numElementosEMYD = 0;
        double numClusterEMZD = 0;
        double numElementosEMZD = 0;

        ArrayList calculoDXEM = new ArrayList();
        ArrayList calculoDXEM1 = new ArrayList();
        ArrayList calculoDYEM = new ArrayList();
        ArrayList calculoDYEM1 = new ArrayList();
        ArrayList calculoDZEM = new ArrayList();
        ArrayList calculoDZEM1 = new ArrayList();

        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayDuracionXECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayDuracionXECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayDuracionXECEM2 = new ArrayList(); // instancias bandera

        String myArrayDX[][];

        /////////// DURACION EN EM X ////////////////////////////
        int contEMDX = -1;
        for (int i = 0; i < 5; i++) {
            // System.out.println("Cluster " + i);
            banarrayDuracionXECEM1 = aem1.extraerInstanciasDuracionX(i);
            if (!(banarrayDuracionXECEM1.isEmpty())) {
                contEMDX = contEMDX + 1;
                for (int j = 0; j < banarrayDuracionXECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayDuracionXECEM1.add(String.valueOf(contEMDX));
                    finalarrayDuracionXECEM2.add(banarrayDuracionXECEM1.get(j).toString());
                }
            }
        }
        for (int i = 0; i < finalarrayDuracionXECEM1.size(); i++) {
            System.out.println(finalarrayDuracionXECEM1.get(i) + "," + finalarrayDuracionXECEM2.get(i));
        }

        myArrayDX = new String[finalarrayDuracionXECEM1.size()][2];

        for (int k = 0; k < finalarrayDuracionXECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayDX[k][0] = finalarrayDuracionXECEM1.get(k).toString();
            myArrayDX[k][1] = finalarrayDuracionXECEM2.get(k).toString();
        }

                  // Intanciamos Arreglos Duración
        /////////// DURACION EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayDuracionXECEM = finalarrayDuracionXECEM1; // Estrae numero de cluster
        arrayDuracionXNCEM = arrayDuracionXECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayDuracionXECEM1 = finalarrayDuracionXECEM2;
        arrayDuracionXNIEM = arrayDuracionXECEM1;

        for (int i = 0; i < arrayDuracionXECEM.size(); i++) {
            guiARecomendar.areaDuracionXECEM.append((String) "Cluster " + arrayDuracionXECEM.get(i) + " Instancia " + arrayDuracionXECEM1.get(i) + " \n");
        }

        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayDuracionXIEM = aem1.instanciaDuracionX();
        arrayDuracionXIpruebaEM = arrayDuracionXIEM;
        for (int i = 0; i < arrayDuracionXIEM.size(); i++) {
            guiARecomendar.areaDuracionXIEM.append((String) "[Cluster " + i + "]" + arrayDuracionXIEM.get(i) + " Instancias" + " \n");
        }

        /////// EXTRAER CENTROIDE TEMPO EN X ////////////////// 
        arrayDuracionXCEM = aem1.centroideDuracionX();
        arrayDuracionXCpruebaEM = arrayDuracionXCEM;
        for (int i = 0; i < arrayDuracionXCEM.size(); i++) {
            guiARecomendar.areaDuracionXCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayDuracionXCEM.get(i) + " ]" + " \n");

            numClusterEMD = i;

        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoDXEM = cal1.calcular(arrayDuracionXCEM);
        // for (int i = 0; i < 10; i++)
        for (int i = 0; i < calculoDXEM.size(); i++) {
            guiARecomendar.areaDuracionXDEM.append((String) "[Cluster " + i + "]" + calculoDXEM.get(i) + " \n");
        }
        calculoDXEM1 = cal1.calculoPosision(arrayDuracionXCEM);
        arrayDuracionXTpruebaEM = calculoDXEM1;
        for (int i = 0; i < calculoDXEM1.size(); i++) {
            guiARecomendar.areaDuracionXTEM.append((String) "[Cluster " + i + "]" + calculoDXEM1.get(i) + " \n");
        }

                 ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMD = 0;
        double sumad1EMD = 0;
        double cenGeneralEMD = 0;
        double indiceValidezEMD = 0;
        double indiceValidez1EMD = 0;
        double indiceValidezfinalEMD = 0;
        int contaD = 0;
        ArrayList arrayDuracionXIndiceXNCEM = new ArrayList();
        ArrayList arrayDuracionXIndiceXNIEM = new ArrayList();
        ArrayList arrayDuracionXIndiceXCEM = new ArrayList();

        for (int i = 0; i < arrayDuracionXIEM.size(); i++) {
            contaD = contaD + 1;
            arrayDuracionXIndiceXNCEM = aem.extraerNumeroClustersDuracionX1(i); // Estraer numero de clusert
            arrayDuracionXIndiceXNIEM = aem.extraerInstanciasDuracionXN(i, myArrayDX); // Extraer numero de lcuster
            arrayDuracionXIndiceXCEM = aem.extraerCentroideDuracionXN(i, myArrayDX); // Extraer centroide de acuerdo a bandera

            sumadEMD = sumadEMD + indCH.distanciaCluster(arrayDuracionXIndiceXNCEM, arrayDuracionXIndiceXNIEM, arrayDuracionXIndiceXCEM);

        }
        System.out.println("Contador /////////////////////////////////////////////////// " + contaD);

        cenGeneralEMD = indCH.calculoCentroideGeneral(arrayDuracionXECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMD);
        sumad1EMD = indCH.distanciaSeparacionCluster(arrayDuracionXCEM, cenGeneralEMD, arrayDuracionXIEM);
        numClusterEMD = numClusterEMD + 1;
        numElementosEMD = aem.instanciaDuracionX3();
        indiceValidezEMD = sumad1EMD / sumadEMD;
        System.out.println("Sumad1 " + sumad1EMD + "/" + "Sumad " + sumadEMD);
        indiceValidez1EMD = (numElementosEMD - numClusterEMD) / (numClusterEMD - 1);
        System.out.println("Num Elementos " + numElementosEMD + " - " + " Num Elementos " + numElementosEMD + " / " + numClusterEMD);
        indiceValidezfinalEMD = indiceValidezEMD * indiceValidez1EMD;
        guiARecomendar.jDXIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMD));
        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMD);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMD = 0;
        double sumaMaxTotalEMD = 0;
        double numClusterDBEMD = 0;
        double indiceDBEMD = 0;
        double sumaMaximosD = 0;

        ArrayList arrayDuracionXIndiceDBNCEM = new ArrayList();
        ArrayList arrayDuracionXIndiceDBNIEM = new ArrayList();
        ArrayList arrayDuracionXIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMD = new ArrayList();
        ArrayList sumamaxEMD = new ArrayList();

        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionXIEM.size(); i++) {
            arrayDuracionXIndiceDBNCEM = aem.extraerNumeroClustersDuracionX1(i);
            arrayDuracionXIndiceDBNIEM = aem.extraerInstanciasDuracionXN(i, myArrayDX);
            arrayDuracionXIndiceDBNC1EM = aem.extraerCentroideDuracionXN(i, myArrayDX);
            sumadDBEMD = indDB.distanciaCluster(arrayDuracionXIndiceDBNCEM, arrayDuracionXIndiceDBNIEM, arrayDuracionXIndiceDBNC1EM);
            arraySCKEMD.add(String.valueOf(sumadDBEMD));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayDuracionXCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMD = indDB.distanciaSeparacionCluster1(arrayDuracionXCEM, arraySCKEMD);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMD.size(); i++) {
            sumaMaximosD = Double.parseDouble((String) sumamaxEMD.get(i));

            if (Double.isNaN(sumaMaximosD) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximosD);
                sumaMaxTotalEMD = sumaMaxTotalEMD + Double.parseDouble((String) sumamaxEMD.get(i));
                numClusterDBEMD = numClusterDBEMD + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEMD);
        System.out.println("Numero de cLUSTER " + numClusterDBEMD);
        indiceDBEMD = (1 / numClusterDBEMD) * sumaMaxTotalEMD;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMD);
        guiARecomendar.jDXIndiceDBEM.setText(String.valueOf(indiceDBEMD));

                ////////////// DURACION Y ///////////////////////////////////////
                 // Intanciamos Arreglos Duración
        /////////// TEMPO EN EM X ////////////////////////////
        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayDuracionYECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayDuracionYECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayDuracionYECEM2 = new ArrayList(); // instancias bandera

        String myArrayDY[][];

        /////////// DURACION EN EM Y ////////////////////////////
        int contEMDY = -1;
        for (int i = 0; i < 5; i++) {
            // System.out.println("Cluster " + i);
            banarrayDuracionYECEM1 = aem1.extraerInstanciasDuracionY(i);
            if (!(banarrayDuracionYECEM1.isEmpty())) {
                contEMDY = contEMDY + 1;
                for (int j = 0; j < banarrayDuracionYECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayDuracionYECEM1.add(String.valueOf(contEMDY));
                    finalarrayDuracionYECEM2.add(banarrayDuracionYECEM1.get(j).toString());
                }
            }
        }
        for (int i = 0; i < finalarrayDuracionYECEM1.size(); i++) {
            System.out.println(finalarrayDuracionYECEM1.get(i) + "," + finalarrayDuracionYECEM2.get(i));
        }

        myArrayDY = new String[finalarrayDuracionYECEM1.size()][2];

        for (int k = 0; k < finalarrayDuracionYECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayDY[k][0] = finalarrayDuracionYECEM1.get(k).toString();
            myArrayDY[k][1] = finalarrayDuracionYECEM2.get(k).toString();
        }

                  // Intanciamos Arreglos Duración
        /////////// DURACION EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayDuracionYECEM = finalarrayDuracionYECEM1; // Estrae numero de cluster
        arrayDuracionYNCEM = arrayDuracionYECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayDuracionYECEM1 = finalarrayDuracionYECEM2;
        arrayDuracionYNIEM = arrayDuracionYECEM1;

        for (int i = 0; i < arrayDuracionXECEM.size(); i++) {
            guiARecomendar.areaDuracionYECEM.append((String) "Cluster " + arrayDuracionYECEM.get(i) + " Instancia " + arrayDuracionYECEM1.get(i) + " \n");
        }

        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayDuracionYIEM = aem1.instanciaDuracionY();
        arrayDuracionYIpruebaEM = arrayDuracionYIEM;
        for (int i = 0; i < arrayDuracionYIEM.size(); i++) {
            guiARecomendar.areaDuracionYIEM.append((String) "[Cluster " + i + "]" + arrayDuracionYIEM.get(i) + " Instancias" + " \n");
        }

        /////// EXTRAER CENTROIDE TEMPO EN X ////////////////// 
        arrayDuracionYCEM = aem1.centroideDuracionY();
        arrayDuracionYCpruebaEM = arrayDuracionYCEM;
        for (int i = 0; i < arrayDuracionYCEM.size(); i++) {
            guiARecomendar.areaDuracionYCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayDuracionYCEM.get(i) + " ]" + " \n");

            numClusterEMYD = i;

        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoDYEM = cal1.calcular(arrayDuracionYCEM);
        // for (int i = 0; i < 10; i++)
        for (int i = 0; i < calculoDYEM.size(); i++) {
            guiARecomendar.areaDuracionYDEM.append((String) "[Cluster " + i + "]" + calculoDYEM.get(i) + " \n");
        }
        calculoDYEM1 = cal1.calculoPosision(arrayDuracionYCEM);
        arrayDuracionYTpruebaEM = calculoDYEM1;
        for (int i = 0; i < calculoDYEM1.size(); i++) {
            guiARecomendar.areaDuracionYTEM.append((String) "[Cluster " + i + "]" + calculoDYEM1.get(i) + " \n");
        }

                 ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMDY = 0;
        double sumad1EMDY = 0;
        double cenGeneralEMDY = 0;
        double indiceValidezEMDY = 0;
        double indiceValidez1EMDY = 0;
        double indiceValidezfinalEMDY = 0;
        int contaDY = 0;
        ArrayList arrayDuracionYIndiceXNCEM = new ArrayList();
        ArrayList arrayDuracionYIndiceXNIEM = new ArrayList();
        ArrayList arrayDuracionYIndiceXCEM = new ArrayList();

        for (int i = 0; i < arrayDuracionYIEM.size(); i++) {
            contaDY = contaDY + 1;
            arrayDuracionYIndiceXNCEM = aem.extraerNumeroClustersDuracionY1(i); // Estraer numero de clusert
            arrayDuracionYIndiceXNIEM = aem.extraerInstanciasDuracionYN(i, myArrayDY); // Extraer numero de lcuster
            arrayDuracionYIndiceXCEM = aem.extraerCentroideDuracionYN(i, myArrayDY); // Extraer centroide de acuerdo a bandera

            sumadEMDY = sumadEMDY + indCH.distanciaCluster(arrayDuracionYIndiceXNCEM, arrayDuracionYIndiceXNIEM, arrayDuracionYIndiceXCEM);

        }
        System.out.println("Contador /////////////////////////////////////////////////// " + contaDY);

        cenGeneralEMDY = indCH.calculoCentroideGeneral(arrayDuracionYECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMDY);
        sumad1EMDY = indCH.distanciaSeparacionCluster(arrayDuracionYCEM, cenGeneralEMDY, arrayDuracionYIEM);
        numClusterEMYD = numClusterEMYD + 1;
        numElementosEMYD = aem.instanciaDuracionY3();
        indiceValidezEMDY = sumad1EMDY / sumadEMDY;
        System.out.println("Sumad1 " + sumad1EMDY + "/" + "Sumad " + sumadEMDY);
        indiceValidez1EMDY = (numElementosEMYD - numClusterEMYD) / (numClusterEMYD - 1);
        System.out.println("Num Elementos " + numElementosEMYD + " - " + " Num Elementos " + numElementosEMYD + " / " + numClusterEMYD);
        indiceValidezfinalEMDY = indiceValidezEMDY * indiceValidez1EMDY;
        guiARecomendar.jDYIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMDY));
        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMDY);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMDY = 0;
        double sumaMaxTotalEMDY = 0;
        double numClusterDBEMDY = 0;
        double indiceDBEMDY = 0;
        double sumaMaximosDY = 0;

        ArrayList arrayDuracionYIndiceDBNCEM = new ArrayList();
        ArrayList arrayDuracionYIndiceDBNIEM = new ArrayList();
        ArrayList arrayDuracionYIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMDY = new ArrayList();
        ArrayList sumamaxEMDY = new ArrayList();

        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionYIEM.size(); i++) {
            arrayDuracionYIndiceDBNCEM = aem1.extraerNumeroClustersDuracionY1(i);
            arrayDuracionYIndiceDBNIEM = aem1.extraerInstanciasDuracionYN(i, myArrayDY);
            arrayDuracionYIndiceDBNC1EM = aem1.extraerCentroideDuracionYN(i, myArrayDY);
            sumadDBEMDY = indDB.distanciaCluster(arrayDuracionYIndiceDBNCEM, arrayDuracionYIndiceDBNIEM, arrayDuracionYIndiceDBNC1EM);
            arraySCKEMDY.add(String.valueOf(sumadDBEMDY));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayDuracionYCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMDY = indDB.distanciaSeparacionCluster1(arrayDuracionYCEM, arraySCKEMDY);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMDY.size(); i++) {
            sumaMaximosDY = Double.parseDouble((String) sumamaxEMDY.get(i));

            if (Double.isNaN(sumaMaximosDY) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximosDY);
                sumaMaxTotalEMDY = sumaMaxTotalEMDY + Double.parseDouble((String) sumamaxEMDY.get(i));
                numClusterDBEMDY = numClusterDBEMDY + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEMDY);
        System.out.println("Numero de cLUSTER " + numClusterDBEMDY);
        indiceDBEMDY = (1 / numClusterDBEMDY) * sumaMaxTotalEMDY;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMDY);
        guiARecomendar.jDYIndiceDBEM.setText(String.valueOf(indiceDBEMDY));

                ////////////// DURACION Z ///////////////////////////////////////
        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayDuracionZECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayDuracionZECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayDuracionZECEM2 = new ArrayList(); // instancias bandera

        String myArrayDZ[][];

        /////////// TEMPO EN EM X ////////////////////////////
        int contEMDZ = -1;
        for (int i = 0; i < 10; i++) {
            // System.out.println("Cluster " + i);
            banarrayDuracionZECEM1 = aem1.extraerInstanciasDuracionZ(i);
            if (!(banarrayDuracionZECEM1.isEmpty())) {
                contEMDZ = contEMDZ + 1;
                for (int j = 0; j < banarrayDuracionZECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayDuracionZECEM1.add(String.valueOf(contEMDZ));
                    finalarrayDuracionZECEM2.add(banarrayDuracionZECEM1.get(j).toString());
                }
            }
        }
        for (int i = 0; i < finalarrayDuracionZECEM1.size(); i++) {
            System.out.println(finalarrayDuracionZECEM1.get(i) + "," + finalarrayDuracionZECEM2.get(i));
        }

        myArrayDZ = new String[finalarrayDuracionZECEM1.size()][2];

        for (int k = 0; k < finalarrayDuracionZECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayDZ[k][0] = finalarrayDuracionZECEM1.get(k).toString();
            myArrayDZ[k][1] = finalarrayDuracionZECEM2.get(k).toString();
        }

                  // Intanciamos Arreglos Duración
        /////////// DURACION EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayDuracionZECEM = finalarrayDuracionZECEM1; // Estrae numero de cluster
        arrayDuracionZNCEM = arrayDuracionZECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayDuracionZECEM1 = finalarrayDuracionZECEM2;
        arrayDuracionZNIEM = arrayDuracionZECEM1;

        for (int i = 0; i < arrayDuracionZECEM.size(); i++) {
            guiARecomendar.areaDuracionZECEM.append((String) "Cluster " + arrayDuracionZECEM.get(i) + " Instancia " + arrayDuracionZECEM1.get(i) + " \n");
        }

        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN Z /////////     
        arrayDuracionZIEM = aem1.instanciaDuracionZ();
        arrayDuracionZIpruebaEM = arrayDuracionZIEM;
        for (int i = 0; i < arrayDuracionZIEM.size(); i++) {
            guiARecomendar.areaDuracionZIEM.append((String) "[Cluster " + i + "]" + arrayDuracionZIEM.get(i) + " Instancias" + " \n");
        }

        /////// EXTRAER CENTROIDE TEMPO EN Z ////////////////// 
        arrayDuracionZCEM = aem1.centroideDuracionZ();
        arrayDuracionZCpruebaEM = arrayDuracionZCEM;
        for (int i = 0; i < arrayDuracionZCEM.size(); i++) {
            guiARecomendar.areaDuracionZCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayDuracionZCEM.get(i) + " ]" + " \n");

            numClusterEMZD = i;

        }
        ///////// CALCULOS DE DISTANCIA ////////////////////////////
        calculoDZEM = cal1.calcular(arrayDuracionZCEM);
        // for (int i = 0; i < 10; i++)
        for (int i = 0; i < calculoDZEM.size(); i++) {
            guiARecomendar.areaDuracionZDEM.append((String) "[Cluster " + i + "]" + calculoDZEM.get(i) + " \n");
        }
        calculoDZEM1 = cal1.calculoPosision(arrayDuracionZCEM);
        arrayDuracionZTpruebaEM = calculoDZEM1;
        for (int i = 0; i < calculoDZEM1.size(); i++) {
            guiARecomendar.areaDuracionZTEM.append((String) "[Cluster " + i + "]" + calculoDZEM1.get(i) + " \n");
        }

                 ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMDZ = 0;
        double sumad1EMDZ = 0;
        double cenGeneralEMDZ = 0;
        double indiceValidezEMDZ = 0;
        double indiceValidez1EMDZ = 0;
        double indiceValidezfinalEMDZ = 0;
        int contaDZ = 0;
        ArrayList arrayDuracionZIndiceXNCEM = new ArrayList();
        ArrayList arrayDuracionZIndiceXNIEM = new ArrayList();
        ArrayList arrayDuracionZIndiceXCEM = new ArrayList();

        for (int i = 0; i < arrayDuracionZIEM.size(); i++) {
            contaDZ = contaDZ + 1;
            arrayDuracionZIndiceXNCEM = aem1.extraerNumeroClustersDuracionZ1(i); // Estraer numero de clusert
            arrayDuracionZIndiceXNIEM = aem1.extraerInstanciasDuracionZN(i, myArrayDZ); // Extraer numero de lcuster
            arrayDuracionZIndiceXCEM = aem1.extraerCentroideDuracionZN(i, myArrayDZ); // Extraer centroide de acuerdo a bandera

            sumadEMDZ = sumadEMDZ + indCH.distanciaCluster(arrayDuracionZIndiceXNCEM, arrayDuracionZIndiceXNIEM, arrayDuracionZIndiceXCEM);

        }
        System.out.println("Contador /////////////////////////////////////////////////// " + contaDZ);

        cenGeneralEMDZ = indCH.calculoCentroideGeneral(arrayDuracionZECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMDZ);
        sumad1EMDZ = indCH.distanciaSeparacionCluster(arrayDuracionZCEM, cenGeneralEMDZ, arrayDuracionZIEM);
        numClusterEMZD = numClusterEMZD + 1;
        numElementosEMZD = aem.instanciaDuracionZ3();
        indiceValidezEMDZ = sumad1EMDZ / sumadEMDZ;
        System.out.println("Sumad1 " + sumad1EMDZ + "/" + "Sumad " + sumadEMDZ);
        indiceValidez1EMDZ = (numElementosEMZD - numClusterEMZD) / (numClusterEMZD - 1);
        System.out.println("Num Elementos " + numElementosEMZD + " - " + " Num Elementos " + numElementosEMZD + " / " + numClusterEMZD);
        indiceValidezfinalEMDZ = indiceValidezEMDZ * indiceValidez1EMDZ;
        guiARecomendar.jDZIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMDZ));
        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMDZ);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMDZ = 0;
        double sumaMaxTotalEMDZ = 0;
        double numClusterDBEMDZ = 0;
        double indiceDBEMDZ = 0;
        double sumaMaximosDZ = 0;

        ArrayList arrayDuracionZIndiceDBNCEM = new ArrayList();
        ArrayList arrayDuracionZIndiceDBNIEM = new ArrayList();
        ArrayList arrayDuracionZIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMDZ = new ArrayList();
        ArrayList sumamaxEMDZ = new ArrayList();

        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayDuracionZIEM.size(); i++) {
            arrayDuracionZIndiceDBNCEM = aem1.extraerNumeroClustersDuracionZ1(i);
            arrayDuracionZIndiceDBNIEM = aem1.extraerInstanciasDuracionZN(i, myArrayDZ);
            arrayDuracionZIndiceDBNC1EM = aem1.extraerCentroideDuracionZN(i, myArrayDZ);
            sumadDBEMDZ = indDB.distanciaCluster(arrayDuracionZIndiceDBNCEM, arrayDuracionZIndiceDBNIEM, arrayDuracionZIndiceDBNC1EM);
            arraySCKEMDZ.add(String.valueOf(sumadDBEMDZ));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayDuracionZCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMDZ = indDB.distanciaSeparacionCluster1(arrayDuracionZCEM, arraySCKEMDZ);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMDZ.size(); i++) {
            sumaMaximosDZ = Double.parseDouble((String) sumamaxEMDZ.get(i));

            if (Double.isNaN(sumaMaximosDZ) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximosDZ);
                sumaMaxTotalEMDZ = sumaMaxTotalEMDZ + Double.parseDouble((String) sumamaxEMDZ.get(i));
                numClusterDBEMDZ = numClusterDBEMDZ + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEMDZ);
        System.out.println("Numero de cLUSTER " + numClusterDBEMDZ);
        indiceDBEMDZ = (1 / numClusterDBEMDZ) * sumaMaxTotalEMDZ;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMDZ);
        guiARecomendar.jDZIndiceDBEM.setText(String.valueOf(indiceDBEMDZ));

                ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////// OCTAVAS EM //////////////////////
        ArrayList arrayOctavaXECEM = new ArrayList();
        ArrayList arrayOctavaXECEM1 = new ArrayList();
        ArrayList arrayOctavaXIEM = new ArrayList();
        ArrayList arrayOctavaXCEM = new ArrayList();

        ArrayList arrayOctavaYECEM = new ArrayList();
        ArrayList arrayOctavaYECEM1 = new ArrayList();
        ArrayList arrayOctavaYIEM = new ArrayList();
        ArrayList arrayOctavaYCEM = new ArrayList();

        ArrayList arrayOctavaZECEM = new ArrayList();
        ArrayList arrayOctavaZECEM1 = new ArrayList();
        ArrayList arrayOctavaZIEM = new ArrayList();
        ArrayList arrayOctavaZCEM = new ArrayList();

        double numClusterEMO = 0;
        double numElementosEMO = 0;
        double numClusterEMYO = 0;
        double numElementosEMYO = 0;
        double numClusterEMZO = 0;
        double numElementosEMZO = 0;

        ArrayList calculoOXEM = new ArrayList();
        ArrayList calculoOXEM1 = new ArrayList();
        ArrayList calculoOYEM = new ArrayList();
        ArrayList calculoOYEM1 = new ArrayList();
        ArrayList calculoOZEM = new ArrayList();
        ArrayList calculoOZEM1 = new ArrayList();

        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayOctavaXECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayOctavaXECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayOctavaXECEM2 = new ArrayList(); // instancias bandera

        int myArrayOX[][];

        /////////// TEMPO EN EM X ////////////////////////////
        int contEMOX = -1;
        for (int i = 0; i < 11; i++) {
            // System.out.println("Cluster " + i);
            banarrayOctavaXECEM1 = aem2.extraerInstanciasOctavaX(i);
            if (!(banarrayOctavaXECEM1.isEmpty())) {
                contEMOX = contEMOX + 1;
                for (int j = 0; j < banarrayOctavaXECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayOctavaXECEM1.add(String.valueOf(contEMOX));
                    finalarrayOctavaXECEM2.add(banarrayOctavaXECEM1.get(j).toString());
                }
            }
        }
        for (int i = 0; i < finalarrayOctavaXECEM1.size(); i++) {
            System.out.println(finalarrayOctavaXECEM1.get(i) + "," + finalarrayOctavaXECEM2.get(i));
        }

        myArrayOX = new int[finalarrayOctavaXECEM1.size()][2];

        for (int k = 0; k < finalarrayOctavaXECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayOX[k][0] = Integer.parseInt(finalarrayOctavaXECEM1.get(k).toString());
            myArrayOX[k][1] = Integer.parseInt(finalarrayOctavaXECEM2.get(k).toString());
        }

                  // Intanciamos Arreglos Duración
        /////////// DURACION EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayOctavaXECEM = finalarrayOctavaXECEM1; // Estrae numero de cluster
        arrayOctavaXNCEM = arrayOctavaXECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayOctavaXECEM1 = finalarrayOctavaXECEM2;
        arrayOctavaXNIEM = arrayOctavaXECEM1;

        for (int i = 0; i < arrayOctavaXECEM.size(); i++) {
            guiARecomendar.areaOctavaXECEM.append((String) "Cluster " + arrayOctavaXECEM.get(i) + " Instancia " + arrayOctavaXECEM1.get(i) + " \n");
        }

        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayOctavaXIEM = aem2.instanciaOctavaX();
        arrayOctavaXIpruebaEM = arrayOctavaXIEM;
        for (int i = 0; i < arrayOctavaXIEM.size(); i++) {
            guiARecomendar.areaOctavaXIEM.append((String) "[Cluster " + i + "]" + arrayOctavaXIEM.get(i) + " Instancias" + " \n");
        }

        /////// EXTRAER CENTROIDE TEMPO EN X ////////////////// 
        arrayOctavaXCEM = aem2.centroideOctavaX();
        arrayOctavaXCpruebaEM = arrayOctavaXCEM;
        for (int i = 0; i < arrayOctavaXCEM.size(); i++) {
            guiARecomendar.areaOctavaXCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayOctavaXCEM.get(i) + " ]" + " \n");

            numClusterEMO = i;

        }

        calculoOXEM1 = cal2.calculoPosision(arrayOctavaXCEM);
        arrayOctavaXTpruebaEM = calculoOXEM1;
        for (int i = 0; i < calculoOXEM1.size(); i++) {
            guiARecomendar.areaOctavaXTEM.append((String) "[Cluster " + i + "]" + calculoOXEM1.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMO = 0;
        double sumad1EMO = 0;
        double cenGeneralEMO = 0;
        double indiceValidezEMO = 0;
        double indiceValidez1EMO = 0;
        double indiceValidezfinalEMO = 0;
        int contaO = 0;
        ArrayList arrayOctavaXIndiceXNCEM = new ArrayList();
        ArrayList arrayOctavaXIndiceXNIEM = new ArrayList();
        ArrayList arrayOctavaXIndiceXCEM = new ArrayList();

        for (int i = 0; i < arrayOctavaXIEM.size(); i++) {
            contaO = contaO + 1;
            arrayOctavaXIndiceXNCEM = aem2.extraerNumeroClustersOctavaX1(i); // Estraer numero de clusert
            arrayOctavaXIndiceXNIEM = aem2.extraerInstanciasOctavaXN(i, myArrayOX); // Extraer numero de lcuster
            arrayOctavaXIndiceXCEM = aem2.extraerCentroideOctavaXN(i, myArrayOX); // Extraer centroide de acuerdo a bandera

            sumadEMO = sumadEMO + indCH.distanciaCluster(arrayOctavaXIndiceXNCEM, arrayOctavaXIndiceXNIEM, arrayOctavaXIndiceXCEM);

        }
        System.out.println("Contador /////////////////////////////////////////////////// " + contaO);

        cenGeneralEMO = indCH.calculoCentroideGeneral(arrayOctavaXECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMO);
        sumad1EMO = indCH.distanciaSeparacionCluster(arrayOctavaXCEM, cenGeneralEMO, arrayOctavaXIEM);
        numClusterEMO = numClusterEMO + 1;
        numElementosEMO = aem2.instanciaOctavaX3();
        indiceValidezEMO = sumad1EMO / sumadEMO;
        System.out.println("Sumad1 " + sumad1EMO + "/" + "Sumad " + sumadEMO);
        indiceValidez1EMO = (numElementosEMO - numClusterEMO) / (numClusterEMO - 1);
        System.out.println("Num Elementos " + numElementosEMO + " - " + " Num Elementos " + numElementosEMO + " / " + numClusterEMO);
        indiceValidezfinalEMO = indiceValidezEMO * indiceValidez1EMO;
        guiARecomendar.jOXIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMO));
        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMO);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMO = 0;
        double sumaMaxTotalEMO = 0;
        double numClusterDBEMO = 0;
        double indiceDBEMO = 0;
        double sumaMaximosO = 0;

        ArrayList arrayOctavaXIndiceDBNCEM = new ArrayList();
        ArrayList arrayOctavaXIndiceDBNIEM = new ArrayList();
        ArrayList arrayOctavaXIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMO = new ArrayList();
        ArrayList sumamaxEMO = new ArrayList();

        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaXIEM.size(); i++) {
            arrayOctavaXIndiceDBNCEM = aem2.extraerNumeroClustersOctavaX1(i);
            arrayOctavaXIndiceDBNIEM = aem2.extraerInstanciasOctavaXN(i, myArrayOX);
            arrayOctavaXIndiceDBNC1EM = aem2.extraerCentroideOctavaXN(i, myArrayOX);
            sumadDBEMO = indDB.distanciaCluster(arrayOctavaXIndiceDBNCEM, arrayOctavaXIndiceDBNIEM, arrayOctavaXIndiceDBNC1EM);
            arraySCKEMO.add(String.valueOf(sumadDBEMO));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayOctavaXCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMO = indDB.distanciaSeparacionCluster1(arrayOctavaXCEM, arraySCKEMO);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMO.size(); i++) {
            sumaMaximosO = Double.parseDouble((String) sumamaxEMO.get(i));

            if (Double.isNaN(sumaMaximosO) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximosO);
                sumaMaxTotalEMO = sumaMaxTotalEMO + Double.parseDouble((String) sumamaxEMO.get(i));
                numClusterDBEMO = numClusterDBEMO + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEMO);
        System.out.println("Numero de cLUSTER " + numClusterDBEMO);
        indiceDBEMO = (1 / numClusterDBEMO) * sumaMaxTotalEMO;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMO);
        guiARecomendar.jOXIndiceDBEM.setText(String.valueOf(indiceDBEMO));

                /////////// OCTAVA EN EM Y ////////////////////////////
        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayOctavaYECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayOctavaYECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayOctavaYECEM2 = new ArrayList(); // instancias bandera

        int myArrayOY[][];

        /////////// TEMPO EN EM X ////////////////////////////
        int contEMOY = -1;
        for (int i = 0; i < 11; i++) {
            // System.out.println("Cluster " + i);
            banarrayOctavaYECEM1 = aem2.extraerInstanciasOctavaY(i);
            if (!(banarrayOctavaYECEM1.isEmpty())) {
                contEMOY = contEMOY + 1;
                for (int j = 0; j < banarrayOctavaYECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayOctavaYECEM1.add(String.valueOf(contEMOY));
                    finalarrayOctavaYECEM2.add(banarrayOctavaYECEM1.get(j).toString());
                }
            }
        }
        for (int i = 0; i < finalarrayOctavaYECEM1.size(); i++) {
            System.out.println(finalarrayOctavaYECEM1.get(i) + "," + finalarrayOctavaYECEM2.get(i));
        }

        myArrayOY = new int[finalarrayOctavaYECEM1.size()][2];

        for (int k = 0; k < finalarrayOctavaYECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayOY[k][0] = Integer.parseInt(finalarrayOctavaYECEM1.get(k).toString());
            myArrayOY[k][1] = Integer.parseInt(finalarrayOctavaYECEM2.get(k).toString());
        }

                  // Intanciamos Arreglos Duración
        /////////// DURACION EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayOctavaYECEM = finalarrayOctavaYECEM1; // Estrae numero de cluster
        arrayOctavaYNCEM = arrayOctavaYECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayOctavaYECEM1 = finalarrayOctavaYECEM2;
        arrayOctavaYNIEM = arrayOctavaYECEM1;

        for (int i = 0; i < arrayOctavaYECEM.size(); i++) {
            guiARecomendar.areaOctavaYECEM.append((String) "Cluster " + arrayOctavaYECEM.get(i) + " Instancia " + arrayOctavaYECEM1.get(i) + " \n");
        }

        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayOctavaYIEM = aem2.instanciaOctavaY();
        arrayOctavaYIpruebaEM = arrayOctavaYIEM;
        for (int i = 0; i < arrayOctavaYIEM.size(); i++) {
            guiARecomendar.areaOctavaYIEM.append((String) "[Cluster " + i + "]" + arrayOctavaYIEM.get(i) + " Instancias" + " \n");
        }

        /////// EXTRAER CENTROIDE TEMPO EN X ////////////////// 
        arrayOctavaYCEM = aem2.centroideOctavaY();
        arrayOctavaYCpruebaEM = arrayOctavaYCEM;
        for (int i = 0; i < arrayOctavaYCEM.size(); i++) {
            guiARecomendar.areaOctavaYCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayOctavaYCEM.get(i) + " ]" + " \n");

            numClusterEMYO = i;
        }

        calculoOYEM1 = cal2.calculoPosision(arrayOctavaYCEM);
        arrayOctavaYTpruebaEM = calculoOYEM1;
        for (int i = 0; i < calculoOYEM1.size(); i++) {
            guiARecomendar.areaOctavaYTEM.append((String) "[Cluster " + i + "]" + calculoOYEM1.get(i) + " \n");
        }

                ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMOY = 0;
        double sumad1EMOY = 0;
        double cenGeneralEMOY = 0;
        double indiceValidezEMOY = 0;
        double indiceValidez1EMOY = 0;
        double indiceValidezfinalEMOY = 0;
        int contaOY = 0;
        ArrayList arrayOctavaYIndiceXNCEM = new ArrayList();
        ArrayList arrayOctavaYIndiceXNIEM = new ArrayList();
        ArrayList arrayOctavaYIndiceXCEM = new ArrayList();

        for (int i = 0; i < arrayOctavaYIEM.size(); i++) {
            contaOY = contaOY + 1;
            arrayOctavaYIndiceXNCEM = aem2.extraerNumeroClustersOctavaY1(i); // Estraer numero de clusert
            arrayOctavaYIndiceXNIEM = aem2.extraerInstanciasOctavaYN(i, myArrayOY); // Extraer numero de lcuster
            arrayOctavaYIndiceXCEM = aem2.extraerCentroideOctavaYN(i, myArrayOY); // Extraer centroide de acuerdo a bandera

            sumadEMOY = sumadEMOY + indCH.distanciaCluster(arrayOctavaYIndiceXNCEM, arrayOctavaYIndiceXNIEM, arrayOctavaYIndiceXCEM);

        }
        System.out.println("Contador /////////////////////////////////////////////////// " + contaOY);

        cenGeneralEMOY = indCH.calculoCentroideGeneral(arrayOctavaYECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMOY);
        sumad1EMOY = indCH.distanciaSeparacionCluster(arrayOctavaYCEM, cenGeneralEMOY, arrayOctavaYIEM);
        numClusterEMYO = numClusterEMYO + 1;
        numElementosEMYO = aem2.instanciaOctavaY3();
        indiceValidezEMOY = sumad1EMOY / sumadEMOY;
        System.out.println("Sumad1 " + sumad1EMOY + "/" + "Sumad " + sumadEMOY);
        indiceValidez1EMOY = (numElementosEMYO - numClusterEMYO) / (numClusterEMYO - 1);
        System.out.println("Num Elementos " + numElementosEMYO + " - " + " Num Elementos " + numElementosEMYO + " / " + numClusterEMYO);
        indiceValidezfinalEMOY = indiceValidezEMOY * indiceValidez1EMOY;
        guiARecomendar.jOYIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMOY));
        System.out.println("(" + sumad1EMOY + " / " + sumadEMOY + ")" + " * " + "( " + numElementosEMYO + " - " + numClusterEMYO + ")" + " / " + numClusterEMYO + " - " + " 1");

        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMOY);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMOY = 0;
        double sumaMaxTotalEMOY = 0;
        double numClusterDBEMOY = 0;
        double indiceDBEMOY = 0;
        double sumaMaximosOY = 0;

        ArrayList arrayOctavaYIndiceDBNCEM = new ArrayList();
        ArrayList arrayOctavaYIndiceDBNIEM = new ArrayList();
        ArrayList arrayOctavaYIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMOY = new ArrayList();
        ArrayList sumamaxEMOY = new ArrayList();

        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaYIEM.size(); i++) {
            arrayOctavaYIndiceDBNCEM = aem2.extraerNumeroClustersOctavaY1(i);
            arrayOctavaYIndiceDBNIEM = aem2.extraerInstanciasOctavaYN(i, myArrayOY);
            arrayOctavaYIndiceDBNC1EM = aem2.extraerCentroideOctavaYN(i, myArrayOY);
            sumadDBEMOY = indDB.distanciaCluster(arrayOctavaYIndiceDBNCEM, arrayOctavaYIndiceDBNIEM, arrayOctavaYIndiceDBNC1EM);
            arraySCKEMOY.add(String.valueOf(sumadDBEMOY));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayOctavaYCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMOY = indDB.distanciaSeparacionCluster1(arrayOctavaYCEM, arraySCKEMOY);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMOY.size(); i++) {
            sumaMaximosOY = Double.parseDouble((String) sumamaxEMOY.get(i));

            if (Double.isNaN(sumaMaximosOY) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximosOY);
                sumaMaxTotalEMOY = sumaMaxTotalEMOY + Double.parseDouble((String) sumamaxEMOY.get(i));
                numClusterDBEMOY = numClusterDBEMOY + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEMOY);
        System.out.println("Numero de cLUSTER " + numClusterDBEMOY);
        indiceDBEMOY = (1 / numClusterDBEMOY) * sumaMaxTotalEMOY;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMOY);
        guiARecomendar.jOYIndiceDBEM.setText(String.valueOf(indiceDBEMOY));

        ///////////////////////// PROCEDIMIENTO PARA EM ////////////////////////////////////   
        ArrayList banarrayOctavaZECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayOctavaZECEM1 = new ArrayList(); // instancias bandera
        ArrayList finalarrayOctavaZECEM2 = new ArrayList(); // instancias bandera

        int myArrayOZ[][];

        /////////// TEMPO EN EM X ////////////////////////////
        int contEMOZ = -1;
        for (int i = 0; i < 11; i++) {
            // System.out.println("Cluster " + i);
            banarrayOctavaZECEM1 = aem2.extraerInstanciasOctavaZ(i);
            if (!(banarrayOctavaZECEM1.isEmpty())) {
                contEMOZ = contEMOZ + 1;
                for (int j = 0; j < banarrayOctavaZECEM1.size(); j++) {
                    //System.out.println("Cluster "+ contEM + "Instanacias "+ banarrayTempoXECEM1.get(j));
                    finalarrayOctavaZECEM1.add(String.valueOf(contEMOZ));
                    finalarrayOctavaZECEM2.add(banarrayOctavaZECEM1.get(j).toString());
                }
            }
        }
        for (int i = 0; i < finalarrayOctavaZECEM1.size(); i++) {
            System.out.println(finalarrayOctavaZECEM1.get(i) + "," + finalarrayOctavaZECEM2.get(i));
        }

        myArrayOZ = new int[finalarrayOctavaZECEM1.size()][2];

        for (int k = 0; k < finalarrayOctavaZECEM1.size(); k++) {
            // System.out.println("Cluster  " + finalarrayTempoXECEM1.get(k) + "  Instancia " + finalarrayTempoXECEM2.get(k));
            myArrayOZ[k][0] = Integer.parseInt(finalarrayOctavaZECEM1.get(k).toString());
            myArrayOZ[k][1] = Integer.parseInt(finalarrayOctavaZECEM2.get(k).toString());
        }

                  // Intanciamos Arreglos Duración
        /////////// DURACION EN EM X ////////////////////////////
        //arrayTempoXECEM = aem.extraerNumClusterTempoX(); // Estrae numero de cluster
        arrayOctavaZECEM = finalarrayOctavaZECEM1; // Estrae numero de cluster
        arrayOctavaZNCEM = arrayOctavaZECEM;
        // arrayTempoXECEM1 = aem.extraerInstanciasTempoXTodas();  // estaer instancias asociadas a los numeros de cluster
        arrayOctavaZECEM1 = finalarrayOctavaZECEM2;
        arrayOctavaZNIEM = arrayOctavaZECEM1;

        for (int i = 0; i < arrayOctavaZECEM.size(); i++) {
            guiARecomendar.areaOctavaZECEM.append((String) "Cluster " + arrayOctavaZECEM.get(i) + " Instancia " + arrayOctavaZECEM1.get(i) + " \n");
        }

        ////////////////////// EXTRAER TOTAL INSTANCIAS TEMPO EN X /////////     
        arrayOctavaZIEM = aem2.instanciaOctavaZ();
        arrayOctavaZIpruebaEM = arrayOctavaZIEM;
        for (int i = 0; i < arrayOctavaZIEM.size(); i++) {
            guiARecomendar.areaOctavaZIEM.append((String) "[Cluster " + i + "]" + arrayOctavaZIEM.get(i) + " Instancias" + " \n");
        }

        /////// EXTRAER CENTROIDE TEMPO EN X ////////////////// 
        arrayOctavaZCEM = aem2.centroideOctavaZ();
        arrayOctavaZCpruebaEM = arrayOctavaZCEM;
        for (int i = 0; i < arrayOctavaZCEM.size(); i++) {
            guiARecomendar.areaOctavaZCEM.append((String) "[Cluster " + i + "]" + " [ " + arrayOctavaZCEM.get(i) + " ]" + " \n");

            numClusterEMZO = i;

            // numClusterEMZO = i;
        }

        calculoOZEM1 = cal2.calculoPosision(arrayOctavaZCEM);
        arrayOctavaZTpruebaEM = calculoOZEM1;
        for (int i = 0; i < calculoOZEM1.size(); i++) {
            guiARecomendar.areaOctavaZTEM.append((String) "[Cluster " + i + "]" + calculoOZEM1.get(i) + " \n");
        }

                      ////////// INDICE DE VALIDEZ CALINSKI - HARABASZ ////////////////
        //PROCESO CALINSKY HARABAZ
        double sumadEMOZ = 0;
        double sumad1EMOZ = 0;
        double cenGeneralEMOZ = 0;
        double indiceValidezEMOZ = 0;
        double indiceValidez1EMOZ = 0;
        double indiceValidezfinalEMOZ = 0;
        int contaOZ = 0;
        ArrayList arrayOctavaZIndiceXNCEM = new ArrayList();
        ArrayList arrayOctavaZIndiceXNIEM = new ArrayList();
        ArrayList arrayOctavaZIndiceXCEM = new ArrayList();

        for (int i = 0; i < arrayOctavaZIEM.size(); i++) {
            contaOZ = contaOY + 1;
            arrayOctavaZIndiceXNCEM = aem2.extraerNumeroClustersOctavaZ1(i); // Estraer numero de clusert
            arrayOctavaZIndiceXNIEM = aem2.extraerInstanciasOctavaZN(i, myArrayOZ); // Extraer numero de lcuster
            arrayOctavaZIndiceXCEM = aem2.extraerCentroideOctavaZN(i, myArrayOZ); // Extraer centroide de acuerdo a bandera

            sumadEMOZ = sumadEMOZ + indCH.distanciaCluster(arrayOctavaZIndiceXNCEM, arrayOctavaZIndiceXNIEM, arrayOctavaZIndiceXCEM);

        }
        System.out.println("Contador /////////////////////////////////////////////////// " + contaOZ);

        cenGeneralEMOZ = indCH.calculoCentroideGeneral(arrayOctavaZECEM1);
        System.out.println("Centroide General /////////////////////////////////////////////////// " + cenGeneralEMOZ);
        sumad1EMOZ = indCH.distanciaSeparacionCluster(arrayOctavaZCEM, cenGeneralEMOZ, arrayOctavaZIEM);
        numClusterEMZO = numClusterEMZO + 1;
        numElementosEMZO = aem2.instanciaOctavaZ3();
        indiceValidezEMOZ = sumad1EMOZ / sumadEMOZ;
        System.out.println("Sumad1 " + sumad1EMOZ + "/" + "Sumad " + sumadEMOZ);
        indiceValidez1EMOZ = (numElementosEMZO - numClusterEMZO) / (numClusterEMZO - 1);
        System.out.println("Num Elementos " + numElementosEMZO + " - " + " Num Elementos " + numElementosEMZO + " / " + numClusterEMZO);
        indiceValidezfinalEMOZ = indiceValidezEMOZ * indiceValidez1EMOZ;
        guiARecomendar.jOZIndiceCHEM.setText(String.valueOf(indiceValidezfinalEMOZ));
        System.out.println("(" + sumad1EMOZ + " / " + sumadEMOZ + ")" + " * " + "( " + numElementosEMZO + " - " + numClusterEMZO + ")" + " / " + numClusterEMZO + " - " + " 1");

        System.out.println("Calinsky Harabaz " + indiceValidezfinalEMOZ);

               //////////// PROCESO DAVID BOULDIN //////////////////
        //PROCESO DAVIES BOLUDIN
        double sumadDBEMOZ = 0;
        double sumaMaxTotalEMOZ = 0;
        double numClusterDBEMOZ = 0;
        double indiceDBEMOZ = 0;
        double sumaMaximosOZ = 0;

        ArrayList arrayOctavaZIndiceDBNCEM = new ArrayList();
        ArrayList arrayOctavaZIndiceDBNIEM = new ArrayList();
        ArrayList arrayOctavaZIndiceDBNC1EM = new ArrayList();
        ArrayList arraySCKEMOZ = new ArrayList();
        ArrayList sumamaxEMOZ = new ArrayList();

        //////////// DENOMINADOR ///////////
        for (int i = 0; i < arrayOctavaZIEM.size(); i++) {
            arrayOctavaZIndiceDBNCEM = aem2.extraerNumeroClustersOctavaZ1(i);
            arrayOctavaZIndiceDBNIEM = aem2.extraerInstanciasOctavaZN(i, myArrayOZ);
            arrayOctavaZIndiceDBNC1EM = aem2.extraerCentroideOctavaZN(i, myArrayOZ);
            sumadDBEMOZ = indDB.distanciaCluster(arrayOctavaZIndiceDBNCEM, arrayOctavaZIndiceDBNIEM, arrayOctavaZIndiceDBNC1EM);
            arraySCKEMOZ.add(String.valueOf(sumadDBEMOZ));
        }
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        indDB.distanciaSeparacionCluster(arrayOctavaZCEM);
        ///////// (SCK / SCL) / D(CK, CL) /////////////      
        System.out.println("(SCK / SCL) / D(CK, CL)");
        // calculoIndiceValidezDB cal3 = new calculoIndiceValidezDB();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        sumamaxEMOZ = indDB.distanciaSeparacionCluster1(arrayOctavaZCEM, arraySCKEMOZ);

        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (int i = 0; i < sumamaxEMOZ.size(); i++) {
            sumaMaximosOZ = Double.parseDouble((String) sumamaxEMOZ.get(i));

            if (Double.isNaN(sumaMaximosOZ) == true) {

            } else {
                System.out.println("La distancia maxima " + i + " es: " + sumaMaximosOZ);
                sumaMaxTotalEMOZ = sumaMaxTotalEMOZ + Double.parseDouble((String) sumamaxEMOZ.get(i));
                numClusterDBEMOZ = numClusterDBEMOZ + 1;

            }
        }

        System.out.println("La suma de maximos es :" + sumaMaxTotalEMOZ);
        System.out.println("Numero de cLUSTER " + numClusterDBEMOZ);
        indiceDBEMOZ = (1 / numClusterDBEMOZ) * sumaMaxTotalEMOZ;
        System.out.println("El indice Davies Bouldin es:  " + indiceDBEMOZ);
        guiARecomendar.jOZIndiceDBEM.setText(String.valueOf(indiceDBEMOZ));

        /////////////////////////////////
        System.out.println("**** Inicializara el Proceso de Fusión *****");
        ACLMessage msg = new ACLMessage(ACLMessage.UNKNOWN);
        msg.addReceiver(new AID("Planeador", AID.ISLOCALNAME));
        myAgent.send(msg);
        /////////////////// CREARE AGENTE FUSION ////////////
    }

    @Override
    public boolean done() {

        return fin;
    }

}
