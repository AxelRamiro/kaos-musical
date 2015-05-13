package ObjeAux;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {

    static public String url = "jdbc:mysql://localhost/creatividad";
    static public String usr = "root";
    static public String psw = "root";
    Connection con;

    public conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usr, psw);
            if (con != null) {
                System.out.println("Conexion a Base de Datos Existosa");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public Connection recibeConexion() {
        return con;
    }

    public void cierraConexion() {
        try {
            con.close();
        } catch (Exception ex) {}
    }
}
