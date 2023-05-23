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

public class EntradasSQL extends ConexionSQL {

    public boolean Insertar(columnasTab in) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        try {

            int cantidad = in.getCantidadINGRESAR();
            int precio = in.getPrecioINGRESAR();
            String sql = "UPDATE inventario INNER JOIN compras ON inventario.Id_producto = compras.Id_producto"
                    + " SET inventario.Entrada = inventario.Entrada + " + cantidad + ","
                    + " inventario.Cantidad = inventario.Cantidad + " + cantidad + ","
                    + " inventario.Precio = " + precio + ""
                    + " WHERE inventario.Producto = ? AND compras.Proveedor = ?;";
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, in.getProductoINGRESAR());
            ps.setString(2, in.getProveedorCOMPRA());
            ps.execute();

            //Consulta el id del producto 
            String sql2 = "SELECT inventario.Id_producto FROM inventario "
                    + " INNER JOIN compras ON inventario.Id_producto = compras.Id_producto "
                    + " WHERE inventario.Producto = ? AND compras.Proveedor = ? ";
            ps = (PreparedStatement) con.prepareStatement(sql2);
            ps.setString(1, in.getProductoINGRESAR());
            ps.setString(2, in.getProveedorCOMPRA());
            rs = ps.executeQuery();

            //String pro = in.getProductoINGRESAR();
            if (rs.next()) {
                //Guarda el id en variable 
                int idp = rs.getInt("Id_producto");
                System.out.println("Id producto y entrada " + idp + "," + cantidad);

                //Fecha de entrada del producto
                java.util.Date fecha = in.getFecha_entradaENTRADA();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String X = df.format(fecha);

                //Genera id entrada
                int idEntrada = in.getId_entradaENTRADA();
                //Ingresa datos en La tabla Entradas
                String sql3 = "insert into entradas (Id_entrada,Id_producto,Fecha_entrada,usuario_responsable,Cantidad) "
                        + "VALUES(?,?,?,?,?)";
                ps = (PreparedStatement) con.prepareStatement(sql3);
                ps.setInt(1, idEntrada);
                ps.setInt(2, idp);
                ps.setString(3, X);
                ps.setString(4, frmUsr);
                ps.setInt(5, cantidad);
                ps.execute();

                //Consulta id_entrada y precio ingresados
                String sql4 = "SELECT entradas.Id_entrada FROM inventario "
                        + "INNER JOIN entradas ON inventario.Id_producto = entradas.Id_producto "
                        + "WHERE entradas.Id_producto = " + idp + "";
                ps = (PreparedStatement) con.prepareStatement(sql4);
                rs = ps.executeQuery();
                if (rs.next()) {
                    //Guarda los datos en variables
                    int ide = rs.getInt("Id_entrada");
                    System.out.println("Id entrada =" + ide + ",fecha = " + X + ",precio =" + precio + ".");

                    //Genera id compra
                    int idcompra = in.getId_compraCOMPRA();
                    //Ingresar datos en tabla compras
                    String sql5 = "insert into compras (Id_compra,Id_entrada,Id_producto,Proveedor,Responsable,Cantidad,Precio_compra,Fecha_compra) "
                            + "VALUES(?,?,?,?,?,?,?,?)";
                    ps = (PreparedStatement) con.prepareStatement(sql5);
                    ps.setInt(1, idcompra);
                    ps.setInt(2, ide);
                    ps.setInt(3, idp);
                    ps.setString(4, in.getProveedorCOMPRA());
                    ps.setString(5, frmUsr);
                    ps.setInt(6, cantidad);
                    ps.setInt(7, precio);
                    ps.setString(8, X);
                    ps.execute();
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Salidas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;

    }

    
    public boolean Entradas(columnasTab in) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        try {

            //Genera Id_producto
            int producto = in.getId_productoINGRESAR();
            //Genera dato cantidad
            int cantidad = in.getCantidadINGRESAR();
            //Ingresa datos en La tabla Productos
            String sql = "insert into inventario (Id_producto,Producto,Entrada,Salida,Estado_producto,Precio,Cantidad,Categoria) "
                    + " VALUES(?,?,?,?,?,?,?,?)";
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, producto);
            ps.setString(2, in.getProductoINGRESAR());
            ps.setInt(3, cantidad);
            ps.setInt(4, in.getSalidaINGRESAR());
            ps.setString(5, in.getEstado_productoINGRESAR());
            ps.setInt(6, in.getPrecioINGRESAR());
            ps.setInt(7, cantidad);
            ps.setString(8, in.getCategoriaINGRESAR());
            ps.execute();

            // inventario.compras inner
            //Consulta el id del producto 
            String sql2 = "SELECT Id_producto FROM inventario"
                    + "  WHERE Producto = ? ";
            ps = (PreparedStatement) con.prepareStatement(sql2);
            ps.setString(1, in.getProductoINGRESAR());

            rs = ps.executeQuery();

            //String pro = in.getProductoINGRESAR();
            if (rs.next()) {
                //Guarda el id en variable 
                int idp = rs.getInt("Id_producto");
                System.out.println("Id producto y entrada " + idp + "," + cantidad);

                //Fecha de entrada del producto
                java.util.Date fecha = in.getFecha_entradaENTRADA();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String X = df.format(fecha);

                //Genera id entrada
                int idEntrada = in.getId_entradaENTRADA();
                //Ingresa datos en La tabla Entradas
                String sql3 = "insert into entradas (Id_entrada,Id_producto,Fecha_entrada,usuario_responsable,Cantidad) "
                        + "VALUES(?,?,?,?,?)";
                ps = (PreparedStatement) con.prepareStatement(sql3);
                ps.setInt(1, idEntrada);
                ps.setInt(2, idp);
                ps.setString(3, X);
                ps.setString(4, frmUsr);
                ps.setInt(5, cantidad);
                ps.execute();

                //Consulta id_entrada y precio ingresados
                String sql4 = "SELECT entradas.Id_entrada,inventario.Precio FROM inventario "
                        + "INNER JOIN entradas ON inventario.Id_producto = entradas.Id_producto "
                        + "WHERE entradas.Id_producto = " + idp + "";
                ps = (PreparedStatement) con.prepareStatement(sql4);
                rs = ps.executeQuery();
                if (rs.next()) {
                    //Guarda los datos en variables
                    int ide = rs.getInt("Id_entrada");
                    int pre = rs.getInt("Precio");
                    System.out.println("Id entrada =" + ide + ",fecha = " + X + ",precio =" + pre + ".");

                    //Genera id compra
                    int idcompra = in.getId_compraCOMPRA();
                    //Ingresar datos en tabla compras
                    String sql5 = "insert into compras (Id_compra,Id_entrada,Id_producto,Proveedor,Responsable,Cantidad,Precio_compra,Fecha_compra) "
                            + "VALUES(?,?,?,?,?,?,?,?)";
                    ps = (PreparedStatement) con.prepareStatement(sql5);
                    ps.setInt(1, idcompra);
                    ps.setInt(2, ide);
                    ps.setInt(3, idp);
                    ps.setString(4, in.getProveedorCOMPRA());
                    ps.setString(5, frmUsr);
                    ps.setInt(6, cantidad);
                    ps.setInt(7, pre);
                    ps.setString(8, X);
                    ps.execute();
                }

            }

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(EntradasSQL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("" + ex);
            return false;

        }

    }

    //verifica si existe producto
    public int ProductoExistente(String Producto, String Proveedor) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT COUNT(inventario.Id_producto) FROM compras "
                + "INNER JOIN inventario on compras.Id_producto = inventario.Id_producto "
                + "WHERE inventario.Producto = ? and compras.Proveedor = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, Producto);
            ps.setString(2, Proveedor);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            return 1;
        }

    }
}
