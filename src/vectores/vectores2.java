package vectores;
import java.util.Scanner;
public class vectores2 {
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        int cant = 0;
        int suma = 0;
        
        System.out.println("Cuantos numeros quiere ingresar?");
        cant=entrada.nextInt();
        
        int [] numero=new int[cant];
        
        System.out.println("Ingrese los "+cant+" numeros:");
        for(int i=0;i<cant;i++){
            numero[i]=entrada.nextInt();
        }
        for(int i=0;i<cant;i++){
            suma=suma+numero[i];
        }
        System.out.println("la suma es: "+suma);
    }
}
