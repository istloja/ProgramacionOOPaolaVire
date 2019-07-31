
package Ejercicios;

public class Cuenta_1 {
   
private String nombre_cliente;   
private String número_cuenta;
private double Interés;
private double Saldo;

    public Cuenta_1(String nombre_cliente, String número_cuenta, double Interés, double Saldo) {
        this.nombre_cliente = nombre_cliente;
        this.número_cuenta = número_cuenta;
        this.Interés = Interés;
        this.Saldo = Saldo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getNúmero_cuenta() {
        return número_cuenta;
    }

    public void setNúmero_cuenta(String número_cuenta) {
        this.número_cuenta = número_cuenta;
    }

    public double getInterés() {
        return Interés;
    }

    public void setInterés(double Interés) {
        this.Interés = Interés;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    
public boolean ingreso (double Numero_cuenta, double Saldo, double cantidad_ingreso){
    Saldo = Saldo + cantidad_ingreso;
    if (Saldo <= 0){
    return false;}
    else {
    return true;
    }
}

public boolean reintegro (double Numero_cuenta, double Saldo, double Reintegro){
   if (Reintegro > Saldo){
   return false;}
   else {
   Saldo = Saldo - Reintegro;
   return true;
   }
   
}
}
