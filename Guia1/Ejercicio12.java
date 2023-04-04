/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer número es múltiplo del
segundo, sino informe que no lo son.
 */
package ejemplo1;

import java.util.Scanner;
public class Ejercicio12 {
      public static void main (String[] args){
         Scanner leer = new Scanner(System.in);
         
          System.out.print("Ingrese los números a comparar: ");
          int num1 = leer.nextInt();
          int num2 = leer.nextInt();
         
          EsMultiplo(num1, num2);
          
      }
      public static void  EsMultiplo(int num1,int num2){
          
          if (num1 % num2 == 0){
          System.out.println("El número " + num1 + " es multiplo de " + num2);
         } else {
              System.out.println("Los números no son multiplos");
              }
      }
      
}
