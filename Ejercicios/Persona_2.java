
package Ejercicios;

public class Persona_2 {

private String nombre;
private int edad ;
private int DNI;
private  String sexo;
private  double  peso;
private  double altura;

    public Persona_2() {
    }

    public Persona_2(String nombre, int edad, int DNI, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona_2(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
  
public int CalcularIMC(double peso, double altura){
    int sobrepeso = 1, menor= 0,normal = -1;
    if (peso> 300){
    peso = peso*2.2046;
      if(altura > 3){
    altura = altura / 100;    
      }
      }
    double peso_ideal= peso /(Math.pow(altura, 2)) ; 
    if (peso_ideal < 20){
    return normal;
    }
    else {
    if (peso_ideal >= 20 && peso_ideal <=25){
    return menor;
    }
    
    }
  
    if (peso_ideal > 25){
     return sobrepeso;  
    }
    return 0;
           
}

public boolean esMayorDeEdad(int edad){
if ( edad < 18){
return false;
}    
else {
return true;
}

}





}
