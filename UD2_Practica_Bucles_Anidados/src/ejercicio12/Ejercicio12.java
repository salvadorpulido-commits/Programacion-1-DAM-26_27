package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	
//	12. Tablero de ajedrez
//	Alterna * y # tanto por filas como por columnas. Puedes estudiar la paridad de fila + columna.
//	Ejemplo de entrada: 6 filas, 8 columnas
//	Salida esperada:
//	*#*#*#*#
//	#*#*#*#*
//	*#*#*#*#
//	#*#*#*#*
//	*#*#*#*#
//	#*#*#*#*


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las filas: ");
		Integer filas = sc.nextInt();
		
		System.out.println("Introduce las columnas");
		Integer columnas = sc.nextInt();
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				if ((i + j)  % 2 == 0) {
					
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
