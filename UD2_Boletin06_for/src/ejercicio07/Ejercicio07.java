package ejercicio07;

public class Ejercicio07 {

	/*
	 * Realiza un programa en java que pida un número entero positivo y nos diga si
	 * es primo o no.
	 */

	public static void main(String[] args) {
		
		Integer n = 1;
		Boolean esPrimo = true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				esPrimo = false;
				break;
			}

		}
		System.out.println(esPrimo);
	}

}
