package ejercicios;


import java.util.List;
import java.util.ArrayList;
import utiles.UtilesRecorridos;

public class Ejercicio01 {

	// Contador###########

	// de los 20 primeros num cuantos son pares

	public static Integer cuentaParesDeLos20PrimerosNumeros() {

		Integer res = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				res++;
			}

		}

		return res;
	}

	// Método que me diga cuántos pares hay hasta un entero n
	// pasado como parámetro

	public static Integer cuentaParesHasta(Integer n) {
		Integer res = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				res++;

			}

		}

		return res;
	}
	
	// Método que me diga cuántos pares hay entre dos enteros a y b
	// pasados como parámetros. Suponemos que a<b
	
	public static Integer cuentaParesEntre(Integer a, Integer b) {
		Integer res = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 ==0) {
				res++;
				
			}
			
		}
		
		return res;
	}

	
	//Método que cuenta cuántos pares tiene una lista de enteros que se pasa
	//como parámetro
	
	
	public static Integer cuentaParesEn(List<Integer> lis) {
		Integer res = 0;
		for (int i = 0; i < lis.size(); i++) {
			Integer e = lis.get(i);
			if (e % 2 == 0) {
				res++;
				
			}
			
		}
		
		
		return res;
		
	}
	
	// Otro modo de hacerlo con for each
	
//	public static Integer cuentaParesEn(List<Integer> lis) {
//		Integer res = 0;
//		for (Integer e:lis) {
//			if (e % 2 == 0) {
//				res++;
//				
//			}
//		}
//		
//		return res;
//	}
//	
	
	// Contar primos en una lista llamando a su util:
	
	public static Integer cuentaPrimosEn(List<Integer> lis) {
		Integer res = 0;
		for (Integer e:lis) {
			if (UtilesRecorridos.esPrimo(e)) {
				res++;
			}
			
		}
		
		
		return res;
	}
	
	// suma############

	// maximo y/o minimo############

}
