package com.gm.ventas;
public class Orden extends Producto{
    
    private int idOrden=0001;
    private static int contadorId;
    
    String Productos[] = new String[3]; //limite de productos: 3

    public Orden(String nombre, double precio) {
        super(nombre, precio);
    }
    
    
    public void agregarProd(int cantidad){
        
    }
    public void calcularTotal(){
        
    }
    public void mostrarOrd(){
        
    }
}
