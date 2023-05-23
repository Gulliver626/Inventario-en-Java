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

public class EliminarProductoSQL extends ConexionSQL {

    public boolean Salidas(columnasTab in) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        try {

            // inventario.compras inner
            String sql2 = "SELECT inventario.Id_producto, inventario.Producto, inventario.Cantidad ,entradas.Fecha_entrada "
                    + " FROM compras "
                    + " INNER JOIN inventario ON compras.Id_producto = inventario.Id_producto "
                    + " INNER JOIN entradas ON inventario.Id_producto = entradas.Id_producto "
                    + " WHERE inventario.Producto = ? AND compras.Proveedor = ?;";
            ps = (PreparedStatement) con.prepareStatement(sql2);
            ps.setString(1, in.getProductoSALIDA());
            ps.setString(2, in.getProveedorCOMPRA());
            rs = ps.executeQuery();

            if (rs.next()) {
                int idp = rs.getInt("Id_producto");
                String prod = rs.getString("Producto");
                int sal = rs.getInt("Cantidad");
                String fech = rs.getString("Fecha_entrada");

                System.out.println("Id producto " + idp + " salida, " + sal + " fecha: " + fech + " prudc " + prod);

                int idSalida = in.getId_salidaSALIDA();
                String motivo = "eliminacion";
                //Fecha salida
                java.util.Date fecha = in.getFecha_salidaSALIDA();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String X = df.format(fecha);

                String sql3 = "INSERT INTO salidas(Id_salida,Id_producto, Producto, Fecha_entrada,Fecha_salida,Motivo,usuario_responsable,Cantidad)"
                        + " VALUES(?,?,?,?,?,?,?,?)";
                ps = (PreparedStatement) con.prepareStatement(sql3);
                ps.setInt(1, idSalida);
                ps.setInt(2, idp);
                ps.setString(3, prod);
                ps.setString(4, fech);
                ps.setString(5, X);
                ps.setString(6, motivo);
                ps.setString(7, frmUsr);
                ps.setInt(8, sal);
                ps.execute();

                String delete = "DELETE inventario FROM inventario INNER JOIN compras ON inventario.Id_producto = compras.Id_producto "
                        + " WHERE inventario.Producto = ? and compras.Proveedor = ?";
                ps = (PreparedStatement) con.prepareStatement(delete);
                ps.setString(1, in.getProductoSALIDA());
                ps.setString(2, in.getProveedorCOMPRA());
                ps.execute();
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(Salidas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;

    }

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
