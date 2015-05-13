/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Lorenz;
import java.text.*;
import java.util.StringTokenizer;
import PlantillasDeCanciones.*;
/**
 *
 * @author OMAR LÓPEZ ORTEGA
 */
public class SecuenciadorCadenas
{
    public int numeroOpcion;
    public PlantillaCanon pCanon = new PlantillaCanon();
    public PlantillaSecuencial pSecuencial = new PlantillaSecuencial();
    public PlantillaIncremental pIncremental = new PlantillaIncremental();
    public PlantillaCreceDecrece pCreceDecrece = new PlantillaCreceDecrece();
    public PlantillaCreceDecreceParalelo pCreceDecreceP = new PlantillaCreceDecreceParalelo();
    public String laPlantilla = new String();
    public Integer notaX;
    public Integer notaY;    
    public Integer notaZ;
    Double duracion1;
    Double duracion2;
    Double duracion3;
    Integer tempo1;
    Integer tempo2;
    Integer tempo3;    
    String cadenaNotaX = new String();
    String cadenaNotaY = new String();
    String cadenaNotaZ = new String();
    public String[] cadenaNotaFinal;// = new String[1];
    public String[] cadenaDuracionFinal;// = new String();
    public String[] cadenaTempoFinal;// = new String();    
    String cadenaD1 = new String();
    String cadenaD2 = new String();
    String cadenaD3 = new String();
    String cadenaT1 = new String();
    String cadenaT2 = new String();
    String cadenaT3 = new String();
    public String[] ensamblePatrones;
    public String[] ensambleNotasLigadas;
    public String[] ensambleNotasLigadas1;
    public String[] ensambleNotaAcorde;
    public String[] ensambleAcordes;
    public String[] ensambleTies;
    public String[] ensambleTies1;
    public String[] ensambleAumentado;//Acorde
    public String[] ensambleDisminuido;//Acorde
    public String[] ensambleMayor;//Acorde
    public String[] ensambleMayor6;//Acorde
    public String[] ensambleMayor7;//Acorde
    public String[] ensambleMenor;//Acorde
    public String[] ensambleMenor6;//Acorde
    public String[] ensambleMenor7;//Acorde   
    public String[] ensambleSeptimoDisminuido;//Acorde
    public String[] ensambleSeptimoDominante;//Acorde
    public String[] ensambleSuspendido2;//Acorde
    public String[] ensambleSuspendido4;//Acorde
    public String[] ensambleNovenoDominante;//Acorde
    public String[] ensambleMayor9;//Acorde
    public String[] ensambleMenor9;//Acorde
    public String[] ensambleAdd9;//Acorde
    public String[] ensambleSieteMenos5Menos9;//Acorde
    public String[] ensambleSieteMenos5Mas9;//Acorde
    public String[] ensambleSieteMas5Menos9;//Acorde
    public String[] ensambleSieteMas5Mas9;//Acorde
    String bracketIzquierdo = new String("[");
    String bracketDerecho = new String("]");
    String patern = new String("Pattern pattern");
    String patern1 = new String("= new Pattern");
    String pDer = new String("\");");
    String pIzq = new String("(\"");
    String instrumento = new String();
    StringTokenizer[] tokens1;
    StringTokenizer[] tokens2;
    StringTokenizer[] tokens3;
    public int p;
    public DecimalFormat df = new DecimalFormat();    
    public DecimalFormat df1 = new DecimalFormat("000");
    
