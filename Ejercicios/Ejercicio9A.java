/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
equals(String str)
Sirve para comparar si dos cadenas son
iguales. Devuelve true si son iguales y
false si no.
substring(int beginIndex)Retorna la sub cadena desde el carácter del parámetro
substring(int beginIndex, int endIndex)Retorna la sub cadena desde el carácter
del primer parámetro hasta el carácter
del segundo parámetro
 */
import java.util.Scanner ;
/*
public class Ejercicio9A {
    public static void main (String [] args){
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.next();
        char x = 'A';
        
        if (frase.substring() = x){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INICORRECTO");
        } 
          
}
}
*/
public class Ejercicio9A {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca una frase o palabra que comience con una A");
                String frase = leer.nextLine();
		
		if (frase.substring(0, 1).equals("A")) {
			System.out.println("CORRECTO");
		} else if ((frase.substring(0, 1)).equals("a")) {
			System.out.println("CORRECTO pero tenia que ser en mayuscula compiiii");
		} else {
			System.out.println("INCORRECTO");
		}
		
	}
	
}