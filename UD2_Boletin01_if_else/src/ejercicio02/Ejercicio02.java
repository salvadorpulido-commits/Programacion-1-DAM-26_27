package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	
	/* Escribir un programa que pida al usuario tres números enteros, 
	 * y que muestre por pantalla el mayor de los 3. 
	 * Supondremos que los tres números son distintos.
	 */

	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos al usuario tres numeros distintos entre si
		
		System.out.println("Introduce un numero: ");
		Integer num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero distinto al anterior: ");
		Integer num2 = sc.nextInt();
		
		System.out.println("Introduce otro numero distinto a los anteriores: ");
		Integer num3 = sc.nextInt();
		
		// Declaramos variable para el numero mayor
		
		Integer numMayor = 0;
		
		// Operamos con condicionales
		
		if (num1 > num2) {
			
			numMayor = num1;
			
		} else {
			
			numMayor = num3;
			
			if (num3 > num2) {
				
				numMayor = num3;
				
			} else {
				
				numMayor = num2;
				
			}
				
		}
		
		System.out.println("El numero mayor es: " + numMayor);
		
		// Cerramos Scanner
		
        sc.close();
	
		
	}

}
