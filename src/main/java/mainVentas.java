import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

import java.util.Scanner;

public class mainVentas {
    public static void main(String[] args) {
        int entrada;
        boolean loop=true;
        
        //objetos productos
        Scanner scanner = new Scanner(System.in);
        Orden orden1 = new Orden("", 00);
        
        Producto p1 = new Producto("Papitas", 22.00);
        Producto p2 = new Producto("Refresco", 15.50);
        Producto p3 = new Producto("Chocolate", 18.75);
        Producto p4 = new Producto("Galletas", 12.30);
        Producto p5 = new Producto("Cereal", 30.50);
        Producto p6 = new Producto("Leche", 25.00);
        Producto p7 = new Producto("Pan", 8.50);
        Producto p8 = new Producto("Yogur", 10.25);
        Producto p9 = new Producto("Manzanas", 7.50);
        Producto p10 = new Producto("Café", 40.00);
        //objeto de orden para importar metodos
        

        
        System.out.println("LIMITE DE PRODUCTOS POR ORDEN: 3");
        orden1.agregarProd(p1);
        orden1.agregarProd(p2);
        orden1.agregarProd(p3);
        
        while (loop==true){
            System.out.println("----------------------------!---------------------");
            System.out.println("Que quiee hacer con la lista?"
                + "1. Mostrtar los productos"
                + "2. ver el total");
            System.out.println("----------------------------!---------------------");
            entrada = scanner.nextInt();
        
            switch (entrada){
                case 1:
                    orden1.mostrarOrd();
                    break;
                case 2:
                    orden1.calcularTotal();
                    break;
                case 99:
                    loop=false;
                    break;
                default:
                    loop=false;
            }
        }
        
    }
  
}
