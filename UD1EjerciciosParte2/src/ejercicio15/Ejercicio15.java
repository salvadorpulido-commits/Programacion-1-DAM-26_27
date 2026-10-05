package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	
	/* Solicita tres números enteros a, b y c. 
	 * Calcula y muestra el resultado de las expresiones a + b * c y (a + b) * c. 
	 * Comprueba que los resultados pueden ser distintos y explica mediante un comentario en el código el motivo.
	 */


	public static void main(String[] args) {
		
		// Abrimos Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos al usuario que introduzca los numeros
		
		System.out.println("Introduce un numero para el valor a: ");
		Integer a = sc.nextInt();
		
		System.out.println("Introduce un numero para el valor b: ");
		Integer b = sc.nextInt();
		
		System.out.println("Introduce un numero para el valor c: ");
		Integer c = sc.nextInt();
		
		// hacemos la primera operacion
		
		Integer operacion1 = a + b * c;
		
		// Hacemos la segunda operacion
		
		Integer operacion2 = (a + b) * c;
		
		// Mostramos por consola el resultado de las operaciones
		
		System.out.println("a + b * c : " + operacion1 );
		System.out.println("(a + b) * c: " + operacion2 );
		
		// El resultado ers distinto por que la multiplicacion prevalece a la suma en el primer caso
		// y  en el segundo el parentesis modifica la forma de operar cambiando el orden, (parentesis primero) y despues multiplicacion
		
		//Cerramos Scanner
		
		sc.close();
		

	}

}
