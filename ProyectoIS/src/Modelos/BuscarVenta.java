package Modelos;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexiones.ConexionSQL;
import java.sql.ResultSet;

import java.sql.SQLException;

public class BuscarVenta extends ConexionSQL {

    public boolean BUSCARVENTA(columnasTab iv) {
        PreparedStatement pv = null;
        ResultSet pr = null;

        try {
            Connection con = getConexion();
            String sql12 = "SELECT * FROM ventas WHERE Id_producto = ?";
            pv = (PreparedStatement) con.prepareStatement(sql12);
            pv.setInt(1, iv.getId_productoUNIVERSAL());//-----------Nesecita la Id del producto
            pr = pv.executeQuery();
            if (pr.next()) {
                iv.setCantidadVENTAB(pr.getInt("Cantidad"));
                iv.setId_ventaVENTAB(pr.getInt("Id_venta"));
                iv.setFecha_ventaVENTAB(pr.getDate("Fecha_venta"));
                iv.setPrecio_ventaVENTAB(pr.getInt("Precio_venta"));
                iv.setId_salidaVENTAB(pr.getInt("Id_salida"));
                iv.setResponsableVENTAB(pr.getString("Responsable"));
                iv.setCompradorVENTAB(pr.getString("Comprador"));

            }
            return true;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BuscarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;

        }

    }
}
