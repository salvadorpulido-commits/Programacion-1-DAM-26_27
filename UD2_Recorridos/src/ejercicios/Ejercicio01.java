package ejercicios;


import java.util.ArrayList;
import java.util.List;

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
	
	//Suma elementos de una lista
	
	public static Double sumaListaDeReales(List<Double> lis) {
		Double res = 0.0;
		for (int i = 0; i < lis.size(); i++) {
			Double e = lis.get(i);
			res+=e;
			
		}
		return res;
		
	}
	
	// Metodo con for each (para cuando quieres recorrer la lista 
	// de principio a fin uno a uno (sumar, contar, buscar el maximo, etc..))
	
	/*
	 *   public static Double sumaListaDeReales(List<Double> lis) {
	 *   Double res = 0.0
	 *   for (Double e : lis){
	 *        res+=e;
	 *        }
	 *      return res;
	 *    } 
	 *       
	 * 
	 */
	
	// Suma elementos de una lista mayores o iguales que un cierto umbral.
	
	public static Double sumaMayoresIgualesA(List<Double> lis, Double umbral) {
		Double res = 0.0;
		for (int i = 0; i < lis.size(); i++) {
			Double e = lis.get(i);
			if (e>=umbral) {
				res += e;
				
			}
			
		}
		return res;
	}

	
	//Comprobacion (para todo)###########
	
	// Método que dada una lista como parámetro compruebe
	//si todos sus elementos son primos
	
	public static Boolean todosPrimos(List<Integer> lis) {
		Boolean res=true;
		for(Integer e : lis) {
			if (!UtilesRecorridos.esPrimo(e)) {
				res = false;
				break;
			}
		}
		return res;
	}
	
	//Dada una lista, comprobar si es creciente
	
	public static Boolean esCreciente(List<Integer> lis) {
		Boolean res = true;
		for (int i = 1; i < lis.size(); i++) {
			Integer e = lis.get(i);
			Integer anterior = lis.get(i-1);
			if (e<anterior) {
				res=false;
				break;
				
			}
			
		}
		return res;
	}
	
	//Seleccion
	
	// Dada una lista hacer un metodo que me devuelva otra lista
	// con los que sean primos
	
	public static List<Integer> seleccionaPrimos(List<Integer> lis) {
		
		List<Integer> res = new ArrayList<>();
		for (Integer e : lis) {
			if (UtilesRecorridos.esPrimo(e)) {
				res.add(e);
			}
			
		}
		return res;
	}

	
	
	// maximo y/o minimo############
	
	

}
