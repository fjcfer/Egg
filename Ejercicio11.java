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
         
     }
   public static char palabras(frase);
   
      switch (frase){
        case 'a':
            = '@';
            break;
        case 'e':
            = '#';
            break;
        case 'i':
            = '$';   
            break;
        case 'o':
            = '%';
            break;
        case 'u':
            = '*';
        default: 
            System.out.println("No existe un valor válido para el tipo de bomba");
           break;  
     
     
}




