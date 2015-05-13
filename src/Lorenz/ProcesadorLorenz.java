package Lorenz;

import Ensambladores.*;
/**
 *
 * @author OMAR LÓPEZ ORTEGA
 */
public class ProcesadorLorenz {

    public double[] lasXsDobles;
    public double[] lasYsDobles;
    public double[] lasZsDobles;
    public int[] notasX;
    public int[] notasY;
    public int[] notasZ;
    public int[] temposX;
    public int[] temposY;
    public int[] temposZ;
    public double[] duracionesX;
    public double[] duracionesY;
    public double[] duracionesZ;
    public int iteraciones;
    public int contador;
    public int contadorVectores;
    public int i = 0;
    public int magnitudVector;
    public char multiplexor;
    public String instrumento = new String();
    public String escala = new String();
    public String plantilla = new String();
    public String acorde = new String();
    public String nombreArchivo = new String();
    public String nombreProyecto = new String();
    public EnsambladorNotas ensamblador = new EnsambladorNotas();
    public boolean varT, varD;

    public void tamañoVector(int tamaño) {
        this.iteraciones = tamaño;
        notasX = new int[iteraciones];
        notasY = new int[iteraciones];
        notasZ = new int[iteraciones];
        temposX = new int[iteraciones];
        temposY = new int[iteraciones];
        temposZ = new int[iteraciones];
        duracionesX = new double[iteraciones];
        duracionesY = new double[iteraciones];
        duracionesZ = new double[iteraciones];
    }

    public void recibeMultiplexor(char m) {
        this.multiplexor = m;
    }

    public void recibeInstrumento(String instrument) {
        this.instrumento = instrument;
    }

    public void recibeAcorde(String acor) {
        this.acorde = acor;
    }

    public void recibePlantilla(String plantilla) {
        this.plantilla = plantilla;
    }

    public void recibeEscala(String esc) {
        this.escala = esc;
    }

    public void recibeNombreArchivo(String n) {
        this.nombreArchivo = n;
    }

    public void recibeNombreProyecto(String nP) {
        this.nombreProyecto = nP;
    }

    public void recibeOpcionesVariacion(boolean varT, boolean varD) {
        this.varT = varT;
        this.varD = varD;
    }

    public void agrupaNotas(double[] lasXs, double[] lasYs, double[] lasZs) {
        //System.out.println("El techo absoluto de las notas...");
        for (int i = 0; i < iteraciones; i++) {
            notasX[i] = Math.abs((int) Math.ceil(lasXs[i]));
            if (notasX[i] > 127) {
                notasX[i] = notasX[i] % 127;
            }
            notasY[i] = Math.abs((int) Math.ceil(lasYs[i]));
            if (notasY[i] > 127) {
                notasY[i] = notasY[i] % 127;
            }
            notasZ[i] = Math.abs((int) Math.ceil(lasZs[i]));
            if (notasZ[i] > 127) {
                notasZ[i] = notasZ[i] % 127;
            }
            //System.out.println((i+1) + "\t" + notasX[i] + "\t" + notasY[i] + "\t" + notasZ[i]);
        }
        //agregaCancion(notasX, notasY, notasZ, iteraciones);
    }

    public void agrupaTempos(double[] lasXs, double[] lasYs, double[] lasZs) {
        //System.out.println("El techo absoluto de los tempos...");
        for (int i = 0; i < iteraciones; i++) {
            temposX[i] = Math.abs((int) Math.ceil(lasXs[i]));

            temposY[i] = Math.abs((int) Math.ceil(lasYs[i]));

            temposZ[i] = Math.abs((int) Math.ceil(lasZs[i]));

            //System.out.println((i+1) + "\t" + temposX[i] + "\t" + temposY[i] + "\t" + temposZ[i]);
        }
        //agregaCancion(temposX, temposY, temposZ, iteraciones);
    }

    public void agrupaTempos(double lasXs, double lasYs, double lasZs) {
         //System.out.println("El techo absoluto de los tempos...");
        //for (int i = 0; i < iteraciones; i++)
        {
            temposX[0] = Math.abs((int) Math.ceil(lasXs));
            temposY[0] = Math.abs((int) Math.ceil(lasYs));
            temposZ[0] = Math.abs((int) Math.ceil(lasZs));
            //System.out.println((i+1) + "\t" + temposX[i] + "\t" + temposY[i] + "\t" + temposZ[i]);
        }
    }

    public void agrupaDuraciones(double[] lasXs, double[] lasYs, double[] lasZs) {
        for (int i = 0; i < iteraciones; i++) {
            duracionesX[i] = Math.abs(lasXs[i]);
            duracionesY[i] = Math.abs(lasYs[i]);
            duracionesZ[i] = Math.abs(lasZs[i]);
        }
        //agregaCancion(duracionesX, duracionesY, duracionesZ, iteraciones);
    }

    public void agrupaDuraciones(double lasXs, double lasYs, double lasZs) {
        //for(int i = 0; i < iteraciones; i++)
        {
            duracionesX[0] = Math.abs(lasXs);
            duracionesY[0] = Math.abs(lasYs);
            duracionesZ[0] = Math.abs(lasZs);
        }
    }

    public void ensamblaNotas() {
        ensamblador.recibeInstrumento(this.instrumento);
        ensamblador.recibePlantilla(this.plantilla);
        ensamblador.recibeNombreArchivo(this.nombreArchivo);
        if (this.escala.equals("null")) {
            if (varT == true && varD == true) {
                ensamblador.ensamblaPatron(notasX, notasY, notasZ, temposX, temposY, temposZ, duracionesX, duracionesY, duracionesZ, this.acorde);
            }
            if (varT == false && varD == false) {
                ensamblador.ensamblaPatron(notasX, notasY, notasZ, temposX[0], temposY[0], temposZ[0], duracionesX[0], duracionesY[0], duracionesZ[0], this.acorde);
            }
            if (varT == false && varD == true) {
                ensamblador.ensamblaPatron(notasX, notasY, notasZ, temposX[0], temposY[0], temposZ[0], duracionesX, duracionesY, duracionesZ, this.acorde);
            }
            if (varT == true && varD == false) {
                ensamblador.ensamblaPatron(notasX, notasY, notasZ, temposX, temposY, temposZ, duracionesX[0], duracionesY[0], duracionesZ[0], this.acorde);
            }
        }
        if (!this.escala.equals("null")) {
            if (varT == true && varD == true) {
                ensamblador.ensamblaPatron(this.escala, notasX, notasY, notasZ, temposX, temposY, temposZ, duracionesX, duracionesY, duracionesZ, this.acorde);
            }
            if (varT == false && varD == false) {
                ensamblador.ensamblaPatron(this.escala, notasX, notasY, notasZ, temposX[0], temposY[0], temposZ[0], duracionesX[0], duracionesY[0], duracionesZ[0], this.acorde);
            }
            if (varT == false && varD == true) {
                ensamblador.ensamblaPatron(this.escala, notasX, notasY, notasZ, temposX[0], temposY[0], temposZ[0], duracionesX, duracionesY, duracionesZ, this.acorde);
            }
            if (varT == true && varD == false) {
                ensamblador.ensamblaPatron(this.escala, notasX, notasY, notasZ, temposX, temposY, temposZ, duracionesX[0], duracionesY[0], duracionesZ[0], this.acorde);
            }
        }
        ensamblador.interpretaPatron();
    }
}
