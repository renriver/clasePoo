
package Escuela;

/**
 *
 * @author Rivera
 */
public class Estudiante {
  private String nombre_est;
  private  String apellido;
  public int edad;
  private double promedio;

    public Estudiante() {
    this.nombre_est="";
    this.apellido="";
    this.edad=0;
    this.promedio=0.0;
    }
  
    public Estudiante(String nombre_est, String apellido, 
            int edad, double promedio) 
    {
        this.nombre_est = nombre_est;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
    }
//validar el nombre vacio
public boolean validarNombre()
{
 if(nombre_est.equals("")){
   return false;
 }
 return true;
}    
//si tiene promedio 9> becado
public String validarPromedio()
{
   if(promedio>9 && validarNombre())
   {
       return "becado";
   }
   return "no becado";
}

  
}
