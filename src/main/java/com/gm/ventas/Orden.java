package com.gm.ventas;

public class Orden extends Producto {

    private int idOrden = 0001;
    private static int contadorId;
    private Producto[] productos; 
    private int contadorProductos; 

    public Orden(String nombre, double precio) {
        super(nombre, precio);
        this.productos = new Producto[3]; // Limite de productos: 3
        this.contadorProductos = 0;
    }

    public void agregarProd(Producto producto) {
        if (contadorProductos < 3) {
            productos[contadorProductos] = producto;
            contadorProductos++;
            System.out.println("Producto agregado: " + producto.getNombre());
        } else {
            System.out.println("No se pueden agregar más productos, límite alcanzado.");
        }
    }

    public void calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        System.out.println("Total de la orden: $" + total);
    }

    public void mostrarOrd() {
        System.out.println("Lista de productos en la orden:");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i].getNombre() + " - Precio: $" + productos[i].getPrecio());
        }
    }

    public int getIdOrden() {
        return idOrden;
    }

    public static int getContadorId() {
        return contadorId;
    }
}

