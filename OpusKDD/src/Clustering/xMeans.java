/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clustering;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.SimpleKMeans;
import weka.clusterers.XMeans;
import weka.core.Instance;
import weka.core.Instances;
import weka.experiment.InstanceQuery;
import ObjeAux.conectar;

public class xMeans {
    InstanceQuery query1,query2, query3, query4, query5, query6, query7,query8,query9;
    Instances dataset1, dataset2, dataset3, dataset4,dataset5, dataset6, dataset7,dataset8,dataset9, datosPrueba;
    XMeans clusterer1,clusterer2, clusterer3, clusterer4, clusterer5, clusterer6, clusterer7, clusterer8, clusterer9;
    ClusterEvaluation evaluadorCluster;
    String resultado;
    String resultado1;
     
     public xMeans ( int Clusters,int iter, String emocion )
             {
                 try
                {    
                    ////////////// TEMPO X //////////////
                    query1= new InstanceQuery(); 
                    query1.setDatabaseURL(conectar.url);
                    query1.setUsername(conectar.usr);
                    query1.setPassword(conectar.psw);
                    query1.setQuery("select ParametrosMusicales.tempoX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset1 = query1.retrieveInstances();
                    /////////////// TEMPO Y ////////////////// 
                    query2= new InstanceQuery(); 
                    query2.setDatabaseURL(conectar.url);
                    query2.setUsername(conectar.usr);
                    query2.setPassword(conectar.psw);
                    query2.setQuery("select ParametrosMusicales.tempoY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset2 = query2.retrieveInstances();
                    /////////// TEMPO Z ////////////////////
                    query3= new InstanceQuery(); 
                     query3.setDatabaseURL(conectar.url);
                    query3.setUsername(conectar.usr);
                    query3.setPassword(conectar.psw);
                    query3.setQuery("select ParametrosMusicales.tempoZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset3 = query3.retrieveInstances();
                    ///////// DURACION X ////////////////
                    query4= new InstanceQuery(); 
                     query4.setDatabaseURL(conectar.url);
                    query4.setUsername(conectar.usr);
                    query4.setPassword(conectar.psw);
                    query4.setQuery("select ParametrosMusicales.duraX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset4 = query4.retrieveInstances();
                    ////////// DURACION Y //////////////////
                    query5= new InstanceQuery(); 
                     query5.setDatabaseURL(conectar.url);
                    query5.setUsername(conectar.usr);
                    query5.setPassword(conectar.psw);
                    query5.setQuery("select ParametrosMusicales.duraY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset5 = query5.retrieveInstances();
                    ////////// DURACION Z //////////////////
                    query6= new InstanceQuery(); 
                     query6.setDatabaseURL(conectar.url);
                    query6.setUsername(conectar.usr);
                    query6.setPassword(conectar.psw);
                    query6.setQuery("select ParametrosMusicales.duraZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset6 = query6.retrieveInstances();
                    ////////// OCTAVAS X //////////////////
                    query7= new InstanceQuery(); 
                     query7.setDatabaseURL(conectar.url);
                    query7.setUsername(conectar.usr);
                    query7.setPassword(conectar.psw);
                    query7.setQuery("select Lorenz.x from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset7 = query7.retrieveInstances();
                     ////////// OCTAVAS Y //////////////////
                    query8= new InstanceQuery(); 
                     query8.setDatabaseURL(conectar.url);
                    query8.setUsername(conectar.usr);
                    query8.setPassword(conectar.psw);
                    query8.setQuery("select Lorenz.y from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset8 = query8.retrieveInstances();
                    ////////// OCTAVAS Z //////////////////
                    query9= new InstanceQuery(); 
                     query9.setDatabaseURL(conectar.url);
                    query9.setUsername(conectar.usr);
                    query9.setPassword(conectar.psw);
                    query9.setQuery("select Lorenz.z from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
                    dataset9 = query9.retrieveInstances();
            
                    
                     // Crear y configurar algoritmo de clustering
                    System.out.println("Creacion de clusters...");
                    clusterer1 = new XMeans();//solo datos numericos
                    clusterer1.setMaxNumClusters(10);
                    clusterer1.setMaxIterations(iter);
                    
                    clusterer2 = new XMeans();//solo datos numericos
                    clusterer2.setMaxNumClusters(Clusters);
                    clusterer2.setMaxIterations(iter);
                    
                    clusterer3 = new XMeans();//solo datos numericos
                    clusterer2.setMaxNumClusters(Clusters);
                    clusterer3.setMaxIterations(iter);
                    ///////////////////
                    clusterer4 = new XMeans();
                    clusterer4.setMaxNumClusters(5);
                    clusterer4.setMaxIterations(iter);
                    
                    clusterer5 = new XMeans();
                    clusterer5.setMaxNumClusters(5);
                    clusterer5.setMaxIterations(iter);
                    
                    clusterer6 = new XMeans();
                    clusterer6.setMaxNumClusters(5);
                    clusterer6.setMaxIterations(iter);
                    /////////////////////////////
                    
                    clusterer7 = new XMeans();
                    clusterer7.setMaxNumClusters(5);
                    clusterer7.setMaxIterations(iter);
                    
                    clusterer8 = new XMeans();
                    clusterer8.setMaxNumClusters(5);
                    clusterer8.setMaxIterations(iter);
                    
                    clusterer9 = new XMeans();
                    clusterer9.setMaxNumClusters(5);
                    clusterer9.setMaxIterations(iter);
    
                }
        
                catch(Exception e)
                    {
                        System.out.println("Error en creacion de cluster: " + e.getMessage());
                    }
     }
     
      public void trainCluster()
    {
        try
        {
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
        }

        catch(Exception e)
        {
            System.out.println("Error en construccion de agrupaciones: " + e.getMessage());
        }
    }
      
      
      public ArrayList extraerTempoX()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset1.numInstances(); i++) 
            {      
              clusterNo = clusterer1.clusterInstance(dataset1.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset1.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersTempoX1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset1.numInstances(); i++) 
            {
            clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer1.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterTempoX()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset1.numInstances(); i++) 
                    {
                        clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasTempoX(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset1.numInstances(); i++) 
            {  
             clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset1.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasTempoXTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset1.numInstances(); i++) 
            {   
             clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
             listaInstancias.add(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideTempoX(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset1.numInstances(); i++) 
                        {
                        clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer1.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////

public ArrayList extraerTempoY()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset2.numInstances(); i++) 
            {      
              clusterNo = clusterer2.clusterInstance(dataset2.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset2.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersTempoY1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset2.numInstances(); i++) 
            {
            clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer2.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterTempoY()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset2.numInstances(); i++) 
                    {
                        clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasTempoY(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset2.numInstances(); i++) 
            {  
             clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset2.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasTempoYTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset2.numInstances(); i++) 
            {   
             clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
             listaInstancias.add(dataset2.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideTempoY(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset2.numInstances(); i++) 
                        {
                        clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer2.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////
  ////////////////////////////////////////////////////

public ArrayList extraerTempoZ()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset3.numInstances(); i++) 
            {      
              clusterNo = clusterer3.clusterInstance(dataset3.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset3.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersTempoZ1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset3.numInstances(); i++) 
            {
            clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer3.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterTempoZ()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset3.numInstances(); i++) 
                    {
                        clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasTempoZ(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset3.numInstances(); i++) 
            {  
             clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset3.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasTempoZTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset3.numInstances(); i++) 
            {   
             clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
             listaInstancias.add(dataset3.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideTempoZ(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset3.numInstances(); i++) 
                        {
                        clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer3.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////
           
       public ArrayList instanciaTempoX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset1.numInstances(); i++) 
            {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer1.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           
           
           
           
            public double instanciaTempoX2()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset1.numInstances(); i++) 
            {

                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer1.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaTempoX3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset1.numInstances(); i++) 
            {
                
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer1.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
            {
                
                centroide = centroides.instance(clusterNo);
                
                pb = tamanoClusters[clusterNo];
                
              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                
                listaTempoXI.add(String.valueOf(pb));
               
            
            }
                    
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
          
public ArrayList instanciaTempoY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset2.numInstances(); i++) 
            {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer2.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }

            public double instanciaTempoY2()
           {
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset2.numInstances(); i++) 
            {

                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer2.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaTempoY3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset2.numInstances(); i++) 
            {
                
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer2.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
       
       
     public ArrayList instanciaTempoZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset3.numInstances(); i++) 
            {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer3.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }

            public double instanciaTempoZ2()
           {
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset3.numInstances(); i++) 
            {

                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer3.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaTempoZ3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset3.numInstances(); i++) 
            {
                
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer3.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
             
             /////////// centroides tempos ///////////////     
           
                public ArrayList centroideTempoX()
           {
               ArrayList listaTempoXC = new ArrayList();
                try
                {
                    int clusterNo;


                    for (int i=0; i < dataset1.numInstances(); i++) 
                    {
                        clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                    }
                    Instances centroides = clusterer1.getClusterCenters();
                    Instance centroide;
                    for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        listaTempoXC.add(centroide.toString());
                    }
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXC;
           }
                
                
                public ArrayList centroideTempoY()
           {
               ArrayList listaTempoYC = new ArrayList();
                try
                {
                    
                     int clusterNo;
                    for (int i=0; i < dataset2.numInstances(); i++) 
                    {
                        clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                    }
                    Instances centroides = clusterer2.getClusterCenters();
                    Instance centroide;
                   // System.out.println("Centroides k-means ...");
                    for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        listaTempoYC.add(centroide.toString());
                    }
                    
                }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoYC;
           }
                
                
                public ArrayList centroideTempoZ()
           {
               ArrayList listaTempoZC = new ArrayList();
                try
                {
                    int clusterNo;
                    for (int i=0; i < dataset3.numInstances(); i++) 
                    {
                        clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                    }
                    Instances centroides = clusterer3.getClusterCenters();
                    Instance centroide;
                   // System.out.println("Centroides k-means ...");
                    for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        listaTempoZC.add(centroide.toString());
                    }
                }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoZC;
           }
                
/////////////////// DURACIÓN ///////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////                
                
public ArrayList extraerDuracionX()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset4.numInstances(); i++) 
            {      
              clusterNo = clusterer4.clusterInstance(dataset4.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset4.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersDuracionX1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset4.numInstances(); i++) 
            {
            clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer4.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterDuracionX()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset4.numInstances(); i++) 
                    {
                        clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasDuracionX(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset4.numInstances(); i++) 
            {  
             clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset4.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasDuracionXTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset4.numInstances(); i++) 
            {   
             clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
             listaInstancias.add(dataset4.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideDuracionX(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset4.numInstances(); i++) 
                        {
                        clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer4.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////

 public ArrayList extraerDuracionY()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset5.numInstances(); i++) 
            {      
              clusterNo = clusterer5.clusterInstance(dataset5.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset5.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersDuracionY1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset5.numInstances(); i++) 
            {
            clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer5.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterDuracionY()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset5.numInstances(); i++) 
                    {
                        clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasDuracionY(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset5.numInstances(); i++) 
            {  
             clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset5.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasDuracionYTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset5.numInstances(); i++) 
            {   
             clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
             listaInstancias.add(dataset5.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideDuracionY(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset5.numInstances(); i++) 
                        {
                        clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer5.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////

  ////////////////////////////////////////////////////

 public ArrayList extraerDuracionZ()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset6.numInstances(); i++) 
            {      
              clusterNo = clusterer6.clusterInstance(dataset6.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset6.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersDuracionZ1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset6.numInstances(); i++) 
            {
            clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer6.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterDuracionZ()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset6.numInstances(); i++) 
                    {
                        clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasDuracionZ(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset6.numInstances(); i++) 
            {  
             clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset6.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasDuracionZTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset6.numInstances(); i++) 
            {   
             clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
             listaInstancias.add(dataset6.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideDuracionZ(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset6.numInstances(); i++) 
                        {
                        clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer6.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////
           //////////// DURACION INSTANCIAS ////////////////
           
             public ArrayList instanciaDuracionX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset4.numInstances(); i++) 
            {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer4.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           
           
           
           
            public double instanciaDuracionX2()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset4.numInstances(); i++) 
            {

                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer4.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaDuracionX3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset4.numInstances(); i++) 
            {
                
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer4.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
                
                centroide = centroides.instance(clusterNo);
                
                pb = tamanoClusters[clusterNo];
                
              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                
                listaTempoXI.add(String.valueOf(pb));
               
            
            }
                    
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
      
            ////////////////////////
           
                 
             public ArrayList instanciaDuracionY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset5.numInstances(); i++) 
            {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer5.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           
           
           
           
            public double instanciaDuracionY2()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset5.numInstances(); i++) 
            {

                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer5.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaDuracionY3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset5.numInstances(); i++) 
            {
                
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer5.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
                
                centroide = centroides.instance(clusterNo);
                
                pb = tamanoClusters[clusterNo];
                
              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                
                listaTempoXI.add(String.valueOf(pb));
               
            
            }
                    
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
      
            ////////////////////////
            
             public ArrayList instanciaDuracionZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset6.numInstances(); i++) 
            {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer6.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           
           
           
           
            public double instanciaDuracionZ2()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset6.numInstances(); i++) 
            {

                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer6.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaDuracionZ3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset6.numInstances(); i++) 
            {
                
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer6.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
                
                centroide = centroides.instance(clusterNo);
                
                pb = tamanoClusters[clusterNo];
                
              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                
                listaTempoXI.add(String.valueOf(pb));
               
            
            }
                    
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
       
           
             ///////////////// centroides duracion /////////////////////////
             public ArrayList centroideDuracionX()
           {               
               ArrayList listaDuracionXC = new ArrayList();
                try
                {
                    int clusterNo;
            for (int i=0; i < dataset4.numInstances(); i++) 
            {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));     
            }

            Instances centroides = clusterer4.getClusterCenters();
            Instance centroide;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                
                listaDuracionXC.add(centroide.toString());
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaDuracionXC;
           }
                
                public ArrayList centroideDuracionY()
           {
               
               ArrayList listaDuracionYC = new ArrayList();
                try
                {               
                    int clusterNo;

            for (int i=0; i < dataset5.numInstances(); i++) 
            {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));     
            }

            Instances centroides = clusterer5.getClusterCenters();
            Instance centroide;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);          
                listaDuracionYC.add(centroide.toString());
            }     
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaDuracionYC; 
           }

                public ArrayList centroideDuracionZ()
           {              
               ArrayList listaDuracionZC = new ArrayList();
                try
                {                  
                    int clusterNo;
            for (int i=0; i < dataset6.numInstances(); i++) 
            {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));    
            }
            Instances centroides = clusterer6.getClusterCenters();
            Instance centroide;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);             
                listaDuracionZC.add(centroide.toString());  
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaDuracionZC;  
           }
  
    ///////////////////// OCTAVAS ////////////////////////

      public ArrayList extraerOctavaX()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset7.numInstances(); i++) 
            {      
              clusterNo = clusterer7.clusterInstance(dataset7.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset7.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersOctavaX1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset7.numInstances(); i++) 
            {
            clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer7.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterOctavaX()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset7.numInstances(); i++) 
                    {
                        clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasOctavaX(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset7.numInstances(); i++) 
            {  
             clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset7.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasOctavaXTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset7.numInstances(); i++) 
            {   
             clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
             listaInstancias.add(dataset7.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideOctavaX(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset7.numInstances(); i++) 
                        {
                        clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer7.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////

public ArrayList extraerOctavaY()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset8.numInstances(); i++) 
            {      
              clusterNo = clusterer8.clusterInstance(dataset8.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset8.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersOctavaY1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset8.numInstances(); i++) 
            {
            clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer8.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterOctavaY()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset8.numInstances(); i++) 
                    {
                        clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasOctavaY(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset8.numInstances(); i++) 
            {  
             clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset8.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasOctavaYTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset8.numInstances(); i++) 
            {   
             clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
             listaInstancias.add(dataset8.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideOctavaY(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset8.numInstances(); i++) 
                        {
                        clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer8.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

  ////////////////////////////////////////////////////
  ////////////////////////////////////////////////////

public ArrayList extraerOctavaZ()   
     {
         ArrayList listaTempoXEC= new ArrayList();
        try
            {            
            int cont;
            cont = 0;
            int clusterNo;
            for (int i=0; i < dataset9.numInstances(); i++) 
            {      
              clusterNo = clusterer9.clusterInstance(dataset9.instance(i));           
              listaTempoXEC.add("[Cluster "+clusterNo+"] Instancia: "+dataset9.instance(i).toString());           
            }   
     }  
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaTempoXEC;
     }

      public ArrayList extraerNumeroClustersOctavaZ1(int ban)
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
            for (int i=0; i < dataset9.numInstances(); i++) 
            {
            clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                
                if (clusterNo == 0)
                {
                   cont = cont + 1;
                }
                if (clusterNo == 1)
                {
                   cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                   cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                   cont3 = cont3 + 1;
                }  
                if (clusterNo == 4){
                   cont4 = cont4 + 1;
                } 
                if (clusterNo == 5){
                   cont5 = cont5 + 1;
                }  
                if (clusterNo == 6){
                   cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                   cont7 = cont7 + 1;
                }  
                if (clusterNo == 8){
                   cont8 = cont8 + 1;
                } 
                if (clusterNo == 9){
                   cont9 = cont9 + 1;
                }  
                if (clusterNo == 10){
                   cont10 = cont10 + 1;
                }
            }
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer9.getClusterCenters();
            Instance centroide;
            int pb;
                    for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
                    {
                        centroide = centroides.instance(clusterNo);
                        pb = tamanoClusters[clusterNo];
                        if (clusterNo == ban)
                        {
                        listaTempoXI.add(String.valueOf(clusterNo));
                        }
                    }      
            }
             catch(Exception e)
             {
                System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           


public ArrayList extraerNumClusterOctavaZ()
        
     { 
         ArrayList listaTempoXI = new ArrayList();
                try
                {
                int clusterNo;
                    for (int i=0; i < dataset9.numInstances(); i++) 
                    {
                        clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                        listaTempoXI.add(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
     }

public ArrayList extraerInstanciasOctavaZ(int ban)
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;   
            for (int i=0; i < dataset9.numInstances(); i++) 
            {  
             clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
               if (clusterNo == ban)
               {
              listaInstancias.add(dataset9.instance(i).toString());
               }
            }
     }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


     public ArrayList extraerInstanciasOctavaZTodas()
        
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {   
              int clusterNo;   
            for (int i=0; i < dataset9.numInstances(); i++) 
            {   
             clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
             listaInstancias.add(dataset9.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
     }
     


public  ArrayList extraercentroideOctavaZ(int ban)
           {
               ArrayList listaTempoXC = new ArrayList ();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0; 
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
                    
                    for (int i=0; i < dataset9.numInstances(); i++) 
                        {
                        clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                        Instances centroides = clusterer9.getClusterCenters();
                        Instance centroide;

                    for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
                        {
                         centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                    listaTempoXC.add(centroide.toString());
                                }
                        }    
                }
                
                 catch(Exception e)
                    {
                        System.out.println("Error en clustering: " + e.getMessage());
                    }
              return listaTempoXC; 
           }

 //////////// DURACION INSTANCIAS ////////////////
           
             public ArrayList instanciaOctavaX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset7.numInstances(); i++) 
            {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer7.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           
           
           
           
            public double instanciaOctavaX2()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset7.numInstances(); i++) 
            {

                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer7.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaOctavaX3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset7.numInstances(); i++) 
            {
                
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer7.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
                
                centroide = centroides.instance(clusterNo);
                
                pb = tamanoClusters[clusterNo];
                
              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                
                listaTempoXI.add(String.valueOf(pb));
               
            
            }
                    
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
      
            ////////////////////////
           
                 
             public ArrayList instanciaOctavaY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset8.numInstances(); i++) 
            {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer8.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           
           
           
           
            public double instanciaOctavaY2()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset8.numInstances(); i++) 
            {

                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer8.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaOctavaY3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset8.numInstances(); i++) 
            {
                
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer8.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
                
                centroide = centroides.instance(clusterNo);
                
                pb = tamanoClusters[clusterNo];
                
              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                
                listaTempoXI.add(String.valueOf(pb));
               
            
            }
                    
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
      
            ////////////////////////
            
             public ArrayList instanciaOctavaZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
            for (int i=0; i < dataset9.numInstances(); i++) 
            {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer9.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
           
           
           
           
            public double instanciaOctavaZ2()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset9.numInstances(); i++) 
            {

                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                
                 if (clusterNo == 0)
                {
                    cont = cont + 1;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer9.getClusterCenters();
            Instance centroide;
            int pb;
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
                centroide = centroides.instance(clusterNo);
                pb = tamanoClusters[clusterNo];
                listaTempoXI.add(String.valueOf(pb));
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
           }
           
           
            public double instanciaOctavaZ3()
           {
               
               ArrayList listaTempoXI = new ArrayList();
               double con = 0;
                try
                {
                    int cont = 0;
                    int cont1 = 0;
                    int cont2 = 0;
                    int cont3 = 0;
                    int cont4 = 0;
                    int cont5 = 0;
                    int cont6 = 0;
                    int cont7 = 0;
                    int cont8 = 0;
                    int cont9 = 0;
                    int cont10 = 0;
                    int clusterNo;
          
            for (int i=0; i < dataset9.numInstances(); i++) 
            {
                
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    con = con + 1.0;
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    con = con + 1.0;
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    con = con + 1.0;
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    con = con + 1.0;
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    con = con + 1.0;
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    con = con + 1.0;
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    con = con + 1.0;
                }
            }
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            Instances centroides = clusterer9.getClusterCenters();
            Instance centroide;
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
                
                centroide = centroides.instance(clusterNo);
                
                pb = tamanoClusters[clusterNo];
                
              //  listaTempoXI.add(clusterNo+tamanoClusters[clusterNo]);
                
                listaTempoXI.add(String.valueOf(pb));
               
            
            }
                    
                    
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            
            
///////////////// centroides duracion /////////////////////////
             public ArrayList centroideOctavaX()
           {               
               ArrayList listaDuracionXC = new ArrayList();
                try
                {
                    int clusterNo;
            for (int i=0; i < dataset7.numInstances(); i++) 
            {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));     
            }

            Instances centroides = clusterer7.getClusterCenters();
            Instance centroide;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);
                
                listaDuracionXC.add(centroide.toString());
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaDuracionXC;
           }
                
                public ArrayList centroideOctavaY()
           {
               
               ArrayList listaDuracionYC = new ArrayList();
                try
                {               
                    int clusterNo;

            for (int i=0; i < dataset8.numInstances(); i++) 
            {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));     
            }

            Instances centroides = clusterer8.getClusterCenters();
            Instance centroide;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);          
                listaDuracionYC.add(centroide.toString());
            }     
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaDuracionYC; 
           }

                public ArrayList centroideOctavaZ()
           {              
               ArrayList listaDuracionZC = new ArrayList();
                try
                {                  
                    int clusterNo;
            for (int i=0; i < dataset9.numInstances(); i++) 
            {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));    
            }
            Instances centroides = clusterer9.getClusterCenters();
            Instance centroide;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
                centroide = centroides.instance(clusterNo);             
                listaDuracionZC.add(centroide.toString());  
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaDuracionZC;  
           }
       

  ////////////////////////////////////////////////////
    
}
