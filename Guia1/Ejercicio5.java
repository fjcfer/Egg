/*
Define una variable de tipo boolean, double y char. 
Guarda información en ellas a través del Scanner.
*/

package ejemplo1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Ingrese si es verdadero o falso");
      boolean bandera = leer.nextBoolean();
      System.out.println("Ingrese un caracter");
      char x = leer.next().charAt(0);
      System.out.println("Ingrese un número decimal");
      double num = leer.nextDouble();
      int num2 = leer.nextInt();
           
    }
}
