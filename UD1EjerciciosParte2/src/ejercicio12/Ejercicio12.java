package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	
	/* Pide al usuario su edad y utiliza el operador ternario para calcular 
	 * el precio de una entrada: 6,50 € si es menor de 18 años y 9,50 € en caso contrario. 
	 * Muestra el precio correspondiente.
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos edad al usuario
		
		System.out.println("Introduce tu edad: ");
		Integer edad = sc.nextInt();
		
		// Operamos con ternario, expresion condicional edad true da valor 1 y false valor 2
		
		Double precio = ( edad < 18 ? 6.50 : 9.50 ); 
		System.out.println("El precio de la entrada es: "  + precio + " €. ");
		
				
		// Cerramos Scanner
		
		sc.close();
		
	}

}
