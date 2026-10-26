package ejercicios;

import java.util.Iterator;
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
	// Crea un método que reciba una lista y cuente cuántos hay de un tipo dado, 
	// ignorando nulos. 
	 
	 public static Integer cuentaCaramelos(List<String> caramelos, 
			 String tipo) {
		 
		 Integer contador = 0;
		 
		 for (String caramelo : caramelos) {
			 if (caramelo == null) {
				 continue;
				
			}
			
			 if (caramelo.equals(tipo)) {
				contador++;
			
			}
		}
		 
	return contador;
	 }
    
}
