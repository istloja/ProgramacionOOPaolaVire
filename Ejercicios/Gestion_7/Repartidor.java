/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Gestion_7;

public class Repartidor extends Empleado {
 private int Zona;

    public int getZona() {
        return Zona;
    }

    public void setZona(int Zona) {
        this.Zona = Zona;
    }

    public static int getPlus() {
        return Plus;
    }

    public static void setPlus(int Plus) {
        Empleado.Plus = Plus;
    }
 
public boolean plusR (int edad,int Zona){
  
    if (edad < 25 && Zona == 3)  {
    return true;
    
    }
    
    else {
    return false;
    }
    

} 
 
 
}
