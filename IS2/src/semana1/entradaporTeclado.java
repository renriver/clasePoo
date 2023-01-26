
package semana1;

/**
 *
 * @author Rivera
 * utils Scanner
 */
import java.util.*;
public class entradaporTeclado {
    Scanner teclado=new Scanner(System.in);
    
    public void datosPersonales()
    {
      
      String nombre;
      int edad;
      char genero;
             
      System.out.println(" Ingrese tu nombre");
        nombre=teclado.nextLine();
      System.out.println(" Ingrese tu edad");
        edad=teclado.nextInt();
      System.out.println(" Ingrese tu genero");
        genero=teclado.next().charAt(0);
        
        System.out.println(nombre+"\n"+edad+"\n"+genero);
    }
    
    
}
