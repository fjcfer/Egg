//Define variables donde puedas alojar los resultados
//y prueba usar dos operadores de cada tipo.
package ejemplo1;

public class Ejemplo3 {
    
   public static void main(String[] args) { 
      int num1 = 15;
      int num2 = 7;
      System.out.println("El número primero es: " + num1);
      int suma = num1 + num2;
      System.out.println("La suma de los números es: " + suma);
      double division =  (double) num1 /(double) num2;
      System.out.println("La división de los números es: " + division);
      int multi = num1 * num2;
      System.out.println("La multiplicación de los números es: " + multi);
      boolean bandera = num1 > num2;
      System.out.println("La comparación de los números es: " + bandera);
      num1++;
      System.out.println("El primer número aumentado es: " + num1);
      
   }
}
