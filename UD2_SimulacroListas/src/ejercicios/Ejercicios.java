package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {

    // 1. Sumar una lista mediante for-each.
    public static Integer suma1(List<Integer> numeros) {
        Integer suma = 0;

        for (Integer numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    // 2. Sumar una lista mediante for clásico (con índice).
    public static Integer suma2(List<Integer> numeros) {
        Integer suma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return suma;
    }

    // 3. Sumar una lista mediante while.
    public static Integer suma3(List<Integer> numeros) {
        Integer suma = 0;
        int i = 0;

        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return suma;
    }

    // 4. Contar los números pares, incluido el 0.
    public static Integer contarPares(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    // 5. Contar los números primos mediante la clase Utiles.
    public static Integer contarPrimos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPrimo(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 6. Contar los números perfectos mediante la clase Utiles.
    public static Integer contarPerfectos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPerfecto(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 7. Calcular la media mediante for-each.
    public static Double media1(List<Integer> numeros) {
     
        Integer suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.size();
    }

    // 8. Calcular la media mediante for clásico.
    public static Double media2(List<Integer> numeros) {

        Integer suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return (double) suma / numeros.size();
    }
    
    
    // Mediante modo 
    
    public static Double media2B(List<Integer> numeros) {

        double res = 0.0;
        int suma = 0;
        if (numeros.size() != 0) {
        	for (int i = 0; i < numeros.size(); i++) {
        		suma += numeros.get(i);
			}
            res = (double) suma / numeros.size();
        }

        return res;
    }
    
    

    // 9. Calcular la media mediante while.
    public static Double media3(List<Integer> numeros) {

        Integer suma = 0;
        int i = 0;
        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return (double) suma / numeros.size();
    }
    
    //TODO Hacer aquí los ejercicios del examen 
    //los haremos con distintos bucles
    
        
	 // Ejercicio 01: control de acceso al Baile de los Monstruos.
	 // Entra si es vampiro (entrada libre), si tiene 18 años o más, o si va acompañado.
    
	 public static boolean puedeEntrar(Integer edad, boolean acompanado, String criatura) {
	     boolean res = false;
	
	     if (criatura.equals("vampiro")) {
	         res = true;
	     } else if (edad >= 18 || acompanado) {
	         res = true;
	     }
	
	     return res;

	 }

    
    // Ejercicio 02:  Clasificador de caramelos 
	// Los caramelos recolectados tienen etiquetas: "dulce", "ácido", "salado", 
	// "misterioso". 
	// Crea un método que reciba una lista y cuente cuántos hay de un tipo dado. 
	 
	 
	 public static void cuentaTodosCaramelos(List<String> caramelos) {
		    Integer dulces = 0;
		    Integer acidos = 0;
		    Integer salados = 0;
		    Integer misteriosos = 0;

		    for (String caramelo : caramelos) {
		        switch (caramelo) {
		            case "dulce":
		                dulces++;
		                break;
		            case "ácido":
		                acidos++;
		                break;
		            case "salado":
		                salados++;
		                break;
		            case "misterioso":
		                misteriosos++;
		                break;
		            default:
		                // etiqueta no reconocida: se ignora
		                break;
		        
		        }
		        
		        		    
		    }
		    
		    System.out.println("dulce: " + dulces);
	        System.out.println("ácido: " + acidos);
	        System.out.println("salado: " + salados);
	        System.out.println("misterioso: " + misteriosos);
	        
	 }
	 
	// Ejercicio 03: contador de pasos en el laberinto.
	// Suma las distancias hasta encontrar un número negativo (trampa).
	// Decisión: el negativo no se suma y el recorrido termina con break.
	// El 0 no es una trampa, así que se suma (aporta 0) y se sigue avanzando.
	 
	 public static Integer pasosLaberinto(List<Integer> pasos) {
		 Integer suma = 0;
		 int i = 0;
		 while (i < pasos.size()) {
			 if (pasos.get(i)>0) {
	            suma += pasos.get(i);
	          
	        } else {
	        	break;
	        	 
	        }
			 i++;
	       
	    }
		 return suma; 
	 }
	 
	 // Ejercicio 4 — Nivel medio de magia en las calabazas 
	 // Cada calabaza tiene un nivel de magia (0–10). 
	 // Crea un método que calcule el promedio de los valores mayores o iguales que 5, 
	 // ignorando los inferiores. 
	 
	 public static Double promedioMagia(List<Integer> niveles) { 
		
		        Integer suma = 0;
		        Integer cantidad = 0;
		        double res = 0;
		        
		        for (Integer nivel : niveles) {
		        	if (nivel >= 5)	{
		        		suma += nivel;
		        		cantidad++;
		        	}
		        }
		        
		        if (cantidad > 0) {
					res = (double) suma / cantidad;
				
				}

		        return res;
		    }
		    
	 
	 // Ejercicio 05 Ejercicio 5 — Recursividad: Cuenta Atrás de Sustos 
	 // Crea un método recursivo que simule una cuenta atrás desde un número hasta 0, 
	 // imprimiendo cada número con un mensaje tipo “¡Boo n!”. 
	 // Cuando llegue a 0, imprime “¡Susto final!”. 
	 
	 
	 public static void cuentaAtrasSustos(Integer n) {
		    if (n <= 0) {
		        System.out.println("¡Susto final!");
		    } else {
		        System.out.println("Boo " + n);
		        cuentaAtrasSustos(n - 1);
		    }
		}
	 

		 
//	 Ejercicio 6 — La suma entre los dos ceros 
//	 Hacer un método que reciba una lista de enteros de la cual conocemos que tiene 
//	 dos ceros. Calcula la suma de los números que hay entre esos dos ceros . 
	 
	 public static Integer sumaEntreCeros(List<Integer> numeros) {

		    Integer suma = 0;
		    Integer primero = calculaPosPrimerCero(numeros);
		    Integer segundo = calculaPosSegundoCero(numeros);

		    for (int i = primero + 1; i < segundo; i++) {
		        suma += numeros.get(i);
		    }

		    return suma;
		}

	 
	 public static Integer sumaEntreCeros2(List<Integer> numeros) {
		    Integer suma = 0;
		    Integer primero = numeros.indexOf(0);
		    Integer ultimo = numeros.lastIndexOf(0);

		    for (int i = primero + 1; i < ultimo; i++) {
		        suma += numeros.get(i);
		    }

		    return suma;
		}
	 
}

