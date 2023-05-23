package Formularios;

import Modelos.EliminarProductoSQL;
import Modelos.columnasTab;
import Principal.Menu;
import static Principal.VarUser.frmUsr;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;


/* @author Gerry */
public class EliminarProducto extends javax.swing.JFrame {

 

    public EliminarProducto() {
        initComponents();
        setLocationRelativeTo(null);
    }

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
        salir = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        spProducto = new javax.swing.JSeparator();
        spFecha = new javax.swing.JSeparator();
        spProveedor = new javax.swing.JSeparator();
        lbProduct = new javax.swing.JLabel();
        lbFech = new javax.swing.JLabel();
        lbProveed = new javax.swing.JLabel();
        TXTPRODUCTO = new javax.swing.JTextField();
        TXTPROVEEDOR = new javax.swing.JTextField();
        FECHASALIDA = new com.toedter.calendar.JDateChooser();
        BOTONELIMINAR = new javax.swing.JButton();
        TXTERROR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir_2.png"))); // NOI18N
        salir.setToolTipText("");
        salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar_2.png"))); // NOI18N
        minimizar.setToolTipText("");
        minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });

        lbProduct.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbProduct.setForeground(new java.awt.Color(102, 102, 102));
        lbProduct.setText("Producto");

        lbFech.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbFech.setForeground(new java.awt.Color(102, 102, 102));
        lbFech.setText("Fecha:");

        lbProveed.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lbProveed.setForeground(new java.awt.Color(102, 102, 102));
        lbProveed.setText("Proveedor");

        TXTPRODUCTO.setBackground(new java.awt.Color(204, 204, 204));
        TXTPRODUCTO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TXTPRODUCTO.setForeground(new java.awt.Color(102, 102, 102));
        TXTPRODUCTO.setText("Nombre del producto");
        TXTPRODUCTO.setBorder(null);
        TXTPRODUCTO.setCaretColor(new java.awt.Color(0, 51, 153));
        TXTPRODUCTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXTPRODUCTOMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TXTPRODUCTOMousePressed(evt);
            }
        });

        TXTPROVEEDOR.setBackground(new java.awt.Color(204, 204, 204));
        TXTPROVEEDOR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TXTPROVEEDOR.setForeground(new java.awt.Color(102, 102, 102));
        TXTPROVEEDOR.setText("Nombre del proveedor");
        TXTPROVEEDOR.setBorder(null);
        TXTPROVEEDOR.setCaretColor(new java.awt.Color(0, 51, 153));
        TXTPROVEEDOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXTPROVEEDORMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TXTPROVEEDORMousePressed(evt);
            }
        });

        BOTONELIMINAR.setBackground(new java.awt.Color(15, 33, 55));
        BOTONELIMINAR.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        BOTONELIMINAR.setForeground(new java.awt.Color(204, 204, 204));
        BOTONELIMINAR.setText("Eliminar producto");
        BOTONELIMINAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOTONELIMINAR.setFocusPainted(false);
        BOTONELIMINAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BOTONELIMINAR.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BOTONELIMINAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BOTONELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTPRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(spProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbProveed, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTPROVEEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbFech, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FECHASALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TXTERROR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                                    .addComponent(BOTONELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TXTPRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbProveed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TXTPROVEEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lbFech, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(FECHASALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(spFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTERROR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOTONELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // desplazable de pantalla
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged
    //fin desplazable de pantalla

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        Menu.Elim = null;
        Menu.ElimP = null;
        Menu.Ingr = null;
        Menu.Vent = null;
        Menu.Expor = null;
        Menu.Impor = null;
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    //limpiar producto
    private void TXTPRODUCTOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPRODUCTOMouseExited
        if (TXTPRODUCTO.getText().equals("") || TXTPRODUCTO.getText().equals("Nombre del producto")) {
            TXTPRODUCTO.setText("Nombre del producto");
        } else {
        }
    }//GEN-LAST:event_TXTPRODUCTOMouseExited
    private void TXTPRODUCTOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPRODUCTOMousePressed
        TXTPRODUCTO.setText("");
    }//GEN-LAST:event_TXTPRODUCTOMousePressed
    //limpiar proveedor
    private void TXTPROVEEDORMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPROVEEDORMousePressed
        TXTPROVEEDOR.setText("");
    }//GEN-LAST:event_TXTPROVEEDORMousePressed
    private void TXTPROVEEDORMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXTPROVEEDORMouseExited
        if (TXTPROVEEDOR.getText().equals("") || TXTPROVEEDOR.getText().equals("Nombre del proveedor")) {
            TXTPROVEEDOR.setText("Nombre del proveedor");
        } else {
        }
    }//GEN-LAST:event_TXTPROVEEDORMouseExited

    //no sirve sin usuario
    private void BOTONELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONELIMINARActionPerformed
        if (frmUsr == null) {
        } else {
            EliminarDatos();
        }
    }//GEN-LAST:event_BOTONELIMINARActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu.Elim = null;
        Menu.ElimP = null;
        Menu.Ingr = null;
        Menu.Vent = null;
        Menu.Expor = null;
        Menu.Impor = null;
    }//GEN-LAST:event_formWindowClosing

    public void EliminarDatos() {

        EliminarProductoSQL eliSQL = new EliminarProductoSQL();
        columnasTab us = new columnasTab();

        String fecha = String.valueOf(FECHASALIDA.getDate());

        //si cajas estan vacias
        if (fecha.equals("null") || TXTPRODUCTO.getText().equals("") || TXTPROVEEDOR.getText().equals("")
                || TXTPRODUCTO.getText().equals("Nombre del producto")
                || TXTPROVEEDOR.getText().equals("Nombre del proveedor")
                || fecha == "") {

            TXTERROR.setText("Completar todos los campos");

        } else {

            //guardar datos en el modelo
            us.setProductoSALIDA(TXTPRODUCTO.getText());
            us.setProveedorCOMPRA(TXTPROVEEDOR.getText());
            us.setFecha_salidaSALIDA(FECHASALIDA.getDate());

            //metodo Saliddas del modelo EliminarProductoSQL
            if (eliSQL.Salidas(us)) {
                TXTERROR.setText("Salida Exitosa");
                limpiar();

            } else {
                TXTERROR.setText("Error al registrar salida");
            }

        }

    }

    //limpiar cajas
    public void limpiar() {
        TXTPRODUCTO.setText("");
        TXTPROVEEDOR.setText("");
    }

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
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new EliminarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONELIMINAR;
    private com.toedter.calendar.JDateChooser FECHASALIDA;
    private javax.swing.JLabel TXTERROR;
    private javax.swing.JTextField TXTPRODUCTO;
    private javax.swing.JTextField TXTPROVEEDOR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFech;
    private javax.swing.JLabel lbProduct;
    private javax.swing.JLabel lbProveed;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel salir;
    private javax.swing.JSeparator spFecha;
    private javax.swing.JSeparator spProducto;
    private javax.swing.JSeparator spProveedor;
    // End of variables declaration//GEN-END:variables
}
