package ejercicios;

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
				
				if (fila == 0 || fila == lado -1 || fila + columna == lado -1) {
					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
	}

		// Ejercicio 03
		
		public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer 
				cantidad) {
			
			if (cantidad <=0) {
				return 0;
			}
			
			Integer suma = 0;
			Integer encontrados = 0;
			
			// Recorremos el intervalo de menor a mayor con los dos extremos incluidos
			
			for (int numero = inicio; numero <= fin; numero++) {
				
				// Especial = primo o perfecto (si cumple las dos, solo entra una vez
				
				if (Utiles.esPrimo(numero) || Utiles.esPerfecto(numero)) {
					
					suma = suma + numero;
					encontrados++;
					
					// Salimos con break despues de encontrar los numero
					
					if (encontrados.equals(cantidad)) {
						break;
						
					}
					
				}
				
			}
				
			return suma;
			
		}
		
	}


