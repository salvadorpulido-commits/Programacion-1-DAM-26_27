package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	
//	17. Triángulo de números
//	En la fila i muestra los números desde 1 hasta i, sin espacios entre ellos.
//	Ejemplo de entrada: N = 5
//	Salida esperada:
//	1
//	12
//	123
//	1234
//	12345


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduce un numero N: ");
		Integer N = sc.nextInt();
		
		for (int i = 0; i < N ; i++) {
			for (int j = 0; j < N; j++) {
				if (j<=i) {
					
					System.out.print(j + 1);
					
				}
				
			}
			System.out.println();
		}
			sc.close();
	}

}
