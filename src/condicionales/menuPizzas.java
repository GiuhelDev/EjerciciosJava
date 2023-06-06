
package condicionales;

import java.util.Scanner;

public class menuPizzas {
     public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        double total,precio = 0;
        int cantidad,opcion;
        String nombre,tipo = null;
        
        System.out.println("Ingrese su nombre: ");
        nombre=entrada.nextLine();
        System.out.println("-------------------------");
        System.out.println("Seleccione la pizza: ");
        System.out.println("1. Pequeña");
        System.out.println("2. Mediana");
        System.out.println("3. Familiar");
        opcion=entrada.nextInt();
        System.out.println("-------------------------");
        System.out.println("Cuantas Pizzas Desea?");
        cantidad=entrada.nextInt();
        System.out.println("-------------------------");
        switch (opcion){
            case 1:
                tipo="Pequeña";
                precio=20;
                break;
            case 2:
                tipo="Mediana";
                precio=35;
                break;
            case 3:
                tipo="Familiar";
                precio=50;
                break;
            default:    
        }
        total=cantidad*precio;
        
        System.out.println("Cliente: "+nombre);
        System.out.println("Tipo Pizza: "+tipo);
        System.out.println("Costo: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Total pagar: "+total);
    }
}
