
package condicionales;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        
        double consumo,descuento,totalpagar;
        String porcentaje;
        
        System.out.println("Ingrese el monto de su consumo en compras");
        consumo=entrada.nextFloat();
        
        if(consumo>30){
            descuento=consumo*0.20;
            porcentaje="20%";
        }else{
            descuento=consumo*0.10;
            porcentaje="10%";
        }
        totalpagar=consumo-descuento;
        
        System.out.println("Consumo: "+consumo);
        System.out.println("Descuento: "+porcentaje+"  =  "+descuento);
        System.out.println("Total Pagar: "+totalpagar);
    }
}
