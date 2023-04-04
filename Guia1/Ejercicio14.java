//Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
package ejemplo1;

import java.util.Scanner;

public class Ejercicio14 {
     public static void main (String[] args){
         Scanner leer = new Scanner(System.in);
      
         System.out.println("Ingrese cantidad de compañeros");
         int comp = leer.nextInt();
         String[] Equipo = new String[comp]; 
         
         for (int i = 0; i < comp; i++) {
             System.out.println("Ingrese nombre del compañero");
             Equipo[i] = leer.next();
         }
         
         System.out.println("");
         System.out.println("Los compañeros de mi equipo son los siguientes: ");
         
        for (int i = 0; i < comp; i++) {          
             System.out.println(Equipo[i]);
         }
     }
}