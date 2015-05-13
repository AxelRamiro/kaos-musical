package Ensambladores;

import org.jfugue.*;
import PlantillasDeCanciones.*;

/**
 *
 * @author OMAR LÓPEZ ORTEGA
 */
public class EnsambladorNotas {

    String[][] matrizAcordes;
    String[] notasXAc;
    String[] notasYAc;
    String[] notasZAc;
    String[] notasNMXAc;
    String[] notasNMYAc;
    Tempo[] temposX;
    Tempo[] temposY;
    Tempo[] temposZ;
    Tempo[] temposM;
    Tempo[] temposNM;
    Tempo[][] matrizTempos;
    Note[] notasX;
    Note[] notasY;
    Note[] notasZ;
    Note[] notasRealNM;
    Note[] notasImaNM;
    Note[][] matrizNotas;
    Tempo tempoM;
    Tempo tempoNM;
    Tempo tempoX;
    Tempo tempoY;
    Tempo tempoZ;
    Instrument elInstrumento;
    double[] duracionesX;
    double[] duracionesY;
    double[] duracionesZ;
    double[] duracionesRealNM;
    double[] duracionesImaNM;
    double[][] matrizDuraciones;
    double duracionX, duracionY, duracionZ;
    double duracionRealNM, duracionImaNM;
    Pattern patronNotasEnsamblado;
    Pattern p1;
    public String instrumento = new String();
    public String plantilla = new String();
    public String acorde = new String();
    public String nombreArchivo = new String();
    public String nombreProyecto = new String();
    public int opcion;
    public int iteraciones;
    Plantilla p;
    EscalaMusical e;

    public void recibeInstrumento(String instrument) {
        this.instrumento = instrument;
    }

    public void recibePlantilla(String plantilla) {
        this.plantilla = plantilla;
    }

    public void recibeOpcion(int o) {
        this.opcion = o;
    }

    public void recibeNombreArchivo(String nombreArch) {
        nombreArchivo = nombreArch;
    }

    public void recibreNombreProyecto(String nombreP) {
        nombreProyecto = nombreP;
    }

