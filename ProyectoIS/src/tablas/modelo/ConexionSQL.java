package tablas.modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {

    static ConexionSQL conexion() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Connection con = null;

    public Connection getConexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario", "root", "");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.getMessage());
        }
        return con;
    }

    public static void main(String args[]) {

    }
}
