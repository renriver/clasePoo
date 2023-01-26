
package Semana2;
import java.util.*;
/**
 *area=(base x altura)/2
 * 
 */
public class Triangulo {
    Scanner leer=new Scanner(System.in);
    public double area,altura, base;
    public Triangulo(){}
    //captura de datos
    public void Datos()
    {
        System.out.println(" Ingrese la altura");
        altura=leer.nextDouble();
        System.out.println(" Ingresa la base");
        base=leer.nextDouble();
        Triangulo t =new Triangulo();
        t.calcularArea(base,altura);
    }
    public void calcularArea(double base, double altura)
    {
        
        area=(base*altura)/2;
        System.out.println(" "+area);
    }
}
