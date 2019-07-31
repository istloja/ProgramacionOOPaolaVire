package Ejercicios;

import static java.lang.System.out;
import java.util.Scanner;

public class Ejecutable_2 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Persona_2 objeto1 = new Persona_2();
        System.out.println("Ingrese su nombre");
        objeto1.getNombre();
        String nombre = dato.nextLine();
        System.out.println("Ingrese su edad");
        int edad = dato.nextInt();
         System.out.println("Ingrese su altura");
        double altura = dato.nextDouble();
        
        System.out.println("Ingrese su sexo");
        String sexo = dato.nextLine();
        
        System.out.println("Ingrese su cedula");
        int DNI = dato.nextInt();
        
        System.out.println("Ingrese su peso");
        double peso = dato.nextDouble();
       
        System.out.println("Es mayor de edad: "+objeto1.esMayorDeEdad(edad));
        System.out.println("Condicion de peso: "+objeto1.CalcularIMC(peso, altura));

        Persona_2 objeto2 = new Persona_2(nombre, edad, sexo);
        System.out.println("Ingrese su nombre");
        nombre = dato.nextLine();
        System.out.println("Ingrese la edad");
        edad = dato.nextInt();
        System.out.println("Ingrese su sexo");
        sexo = dato.nextLine();
        
        System.out.println(objeto2.esMayorDeEdad(objeto2.getEdad()));
        System.out.println(objeto2.CalcularIMC(objeto2.getPeso(), objeto2.getAltura()));
        Persona_2 objeto3 = new Persona_2();
        System.out.println("Ingrese su nombre");
        objeto3.setNombre(dato.nextLine());
        //objeto3.setNombre(dato.nextLine());
        System.out.println("Ingrese la edad");
        objeto3.setEdad(dato.nextInt());
        System.out.println("Ingrese su cedula");
        objeto3.setDNI(dato.nextInt());
        System.out.println("Ingrese su sexo");
        objeto3.setSexo(dato.nextLine());
        
        System.out.println("Ingrese su peso");
        objeto3.setPeso(dato.nextDouble());
        System.out.println("Ingrese su altura");
        objeto3.setAltura(dato.nextDouble());
        System.out.println(objeto3.esMayorDeEdad(objeto3.getEdad()));
        System.out.println(objeto3.CalcularIMC(objeto3.getPeso(), objeto3.getAltura()));
    }

}
