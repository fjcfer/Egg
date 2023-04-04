/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
import java.util.Scanner;

public class Ejercicio3A {
     public static void main (String[] args){
         Scanner leer = new Scanner(System.in);  
         
         System.out.println("Ingrese una frase o una palabra");
         String frase = leer.nextLine();
         
         System.out.println("La frase ingresada en mayusculas es: " + frase.toUpperCase());
         
         System.out.println("La frase ingresada en minusculas es: " + frase.toLowerCase());
         
                
}
}