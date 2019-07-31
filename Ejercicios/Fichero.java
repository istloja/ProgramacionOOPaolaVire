package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Fichero {

    public static void main(String[] args) throws IOException {
       
        File texto = new File("C:\\Users\\Usuario\\Desktop\\tarea.txt");
//        try{
        //System.out.println(texto.exists());
        FileReader archivo = new FileReader(texto);
    PrintWriter hola = new PrintWriter(texto);
    //} catch (Exception e){
//            System.out.println("El error es: "+e);
//        }
        String linea = " ";
        linea =linea.replace(" ", "");
        archivo.close();
        hola.println(linea);
        
        
    }
    
    
    
}
