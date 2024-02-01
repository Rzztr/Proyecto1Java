package com.gm.ventas;
public class Producto {
    
    private int idProducto=1;
    private String nombre;
    private double precio;
    private static int contadorId;

    public Producto(String nombre, double precio) {
        this.idProducto=++contadorId;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "idProducto: " + idProducto + ", nombre: " + nombre + ", precio: " + precio;
    }
}
