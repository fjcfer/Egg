/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejemplo1;
import java.util.Scanner;
public class Ejercicio10 {
     public static void main (String[] args){
        Scanner leer = new Scanner(System.in);   
        
         for (int i = 0; i < 4; i++) {
             
             System.out.println("Ingrese un número entre 1 y 20");
             int num = leer.nextInt();
             
             System.out.print(num);
             System.out.print(" ");
             if (num>0 && num<21){
                 for (int j = 0; j < num; j++) {
                     System.out.print("*"); 
                 }                 
             }    
             System.out.println("");
         }
     }
}
