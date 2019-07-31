
package Ejercicios;

import java.util.GregorianCalendar;


public class Fecha_4 {
private int dia;
private int mes;
private int año;

    public Fecha_4() {
    }

    public Fecha_4(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

public boolean fechacorrecta(int dia, int mes , int año) {
if ((dia >30)&& (mes>12) && (año >2019) ) {
return false;
}   
else {
return true;
}
}
 public void fechasiguiente (int dia, int mes, int año){
dia = dia+1; 
if (dia >30){
dia = 1;
   if (mes>12){
   mes = 1;
   }
     if (año >2019){
     año= 2019;
     }
}
     System.out.println("El dia siguiente es: "+dia+mes+año);

}
public static boolean esBisiesto (int año){
GregorianCalendar bisiesto = new GregorianCalendar();
return bisiesto.isLeapYear(año);
}

}
