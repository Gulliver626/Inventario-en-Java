package tablas;

import tablas.modelo.ConexionSQL;
import tablas.modelo.HeaderColor;
import Formularios.Venta;
import Formularios.Exportar;
import Formularios.Eliminar;
import Formularios.EliminarProducto;
import Principal.Menu;
import Formularios.Importar;
import Formularios.Ingresar;
import desplazable.Desface;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.swing.table.DefaultTableModel;
import static Principal.Menu.Elim;
import static Principal.Menu.ElimP;
import static Principal.Menu.Expor;
import static Principal.Menu.Impor;
import static Principal.Menu.Ingr;
import static Principal.Menu.Vent;

/**
 *
 * @author master
 */
public class Entradas extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    Desface desplace;

    public Entradas() {
        initComponents();
        jtEntradas.getTableHeader().setDefaultRenderer(new HeaderColor());
        setLocationRelativeTo(null);
        desplace = new Desface();

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtEntradas.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionSQL conn = new ConexionSQL();
            Connection con = conn.getConexion();

            String sql = "Select id_entrada, id_producto, Fecha_entrada, Usuario_responsable, Cantidad FROM Entradas";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("id_entrada");
            modelo.addColumn("id_Producto");
            modelo.addColumn("Fecha_entrada");
            modelo.addColumn("Usuario_responsable");
            modelo.addColumn("Cantidad");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }

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

        jPanel2 = new javax.swing.JPanel();
        MenuPlegable = new javax.swing.JPanel();
        Eliminar = new javax.swing.JLabel();
        Desplegar = new javax.swing.JLabel();
        Tablas = new javax.swing.JLabel();
        Ingresar = new javax.swing.JLabel();
        Exportar = new javax.swing.JLabel();
        venta = new javax.swing.JLabel();
        Importar = new javax.swing.JLabel();
        venta1 = new javax.swing.JLabel();
        CBoxFiltro = new javax.swing.JComboBox<>();
        btnBusqueda = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        Icono = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEntradas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        apertura = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1080, 700));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(null);

        MenuPlegable.setBackground(new java.awt.Color(15, 33, 55));
        MenuPlegable.setLayout(null);

        Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida_2.png"))); // NOI18N
        Eliminar.setText("Salida Producto");
        Eliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Eliminar.setIconTextGap(15);
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarMousePressed(evt);
            }
        });
        MenuPlegable.add(Eliminar);
        Eliminar.setBounds(0, 210, 200, 70);

        Desplegar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Desplegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        Desplegar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Desplegar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Desplegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesplegarMouseClicked(evt);
            }
        });
        MenuPlegable.add(Desplegar);
        Desplegar.setBounds(0, 0, 200, 70);

        Tablas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Tablas.setForeground(new java.awt.Color(255, 255, 255));
        Tablas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tablas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tabla_2.png"))); // NOI18N
        Tablas.setText("Inicio");
        Tablas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Tablas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tablas.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Tablas.setIconTextGap(15);
        Tablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablasMouseClicked(evt);
            }
        });
        MenuPlegable.add(Tablas);
        Tablas.setBounds(0, 70, 200, 70);

        Ingresar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrada_2.png"))); // NOI18N
        Ingresar.setText("Entrada Producto");
        Ingresar.setToolTipText("");
        Ingresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ingresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Ingresar.setIconTextGap(15);
        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresarMousePressed(evt);
            }
        });
        MenuPlegable.add(Ingresar);
        Ingresar.setBounds(0, 140, 200, 70);

        Exportar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Exportar.setForeground(new java.awt.Color(255, 255, 255));
        Exportar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descarga_2.png"))); // NOI18N
        Exportar.setText("Respaldo    ");
        Exportar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Exportar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Exportar.setFocusable(false);
        Exportar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Exportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExportarMousePressed(evt);
            }
        });
        MenuPlegable.add(Exportar);
        Exportar.setBounds(0, 520, 200, 70);

        venta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        venta.setForeground(new java.awt.Color(255, 255, 255));
        venta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moneda.png"))); // NOI18N
        venta.setText("Venta de producto    ");
        venta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        venta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        venta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ventaMousePressed(evt);
            }
        });
        MenuPlegable.add(venta);
        venta.setBounds(0, 280, 200, 70);

        Importar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Importar.setForeground(new java.awt.Color(255, 255, 255));
        Importar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imporatar_2.png"))); // NOI18N
        Importar.setText("Importar tablas    ");
        Importar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        Importar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Importar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Importar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ImportarMousePressed(evt);
            }
        });
        MenuPlegable.add(Importar);
        Importar.setBounds(0, 580, 200, 70);

        venta1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        venta1.setForeground(new java.awt.Color(255, 255, 255));
        venta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        venta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        venta1.setText("Eliminar producto    ");
        venta1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        venta1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        venta1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        venta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                venta1MousePressed(evt);
            }
        });
        MenuPlegable.add(venta1);
        venta1.setBounds(0, 350, 200, 70);

        getContentPane().add(MenuPlegable);
        MenuPlegable.setBounds(0, 50, 200, 650);

        CBoxFiltro.setBackground(new java.awt.Color(51, 51, 51));
        CBoxFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CBoxFiltro.setForeground(new java.awt.Color(255, 255, 255));
        CBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id_entrada", "Id_producto", "Fecha_entrada", "Usuario_responsable", "Cantidad" }));
        CBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBoxFiltroActionPerformed(evt);
            }
        });
        getContentPane().add(CBoxFiltro);
        CBoxFiltro.setBounds(400, 10, 130, 30);

        btnBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseClicked(evt);
            }
        });
        getContentPane().add(btnBusqueda);
        btnBusqueda.setBounds(80, 0, 50, 50);

        txtCampo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCampo.setForeground(new java.awt.Color(102, 102, 102));
        txtCampo.setBorder(null);
        txtCampo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txtCampo);
        txtCampo.setBounds(140, 10, 230, 30);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setAlignmentX(0.7F);
        jSeparator2.setDoubleBuffered(true);
        jSeparator2.setFocusCycleRoot(true);
        jSeparator2.setFocusTraversalPolicyProvider(true);
        jSeparator2.setFocusable(true);
        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 12));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(140, 45, 230, 5);

        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        cerrar.setToolTipText("");
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(cerrar);
        cerrar.setBounds(1030, 0, 40, 50);

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimizar.png"))); // NOI18N
        minimizar.setToolTipText("");
        minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(minimizar);
        minimizar.setBounds(1000, 0, 20, 50);

        Icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        Icono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Icono.setRequestFocusEnabled(false);
        getContentPane().add(Icono);
        Icono.setBounds(0, 0, 50, 50);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtEntradas.setBackground(new java.awt.Color(51, 51, 51));
        jtEntradas.setForeground(new java.awt.Color(255, 255, 255));
        jtEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_entrada                     |", "Id_producto                          |", "Fecha_entrada           |", "Usuario_responsable              |", "Cantidad                            |"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtEntradas.setFocusable(false);
        jtEntradas.setGridColor(new java.awt.Color(102, 102, 102));
        jtEntradas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtEntradas.setRowHeight(20);
        jtEntradas.setSelectionBackground(new java.awt.Color(39, 59, 89));
        jtEntradas.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jtEntradas.getTableHeader().setReorderingAllowed(false);
        jtEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEntradasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEntradas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 145, 840, 530);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(220, 130, 840, 10);

        jPanel3.setBackground(new java.awt.Color(187, 187, 187));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla Entradas");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 50));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(220, 70, 840, 50);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setOpaque(true);
        getContentPane().add(fondo);
        fondo.setBounds(0, 50, 1080, 650);

        apertura.setBackground(new java.awt.Color(39, 59, 89));
        apertura.setOpaque(true);
        apertura.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                aperturaMouseDragged(evt);
            }
        });
        apertura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aperturaMousePressed(evt);
            }
        });
        getContentPane().add(apertura);
        apertura.setBounds(0, 0, 1080, 51);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx, xy;
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        MenuPlegable.setSize(new Dimension(MenuPlegable.getWidth(), this.getHeight()));
    }//GEN-LAST:event_formComponentResized

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);

    }//GEN-LAST:event_minimizarMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void CBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBoxFiltroActionPerformed
    private void buscar() {
        String campo = txtCampo.getText();
        String where = "";
        String filtro = CBoxFiltro.getSelectedItem().toString();

        if (!"".equals(campo)) {//si el campo no esta vacio
            where = " WHERE " + filtro + " LIKE '%" + campo + "%'";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtEntradas.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionSQL conn = new ConexionSQL();
            Connection con = conn.getConexion();

            String sql = "Select id_entrada, id_producto, Fecha_entrada, Usuario_responsable, Cantidad FROM Entradas"
                    + where;
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("id_entrada");
            modelo.addColumn("id_Producto");
            modelo.addColumn("Fecha_entrada");
            modelo.addColumn("Usuario_responsable");
            modelo.addColumn("Cantidad");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        txtCampo.setText("");
    }
    private void btnBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseClicked
        buscar();
    }//GEN-LAST:event_btnBusquedaMouseClicked

    private void aperturaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aperturaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_aperturaMouseDragged

    private void aperturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aperturaMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_aperturaMousePressed

    private void jtEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEntradasMouseClicked
    }//GEN-LAST:event_jtEntradasMouseClicked

    private void EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMousePressed
        if (Elim == null) {
            //hace los botones inutiles
            Elim = new Eliminar();
            ElimP = new EliminarProducto();
            Ingr = new Ingresar();
            Vent = new Venta();
            Expor = new Exportar();
            Impor = new Importar();

            Elim.setVisible(true);
        }
    }//GEN-LAST:event_EliminarMousePressed

    private void DesplegarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesplegarMouseClicked
        if (MenuPlegable.getX() == 0) {
            desplace.desplazarIzquierda(MenuPlegable, MenuPlegable.getX(), -150, 10, 10);
        } else if (MenuPlegable.getX() == -150) {
            desplace.desplazarDerecha(MenuPlegable, MenuPlegable.getX(), 0, 10, 10);
        }
    }//GEN-LAST:event_DesplegarMouseClicked

    private void TablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablasMouseClicked
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TablasMouseClicked

    private void IngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMousePressed
        if (Ingr == null) {
            //hace los botones inutiles
            Elim = new Eliminar();
            ElimP = new EliminarProducto();
            Ingr = new Ingresar();
            Vent = new Venta();
            Expor = new Exportar();
            Impor = new Importar();

            Ingr.setVisible(true);
        }
    }//GEN-LAST:event_IngresarMousePressed

    private void ExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportarMousePressed
        if (Expor == null) {
            //hace los botones inutiles
            Elim = new Eliminar();
            ElimP = new EliminarProducto();
            Ingr = new Ingresar();
            Vent = new Venta();
            Expor = new Exportar();
            Impor = new Importar();

            Expor.setVisible(true);
        }
    }//GEN-LAST:event_ExportarMousePressed

    private void ventaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventaMousePressed
        if (Vent == null) {
            //hace los botones inutiles
            Elim = new Eliminar();
            ElimP = new EliminarProducto();
            Ingr = new Ingresar();
            Vent = new Venta();
            Expor = new Exportar();
            Impor = new Importar();

            Vent.setVisible(true);
        }
    }//GEN-LAST:event_ventaMousePressed

    private void ImportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportarMousePressed
        if (Impor == null) {
            //hace los botones inutiles
            Elim = new Eliminar();
            ElimP = new EliminarProducto();
            Ingr = new Ingresar();
            Vent = new Venta();
            Expor = new Exportar();
            Impor = new Importar();

            Impor.setVisible(true);
        }
    }//GEN-LAST:event_ImportarMousePressed

    private void venta1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venta1MousePressed
        if (ElimP == null) {
            //hace los botones inutiles
            Elim = new Eliminar();
            ElimP = new EliminarProducto();
            Ingr = new Ingresar();
            Vent = new Venta();
            Expor = new Exportar();
            Impor = new Importar();

            ElimP.setVisible(true);
        }
    }//GEN-LAST:event_venta1MousePressed

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
            java.util.logging.Logger.getLogger(Entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBoxFiltro;
    private javax.swing.JLabel Desplegar;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Exportar;
    private javax.swing.JLabel Icono;
    private javax.swing.JLabel Importar;
    private javax.swing.JLabel Ingresar;
    private javax.swing.JPanel MenuPlegable;
    private javax.swing.JLabel Tablas;
    private javax.swing.JLabel apertura;
    private javax.swing.JLabel btnBusqueda;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jtEntradas;
    private javax.swing.JLabel minimizar;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JLabel venta;
    private javax.swing.JLabel venta1;
    // End of variables declaration//GEN-END:variables
}
