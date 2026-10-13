package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	
//	08. Pirámide invertida
//	Ejemplo de entrada: N = 5
//	Salida esperada:
//	*********
//	 *******
//	  *****
//	   ***
//	    *


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intyroduce un numero N: ");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			//Espacios iniciales con i
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(" ");
				
			}
			
			//asteriscos
			
			for (int j = 0; j < 2 * (N-i) -1; j++) {
				
				System.out.print("*");
				
			}
			
			//Salto de linea para acabar
			
			System.out.println();
			
		}
		
		
		sc.close();
		
	}

}
