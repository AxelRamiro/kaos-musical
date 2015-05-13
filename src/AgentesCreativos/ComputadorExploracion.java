package AgentesCreativos;

import Clifford.*;
import Lorenz.*;
import Lyapunov.*;
import MamdaniLopez.*;
import Mandelbrot.*;
import ThreePly.*;
import InterfazUsuario.InterfazKaos;
import Almacenamiento.EjecutorSentencias;

/**
 * @author Omar Lopez Ortega Profesor Investigador CITIS - UAEH
 */
public class ComputadorExploracion {

    public static GeneradorMusical generador;

    public static void defineExploracion(String g) {
        if (g.equals("Lorenz")) {
            generador = new GLorenz();
            generador.estableceIteraciones(InterfazKaos.numeroIteraciones);
            generador.establecePlantilla(InterfazKaos.laPlantilla);
            generador.esTempoVariable(false);
            generador.esDuracionVariable(false);
            generador.estableceNombreProyecto(InterfazKaos.TextFieldArchivoLorenz.getText());
        } else if (g.equals("Mandelbrot")) {
            generador = new GMandelbrot();
            generador.estableceIteraciones(InterfazKaos.numeroIteraciones);
            generador.establecePlantilla(InterfazKaos.laPlantilla);
            //generador.esTempoVariable(true);
            if (InterfazKaos.MandelbrotTempoVariable.isSelected()) {
                generador.esTempoVariable(true);
            } else {
                generador.esTempoVariable(false);
            }
            generador.esDuracionVariable(false);
            generador.estableceDiscriminador(InterfazKaos.discriminadorMandelbrot);
            generador.establecePorTocar(InterfazKaos.porTocar);
            generador.estableceNombreProyecto(InterfazKaos.TextFieldArchivoMandelbrot.getText());
        } else if (g.equals("Lyapunov")) {
            generador = new GLyapunov();
            generador.estableceIteraciones(InterfazKaos.numeroIteraciones);
            generador.establecePlantilla(InterfazKaos.laPlantilla);
            if (InterfazKaos.LyapunovTempoVariable.isSelected()) {
                generador.tv = true;
            } else {
                generador.tv = false;
            }
            if (InterfazKaos.LyapunovDuracionVariable.isSelected()) {
                generador.dv = true;
            } else {
                generador.dv = false;
            }
            generador.estableceNombreProyecto(InterfazKaos.TextFieldArchivoLyap.getText());
        } else if (g.equals("Three Ply")) {
            generador = new GThreePly();
            generador.estableceIteraciones(InterfazKaos.numeroIteraciones);
            generador.establecePlantilla(InterfazKaos.laPlantilla);
            //generador.esTempoVariable(false);
            if (InterfazKaos.TPlyTempoVariable.isSelected()) {
                generador.esTempoVariable(true);
            } else {
                generador.esTempoVariable(false);
            }
            if (InterfazKaos.TPlyDuracionVariable.isSelected()) {
                generador.esDuracionVariable(true);
            } else {
                generador.esDuracionVariable(false);
            }
            //generador.esDuracionVariable(false);
            generador.estableceNombreProyecto(InterfazKaos.TextFieldArchivo3P.getText());
        } else if (g.equals("Clifford")) {
            generador = new GClifford();
            generador.estableceIteraciones(InterfazKaos.numeroIteraciones);
            generador.establecePlantilla(InterfazKaos.laPlantilla);
            if (InterfazKaos.CliffordTempoVariable.isSelected()) {
                generador.tv = true;
            } else {
                generador.tv = false;
            }
            if (InterfazKaos.CliffordDuracionVariable.isSelected()) {
                generador.dv = true;
            } else {
                generador.dv = false;
            }
            generador.estableceNombreProyecto(InterfazKaos.TextFieldArchivoClifford.getText());
        } else if (g.equals("Mamdani-Lopez")) {
            generador = new GMamdaniLopez();
            generador.estableceIteraciones(InterfazKaos.numeroIteraciones);
            if (InterfazKaos.MLTempoVariable.isSelected()) {
                generador.esTempoVariable(true);
            } else {
                generador.esTempoVariable(false);
            }
            if (InterfazKaos.MLDuracionVariable.isSelected()) {
                generador.esDuracionVariable(true);
            } else {
                generador.esDuracionVariable(false);
            }
            generador.establecePlantilla(InterfazKaos.laPlantilla);
            generador.estableceNombreProyecto(InterfazKaos.TextFieldArchivoML.getText());
        }
    }

