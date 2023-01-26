
package modificador;

import modificadoAcceso.modifProtected;

public class principalModificador {
    public static void main(String a[])
    {
//    claseA obj=new claseA("Luis",20);
//        System.out.println(""+obj.getNombre());
//        System.out.println(""+obj.getValor());
        modifProtected obj1=new modifProtected();
        obj1.setPrivada("private");
         System.out.println(" "+obj1.getPrivada());
        obj1.setPublico("publico");
        System.out.println(" "+obj1.getPublico());
        obj1.setProtegido("protegido");
        System.out.println(" "+obj1.getProtegido());
    }
}
