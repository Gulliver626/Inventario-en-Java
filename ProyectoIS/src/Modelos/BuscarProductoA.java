package Modelos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexiones.ConexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuscarProductoA extends ConexionSQL {

    public boolean INGRESARBUSQUEDA(columnasTab kk) {
        PreparedStatement pb = null;
        ResultSet ru = null;
        try {
            Connection con = getConexion();
            String sql9 = "SELECT * FROM inventario WHERE producto = ?";
            pb = (PreparedStatement) con.prepareStatement(sql9);
            pb.setString(1, kk.getProductoINGRESARB());
            ru = pb.executeQuery();
            //Comprobate de Nombres de Producto
            String com = kk.getProductoINGRESARB();

            if (ru.next()) {

                kk.setId_productoINGRESARB(ru.getInt("Id_producto"));
                kk.setProductoINGRESARB(ru.getString("Producto"));
                kk.setCategoriaINGRESARB(ru.getString("Categoria"));
                kk.setEntradaINGRESARB(ru.getInt("Entrada"));
                kk.setSalidaINGRESARB(ru.getInt("Salida"));
                kk.setEstado_productoINGRESARB(ru.getString("Entrada"));
                kk.setCantidadINGRESARB(ru.getInt("Cantidad"));
                kk.setPrecioINGRESARB(ru.getInt("Precio"));

            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProductoA.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(" Aqui ");
            return false;
        }

    }
}
