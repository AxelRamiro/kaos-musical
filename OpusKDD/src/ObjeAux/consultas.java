package ObjeAux;

import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class consultas {

    DefaultTableModel modeloTabla;
    DefaultComboBoxModel modeloCombo;

    conectar con1 = new conectar();
    Connection conectar;
    ResultSet res;

    String url = "jdbc:mysql://localhost/creatividad";
    String usr = "root";
    String psw = "root";
    Connection con;
    String Tipo = new String();

    public ArrayList cboSG() {
        ArrayList listaNombre = new ArrayList();
        try {
            conectar = con1.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("Select Distinct nombreGenerador From SistemaGenerador");
            while (res.next()) {
                listaNombre.add(res.getObject("nombreGenerador"));
            }

        } catch (SQLException ex) {}

        return listaNombre;
    }

    public ArrayList cboEmocion() {
        ArrayList listaNombre = new ArrayList();
        try {
            conectar = con1.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("Select Distinct laEmocion From Evaluacion");
            while (res.next()) {
                listaNombre.add(res.getObject("laEmocion"));
            }

        } catch (SQLException ex) {

        }

        return listaNombre;

    }

    public ArrayList cboInstrumento() {
        ArrayList listaNombre = new ArrayList();
        try {
            conectar = con1.recibeConexion();
            Statement s = conectar.createStatement();
            res = s.executeQuery("Select Distinct Instrumento From ParametrosMusicales");
            while (res.next()) {
                listaNombre.add(res.getObject("Instrimento"));
            }

        } catch (SQLException ex) {

        }

        return listaNombre;

    }

}
