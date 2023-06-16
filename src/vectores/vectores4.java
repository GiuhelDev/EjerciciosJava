
package vectores;

import java.util.Scanner;

public class vectores4 {
    
    public static void main(String[] args){
        //vectores -> matrices
        int [] notas;
        int cursos;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Cuantos Cursos Tienes?");
        cursos=entrada.nextInt();
        
        notas=new int[cursos];
        
        for(int i=0;i<cursos;i++){
            System.out.println("Ingrese nota del curso #"+i);
            notas[i]=entrada.nextInt();
        }
        System.out.println("--------------------------");
        for(int i=0;i<cursos;i++){
            System.out.print("["+notas[i]+"]");
        }
    }
}
