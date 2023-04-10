/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.(Hasta el 99)
*/

public class Ejercicio15A {
     public static void main (String[] args){
       
    int vector [] = new int[100];
    
    for (int i = 0; i < 100; i++) {
        vector[i] = i;
     }
    
     for (int i = 100-1; i >= 0; i--) {
         System.out.println(vector[i]);
         }
}     
}