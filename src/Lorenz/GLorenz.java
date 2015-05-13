/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Lorenz;
/**
 *
 * @author OMAR LÓPEZ ORTEGA
 */
public class GLorenz extends GeneradorMusical 
{  
    public LorenzEuler l = new LorenzEuler();    
    //public int iteraciones;
    @Override
    public void cicloGenerador()
    {
        l.defineIteraciones(super.iteraciones);
        l.defineInstumento(super.instrumento);
        l.definePlantilla(super.plantilla);
        l.defineEscala(super.escala);
        l.defineAcorde(super.acorde);
        l.defineNombreArchivo(super.nombreArchivo);
        l.esDuracionVariable(super.dv);
        l.esTempoVariable(super.tv);
        //l.defineOpcion(super.numeroOpcion);
        l.defineValoresIniciales(super.x, super.y, super.z, super.tempoX, super.tempoY, super.tempoZ, super.duracionX, super.duracionY, super.duracionZ, super.sigma, super.r, super.b);
    }
    @Override
    public void ensamblaNotas(){}
}
