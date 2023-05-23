package Modelos;

import java.util.Date;

public class columnasTab {
    //---------------------Variabes para intetos de inicio de sesion 
private int Intento;
    public int getIntento() {
        return Intento;
    }
    public void setIntento(int Intento) {
        this.Intento = Intento;
    }
//--------------------------------------------------------Variables Universales
    private int Id_productoUNIVERSAL;
    private int Id_salidaUNIVERSAL;
    private int Id_entradaUNIVERSAL;
    private String UsuarioUNIVERSAL;
    //--------------------------------------------------Variabes para Usuarios
    private int Id_usuarioUSUARIOS;
    public String UsuarioUSUARIOS;
    private String ContraseñaUSUARIOS;
    private String Fecha_ingresoUSUARIOS;
    private int Id_tipoUSUARIOS;
    //---------------------------------------------------Variables para Ingresar
    private int Id_productoINGRESAR;
    private String ProductoINGRESAR;
    private String CategoriaINGRESAR;
    private int EntradaINGRESAR;
    private int SalidaINGRESAR;
    private String Estado_productoINGRESAR;
    private int PrecioINGRESAR;
    private int CantidadINGRESAR;
    //---------------------------------------------------Variables de Busqueda de Ingresar
    private int Id_productoINGRESARB;
    private String ProductoINGRESARB;
    private String CategoriaINGRESARB;
    private int EntradaINGRESARB;
    private int SalidaINGRESARB;
    private String Estado_productoINGRESARB;
    private int PrecioINGRESARB;
    private int CantidadINGRESARB;
    //----------------------------------------------------Variables para Tabla Entrada
    private int Id_entradaENTRADA;
    private int Id_productoENTRADA;
    private Date Fecha_entradaENTRADA;
    private String Usuario_responsableENTRADA;
    private int CantidadENTRADA;
    //----------------------------------------------------Varibales para Ventas
    private int Id_ventaVENTA;
    private int Id_salidaVENTA;
    private int Id_productoVENTA;
    private String CompradorVENTA;
    private String ResponsableVENTA;
    private int CantidadVENTA;
    private int Precio_ventaVENTA;
    private Date Fecha_ventaVENTA;
    //----------------------------------------------------Variables para Buscar VENTAS
    private int Id_ventaVENTAB;
    private int Id_salidaVENTAB;
    private int Id_productoVENTAB;
    private String CompradorVENTAB;
    private String ResponsableVENTAB;
    private int CantidadVENTAB;
    private int Precio_ventaVENTAB;
    private Date Fecha_ventaVENTAB;
    //----------------------------------------------------Variables para Eliminar
    private int Id_salidaSALIDA;
    private String ProductoSALIDA;
    private int Id_productoSALIDA;
    private Date Fecha_entradaSALIDA;
    private Date Fecha_salidaSALIDA;
    private String MotivoSALIDA;
    private String Usuario_responsableSALIDA;
    private int CantidadSALIDA;
    //----------------------------------------------------------Varibles para buscar eleminar
    private int Id_salidaSALIDAB;
    private String ProductoSALIDAB;
    private int Id_productoSALIDAB;
    private Date Fecha_entradaSALIDAB;
    private Date Fecha_salidaSALIDAB;
    private String MotivoSALIDAB;
    private String Usuario_responsableSALIDAB;
    private int CantidadSALIDAB;
    //-------------------------------------------------------------Variables para Compras
    private int Id_compraCOMPRA;
    private int Id_entradaCOMPRA;
    private int Id_prodcutoCOMPRA;
    private String ProveedorCOMPRA;
    private String Usuario_responsableCOMPRA;
    private int CantidadCOMPRA;
    private int Precio_compraCOMPRA;
    private Date Fecha_compraCOMPRA;

    public Date getFecha_compraCOMPRA() {
        return Fecha_compraCOMPRA;
    }

    public void setFecha_compraCOMPRA(Date Fecha_compraCOMPRA) {
        this.Fecha_compraCOMPRA = Fecha_compraCOMPRA;
    }

    public int getId_compraCOMPRA() {
        return Id_compraCOMPRA;
    }

    public void setId_compraCOMPRA(int Id_compraCOMPRA) {
        this.Id_compraCOMPRA = Id_compraCOMPRA;
    }

    public int getId_entradaCOMPRA() {
        return Id_entradaCOMPRA;
    }

