package ejercicio14;


import java.util.Scanner;

public class Ejercicio14 {
	
//	14. Rectángulo dividido en dos zonas horizontales
//	La mitad superior se dibuja con * y la inferior con #. Usa un número par de filas.
//	Ejemplo de entrada: 6 filas, 8 columnas
//	Salida esperada:
//	********
//	********
//	********
//	########
//	########
//	########  


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las filas:");
		Integer filas = sc.nextInt();
		
		System.out.println("Introduce las columnas: ");
		Integer columnas = sc.nextInt();
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				
				if (i < filas / 2) {
					
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
