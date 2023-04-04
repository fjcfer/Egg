/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
import java.util.Scanner;

public class Ejercicio1A {
    public static void main (String[] args){
         Scanner leer = new Scanner(System.in); 
    System.out.println("Ingrese primer número a sumar");
            int num1 = leer.nextInt();
    System.out.println("Ingrese segundo número a sumar");        
            int num2 = leer.nextInt();
    int suma = num1 + num2;        
    System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);        
}
}