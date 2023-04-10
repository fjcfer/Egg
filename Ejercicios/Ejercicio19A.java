/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
import java.util.Scanner;
import java.util.Random;

public class Ejercicio19A {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
    Random rnd = new Random();
    int[][] matriz = new int [3][3];
    int[][] matriz2 = new int [3][3];
        
    for (int i = 0; i < 3; i++)  {
        for (int j = 0; j < 3; j++) {
            matriz[i][j] = rnd.nextInt(9-(-9)+1)+(-9);  //rnd.nextInt(HASTA-DESDE+1)+DESDE;
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println(" ");
    }
    System.out.println(" ");
				
    for (int i = 0; i < 3; i++)  {
        for (int j = 0; j < 3; j++) {
            matriz2[i][j] = matriz[j][i];
            System.out.print(matriz2[i][j] + " ");
        }
         System.out.println(" ");
    }
        System.out.println("");
            
    boolean comparacion = true;    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if(matriz[i][j] != -matriz[j][i]){
                comparacion = false;
            }             
        }       
    }
    if (comparacion){
        System.out.println("La matriz es antisimétrica");
    }else{
        System.out.println("La matriz no es antisimétrica");
    }
    
    }	
}
/*

*/