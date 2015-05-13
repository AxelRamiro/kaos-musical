/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clustering;

import java.util.ArrayList;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.EM;
import weka.core.Instance;
import weka.core.Instances;
import weka.experiment.InstanceQuery;
import ObjeAux.conectar;
/**
 *
 * @author macbookair
 */
public class AEM {
    
    InstanceQuery query1, query2, query3, query4, query5, query6, query7, query8, query9;
    Instances dataset1, dataset2, dataset3, dataset4, dataset5, dataset6, dataset7, dataset8, dataset9;
    EM clusterer1, clusterer2, clusterer3, clusterer4, clusterer5, clusterer6, clusterer7, clusterer8, clusterer9;
    
    public AEM(int cluster,int iter, String emocion)
            
    {   
         try
        {
            query1= new InstanceQuery();   
            query2 = new InstanceQuery();
            query3 = new InstanceQuery();
            query4 = new InstanceQuery();
            query5 = new InstanceQuery();
            query6 = new InstanceQuery();
            query7 = new InstanceQuery();
            query8 = new InstanceQuery();
            query9 = new InstanceQuery();
            
            query1=new InstanceQuery();
             query1.setDatabaseURL(conectar.url);
             query1.setUsername(conectar.usr);
             query1.setPassword(conectar.psw);
            
              query2=new InstanceQuery();
             query2.setDatabaseURL(conectar.url);
             query2.setUsername(conectar.usr);
             query2.setPassword(conectar.psw);
            
             query3=new InstanceQuery();
             query3.setDatabaseURL(conectar.url);
             query3.setUsername(conectar.usr);
             query3.setPassword(conectar.psw);
            
            
             query4=new InstanceQuery();
             query4.setDatabaseURL(conectar.url);
             query4.setUsername(conectar.usr);
             query4.setPassword(conectar.psw);
            
             query5=new InstanceQuery();
             query5.setDatabaseURL(conectar.url);
             query5.setUsername(conectar.usr);
             query5.setPassword(conectar.psw);
            
            
            query6=new InstanceQuery();
             query6.setDatabaseURL(conectar.url);
             query6.setUsername(conectar.usr);
             query6.setPassword(conectar.psw);
            
            query7=new InstanceQuery();
             query7.setDatabaseURL(conectar.url);
             query7.setUsername(conectar.usr);
             query7.setPassword(conectar.psw);
            
            query8=new InstanceQuery();
             query8.setDatabaseURL(conectar.url);
             query8.setUsername(conectar.usr);
             query8.setPassword(conectar.psw);
            
            query9=new InstanceQuery();
             query9.setDatabaseURL(conectar.url);
             query9.setUsername(conectar.usr);
             query9.setPassword(conectar.psw);
                    
            query1.setQuery("select ParametrosMusicales.tempoX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset1 = query1.retrieveInstances();//Convertir los resultados de una consulta de base de datos en instancias.
            
            query2.setQuery("select ParametrosMusicales.tempoY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset2 = query2.retrieveInstances();
            
            query3.setQuery("select ParametrosMusicales.tempoZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset3 = query3.retrieveInstances();
            
            query4.setQuery("select ParametrosMusicales.duraX from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset4 = query4.retrieveInstances();
            
            query5.setQuery("select ParametrosMusicales.duraY from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset5 = query5.retrieveInstances();
            
            query6.setQuery("select ParametrosMusicales.duraZ from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset6 = query6.retrieveInstances();
         
            query7.setQuery("select Lorenz.x from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset7 = query7.retrieveInstances();
             ////////// OCTAVAS Y //////////////////
            query8.setQuery("select Lorenz.y from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset8 = query8.retrieveInstances();
            ////////// OCTAVAS Z //////////////////
            query9.setQuery("select Lorenz.z from Lorenz,OpusPrimaria,SistemaGenerador,Evaluacion where SistemaGenerador.nombreOpusPrimaria = OpusPrimaria.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and OpusPrimaria.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" +emocion +"'");
            dataset9 = query9.retrieveInstances();
            
            System.out.println("Proceso de Clustering con el Algoritmo EM");
            clusterer1=new EM();//Crear el clusterer
            clusterer1.setNumClusters(10);//Numero de Clases
            clusterer1.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
              clusterer2=new EM();//Crear el clusterer
            clusterer2.setNumClusters(10);//Numero de Clases
            clusterer2.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
            clusterer3=new EM();//Crear el clusterer
            clusterer3.setNumClusters(10);//Numero de Clases
            clusterer3.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
             clusterer4=new EM();//Crear el clusterer
            clusterer4.setNumClusters(5);//Numero de Clases
            clusterer4.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
             clusterer5=new EM();//Crear el clusterer
            clusterer5.setNumClusters(5);//Numero de Clases
            clusterer5.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
             clusterer6=new EM();//Crear el clusterer
            clusterer6.setNumClusters(5);//Numero de Clases
            clusterer6.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
             clusterer7=new EM();//Crear el clusterer
            clusterer7.setNumClusters(11);//Numero de Clases
            clusterer7.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
             clusterer8=new EM();//Crear el clusterer
            clusterer8.setNumClusters(11);//Numero de Clases
            clusterer8.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
            
             clusterer9=new EM();//Crear el clusterer
            clusterer9.setNumClusters(11);//Numero de Clases
            clusterer9.setSeed(iter);//Establece la semilla para generar un numero aleatorio.
        }
         catch(Exception e)
        {
            System.out.println("Error en Clustering: "+e.getMessage());
        }
    }
    public void EntrenarCluster()
       
    {
        try
        {
            //Entrenar al clusterer
          //  System.out.println("Entrenando...");
            clusterer1.buildClusterer(dataset1);//construye el cluster
            clusterer2.buildClusterer(dataset2);//construye el cluster
            clusterer3.buildClusterer(dataset3);//construye el cluster
            clusterer4.buildClusterer(dataset4);//construye el cluster
            clusterer5.buildClusterer(dataset5);//construye el cluster
            clusterer6.buildClusterer(dataset6);//construye el cluster
              clusterer7.buildClusterer(dataset7);//construye el cluster
            clusterer8.buildClusterer(dataset8);//construye el cluster
            clusterer9.buildClusterer(dataset9);//construye el cluster
          
        }catch(Exception e)
        {
            System.out.println("Error en clustering: " +e.getMessage());
        }
    }
      

    public void evaluarcluster()
    {
         Instance instancia;
            int nocluster;
        try
        {
            System.out.println("Asignacion de Cluster a cada instancia");
            for(int i=0; i<dataset1.numInstances();i++)
            {
                instancia = dataset1.instance(i);
                nocluster = clusterer1.clusterInstance(instancia);//clasifica a una instancia determinada, devolviendo el numero de grupo asignado
               // System.out.println("Tempo X --> [Cluster "+nocluster+"] Instancia: "+instancia.toString());//emite las agrupaciones generadas en una cadena
            }
            ClusterEvaluation eval=new ClusterEvaluation();//crea el objeto de evaluacion
            eval.setClusterer(clusterer1);//establecer el clusterer
            eval.evaluateClusterer(dataset1);//evalua el clusterer con las opciones dadas en una matriz de cadenas y devuelve una cadena que describe los resultados 
        }
        
        catch(Exception e)
        {
            System.out.println("Error en clustering: " + e.getMessage());
        }
     
    }

///////////////////    /////////////////////////////////////////////////////////////////////////////////////
///////////////////   /////////////////////////////////////////////////
    
    
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasTempoXN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                   dato = String.valueOf(cluster[f][1]);
                  // System.out.println(dato);
                   listaInstancias.add(dato);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideTempoXN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + cluster[f][1];       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[10];
                    suma = new double[10];
                    
                    for (int i=0; i < dataset1.numInstances(); i++) 
                        {
                        clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset1.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset1.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[10];
                    suma = new double[10];
            for (int i=0; i < dataset1.numInstances(); i++) 
            {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideTempoX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[10];
                    suma = new double[10];
                    
            for (int i=0; i < dataset1.numInstances(); i++) 
            {
                clusterNo = clusterer1.clusterInstance(dataset1.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset1.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset1.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer1.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////    TEMPO Y      //////////////////////////////////////////////////
            
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasTempoYN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                   dato = String.valueOf(cluster[f][1]);
                  // System.out.println(dato);
                   listaInstancias.add(dato);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideTempoYN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + cluster[f][1];       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[10];
                    suma = new double[10];
                    
                    for (int i=0; i < dataset2.numInstances(); i++) 
                        {
                        clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset2.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset2.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaTempoY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[10];
                    suma = new double[10];
            for (int i=0; i < dataset2.numInstances(); i++) 
            {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideTempoY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[10];
                    suma = new double[10];
                    
            for (int i=0; i < dataset2.numInstances(); i++) 
            {
                clusterNo = clusterer2.clusterInstance(dataset2.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset2.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset2.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer2.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }

            
            ///////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////////////////////////////////////
   ////////////////////////////     TEMPO Z     //////////////////////////////////////////////////
            
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasTempoZN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                   dato = String.valueOf(cluster[f][1]);
                  // System.out.println(dato);
                   listaInstancias.add(dato);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideTempoZN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + cluster[f][1];       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[10];
                    suma = new double[10];
                    
                    for (int i=0; i < dataset3.numInstances(); i++) 
                        {
                        clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset3.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset3.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaTempoZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[10];
                    suma = new double[10];
            for (int i=0; i < dataset3.numInstances(); i++) 
            {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideTempoZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[10];
                    suma = new double[10];
                    
            for (int i=0; i < dataset3.numInstances(); i++) 
            {
                clusterNo = clusterer3.clusterInstance(dataset3.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset3.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset3.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer3.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }

            
            
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////// DURACION EN X //////////////////////////////////////////////////////////////
            
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasDuracionXN(int ban, String [][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String fi;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             fi = cluster[f][0];
           
             clusterNo = Integer.parseInt(fi);
               if (clusterNo == ban)
               {
                   listaInstancias.add(cluster[f][1]);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideDuracionXN(int ban, String [][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
                String fi;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
            fi = cluster[f][0];
           
             clusterNo = Integer.parseInt(fi);
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + Double.parseDouble(cluster[f][1]);       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[10];
                    suma = new double[10];
                    
                    for (int i=0; i < dataset4.numInstances(); i++) 
                        {
                        clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset4.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset4.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaDuracionX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[10];
                    suma = new double[10];
            for (int i=0; i < dataset4.numInstances(); i++) 
            {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideDuracionX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[10];
                    suma = new double[10];
                    
            for (int i=0; i < dataset4.numInstances(); i++) 
            {
                clusterNo = clusterer4.clusterInstance(dataset4.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset4.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset4.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer4.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }

            

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////  DURACION Y /////////////////////////////////////////////////
            
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasDuracionYN(int ban, String [][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String fi;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             fi = cluster[f][0];
           
             clusterNo = Integer.parseInt(fi);
               if (clusterNo == ban)
               {
                   listaInstancias.add(cluster[f][1]);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideDuracionYN(int ban, String [][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
                String fi;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
            fi = cluster[f][0];
           
             clusterNo = Integer.parseInt(fi);
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + Double.parseDouble(cluster[f][1]);       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[10];
                    suma = new double[10];
                    
                    for (int i=0; i < dataset5.numInstances(); i++) 
                        {
                        clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset5.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset5.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaDuracionY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[10];
                    suma = new double[10];
            for (int i=0; i < dataset5.numInstances(); i++) 
            {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideDuracionY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[10];
                    suma = new double[10];
                    
            for (int i=0; i < dataset5.numInstances(); i++) 
            {
                clusterNo = clusterer5.clusterInstance(dataset5.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset5.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset5.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer5.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
        

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////  DURACION Z /////////////////////////////////////////////////
            
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasDuracionZN(int ban, String [][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String fi;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             fi = cluster[f][0];
           
             clusterNo = Integer.parseInt(fi);
               if (clusterNo == ban)
               {
                   listaInstancias.add(cluster[f][1]);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideDuracionZN(int ban, String [][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
                String fi;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
            fi = cluster[f][0];
           
             clusterNo = Integer.parseInt(fi);
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + Double.parseDouble(cluster[f][1]);       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[10];
                    suma = new double[10];
                    
                    for (int i=0; i < dataset6.numInstances(); i++) 
                        {
                        clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset6.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset6.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaDuracionZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[10];
                    suma = new double[10];
            for (int i=0; i < dataset6.numInstances(); i++) 
            {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideDuracionZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[10];
                    suma = new double[10];
                    
            for (int i=0; i < dataset6.numInstances(); i++) 
            {
                clusterNo = clusterer6.clusterInstance(dataset6.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset6.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset6.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer6.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
            
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
///////////////////// OCTAVAS /////////////////////////////////////////
            
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasOctavaXN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                   dato = String.valueOf(cluster[f][1]);
                  // System.out.println(dato);
                   listaInstancias.add(dato);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideOctavaXN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + cluster[f][1];       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[11];
                    suma = new double[11];
                    
                    for (int i=0; i < dataset7.numInstances(); i++) 
                        {
                        clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset7.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset7.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaOctavaX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[11];
                    suma = new double[11];
            for (int i=0; i < dataset7.numInstances(); i++) 
            {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideOctavaX()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[11];
                    suma = new double[11];
                    
            for (int i=0; i < dataset7.numInstances(); i++) 
            {
                clusterNo = clusterer7.clusterInstance(dataset7.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset7.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset7.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer7.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }

            
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
//////////////////////// OCTAVA Y /////////////////////////////
            
                        
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasOctavaYN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                   dato = String.valueOf(cluster[f][1]);
                  // System.out.println(dato);
                   listaInstancias.add(dato);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideOctavaYN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + cluster[f][1];       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[11];
                    suma = new double[11];
                    
                    for (int i=0; i < dataset8.numInstances(); i++) 
                        {
                        clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset8.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset8.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaOctavaY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[11];
                    suma = new double[11];
            for (int i=0; i < dataset8.numInstances(); i++) 
            {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideOctavaY()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[11];
                    suma = new double[11];
                    
            for (int i=0; i < dataset8.numInstances(); i++) 
            {
                clusterNo = clusterer8.clusterInstance(dataset8.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset8.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset8.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer8.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }

            

/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
///////////////////// OCTAVA Z ///////////////////////////////////////
            
                                    
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
                         
                       // System.out.println(String.valueOf(clusterNo));
                    } 
                }
             catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
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
             
            // System.out.println(dataset1.instance(i).toString());
            }    
     }
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }     
              return listaInstancias;
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
            int pb;
                    for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
                    {
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
/////////// extraer instancias de acuerdo a banadera
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


public ArrayList extraerInstanciasOctavaZN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                   dato = String.valueOf(cluster[f][1]);
                  // System.out.println(dato);
                   listaInstancias.add(dato);
               }
             }
            }
        
          catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return listaInstancias;
     }


public ArrayList extraerCentroideOctavaZN(int ban, int[][] cluster)
     {
         ArrayList listaInstancias= new ArrayList();
        try
            {  
              int clusterNo;
              String dato;
              double suma = 0;
              double prom = 0;
              double cont = 0;
              
            for (int f=0; f < cluster.length; f++) 
            {  
             clusterNo = cluster[f][0];
               if (clusterNo == ban)
               {
                  cont = cont + 1;
                   suma = suma + cluster[f][1];       
               }
             }
            prom = suma / cont;
            listaInstancias.add(String.valueOf(prom));
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
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    prom = new double[11];
                    suma = new double[11];
                    
                    for (int i=0; i < dataset9.numInstances(); i++) 
                        {
                        clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                               
                                if (clusterNo == 0)
                               {
                                  cont = cont + 1;
                                    suma[0] = suma[0] + Double.parseDouble(dataset9.instance(i).toString());
                                    prom[0] = suma[0];
                               }
                               if (clusterNo == 1)
                               {
                                  cont1 = cont1 + 1;
                                  suma[1] = suma[1] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[1] = suma[1];
                               }   
                               if (clusterNo == 2)
                               {
                                  cont2 = cont2 + 1;
                                  suma[2] = suma[2] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[2] = suma[2];
                               }   
                               if (clusterNo == 3)
                               {
                                  cont3 = cont3 + 1;
                                   suma[3] = suma[3] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[3] = suma[3];
                               }  
                               if (clusterNo == 4){
                                  cont4 = cont4 + 1;
                                  suma[4] = suma[4] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[4] = suma[4];
                               } 
                               if (clusterNo == 5){
                                  cont5 = cont5 + 1;
                                  suma[5] = suma[5] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[5] = suma[5];
                               }  
                               if (clusterNo == 6){
                                  cont6 = cont6 + 1;
                                   suma[6] = suma[6] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[6] = suma[6];
                               }
                               if (clusterNo == 7)
                               {
                                  cont7 = cont7 + 1;
                                  suma[7] = suma[7] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[7] = suma[7];
                               }  
                               if (clusterNo == 8){
                                  cont8 = cont8 + 1;
                                  suma[8] = suma[8] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[8] = suma[8];
                               } 
                               if (clusterNo == 9){
                                  cont9 = cont9 + 1;
                                  suma[9] = suma[9] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[9] = suma[9];
                               }  
                               if (clusterNo == 10){
                                  cont10 = cont10 + 1;
                                 suma[10] = suma[10] + Double.parseDouble(dataset9.instance(i).toString());
                                  prom[10] = suma[10];
                               }
                        }
                    
                        int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
                      //  Instances centroides = clusterer1.getClusterCenters();
                       // Instance centroide;
                            int pb;
                    for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
                        {
                      //   centroide = centroides.instance(clusterNo);
                         if (clusterNo == ban)
                                {
                                  if (prom[clusterNo] == 0)
                                        {
                                           // prom1 = 0; 
                                           // listaTempoXC.add(String.valueOf(prom1));   
                                        }
                                  else
                                        {
                                            pb = tamanoClusters[clusterNo]; //divisor
                                            prom1 = prom[clusterNo] / pb; 
                                            listaTempoXC.add(String.valueOf(prom1)); 
                                        }
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
 
public ArrayList instanciaOctavaZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                     double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                     prom = new double[11];
                    suma = new double[11];
            for (int i=0; i < dataset9.numInstances(); i++) 
            {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                    suma[1] = suma[1] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                    suma[2] = suma[2] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                    suma[4] = suma[4] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                    suma[5] = suma[5] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                    suma[6] = suma[6] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                    suma[8] = suma[8] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                    suma[9] = suma[9] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[9] = suma[9];
                }  
                
                  if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                    suma[10] = suma[10] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[10] = suma[10];
                }  
            
                
            }

            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};

            int pb;
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
              //  centroide = centroides.instance(clusterNo);
            
                                    if (prom[clusterNo] == 0)
                                        {
                                           // pb = tamanoClusters[clusterNo];
                                           // listaTempoXI.add(String.valueOf(pb));   
                                         }
                                  else
                                         {
                                            pb = tamanoClusters[clusterNo];
                                            listaTempoXI.add(String.valueOf(pb)); 
                                          }
          
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
            int pb;
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
                con = con + 1.0;
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
            int pb;
           // System.out.println("Centroides k-means ...");
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
            
            }
                }
                
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
           
              return con;
                           
           }
            ///////////////////////////////////////////////////////////
            
            public ArrayList centroideOctavaZ()
           {
               ArrayList listaTempoXI = new ArrayList();
                try
                {
                  
                    double suma [];
                    double prom [];
                    double prom1 = 0;
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
                    
                    prom = new double[11];
                    suma = new double[11];
                    
            for (int i=0; i < dataset9.numInstances(); i++) 
            {
                clusterNo = clusterer9.clusterInstance(dataset9.instance(i));
                if (clusterNo == 0)
                {
                    cont = cont + 1;
                     suma[0] = suma[0] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[0] = suma[0];
                }   
                if (clusterNo == 1)
                {
                    cont1 = cont1 + 1;
                      suma[1] = suma[1] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[1] = suma[1];
                }   
                if (clusterNo == 2)
                {
                    cont2 = cont2 + 1;
                     suma[2] = suma[2] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[2] = suma[2];
                }   
                if (clusterNo == 3)
                {
                    cont3 = cont3 + 1;
                    suma[3] = suma[3] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[3] = suma[3];
                }  
                 if (clusterNo == 4)
                {
                    cont4 = cont4 + 1;
                     suma[4] = suma[4] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[4] = suma[4];
                } 
                 if (clusterNo == 5)
                {
                    cont5 = cont5 + 1;
                     suma[5] = suma[5] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[5] = suma[5];
                }  
                if (clusterNo == 6)
                {
                    cont6 = cont6 + 1;
                     suma[6] = suma[6] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[6] = suma[6];
                }
                if (clusterNo == 7)
                {
                    cont7 = cont7 + 1;
                    suma[7] = suma[7] + Double.parseDouble(dataset9.instance(i).toString());
                    prom[7] = suma[7];
                }  
                 if (clusterNo == 8)
                {
                    cont8 = cont8 + 1;
                     suma[8] = suma[8] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[8] = suma[8];
                } 
                if (clusterNo == 9)
                {
                    cont9 = cont9 + 1;
                     suma[9] = suma[9] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[9] = suma[9];
                }  
                if (clusterNo == 10)
                {
                    cont10 = cont10 + 1;
                   suma[10] = suma[10] + Double.parseDouble(dataset9.instance(i).toString());
                     prom[10] = suma[10];
                }
                
            }
         
            prom1 = prom[3] / cont3;
            System.out.println(prom1);
            
            int[] tamanoClusters = {cont,cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9,cont10};
            int pb;
            for(clusterNo=0; clusterNo < clusterer9.numberOfClusters(); clusterNo++)
            {
                if (prom[clusterNo] == 0)
                {
               // prom1 = 0; 
               // listaTempoXI.add(String.valueOf(prom1));   
                }
                 else
                {
                pb = tamanoClusters[clusterNo]; //divisor
                prom1 = prom[clusterNo] / pb; 
                listaTempoXI.add(String.valueOf(prom1)); 
                }
               
            }
            }
                 catch(Exception e)
             {
              System.out.println("Error en clustering: " + e.getMessage());
             }
              return listaTempoXI;
           }
            
}
