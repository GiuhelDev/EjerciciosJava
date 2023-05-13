
package vistas;

import java.util.Scanner;

public class parOimpar {
    public static void main(String[] args){
        
        Scanner lectura = new Scanner (System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero=lectura.nextInt();
        
        if(numero!=0 && numero%2==0){
            System.out.println("el numero "+numero+" es par");
        }else if(numero!=0 && numero%2!=0){
            System.out.println("el numero "+numero+" es impar");
        }
    }
}
