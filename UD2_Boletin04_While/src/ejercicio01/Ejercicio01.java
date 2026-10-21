package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
	 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
	 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
	 * suma de los números positivos introducidos por el usuario.
	 * 
	 * ejemplo:
	 * 
	 * 2 3 6 -1 La suma es 11
	 * 
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner

		Scanner sc = new Scanner(System.in);

		//Declaramos variable suma a 0 fuera del while para ir guardando los numeros a sumar
		
		Integer suma = 0;

		System.out.println("Introduce un numero: ");
		Integer numero = sc.nextInt();

		while (numero >= 0) {

			suma += numero;

			System.out.println("Introduce un numero: ");
			numero = sc.nextInt();
			
		}
		
		System.out.println("La suma es: " + suma);
				

		sc.close();

	}

}
