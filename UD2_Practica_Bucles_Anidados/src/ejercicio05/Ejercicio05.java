package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	
	//	05. Triángulo rectángulo: ángulo abajo a la derecha
	//	Utiliza espacios iniciales para alinear los asteriscos a la derecha.
	//	Ejemplo de entrada: N = 5
	//	Salida esperada:
	//	    *
	//	   **
	//	  ***
	//	 ****
	//	*****


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero N:");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			for (int j = 0; j < N; j++) {
				
				if ( j >= N-1-i) {
					
			    System.out.print("*");
				
			} else { 
				System.out.print(" ");
			}
			
		}
			
			System.out.println();
			
		}
		sc.close();
		
	}

}
