
package Resumen;

public class Ejecutar {
    public static void main(String[] args) {
      Animal animal1 =new Animal("perro", 20, 6, 50, "blanco");
      Ave ave1= new Ave(5, true, "Aguila", 3.2, 10, 0.35, "Blanco");
      Mamifero mamifero1 = new Mamifero (7, true, "vaca", 45.5, 4.5, 2.1, "negro");
      animal1.aLimentarse();
      ave1.aLimentarse();
      mamifero1.aLimentarse();
        System.out.println(animal1.informacionanimal());
}
}   
    
