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
	
	
	//comprobacion decreciente
	
	public static Boolean esDecreciente(List<Integer> lis) {
	    Boolean res = true;
	    for (int i = 1; i < lis.size(); i++) {
	        Integer e = lis.get(i);
	        Integer anterior = lis.get(i-1);
	        if (e > anterior) {
	            res = false;
	            break;
	        }
	    }
	    return res;
	}
	
	// comprobacion estrictamente creciente (sin repetidos)
	
	public static Boolean esEstrictamenteCreciente(List<Integer> lis) {
	    Boolean res = true;
	    for (int i = 1; i < lis.size(); i++) {
	        Integer e = lis.get(i);
	        Integer anterior = lis.get(i-1);
	        if (e <= anterior) {
	            res = false;
	            break;
	        }
	    }
	    return res;
	}
	
	// Comprobar paridad. Cada elemento debe tener distinta paridad que el anterior.
	
	public static Boolean alternanParidad(List<Integer> lis) {
	    Boolean res = true;
	    for (int i = 1; i < lis.size(); i++) {
	        Integer e = lis.get(i);
	        Integer anterior = lis.get(i-1);
	        if (e % 2 == anterior % 2) {
	            res = false;
	            break;
	        }
	    }
	    return res;
	}
	
	//Progresion aritmetica, Se compara cada pareja con la diferencia de la primera pareja.
	
	public static Boolean esProgresionAritmetica(List<Integer> lis) {
	    Boolean res = true;
	    if (lis.size() > 2) {
	        Integer diferencia = lis.get(1) - lis.get(0);
	        for (int i = 2; i < lis.size(); i++) {
	            Integer e = lis.get(i);
	            Integer anterior = lis.get(i-1);
	            if (e - anterior != diferencia) {
	                res = false;
	                break;
	            }
	        }
	    }
	    return res;
	}
	
	//Es capicúa (la lista se lee igual al revés)

    // Se compara cada elemento con su simétrico y solo hace falta recorrer la mitad.
	
	public static Boolean esCapicua(List<Integer> lis) {
	    Boolean res = true;
	    for (int i = 0; i < lis.size() / 2; i++) {
	        Integer e = lis.get(i);
	        Integer opuesto = lis.get(lis.size() - 1 - i);
	        if (!e.equals(opuesto)) {
	            res = false;
	            break;
	        }
	    }
	    return res;
	}
	
	// Todos los elementos están dentro de un rango
	// Es el “para todo” con un parámetro, como sumaMayoresIgualesA.
	
	public static Boolean todosEnRango(List<Integer> lis, Integer min, Integer max) {
	    Boolean res = true;
	    for (int i = 0; i < lis.size(); i++) {
	        Integer e = lis.get(i);
	        if (e < min || e > max) {
	            res = false;
	            break;
	        }
	    }
	    return res;
	}
	
	//el patrón “existe” (al revés)

    // Se parte de false y se pone true al encontrar uno.
	
	public static Boolean hayAlgunPrimo(List<Integer> lis) {
	    Boolean res = false;
	    for (int i = 0; i < lis.size(); i++) {
	        Integer e = lis.get(i);
	        if (UtilesRecorridos.esPrimo(e)) {
	            res = true;
	            break;
	        }
	    }
	    return res;
	}
	
	//Seleccion##################
	
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
	
	//Método que dada una lista de enteros me devuelva el máximo
	
	public static Integer Maximo(List<Integer> lis) {
		Integer res=lis.get(0);
		for (int i = 1; i < lis.size(); i++) {
			Integer e = lis.get(i);
			if (e>res) {
				res=e;
			}
			
		}
		
		return res;
	}
    
