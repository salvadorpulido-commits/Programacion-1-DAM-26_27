package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	
//	11. Rectángulo con columnas alternas
//	Cada columna alterna entre * y #, independientemente de la fila.
//	Ejemplo de entrada: 4 filas, 8 columnas
//	Salida esperada:
//	*#*#*#*#
//	*#*#*#*#
//	*#*#*#*#
//	*#*#*#*#

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las filas: ");
		Integer filas = sc.nextInt();
		
		System.out.println("Introduce las columnas: ");
		Integer columnas = sc.nextInt();
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				if (j % 2 == 0) {
					
					System.out.print("*");
					
					
				} else {
					
					System.out.print("#");
				}
				
			}
			
			System.out.println();
			
		}
		
		
		sc.close();
		
		
	}

}
