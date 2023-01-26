
package Semana2;

import java.util.Scanner;

/**
 *area=pi*radio^2
 * 
 * @author Rivera
 */
public class Circulo {
    Scanner leer=new Scanner(System.in);
    public double area,pi=3.1416,radio;
    public Circulo(){}
    //captura de datos
    public void Datos()
    {
        System.out.println(" Ingrese la altura");
        radio=leer.nextDouble();
        Circulo c =new Circulo();
        c.calcularArea(radio);
    }
    public void calcularArea(double b)
    {
        
        area=(pi*radio*radio);
        System.out.println(" "+area);
    }
}
