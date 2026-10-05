package ejercicio02Escondido;

import java.util.Scanner;

public class Ejercicio02Escondido {
	
	/* Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle 
	 * para que sea múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. 
	 * En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo.
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in); 
		
		
		// Pedimos numero al usuario
		
		System.out.println("Introduce un numero: ");
		Integer numero = sc.nextInt();
		
		// Operamos con el operador % y operador ternario
		
		Integer resto = numero %7; 
		
		Integer numeroASumar = (resto == 0) ? 0 : (7 - resto);
		
		// Mostramos resultado por pantalla
		
		System.out.println("El numero a sumar para que sea multiplo de 7 es: " + numeroASumar);
				
		// Cerramos Scanner
		
		sc.close();
		
	}

}

