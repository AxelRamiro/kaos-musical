/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PlantillasDeCanciones;
import org.jfugue.*;
import InterfazUsuario.InterfazKaos;
/**
 *
 * @author OMAR LÓPEZ ORTEGA
 */
public class PlantillaSecuencial extends Plantilla
{    
    /*public void ejecutaCancion()
    {
        //System.out.println("Musica, Maestro!!!");
        super.vuelta1.add(super.silencioOctavo);        
        super.vuelta1.add(super.cancion);
        super.vuelta1.add(super.silencioOctavo);                
        this.play(super.vuelta1);        
    }*/
    @Override
    public void agregaPatron(Pattern elPatron)
    {
        super.cancion = elPatron;
        super.play(super.cancion);
        InterfazKaos.TextAreaAgentes.append("\n\tPatron interpretado: "+super.cancion.getMusicString()+"\n");
        super.close();
        this.close();
        //System.out.println("\n"+super.cancion.getMusicString()+"\n");
    }
    @Override
    public void guardaArchivoMidi(String name)
    {
        super.guardaArchivoMidi(name);
        /*File f = new File(name+".mid");
        try
        {
            this.saveMidi(super.cancion, f);
        }
        catch(IOException e)
        {            
        }*/
    }
}