    public SecuenciadorCadenas()
    {
        System.out.println("Iniciando Secuenciador de cadenas...");        
    }
    public void recibeInstrumento(String instrument)
    {
        this.instrumento = instrument;
    }
    public void recibePlantilla(String plantilla)
    {
        this.laPlantilla = plantilla;        
    }
    public void recibeOpcion(int o)
    {
        this.numeroOpcion = o;
    }
    public void construyeNotas(int[] x, int[] y, int[] z, int paso)
    {
        this.p = paso;        
        cadenaNotaFinal = new String[paso];
        tokens2 = new StringTokenizer[p];        
        for(int i = 0; i < p; i++)
        {
            notaX = new Integer(df1.format(x[i]));
            notaY = new Integer(df1.format(y[i]));
            notaZ = new Integer(df1.format(z[i]));
            cadenaNotaX = bracketIzquierdo+notaX.toString()+bracketDerecho;
            cadenaNotaY = bracketIzquierdo+notaY.toString()+bracketDerecho;
            cadenaNotaZ = bracketIzquierdo+notaZ.toString()+bracketDerecho;            
            cadenaNotaFinal[i] = "&"+cadenaNotaX+"&"+cadenaNotaY+"&"+cadenaNotaZ;
            System.out.println(cadenaNotaFinal[i]);
            tokens2[i] = new StringTokenizer(cadenaNotaFinal[i], "&");
        }
    }
    public void construyeDuraciones(double[] x, double[] y, double[] z, int paso)
    {
        this.p = paso;        
        df.setMaximumFractionDigits(2);
        tokens3 = new StringTokenizer[p];
        cadenaDuracionFinal = new String[paso];        
        for(int i = 0; i < p; i++)
        {
            //duracion1 = new Double(df.format(x[i]));
            //duracion2 = new Double(df.format(y[i]));
            //duracion3 = new Double(df.format(z[i]));
            //cadenaD1 = duracion1.toString();
            cadenaD1 = df.format(x[i]);
            cadenaD1 = cadenaD1.replace(',', '.');
            //cadenaD2 = duracion2.toString();
            cadenaD2 = df.format(y[i]);
            cadenaD2 = cadenaD2.replace(',', '.');
            //cadenaD3 = duracion3.toString();
            cadenaD3 = df.format(z[i]);
            cadenaD3 = cadenaD3.replace(',', '.');

            cadenaDuracionFinal[i] = "&/"+cadenaD1+"&"+"/"+cadenaD2+"&"+"/"+cadenaD3;
            System.out.println(cadenaDuracionFinal[i]);
            tokens3[i] = new StringTokenizer(cadenaDuracionFinal[i],"&");
        }
    }    

    public void construyeTempos(int[] x, int[] y, int[] z, int paso)
    {
        this.p = paso;        
        cadenaTempoFinal = new String[paso];
        tokens1 = new StringTokenizer[p];        
        for(int i = 0; i < p; i++)
        {
            tempo1 = new Integer(df1.format(x[i]));
            tempo2 = new Integer(df1.format(y[i]));
            tempo3 = new Integer(df1.format(z[i]));        
            cadenaT1 = tempo1.toString();
            cadenaT2 = tempo2.toString();
            cadenaT3 = tempo3.toString();
            cadenaTempoFinal[i] = "&T"+bracketIzquierdo+cadenaT1+bracketDerecho+"&"+"T"+bracketIzquierdo+cadenaT2+bracketDerecho+"&"+"T"+bracketIzquierdo + cadenaT3 +bracketDerecho;
            System.out.println(cadenaTempoFinal[i]);
            tokens1[i] = new StringTokenizer(cadenaTempoFinal[i], "&");
        }
        this.ensamblaCadenaMusical();
     }
    public String[] getCadenaNotaFinal() {
        return cadenaNotaFinal;
    }
    
    public String[] getCadenaTempoFinal() {
        return cadenaTempoFinal;
    } 
    
