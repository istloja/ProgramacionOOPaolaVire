
package programacionoopaolavire.Herencia;

public class DosDimensiones_2 {
 private double base;
    private double altura;
    //Métodos de acceso para base y altura
    double getBase(){return base;}
    double getAltura(){return altura;}
    void setBase(double b){base=b;}
    void setAltura (double h){altura=h;}
    void mostrarDimension(){
        System.out.println("La base y altura es: "+base+" y "+altura);
    }   
}
