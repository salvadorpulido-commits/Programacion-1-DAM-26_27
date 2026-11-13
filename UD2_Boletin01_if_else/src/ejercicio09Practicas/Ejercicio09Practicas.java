package ejercicio09Practicas;

public class Ejercicio09Practicas {
	
	/*Un módulo se califica con la nota del examen (0 a 10), la nota de prácticas (0 a 10) y el porcentaje 
	 * de asistencia (0 a 100). Devuelve el resultado como texto, aplicando estas reglas por este orden:
	 * 
	 * Si algún dato está fuera de su rango: "DATOS NO VALIDOS".
	 * Si la asistencia es menor que 80: "SIN DERECHO A EVALUACION".
	 
	 * Si el examen es menor que 4, aunque la media sea alta: "SUSPENSO".
	 * En otro caso se calcula la media, con el examen al 70 % y las prácticas al 30 %, y se clasifica así: 
	 * menos de 5 "SUSPENSO", de 5 a menos de 7 "APROBADO", de 7 a menos de 9 "NOTABLE", y 9 o más "SOBRESALIENTE".
	 */

	public static String calificacion(Integer examen, Integer practicas, Integer asistencia) {

	    // Regla 1: datos fuera de rango (notas de 0 a 10, asistencia de 0 a 100)
	    if (examen < 0 || examen > 10 || practicas < 0 || practicas > 10
	            || asistencia < 0 || asistencia > 100) {
	        return "DATOS NO VALIDOS";
	    }

	    // Regla 2: con menos del 80 % de asistencia no se evalúa
	    if (asistencia < 80) {
	        return "SIN DERECHO A EVALUACION";
	    }

	    // Regla 3: con el examen por debajo de 4 se suspende, aunque la media sea alta
	    if (examen < 4) {
	        return "SUSPENSO";
	    }

	    // Media multiplicada por 10 (examen al 70 % y prácticas al 30 %), para trabajar solo con enteros
	    Integer mediaPor10 = examen * 7 + practicas * 3;

	    // Regla 4: clasificación según la media (los límites 50, 70 y 90 pertenecen a la categoría de arriba)
	    if (mediaPor10 < 50) {
	        return "SUSPENSO";
	    } else if (mediaPor10 < 70) {
	        return "APROBADO";
	    } else if (mediaPor10 < 90) {
	        return "NOTABLE";
	    } else {
	        return "SOBRESALIENTE";
	    }
	}
		//	System.out.println("\n--- CALIFICACION ---");
		//	System.out.println("(8, 6, 90)= " + Ejercicio01.calificacion(8, 6, 90));        // esperado NOTABLE (56 + 18 = 74)
		//	System.out.println("(10, 10, 100)= " + Ejercicio01.calificacion(10, 10, 100));  // esperado SOBRESALIENTE
		//	System.out.println("(9, 9, 100)= " + Ejercicio01.calificacion(9, 9, 100));      // esperado SOBRESALIENTE (63 + 27 = 90, justo en el límite)
		//	System.out.println("(7, 7, 80)= " + Ejercicio01.calificacion(7, 7, 80));        // esperado NOTABLE (49 + 21 = 70, justo en el límite)
		//	System.out.println("(5, 5, 80)= " + Ejercicio01.calificacion(5, 5, 80));        // esperado APROBADO (35 + 15 = 50, justo en el límite)
		//	System.out.println("(6, 5, 80)= " + Ejercicio01.calificacion(6, 5, 80));        // esperado APROBADO (42 + 15 = 57)
		//	System.out.println("(5, 4, 80)= " + Ejercicio01.calificacion(5, 4, 80));        // esperado SUSPENSO (35 + 12 = 47)
		//	System.out.println("(3, 10, 95)= " + Ejercicio01.calificacion(3, 10, 95));      // esperado SUSPENSO (examen menor que 4, aunque la media sea 51)
		//	System.out.println("(6, 6, 79)= " + Ejercicio01.calificacion(6, 6, 79));        // esperado SIN DERECHO A EVALUACION
		//	System.out.println("(11, 5, 90)= " + Ejercicio01.calificacion(11, 5, 90));      // esperado DATOS NO VALIDOS (examen fuera de rango)
		//	System.out.println("(6, 6, 101)= " + Ejercicio01.calificacion(6, 6, 101));      // esperado DATOS NO VALIDOS (asistencia fuera de rango)



}
