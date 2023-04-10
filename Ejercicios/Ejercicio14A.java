/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

import java.util.Scanner;

public class Ejercicio14A {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
    
    System.out.println("Ingrese Euros");
    double euros =  leer.nextDouble();
    System.out.println("Ingrese moneda a la cual quiere convertir los euros");
    System.out.println("DOLARES");
    System.out.println("YENES");
    System.out.println("LIBRAS");
    
    String moneda = leer.next();
    
     conversion(euros,moneda);
       
}
    public static void  conversion(double euros, String moneda){ 
       
    switch (moneda.toUpperCase()){
        case ("DOLARES"):
            System.out.println("La cotización es: " + (euros * 1.28611) + " dolares");    
            break;
        case ("YENES"):
            System.out.println("La cotización es: " + (euros * 129.852) + " yenes");
            break;
        case ("LIBRAS"):
            System.out.println("La cotización es: " + (euros * 0.86) + " libras");
            break;
    }            
} 
}