package semana1;
//importar el package
//import nombre_package.*;
import Utiles.Papeleria;
/**
 * Clase para accesar a los atributos de la clase B
 * @author Rivera
 */
public class claseA {
    public static void main(String a[])
    {
      //crear un objeto para accesar a los atributos o metodos de la clase B
//        claseB obj=new claseB();
//        obj.metodo1();
//        
//        obj.metodo2();
//        claseA objA=new claseA();
//        objA.Suma();
//        Papeleria objp=new Papeleria();
//        objp.Libros("Programacion",2020);
//        objp.Revista(2021);
        entradaporTeclado ept=new entradaporTeclado();
        ept.datosPersonales();
        
    }
    public void Suma()
    {
     int x=10,y=20;
     int resultado;
     resultado=x+y;
        System.out.println("La suma es "+resultado);
    }
}