    public void setId_entradaCOMPRA(int Id_entradaCOMPRA) {
        this.Id_entradaCOMPRA = Id_entradaCOMPRA;
    }

    public int getId_prodcutoCOMPRA() {
        return Id_prodcutoCOMPRA;
    }

    public void setId_prodcutoCOMPRA(int Id_prodcutoCOMPRA) {
        this.Id_prodcutoCOMPRA = Id_prodcutoCOMPRA;
    }

    public String getProveedorCOMPRA() {
        return ProveedorCOMPRA;
    }

    public void setProveedorCOMPRA(String ProveedorCOMPRA) {
        this.ProveedorCOMPRA = ProveedorCOMPRA;
    }

    public String getUsuario_responsableCOMPRA() {
        return Usuario_responsableCOMPRA;
    }

    public void setUsuario_responsableCOMPRA(String Usuario_responsableCOMPRA) {
        this.Usuario_responsableCOMPRA = Usuario_responsableCOMPRA;
    }

    public int getCantidadCOMPRA() {
        return CantidadCOMPRA;
    }

    public void setCantidadCOMPRA(int CantidadCOMPRA) {
        this.CantidadCOMPRA = CantidadCOMPRA;
    }

    public int getPrecio_compraCOMPRA() {
        return Precio_compraCOMPRA;
    }

    public void setPrecio_compraCOMPRA(int Precio_compraCOMPRA) {
        this.Precio_compraCOMPRA = Precio_compraCOMPRA;
    }

    //------------------------------------------------------------Metodos Universales
    public int getId_productoUNIVERSAL() {
        System.out.println(Id_productoUNIVERSAL + "  ESTA ES LA ID DE PRODUCTO");
        return Id_productoUNIVERSAL;
    }

    public void setId_productoUNIVERSAL(int Id_productoUNIVERSAL) {
        this.Id_productoUNIVERSAL = Id_productoUNIVERSAL;
    }

    public int getId_salidaUNIVERSAL() {
        return Id_salidaUNIVERSAL;
    }

    public void setId_salidaUNIVERSAL(int Id_salidaUNIVERSAL) {
        this.Id_salidaUNIVERSAL = Id_salidaUNIVERSAL;
    }

    public int getId_entradaUNIVERSAL() {
        System.out.println(Id_entradaUNIVERSAL + "  ESTA ES LA ID DE ENTRADA");
        return Id_entradaUNIVERSAL;
    }

    public void setId_entradaUNIVERSAL(int Id_entradaUNIVERSAL) {
        this.Id_entradaUNIVERSAL = Id_entradaUNIVERSAL;
    }

    public String getUsuarioUNIVERSAL() {
        return UsuarioUNIVERSAL;
    }

    public void setUsuarioUNIVERSAL(String UsuarioUNIVERSAL) {
        this.UsuarioUNIVERSAL = UsuarioUNIVERSAL;
    }

    //----------------------------------------------------Metodos de Usuarios
    public int getId_usuarioUSUARIOS() {
        return Id_usuarioUSUARIOS;
    }

    public void setId_usuarioUSUARIOS(int Id_usuarioUSUARIOS) {
        this.Id_usuarioUSUARIOS = Id_usuarioUSUARIOS;
    }

    public String getUsuarioUSUARIOS() {
        return UsuarioUSUARIOS;
    }

    public void setUsuarioUSUARIOS(String UsuarioUSUARIOS) {
        this.UsuarioUSUARIOS = UsuarioUSUARIOS;
    }

    public String getContraseñaUSUARIOS() {
        return ContraseñaUSUARIOS;
    }

    public void setContraseñaUSUARIOS(String ContraseñaUSUARIOS) {
        this.ContraseñaUSUARIOS = ContraseñaUSUARIOS;
    }

    public String getFecha_ingresoUSUARIOS() {
        return Fecha_ingresoUSUARIOS;
    }

    public void setFecha_ingresoUSUARIOS(String Fecha_ingresoUSUARIOS) {
        this.Fecha_ingresoUSUARIOS = Fecha_ingresoUSUARIOS;
    }

    public int getId_tipoUSUARIOS() {
        return Id_tipoUSUARIOS;
    }

    public void setId_tipoUSUARIOS(int Id_tipoUSUARIOS) {
        this.Id_tipoUSUARIOS = Id_tipoUSUARIOS;
    }

