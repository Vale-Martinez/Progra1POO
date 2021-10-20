package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 * Clase de conexion entre la base de datos SQL con el programa
 * @author valem
 * @author nathb
 */
public class ConexionSQL {

    public static ResultSet res;
    public static Connection contacto = null;
    public static String user;
    public static String contra;
    public static boolean status = false;


    /**
     *Funcion que realiza la conexion con la base de datos 
     * @return el contacto con la base de datos
     */
    public static Connection getConexion() {
        status = false;
        String url = "jdbc:sqlserver://Valeria-Martinez:1433;databaseName=Progra1POO"; //cambiar nombre del hostname de la computadora para que funcione 

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion, revisar driver" + e.getMessage(), "Error conexion", JOptionPane.ERROR_MESSAGE);
        }
        try {
            //contacto = DriverManager.getConnection(url, Conexion.user, Conexion.contra);
            contacto = DriverManager.getConnection(url, "admin", "1234"); //REVISAR
            status = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error conexion", JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }

    /**
     *Funcion que realiza la consulta a la base de datos, recibe un string con la consula como si fuera en sql y devuelve 
     * todas las filas que cumplan con esa consulta, si algo sale mal retona null
     * @param consulta como si fuera sql
     * @return el resultado de la consulta
     */
    public static ResultSet consulta(String consulta) {
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error conexion ", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    

    /**
     *funcion que realiza la consulta a la base de datos, recibe un string con la consula como si fuera en sql y devuelve 
     * todas las filas que cumplan con esa consulta, si algo sale mal retona null
     * @param consulta como si fuera sql
     */
    public static void consultaRegistar(String consulta) {
        Connection con = getConexion();
        try {
            
            PreparedStatement prepsInsertProduct = con.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            prepsInsertProduct.execute();
            JOptionPane.showMessageDialog(null, "Los datos han sido agregados correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error conexion ", JOptionPane.ERROR_MESSAGE);
        }

    }
    

    /**
     *funcion que realiza la consulta a la base de datos, recibe un string con la consula como si fuera en sql y devuelve 
     * todas las filas que cumplan con esa consulta, si algo sale mal retona null
     * @param consulta com si fuera sql
     */
    public static void consultaEliminiar(String consulta) {
        Connection con = getConexion();
        try {
            
            PreparedStatement prepsInsertProduct = con.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            prepsInsertProduct.execute();
            JOptionPane.showMessageDialog(null, "Los datos han sido eliminados correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error conexion ", JOptionPane.ERROR_MESSAGE);
        }

    }
}