    public String[] getCadenaDuracionFinal() {
        return cadenaDuracionFinal;
    }    
    public void ensamblaCadenaMusical()
    {        
        ensamblePatrones = new String[p];
        ensambleNotasLigadas = new String[p];
        ensambleNotasLigadas1 = new String[p];
        ensambleNotaAcorde = new String[p];
        ensambleAcordes = new String[p];
        ensambleTies = new String[p];
        ensambleTies1 = new String[p];
        ensambleMayor = new String[p];
        ensambleMenor = new String[p];
        ensambleAumentado = new String[p];
        ensambleDisminuido = new String[p];
        ensambleMayor6 = new String[p];
        ensambleMayor7 = new String[p];
        ensambleMenor6 = new String[p];
        ensambleMenor7 = new String[p];
        ensambleSeptimoDisminuido = new String[p];
        ensambleSeptimoDominante = new String[p];
        ensambleSuspendido2 = new String[p];
        ensambleSuspendido4 = new String[p];
        ensambleNovenoDominante = new String[p];//Acorde
        ensambleMayor9 = new String[p];//Acorde
        ensambleMenor9 = new String[p];//Acorde
        ensambleAdd9 = new String[p];
        ensambleSieteMenos5Menos9 = new String[p];//Acorde
        ensambleSieteMenos5Mas9 = new String[p];//Acorde
        ensambleSieteMas5Menos9 = new String[p];//Acorde
        ensambleSieteMas5Mas9 = new String[p];//Acorde        
        System.out.println("ENSAMBLANDO CADENAS MUSICALES PARA JFUGUE...");
        String[] sub1 = new String[p];
        String[] sub2 = new String[p];
        String[] sub3 = new String[p];       
        String[] sub4 = new String[p];
        String[] sub5 = new String[p];
        String[] sub6 = new String[p];      
        String[] sub7 = new String[p];
        String[] sub8 = new String[p];
        String[] sub9 = new String[p];        
        for(int k = 0; k < p; k++)
        {
            sub1[k] = tokens1[k].nextToken();
            sub4[k] = tokens1[k].nextToken();
            sub7[k] = tokens1[k].nextToken();
            sub2[k] = tokens2[k].nextToken();
            sub5[k] = tokens2[k].nextToken();
            sub8[k]= tokens2[k].nextToken();                
            sub3[k] = tokens3[k].nextToken();               
            sub6[k] = tokens3[k].nextToken();
            sub9[k] = tokens3[k].nextToken();                
            ensamblePatrones[k] = "I["+instrumento+"] "+sub1[k]+" "+sub2[k]+sub3[k]+" "+sub4[k]+" "+sub5[k]+sub6[k]+" "+sub7[k]+" "+sub8[k]+sub9[k]+"d20";        
            ensambleNotasLigadas[k] = "I["+instrumento+"] "+sub1[k]+" "+sub2[k]+sub3[k]+"_"+sub5[k]+sub6[k]+"_"+sub8[k]+sub9[k]+"d20";
            ensambleNotasLigadas1[k] = "I["+instrumento+"] "+sub1[k]+" "+sub2[k]+sub3[k]+" "+sub5[k]+sub6[k]+"_"+sub8[k]+sub9[k]+"d20";        
            ensambleNotaAcorde[k] = "I["+instrumento+"] "+sub1[k]+" "+sub2[k]+sub3[k]+" "+sub4[k]+" "+sub5[k]+sub6[k]+"+"+sub8[k]+sub9[k]+"d20";        
            ensambleAcordes[k] = "I["+instrumento+"] "+sub1[k]+" "+sub2[k]+sub3[k]+"+"+sub5[k]+sub6[k]+"+"+sub8[k]+sub9[k]+"d20";        
            ensambleTies[k] = "I["+instrumento+"] "+sub1[k]+" "+sub2[k]+"q- | "+sub5[k]+"-q- | "+sub8[k]+sub9[k]+"d20";
            ensambleTies1[k] = "I["+instrumento+"] "+sub1[k]+" "+sub2[k]+"s- | "+sub5[k]+"-s- | "+sub8[k]+sub9[k]+"d20";
            ensambleMayor[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Mayor(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Mayor(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Mayor(sub8[k])+sub9[k]+"d20";
            ensambleMenor[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Menor(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Menor(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Menor(sub8[k])+sub9[k]+"d20";
            ensambleAumentado[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Aumentado(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Aumentado(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Aumentado(sub8[k])+sub9[k]+"d20";
            ensambleDisminuido[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Disminuido(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Disminuido(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Disminuido(sub8[k])+sub9[k]+"d20";
            ensambleMayor6[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Mayor6(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Mayor6(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Mayor6(sub8[k])+sub9[k]+"d20";
            ensambleMayor7[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Mayor7(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Mayor7(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Mayor7(sub8[k])+sub9[k]+"d20";
            ensambleMenor6[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Menor6(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Menor6(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Menor6(sub8[k])+sub9[k]+"d20";
            ensambleMenor7[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Menor7(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Menor7(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Menor7(sub8[k])+sub9[k]+"d20";
            ensambleSeptimoDisminuido[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.SeptimoDisminuido(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.SeptimoDisminuido(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.SeptimoDisminuido(sub8[k])+sub9[k]+"d20";
            ensambleSeptimoDominante[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.SeptimoDominante(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.SeptimoDominante(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.SeptimoDominante(sub8[k])+sub9[k]+"d20";
            ensambleSuspendido2[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Suspendido2(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Suspendido2(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Suspendido2(sub8[k])+sub9[k]+"d20";
            ensambleSuspendido4[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Suspendido4(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Suspendido4(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Suspendido4(sub8[k])+sub9[k]+"d20";
            ensambleNovenoDominante[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.NovenoDominante(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.NovenoDominante(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.NovenoDominante(sub8[k])+sub9[k]+"d20";
            ensambleMayor9[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Mayor9(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Mayor9(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Mayor9(sub8[k])+sub9[k]+"d20";
            ensambleMenor9[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Menor9(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Menor9(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Menor9(sub8[k])+sub9[k]+"d20";
            ensambleAdd9[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.Add9(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.Add9(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.Add9(sub8[k])+sub9[k]+"d20";
            ensambleSieteMenos5Menos9[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.SieteMenos5Menos9(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.SieteMenos5Menos9(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.SieteMenos5Menos9(sub8[k])+sub9[k]+"d20";
            ensambleSieteMenos5Mas9[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.SieteMenos5Mas9(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.SieteMenos5Mas9(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.SieteMenos5Mas9(sub8[k])+sub9[k]+"d20";
            ensambleSieteMas5Menos9[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.SieteMas5Menos9(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.SieteMas5Menos9(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.SieteMas5Menos9(sub8[k])+sub9[k]+"d20";
            ensambleSieteMas5Mas9[k] = "I["+instrumento+"] "+sub1[k]+" "+Acorde.SieteMas5Mas9(sub2[k])+sub3[k]+" "+sub4[k]+" "+Acorde.SieteMas5Mas9(sub5[k])+sub6[k]+" "+sub7[k]+" "+Acorde.SieteMas5Mas9(sub8[k])+sub9[k]+"d20";
            System.out.println("ENSAMBLE FINAL " +(k+1)+": "+ensamblePatrones[k]);
        }
        this.ejecuta();        
     }    
    public void ejecuta()
    {
        System.out.println("LA MELODÍA SE EJECUTA EN: " +laPlantilla);
        if(this.laPlantilla.equals("CANON"))
        {
            switch(numeroOpcion)
            {
                case 0:pCanon.agregaSecuencias(ensamblePatrones);
                pCanon.ejecutaCancion();
                break;
                case 1:pCanon.agregaSecuencias(ensambleNotasLigadas);  
                pCanon.ejecutaCancion();
                break;
                case 2:pCanon.agregaSecuencias(ensambleNotasLigadas1);  
                pCanon.ejecutaCancion();
                break;
                case 3:pCanon.agregaSecuencias(ensambleNotaAcorde);
                pCanon.ejecutaCancion();
                break;
                case 4:pCanon.agregaSecuencias(ensambleAcordes);
                pCanon.ejecutaCancion();
                break;
                case 5:pCanon.agregaSecuencias(ensambleTies);
                pCanon.ejecutaCancion();
                break;
                case 6:pCanon.agregaSecuencias(ensambleTies1);
                pCanon.ejecutaCancion();
                break;
                case 7:pCanon.agregaSecuencias(ensambleMayor);
                pCanon.ejecutaCancion();
                break;
                case 8:pCanon.agregaSecuencias(ensambleMenor);
                pCanon.ejecutaCancion();
                break;
                case 9:pCanon.agregaSecuencias(ensambleAumentado);
                pCanon.ejecutaCancion();
                break;
                case 10:pCanon.agregaSecuencias(ensambleDisminuido);
                pCanon.ejecutaCancion();
                break;                
                case 11:pCanon.agregaSecuencias(ensambleMayor6);
                pCanon.ejecutaCancion();
                break;
                case 12:pCanon.agregaSecuencias(ensambleMayor7);
                pCanon.ejecutaCancion();
                break;
                case 13:pCanon.agregaSecuencias(ensambleMenor6);
                pCanon.ejecutaCancion();
                break;
                case 14:pCanon.agregaSecuencias(ensambleMenor7);
                pCanon.ejecutaCancion();
                break;
                case 15:pCanon.agregaSecuencias(ensambleSeptimoDisminuido);
                pCanon.ejecutaCancion();
                break;
                case 16:pCanon.agregaSecuencias(ensambleSeptimoDominante);
                pCanon.ejecutaCancion();
                break;
                case 17:pCanon.agregaSecuencias(ensambleSuspendido2);
                pCanon.ejecutaCancion();
                break;
                case 18:pCanon.agregaSecuencias(ensambleSuspendido4);
                pCanon.ejecutaCancion();
                break;
                case 19:pCanon.agregaSecuencias(ensambleNovenoDominante);
                pCanon.ejecutaCancion();
                break;
                case 20:pCanon.agregaSecuencias(ensambleMayor9);
                pCanon.ejecutaCancion();
                break;
                case 21:pCanon.agregaSecuencias(ensambleMenor9);
                pCanon.ejecutaCancion();
                break;
                case 22:pCanon.agregaSecuencias(ensambleAdd9);
                pCanon.ejecutaCancion();
                break;
                case 23:pCanon.agregaSecuencias(ensambleSieteMenos5Menos9);
                pCanon.ejecutaCancion();
                break;
                case 24:pCanon.agregaSecuencias(ensambleSieteMenos5Mas9);
                pCanon.ejecutaCancion();
                break;
                case 25:pCanon.agregaSecuencias(ensambleSieteMas5Menos9);
                pCanon.ejecutaCancion();
                break;
                case 26:pCanon.agregaSecuencias(ensambleSieteMas5Mas9);
                pCanon.ejecutaCancion();
                break;
                default:pCanon.agregaSecuencias(ensamblePatrones);
                pCanon.ejecutaCancion();
                break;                
            }           
        }
        if(this.laPlantilla.equals("SECUENCIAL"))
        {
            /*switch(numeroOpcion)
            {
                case 0:pSecuencial.agregaSecuencias(ensamblePatrones);
                pSecuencial.ejecutaCancion();
                break;
                case 1:pSecuencial.agregaSecuencias(ensambleNotasLigadas);  
                pSecuencial.ejecutaCancion();
                break;
                case 2:pSecuencial.agregaSecuencias(ensambleNotasLigadas1);  
                pSecuencial.ejecutaCancion();
                break;
                case 3:pSecuencial.agregaSecuencias(ensambleNotaAcorde);
                pSecuencial.ejecutaCancion();
                break;
                case 4:pSecuencial.agregaSecuencias(ensambleAcordes);
                pSecuencial.ejecutaCancion();
                break;
                case 5:pSecuencial.agregaSecuencias(ensambleTies);
                pSecuencial.ejecutaCancion();
                break;
                case 6:pSecuencial.agregaSecuencias(ensambleTies1);
                pSecuencial.ejecutaCancion();
                break;
                case 7:pSecuencial.agregaSecuencias(ensambleMayor);
                pSecuencial.ejecutaCancion();
                break; 
                case 8:pSecuencial.agregaSecuencias(ensambleMenor);
                pSecuencial.ejecutaCancion();
                break;
                case 9:pSecuencial.agregaSecuencias(ensambleAumentado);
                pSecuencial.ejecutaCancion();
                break;
                case 10:pSecuencial.agregaSecuencias(ensambleDisminuido);
                pSecuencial.ejecutaCancion();
                break;
                case 11:pSecuencial.agregaSecuencias(ensambleMayor6);
                pSecuencial.ejecutaCancion();
                break;
                case 12:pSecuencial.agregaSecuencias(ensambleMayor7);
                pSecuencial.ejecutaCancion();
                break;
                case 13:pSecuencial.agregaSecuencias(ensambleMenor6);
                pSecuencial.ejecutaCancion();
                break;
                case 14:pSecuencial.agregaSecuencias(ensambleMenor7);
                pSecuencial.ejecutaCancion();
                break;
                case 15:pSecuencial.agregaSecuencias(ensambleSeptimoDisminuido);
                pSecuencial.ejecutaCancion();
                break;
                case 16:pSecuencial.agregaSecuencias(ensambleSeptimoDominante);
                pSecuencial.ejecutaCancion();
                break;
                case 17:pSecuencial.agregaSecuencias(ensambleSuspendido2);
                pSecuencial.ejecutaCancion();
                break;
                case 18:pSecuencial.agregaSecuencias(ensambleSuspendido4);
                pSecuencial.ejecutaCancion();
                break;
                case 19:pSecuencial.agregaSecuencias(ensambleNovenoDominante);
                pSecuencial.ejecutaCancion();
                break;
                case 20:pSecuencial.agregaSecuencias(ensambleMayor9);
                pSecuencial.ejecutaCancion();
                break;
                case 21:pSecuencial.agregaSecuencias(ensambleMenor9);
                pSecuencial.ejecutaCancion();
                break;
                case 22:pSecuencial.agregaSecuencias(ensambleAdd9);
                pSecuencial.ejecutaCancion();
                break;
                case 23:pSecuencial.agregaSecuencias(ensambleSieteMenos5Menos9);
                pSecuencial.ejecutaCancion();
                break;
                case 24:pSecuencial.agregaSecuencias(ensambleSieteMenos5Mas9);
                pSecuencial.ejecutaCancion();
                break;
                case 25:pSecuencial.agregaSecuencias(ensambleSieteMas5Menos9);
                pSecuencial.ejecutaCancion();
                break;
                case 26:pSecuencial.agregaSecuencias(ensambleSieteMas5Mas9);
                pSecuencial.ejecutaCancion();
                break;
                default:pSecuencial.agregaSecuencias(ensamblePatrones);
                pSecuencial.ejecutaCancion();
                break;                
            } */
        }
        if(this.laPlantilla.equals("INCREMENTAL"))
        {
            switch(numeroOpcion)
            {
                case 0:pIncremental.agregaSecuencias(ensamblePatrones);
                pIncremental.ejecutaCancion();
                break;
                case 1:pIncremental.agregaSecuencias(ensambleNotasLigadas);  
                pIncremental.ejecutaCancion();
                break;
                case 2:pIncremental.agregaSecuencias(ensambleNotasLigadas1);  
                pIncremental.ejecutaCancion();
                break;
                case 3:pIncremental.agregaSecuencias(ensambleNotaAcorde);
                pIncremental.ejecutaCancion();
                break;
                case 4:pIncremental.agregaSecuencias(ensambleAcordes);
                pIncremental.ejecutaCancion();
                break;
                case 5:pIncremental.agregaSecuencias(ensambleTies);
                pIncremental.ejecutaCancion();
                break;
                case 6:pIncremental.agregaSecuencias(ensambleTies1);
                pIncremental.ejecutaCancion();
                break;
                case 7:pIncremental.agregaSecuencias(ensambleMayor);
                pIncremental.ejecutaCancion();
                break;                
                case 8:pIncremental.agregaSecuencias(ensambleMenor);
                pIncremental.ejecutaCancion();
                break;
                case 9:pIncremental.agregaSecuencias(ensambleAumentado);
                pIncremental.ejecutaCancion();
                break;
                case 10:pIncremental.agregaSecuencias(ensambleDisminuido);
                pIncremental.ejecutaCancion();
                break;                
                case 11:pIncremental.agregaSecuencias(ensambleMayor6);
                pIncremental.ejecutaCancion();
                break;
                case 12:pIncremental.agregaSecuencias(ensambleMayor7);
                pIncremental.ejecutaCancion();
                break;
                case 13:pIncremental.agregaSecuencias(ensambleMenor6);
                pIncremental.ejecutaCancion();
                break;
                case 14:pIncremental.agregaSecuencias(ensambleMenor7);
                pIncremental.ejecutaCancion();
                break;
                case 15:pIncremental.agregaSecuencias(ensambleSeptimoDisminuido);
                pIncremental.ejecutaCancion();
                break;
                case 16:pIncremental.agregaSecuencias(ensambleSeptimoDominante);
                pIncremental.ejecutaCancion();
                break;
                case 17:pIncremental.agregaSecuencias(ensambleSuspendido2);
                pIncremental.ejecutaCancion();
                break;
                case 18:pIncremental.agregaSecuencias(ensambleSuspendido4);
                pIncremental.ejecutaCancion();
                break;
                case 19:pIncremental.agregaSecuencias(ensambleNovenoDominante);
                pIncremental.ejecutaCancion();
                break;
                case 20:pIncremental.agregaSecuencias(ensambleMayor9);
                pIncremental.ejecutaCancion();
                break;
                case 21:pIncremental.agregaSecuencias(ensambleMenor9);
                pIncremental.ejecutaCancion();
                break;
                case 22:pIncremental.agregaSecuencias(ensambleAdd9);
                pIncremental.ejecutaCancion();
                break;
                case 23:pIncremental.agregaSecuencias(ensambleSieteMenos5Menos9);
                pIncremental.ejecutaCancion();
                break;
                case 24:pIncremental.agregaSecuencias(ensambleSieteMenos5Mas9);
                pIncremental.ejecutaCancion();
                break;
                case 25:pIncremental.agregaSecuencias(ensambleSieteMas5Menos9);
                pIncremental.ejecutaCancion();
                break;
                case 26:pIncremental.agregaSecuencias(ensambleSieteMas5Mas9);
                pIncremental.ejecutaCancion();
                break;
                default:pIncremental.agregaSecuencias(ensamblePatrones);
                pIncremental.ejecutaCancion();
                break;                
            }                    
        }
        if(this.laPlantilla.equals("CRECEDECRECE"))
        {
            switch(numeroOpcion)
            {
                case 0:pCreceDecrece.agregaSecuencias(ensamblePatrones);
                pCreceDecrece.ejecutaCancion();
                break;
                case 1:pCreceDecrece.agregaSecuencias(ensambleNotasLigadas);  
                pCreceDecrece.ejecutaCancion();
                break;
                case 2:pCreceDecrece.agregaSecuencias(ensambleNotasLigadas1);  
                pCreceDecrece.ejecutaCancion();
                break;
                case 3:pCreceDecrece.agregaSecuencias(ensambleNotaAcorde);
                pCreceDecrece.ejecutaCancion();
                break;
                case 4:pCreceDecrece.agregaSecuencias(ensambleAcordes);
                pCreceDecrece.ejecutaCancion();
                break;
                case 5:pCreceDecrece.agregaSecuencias(ensambleTies);
                pCreceDecrece.ejecutaCancion();
                break;
                case 6:pCreceDecrece.agregaSecuencias(ensambleTies1);
                pCreceDecrece.ejecutaCancion();
                break;
                case 7:pCreceDecrece.agregaSecuencias(ensambleMayor);
                pCreceDecrece.ejecutaCancion();
                break;
                case 8:pCreceDecrece.agregaSecuencias(ensambleMenor);
                pCreceDecrece.ejecutaCancion();
                break;
                case 9:pCreceDecrece.agregaSecuencias(ensambleAumentado);
                pCreceDecrece.ejecutaCancion();
                break;
                case 10:pCreceDecrece.agregaSecuencias(ensambleDisminuido);
                pCreceDecrece.ejecutaCancion();
                break;                
                case 11:pCreceDecrece.agregaSecuencias(ensambleMayor6);
                pCreceDecrece.ejecutaCancion();
                break;
                case 12:pCreceDecrece.agregaSecuencias(ensambleMayor7);
                pCreceDecrece.ejecutaCancion();
                break;
                case 13:pCreceDecrece.agregaSecuencias(ensambleMenor6);
                pCreceDecrece.ejecutaCancion();
                break;
                case 14:pCreceDecrece.agregaSecuencias(ensambleMenor7);
                pCreceDecrece.ejecutaCancion();
                break;
                case 15:pCreceDecrece.agregaSecuencias(ensambleSeptimoDisminuido);
                pCreceDecrece.ejecutaCancion();
                break;
                case 16:pCreceDecrece.agregaSecuencias(ensambleSeptimoDominante);
                pCreceDecrece.ejecutaCancion();
                break;
                case 17:pCreceDecrece.agregaSecuencias(ensambleSuspendido2);
                pCreceDecrece.ejecutaCancion();
                break;
                case 18:pCreceDecrece.agregaSecuencias(ensambleSuspendido4);
                pCreceDecrece.ejecutaCancion();
                break;
                case 19:pCreceDecrece.agregaSecuencias(ensambleNovenoDominante);
                pCreceDecrece.ejecutaCancion();
                break;
                case 20:pCreceDecrece.agregaSecuencias(ensambleMayor9);
                pCreceDecrece.ejecutaCancion();
                break;
                case 21:pCreceDecrece.agregaSecuencias(ensambleMenor9);
                pCreceDecrece.ejecutaCancion();
                break;
                case 22:pCreceDecrece.agregaSecuencias(ensambleAdd9);
                pCreceDecrece.ejecutaCancion();
                break;
                case 23:pCreceDecrece.agregaSecuencias(ensambleSieteMenos5Menos9);
                pCreceDecrece.ejecutaCancion();
                break;
                case 24:pCreceDecrece.agregaSecuencias(ensambleSieteMenos5Mas9);
                pCreceDecrece.ejecutaCancion();
                break;
                case 25:pCreceDecrece.agregaSecuencias(ensambleSieteMas5Menos9);
                pCreceDecrece.ejecutaCancion();
                break;
                case 26:pCreceDecrece.agregaSecuencias(ensambleSieteMas5Mas9);
                pCreceDecrece.ejecutaCancion();
                break;
                default:pCreceDecrece.agregaSecuencias(ensamblePatrones);
                pCreceDecrece.ejecutaCancion();
                break;                
            }           
        }
        if(this.laPlantilla.equals("CRECEDECRECEPARALELO"))
        {
            switch(numeroOpcion)
            {
                case 0:pCreceDecreceP.agregaSecuencias(ensamblePatrones);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 1:pCreceDecreceP.agregaSecuencias(ensambleNotasLigadas);  
                pCreceDecreceP.ejecutaCancion();
                break;
                case 2:pCreceDecreceP.agregaSecuencias(ensambleNotasLigadas1);  
                pCreceDecreceP.ejecutaCancion();
                break;
                case 3:pCreceDecreceP.agregaSecuencias(ensambleNotaAcorde);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 4:pCreceDecreceP.agregaSecuencias(ensambleAcordes);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 5:pCreceDecreceP.agregaSecuencias(ensambleTies);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 6:pCreceDecreceP.agregaSecuencias(ensambleTies1);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 7:pCreceDecreceP.agregaSecuencias(ensambleMayor);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 8:pCreceDecreceP.agregaSecuencias(ensambleMenor);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 9:pCreceDecreceP.agregaSecuencias(ensambleAumentado);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 10:pCreceDecreceP.agregaSecuencias(ensambleDisminuido);
                pCreceDecreceP.ejecutaCancion();
                break;                
                case 11:pCreceDecreceP.agregaSecuencias(ensambleMayor6);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 12:pCreceDecreceP.agregaSecuencias(ensambleMayor7);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 13:pCreceDecreceP.agregaSecuencias(ensambleMenor6);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 14:pCreceDecreceP.agregaSecuencias(ensambleMenor7);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 15:pCreceDecreceP.agregaSecuencias(ensambleSeptimoDisminuido);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 16:pCreceDecreceP.agregaSecuencias(ensambleSeptimoDominante);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 17:pCreceDecreceP.agregaSecuencias(ensambleSuspendido2);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 18:pCreceDecreceP.agregaSecuencias(ensambleSuspendido4);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 19:pCreceDecreceP.agregaSecuencias(ensambleNovenoDominante);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 20:pCreceDecreceP.agregaSecuencias(ensambleMayor9);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 21:pCreceDecreceP.agregaSecuencias(ensambleMenor9);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 22:pCreceDecreceP.agregaSecuencias(ensambleAdd9);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 23:pCreceDecreceP.agregaSecuencias(ensambleSieteMenos5Menos9);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 24:pCreceDecreceP.agregaSecuencias(ensambleSieteMenos5Mas9);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 25:pCreceDecreceP.agregaSecuencias(ensambleSieteMas5Menos9);
                pCreceDecreceP.ejecutaCancion();
                break;
                case 26:pCreceDecreceP.agregaSecuencias(ensambleSieteMas5Mas9);
                pCreceDecreceP.ejecutaCancion();
                break;
                default:pCreceDecreceP.agregaSecuencias(ensamblePatrones);
                pCreceDecreceP.ejecutaCancion();
                break;                
            }           
        }
    }  
}   
    

