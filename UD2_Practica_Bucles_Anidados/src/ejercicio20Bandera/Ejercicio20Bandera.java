package ejercicio20Bandera;

import java.util.Scanner;

public class Ejercicio20Bandera {

//	16. Figura con dos diagonales y cruz 
//	Dibuja un cuadrado con # en las dos diagonales, + en la cruz y puntos (.) en el resto.
//	Ejemplo de entrada: N = 11
//	Salida esperada:
//	#....+....#
//	..#..+..#..
//	....#+#....
//	+++++++++++
//	....#+#....
//	..#..+..#..
//	#....+....#
	
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero N:");
        Integer N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (i == j || i + j == N - 1) {

                    System.out.print("#");

                } else if (j == N / 2 || i  == N / 2) {

                    System.out.print("+");

                } else {

                    System.out.print(".");

                }

            }
            System.out.println();
        }

        sc.close();
    }

}


//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		
//		Integer N;
//		
//		do {
//			System.out.println("Introduce un numero N (impar y positivo): ");
//			N = sc.nextInt();
//			
//		} while (N <= 0 || N % 2 == 0);
//
//		for (int i = 0; i < N; i++) {
//			
//			for (int j = 0; j < N; j++) {
//				
//				if (j == N / 2 || i  == N / 2) {
//
//					System.out.print("+");
//
//				} else if (i == j || i + j == N - 1) {
//
//					System.out.print("#");
//
//				
//
//				} else {
//
//					System.out.print(".");
//
//				}
//				
//			}
//			System.out.println();
//		}
//
//		sc.close();
//	}
//
//}

