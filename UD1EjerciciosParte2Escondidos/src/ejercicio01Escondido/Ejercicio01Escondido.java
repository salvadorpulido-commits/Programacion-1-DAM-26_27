package ejercicio01Escondido;

import java.util.Scanner;

public class Ejercicio01Escondido {
	
	/* Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado 
	 * al entero más próximo. (SIN UTILIZAR Math.round())
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número con decimales: ");
		double x = sc.nextDouble();
		
		// parte entera (trunca)

		int entero = (int) x; 
		
		// parte decimal (con signo)
		
		double decimales = x - entero;  

		if (decimales >= 0.5) {
			entero++;
		} else if (decimales <= -0.5) {
			entero--;
		}

		System.out.println("El número es: " + x);
		System.out.println("Redondeado al entero más próximo: " + entero);

		sc.close();
	}
}