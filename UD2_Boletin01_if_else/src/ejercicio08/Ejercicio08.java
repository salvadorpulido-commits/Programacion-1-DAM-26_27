package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	
	/* Escribir un programa que pida al usuario tres números enteros, 
	 * y que muestre por pantalla si la suma de dos de esos números 
	 * da como resultado el otro número.
	 */


	public static void main(String[] args) {
		
		//Abrimos Scanner
	
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario tres numeros
		
		System.out.println("Introduce el primer numero: ");
		Integer num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		Integer num2 = sc.nextInt();
		
		System.out.println("Introduce el tercer numero: ");
		Integer num3 = sc.nextInt();
		
		// Operamos
		
		if (num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1) {
			
			System.out.println("La suma de dos de los numeros es igual a otro. " );
			
			} else {
				
				System.out.println("Ninguna suma de dos de los numeros es igual a otro. " );
			}
				
		// Cerramos Scanner
		
		sc.close();

	}

}
