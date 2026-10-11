package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	
	/* Pedir un número y calcular su factorial. 
	 * Por ejemplo, el factorial de 5 se denota 5! 
	 * y es igual a 5x4x3x2x1 = 120
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		
		Integer res = 1;
		
		for(int i=1; i <= n; i++) {
			res = res*i;
			
		}
		System.out.println("El factrorial de " + n + " es: " + res);
	}

}
