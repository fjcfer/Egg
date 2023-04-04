/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
equals(String str)
Sirve para comparar si dos cadenas son
iguales. Devuelve true si son iguales y
false si no.
 */
import java.util.Scanner;

public class Ejercicio7A {
      public static void main (String[] args){
         Scanner leer = new Scanner(System.in); 
         
         String clave = "eureka";
          System.out.println("Ingrese la clave");
         String palabra = leer.next();
        if (palabra.equals(clave)) {
          System.out.println("Correcto");
      } else {
              System.out.println("Incorrecto");
              }                
}
}