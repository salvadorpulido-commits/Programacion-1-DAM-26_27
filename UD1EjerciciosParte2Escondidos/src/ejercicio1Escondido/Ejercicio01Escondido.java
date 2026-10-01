package ejercicio1Escondido;

import java.util.Scanner;

public class Ejercicio01Escondido {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número con decimales: ");
		double x = sc.nextDouble();

		int entero = (int) x;           // parte entera (trunca)
		double decimales = x - entero;  // parte decimal (con signo)

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