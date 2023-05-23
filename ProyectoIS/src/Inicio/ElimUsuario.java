package Inicio;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import static java.util.Objects.hash;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import tablas.modelo.ConexionSQL;
import tablas.modelo.HeaderColor;

/**
 * @author master
 */
public class ElimUsuario extends javax.swing.JFrame {

    ConexionSQL conn = new ConexionSQL();
    Connection con = conn.getConexion();

    public ElimUsuario() {
        initComponents();
        //cambiar formato de la tabla
        jtUsuarios.getTableHeader().setDefaultRenderer(new HeaderColor());
        setLocationRelativeTo(null);

        CargarTabla();
    }

    // icono de la interfaz 
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        lbProduct2 = new javax.swing.JLabel();
        TXTID = new javax.swing.JTextField();
        salir = new javax.swing.JLabel();
        TXTERROR = new javax.swing.JLabel();
        BTNBUSCAR = new javax.swing.JButton();
        BTNINICIAR = new javax.swing.JButton();
        BTNEDITAR = new javax.swing.JButton();
        minimizar = new javax.swing.JLabel();
        spProducto1 = new javax.swing.JSeparator();
        TXTCONTRASEÑA = new javax.swing.JTextField();
        lbProduct = new javax.swing.JLabel();
        lbProduct1 = new javax.swing.JLabel();
        spProducto = new javax.swing.JSeparator();
        TXTUSUARIO = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 440));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        jtUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id_usuario               ", "Usuario                  ", "Fecha_Ingreso      "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtUsuarios.setFocusable(false);
        jtUsuarios.setGridColor(new java.awt.Color(102, 102, 102));
        jtUsuarios.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtUsuarios.setRowHeight(20);
        jtUsuarios.setSelectionBackground(new java.awt.Color(39, 59, 89));
        jtUsuarios.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jtUsuarios.setShowGrid(true);
        jtUsuarios.getTableHeader().setReorderingAllowed(false);
        jtUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 190, 360, 167);

        lbProduct2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbProduct2.setForeground(new java.awt.Color(102, 102, 102));
        lbProduct2.setText("Id");
        getContentPane().add(lbProduct2);
        lbProduct2.setBounds(47, 30, 30, 25);

        TXTID.setEditable(false);
        TXTID.setBackground(new java.awt.Color(204, 204, 204));
        TXTID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TXTID.setForeground(new java.awt.Color(102, 102, 102));
        TXTID.setBorder(null);
        TXTID.setCaretColor(new java.awt.Color(0, 51, 153));
        getContentPane().add(TXTID);
        TXTID.setBounds(70, 30, 50, 25);

        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_2.png"))); // NOI18N
        salir.setToolTipText("");
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(400, 20, 20, 20);

        TXTERROR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TXTERROR.setForeground(new java.awt.Color(153, 0, 0));
        TXTERROR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(TXTERROR);
        TXTERROR.setBounds(40, 147, 360, 30);

        BTNBUSCAR.setBackground(new java.awt.Color(15, 33, 55));
        BTNBUSCAR.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        BTNBUSCAR.setForeground(new java.awt.Color(204, 204, 204));
        BTNBUSCAR.setText("Buscar");
        BTNBUSCAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNBUSCAR.setFocusPainted(false);
        BTNBUSCAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNBUSCAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTNBUSCAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNBUSCAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNBUSCARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNBUSCARMouseExited(evt);
            }
        });
        BTNBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNBUSCAR);
        BTNBUSCAR.setBounds(170, 20, 140, 35);

        BTNINICIAR.setBackground(new java.awt.Color(15, 33, 55));
        BTNINICIAR.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        BTNINICIAR.setForeground(new java.awt.Color(204, 204, 204));
        BTNINICIAR.setText("Editar");
        BTNINICIAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNINICIAR.setFocusPainted(false);
        BTNINICIAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNINICIAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTNINICIAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNINICIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNINICIARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNINICIARMouseExited(evt);
            }
        });
        BTNINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNINICIARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNINICIAR);
        BTNINICIAR.setBounds(50, 380, 120, 35);

        BTNEDITAR.setBackground(new java.awt.Color(15, 33, 55));
        BTNEDITAR.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        BTNEDITAR.setForeground(new java.awt.Color(204, 204, 204));
        BTNEDITAR.setText("Eliminar Usuario");
        BTNEDITAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNEDITAR.setFocusPainted(false);
        BTNEDITAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNEDITAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BTNEDITAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTNEDITAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNEDITARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNEDITARMouseExited(evt);
            }
        });
        BTNEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEDITARActionPerformed(evt);
            }
        });
        getContentPane().add(BTNEDITAR);
        BTNEDITAR.setBounds(190, 380, 200, 35);

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar_2.png"))); // NOI18N
        minimizar.setToolTipText("");
        minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar);
        minimizar.setBounds(360, 25, 20, 10);
        getContentPane().add(spProducto1);
        spProducto1.setBounds(230, 130, 167, 10);

        TXTCONTRASEÑA.setBackground(new java.awt.Color(255, 255, 255));
        TXTCONTRASEÑA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TXTCONTRASEÑA.setForeground(new java.awt.Color(204, 204, 204));
        TXTCONTRASEÑA.setText("Contraseña");
        TXTCONTRASEÑA.setBorder(null);
        TXTCONTRASEÑA.setCaretColor(new java.awt.Color(0, 51, 153));
        TXTCONTRASEÑA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TXTCONTRASEÑAMousePressed(evt);
            }
        });
        TXTCONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCONTRASEÑAActionPerformed(evt);
            }
        });
        getContentPane().add(TXTCONTRASEÑA);
        TXTCONTRASEÑA.setBounds(230, 100, 167, 26);

        lbProduct.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbProduct.setForeground(new java.awt.Color(102, 102, 102));
        lbProduct.setText("Contraseña");
        getContentPane().add(lbProduct);
        lbProduct.setBounds(230, 70, 167, 25);

        lbProduct1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbProduct1.setForeground(new java.awt.Color(102, 102, 102));
        lbProduct1.setText("Usuario");
        getContentPane().add(lbProduct1);
        lbProduct1.setBounds(47, 70, 167, 25);
        getContentPane().add(spProducto);
        spProducto.setBounds(47, 130, 167, 10);

        TXTUSUARIO.setBackground(new java.awt.Color(204, 204, 204));
        TXTUSUARIO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TXTUSUARIO.setForeground(new java.awt.Color(102, 102, 102));
        TXTUSUARIO.setText("Nombre de usuario");
        TXTUSUARIO.setBorder(null);
        TXTUSUARIO.setCaretColor(new java.awt.Color(0, 51, 153));
        TXTUSUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TXTUSUARIOMousePressed(evt);
            }
        });
        TXTUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(TXTUSUARIO);
        TXTUSUARIO.setBounds(47, 100, 167, 26);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setOpaque(true);
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 440, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtUsuarios.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            //consulta los datos
            String sql = "SELECT Id_usuario,Usuario,Fecha_ingreso "
                    + "FROM usuarios WHERE Id_tipo = 2";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            //estructura
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Id_usuario");
            modelo.addColumn("Usuario");
            modelo.addColumn("Fecha_ingreso");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            TXTERROR.setText("Error: " + ex);
        }
    }

    private void limpiarCajas() {
        TXTID.setText(null);
        TXTUSUARIO.setText(null);
        TXTCONTRASEÑA.setText(null);
    }

    private void Eliminar() throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (TXTID.getText().equals("")) {

            TXTERROR.setText("Error Falta Id");

        } else {
            //hace consulta de eliminacion
            ps = con.prepareStatement("DELETE FROM usuarios WHERE Id_usuario=?");
            //usuario eliminado
            ps.setInt(1, Integer.parseInt(TXTID.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                TXTERROR.setText("Usuario Eliminado");
                limpiarCajas();
            } else {
                TXTERROR.setText("Error al Eliminar Usuario");
            }
        }
    }

    private void Buscar() throws SQLException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        if (TXTUSUARIO.getText().equals("") || TXTCONTRASEÑA.getText().equals("")) {

            TXTERROR.setText("Llenar todos los campos");
            TXTID.setText("");

        } else {
            //consulata busqueda
            ps = con.prepareStatement("SELECT Id_usuario "
                    + "FROM usuarios WHERE Usuario =? and Contraseña = ? ");
            String pass = TXTCONTRASEÑA.getText();
            String contraseña = hash.sha1(pass);
            //parametros
            ps.setString(1, TXTUSUARIO.getText());
            ps.setString(2, contraseña);
            rs = ps.executeQuery();

            if (rs.next()) {

                TXTID.setText(rs.getString("Id_usuario"));

            } else {
                TXTERROR.setText("Usuario no existente");
            }
        }

    }

    private void Editar() throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (TXTUSUARIO.getText().equals("") || TXTCONTRASEÑA.getText().equals("")) {
            TXTERROR.setText("Llenar todos los campos");
        } else {
            //cosulta de edicion
            String sql = ("UPDATE usuarios SET Usuario=?, Contraseña=? WHERE Id_usuario=?");
            ps = con.prepareStatement(sql);

            //formato de constraseña (la encripta)
            String pass = TXTCONTRASEÑA.getText();
            String contraseña = hash.sha1(pass);

            //datos a editar
            ps.setString(1, TXTUSUARIO.getText());
            ps.setString(2, contraseña);
            ps.setString(3, TXTID.getText());
            int res = ps.executeUpdate();

            if (res > 0) {
                TXTERROR.setText("Usuario modificado");
                limpiarCajas();
            } else {
                TXTERROR.setText("Error al modificar usuario");
            }
        }
    }

    //limpiar caja usuario
    private void TXTUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTUSUARIOActionPerformed
        TXTUSUARIO.setText(null);
    }//GEN-LAST:event_TXTUSUARIOActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // se vuelven a activar los botones de la interfaz Inicio
        Inicio.frmEliU = null;
        Inicio.frmMen = null;
        Inicio.frmReg = null;
        Inicio.frmLog = null;
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    //limpiar caja contraseña
    private void TXTCONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCONTRASEÑAActionPerformed
        TXTCONTRASEÑA.setText(null);
    }//GEN-LAST:event_TXTCONTRASEÑAActionPerformed

    private void BTNINICIARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNINICIARMouseEntered
        BTNINICIAR.setBackground(new Color(39, 59, 89));
        BTNINICIAR.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BTNINICIARMouseEntered

    private void BTNINICIARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNINICIARMouseExited
        BTNINICIAR.setBackground(new Color(15, 33, 55));
        BTNINICIAR.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_BTNINICIARMouseExited

    private void BTNINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNINICIARActionPerformed
        try {
            Editar();
        } catch (SQLException ex) {
            Logger.getLogger(ElimUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        CargarTabla();
    }//GEN-LAST:event_BTNINICIARActionPerformed
    // desplazamiento de pantall
    int xx, xy;
    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_fondoMousePressed

    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_fondoMouseDragged

    private void TXTUSUARIOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTUSUARIOMousePressed
        TXTUSUARIO.setText("");
    }//GEN-LAST:event_TXTUSUARIOMousePressed

    private void TXTCONTRASEÑAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTCONTRASEÑAMousePressed
        TXTCONTRASEÑA.setText("");
    }//GEN-LAST:event_TXTCONTRASEÑAMousePressed

    private void BTNBUSCARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBUSCARMouseEntered
        BTNINICIAR.setBackground(new Color(39, 59, 89));
        BTNINICIAR.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BTNBUSCARMouseEntered

    private void BTNBUSCARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNBUSCARMouseExited
        BTNINICIAR.setBackground(new Color(15, 33, 55));
        BTNINICIAR.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_BTNBUSCARMouseExited

    private void BTNBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCARActionPerformed
        try {
            Buscar();
        } catch (SQLException ex) {
            Logger.getLogger(ElimUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTNBUSCARActionPerformed

    private void BTNEDITARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEDITARMouseEntered

    }//GEN-LAST:event_BTNEDITARMouseEntered

    private void BTNEDITARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNEDITARMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNEDITARMouseExited

    private void BTNEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEDITARActionPerformed
        try {
            Eliminar();
        } catch (SQLException ex) {
            Logger.getLogger(ElimUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        CargarTabla();

    }//GEN-LAST:event_BTNEDITARActionPerformed

    //seleccionar un usuario de la tabla
    private void jtUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuariosMouseClicked
        int fila = this.jtUsuarios.getSelectedRow();
        this.TXTID.setText(this.jtUsuarios.getValueAt(fila, 0).toString());
        this.TXTUSUARIO.setText(this.jtUsuarios.getValueAt(fila, 1).toString());
        this.TXTCONTRASEÑA.setText("");
    }//GEN-LAST:event_jtUsuariosMouseClicked

    // se vuelven a activar los botones de la interfaz Inicio
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Inicio.frmEliU = null;
        Inicio.frmMen = null;
        Inicio.frmReg = null;
        Inicio.frmLog = null;
    }//GEN-LAST:event_formWindowClosing
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElimUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElimUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElimUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElimUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElimUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBUSCAR;
    private javax.swing.JButton BTNEDITAR;
    private javax.swing.JButton BTNINICIAR;
    private javax.swing.JTextField TXTCONTRASEÑA;
    private javax.swing.JLabel TXTERROR;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTUSUARIO;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUsuarios;
    private javax.swing.JLabel lbProduct;
    private javax.swing.JLabel lbProduct1;
    private javax.swing.JLabel lbProduct2;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel salir;
    private javax.swing.JSeparator spProducto;
    private javax.swing.JSeparator spProducto1;
    // End of variables declaration//GEN-END:variables
}