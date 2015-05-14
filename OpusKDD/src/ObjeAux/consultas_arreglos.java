package ObjeAux;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class consultas_arreglos {

    conectar con = new conectar();
    Connection conectar;
    ResultSet res;

    public ArrayList<String> getInstCount(String emocion) {
        ArrayList<String> filaEvaluacion = new ArrayList<String>();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT ParametrosMusicales.Instrumento, COUNT(ParametrosMusicales.Instrumento) AS Total FROM ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion ='" + emocion + "' GROUP BY ParametrosMusicales.Instrumento ORDER BY COUNT(ParametrosMusicales.Instrumento) desc;");
            while (res.next()) {
                filaEvaluacion.add(res.getString("Instrumento"));
                filaEvaluacion.add(res.getString("Total"));
            }
        } catch (SQLException ex) {
        }
        return filaEvaluacion;
    }

    public int getClassCount(String emocion) {
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT clase, COUNT(instrumento) as total "
                    + "FROM parametrosmusicales, evaluacion, instrumentos "
                    + "WHERE parametrosmusicales.idopusprimaria = evaluacion.idopusprimaria "
                    + "AND parametrosmusicales.instrumento = instrumentos.nombre "
                    + "AND evaluacion.laEmocion = ' + " + emocion + "' "
                    + "GROUP BY clase "
                    + "ORDER BY total desc");
            if (res.next()) {
                return (res.getInt("clase"));
            }
        } catch (SQLException ex) {
            System.out.println("Error en la obtención de mejor clase");
        }
        return 0;
    }

    public ArrayList<String> getScaleCount(String emocion) {
        ArrayList<String> filaEvaluacion = new ArrayList<String>();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT ParametrosMusicales.Escala, COUNT(ParametrosMusicales.Escala) AS TOTAL "
                    + "FROM ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion "
                    + "WHERE ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria "
                    + "AND Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador "
                    + "AND ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria "
                    + "AND Evaluacion.laEmocion ='" + emocion + "' "
                    + "GROUP BY ParametrosMusicales.Escala "
                    + "ORDER BY COUNT(ParametrosMusicales.Escala) DESC");
            while (res.next()) {
                filaEvaluacion.add(res.getString("Escala"));
                filaEvaluacion.add(res.getString("Total"));
            }
        } catch (SQLException ex) {
        }
        return filaEvaluacion;
    }

    public ArrayList<String> getChordCount(String emocion) {
        ArrayList<String> filaEvaluacion = new ArrayList<String>();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT ParametrosMusicales.Acorde, COUNT(ParametrosMusicales.Acorde) AS TOTAL "
                    + "FROM ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion "
                    + "WHERE ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria "
                    + "AND Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador "
                    + "AND ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria "
                    + "AND Evaluacion.laEmocion ='" + emocion + "' "
                    + "GROUP BY ParametrosMusicales.Acorde "
                    + "ORDER BY COUNT(ParametrosMusicales.Acorde) DESC");
            while (res.next()) {
                filaEvaluacion.add(res.getString("Acorde"));
                filaEvaluacion.add(res.getString("Total"));
            }
        } catch (SQLException ex) {
        }
        return filaEvaluacion;
    }

    public String getBestInst(String emocion) {
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT instrumento, COUNT(instrumento) as total "
                    + "FROM parametrosmusicales, evaluacion, instrumentos "
                    + "WHERE parametrosmusicales.idopusprimaria = evaluacion.idopusprimaria "
                    + "AND parametrosmusicales.instrumento = instrumentos.nombre "
                    + "AND clase = " + getClassCount(emocion) +" "
                    + "AND evaluacion.laEmocion = '" + emocion +"' "
                    + "GROUP BY instrumento "
                    + "ORDER BY total desc "
                    + "LIMIT 1");
            if (res.next()) {
                return (res.getString("instrumento"));
            }
        } catch (SQLException ex) {
            System.out.println("Error en la obtención de mejor clase");
        }
        return getInstCount(emocion).get(0);
    }

    public String getBestScale(String emocion) {
        return getScaleCount(emocion).get(0);
    }

    public String getBestChord(String emocion) {
        return getChordCount(emocion).get(0);
    }

    public ArrayList<String> cboInstrumento() {
        ArrayList<String> filaEvaluacion = new ArrayList<String>();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("Select Distinct Instrumento From ParametrosMusicales");
            int columnas = res.getMetaData().getColumnCount();
            while (res.next()) {
                for (int i = 1; i <= columnas; i++) {
                    filaEvaluacion.add(res.getObject(i).toString());

                }
            }
        } catch (SQLException ex) {

        }
        return filaEvaluacion;

    }

    public int cboInstrumento1() {
        int count = 0;
        try {

            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT COUNT(Distinct Instrumento) FROM ParametrosMusicales");

            while (res.next()) {
                count = res.getInt(1);
            };
        } catch (SQLException ex) {

        }

        return count;

    }

    public ArrayList<String> cboEscala() {
        ArrayList<String> filaEvaluacion = new ArrayList<String>();
        try {

            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("Select Distinct Escala From ParametrosMusicales");

            int columnas = res.getMetaData().getColumnCount();

            while (res.next()) {
                for (int i = 1; i <= columnas; i++) {
                    filaEvaluacion.add(res.getObject(i).toString());

                }
            }
        } catch (SQLException ex) {

        }
        return filaEvaluacion;

    }

    public int cboEscala1() {
        int count = 0;
        try {

            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT COUNT(Distinct Escala) FROM ParametrosMusicales");

            while (res.next()) {
                count = res.getInt(1);
            };

        } catch (SQLException ex) {

        }
        return count;
    }

    public ArrayList<String> cboAcorde() {
        ArrayList<String> filaEvaluacion = new ArrayList<String>();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("Select Distinct Acorde From ParametrosMusicales");

            int columnas = res.getMetaData().getColumnCount();

            while (res.next()) {
                for (int i = 1; i <= columnas; i++) {
                    filaEvaluacion.add(res.getObject(i).toString());

                }
            }
        } catch (SQLException ex) {

        }
        return filaEvaluacion;

    }

    public int cboAcorde1() {
        int count = 0;
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("SELECT COUNT(Distinct Acorde) FROM ParametrosMusicales");
            while (res.next()) {
                count = res.getInt(1);
            };
        } catch (SQLException ex) {

        }
        return count;
    }

    public ArrayList cEvaluacion() {

        ArrayList columnaEvaluacion = new ArrayList();

        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("Select * From Evaluacion");

            int columnas = res.getMetaData().getColumnCount();

            while (res.next()) {

                ArrayList filaEvaluacion = new ArrayList();
                for (int i = 1; i <= columnas; i++) {
                    filaEvaluacion.add(res.getObject(i));

                }

                columnaEvaluacion.add(filaEvaluacion);

            }
        } catch (SQLException ex) {

        }
        return columnaEvaluacion;
    }

    public int cInstrumento(String emocion, String instrumento) {
        int cont = 0;
        ArrayList columnaEvaluacion = new ArrayList();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("select ParametrosMusicales.Instrumento from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "' and ParametrosMusicales.Instrumento = '" + instrumento + "'");

            int columnas = res.getMetaData().getColumnCount();

            while (res.next()) {

                ArrayList filaEvaluacion = new ArrayList();
                for (int i = 1; i <= columnas; i++) {
                    cont = cont + 1;
                    filaEvaluacion.add(res.getObject(i));
                }
                columnaEvaluacion.add(filaEvaluacion);
            }
        } catch (SQLException ex) {

        }
        return cont;
    }

    public int cAcorde(String emocion, String acorde) {
        int cont = 0;
        ArrayList columnaEvaluacion = new ArrayList();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("select ParametrosMusicales.Acorde from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "' and ParametrosMusicales.Acorde = '" + acorde + "'");

            int columnas = res.getMetaData().getColumnCount();

            while (res.next()) {

                ArrayList filaEvaluacion = new ArrayList();
                for (int i = 1; i <= columnas; i++) {
                    cont = cont + 1;
                    filaEvaluacion.add(res.getObject(i));
                }
                columnaEvaluacion.add(filaEvaluacion);
            }
        } catch (SQLException ex) {

        }
        return cont;
    }

    public int cEscala(String emocion, String escala) {
        int cont = 0;
        ArrayList columnaEvaluacion = new ArrayList();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("select ParametrosMusicales.Escala from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "' and ParametrosMusicales.Escala = '" + escala + "'");

            int columnas = res.getMetaData().getColumnCount();

            while (res.next()) {

                ArrayList filaEvaluacion = new ArrayList();
                for (int i = 1; i <= columnas; i++) {
                    cont = cont + 1;
                    filaEvaluacion.add(res.getObject(i));
                }
                columnaEvaluacion.add(filaEvaluacion);
            }
        } catch (SQLException ex) {

        }
        return cont;
    }

    public int cInstrumento1(String emocion, String instrumento) {
        int count = 0;
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("select count (ParametrosMusicales.Instrumento) from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "' and ParametrosMusicales.Instrumento = '" + instrumento + "'");
            while (res.next()) {
                count = res.getInt(1);
            };
        } catch (SQLException ex) {

        }
        return count;
    }

    public ArrayList cAcorde(String emocion) {
        ArrayList columnaEvaluacion = new ArrayList();
        try {
            conectar = con.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("select ParametrosMusicales.Acorde from ParametrosMusicales, Lorenz, SistemaGenerador, Evaluacion where ParametrosMusicales.nombreOpusPrimaria = SistemaGenerador.nombreOpusPrimaria and Lorenz.idSistemaGenerador = SistemaGenerador.idSistemaGenerador and ParametrosMusicales.idOpusPrimaria = Evaluacion.idOpusPrimaria and Evaluacion.laEmocion = '" + emocion + "'");

            int columnas = res.getMetaData().getColumnCount();

            while (res.next()) {
                ArrayList filaEvaluacion = new ArrayList();
                for (int i = 1; i <= columnas; i++) {
                    filaEvaluacion.add(res.getObject(i));
                }
                columnaEvaluacion.add(filaEvaluacion);
            }
        } catch (SQLException ex) {

        }
        return columnaEvaluacion;
    }

}
