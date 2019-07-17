
package Resumen;

import java.util.Date;

public class fecha {
    public static void main(String[] args) {
    Date fecha = new Date(101,06,18);
    Date fechaactual =new Date (119,06,16);
        System.out.println(fecha.after(fechaactual));
        System.out.println(fecha.before(fechaactual));
        
    
    }

  
 
}
