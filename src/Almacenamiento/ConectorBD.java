/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacenamiento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author Omar Lopez Ortega
 * Profesor - Investigador
 * CITIS - UAEH
 */
public class ConectorBD
{
    String url = "jdbc:mysql://localhost/creatividad";
    String usr = "root";
    String psw = "root";
    Connection con;
    public  ConectorBD()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,usr,psw);
            if (con != null)
            {
                System.out.println("Conexión exitosa a base de datos...!");
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);
        }
    }
    public Connection estableceConexion()
    {
        return con;
    }
    public void cierraConexion()
    {
        try
        {
            con.close();
            System.out.println("Cierre exitoso de base de datos...!");
	}
        catch (Exception ex)
        {
	}
    }
}
