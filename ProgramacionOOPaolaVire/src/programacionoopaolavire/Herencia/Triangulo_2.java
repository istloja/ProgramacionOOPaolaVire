
package programacionoopaolavire.Herencia;

public class Triangulo_2 extends DosDimensiones_2{
  private String estilo;
    //Constructor
    Triangulo_2(String s, double b, double h){
        setBase(b);
        setAltura(h);
        estilo=s;
    }
    double area(){
        return getBase()*getAltura()/2;
    }
    void mostrarEstilo(){
        System.out.println("Triangulo es: "+estilo);
    }
}
class Lado3{
    public static void main(String[] args) {
        Triangulo_2 t1=new Triangulo_2("Estilo 1",4.0,4.0);
        Triangulo_2 t2=new Triangulo_2("Estilo 2",8.0,12.0);
        System.out.println("Información para T1: ");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("Su área es: "+t1.area());
        System.out.println();
        System.out.println("Información para T2: ");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        System.out.println("Su área es: "+t2.area());
    }   
}
