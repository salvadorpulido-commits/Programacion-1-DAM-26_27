package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
	
//	18. Reto: reloj de arena
//	Une una pirámide invertida con otra creciente, evitando duplicar la fila más estrecha.
//	Ejemplo de entrada: N = 4
//	Salida esperada:
//	*******
//	 *****
//	  ***
//	   *
//	  ***
//	 *****
//	*******


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la altura N: ");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			//Primer triangulo (arriba)
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < 2 * (N-i) - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Segundo triangulo, i comienza en 1 para no repetir fila
		
		for (int i = 1; i < N; i++) {
			
			for (int j = 0; j < N - 1 - i; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < 2 * i + 1; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		sc.close();
	}

}
