
package Ejercicios;

import java.util.Scanner;

public class Fracciones_3 {
private int num  ;
private int den;

    public Fracciones_3() {
    }

    public Fracciones_3(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    public void mostrar (){
        System.out.println("La fraccion es: "+num+"/"+den);
   
    }
    public static void main(String[] args) {
    Scanner dato = new Scanner(System.in);
    Fracciones_3 objeto= new Fracciones_3();
        System.out.println("Ingrese el numerador");
        objeto.setNum(dato.nextInt());
    System.out.println("Ingrese el denominador");
        objeto.setDen(dato.nextInt());
       objeto.mostrar();
     
    }

   












}
