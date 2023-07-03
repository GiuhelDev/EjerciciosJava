
package POO;
public class claseCalifiaciones {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public claseCalifiaciones(String nombre, double nota1, 
            double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    
    //metodos calculo
    public double Promedio(){
        double promedio;
        promedio=(this.getNota1()+this.getNota2()+
                this.getNota3())/3;
        return promedio;
    }
    
    public String Estado(){
        String estado;
        if(this.Promedio()>14){
            estado="Aprobado";
        }else{
            estado="Desaprobado";
        }
        return estado;
    }
    
    public String resultado(){
        return "El alunmo: "+this.getNombre()+"\n"
                +"Obtuvo el promedio de: "+
                this.Promedio()+"\n"+
                "Estado: "+this.Estado();
    }
}
