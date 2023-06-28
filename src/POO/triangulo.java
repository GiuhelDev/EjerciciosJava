
package POO;
public class triangulo {
    
    private String nombre;
    private double base;
    private double altura;

    public triangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

 //calculo de area
    public double area(){
        return this.getBase()*this.getAltura()/2;
    }
    //par imprimir resultado
    public String resultado(){
        return this.getNombre()+" tiene de base: \n"+
                    this.getBase()+" y de altura: "+this.getAltura()+" \n"+
                "su Area es: "+this.area();
    }
    public void imprimir(){
        System.out.println(resultado());
    }
}
