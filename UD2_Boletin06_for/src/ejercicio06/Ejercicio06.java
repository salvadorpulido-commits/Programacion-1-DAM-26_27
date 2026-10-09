package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
	
	/* Pedir 5 calificaciones de alumnos 
	 * y decir al final si hay algún suspenso.
	 */

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Boolean algunSuspenso = false;
		for (int i = 0; i <= 5; i++) {
			System.out.println("Introduce una nota: ");
			
			Integer nota=sc.nextInt();
			
			if (nota<5) {
				algunSuspenso = true;
			}
			break;
		}
		
		sc.close();
		
	}

}
