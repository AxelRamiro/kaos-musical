/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PlantillasDeCanciones;
import org.jfugue.*;
import java.io.*;
import javax.sound.midi.*;
/**
 * @author OMAR LÓPEZ ORTEGA
 */
public class Plantilla extends Player
{
    public Pattern[] patrones;
    public Pattern cancion = new Pattern();
    public Pattern c1 = new Pattern();
    public Pattern c2 = new Pattern();
    public Pattern c3 = new Pattern();
    Pattern vuelta1 = new Pattern("V0");
    Pattern vuelta2 = new Pattern("V1");
    Pattern vuelta3 = new Pattern("V2");
    Pattern vuelta4 = new Pattern("V3");
    Pattern silencioSencillo = new Pattern("Rw");
    Pattern silencioMedio = new Pattern("Rh");
    Pattern silencioDoble = new Pattern("Rw Rw");
    Pattern silencioCuarto = new Pattern("Rq");
    Pattern silencioOctavo = new Pattern("Ri");
    Pattern silencio16 = new Pattern("Rs");
    Pattern silencio32 = new Pattern("Rt");
    public String[] laSecuencia;    
    Pattern vueltas = new Pattern();
    int t;
    File f;
    public void agregaSecuencias(String[] secuencias)
    {
        t = secuencias.length;        
        laSecuencia = new String[t];
        patrones = new Pattern[t];        
            for(int i = 0; i < t; i++)
            {
                patrones[i] = new Pattern();
                patrones[i].add(secuencias[i]);
                cancion.add(patrones[i],1);
                System.out.println("SECUENCIA EJECUTADA AL MOMENTO..." + secuencias[i]);
            }
        laSecuencia = this.devuelveSecuencia(secuencias);
        this.close();
        //System.out.println(laSecuencia);
    }
    public String[] devuelveSecuencia(String[] s)
    {       
        return s;
    }
    //public void agregaPatron(Pattern elPatron)
    //{
    //    this.play(elPatron);
    //}
    public void agregaPatron(Pattern p)
    {        
    }
    public void guardaArchivoMidi(String name)
    {
        f = new File(name+".mid");
        try
        {
            this.saveMidi(this.cancion, f);
            this.close();
        }
        catch(IOException e)
        {
        }
    }
    public void abreArchivoMidi(String name)
    {
        f = new File(name+".mid");
        try
        {
            this.playMidiDirectly(f);
            cancion = this.loadMidi(f);
            System.out.println(cancion.getMusicString());
            this.close();
        }
        catch(IOException e)
        {
            System.out.println("No se pudo abrir archivo");
        }
        catch(InvalidMidiDataException i)
        {
            System.out.println("No se pudo abrir archivo");

        }
    }
}
