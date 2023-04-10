/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
import java.util.Scanner;

public class Ejercicio13A {
     public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
    
         System.out.println("Ingrese número del cuadrado");
         int num = leer.nextInt();
            // Superior
             for (int i = 0; i < num; i++) {
                 System.out.print("* ");
             }
             System.out.println();
             // Centro
             for (int i = 0; i < num-2; i++) {
                 System.out.print("*");
                 for (int j = 0; j < num-2; j++) {
                     System.out.print("  ");
                 }
                 System.out.println(" * ");
             }
             // Inferior
             for (int i = 0; i < num; i++) {
                 System.out.print("* ");
             }
             System.out.println("");
         }   
}      
     
 