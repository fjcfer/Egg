/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
import java.util.Scanner;

public class Ejercicio10A {
    
    public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un valor limite positivo: ");
		
		int num = leer.nextInt();
		int num2;
		int suma = 0;
		while (num > suma) {
			System.out.println("Ingrese un valor: ");
			num2 = leer.nextInt();
			suma = suma + num2;		
		}
		
		System.out.println("El valor total de la suma de los valores ingresados es: " + suma + ". siendo el limite " + num);

	}

}

