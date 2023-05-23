package conexiones;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionSQL {
    Connection con = null;
    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            /* Se lanza una excepción si existe un error. */
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.getMessage());
            try {
                /* directorio/ejecutable es el path del ejecutable y un nombre */
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "C:\\xampp\\xampp-control.exe");
                Process process = pb.start();
            } catch (IOException ex) {
                /* Se lanza una excepción si no se encuentra en ejecutable o el fichero no es ejecutable. */
                JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            }
        }
        return con;
    }
    public static void main(String args[]) {}
}
