
package Ejercicios;

public class Libro_5 {
  
private long ISBM;
private String Titulo1;
private String Titulo2;
private String Autor;
private int Paginas;   
private int Paginas1;
//private String Mayor = "Es mayor";

    public long getISBM() {
        return ISBM;
    }

    public void setISBM(long ISBM) {
        this.ISBM = ISBM;
    }

    public int getPaginas1() {
        return Paginas1;
    }

    public void setPaginas1(int Paginas1) {
        this.Paginas1 = Paginas1;
    }

    public String getTitulo1() {
        return Titulo1;
    }

    public void setTitulo1(String Titulo1) {
        this.Titulo1 = Titulo1;
    }

    public String getTitulo2() {
        return Titulo2;
    }

    public void setTitulo2(String Titulo2) {
        this.Titulo2 = Titulo2;
    }

   

  
    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public String toString() {
        return "El libro con numero: " + ISBM +  ", creado por: " + Autor + ", tiene" + Paginas + " Spaginas";
    }

    
    
    
public String masp(int Paginas,int paginas1){
if (Paginas  > Paginas1  ){
return Titulo1;
    
}    
    else {
    return Titulo1;
    }   
}
    public static void main(String[] args) {
    Libro_5 objeto1 = new Libro_5();
    objeto1.setISBM(46788235);
    objeto1.setTitulo1("Lo que el viento se llevo");
    objeto1.setAutor("Margaret Mitchell");
    objeto1.setPaginas(345);
        System.out.println(objeto1.toString());
    Libro_5 objeto2 = new Libro_5();
    objeto2.setISBM(983633);
    objeto2.setTitulo2("El abogado del diablo");
    objeto2.setAutor("Caspian Woods");
    objeto2.setPaginas1(123);
        System.out.println(objeto2.toString());
        System.out.println("Tiene mas paginas"+objeto2.masp(objeto1.getPaginas(),objeto2.getPaginas1()));
        
    }
    
    
    
    
    
    
    
    
    
    
}
