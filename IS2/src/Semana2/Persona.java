package Semana2;
import java.util.*;
/*
Persona 
atributos
String nombre
entero edad
*/
public class Persona {
    Scanner leer=new Scanner (System.in);
    //crear un objeto de tipo Persona
    public String nombre;
    public int edad;
    //constructor
    public Persona(){}
    public void capaturaDatos()
    {
        System.out.println("Ingresa tu nombre");
        nombre=leer.nextLine();
        System.out.println("ingresa tu edad");
        edad=leer.nextInt();
        Persona objp = new Persona(); 
        objp.Imprimir(nombre,edad);
    }
    //imprimir los valore de los atributos
    public  void Imprimir(String nomb, int edad)
    {
        System.out.println("Los dato generados son\n"
                +nomb+" "+edad);
    }
}
