package LinkedList;

import java.util.LinkedList;

/**
 * @author HELIO
 */
public class LinkedList1 {
    public static void main(String[] args){
        
        LinkedList<Integer>numeros=new LinkedList<>();
        
        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        
        int suma=0;
        
        for(int i=0;i<numeros.size();i++){
            suma=suma+numeros.get(i);
        }
        System.out.println("La suma es: "+suma);
        System.out.println("La el promedio es: "+(suma/numeros.size()));
    }
}
