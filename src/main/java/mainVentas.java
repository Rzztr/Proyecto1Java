import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

import java.util.Scanner;

public class mainVentas {
    public static void main(String[] args) {
        int entrada;
        int cantidad0=1;
        
        //objetos productos
        Scanner scanner = new Scanner(System.in);
        //objeto de orden para importar metodos
        
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
        
        System.out.println("LIMITE DE PRODUCTOS POR ORDEN: 3");
        
        Producto [] productos = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        System.out.println("Lista de prodcutos disponibles:...");
        System.out.println("----------------------------!---------------------");
        
        for (int i = 0; i <productos.length; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("----------------------------!---------------------");
        System.out.println("Que quiere hacer? "
                + "1- Agregar productos"
                + "2- salir"
                + "3- mostrar de nuevo productos");
        entrada = scanner.nextInt();
        
        switch (entrada){
            case 1:
                
        }
    }
  
}
