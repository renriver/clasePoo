/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rivera
 */
public class Prueba {
    //declaracion de las variables
    //sintaxis tipoDato nombreVariable[= asignacion];
    //enteros, reales, cadenas, caracteres, boolean
    int valor1=2;
    int valor2=3;
    int resultado=0;
    //metodo especial en java main
    //sintaxis en los metodos es
    //tipoRetorno nombreMetodo([arg1],[arg2]... [argN]){}
    //constructor
    public Prueba(){}
    //metodo suma
    public void Suma(){
    resultado=valor1+valor2;
    
    }
    //metodo principal main
    public static void main(String args[])
    {
         //int resultado=0;
        //salida datos en java 
        System.out.println("Cadena salida");
         //operacion
         //crear el objeto
         Prueba obj=new Prueba();
         obj.Suma();
         
    }//fin de metodo main
}
