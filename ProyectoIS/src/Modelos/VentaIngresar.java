package Modelos;

import java.util.Date;

public class VentaIngresar {

    private int Id_venta;
    private int Id_salida;
    private int Id_pro;
    private String Comprador;
    private String Responsable;
    private int Cantidad;
    private int Precio_venta;
    private String Fecha_venta;
    private Date FechaV;

    private String NombreProducto;

    public int getId_venta() {
        return Id_venta;
    }

    public void setId_venta(int Id_venta) {
        this.Id_venta = Id_venta;
    }

    public int getId_salida() {
        return Id_salida;
    }

    public void setId_salida(int Id_salida) {
        this.Id_salida = Id_salida;
    }

    public int getId_pro() {
        return Id_pro;
    }

    public void setId_pro(int Id_pro) {
        this.Id_pro = Id_pro;
    }

    public String getComprador() {
        return Comprador;
    }

    public void setComprador(String Comprador) {
        this.Comprador = Comprador;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public String getFecha_venta() {
        return Fecha_venta;
    }

    public void setFecha_venta(String Fecha_venta) {
        this.Fecha_venta = Fecha_venta;
    }

    public Date getFechaV() {
        return FechaV;
    }

    public void setFechaV(Date FechaV) {
        this.FechaV = FechaV;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(int Precio_venta) {
        this.Precio_venta = Precio_venta;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

}
