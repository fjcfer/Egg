/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package ejemplo1;

import java.util.Scanner;

public class Ejercicio11 {
     public static void main (String[] args){
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese frase o palabra a convertir");
         String frase = leer.next();
         
         System.out.println(palabras(frase));
     }
    public static String palabras (String frase){

      String fraseAux = "                                        " ;
     
        for (int i = 0; i < frase.length(); i++){   
          switch (frase.substring(i, i++)) {  
          case "a":
             fraseAux = "@";
              break;
          case "e":
             fraseAux = "#";
              break;
          case "i":
             fraseAux = "$";   
              break;
          case "o":
             fraseAux = "%";
              break;
          case "u":
             fraseAux = "*";
             break;
          default: 
              fraseAux =  frase.substring(i, i++) ;
             break;  }

          return fraseAux;

}
    } 
//frase = frase.replaceAll("a","@");

