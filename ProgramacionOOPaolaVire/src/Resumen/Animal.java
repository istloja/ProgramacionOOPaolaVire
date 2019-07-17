
package Resumen;

public class Animal {
private String Nombre;
private double peso;
private double edad;
private double tamaño;
private String color;

    public Animal(String Nombre, double peso, double edad, double tamaño, String color) {
        this.Nombre = Nombre;
        this.peso = peso;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public void aLimentarse (){
        System.out.println("Soy "+Nombre+" y me alimento");   
    }
    public String informacionanimal (){
    
    String cadena = "Soy "+Nombre+"mi peso es: "+peso+"y mi color es: "+color+"";
    return cadena;
   
       
    }
}   
    
    
