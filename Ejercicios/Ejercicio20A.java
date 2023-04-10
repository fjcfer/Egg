/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/

import java.util.Scanner;

public class Ejercicio20A {
   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
   
    int[][] matriz = new int [3][3];
        
    llenarMatriz(matriz);
    comprobarMatriz(matriz);
    mostrarMatriz(matriz);
    esCuadradoMagico(matriz);
        
}
   //Función llenar matriz
    public static void llenarMatriz(int[][] matriz){
        Scanner leer = new Scanner(System.in); 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            matriz[i][j] = leer.nextInt();
            }                    
        }
    }
    //Función que verifica los números
     public static void comprobarMatriz(int[][] matriz){  
      
         boolean validacion = true;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                if(matriz[i][j]<1 || matriz[i][j]>9){
                   validacion = false ;
                }
             }
         }
          System.out.println("");
        if (!validacion){
            System.out.println("Los valores no cumplen los parametros");              
        }       
     }  
     
     //Función que muestra la muestra la matriz
                
    public static void mostrarMatriz(int[][] matriz){ 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
             System.out.println("");  
        }     
    }  
    
    //Función que comprueba la matriz mágica
    public static void esCuadradoMagico(int[][] matriz) {
        boolean validacion = true;
        int fila = 0;
        int colum = 0;
        int diagP = 0;
        int diagS = 0;
        int cont1 = 0;   
        int cont2 = 0; 
        int cont3 = 0; 
        int cont4 = 0; 
        int suma = matriz[0][0] + matriz[0][1] + matriz[0][2]; 
        
        for (int i = 0; i < 3; i++) {            
            for (int j = 0; j < 3; j++) {
                fila += matriz[i][j];
                cont1++;
                colum += matriz[j][i];
                cont2++;
                if(i==j){
                    diagP += matriz[i][j];
                    cont3++; 
                }else if(j==3-(i+1)){
                    diagS += matriz[i][j];
                    cont4++;
                }     
            }
            if (cont1 == 3){
               if (suma != fila){
                   validacion = false;
            }
            }
            else if (cont2 == 3){
                if (suma!= colum){
                    validacion = false;
                }
            }
            else if (cont3 == 3){
                if (suma != diagP){
                    validacion = false;
                } 
            }
            else if (cont4 == 3){
                if (suma != diagS){
                    validacion = false;
                }
            }       
        }
       if (validacion == true){
           System.out.println("Es cuadrado mágico");
       } else{
           System.out.println("No es cuadrado mágico");
       }
       
    }
    }