    //---------------------------------------------------------------Metodos de Ingresar
    public int getId_productoINGRESAR() {
        return Id_productoINGRESAR;
    }

    public void setId_productoINGRESAR(int Id_productoINGRESAR) {
        this.Id_productoINGRESAR = Id_productoINGRESAR;
    }

    public void setProductoINGRESAR(String ProductoINGRESAR) {
        this.ProductoINGRESAR = ProductoINGRESAR;
    }

    public String getProductoINGRESAR() {
        return ProductoINGRESAR;
    }

    public void setCategoriaINGRESAR(String CategoriaINGRESAR) {
        this.CategoriaINGRESAR = CategoriaINGRESAR;
    }

    public String getCategoriaINGRESAR() {
        return CategoriaINGRESAR;
    }

    public int getEntradaINGRESAR() {
        return EntradaINGRESAR;
    }

    public void setEntradaINGRESAR(int EntradaINGRESAR) {
        this.EntradaINGRESAR = EntradaINGRESAR;
    }

    public int getSalidaINGRESAR() {
        return SalidaINGRESAR;
    }

    public void setSalidaINGRESAR(int SalidaINGRESAR) {
        this.SalidaINGRESAR = SalidaINGRESAR;
    }

    public void setEstado_productoINGRESAR(String Estado_productoINGRESAR) {
        this.Estado_productoINGRESAR = Estado_productoINGRESAR;
    }

    public String getEstado_productoINGRESAR() {
        return Estado_productoINGRESAR;
    }

    public int getPrecioINGRESAR() {
        return PrecioINGRESAR;
    }

    public void setPrecioINGRESAR(int PrecioINGRESAR) {
        this.PrecioINGRESAR = PrecioINGRESAR;
    }

    public int getCantidadINGRESAR() {
        return CantidadINGRESAR;
    }

    public void setCantidadINGRESAR(int CantidadINGRESAR) {
        this.CantidadINGRESAR = CantidadINGRESAR;
    }

    //----------------------------------------------------Metodos de Busqueda
    public int getId_productoINGRESARB() {
        return Id_productoINGRESARB;
    }

    public void setId_productoINGRESARB(int Id_productoINGRESARB) {
        this.Id_productoINGRESARB = Id_productoINGRESARB;
    }

    public void setProductoINGRESARB(String ProductoINGRESARB) {
        this.ProductoINGRESARB = ProductoINGRESARB;
    }

    public String getProductoINGRESARB() {
        return ProductoINGRESARB;
    }

    public void setCategoriaINGRESARB(String CategoriaINGRESARB) {
        this.CategoriaINGRESARB = CategoriaINGRESARB;
    }

    public String getCategoriaINGRESARB() {
        return CategoriaINGRESARB;
    }

    public int getEntradaINGRESARB() {
        return EntradaINGRESARB;
    }

    public void setEntradaINGRESARB(int EntradaINGRESARB) {
        this.EntradaINGRESARB = EntradaINGRESARB;
    }

    public int getSalidaINGRESARB() {
        return SalidaINGRESARB;
    }

    public void setSalidaINGRESARB(int SalidaINGRESARB) {
        this.SalidaINGRESARB = SalidaINGRESARB;
    }

    public void setEstado_productoINGRESARB(String Estado_productoINGRESARB) {
        this.Estado_productoINGRESARB = Estado_productoINGRESARB;
    }

    public String getEstado_productoINGRESARB() {
        return Estado_productoINGRESARB;
    }

    public int getPrecioINGRESARB() {
        return PrecioINGRESARB;
    }

    public void setPrecioINGRESARB(int PrecioINGRESARB) {
        this.PrecioINGRESARB = PrecioINGRESARB;
    }

    public int getCantidadINGRESARB() {
        return CantidadINGRESARB;
    }

    public void setCantidadINGRESARB(int CantidadINGRESARB) {
        this.CantidadINGRESARB = CantidadINGRESARB;
    }

    //----------------------------------------------------------Metodos de Entrada
    public int getId_entradaENTRADA() {
        return Id_entradaENTRADA;
    }

    public void setId_entradaENTRADA(int Id_entradaENTRADA) {
        this.Id_entradaENTRADA = Id_entradaENTRADA;
    }

    public int getId_productoENTRADA() {
        return Id_productoENTRADA;
    }

    public void setId_productoENTRADA(int Id_productoENTRADA) {
        this.Id_productoENTRADA = Id_productoENTRADA;
    }

