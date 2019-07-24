
package calcular;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejecutar {

    public Ejecutar() {
    }
 


    

public static void main(String[] args) {
    Scanner dato = new Scanner (System.in);
    Ejecutar objeto = new Ejecutar (); 
    int calculo = 0;
    double radianes=0,grados = 0;
        JOptionPane.showInputDialog("Ingrese el numero segun la operacion a calcular\n"
                                   +"1.Seno\n"
                                   +"2.Coseno\n"
                                   +"3.Tangente");
         calculo = dato.nextInt();                            
       
        switch (calculo){
            case 1 :
         System.out.println("Ingrese los grados"); 
        grados = dato.nextDouble();
        radianes = Math.toRadians(grados);
        double seno= Math.sin(radianes);
                System.out.println("El resultado es: "+seno);
            break; 
        case 2 :
         System.out.println("Ingrese los grados"); 
          grados = dato.nextDouble();
        radianes = Math.toRadians(grados);
        double coseno= Math.cos(radianes);
            System.out.println("El resultado es: "+coseno);
            break; 
            case 3 :
         System.out.println("Ingrese los grados"); 
           grados = dato.nextDouble();
        radianes = Math.toRadians(grados);
        double tang= Math.tan(radianes);
                System.out.println("El resultado es: "+tang);    
        break; 
        
        
        }
}
}

