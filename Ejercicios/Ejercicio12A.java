/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
import java.util.Scanner;
public class Ejercicio12A {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);  
                
      System.out.print("Ingrese cadena ");
      System.out.print("(tienen que tener como máximo 5 caracteres y ");
      System.out.println("el primer carácter tiene que ser  X y el último tiene que ser una O.");
      String cadena = leer.nextLine();
      int correctas = 0;
      int incorrectas  = 0;
      String FDE = "&&&&&";
      while (!cadena.equals(FDE)){
          if (cadena.substring(0,1).equalsIgnoreCase("X") && cadena.length()==5 && cadena.substring(4, 5).equalsIgnoreCase("O") ){
              correctas++; // correctas = correctas + 1
          } else {
              incorrectas++;
          }
          System.out.println("Ingrese una cadena correcta");
          cadena = leer.nextLine();
      }
      System.out.println("Palabras correctas: " + correctas); 
      System.out.println("Palabras incorrectas: " + incorrectas);
  }  
}
