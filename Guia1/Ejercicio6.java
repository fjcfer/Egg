/*
Implementar un programa que le pida dos números enteros al usuario
y determine si ambos o alguno de ellos es mayor a 25.
 */
package ejemplo1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese dos números");
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    
    if (num1 > 25 && num2 > 25){
        System.out.println("Ambos números son mayores a 25 ");
    } else if(num1 > 25 || num2 > 25){
        System.out.println("Al menos un número es mayor a 25");
    }else {
        System.out.println("Ningún número es mayor a 25");
    }
    
    }
}
