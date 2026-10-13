package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	
	//	03. Triángulo rectángulo: ángulo abajo a la izquierda
	//	Pide la altura N y construye un triángulo creciente alineado a la izquierda.
	//	Ejemplo de entrada: N = 5
	//	Salida esperada:
	//	*
	//	**
	//	***
	//	****
	//	*****


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura N: ");
		Integer N = sc.nextInt();
		
	
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j <= i) {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
