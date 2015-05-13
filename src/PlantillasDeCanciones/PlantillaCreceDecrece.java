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
 * @author OMAR
 */
public class PlantillaCreceDecrece extends Plantilla
{
    Pattern patronEnsamblado = new Pattern();
    ReversePatternTransformer reversor = new ReversePatternTransformer();
    Pattern patronRevertido = new Pattern();//reversor.transform(elPatron);
    Pattern patronCombinado = new Pattern();
    public void agregaSecuencias(String[] secuencias)
    {
        t = secuencias.length;        
        //laSecuencia = new String[t];
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
        super.vuelta1.add(super.silencioOctavo);
        super.vuelta1.add(super.c1);
        super.vuelta1.add(super.silencioOctavo);
        super.vuelta1.add(super.c2);
        super.vuelta1.add(super.silencioOctavo);
        super.vuelta1.add(super.c1);
        super.vuelta1.add(super.silencioOctavo);
        super.vuelta1.add(super.c2);
        super.vuelta1.add(super.silencioOctavo);        
        this.play(super.vuelta1);       
    }
    @Override
    public void agregaPatron(Pattern elPatron)
    {
        patronCombinado.add(elPatron);
        patronRevertido = reversor.transform(elPatron);
        patronCombinado.add(super.silencioCuarto);
        patronCombinado.add(patronRevertido);
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
