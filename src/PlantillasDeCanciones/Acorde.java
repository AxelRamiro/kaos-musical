/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PlantillasDeCanciones;
import java.util.StringTokenizer;

/**
 *
 * @author OMAR
 */
public class Acorde
{
    public static String acordeGenerado = new String();
    public static String notaBaseS = new String();
    public static String sub1 = new String();
    public static String sub2 = new String();
    public static String sub3 = new String();
    public static String cadenaNota1 = new String();
    public static String cadenaNota2 = new String();
    public static String cadenaNota3 = new String();
    public static String cadenaNota4 = new String();
    public static String cadenaNota5 = new String();
    public static int notaBase;
    public static int notaMayor1;
    public static int notaMayor2;
    public static int notaMayor3;
    public static int notaMayor4;
    public static StringTokenizer t1;
    public static StringTokenizer t2;;
    public static String Mayor(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 7;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]";
        return acordeGenerado;
    }
    public static String Menor(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 3;
        notaMayor2 = notaBase + 7;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]";
        return acordeGenerado;        
    }    
    public static String Aumentado(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 8;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]";
        return acordeGenerado;
    }    
    public static String Disminuido(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 3;
        notaMayor2 = notaBase + 6;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]";
        return acordeGenerado;
    }    
    public static String SeptimoDominante(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 10;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]";
        return acordeGenerado;
    }
    public static String SeptimoDisminuido(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 3;
        notaMayor2 = notaBase + 6;
        notaMayor3 = notaBase + 9;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]";
        return acordeGenerado;
    }
    public static String Mayor7(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 11;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]";
        return acordeGenerado;
    }
    public static String Menor7(String notaRaiz)
    {
        //sub1 = procesamiento1(notaRaiz);
        //sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 3;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 10;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]";
        return acordeGenerado;
    }
    public static String Suspendido4(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 5;
        notaMayor2 = notaBase + 7;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);        
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]";
        return acordeGenerado;
    }    
    public static String Suspendido2(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 2;
        notaMayor2 = notaBase + 7;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);        
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]";
        return acordeGenerado;
    }
    public static String Mayor6(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 9;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]";
        return acordeGenerado;
    }
    public static String Menor6(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 3;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 9;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]";
        return acordeGenerado;
    }
    public static String NovenoDominante(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 10;
        notaMayor4 = notaBase + 14;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        cadenaNota4=Integer.toString(notaMayor4);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]+["+cadenaNota4+"]";
        return acordeGenerado;        
    }
    public static String Mayor9(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 11;
        notaMayor4 = notaBase + 14;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        cadenaNota4=Integer.toString(notaMayor4);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]+["+cadenaNota4+"]";
        return acordeGenerado;        
    }
    public static String Menor9(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 3;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 10;
        notaMayor4 = notaBase + 14;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        cadenaNota4=Integer.toString(notaMayor4);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]+["+cadenaNota4+"]";
        return acordeGenerado;        
    }
    public static String Add9(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 7;
        notaMayor3 = notaBase + 14;        
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);        
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]";
        return acordeGenerado;        
    }
    public static String SieteMenos5Menos9(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 6;
        notaMayor3 = notaBase + 10;
        notaMayor4 = notaBase + 13;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        cadenaNota4=Integer.toString(notaMayor4);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]+["+cadenaNota4+"]";
        return acordeGenerado;        
    }
    public static String SieteMenos5Mas9(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 6;
        notaMayor3 = notaBase + 10;
        notaMayor4 = notaBase + 15;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        cadenaNota4=Integer.toString(notaMayor4);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]+["+cadenaNota4+"]";
        return acordeGenerado;        
    }
    public static String SieteMas5Menos9(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 8;
        notaMayor3 = notaBase + 10;
        notaMayor4 = notaBase + 13;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        cadenaNota4=Integer.toString(notaMayor4);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]+["+cadenaNota4+"]";
        return acordeGenerado;        
    }
    public static String SieteMas5Mas9(String notaRaiz)
    {
        sub1 = procesamiento1(notaRaiz);
        sub2 = procesamiento2(sub1);
        notaBase = Integer.parseInt(notaRaiz);
        notaMayor1 = notaBase + 4;
        notaMayor2 = notaBase + 8;
        notaMayor3 = notaBase + 10;
        notaMayor4 = notaBase + 15;
        cadenaNota1 = Integer.toString(notaMayor1);
        cadenaNota2 = Integer.toString(notaMayor2);
        cadenaNota3 = Integer.toString(notaMayor3);
        cadenaNota4=Integer.toString(notaMayor4);
        acordeGenerado = "["+notaRaiz+"]+["+cadenaNota1+"]+["+cadenaNota2+"]+["+cadenaNota3+"]+["+cadenaNota4+"]";
        return acordeGenerado;        
    }
    public static String procesamiento1(String s)
    {
        t1 = new StringTokenizer(s, "[");
        return t1.nextToken();        
    }
    public static String procesamiento2(String s)
    {
        t2 = new StringTokenizer(s, "]");
        return t2.nextToken();        
    }
}
