/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un número a buscar en el vector. El programa mostrará donde se encuentra el
número y si se encuentra repetido
*/
import java.util.Scanner;

public class Ejercicio16A {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
 
    System.out.println("Ingrese tamaño del vector");
    int n = leer.nextInt();
    
    int vector[] = new int[n];
    for (int i = 0; i < n; i++) {
    vector[i] = (int)(Math.random()*10+1); 
        System.out.println(vector[i]);
        }
    
    System.out.println("Ingrese número a buscar");
    int num = leer.nextInt();
    
        for (int i = 0; i < n; i++) {
           if ( vector[i] == num ) {
               System.out.println("El número ingresado se encuentra en la posición: " + i );        
        }                  
        }
        System.out.println("");
    }
}