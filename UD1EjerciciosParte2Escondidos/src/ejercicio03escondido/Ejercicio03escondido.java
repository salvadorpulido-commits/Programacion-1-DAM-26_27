package ejercicio03escondido;

import java.util.Scanner;

public class Ejercicio03escondido {
	
	/* Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, num1 y num2, 
	 * diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
	 
		Scanner sc = new Scanner(System.in); 
		
		// Pedimos dos numeros al usuario
		
		System.out.println("Introduce un numero: ");
		Integer num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		Integer num2 = sc.nextInt();
		
		//Operamos con el operador % y operador ternario
		
		Integer resto = num1%num2;
		
		Integer numeroASumar = (resto==0) ? 0 : (num2-resto); 
		
		// Mostramos operacion por pantalla
		
		System.out.println("El numero que hay que sumarle a " + num1 + " para que sea multiplo de " + num2 + " es: " + numeroASumar);
		
						
		// Cerramos Scanner
		
		sc.close();
		
	}

}
