package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

//	09. Rombo
//	Combina una pirámide de N niveles con una pirámide invertida sin repetir la fila central.
//	Ejemplo de entrada: N = 4
//	Salida esperada:
//	   *
//	  ***
//	 *****
//	*******
//	 *****
//	  ***
//	   *

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero N:");
		Integer N = sc.nextInt();
		
		//Mitad de arriba y fila central

		for (int i = 0; i < N; i++) {
			
			//Espacios 

			for (int j = 0; j < N - 1 - i; j++) {

				System.out.print(" ");

			}
			
			//Asteriscos

			for (int j = 0; j < 2 * i + 1; j++) {

				System.out.print("*");

			}
			
			System.out.println();
		}

		//Mitad de abajo con i inicializada a 1 para no repetir fila central
		
		for (int i = 1; i < N; i++) {
			
			//Espacios
			
			for (int j = 0; j < i; j++) {				
				System.out.print(" ");
			}
			
			//Asteriscos
			
			for (int j = 0; j < 2 * (N - i) - 1; j++) {
				
				System.out.print("*");
			}

			System.out.println();
		}

		sc.close();

	}

}
