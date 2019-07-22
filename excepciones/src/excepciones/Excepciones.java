
package excepciones;

import java.util.Scanner;

public class Excepciones {

   public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
         Scanner dato1 = new Scanner(System.in);
        int numero = 0, resultado = 0;
        System.out.println("Ingrese un numero");
        // proteger que la aplicacion no se cierre apesar de un error
        try {
            numero = dato.nextInt();
            // (Exception e) e es una variable y nos muestra el error
        } catch (Exception e) {
            System.out.println("Se ha generado la excepcion "+e);
        //finally ejecuta la accion que debio haberse realizado
       }
 //           finally{
//            System.out.println("Ingrese el numero nuevamente");
//            numero = dato1.nextInt();
//        }
        System.out.println("El numero ingresado es: " + numero);
        try {
        resultado = numero / 0; 
        } catch (Exception e){
            System.out.println("No se puede dividir para 0");
        }
       
        System.out.println("El resultado es: " + resultado);
    }
    
}
