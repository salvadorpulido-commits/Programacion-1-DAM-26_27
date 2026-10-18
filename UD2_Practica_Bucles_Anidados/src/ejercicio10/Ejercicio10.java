package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	
//	10. Rectángulo con filas alternas
//	Las filas impares muestran * y las pares #.
//	Ejemplo de entrada: 5 filas, 8 columnas
//	Salida esperada:
//	********
//	########
//	********
//	########
//	********


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las filas: ");
		Integer filas = sc.nextInt();
		
		System.out.println("Introduce las columnas: ");
		Integer columnas = sc.nextInt();
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				if (i % 2 == 0) {
					
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
