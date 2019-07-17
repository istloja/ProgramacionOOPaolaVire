
package Resumen;


public class Ave extends Animal{
private int numerohuevos;
private boolean vuela;

    public Ave(int numerohuevos, boolean vuela, String Nombre, double peso, double edad, double tamaño, String color) {
        super(Nombre, peso, edad, tamaño, color);
        this.numerohuevos = numerohuevos;
        this.vuela = vuela;
    }

    
    public int getNumerohuevos() {
        return numerohuevos;
    }

    public void setNumerohuevos(int numerohuevos) {
        this.numerohuevos = numerohuevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

  

   
}
