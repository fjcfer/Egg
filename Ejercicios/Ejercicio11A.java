/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
import java.util.Scanner;

public class Ejercicio11A {
    
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese dos numeros enteros: ");

    int num = leer.nextInt();
    int num2 = leer.nextInt();

    System.out.println("}MENU");
    System.out.println("1 - Sumar");
    System.out.println("2 - Restar");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    System.out.println("5 - Salir");
    int opc;
		
        do {
            System.out.println("Elija una opción: ");
            opc = leer.nextInt();

            switch (opc){
                    case 1: 
                            System.out.println("Suma: " + num + " + " + num2 + " = " + (num+num2));
                            break;
                    case 2:
                            System.out.println("Resta: " + num + " - " + num2 + " = " + (num-num2));
                            break;
                    case 3:
                            System.out.println("Multiplicacion: " + num + " * " + num2 + " = " + (num*num2));
                            break;
                    case 4: 
                            System.out.println("Division: " + num + " / " + num2 + " = " + ((double)num/(double)num2));
                            break;
                    case 5:
                            System.out.println("¿Esta seguro que desea salir del programa (S/N)");
                            char opc2 = leer.next().charAt(0);
                            if (opc2 == 'N' || opc2 == 'n') {
                                    opc = 0;
                                    System.out.println("}MENU");
                                    System.out.println("1 - Sumar");
                                    System.out.println("2 - Restar");
                                    System.out.println("3 - Multiplicar");
                                    System.out.println("4 - Dividir");
                                    System.out.println("5 - Salir");
                                    continue;
                            } else if (opc2 == 'S' || opc2 == 's'){
                                    break;
                            }
                    default:
                            System.out.println("Opcion no valida");
                            break;
                }

        } while (opc != 5);
		
		System.out.println("Fin :D");
	}
		
}

