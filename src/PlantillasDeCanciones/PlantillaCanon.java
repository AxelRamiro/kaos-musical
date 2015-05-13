/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PlantillasDeCanciones;
import org.jfugue.*;

/**
 *
 * @author OMAR LÓPEZ ORTEGA
 * Profesor - Investigador CITIS - UAEH
 */
public class PlantillaCanon extends Plantilla 
{  
    Pattern patronEnsamblado = new Pattern();
    Pattern patronCombinado = new Pattern();

    public void ejecutaCancion()
    {
        System.out.println("Musica, Maestro!!!");
        patronEnsamblado.add("V0 " + super.cancion.getMusicString());        
        patronEnsamblado.add("V1 " + super.silencioSencillo.getMusicString()+" " + super.cancion.getMusicString());
        patronEnsamblado.repeat(2);
        this.play(patronEnsamblado);        
    }
    @Override
    public void agregaPatron(Pattern elPatron)
    {
        patronCombinado.add("V0 " + elPatron.getMusicString());
        patronCombinado.add("V1 " + "Rw " + elPatron.getMusicString());
        System.out.println(patronCombinado.getMusicString()+"\n");
        this.play(patronCombinado);
    }
    @Override
    public void guardaArchivoMidi(String name)
    {
        super.guardaArchivoMidi(name);
        /*File f = new File(name+".mid");
        try
        {
            this.saveMidi(patronCombinado, f);
        }
        catch(IOException e)
        {
        }*/
    }
}
