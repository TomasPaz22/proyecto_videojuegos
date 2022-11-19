
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion{
    private Connection conexion;
    public static Conexion instance; 
    
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String SERVER = "localhost:3306";
    private final String BBDD = "tiendajuegos";
    
    
    
    
    
    public Conexion(){
        try{
            String url= "jdbc:mysql://" + SERVER + "/" + BBDD;
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("Conexion Lista");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Problemas para conectarse a la base de datos.", 
            "Mensajes", JOptionPane.ERROR_MESSAGE);
        }
       
    }
    
    public synchronized static Conexion obtenerEstadoConexion(){
        if(instance == null)
        {
            instance = new Conexion();
        }
        return instance;
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void cerrarConexion(){
        instance = null;
    }
}

