package ejercicios;


import java.util.List;

import utiles.Utiles;

public class Ejercicios {

	// Ejercicio 01

	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {

		Integer precio;

		if (edad < 0) {
			return -1;
		}

		switch (dia) {

		case "LUNES":
		case "MARTES":
		case "MIERCOLES":
		case "JUEVES":
			precio = 8;
			break;

		case "VIERNES":
			precio = 10;
			break;

		case "SABADO":
		case "DOMINGO":
			precio = 12;

			break;

		default:
			return -1;

		}

		if (edad < 12 || edad >= 65) {
			precio = precio - 3;

		}

		if (socio) {
			precio = precio - 2;

		}

		return precio;
	}

	// Ejercicio 02

	public static void dibujarZ(Integer lado) {

		// Bucle exterior: recorre las filas, de arriba abajo

		for (int fila = 0; fila < lado; fila++) {

			// Bucle interior: recorre las columnas de la fila actual

			for (int columna = 0; columna < lado; columna++) {

				// Pone asteriscos en la primera fila, en la ultima fila o en la diagonal

				if (fila == 0 || fila == lado - 1 || fila + columna == lado - 1) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

	// Ejercicio 03

	public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer cantidad) {

		if (cantidad <= 0) {
			return 0;
		}

		Integer suma = 0;
		Integer contador = 0;

		// Recorremos el intervalo de menor a mayor con los dos extremos incluidos

		for (int numero = inicio; numero <= fin; numero++) {

			// Especial = primo o perfecto (si cumple las dos, solo entra una vez)

			if (Utiles.esPrimo(numero) || Utiles.esPerfecto(numero)) {

				suma = suma + numero;
				contador++;

				// Salimos con break despues de encontrar los numero

				if (contador.equals(cantidad)) {
					break;

				}

			}

		}

		return suma;

	}

	// Ejercicio 04

	public static Integer factorialConSaltos(Integer numero, Integer salto) {

		// caso base: si el numero es menor o igual que cero debe devolver 1 y corta

		if (numero <= 0) {
			return 1;

		}

		// Metodo recursivo, multiplica el numero por el resultado de repetir
		// el calculo con numero restado en salto

		return numero * factorialConSaltos(numero - salto, salto);

	}	

	// Ejercicio 05
	
	public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {
		
		Integer contadorPicos = 0;
		
		for (int i = 1; i < alturas.size() -1 ; i++) {
			
			if (alturas.get(i) - alturas.get(i-1) >= diferenciaMinima && alturas.get(i) - alturas.get(i+1) >= diferenciaMinima) {
				
				contadorPicos++;
			}
						
		}
		return contadorPicos;
		
	}

	
	// Ejercicio 06
	
	public static Integer primeraPosicionSumaCifras(List<Integer> numeros, Integer 
			sumaObjetivo) {
		
		Integer posicion = -1;  // resultado: vale -1 si no hay coincidencia o la lista está vacía
				
		 // Recorre la lista de izquierda a derecha, con i como posición (empieza en 0)
		
		for (int i = 0; i < numeros.size(); i++) {
						
			
			Integer suma = 0;  // suma de cifras del numero actual; se reinicia en cada vuelta 
			Integer copia = numeros.get(i); // copia del numero, para poder dividirlo sin perder el original
			
			 // Mientras queden cifras por procesar
			
			while (copia > 0) {
				
				suma = suma + (copia % 10); // suma la ultima cifra 
				copia = copia / 10;  // quita la ultima cifra
								
			}
			
			// Si la suma de cifras coincide con la suma objetivo
			
			if (suma.equals(sumaObjetivo)) {
				posicion = i;                // guarda la posición de este primer número
				break;                       // termina la búsqueda: solo interesa el primero
				
			}
			
		}
		
		// Devuelve la posición encontrada, o -1 si no hubo ninguna coincidencia
		
		return posicion;
	}
	

	
	
	// Exercise 07
	
	public static Integer countNonOverlappingPairs(List<Integer> numbers) {
		
	Integer res=0;
	
	for (int i = 0; i < numbers.size() -1; i++) {
		Integer element = numbers.get(i);
		Integer nextElement = numbers.get(i+1);
		if ((element + nextElement)%5==0) {
			res++;
			i++;
		}
		
	}
		return res;	
   }
	
}