//	public static Long fibonacci(Integer n) {
//		Long res;
//		if(n==0) {//caso base
//			res=0L;
//		}else if (n==1) {//caso base
//			res=1L;
//		}else {//caso recursivo
//			res=fibonacci(n-1) + fibonacci(n-2);
//		}
//		return res;
//	}
	
	/*La sucesión de Fibonacci empieza con 0 y 1, y cada término siguiente 
	 * es la suma de los dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13... 
	 * Escribe un método recursivo, sin bucles, que reciba una posición 
	 * (empezando en 0) y devuelva el número que ocupa esa posición. 
	 * Puedes suponer que la posición no es negativa y 
	 * que se usarán valores pequeños.
	 */
	
	public static Integer fibonacci(Integer posicion) {

        // Caso base 1: el número de la posición 0 es 0
        if (posicion == 0) {
            return 0;
        }

        // Caso base 2: el número de la posición 1 es 1
        if (posicion == 1) {
            return 1;
        }

        // Llamada recursiva: cada número es la suma de los dos anteriores
        return fibonacci(posicion - 1) + fibonacci(posicion - 2);
    }
	
	
	  // Suma los pares de 
	public static Integer sumaParesFibonacci(Integer n, Integer actual, Integer siguiente) {

	    // Caso base: si n es negativo ya no quedan términos, se devuelve 0
	    if (n < 0) {
	        return 0;
	    }

	    // Suma de los pares del resto de términos: se avanza un lugar en la sucesión
	    // (el siguiente pasa a ser el actual y el nuevo siguiente es la suma de ambos)
	    Integer resto = sumaParesFibonacci(n - 1, siguiente, actual + siguiente);

	    // Si el término actual es par se suma; si no, solo se devuelve el resto
	    if (actual % 2 == 0) {
	        return actual + resto;
	    }
	    return resto;
	}
	
	//suma los impares
	
	public static Integer sumaImparesFibonacci(Integer n) {

	    // Caso base: si n es negativo ya no quedan términos, se devuelve 0
	    if (n < 0) {
	        return 0;
	    }

	    // Término de Fibonacci de la posición actual
	    Integer termino = fibonacci(n);

	    // Si el término es impar se suma y se sigue con las posiciones anteriores
	    if (termino % 2 != 0) {
	        return termino + sumaImparesFibonacci(n - 1);
	    }

	    // Si es par, se ignora y se sigue con las posiciones anteriores
	    return sumaImparesFibonacci(n - 1);
	}
	
	//suma pares entre dos posiciones
	
	public static Integer sumaParesEntre(Integer inicio, Integer fin) {

	    // Caso base: si fin queda por debajo de inicio, el rango está vacío y se devuelve 0
	    if (fin < inicio) {
	        return 0;
	    }

	    // Término de Fibonacci de la posición actual (la más alta del rango)
	    Integer termino = fibonacci(fin);

	    // Si es par se suma y se sigue bajando hacia inicio
	    if (termino % 2 == 0) {
	        return termino + sumaParesEntre(inicio, fin - 1);
	    }

	    // Si es impar, se ignora y se sigue bajando hacia inicio
	    return sumaParesEntre(inicio, fin - 1);
	}
	
	//Posicion######################
	
	/*
	 * Escribe un método que reciba una lista de enteros y un número, 
	 * y devuelva la posición de la primera aparición de ese número. 
	 * Si no aparece, devuelve -1. Usa un for clásico y termina la búsqueda con break.
	 */
	
	public static Integer buscarPosicion(List<Integer> lista, Integer numero) {

	    Integer posicion = -1;   // resultado: vale -1 si el número no aparece

	    // Recorre la lista desde la primera posición hasta la última
	    for (Integer i = 0; i < lista.size(); i++) {

	        // Compara con equals porque son Integer
	        if (lista.get(i).equals(numero)) {
	            posicion = i;    // guarda la posición donde está el número
	            break;           // termina la búsqueda: solo interesa la primera aparición
	        }
	    }

	    // Devuelve la posición, o -1 si el for terminó sin encontrarlo
	    return posicion;
	}
	
	
	
	
}
		

