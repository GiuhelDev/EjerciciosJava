package vistas.vectores;
public class Arreglos1 {
    
    public static void main(String[] args){
        
        String nombres[]={"Pablo","Pedro","Ana"
        ,"Luis","Arturo","Jose","Andre"};
        
        for(int i=0;i<nombres.length;i++){
            if(nombres[i].charAt(0)=='A'){
                System.out.println(nombres[i]);
            }
        }
    }
}
