/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
import java.util.Scanner;

public class Ejercicio2A {
    public static void main (String[] args){
         Scanner leer = new Scanner(System.in); 
    
        System.out.println("Ingrese nombre");     
        String nombre = leer.next();
        
        System.out.println("Su nombre es " + nombre);
    }
}