    //combinaciones bidimensionales

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int tempoX, int tempoY, double duracionX, double duracionY, String acor) {
        patronNotasEnsamblado = new Pattern();
        this.tempoX = new Tempo(tempoX);
        this.tempoY = new Tempo(tempoY);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) lasNotasX[i], duracionX);
                notasY[i] = new Note((byte) lasNotasY[i], duracionY);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.tempoY);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(this.tempoY);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int tempoX, int tempoY, double duracionX, double duracionY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        this.tempoX = new Tempo(tempoX);
        this.tempoY = new Tempo(tempoY);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), duracionX);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), duracionY);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.tempoY);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] losTemposX, int[] losTemposY, double duracionX, double duracionY, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        this.temposX = new Tempo[iteraciones];
        this.temposY = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasX[i] = new Note((byte) lasNotasX[i], duracionX);
                notasY[i] = new Note((byte) lasNotasY[i], duracionY);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.temposY[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(temposNM[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] losTemposX, int[] losTemposY, double duracionX, double duracionY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        this.temposX = new Tempo[iteraciones];
        this.temposY = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), duracionX);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), duracionY);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.temposY[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(temposY[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int tempoX, int tempoY, double[] durasX, double[] durasY, String acor) {
        patronNotasEnsamblado = new Pattern();
        this.tempoX = new Tempo(tempoX);
        this.tempoY = new Tempo(tempoY);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) lasNotasX[i], durasX[i]);
                notasY[i] = new Note((byte) lasNotasY[i], durasY[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.tempoY);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int tempoX, int tempoY, double[] durasX, double[] durasY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        this.tempoX = new Tempo(tempoX);
        this.tempoY = new Tempo(tempoY);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), durasX[i]);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), durasY[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.tempoY);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(this.tempoY);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] losTemposX, int[] losTemposY, double[] durasX, double[] durasY, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        this.temposX = new Tempo[iteraciones];
        this.temposY = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesY = new double[iteraciones];
        duracionesX = durasX;
        duracionesY = durasY;
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasX[i] = new Note((byte) lasNotasX[i], duracionesX[i]);
                notasY[i] = new Note((byte) lasNotasY[i], duracionesY[i]);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.temposY[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(temposY[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] losTemposX, int[] losTemposY, double[] durasX, double[] durasY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        this.temposX = new Tempo[iteraciones];
        this.temposY = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), durasX[i]);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), durasY[i]);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(this.temposY[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposY[i] = new Tempo(losTemposY[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(this.temposY[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    //combinaciones Mandelbrot

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int tempo, double duracionX, double duracionY, String acor) {
        patronNotasEnsamblado = new Pattern();
        tempoM = new Tempo(tempo);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) lasNotasX[i], duracionX);
                notasY[i] = new Note((byte) lasNotasY[i], duracionY);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int tempo, double duracionX, double duracionY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        tempoX = new Tempo(tempo);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        System.out.println(escala);
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), duracionX);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), duracionY);
                patronNotasEnsamblado.addElement(tempoX);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(tempoX);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(tempoX);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] lasNotasXNM, int[] lasNotasYNM, int tempoM, double duracionX, double duracionY, int tiempoNM, double duracionXNM, double duracionYNM, String acor) {
        patronNotasEnsamblado = new Pattern();
        this.tempoM = new Tempo(tempoM);
        this.tempoNM = new Tempo(tiempoNM);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasRealNM = new Note[iteraciones];
        notasImaNM = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasNMXAc = new String[iteraciones];
        notasNMYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesRealNM = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) lasNotasX[i], duracionX);
                notasY[i] = new Note((byte) lasNotasY[i], duracionY);
                notasRealNM[i] = new Note((byte) lasNotasXNM[i], duracionXNM);
                notasImaNM[i] = new Note((byte) lasNotasYNM[i], duracionYNM);
                patronNotasEnsamblado.addElement(this.tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(this.tempoNM);
                patronNotasEnsamblado.addElement(notasRealNM[i]);
                patronNotasEnsamblado.addElement(notasImaNM[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasNMXAc[i] = this.obtenAcorde(Integer.toString(lasNotasXNM[i]), acor);
                notasNMYAc[i] = this.obtenAcorde(Integer.toString(lasNotasXNM[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                notasNMXAc[i] = notasNMXAc[i] + "/" + Double.toString(duracionX);
                notasNMYAc[i] = notasNMYAc[i] + "/" + Double.toString(duracionX);
                patronNotasEnsamblado.addElement(this.tempoM);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(this.tempoNM);
                patronNotasEnsamblado.add(notasNMXAc[i]);
                patronNotasEnsamblado.add(notasNMYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] lasNotasXNM, int[] lasNotasYNM, int tempoM, double duracionX, double duracionY, int tempoNM, double duracionXNM, double duracionYNM, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        this.tempoM = new Tempo(tempoM);
        this.tempoNM = new Tempo(tempoNM);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasRealNM = new Note[iteraciones];
        notasImaNM = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasNMXAc = new String[iteraciones];
        notasNMYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesRealNM = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), duracionX);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), duracionY);
                notasRealNM[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasXNM[i]), duracionXNM);
                notasImaNM[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasYNM[i]), duracionYNM);
                patronNotasEnsamblado.addElement(this.tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(this.tempoNM);
                patronNotasEnsamblado.addElement(notasRealNM[i]);
                patronNotasEnsamblado.addElement(notasImaNM[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasNMXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasXNM[i])), acor);
                notasNMYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasYNM[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                notasNMXAc[i] = notasNMXAc[i] + "/" + Double.toString(duracionXNM);
                notasNMYAc[i] = notasNMYAc[i] + "/" + Double.toString(duracionYNM);
                patronNotasEnsamblado.addElement(this.tempoM);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(this.tempoNM);
                patronNotasEnsamblado.add(notasNMXAc[i]);
                patronNotasEnsamblado.add(notasNMYAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] losTemposX, double duracionX, double duracionY, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        this.temposX = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasX[i] = new Note((byte) lasNotasX[i], duracionX);
                notasY[i] = new Note((byte) lasNotasY[i], duracionY);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] losTemposX, double duracionX, double duracionY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        this.temposX = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), duracionX);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), duracionY);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duracionX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duracionY);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] losTemposX, double[] durasX, double[] durasY, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        temposX = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasX[i] = new Note((byte) lasNotasX[i], durasX[i]);
                notasY[i] = new Note((byte) lasNotasY[i], durasY[i]);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] losTemposX, double[] durasX, double[] durasY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        temposX = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), durasX[i]);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), durasY[i]);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(this.temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int tempoX, double[] durasX, double[] durasY, String acor) {
        patronNotasEnsamblado = new Pattern();
        this.tempoX = new Tempo(tempoX);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) lasNotasX[i], durasX[i]);
                notasY[i] = new Note((byte) lasNotasY[i], durasY[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        }
        if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int tempoX, double[] durasX, double[] durasY, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        this.tempoX = new Tempo(tempoX);
        iteraciones = lasNotasX.length;
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), durasX[i]);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), durasY[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                patronNotasEnsamblado.addElement(this.tempoX);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
            }
        }
    }

    //combinaciones tridimensionales

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int[] losTemposX, int[] losTemposY, int[] losTemposZ, double[] durasX, double[] durasY, double[] durasZ, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        temposX = new Tempo[iteraciones];
        temposNM = new Tempo[iteraciones];
        temposZ = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesRealNM = new double[iteraciones];
        duracionesZ = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposNM[i] = new Tempo(losTemposY[i]);
                temposZ[i] = new Tempo(losTemposZ[i]);
                notasX[i] = new Note((byte) lasNotasX[i], durasX[i]);
                notasY[i] = new Note((byte) lasNotasY[i], durasY[i]);
                notasZ[i] = new Note((byte) lasNotasZ[i], durasZ[i]);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(temposNM[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(losTemposX[i]);
                temposNM[i] = new Tempo(losTemposY[i]);
                temposZ[i] = new Tempo(losTemposZ[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasZAc[i] = this.obtenAcorde(Integer.toString(lasNotasZ[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(durasZ[i]);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(temposNM[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.add(notasZAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int[] tempoX, int[] tempoY, int[] tempoZ, double[] durasX, double[] durasY, double[] durasZ, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        temposX = new Tempo[iteraciones];
        temposNM = new Tempo[iteraciones];
        temposZ = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesRealNM = new double[iteraciones];
        duracionesZ = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(tempoX[i]);
                temposNM[i] = new Tempo(tempoY[i]);
                temposZ[i] = new Tempo(tempoZ[i]);
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), durasX[i]);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), durasY[i]);
                notasZ[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasZ[i]), durasZ[i]);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(temposNM[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(tempoX[i]);
                temposNM[i] = new Tempo(tempoY[i]);
                temposZ[i] = new Tempo(tempoZ[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasZAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasZ[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(durasZ[i]);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(temposNM[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.add(notasZAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int tempoX, int tempoY, int tempZ, double duraX, double duraY, double duraZ, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        tempoM = new Tempo(tempoX);
        tempoNM = new Tempo(tempoY);
        tempoZ = new Tempo(tempZ);
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) lasNotasX[i], duraX);
                notasY[i] = new Note((byte) lasNotasY[i], duraY);
                notasZ[i] = new Note((byte) lasNotasZ[i], duraZ);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        }
        if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acor);
                notasZAc[i] = this.obtenAcorde(Integer.toString(lasNotasZ[i]), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duraX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duraY);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(duraZ);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.add(notasZAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int tempoX, int tempoY, int tempZ, double duraX, double duraY, double duraZ, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        tempoM = new Tempo(tempoX);
        tempoNM = new Tempo(tempoY);
        tempoZ = new Tempo(tempZ);
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), duraX);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), duraY);
                notasZ[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasZ[i]), duraZ);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasZAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasZ[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duraX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duraY);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(duraZ);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.add(notasZAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int TempoX, int TempoY, int TempoZ, double[] durasX, double[] durasY, double[] durasZ, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        tempoM = new Tempo(TempoX);
        tempoNM = new Tempo(TempoY);
        tempoZ = new Tempo(TempoZ);
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesRealNM = new double[iteraciones];
        duracionesZ = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) lasNotasX[i], durasX[i]);
                notasY[i] = new Note((byte) lasNotasY[i], durasY[i]);
                notasZ[i] = new Note((byte) lasNotasZ[i], durasZ[i]);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acorde);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acorde);
                notasZAc[i] = this.obtenAcorde(Integer.toString(lasNotasZ[i]), acorde);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(durasZ[i]);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int TempoX, int TempoY, int TempoZ, double[] durasX, double[] durasY, double[] durasZ, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        tempoM = new Tempo(TempoX);
        tempoNM = new Tempo(TempoY);
        tempoZ = new Tempo(TempoZ);
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesRealNM = new double[iteraciones];
        duracionesZ = new double[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), durasX[i]);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), durasY[i]);
                notasZ[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasZ[i]), durasZ[i]);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasZAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasZ[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(durasX[i]);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(durasY[i]);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(durasZ[i]);
                patronNotasEnsamblado.addElement(tempoM);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(tempoNM);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(tempoZ);
                patronNotasEnsamblado.add(notasZAc[i]);
            }
        }
    }

    public void ensamblaPatron(int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int[] TemposX, int[] TemposY, int[] TemposZ, double duraX, double duraY, double duraZ, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        temposX = new Tempo[iteraciones];
        temposNM = new Tempo[iteraciones];
        temposZ = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(TemposX[i]);
                temposNM[i] = new Tempo(TemposY[i]);
                temposZ[i] = new Tempo(TemposZ[i]);
                notasX[i] = new Note((byte) lasNotasX[i], duraX);
                notasY[i] = new Note((byte) lasNotasY[i], duraY);
                notasZ[i] = new Note((byte) lasNotasZ[i], duraZ);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(temposNM[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(TemposX[i]);
                temposNM[i] = new Tempo(TemposY[i]);
                temposZ[i] = new Tempo(TemposZ[i]);
                notasX[i] = new Note((byte) lasNotasX[i], duraX);
                notasY[i] = new Note((byte) lasNotasY[i], duraY);
                notasZ[i] = new Note((byte) lasNotasZ[i], duraZ);
                notasXAc[i] = this.obtenAcorde(Integer.toString(lasNotasX[i]), acorde);
                notasYAc[i] = this.obtenAcorde(Integer.toString(lasNotasY[i]), acorde);
                notasZAc[i] = this.obtenAcorde(Integer.toString(lasNotasZ[i]), acorde);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duraX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duraY);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(duraZ);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(temposNM[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.add(notasZAc[i]);
            }
        }
    }

    public void ensamblaPatron(String escala, int[] lasNotasX, int[] lasNotasY, int[] lasNotasZ, int[] TemposX, int[] TemposY, int[] TemposZ, double duraX, double duraY, double duraZ, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotasX.length;
        temposX = new Tempo[iteraciones];
        temposY = new Tempo[iteraciones];
        temposZ = new Tempo[iteraciones];
        notasX = new Note[iteraciones];
        notasY = new Note[iteraciones];
        notasZ = new Note[iteraciones];
        notasXAc = new String[iteraciones];
        notasYAc = new String[iteraciones];
        notasZAc = new String[iteraciones];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        System.out.println(escala);
        if (acor.equals("No")) {
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(TemposX[i]);
                temposY[i] = new Tempo(TemposY[i]);
                temposZ[i] = new Tempo(TemposZ[i]);
                notasX[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasX[i]), duraX);
                notasY[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasY[i]), duraY);
                notasZ[i] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotasZ[i]), duraZ);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.addElement(notasX[i]);
                patronNotasEnsamblado.addElement(temposY[i]);
                patronNotasEnsamblado.addElement(notasY[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.addElement(notasZ[i]);
            }
        } else if (!acor.equals("No")) {
            System.out.println(acor);
            for (int i = 0; i < iteraciones; i++) {
                temposX[i] = new Tempo(TemposX[i]);
                temposY[i] = new Tempo(TemposY[i]);
                temposZ[i] = new Tempo(TemposZ[i]);
                notasXAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasX[i])), acor);
                notasYAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasY[i])), acor);
                notasZAc[i] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotasZ[i])), acor);
                notasXAc[i] = notasXAc[i] + "/" + Double.toString(duraX);
                notasYAc[i] = notasYAc[i] + "/" + Double.toString(duraY);
                notasZAc[i] = notasZAc[i] + "/" + Double.toString(duraZ);
                patronNotasEnsamblado.addElement(temposX[i]);
                patronNotasEnsamblado.add(notasXAc[i]);
                patronNotasEnsamblado.addElement(temposY[i]);
                patronNotasEnsamblado.add(notasYAc[i]);
                patronNotasEnsamblado.addElement(temposZ[i]);
                patronNotasEnsamblado.add(notasZAc[i]);
            }
        }
    }

    //Combinaciones Markus-Lyapunov

    public void ensamblaPatron(int[][] lasNotas, int[][] tiempos, double duracion, int lx, int ly, String acor) {
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotas.length;
        matrizTempos = new Tempo[lx][ly];
        matrizAcordes = new String[lx][ly];
        matrizNotas = new Note[lx][ly];
        duracionX = duracion;
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizNotas[i][j] = new Note((byte) lasNotas[i][j], duracionX);
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizAcordes[i][j] = this.obtenAcorde(Integer.toString(lasNotas[i][j]), acor);
                    matrizAcordes[i][j] = matrizAcordes[i][j] + "/" + Double.toString(duracionX);
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public void ensamblaPatron(String escala, int[][] lasNotas, int[][] tiempos, double duracion, int lx, int ly, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        matrizTempos = new Tempo[lx][ly];
        matrizNotas = new Note[lx][ly];
        matrizAcordes = new String[lx][ly];
        duracionX = duracion;
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizNotas[i][j] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotas[i][j]), duracionX);//duraX
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizAcordes[i][j] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotas[i][j])), acor);
                    matrizAcordes[i][j] = matrizAcordes[i][j] + "/" + Double.toString(duracionX);
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public void ensamblaPatron(int[][] lasNotas, int[][] tiempos, double[][] duraciones, int lx, int ly, String acor) {
        patronNotasEnsamblado = new Pattern();
        matrizTempos = new Tempo[lx][ly];
        matrizNotas = new Note[lx][ly];
        matrizAcordes = new String[lx][ly];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizNotas[i][j] = new Note((byte) lasNotas[i][j], duraciones[i][j]);
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizAcordes[i][j] = Integer.toString(lasNotas[i][j]);
                    matrizAcordes[i][j] = matrizAcordes[i][j] + "/" + Double.toString(duraciones[i][j]);
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public void ensamblaPatron(String escala, int[][] lasNotas, int[][] tiempos, double[][] duraciones, int lx, int ly, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        iteraciones = lasNotas.length;
        matrizTempos = new Tempo[lx][ly];
        matrizNotas = new Note[lx][ly];
        matrizAcordes = new String[lx][ly];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizNotas[i][j] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotas[i][j]), duraciones[i][j]);//duraX
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizTempos[i][j] = new Tempo(tiempos[i][j]);
                    matrizAcordes[i][j] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotas[i][j])), acor);//duraX
                    patronNotasEnsamblado.addElement(matrizTempos[i][j]);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public void ensamblaPatron(int[][] lasNotas, int tiempo, double[][] duraciones, int lx, int ly, String acor) {
        patronNotasEnsamblado = new Pattern();
        tempoX = new Tempo(tiempo);
        matrizNotas = new Note[lx][ly];
        matrizAcordes = new String[lx][ly];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizNotas[i][j] = new Note((byte) lasNotas[i][j], duraciones[i][j]);
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizAcordes[i][j] = this.obtenAcorde(Integer.toString(lasNotas[i][j]), acor);
                    matrizAcordes[i][j] = matrizAcordes[i][j] + "/" + Double.toString(duraciones[i][j]);
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public void ensamblaPatron(String escala, int[][] lasNotas, int tiempo, double[][] duraciones, int lx, int ly, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        tempoX = new Tempo(tiempo);
        matrizNotas = new Note[lx][ly];
        matrizAcordes = new String[lx][ly];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizNotas[i][j] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotas[i][j]), duraciones[i][j]);//duraX
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizAcordes[i][j] = this.obtenAcorde(Integer.toString(lasNotas[i][j]), acor);
                    matrizAcordes[i][j] = matrizAcordes[i][j] + "/" + Double.toString(duraciones[i][j]);
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public void ensamblaPatron(int[][] lasNotas, int tiempo, double duracion, int lx, int ly, String acor) {
        patronNotasEnsamblado = new Pattern();
        tempoX = new Tempo(tiempo);
        matrizNotas = new Note[lx][ly];
        matrizAcordes = new String[lx][ly];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizNotas[i][j] = new Note((byte) lasNotas[i][j], duracion);
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizAcordes[i][j] = this.obtenAcorde(Integer.toString(lasNotas[i][j]), acor);
                    matrizAcordes[i][j] = matrizAcordes[i][j] + "/" + Double.toString(duracion);
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public void ensamblaPatron(String escala, int[][] lasNotas, int tiempo, double duracion, int lx, int ly, String acor) {
        e = new EscalaMusical();
        patronNotasEnsamblado = new Pattern();
        tempoX = new Tempo(tiempo);
        matrizNotas = new Note[lx][ly];
        matrizAcordes = new String[lx][ly];
        p1 = new Pattern("I[" + instrumento + "]");
        patronNotasEnsamblado.add(p1);
        if (acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizNotas[i][j] = new Note((byte) e.estableceNotaEnEscala(escala, lasNotas[i][j]), duracion);
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.addElement(matrizNotas[i][j]);
                }
            }
        } else if (!acor.equals("No")) {
            for (int i = 0; i < lx; i++) {
                for (int j = 0; j < ly; j++) {
                    matrizAcordes[i][j] = this.obtenAcorde(Integer.toString(e.estableceNotaEnEscala(escala, lasNotas[i][j])), acor);
                    matrizAcordes[i][j] = matrizAcordes[i][j] + "/" + Double.toString(duracion);
                    patronNotasEnsamblado.addElement(tempoX);
                    patronNotasEnsamblado.add(matrizAcordes[i][j]);
                }
            }
        }
    }

    public String obtenAcorde(String laNotaRaiz, String elAcorde) {
        if (elAcorde.equals("Mayor 7")) {
            return Acorde.Mayor7(laNotaRaiz);
        } else if (elAcorde.equals("Disminuido")) {
            return Acorde.Disminuido(laNotaRaiz);
        } else if (elAcorde.equals("Mayor")) {
            return Acorde.Mayor(laNotaRaiz);
        } else if (elAcorde.equals("Aumentado")) {
            return Acorde.Aumentado(laNotaRaiz);
        } else if (elAcorde.equals("Mayor 6")) {
            return Acorde.Mayor6(laNotaRaiz);
        } else if (elAcorde.equals("Mayor 9")) {
            return Acorde.Mayor9(laNotaRaiz);
        } else if (elAcorde.equals("Menor")) {
            return Acorde.Menor(laNotaRaiz);
        } else if (elAcorde.equals("Menor 7")) {
            return Acorde.Menor7(laNotaRaiz);
        } else if (elAcorde.equals("Menor 6")) {
            return Acorde.Menor6(laNotaRaiz);
        } else if (elAcorde.equals("Menor 9")) {
            return Acorde.Menor9(laNotaRaiz);
        } else if (elAcorde.equals("7mo Dominante")) {
            return Acorde.SeptimoDominante(laNotaRaiz);
        } else if (elAcorde.equals("7mo Disminuido")) {
            return Acorde.SeptimoDisminuido(laNotaRaiz);
        } else if (elAcorde.equals("Add9")) {
            return Acorde.Add9(laNotaRaiz);
        } else if (elAcorde.equals("7-5-9")) {
            return Acorde.SieteMenos5Menos9(laNotaRaiz);
        } else if (elAcorde.equals("7-5+9")) {
            return Acorde.SieteMenos5Mas9(laNotaRaiz);
        } else if (elAcorde.equals("7+5-9")) {
            return Acorde.SieteMas5Menos9(laNotaRaiz);
        } else if (elAcorde.equals("7+5+9")) {
            return Acorde.SieteMas5Mas9(laNotaRaiz);
        } else {
            return null;
        }
    }

    public Pattern devuelvePatronNotas() {
        return patronNotasEnsamblado;
    }

    public void interpretaPatron() {
        if (this.plantilla.equals("SECUENCIAL")) {
            p = new PlantillaSecuencial();
            p.agregaPatron(this.devuelvePatronNotas());
            p.guardaArchivoMidi(this.nombreArchivo);
        } else if (this.plantilla.equals("INCREMENTAL")) {
            p = new PlantillaIncremental();
            p.agregaPatron(this.devuelvePatronNotas());
            p.guardaArchivoMidi(this.nombreArchivo);
        } else if (this.plantilla.equals("CANON")) {
            p = new PlantillaCanon();
            p.agregaPatron(this.devuelvePatronNotas());
            p.guardaArchivoMidi(this.nombreArchivo);
        } else if (this.plantilla.equals("CRECEDECRECE")) {
            p = new PlantillaCreceDecrece();
            p.agregaPatron(this.devuelvePatronNotas());
            p.guardaArchivoMidi(this.nombreArchivo);
        } else if (this.plantilla.equals("CRECEDECRECEPARALELO")) {
            p = new PlantillaCreceDecreceParalelo();
            p.agregaPatron(this.devuelvePatronNotas());
            p.guardaArchivoMidi(this.nombreArchivo);
        }
    }
}
