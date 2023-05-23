package conexiones;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Conexion {

    public Conexion() {
    }
    /// Atributos    
    private static String usuario = "root";
    private static String password = "root";
    private String host = "localhost";
    private static String basedatos = "biblioteca";
    public java.sql.Connection conectar = null;
    public static ResultSet rs;
    public static Statement st;
    public PreparedStatement pps;
    private String url = "com.mysql.jdbc.Driver";

    public Connection Conectarse() {
        String msg = "";
        try {
            Class.forName("url");
            conectar = DriverManager.getConnection("jdbc:mysql://" + host + "/" + basedatos, usuario, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (Connection) conectar;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getBD() {
        return basedatos;
    }
}