    public Date getFecha_entradaENTRADA() {
        return Fecha_entradaENTRADA;
    }

    public void setFecha_entradaENTRADA(Date Fecha_entradaENTRADA) {
        this.Fecha_entradaENTRADA = Fecha_entradaENTRADA;
    }

    public String getUsuario_responsableENTRADA() {
        System.out.print(Usuario_responsableENTRADA);
        return Usuario_responsableENTRADA;
    }

    public void setUsuario_responsableENTRADA(String Usuario_responsableENTRADA) {
        this.Usuario_responsableENTRADA = Usuario_responsableENTRADA;
    }

    public int getCantidadENTRADA() {
        return CantidadENTRADA;
    }

    public void setCantidadENTRADA(int CantidadENTRADA) {
        this.CantidadENTRADA = CantidadENTRADA;
    }

    //--------------------------------------------------------------------Metodos de Venta
    public int getId_ventaVENTA() {
        return Id_ventaVENTA;
    }

    public void setId_ventaVENTA(int Id_ventaVENTA) {
        this.Id_ventaVENTA = Id_ventaVENTA;
    }

    public int getId_salidaVENTA() {
        return Id_salidaVENTA;
    }

    public void setId_salidaVENTA(int Id_salidaVENTA) {
        this.Id_salidaVENTA = Id_salidaVENTA;
    }

    public int getId_productoVENTA() {
        return Id_productoVENTA;
    }

    public void setId_productoVENTA(int Id_productoVENTA) {
        this.Id_productoVENTA = Id_productoVENTA;
    }

    public String getCompradorVENTA() {
        return CompradorVENTA;
    }

    public void setCompradorVENTA(String CompradorVENTA) {
        this.CompradorVENTA = CompradorVENTA;
    }

    public String getResponsableVENTA() {
        return ResponsableVENTA;
    }

    public void setResponsableVENTA(String ResponsableVENTA) {
        this.ResponsableVENTA = ResponsableVENTA;
    }

    public int getCantidadVENTA() {
        return CantidadVENTA;
    }

    public void setCantidadVENTA(int CantidadVENTA) {
        this.CantidadVENTA = CantidadVENTA;
    }

    public int getPrecio_ventaVENTA() {
        return Precio_ventaVENTA;
    }

    public void setPrecio_ventaVENTA(int Precio_ventaVENTA) {
        this.Precio_ventaVENTA = Precio_ventaVENTA;
    }

    public Date getFecha_ventaVENTA() {
        return Fecha_ventaVENTA;
    }

    public void setFecha_ventaVENTA(Date Fecha_ventaVENTA) {
        this.Fecha_ventaVENTA = Fecha_ventaVENTA;
    }

    public int getId_ventaVENTAB() {
        return Id_ventaVENTAB;
    }

    public void setId_ventaVENTAB(int Id_ventaVENTAB) {
        this.Id_ventaVENTAB = Id_ventaVENTAB;
    }

    public int getId_salidaVENTAB() {
        return Id_salidaVENTAB;
    }

    public void setId_salidaVENTAB(int Id_salidaVENTAB) {
        this.Id_salidaVENTAB = Id_salidaVENTAB;
    }

    public int getId_productoVENTAB() {
        return Id_productoVENTAB;
    }

    public void setId_productoVENTAB(int Id_productoVENTAB) {
        this.Id_productoVENTAB = Id_productoVENTAB;
    }

    public String getCompradorVENTAB() {
        return CompradorVENTAB;
    }

    public void setCompradorVENTAB(String CompradorVENTAB) {
        this.CompradorVENTAB = CompradorVENTAB;
    }

    public String getResponsableVENTAB() {
        return ResponsableVENTAB;
    }

    public void setResponsableVENTAB(String ResponsableVENTAB) {
        this.ResponsableVENTAB = ResponsableVENTAB;
    }

    public int getCantidadVENTAB() {
        return CantidadVENTAB;
    }

    public void setCantidadVENTAB(int CantidadVENTAB) {
        this.CantidadVENTAB = CantidadVENTAB;
    }

    public int getPrecio_ventaVENTAB() {
        return Precio_ventaVENTAB;
    }

    public void setPrecio_ventaVENTAB(int Precio_ventaVENTAB) {
        this.Precio_ventaVENTAB = Precio_ventaVENTAB;
    }

    public Date getFecha_ventaVENTAB() {
        return Fecha_ventaVENTAB;
    }

