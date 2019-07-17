
package Resumen;

import java.util.Date;

public class Mamifero extends Animal {
private int tiempogestacion;
private boolean sangrecaliete;

    public Mamifero(int tiempogestacion, boolean sangrecaliete, String Nombre, double peso, double edad, double tamaño, String color) {
        super(Nombre, peso, edad, tamaño, color);
        this.tiempogestacion = tiempogestacion;
        this.sangrecaliete = sangrecaliete;
    }

    public int getTiempogestacion() {
        return tiempogestacion;
    }

    public void setTiempogestacion(int tiempogestacion) {
        this.tiempogestacion = tiempogestacion;
    }

    public boolean isSangrecaliete() {
        return sangrecaliete;
    }

    public void setSangrecaliete(boolean sangrecaliete) {
        this.sangrecaliete = sangrecaliete;
    }

    

    

}
