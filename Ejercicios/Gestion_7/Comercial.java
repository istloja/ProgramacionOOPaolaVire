
package Ejercicios.Gestion_7;

public class Comercial extends Empleado {
private double comision;    

    public Comercial() {
    }

    public Comercial(double comision) {
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }





public double plusC (double Salario,int edad, double comision){
    Salario=comision + Salario;
    if (edad > 30 && comision >200)  {
    Salario = Salario+ Plus;
    return Salario;
    }
    
    else {
    return Salario;
    }
    

}

}
