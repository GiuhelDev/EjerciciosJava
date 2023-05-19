package vectores;
import java.util.Scanner;
public class vectores1 {
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        int [] numero=new int[5];
        
        System.out.println("Ingrese 5 numero: ");
        
        for(int i=0;i<5;i++){
            numero[i]=entrada.nextInt();
        }
        for(int i=0;i<5;i++){
            if(numero[i]%2==0){
                System.out.println(numero[i]+" es Par");
            }else{
                 System.out.println(numero[i]+" es inPar");
            }
        }
    }
}
