package Modelos;

import conexiones.ConexionSQL;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerry
 */
public class SqlUsuarios extends ConexionSQL {

    public boolean registrar(columnasTab usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "insert into usuarios (Usuario, Contraseña, Id_tipo) values(?,?,?)";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getUsuarioUSUARIOS());
            ps.setString(2, usr.getContraseñaUSUARIOS());
            ps.setInt(3, usr.getId_tipoUSUARIOS());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public int existeUsuario(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "select count(Id_usuario) from usuarios where Usuario = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }

    }

    public boolean login(columnasTab usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Connection con = getConexion();

        String sql = "select Id_usuario, Usuario, Contraseña,Id_tipo from usuarios where Usuario = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getUsuarioUSUARIOS());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (usr.getContraseñaUSUARIOS().equals(rs.getString(3))) {

                    String sqlUpdate = "Update usuarios set Fecha_ingreso = ? where Id_usuario = ?";

                    ps = (PreparedStatement) con.prepareStatement(sqlUpdate);
                    ps.setString(1, usr.getFecha_ingresoUSUARIOS());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    usr.setId_usuarioUSUARIOS(rs.getInt(1));
                    usr.setUsuarioUSUARIOS(rs.getString(2));
                    usr.setId_tipoUSUARIOS(rs.getInt(4));
                    return true;
                } else {
                    return false;
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean ObtenerU(columnasTab usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Connection con = getConexion();

        String sql = "select Usuario from usuarios where Usuario = ?";

        try {

            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getUsuarioUNIVERSAL());
            rs = ps.executeQuery();

            if (rs.next()) {
                usr.setUsuarioUNIVERSAL(rs.getString("Usuario"));
            }

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
