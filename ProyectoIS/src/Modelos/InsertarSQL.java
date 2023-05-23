package Modelos;

import static Principal.VarUser.frmUsr;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexiones.ConexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import tablas.Salidas;

public class InsertarSQL extends ConexionSQL {


    public int ProductoExistente(String Producto, String Proveedor) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "select count(inventario.Id_producto) from compras"
                + " inner join inventario on compras.Id_producto = inventario.Id_producto"
                + " where inventario.Producto = ? and compras.Proveedor = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, Producto);
            ps.setString(2, Proveedor);
            rs = ps.executeQuery();

            if (rs.next()) {
                return 1;
            } else {
                return rs.getInt(1);
            }

        } catch (SQLException ex) {
            return 1;
        }

    }
}
