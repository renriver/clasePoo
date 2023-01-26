
package test;

import java.util.Scanner;

/**
 *
 * @author Rivera
 */
public class test2 {
 public int valor;
Scanner leer=new Scanner(System.in);
public String cadena;
public int entero;
 public test2(String cadena, int entero)
 {
     //System.out.println(cadena+" "+entero);
     this.cadena=cadena;
     this.entero=entero;
 }
public void Metodo()
    {
      //ingresar el valor
        System.out.println(" Ingrese un valor entero");
        valor=leer.nextInt();
        System.out.println(""+valor);
    }
}
