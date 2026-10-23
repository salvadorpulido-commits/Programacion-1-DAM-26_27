package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	/*
	 * Implementar una aplicación para calcular datos estadísticos de las edades de
	 * los alumnos de un centro educativo. Se introducirán datos hasta que uno de
	 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
	 * la media, el número de alumnos y cuántos son mayores de edad.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaramos las variables

		Integer sumaEdades = 0;
		Integer numAlumnos = 0;
		Integer numMayoresEdad = 0;
		Double mediaEdades = 0.0;

		// Pedimos edad al usuario

		System.out.println("Introduce la edad: ");
		Integer edad = sc.nextInt();

		// Mientras la edad sea positiva, las vamos sumando

		while (edad >= 0) {
			sumaEdades += edad;

			// Incrementamos en 1 el numero de alumnos y si es mayor de edad tambien

			numAlumnos++;

			if (edad >= 18) {

				numMayoresEdad++;
				
			}

			// Pedimos edad al usuario
				
				System.out.println("Introduce una edad:");
				edad = sc.nextInt();
				
		}
	
		if (numAlumnos > 0 ) {
			
		mediaEdades = (double) sumaEdades / numAlumnos;
		
		
				
				// Imprimimos resultados
				
				System.out.println("La suma de edades es: " + sumaEdades);
				System.out.println("El total de alumnos es: " + numAlumnos);
				System.out.println("La media de edades es: " + mediaEdades);
				System.out.println("El total de alumnos mayores de edad es: " + numMayoresEdad);
		
	
			} else {
				
				System.out.println("No has introducido ninguna edad. ");
			
			
            }

		
		// Cerramos Scanner

		sc.close();

		}


}
