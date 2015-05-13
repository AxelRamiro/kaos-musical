/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PlantillasDeCanciones;
import org.jfugue.*;
import org.jfugue.extras.*;
import java.io.*;

/**
 *
 * @author OMAR LOPEZ ORTEGA
 */
public class PlantillaCreceDecreceParalelo extends Plantilla
{
    Pattern patronEnsamblado = new Pattern();
    Pattern patronCombinado = new Pattern();
    @Override
    public void agregaSecuencias(String[] secuencias)
    {
        t = secuencias.length;        
        super.patrones = new Pattern[t];       
        for(int i = 0; i <t ; i++)
        {
                super.patrones[i] = new Pattern();
                super.patrones[i].add(secuencias[i]);
                super.c2.add(patrones[i],1);
                System.out.println("SECUENCIA EJECUTADA AL MOMENTO..." + secuencias[i]);
        }
        for(int i = (t-1); i > 0; i--)
        {
                super.patrones[i] = new Pattern();
                super.patrones[i].add(secuencias[i]);
                super.c2.add(patrones[i],1);
                System.out.println("SECUENCIA EJECUTADA AL MOMENTO..." + secuencias[i]);
        }
    }
    public void ejecutaCancion()
    {
        System.out.println("Musica, Maestro!!!");        
        patronEnsamblado.add("V0" + super.c1.getMusicString());
        patronEnsamblado.add(super.silencioOctavo);
        patronEnsamblado.add("V1" + super.c2.getMusicString());
        patronEnsamblado.add(super.silencioOctavo);
        this.play(patronEnsamblado);
    }
    @Override
    public void agregaPatron(Pattern elPatron)
    {
        ReversePatternTransformer reversor = new ReversePatternTransformer();
        Pattern patronRevertido = reversor.transform(elPatron);
        patronCombinado.add("V0 " + elPatron.getMusicString());
        patronCombinado.add(super.silencioCuarto);
        patronCombinado.add("V1 " + patronRevertido.getMusicString());
        this.play(patronCombinado);  
        System.out.println(patronCombinado.getMusicString());
    }
    @Override
    public void guardaArchivoMidi(String name)
    {
        super.guardaArchivoMidi(name);
        /*
        File f = new File(name+".mid");
        try
        {
            this.saveMidi(patronCombinado, f);
        }
        catch(IOException e)
        {
        }*/
    }
}
