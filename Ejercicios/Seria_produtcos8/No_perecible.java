
package Ejercicios.Seria_produtcos8;

public class No_perecible extends Producto {
    private String tipo;

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "No_perecible{" + "tipo=" + tipo + '}';
    }
 public double calcularNP(int cantidad,double precio){
 precio = precio*cantidad;
 return precio;        
 }   
    
    
    
}
