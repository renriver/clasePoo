
package test;

/**
 *
 * @author Rivera
 */
public class Constructor2 {
  public Constructor2(){} 
  //encapsulados
  //setter y getter
  public int entero;
  //metodo set
  public void setEntero(int x)
  {
    entero=x;
  }
  //metodo get
  public int getEntero()
  {
   return entero;
  }
  public static void main(String a[])
  {
    Constructor2 objc= new Constructor2();
    objc.setEntero(23);
      System.out.println(" "+objc.getEntero());
    
  }
}
