package com.acs.compras.api.demo.modelCompras;

public class Compras {
    private String id_compras;
    private String id_Comprador;
    private String id_Producto;
    private int cantidad_producto;
    private String direccion_envio;
    private String direccion_facturacion;
    private String medio_pago;
    private String fecha_compra;

    public String getId_compras() {
        return id_compras;
    }

    public void setId_compras(String id_compras) {
        this.id_compras = id_compras;
    }

    public String getId_Comprador() {
        return id_Comprador;
    }

    public void setId_Comprador(String id_Comprador) {
        this.id_Comprador = id_Comprador;
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public String getDireccion_facturacion() {
        return direccion_facturacion;
    }

    public void setDireccion_facturacion(String direccion_facturacion) {
        this.direccion_facturacion = direccion_facturacion;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
}
