package Clustering;

import java.util.ArrayList;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.SimpleKMeans;
import weka.core.Instance;
import weka.core.Instances;
import weka.experiment.InstanceQuery;
import ObjeAux.conectar;

public class kMeans {

    InstanceQuery query1, query2, query3, query4, query5, query6, query7, query8, query9, query10, query11;
    Instances dataset1, dataset2, dataset3, dataset4, dataset5, dataset6, dataset7, dataset8, dataset9, dataset10, dataset11, datosPrueba;
    SimpleKMeans clusterer1, clusterer2, clusterer3, clusterer4, clusterer5, clusterer6, clusterer7, clusterer8, clusterer9, clusterer10, clusterer11;
    ClusterEvaluation evaluadorCluster;
    String resultado;
    String resultado1;

    public kMeans(int Clusters, int iter, String emocion) {
        try {
            ////////////// TEMPO X //////////////
            query1 = new InstanceQuery();
            query1.setDatabaseURL(conectar.url);
            query1.setUsername(conectar.usr);
            query1.setPassword(conectar.psw);

           // query1.setQuery("select ParametrosMusicales.tempoX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado >= 5");
            //  query1.setQuery("select ParametrosMusicales.tempoX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado < 5");
          //  query1.setQuery("select ParametrosMusicales.tempoX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado < 5");
           // query1.setQuery("select ParametrosMusicales.tempoX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado >= 5");
            query1.setQuery("select ParametrosMusicales.tempoX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");

            dataset1 = query1.retrieveInstances();
            /////////////// TEMPO Y ////////////////// 
            query2 = new InstanceQuery();
            query2.setDatabaseURL(conectar.url);
            query2.setUsername(conectar.usr);
            query2.setPassword(conectar.psw);

           // query2.setQuery("select ParametrosMusicales.tempoY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado >= 5");       
             // query2.setQuery("select ParametrosMusicales.tempoY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado < 5");       
           // query2.setQuery("select ParametrosMusicales.tempoY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado < 5");       
            // query2.setQuery("select ParametrosMusicales.tempoY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado >= 5");       
            query2.setQuery("select ParametrosMusicales.tempoY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset2 = query2.retrieveInstances();
            /////////// TEMPO Z ////////////////////
            query3 = new InstanceQuery();
            query3.setDatabaseURL(conectar.url);
            query3.setUsername(conectar.usr);
            query3.setPassword(conectar.psw);
       //   query3.setQuery("select ParametrosMusicales.tempoZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado >= 5");

          //  query3.setQuery("select ParametrosMusicales.tempoZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado < 5");
           // query3.setQuery("select ParametrosMusicales.tempoZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado < 5");
            //query3.setQuery("select ParametrosMusicales.tempoZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado >= 5");
            query3.setQuery("select ParametrosMusicales.tempoZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset3 = query3.retrieveInstances();
            ///////// DURACION X ////////////////
            query4 = new InstanceQuery();
            query4.setDatabaseURL(conectar.url);
            query4.setUsername(conectar.usr);
            query4.setPassword(conectar.psw);

           //query4.setQuery("select ParametrosMusicales.duraX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado  >= 5");
          //  query4.setQuery("select ParametrosMusicales.duraX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado < 5");
         //  query4.setQuery("select ParametrosMusicales.duraX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado < 5");
            //query4.setQuery("select ParametrosMusicales.duraX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado >= 5");
            query4.setQuery("select ParametrosMusicales.duraX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset4 = query4.retrieveInstances();
            ////////// DURACION Y //////////////////
            query5 = new InstanceQuery();
            query5.setDatabaseURL(conectar.url);
            query5.setUsername(conectar.usr);
            query5.setPassword(conectar.psw);
        //    query5.setQuery("select ParametrosMusicales.duraY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado >= 5");

          //  query5.setQuery("select ParametrosMusicales.duraY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado < 5");
           // query5.setQuery("select ParametrosMusicales.duraY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado < 5");
           // query5.setQuery("select ParametrosMusicales.duraY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado >= 5");
            query5.setQuery("select ParametrosMusicales.duraY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset5 = query5.retrieveInstances();
            ////////// DURACION Z //////////////////
            query6 = new InstanceQuery();
            query6.setDatabaseURL(conectar.url);
            query6.setUsername(conectar.usr);
            query6.setPassword(conectar.psw);
            //query6.setQuery("select ParametrosMusicales.duraZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado >= 5");

           // query6.setQuery("select ParametrosMusicales.duraZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion < 5 and Evaluacion.agrado < 5");
           // query6.setQuery("select ParametrosMusicales.duraZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado < 5");
            //query6.setQuery("select ParametrosMusicales.duraZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.activacion >= 5 and Evaluacion.agrado >= 5");
            query6.setQuery("select ParametrosMusicales.duraZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset6 = query6.retrieveInstances();
            ////////// OCTAVAS X //////////////////
            query7 = new InstanceQuery();
            query7.setDatabaseURL(conectar.url);
            query7.setUsername(conectar.usr);
            query7.setPassword(conectar.psw);
            query7.setQuery("select Lorenz.x from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset7 = query7.retrieveInstances();
            ////////// OCTAVAS Y //////////////////
            query8 = new InstanceQuery();
            query8.setDatabaseURL(conectar.url);
            query8.setUsername(conectar.usr);
            query8.setPassword(conectar.psw);
            query8.setQuery("select Lorenz.y from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset8 = query8.retrieveInstances();
            ////////// OCTAVAS Z //////////////////
            query9 = new InstanceQuery();
            query9.setDatabaseURL(conectar.url);
            query9.setUsername(conectar.usr);
            query9.setPassword(conectar.psw);
            query9.setQuery("select Lorenz.z from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");
            dataset9 = query9.retrieveInstances();

            // Crear y configurar algoritmo de clustering
            System.out.println("Creacion de clusters...");

            clusterer1 = new SimpleKMeans();//solo datos numericos
            clusterer1.setNumClusters(Clusters);
            clusterer1.setMaxIterations(iter);

            clusterer2 = new SimpleKMeans();//solo datos numericos
            clusterer2.setNumClusters(Clusters);
            clusterer2.setMaxIterations(iter);

            clusterer3 = new SimpleKMeans();//solo datos numericos
            clusterer3.setNumClusters(Clusters);
            clusterer3.setMaxIterations(iter);

            clusterer4 = new SimpleKMeans();//solo datos numericos
            clusterer4.setNumClusters(Clusters);
            clusterer4.setMaxIterations(iter);

            clusterer5 = new SimpleKMeans();//solo datos numericos
            clusterer5.setNumClusters(Clusters);
            clusterer5.setMaxIterations(iter);

            clusterer6 = new SimpleKMeans();//solo datos numericos
            clusterer6.setNumClusters(Clusters);
            clusterer6.setMaxIterations(iter);

            clusterer7 = new SimpleKMeans();//solo datos numericos
            clusterer7.setNumClusters(Clusters);
            clusterer7.setMaxIterations(iter);

            clusterer8 = new SimpleKMeans();//solo datos numericos
            clusterer8.setNumClusters(Clusters);
            clusterer8.setMaxIterations(iter);

            clusterer9 = new SimpleKMeans();//solo datos numericos
            clusterer9.setNumClusters(Clusters);
            clusterer9.setMaxIterations(iter);

        } catch (Exception e) {
            System.out.println("Error en creacion de cluster: " + e.getMessage());
        }
    }

    public kMeans() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void trainCluster() {
        try {
            // Entrenar algoritmo de clustering
            System.out.println("Construyendo agrupaciones...");

            clusterer1.buildClusterer(dataset1);
            clusterer2.buildClusterer(dataset2);
            clusterer3.buildClusterer(dataset3);
            clusterer4.buildClusterer(dataset4);
            clusterer5.buildClusterer(dataset5);
            clusterer6.buildClusterer(dataset6);
            clusterer7.buildClusterer(dataset7);
            clusterer8.buildClusterer(dataset8);
            clusterer9.buildClusterer(dataset9);
        } catch (Exception e) {
            System.out.println("Error en construccion de agrupaciones: " + e.getMessage());
        }
    }

    public ArrayList extraerTempoX() {
        ArrayList listaTempoXEC = new ArrayList();
        try {
            int clusterNo;

            for (int i = 0; i < dataset1.numInstances(); i++) {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                listaTempoXEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset1.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXEC;
    }

    public ArrayList extraerNumeroClustersTempoX1(int ban) {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset1.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));

            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                if (clusterNo == ban) {

                    listaTempoXI.add(String.valueOf(clusterNo));
                }

            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;

    }

    public ArrayList extraerNumClusterTempoX() {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset1.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));

                listaTempoXI.add(String.valueOf(clusterNo));

            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;

    }

    public ArrayList extraerInstanciasTempoX(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset1.numInstances(); i++) {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset1.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaInstancias;
    }

    public ArrayList extraerInstanciasTempoXTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset1.numInstances(); i++) {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                listaInstancias.add(dataset1.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraercentroideTempoX(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset1.numInstances(); i++) {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
            }

            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

    public ArrayList extraerTempoY() {
        ArrayList listaTempoYEC = new ArrayList();
        try {
            int cont;
            cont = 0;
            int clusterNo;
            //  System.out.println("Asignación de instancias a clusters ...");
            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                listaTempoYEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset2.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoYEC;
    }

    public ArrayList extraerNumeroClustersTempoY1(int ban) {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(clusterNo));
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXI;
    }

    public ArrayList extraerNumClusterTempoY() {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset2.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                listaTempoXI.add(String.valueOf(clusterNo));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;

    }

    public ArrayList extraerInstanciasTempoY(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            //  System.out.println("Asignación de instancias a clusters ...");
            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset2.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaInstancias;
    }

    public ArrayList extraerInstanciasTempoYTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                listaInstancias.add(dataset2.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaInstancias;
    }

    public ArrayList extraercentroideTempoY(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
            }

            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXC;

    }

    public ArrayList extraerTempoZ() {

        ArrayList listaTempoZEC = new ArrayList();
        try {
            int cont;
            cont = 0;

            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset3.numInstances(); i++) {
                //instancia = dataset.instance(i);  
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                listaTempoZEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset3.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoZEC;
    }

    public ArrayList extraerNumeroClustersTempoZ1(int ban) {
        ArrayList listaTempoZI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset3.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                if (clusterNo == ban) {

                    listaTempoZI.add(String.valueOf(clusterNo));
                }

            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoZI;

    }

    public ArrayList extraerNumClusterTempoZ() {
        ArrayList listaTempoZI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset3.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                listaTempoZI.add(String.valueOf(clusterNo));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoZI;

    }

    public ArrayList extraerInstanciasTempoZ(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset3.numInstances(); i++) {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                if (clusterNo == ban) {

                    listaInstancias.add(dataset3.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaInstancias;
    }

    public ArrayList extraerInstanciasTempoZTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset3.numInstances(); i++) {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                listaInstancias.add(dataset3.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaInstancias;
    }

    public ArrayList extraercentroideTempoZ(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset3.numInstances(); i++) {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
            }

            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXC;

    }

///////// INSTANCIAS /////////////
    public ArrayList instanciaTempoX() {

        ArrayList listaTempoXI = new ArrayList();

               // System.out.println("HACER TABLA ...");
        try {

            int clusterNo;

            for (int i = 0; i < dataset1.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));

               // if (clusterNo == 0)
                //  resultado2 = "Tempo X Eder -> [Cluster "+clusterNo+"] Instancia: "+dataset1.instance(i).toString();
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                listaTempoXI.add(String.valueOf(pb));

            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;

    }

    public ArrayList instanciaTempoX1(int ban) {

        ArrayList listaTempoXI = new ArrayList();

               // System.out.println("HACER TABLA ...");
        try {

            int clusterNo;

            for (int i = 0; i < dataset1.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));

               // if (clusterNo == 0)
                //  resultado2 = "Tempo X Eder -> [Cluster "+clusterNo+"] Instancia: "+dataset1.instance(i).toString();
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;

    }

    public double instanciaTempoX2() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
               // System.out.println("HACER TABLA ...");

        try {

            int clusterNo;

            for (int i = 0; i < dataset1.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));

               // if (clusterNo == 0)
                //  resultado2 = "Tempo X Eder -> [Cluster "+clusterNo+"] Instancia: "+dataset1.instance(i).toString();
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                listaTempoXI.add(String.valueOf(pb));

            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

    public double instanciaTempoX3() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
               // System.out.println("HACER TABLA ...");

        try {

            int clusterNo;

            for (int i = 0; i < dataset1.numInstances(); i++) {
                con = con + 1.0;
                //instancia = dataset.instance(i);
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));

               // if (clusterNo == 0)
                //  resultado2 = "Tempo X Eder -> [Cluster "+clusterNo+"] Instancia: "+dataset1.instance(i).toString();
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {

                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                listaTempoXI.add(String.valueOf(pb));

            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

            /////////////// INSTANCIAS //////////////
    public ArrayList instanciaTempoY() {
        ArrayList listaTempoYI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoYI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoYI;
    }

    public ArrayList instanciaTempoY1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));

            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaTempoY2() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
               // System.out.println("HACER TABLA ...");

        try {
            int clusterNo;
            for (int i = 0; i < dataset2.numInstances(); i++) {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return con;
    }

    public double instanciaTempoY3() {
        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
        // System.out.println("HACER TABLA ...");
        try {
            int clusterNo;
            for (int i = 0; i < dataset2.numInstances(); i++) {
                con = con + 1.0;
                //instancia = dataset.instance(i);
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {

                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

                          //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

    public ArrayList instanciaTempoZ() {

        ArrayList listaTempoZI = new ArrayList();

        try {

            int clusterNo;

            for (int i = 0; i < dataset3.numInstances(); i++) {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));

            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;
            int pb;

            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];

                listaTempoZI.add(String.valueOf(pb));

            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoZI;

    }

    public ArrayList instanciaTempoZ1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset3.numInstances(); i++) {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));

            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaTempoZ2() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
               // System.out.println("HACER TABLA ...");

        try {
            int clusterNo;
            for (int i = 0; i < dataset3.numInstances(); i++) {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return con;
    }

    public double instanciaTempoZ3() {
        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
        // System.out.println("HACER TABLA ...");
        try {
            int clusterNo;
            for (int i = 0; i < dataset3.numInstances(); i++) {
                con = con + 1.0;
                //instancia = dataset.instance(i);
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

      /////////// centroides tempos ///////////////     
    public ArrayList<String> centroideTempoX() {
        ArrayList<String> listaTempoXC = new ArrayList<String>();
        try {
            int clusterNo;
            for (int i = 0; i < dataset1.numInstances(); i++) {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));

            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaTempoXC.add(centroide.toString());

            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

                //////
    public ArrayList<String> centroideTempoY() {

        ArrayList<String> listaTempoYC = new ArrayList<String>();
        try {
            int clusterNo;

            for (int i = 0; i < dataset2.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer2.getClusterSizes();
            Instances centroides = clusterer2.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer2.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                listaTempoYC.add(centroide.toString());

            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoYC;

    }

    public ArrayList<String> centroideTempoZ() {

        ArrayList<String> listaTempoZC = new ArrayList<String>();
        try {
            int clusterNo;

            for (int i = 0; i < dataset3.numInstances(); i++) {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer3.getClusterSizes();
            Instances centroides = clusterer3.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer3.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaTempoZC.add(centroide.toString());
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoZC;

    }

  /////////////////// DURACIÓN ///////////////////////////
    public ArrayList extraerDuracionX() {
        ArrayList listaDuracionXEC = new ArrayList();
        try {
            int cont;
            cont = 0;
            int clusterNo;

            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                listaDuracionXEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset1.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaDuracionXEC;
    }

    public ArrayList extraerNumeroClustersDuracionX1(int ban) {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset4.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));

            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];

                //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                if (clusterNo == ban) {
                    listaDuracionXI.add(String.valueOf(clusterNo));
                }

            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXI;
    }

    public ArrayList extraerNumClusterDuracionX() {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset4.numInstances(); i++) {
                //instancia = dataset.instance(i);
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));

                listaDuracionXI.add(String.valueOf(clusterNo));

            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXI;

    }

    public ArrayList extraerInstanciasDuracionX(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset4.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaInstancias;
    }

    public ArrayList extraerInstanciasDuracionXTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
          //  System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                listaInstancias.add(dataset4.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraercentroideDuracionX(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
            }

            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

///////////////////////////////////////////   
    public ArrayList extraerDuracionY() {
        ArrayList listaDuracionYEC = new ArrayList();
        try {
            int cont;
            cont = 0;
            int clusterNo;
            //System.out.println("Asignación de instancias a clusters ...");
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                listaDuracionYEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset5.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionYEC;
    }

    public ArrayList extraerNumeroClustersDuracionY1(int ban) {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
            }
            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaDuracionXI.add(String.valueOf(clusterNo));
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaDuracionXI;
    }

    public ArrayList extraerNumClusterDuracionY() {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));

                listaDuracionXI.add(String.valueOf(clusterNo));
            }
            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXI;

    }

    public ArrayList extraerInstanciasDuracionY(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset5.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraerInstanciasDuracionYTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                listaInstancias.add(dataset5.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraercentroideDuracionY(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
            }

            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

////////////////////////////
    public ArrayList extraerDuracionZ() {
        ArrayList listaDuracionZEC = new ArrayList();
        try {
            int cont;
            cont = 0;
            int clusterNo;

            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                listaDuracionZEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset6.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionZEC;
    }

    public ArrayList extraerNumeroClustersDuracionZ1(int ban) {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
            }
            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaDuracionXI.add(String.valueOf(clusterNo));
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaDuracionXI;
    }

    public ArrayList extraerNumClusterDuracionZ() {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));

                listaDuracionXI.add(String.valueOf(clusterNo));
            }
            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXI;

    }

    public ArrayList extraerInstanciasDuracionZ(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset6.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraerInstanciasDuracionZTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                listaInstancias.add(dataset6.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraercentroideDuracionZ(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
            }

            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

   //////////// DURACION INSTANCIAS ////////////////
    public ArrayList instanciaDuracionX() {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;

            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXI;
    }

    public ArrayList instanciaDuracionX1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaDuracionX2() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
               // System.out.println("HACER TABLA ...");

        try {

            int clusterNo;

            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
            }

            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));

            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

    public double instanciaDuracionX3() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;

        try {
            int clusterNo;

            for (int i = 0; i < dataset4.numInstances(); i++) {
                con = con + 1.0;
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

    public ArrayList instanciaDuracionY() {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;

            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXI;
    }

    public ArrayList instanciaDuracionY1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaDuracionY2() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
        try {

            int clusterNo;

            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
            }

            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

    public double instanciaDuracionY3() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;

        try {
            int clusterNo;

            for (int i = 0; i < dataset5.numInstances(); i++) {
                con = con + 1.0;
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

    public ArrayList instanciaDuracionZ() {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;

            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXI;
    }

    public ArrayList instanciaDuracionZ1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaDuracionZ2() {
        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
            }

            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;
    }

    public double instanciaDuracionZ3() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;

        try {
            int clusterNo;

            for (int i = 0; i < dataset6.numInstances(); i++) {
                con = con + 1.0;
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }
             ///////////////// centroides duracion /////////////////////////

    public ArrayList<String> centroideDuracionX() {
        ArrayList<String> listaDuracionXC = new ArrayList<String>();
        try {
            int clusterNo;
            for (int i = 0; i < dataset4.numInstances(); i++) {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer4.getClusterSizes();
            Instances centroides = clusterer4.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer4.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaDuracionXC.add(centroide.toString());
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXC;
    }

    public ArrayList<String> centroideDuracionY() {
        ArrayList<String> listaDuracionYC = new ArrayList<String>();
        try {
            int clusterNo;
            for (int i = 0; i < dataset5.numInstances(); i++) {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer5.getClusterSizes();
            Instances centroides = clusterer5.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer5.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaDuracionYC.add(centroide.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionYC;
    }

    public ArrayList<String> centroideDuracionZ() {
        ArrayList<String> listaDuracionZC = new ArrayList<String>();
        try {
            int clusterNo;
            for (int i = 0; i < dataset6.numInstances(); i++) {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer6.getClusterSizes();
            Instances centroides = clusterer6.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer6.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaDuracionZC.add(centroide.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionZC;
    }

     /////////////////// OCTAVAS  //////////////////////// 
    // OCTAVAS EN X //
    public ArrayList extraerOctavaX() {
        ArrayList listaDuracionZEC = new ArrayList();
        try {
            int cont;
            cont = 0;
            int clusterNo;

            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                listaDuracionZEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset7.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionZEC;
    }

    public ArrayList extraerNumeroClustersOctavaX1(int ban) {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
            }
            int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaDuracionXI.add(String.valueOf(clusterNo));
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaDuracionXI;
    }

    public ArrayList extraerNumClusterOctavaX() {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));

                listaDuracionXI.add(String.valueOf(clusterNo));
            }
            int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXI;
    }

    public ArrayList extraerInstanciasOctavaX(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset7.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraerInstanciasOctavaXTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                listaInstancias.add(dataset7.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraercentroideOctavaX(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
            }

            int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

         //////////////  OCTAVA EN Y /////////// 
 // OCTAVAS EN Y //
    public ArrayList extraerOctavaY() {
        ArrayList listaDuracionZEC = new ArrayList();
        try {
            int cont;
            cont = 0;
            int clusterNo;

            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                listaDuracionZEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset8.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionZEC;
    }

    public ArrayList extraerNumeroClustersOctavaY1(int ban) {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
            }
            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaDuracionXI.add(String.valueOf(clusterNo));
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaDuracionXI;
    }

    public ArrayList extraerNumClusterOctavaY() {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));

                listaDuracionXI.add(String.valueOf(clusterNo));
            }
            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXI;

    }

    public ArrayList extraerInstanciasOctavaY(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset8.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraerInstanciasOctavaYTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                listaInstancias.add(dataset8.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraercentroideOctavaY(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
            }

            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

        //////////////  OCTAVA EN Z /////////// 
 // OCTAVAS EN Z //
    public ArrayList extraerOctavaZ() {
        ArrayList listaDuracionZEC = new ArrayList();
        try {
            int cont;
            cont = 0;
            int clusterNo;

            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                listaDuracionZEC.add("[Cluster " + clusterNo + "] Instancia: " + dataset9.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionZEC;
    }

    public ArrayList extraerNumeroClustersOctavaZ1(int ban) {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
            }
            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaDuracionXI.add(String.valueOf(clusterNo));
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaDuracionXI;
    }

    public ArrayList extraerNumClusterOctavaZ() {
        ArrayList listaDuracionXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));

                listaDuracionXI.add(String.valueOf(clusterNo));
            }
            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionXI;

    }

    public ArrayList extraerInstanciasOctavaZ(int ban) {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                if (clusterNo == ban) {
                    listaInstancias.add(dataset9.instance(i).toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraerInstanciasOctavaZTodas() {
        ArrayList listaInstancias = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                listaInstancias.add(dataset9.instance(i).toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaInstancias;
    }

    public ArrayList extraercentroideOctavaZ(int ban) {
        ArrayList listaTempoXC = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
            }

            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;

            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);

                if (clusterNo == ban) {
                    listaTempoXC.add(centroide.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXC;
    }

         //////////////  OCTAVA  INSTANCIA EN X /////////// 
    public ArrayList instanciaOctavaX() {
        ArrayList listaOctavaXI = new ArrayList();
        try {
            int clusterNo;

            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                // System.out.println("Valor ///////////////////////////////////////////////////////////////////////////////////////// " + pb);
                listaOctavaXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaOctavaXI;
    }

    public ArrayList instanciaOctavaX1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaOctavaX2() {
        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
            }

            int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;
    }

    public double instanciaOctavaX3() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;

        try {
            int clusterNo;

            for (int i = 0; i < dataset7.numInstances(); i++) {
                con = con + 1.0;
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

                //////////////  OCTAVA  INSTANCIA EN Y /////////// 
    public ArrayList instanciaOctavaY() {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;

            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXI;
    }

    public ArrayList instanciaOctavaY1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaOctavaY2() {
        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
            }

            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;
    }

    public double instanciaOctavaY3() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;

        try {
            int clusterNo;

            for (int i = 0; i < dataset8.numInstances(); i++) {
                con = con + 1.0;
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

      /////////// Octava Z /////////      
    public ArrayList instanciaOctavaZ() {
        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;

            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }
        return listaTempoXI;
    }

    public ArrayList instanciaOctavaZ1(int ban) {

        ArrayList listaTempoXI = new ArrayList();
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
            }
            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                if (clusterNo == ban) {
                    listaTempoXI.add(String.valueOf(pb));

                }
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaTempoXI;
    }

    public double instanciaOctavaZ2() {
        ArrayList listaTempoXI = new ArrayList();
        double con = 0;
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
            }

            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;
            int pb;
            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;
    }

    public double instanciaOctavaZ3() {

        ArrayList listaTempoXI = new ArrayList();
        double con = 0;

        try {
            int clusterNo;

            for (int i = 0; i < dataset9.numInstances(); i++) {
                con = con + 1.0;
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;
            int pb;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return con;

    }

           ///////////////// centroides duracion /////////////////////////
    public ArrayList<String> centroideOctavaX() {
        ArrayList<String> listaOctavaXC = new ArrayList<String>();
        try {
            int clusterNo;
            for (int i = 0; i < dataset7.numInstances(); i++) {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
            }

             // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            // int[] tamanoClusters = clusterer7.getClusterSizes();
            Instances centroides = clusterer7.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer7.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaOctavaXC.add(centroide.toString());
            }

        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaOctavaXC;
    }

    public ArrayList<String> centroideOctavaY() {
        ArrayList<String> listaDuracionYC = new ArrayList<String>();
        try {
            int clusterNo;
            for (int i = 0; i < dataset8.numInstances(); i++) {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer8.getClusterSizes();
            Instances centroides = clusterer8.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer8.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaDuracionYC.add(centroide.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionYC;
    }

    public ArrayList<String> centroideOctavaZ() {
        ArrayList<String> listaDuracionZC = new ArrayList<String>();
        try {
            int clusterNo;
            for (int i = 0; i < dataset9.numInstances(); i++) {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer9.getClusterSizes();
            Instances centroides = clusterer9.getClusterCentroids();
            Instance centroide;
            // System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer9.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                listaDuracionZC.add(centroide.toString());
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return listaDuracionZC;
    }

    public String imprimirClusters() {
        String resultado2 = null;

        System.out.println("HACER TABLA ...");

        try {
            int clusterNo;
            System.out.println("Asignación de instancias a clusters ...");

            for (int i = 0; i < dataset1.numInstances(); i++) {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
            }

            // Imprimir centroides (sólo con SimpleKMeans [o similares])            
            int[] tamanoClusters = clusterer1.getClusterSizes();
            Instances centroides = clusterer1.getClusterCentroids();
            Instance centroide;
            System.out.println("Centroides k-means ...");
            for (clusterNo = 0; clusterNo < clusterer1.numberOfClusters(); clusterNo++) {
                centroide = centroides.instance(clusterNo);
                System.out.print("Tempo X -> Cluster " + clusterNo + " (" + tamanoClusters[clusterNo] + " instancias): ");
                System.out.println("Centroide[" + centroide.toString() + "]");
                //System.out.println(centroide.value(clusterNo));
            }
        } catch (Exception e) {
            System.out.println("Error en clustering: " + e.getMessage());
        }

        return resultado2;
    }

}
