package tareaarchivos;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TareaArchivos {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato1 = new Scanner(System.in);
        TareaArchivos objeto = new TareaArchivos();
        int opcion = 0;
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Presione un numero\n\n"
                    + "1)Mostrar los archivos que hay en el Escritorio\n"
                    + "2)Mostrar los archivos que hay en Documentos\n"
                    + "3)Mostrar los archivos que hay en Imagenes\n"
                    + "4)Mostrar los archivos que hay en Videos\n"
                    + "5)Mostrar los archivos que hay en Musica\n"));
            if (opcion <= 0) {
                System.out.println("Ingrese un numero mayor a 0");
            }
        } catch (Exception e) {
            System.out.println("Se ha generado la excepcion " + e);
        } finally {
            System.out.println("Ingrese el numero nuevamente");
            opcion = dato1.nextInt();
        }

        switch (opcion) {
            case 1:
                File carpeta = new File("C:\\Users\\Usuario\\Desktop");
                String[] archivos = carpeta.list();
                for (int i = 0; i < archivos.length; i++) {
                    System.out.println(archivos[i]);
                }
                break;
            case 2:
                File carpeta1 = new File("C:\\Users\\Usuario\\Documents");
                String[] archivos1 = carpeta1.list();
                for (int i = 0; i < archivos1.length; i++) {
                    System.out.println(archivos1[i]);
                }
                break;
            case 3:
                File carpeta2 = new File("C:\\Users\\Usuario\\Pictures");
                String[] archivos3 = carpeta2.list();
                for (int i = 0; i < archivos3.length; i++) {
                    System.out.println(archivos3[i]);
                }
                break;
            case 4:
                File carpeta3 = new File("C:\\Users\\Public\\Videos");
                String[] archivos4 = carpeta3.list();
                for (int i = 0; i < archivos4.length; i++) {
                    System.out.println(archivos4[i]);
                }
                break;
            case 5:
                File carpeta4 = new File("C:\\Users\\Usuario\\Music");
                String[] archivos5 = carpeta4.list();
                for (int i = 0; i < archivos5.length; i++) {
                    System.out.println(archivos5[i]);
                }
                break;
            default:
                System.out.println("Por favor ingrese un numero del 1 al 5");
        }
    }
}

