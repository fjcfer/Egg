/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
import java.util.Scanner;
import java.util.Random;
public class Ejercicio17A {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in); 
    Random rnd = new Random();
    int cont1 = 0;
    int cont2 = 0; 
    int cont3 = 0; 
    int cont4 = 0; 
    int cont5 = 0;
    
    System.out.println("Ingrese tamaño del vector");
    int num = leer.nextInt();
    
    int vector[] = new int[num];
        
    for (int i = 0; i < num; i++) {
    vector[i] = rnd.nextInt((99999-0+1)+(0)); 
        System.out.print("["+vector[i]+"]");    
    }
        System.out.println("");
        for (int i = 0; i < num; i++) {
            if (vector[i]>= 0 && vector[i]<10){
                cont1+=1;
        }else if(vector[i]>=10  && vector[i]<100){
                cont2 += 1;                        
        }else if(vector[i]>=100  && vector[i]<1000){
                cont3 += 1;
        }else if(vector[i]>=1000  && vector[i]<10000){
                cont4 += 1;     
        }else{
                cont5 += 1;   
        }
       }
       System.out.println("Cantidad de numeros con un digito: " + cont1);
		System.out.println("Cantidad de numeros con dos digitos: " + cont2);
		System.out.println("Cantidad de numeros con tres digitos: " + cont3);	
		System.out.println("Cantidad de numeros con cuatro digitos: " + cont4);
		System.out.println("Cantidad de numeros con cinco digitos: " + cont5); 
    }
}
/*

    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in); 

    System.out.println("Ingrese tamaño del vector");
    int n = leer.nextInt();
    
    int[] vector = new int[n];
    int contador = 0;
    for (int i = 0; i < n; i++) {
    vector[i] = (int)(Math.random()*10000+1); 
        }
        for (int j = 1; j < 6; j++) {
           for (int i = 0; i < vector.length; i++) {
            if (String.valueOf(vector[i]).length() ==j ) {
                contador++;
            }        
        }System.out.println(" el vector  tiene " +contador+ " numeros de  " +j+ " digitos" );
        }
    }
    }
*/