    public static void computaExploracion(String g, String i, String e, String a) {
        if (g.equals("Lorenz")) {
            generador.estableceInstrumento(i);
            generador.estableceEscala(e);
            generador.estableceAcorde(a);
            generador.estableceNombreArchivo(InterfazKaos.TextFieldArchivoLorenz.getText() + g + i + e + a);
            generador.generaPatron((InterfazKaos.x), (InterfazKaos.y), (InterfazKaos.z), InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.tempo3, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.duracion3, Double.parseDouble(InterfazKaos.TextFieldSigmaL.getText()), Double.parseDouble(InterfazKaos.TextFieldRL.getText()), Double.parseDouble(InterfazKaos.TextFieldBL.getText()));
            generador.cicloGenerador();
            EjecutorSentencias.insertarLorenz(g, InterfazKaos.x, InterfazKaos.y, InterfazKaos.z, Double.parseDouble(InterfazKaos.TextFieldSigmaL.getText()), Double.parseDouble(InterfazKaos.TextFieldRL.getText()), Double.parseDouble(InterfazKaos.TextFieldBL.getText()), generador.nombreArchivo);
            EjecutorSentencias.insertarParametroMusicales(generador.nombreArchivo, generador.instrumento, generador.escala, generador.acorde, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.tempo3, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.duracion3);
        } else if (g.equals("Mandelbrot")) {
            generador.estableceInstrumento(i);
            generador.estableceEscala(e);
            generador.estableceAcorde(a);
            generador.estableceNombreArchivo(InterfazKaos.TextFieldArchivoMandelbrot.getText() + g + i + e + a);
            generador.generaPatron(InterfazKaos.tempo1, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.tempo2, InterfazKaos.duracion3, InterfazKaos.duracion4);
            generador.cicloGenerador();
            generador.ensamblaNotas();
            EjecutorSentencias.insertarMandelbrot(g, Integer.parseInt(InterfazKaos.TextFieldIterM.getText()), generador.nombreArchivo);
            EjecutorSentencias.insertarParametroMusicales(generador.nombreArchivo, generador.instrumento, generador.escala, generador.acorde, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.tempo3, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.duracion3);
        } else if (g.equals("Lyapunov")) {
            generador.estableceInstrumento(i);
            generador.estableceEscala(e);
            generador.estableceAcorde(a);
            generador.estableceNombreArchivo(InterfazKaos.TextFieldArchivoLyap.getText() + g + i + e + a);
            generador.generaPatron(InterfazKaos.TextFieldCadenaL.getText(), Integer.parseInt(InterfazKaos.TextFieldXIL.getText()), Integer.parseInt(InterfazKaos.TextFieldXFL.getText()), Integer.parseInt(InterfazKaos.TextFieldYIL.getText()), Integer.parseInt(InterfazKaos.TextFieldYFL.getText()), Integer.parseInt(InterfazKaos.TextFieldTL.getText()), Double.parseDouble(InterfazKaos.TextFieldDL.getText()));
            generador.cicloGenerador();
            generador.ensamblaNotas();
            EjecutorSentencias.insertarLyapunov(g, Integer.parseInt(InterfazKaos.TextFieldXIL.getText()), Integer.parseInt(InterfazKaos.TextFieldYIL.getText()), Integer.parseInt(InterfazKaos.TextFieldXFL.getText()), Integer.parseInt(InterfazKaos.TextFieldYFL.getText()), InterfazKaos.TextFieldCadenaL.getText(), generador.nombreArchivo);
            EjecutorSentencias.insertarParametroMusicales(generador.nombreArchivo, generador.instrumento, generador.escala, generador.acorde, Integer.parseInt(InterfazKaos.TextFieldTL.getText()), InterfazKaos.tempo2, InterfazKaos.tempo3, Double.parseDouble(InterfazKaos.TextFieldDL.getText()), InterfazKaos.duracion2, InterfazKaos.duracion3);
        } else if (g.equals("Three Ply")) {
            generador.estableceInstrumento(i);
            generador.estableceEscala(e);
            generador.estableceAcorde(a);
            generador.estableceNombreArchivo(InterfazKaos.TextFieldArchivo3P.getText() + g + i + e + a);
            generador.generaPatron(InterfazKaos.x, InterfazKaos.y, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.duracion1, InterfazKaos.duracion2);
            generador.cicloGenerador();
            generador.ensamblaNotas();
            EjecutorSentencias.insertar3P(g, InterfazKaos.x, InterfazKaos.y, generador.nombreArchivo);
            EjecutorSentencias.insertarParametroMusicales(generador.nombreArchivo, generador.instrumento, generador.escala, generador.acorde, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.tempo3, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.duracion3);
        } else if (g.equals("Clifford")) {
            generador.estableceInstrumento(i);
            generador.estableceEscala(e);
            generador.estableceAcorde(a);
            generador.estableceNombreArchivo(InterfazKaos.TextFieldArchivoClifford.getText() + g + i + e + a);
            generador.generaPatron(InterfazKaos.x, InterfazKaos.y, InterfazKaos.z, InterfazKaos.a, InterfazKaos.b, InterfazKaos.c, InterfazKaos.d, InterfazKaos.e, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.tempo3, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.duracion3);
            generador.cicloGenerador();
            generador.ensamblaNotas();
            EjecutorSentencias.insertarClifford(g, InterfazKaos.x, InterfazKaos.y, InterfazKaos.z, InterfazKaos.a, InterfazKaos.b, InterfazKaos.c, InterfazKaos.d, InterfazKaos.e, generador.nombreArchivo);
            EjecutorSentencias.insertarParametroMusicales(generador.nombreArchivo, generador.instrumento, generador.escala, generador.acorde, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.tempo3, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.duracion3);
        } else if (g.equals("Mamdani-Lopez")) {
            generador.estableceEscala(e);
            generador.estableceAcorde(a);
            generador.estableceInstrumento(i);
            generador.estableceNombreArchivo(InterfazKaos.TextFieldArchivoML.getText() + g + i + e + a);
            generador.recibeABCML(Double.parseDouble(InterfazKaos.TextFieldaML.getText()), Double.parseDouble(InterfazKaos.TextFieldbML.getText()), Double.parseDouble(InterfazKaos.TextFieldcML.getText()));
            generador.generaPatron(InterfazKaos.x, InterfazKaos.y, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.duracion1, InterfazKaos.duracion2);
            generador.cicloGenerador();
            generador.ensamblaNotas();
            EjecutorSentencias.insertarML(g, InterfazKaos.x, InterfazKaos.y, Double.parseDouble(InterfazKaos.TextFieldaML.getText()), Double.parseDouble(InterfazKaos.TextFieldbML.getText()), Double.parseDouble(InterfazKaos.TextFieldcML.getText()), generador.nombreArchivo);
            EjecutorSentencias.insertarParametroMusicales(generador.nombreArchivo, generador.instrumento, generador.escala, generador.acorde, InterfazKaos.tempo1, InterfazKaos.tempo2, InterfazKaos.tempo3, InterfazKaos.duracion1, InterfazKaos.duracion2, InterfazKaos.duracion3);
        }
    }
}
