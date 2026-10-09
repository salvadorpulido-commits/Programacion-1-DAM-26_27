package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	
	/* Escribir un programa que pida al usuario tres números enteros, 
	 * y que muestre por pantalla si la suma de dos de esos números 
	 * da como resultado el otro número.
	 */


	public static void main(String[] args) {
		
		//Abrimos Scaner
	
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario trews numeros
		
		System.out.println("Introduce el primer numero: ");
		Integer num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		Integer num2 = sc.nextInt();
		
		System.out.println("Introduce el tercer numero: ");
		Integer num3 = sc.nextInt();
		
		// Operamos
		
		if (num1 + num2 == num3) {
			
			System.out.println("La suma de los dos primeros numeros " + num1 + " y " + num2 + " es igual que el tercero " + num3 );
			
			} else {
				
				System.out.println("La suma de los dos primeros numeros " + num1 + " y " + num2 + " no es igual al tercero " + num3 );
			}
				
		// Cerramos Scannner
		
		sc.close();

	}

}
