/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
import java.util.Scanner;

public class Ejercicio13AB {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
      System.out.println("Ingrese número del cuadrado");
      int lado = leer.nextInt();
      System.out.println("");
      
      for (int i = 0; i < lado; i++) {
          for (int j = 0; j < lado; j++) {
              if (i==0 || i==lado-1 || j==0 || j==lado-1){
                  System.out.print("* ");
              }else{
                  System.out.print("  ");
              }
          }
          System.out.println("");
      }
  }
}