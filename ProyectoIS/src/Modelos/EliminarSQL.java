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


public class EliminarSQL extends ConexionSQL {

    public boolean Salidas(columnasTab in) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        try {

            int cantidad = in.getCantidadSALIDA();
            String sql = "UPDATE inventario INNER JOIN compras ON inventario.Id_producto = compras.Id_producto SET inventario.Salida = inventario.Salida + " + cantidad + ", inventario.Cantidad = inventario.Cantidad - " + cantidad + " "
                    + " WHERE inventario.Producto = ? AND compras.Proveedor = ?;";
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, in.getProductoSALIDA());
            ps.setString(2, in.getProveedorCOMPRA());
            ps.execute();
            // inventario.compras inner
            String sql2 = "SELECT inventario.Id_producto, inventario.Salida ,entradas.Fecha_entrada FROM compras "
                    + " INNER JOIN inventario ON compras.Id_producto = inventario.Id_producto "
                    + " INNER JOIN entradas ON inventario.Id_producto = entradas.Id_producto "
                    + " WHERE inventario.Producto = ? AND compras.Proveedor = ?;";
            ps = (PreparedStatement) con.prepareStatement(sql2);
            ps.setString(1, in.getProductoSALIDA());
            ps.setString(2, in.getProveedorCOMPRA());

            rs = ps.executeQuery();

            if (rs.next()) {
                int idp = rs.getInt("Id_producto");
                int sal = rs.getInt("Salida");

                String fech = rs.getString("Fecha_entrada");
                java.util.Date fech2 = rs.getDate("Fecha_entrada");
                DateFormat dft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String Y = dft.format(fech2);

                System.out.println("Id producto y salida " + idp + "," + sal + "fehc :" + fech2);

                int idSalida = in.getId_salidaSALIDA();
                //Fecha salida
                java.util.Date fecha = in.getFecha_salidaSALIDA();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String X = df.format(fecha);

                String sql3 = "INSERT INTO salidas(Id_salida,Id_producto,Fecha_entrada,Fecha_salida,Motivo,usuario_responsable,Cantidad,Producto)"
                        + " VALUES(?,?,?,?,?,?,?,?)";
                ps = (PreparedStatement) con.prepareStatement(sql3);
                ps.setInt(1, idSalida);
                ps.setInt(2, idp);
                ps.setString(3, fech);
                ps.setString(4, X);
                ps.setString(5, in.getMotivoSALIDA());
                ps.setString(6, frmUsr);
                ps.setInt(7, sal);
                ps.setString(8, in.getProductoSALIDA());
                ps.execute();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EliminarSQL.class.getName()).log(Level.SEVERE, null, ex);
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
