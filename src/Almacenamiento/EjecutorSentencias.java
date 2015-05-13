/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenamiento;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Omar Lopez Ortega Profesor - Investigador CITIS - UAEH
 */
public class EjecutorSentencias {

    static Connection con;
    static ConectorBD cn = new ConectorBD();
    static Statement s;
    static ResultSet res = null;
    static int ide, comision;
    static String nombre, apellido;
    static String[] proyectos, obrasPrimarias;

    public static void insertarProyecto(String name) {
        
        if(buscarProyecto(name) > 0) {
        } else{
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("INSERT INTO ProyectoExploratorio (nombreProyecto) values('" + name + "')");
            System.out.println("Insercion correcta de proyecto: " + name);
        } catch (SQLException ex) {
            System.out.println("Fallo insercion proyecto: " + name + " " + ex);
        }}
    }

    public static int buscarProyecto(String nombreP) {
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT idProyecto FROM ProyectoExploratorio where nombreProyecto = '" + nombreP + "'");
            //while(res.next())
            //{
            res.next();
            //nombre = nombreP;
            ide = res.getInt("idProyecto");
            System.out.println("Datos del proyecto " + ide + ": " + nombreP);
            //}
            System.out.println("");
        } catch (SQLException ex) {
            System.out.println("Fallo busqueda de proyecto: " + nombreP + " " + ex);
        }
        return ide;
    }

    public static ResultSet buscarProyectos() {
        int i = 0;
        proyectos = new String[1000];
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT nombreProyecto FROM ProyectoExploratorio");
            //while(res.next())
            //{
            //proyectos[i]= res.getString("nombreProyecto");
            //System.out.println("Datos del proyecto "+ proyectos[i]);
            //i++;
            //if(res.isLast())
            //{
            //  break;
            //}
            //}
        } catch (SQLException ex) {
            System.out.println("Fallo busqueda de proyectos!!!");
        }
        return res;
    }

    public static String[] entregaNombresProyectos() {
        int i = 0, j = 0;
        res = buscarProyectos();
        try {
            while (res.next()) {
                //ps[i]= r.getString("nombreProyecto");
                //System.out.println("Datos del proyecto "+ ps[i]);
                i = i + 1;
                if (res.isLast()) {
                    break;
                }
            }
        } catch (SQLException e) {
        }
        res = EjecutorSentencias.buscarProyectos();
        try {
            proyectos = new String[i];
            while (res.next()) {
                proyectos[j] = res.getString("nombreProyecto");
                //System.out.println("Datos del proyecto "+ proyectos[j]);
                j++;
                if (res.isLast()) {
                    break;
                }
            }
        } catch (SQLException e) {
        }
        return proyectos;
    }

    public static int buscarSistemaGenerador(String n) {
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT idSistemaGenerador FROM SistemaGenerador where nombreOpusPrimaria = '" + n + "'");
            //while(res.next())
            //{
            res.next();
            //nombre = nombreP;
            ide = res.getInt("idSistemaGenerador");
            System.out.println("Datos del SG " + ide + ": " + n);
            //}
            System.out.println("");
        } catch (SQLException ex) {
            System.out.println("Fallo busqueda de Sistema Generador: " + n + " " + ex);
        }
        return ide;
    }

    public static void insertarOpusPrimaria(String name, String nombreProyecto) {
        int idP = buscarProyecto(nombreProyecto);
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("INSERT INTO OpusPrimaria (nombreOpusPrimaria, nombreProyecto, idProyecto) values('" + name + "','" + nombreProyecto + "','" + idP + "')");
            System.out.println("Insercion exitosa Opus Primaria:" + name);
        } catch (SQLException ex) {
            System.out.println("Fallo insercion Opus Primaria: " + name + " " + ex);
        }
    }

    public static int buscarOpusPrimaria(String nombreOpusPrimaria) {
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT idOpusPrimaria FROM OpusPrimaria where nombreOpusPrimaria ='" + nombreOpusPrimaria + "'");
            //while(res.next())
            {
                res.next();
                ide = res.getInt("idOpusPrimaria");
                System.out.println("Id Opus Primaria= " + ide);
            }
            System.out.println("");
        } catch (SQLException ex) {
            System.out.println("Fallo busqueda Opus Primaria " + ex);
        }
        return ide;
    }

    public static ResultSet buscarObrasPrimarias(String nombreProyecto) {
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT nombreOpusPrimaria FROM OpusPrimaria where nombreProyecto ='" + nombreProyecto + "'");
            //while(res.next())
            //{
            //    res.next();
            //    ide= res.getInt("idOpusPrimaria");
            //    System.out.println("Id Opus Primaria= "+ide);
            //}
            //System.out.println("");
        } catch (SQLException ex) {
            System.out.println("Fallo busqueda Opus Primaria " + ex);
        }
        return res;
    }

    public static String[] entregaObrasPrimarias(String np) {
        int i = 0, j = 0;
        res = buscarObrasPrimarias(np);
        try {
            while (res.next()) {
                //ps[i]= r.getString("nombreProyecto");
                //System.out.println("Datos del proyecto "+ ps[i]);
                i = i + 1;
                if (res.isLast()) {
                    break;
                }
            }
        } catch (SQLException e) {
        }
        res = EjecutorSentencias.buscarObrasPrimarias(np);
        try {
            obrasPrimarias = new String[i];
            while (res.next()) {
                obrasPrimarias[j] = res.getString("nombreOpusPrimaria");
                //System.out.println("Datos de la obra "+ obrasPrimarias[j]);
                j++;
                if (res.isLast()) {
                    break;
                }
            }
        } catch (SQLException e) {
        }
        return obrasPrimarias;
    }

    public static void insertaEvaluacionEmocional(String nombreOpus, String emocion, double agrado, double activacion) {
        int idOpusPrimaria = buscarOpusPrimaria(nombreOpus);
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("INSERT INTO Evaluacion (idOpusPrimaria, laEmocion, agrado, activacion) values('" + idOpusPrimaria + "','" + emocion + "','" + agrado + "','" + activacion + "')");
            System.out.println("Insercion exitosa Evaluacion");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion Evaluacion");
        }

    }

    public static void insertarLorenz(String nameSG, int x, int y, int z, double sigma, double r, double b, String nameOP) {
        int idSG;
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("insert into SistemaGenerador (nombreGenerador, nombreOpusPrimaria) values ('" + nameSG + "','" + nameOP + "')");
            idSG = buscarSistemaGenerador(nameOP);
            s.execute("insert into Lorenz (x,y,z,sigma,r,b,idSistemaGenerador) values('" + x + "','" + y + "','" + z + "','" + sigma + "','" + r + "'," + b + ",'" + idSG + "')");
            System.out.println("Insercion correcta datos Lorenz");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion datos Lorenz " + ex);
        }
    }

    public static void insertarMandelbrot(String name, int elementos, String nameOP) {
        int idSG;
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("insert into SistemaGenerador (nombreGenerador, nombreOpusPrimaria) values ('" + name + "','" + nameOP + "')");
            idSG = buscarSistemaGenerador(nameOP);
            s.execute("insert into Mandelbrot (elementosMandelbrot,idSistemaGenerador) values('" + elementos + "','" + idSG + "')");
            System.out.println("Insercion correcta datos Mandelbort");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion datos Mandelbrot " + ex);
        }
    }

    public static void insertarClifford(String name, int x, int y, int z, double a, double b, double c, double d, double e, String nameOP) {
        int idSG;
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("insert into SistemaGenerador (nombreGenerador, nombreOpusPrimaria) values ('" + name + "','" + nameOP + "')");
            idSG = buscarSistemaGenerador(nameOP);
            s.execute("insert into Clifford (x,y,z,a,b,c,d,e,idSistemaGenerador) values('" + x + "','" + y + "','" + z + "','" + a + "','" + b + "','" + c + "','" + d + "','" + e + "','" + idSG + "')");
            System.out.println("Insercion correcta datos Clifford");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion datos Clifford " + ex);
        }
    }

    public static void insertar3P(String name, int x, int y, String nameOP) {
        int idSG;
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("insert into SistemaGenerador (nombreGenerador, nombreOpusPrimaria) values ('" + name + "','" + nameOP + "')");
            idSG = buscarSistemaGenerador(nameOP);
            s.execute("insert into ThreePly (x,y,idSistemaGenerador) values('" + x + "','" + y + "','" + idSG + "')");
            System.out.println("Insercion correcta datos 3P");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion datos 3P " + ex);
        }
    }

    public static void insertarLyapunov(String name, int xi, int yi, int xf, int yf, String cadena, String nameOP) {
        int idSG;
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("insert into SistemaGenerador (nombreGenerador, nombreOpusPrimaria) values ('" + name + "','" + nameOP + "')");
            idSG = buscarSistemaGenerador(nameOP);
            s.execute("insert into Lyapunov (xi,yi,xf,yf,cadenaControl,idSistemaGenerador) values('" + xi + "','" + yi + "','" + xf + "','" + yf + "','" + cadena + "','" + idSG + "')");
            System.out.println("Insercion correcta datos Lyapunov");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion datos Lyap " + ex);
        }
    }

    public static void insertarML(String name, int x, int y, double a, double b, double c, String nameOP) {
        int idSG;
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            s.execute("insert into SistemaGenerador (nombreGenerador, nombreOpusPrimaria) values ('" + name + "','" + nameOP + "')");
            idSG = buscarSistemaGenerador(nameOP);
            s.execute("insert into ML (x,y,a,b,c,idSistemaGenerador) values('" + x + "','" + y + "','" + a + "','" + b + "','" + c + "','" + idSG + "')");
            System.out.println("Insercion correcta datos Mamdani-Lopez");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion datos ML " + ex);
        }
    }

    public static void insertarParametroMusicales(String nOP, String i, String e, String a, int tx, int ty, int tz, double dx, double dy, double dz) {
        int idOP;
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            idOP = buscarOpusPrimaria(nOP);
            s.execute("insert into ParametrosMusicales (idOpusPrimaria, nombreOpusPrimaria, Instrumento, Escala, Acorde, tempoX, tempoY, tempoZ, duraX, duraY, duraZ) values ('" + idOP + "','" + nOP + "','" + i + "','" + e + "','" + a + "','" + tx + "','" + ty + "','" + tz + "','" + dx + "','" + dy + "','" + dz + "')");
            System.out.println("Insercion correcta Paramentros Musicales");
        } catch (SQLException ex) {
            System.out.println("Fallo insercion Parametros Musicales " + ex);
        }

    }

    public static List<String> obtenerInstrumentosPorClase(int clase) {
        List<String> instrumentos = new ArrayList();
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT nombre FROM instrumentos WHERE clase = " + clase);
            while (res.next()) {
                instrumentos.add(res.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.out.println("Falló obtención de instrumentos de clase " + clase);
        }
        return instrumentos;
    }

    public static List<String> obtenerAcordes() {
        List<String> acordes = new ArrayList();
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT nombre FROM acordes");
            while (res.next()) {
                acordes.add(res.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error en la obtención de acordes");
        }
        return acordes;
    }

    public static List<String> obtenerEscalas() {
        List<String> escalas = new ArrayList();
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT nombre FROM escalas");
            while (res.next()) {
                escalas.add(res.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error en la obtención de escalas");
        }
        return escalas;
    }
    
    public static List<String> obtenerEmociones() {
        List<String> emociones = new ArrayList();
        try {
            con = cn.estableceConexion();
            s = con.createStatement();
            res = s.executeQuery("SELECT nombre FROM emociones");
            while (res.next()) {
                emociones.add(res.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error en la obtención de emociones");
        }
        return emociones;
    }

    public static void terminarConexion() {
        cn.cierraConexion();
    }
}
