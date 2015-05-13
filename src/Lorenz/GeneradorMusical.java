package Lorenz;

import Almacenamiento.EjecutorSentencias;

/**
 * @author OMAR LÓPEZ ORTEGA
 */
public abstract class GeneradorMusical {

    public int x, y, z, w, discriminador;
    public int tempoX, tempoY, tempoZ, tempoW;
    public double duracionX, duracionY, duracionZ, duracionW, sigma, r, b;
    public double a;
    public double c;
    public double d;
    public double e, xd, yd, zd, wd;
    public char multiplexor;
    public char porTocar;
    public String iterador = new String();
    public int iteraciones;
    public int numeroOpcion;
    public String instrumento = new String();
    public String plantilla = new String();
    public String escala = new String();
    public String acorde = new String();
    public String nombreArchivo = new String();
    public String nombreProyecto = new String();
    public boolean tv, dv;

    public void generaPatron(int elTempo, double laDuracionM1, double laDuracionM2) {
        tempoX = elTempo;
        duracionX = laDuracionM1;
        duracionY = laDuracionM2;
    }

    public void generaPatronNM(int elTempo, double laDuracionNM1, double laDuracionNM2) {
        tempoX = elTempo;
        duracionX = laDuracionNM1;
        duracionY = laDuracionNM2;
    }

    public void generaPatron(int elTempo, double laDuracionNM1, double laDuracionNM2, int elTempoNM, double DNM1, double DNM2) {
        tempoX = elTempo;
        duracionX = laDuracionNM1;
        duracionY = laDuracionNM2;
        tempoX = elTempoNM;
        duracionY = DNM1;
        duracionZ = DNM2;
    }

    public void generaPatron(int notaX, int notaY, int tempoX, int tempoY, double duracionX, double duracionY) {
        x = notaX;
        y = notaY;
        this.tempoX = tempoX;
        this.tempoY = tempoY;
        this.duracionX = duracionX;
        this.duracionY = duracionY;
    }

    public void generaPatron(int x, int y, int z, char multiplex) {
        this.x = x;
        this.y = y;
        multiplexor = multiplex;
    }

    public void generaPatron(int x, int y, int z, int t1, int t2, int t3, double x2, double y2, double z2, double sig, double r, double b) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.tempoX = t1;
        this.tempoY = t2;
        this.tempoZ = t3;
        this.duracionX = x2;
        this.duracionY = y2;
        this.duracionZ = z2;
        this.sigma = sig;
        this.r = r;
        this.b = b;
    }

    public void generaPatron(String iter, double xI, double xF, double yI, double yF, int tempo, double duracion) {
        String temporal;
        iterador = iter;
        temporal = iter;
        do {
            iterador = iterador + temporal;
        } while (iterador.length() < this.iteraciones);
        xd = xI;
        yd = xF;
        zd = yI;
        wd = yF;
        tempoX = tempo;
        duracionX = duracion;
    }

    public void generaPatron(int x, int y, int z, double a, double b, double c, double d, double e, int t1, int t2, int t3, double duraX, double duraY, double duraZ) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.tempoX = t1;
        this.tempoY = t2;
        this.tempoZ = t3;
        this.duracionX = duraX;
        this.duracionY = duraY;
        this.duracionZ = duraZ;
    }

    public void estableceIteraciones(int i) {
        this.iteraciones = i;
    }

    public void estableceInstrumento(String instrument) {
        this.instrumento = instrument;
    }

    public void establecePlantilla(String laPlantilla) {
        this.plantilla = laPlantilla;
    }

    public void estableceEscala(String esc) {
        this.escala = esc;
    }

    public void estableceAcorde(String acor) {
        this.acorde = acor;
    }

    public void estableceNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        EjecutorSentencias.insertarOpusPrimaria(this.nombreArchivo, this.nombreProyecto);
    }

    public void estableceNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
        EjecutorSentencias.insertarProyecto(this.nombreProyecto);
    }

    public void esTempoVariable(boolean tv) {
        this.tv = tv;
    }

    public void esDuracionVariable(boolean dv) {
        this.dv = dv;
    }

    public void estableceOpcion(int o) {
        this.numeroOpcion = o;
    }

    public void estableceDiscriminador(int elDiscriminador) {
        discriminador = elDiscriminador;
    }

    public void establecePorTocar(char c) {
        porTocar = c;
    }

    public void recibeABCML(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public abstract void ensamblaNotas();

    public abstract void cicloGenerador();
}
