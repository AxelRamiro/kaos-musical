/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjeAux;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class promp {
    
    
     public double promp(double  instancias, double centroide)
  {
      double multi = 0;
      double prom;
      
      
      multi = instancias*centroide;
      prom = multi;
      
      
      return prom;
      
  }
     
     
  public double calcularMayor(double total1 [])
  {
      double mayor = 0;     
      double resultado = total1[0];
       
       for(int i=0;i<total1.length;i++)
       {    
           if(total1[i] > resultado)
           {
               resultado = total1[i];
           }   
       }
       
      mayor = resultado;
      return mayor;  
   } 
  
   public double calcularMenor(double total1 [])
  {
      double menor = 0;     
      double resultado = total1[0];
       
       for(int i=0;i<total1.length;i++)
       {    
           if(total1[i] < resultado)
           {
               resultado = total1[i];
           }   
       }
       
      menor = resultado;
      return menor;  
   } 
   
   public String calcularMayorPosision(double total1 [])
  {
      String indice = null;
      
      double iposision = 0;
      double resultado = total1[0];
       
       for(int i=0;i<total1.length;i++)
       {    
           if(total1[i] > resultado)
           {
               resultado = total1[i];
               iposision = i;
           }   
       }
       
       if (iposision == 0)
       {
           indice = "Pre Fusion";
       }
       
       if (iposision == 1)
       {
           indice = "Fusion PP";
       }
       
       if (iposision == 2)
       {
           indice = "Fusion PA";
       }
           
       
     System.out.println(indice);
      
      
      return indice;  
   }
   
    public String calcularMenorPosision(double total1 [])
  {
      String indice = null;
      
      double iposision = 0;
      double resultado = total1[0];
       
       for(int i=0;i<total1.length;i++)
       {    
           if(total1[i] < resultado)
           {
               resultado = total1[i];
               iposision = i;
           }   
       }
       
      if (iposision == 0)
       {
           indice = "Pre Fusion";
       }
       
       if (iposision == 1)
       {
           indice = "Fusion PP";
       }
       
       if (iposision == 2)
       {
           indice = "Fusion PA";
       }
           
       
     System.out.println(indice);
      
      
      return indice;  
   }
    
}
