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
public class PlantillaIncremental extends Plantilla
{        
    Pattern patronEnsamblado = new Pattern();
    Pattern patronCombinado = new Pattern();
    Pattern sub1;
    Pattern sub2;
    Pattern sub3;
    Pattern sub4;
    public void agregaSecuencias(String[] secuencias)
    {
        int t = secuencias.length;        
        super.patrones = new Pattern[t];
        for(int i = 0; i < 9; i++)
        {
            if(t < 9) break;
            super.patrones[i] = new Pattern();
            super.patrones[i].add(secuencias[i]);
            super.cancion.add(super.patrones[i],1);
            System.out.println("SECUENCIA EJECUTADA AL MOMENTO..." + secuencias[i]);
        }
        for(int j = 3; j < 12;j++)
        {
            if(t < 12) break;
            super.patrones[j] = new Pattern();
            super.patrones[j].add(secuencias[j]);
            super.c1.add(super.patrones[j],1);
            System.out.println("SECUENCIA EJECUTADA AL MOMENTO..." + secuencias[j]);
        }
        for(int k= 6; k < 15; k++)
        {
            if(t < 15) break;
            super.patrones[k] = new Pattern();
            super.patrones[k].add(secuencias[k]);
            super.c2.add(super.patrones[k],1);                        
            System.out.println("SECUENCIA EJECUTADA AL MOMENTO..." + secuencias[k]);
        }
        for(int k= 9; k < t; k++)
        {
            //if(t < 25) break;
            super.patrones[k] = new Pattern();
            super.patrones[k].add(secuencias[k]);
            super.c3.add(super.patrones[k],1);            
            System.out.println("SECUENCIA EJECUTADA AL MOMENTO..." + secuencias[k]);
        }        
    }
    public void ejecutaCancion()
    {
        System.out.println("Musica, Maestro!!!");        
        super.vuelta1.add(super.silencioOctavo);        
        super.vuelta1.add(super.cancion);
        super.vuelta1.add(super.silencioOctavo);
        super.vuelta1.add(super.c1);
        super.vuelta1.add(super.silencioOctavo);
        super.vuelta1.add(super.c2);
        super.vuelta1.add(super.silencioOctavo);
        super.vuelta1.add(super.c3);        
        super.vuelta1.repeat(2);
        this.play(super.vuelta1);        
    }
    @Override
    public void agregaPatron(Pattern elPatron)
    {
        ReversePatternTransformer reversor = new ReversePatternTransformer();
        Pattern patronRevertido = reversor.transform(elPatron);
        patronCombinado.add("V0 " + elPatron.getMusicString());
        patronCombinado.add("V1 " + "Rw "+ patronRevertido.getMusicString());
        patronCombinado.add("V2 " + "Rw Rw "+ elPatron.getMusicString());
        //patronCombinado.add("V3 " + "Rw Rw Rw "+ patronRevertido.getMusicString());
        this.play(patronCombinado);
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
