package test;

/**
 *los constructor son metodo de la clase y tienen que ser nombrados 
 * de mismo nombre de la clase
 * 
 * @author Rivera
 */
public class Costructor {
    public int valor2;
    public Costructor(int valor )
    {
    
         valor2=valor;
    }
    public static void main(String a[])
    {
     Costructor obj=new Costructor(5);
        System.out.println(obj.valor2);
    }
}