    public void setFecha_ventaVENTAB(Date Fecha_ventaVENTAB) {
        this.Fecha_ventaVENTAB = Fecha_ventaVENTAB;
    }

    //-------------------------------------------------------------------Metodos de Salidas
    public String getProductoSALIDA() {
        return ProductoSALIDA;
    }

    public void setProductoSALIDA(String ProductoSALIDA) {
        this.ProductoSALIDA = ProductoSALIDA;
    }

    public int getId_salidaSALIDA() {
        return Id_salidaSALIDA;
    }

    public void setId_salidaSALIDA(int Id_salidaSALIDA) {
        this.Id_salidaSALIDA = Id_salidaSALIDA;
    }

    public int getId_productoSALIDA() {
        return Id_productoSALIDA;
    }

    public void setId_productoSALIDA(int Id_productoSALIDA) {
        this.Id_productoSALIDA = Id_productoSALIDA;
    }

    public Date getFecha_entradaSALIDA() {
        return Fecha_entradaSALIDA;
    }

    public void setFecha_entradaSALIDA(Date Fecha_entradaSALIDA) {
        this.Fecha_entradaSALIDA = Fecha_entradaSALIDA;
    }

    public Date getFecha_salidaSALIDA() {
        return Fecha_salidaSALIDA;
    }

    public void setFecha_salidaSALIDA(Date Fecha_salidaSALIDA) {
        this.Fecha_salidaSALIDA = Fecha_salidaSALIDA;
    }

    public String getMotivoSALIDA() {
        return MotivoSALIDA;
    }

    public void setMotivoSALIDA(String MotivoSALIDA) {
        this.MotivoSALIDA = MotivoSALIDA;
    }

    public int getCantidadSALIDA() {
        return CantidadSALIDA;
    }

    public void setCantidadSALIDA(int CantidadSALIDA) {
        this.CantidadSALIDA = CantidadSALIDA;
    }

    public String getUsuario_responsableSALIDA() {
        return Usuario_responsableSALIDA;
    }

    public void setUsuario_responsableSALIDA(String Usuario_responsableSALIDA) {
        this.Usuario_responsableSALIDA = Usuario_responsableSALIDA;
    }

    //----------------------------------------------------------------mETODOS PARA BUSCAR SALIDAS
    public String getProductoSALIDAB() {
        return ProductoSALIDAB;
    }

    public void setProductoSALIDAB(String ProductoSALIDAB) {
        this.ProductoSALIDAB = ProductoSALIDAB;
    }

    public int getId_salidaSALIDAB() {
        return Id_salidaSALIDAB;
    }

    public void setId_salidaSALIDAB(int Id_salidaSALIDAB) {
        this.Id_salidaSALIDAB = Id_salidaSALIDAB;
    }

    public int getId_productoSALIDAB() {
        return Id_productoSALIDAB;
    }

    public void setId_productoSALIDAB(int Id_productoSALIDAB) {
        this.Id_productoSALIDAB = Id_productoSALIDAB;
    }

    public Date getFecha_entradaSALIDAB() {
        return Fecha_entradaSALIDAB;
    }

    public void setFecha_entradaSALIDAB(Date Fecha_entradaSALIDAB) {
        this.Fecha_entradaSALIDAB = Fecha_entradaSALIDAB;
    }

    public Date getFecha_salidaSALIDAB() {
        return Fecha_salidaSALIDAB;
    }

    public void setFecha_salidaSALIDAB(Date Fecha_salidaSALIDAB) {
        this.Fecha_salidaSALIDAB = Fecha_salidaSALIDAB;
    }

    public String getMotivoSALIDAB() {
        return MotivoSALIDAB;
    }

    public void setMotivoSALIDAB(String MotivoSALIDAB) {
        this.MotivoSALIDAB = MotivoSALIDAB;
    }

    public int getCantidadSALIDAB() {
        return CantidadSALIDAB;
    }

    public void setCantidadSALIDAB(int CantidadSALIDAB) {
        this.CantidadSALIDAB = CantidadSALIDAB;
    }

    public String getUsuario_responsableSALIDAB() {
        return Usuario_responsableSALIDAB;
    }

    public void setUsuario_responsableSALIDAB(String Usuario_responsableSALIDAB) {
        this.Usuario_responsableSALIDAB = Usuario_responsableSALIDAB;
    }
}
