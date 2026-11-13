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


		/*Recibe el peso del paquete en kg y el destino ("NACIONAL", "EUROPA" o "MUNDO") y devuelve el precio en euros. 
		 * Tarifa base: 5 € nacional, 12 € Europa, 25 € mundo. 
		 * Recargo por peso: hasta 5 kg no hay recargo, de más de 5 a 20 kg se suman 3 €, y de más de 20 kg se suman 8 €. 
		 * Si el peso es 0 o negativo o supera los 50 kg, o el destino no existe, devuelve -1.
		 */
	
	public static Integer precioEnvio(Integer peso, String destino) {

	    // Peso fuera del rango admitido
	    if (peso <= 0 || peso > 50) {
	        return -1;
	    }

	    // Tarifa base según el destino
	    Integer precio;
	    if (destino.equals("NACIONAL")) {
	        precio = 5;
	    } else if (destino.equals("EUROPA")) {
	        precio = 12;
	    } else if (destino.equals("MUNDO")) {
	        precio = 25;
	    } else {
	        return -1;   // destino que no existe
	    }

	    // Recargo por peso (los límites 5 y 20 pertenecen al tramo de abajo)
	    if (peso > 20) {
	        precio = precio + 8;
	    } else if (peso > 5) {
	        precio = precio + 3;
	    }
	    // Hasta 5 kg no hay recargo, y por eso no hace falta else

	    return precio;
	}
	


		//System.out.println("\n--- PRECIO ENVIO ---");
		//System.out.println("(1, MUNDO)= " + Ejercicio01.precioEnvio(1, "MUNDO"));         // esperado 25
		//System.out.println("(3, NACIONAL)= " + Ejercicio01.precioEnvio(3, "NACIONAL"));   // esperado 5
		//System.out.println("(5, NACIONAL)= " + Ejercicio01.precioEnvio(5, "NACIONAL"));   // esperado 5 (límite: sin recargo)
		//System.out.println("(6, NACIONAL)= " + Ejercicio01.precioEnvio(6, "NACIONAL"));   // esperado 8 (5 + 3)
		//System.out.println("(20, EUROPA)= " + Ejercicio01.precioEnvio(20, "EUROPA"));     // esperado 15 (12 + 3, límite)
		//System.out.println("(21, EUROPA)= " + Ejercicio01.precioEnvio(21, "EUROPA"));     // esperado 20 (12 + 8)
		//System.out.println("(50, MUNDO)= " + Ejercicio01.precioEnvio(50, "MUNDO"));       // esperado 33 (25 + 8)
		//System.out.println("(51, MUNDO)= " + Ejercicio01.precioEnvio(51, "MUNDO"));       // esperado -1 (demasiado pesado)
		//System.out.println("(0, MUNDO)= " + Ejercicio01.precioEnvio(0, "MUNDO"));         // esperado -1 (peso no válido)
		//System.out.println("(10, MARTE)= " + Ejercicio01.precioEnvio(10, "MARTE"));       // esperado -1 (destino que no existe)

		
		/* 
		 * Recibe la velocidad del coche y el límite de la vía, y devuelve la multa en euros. Sin exceso no hay multa. 
		 * Con un exceso de hasta 20 km/h son 100 €, de más de 20 hasta 40 son 300 €, y de más de 40 son 600 €. 
		 * Si la velocidad es negativa o el límite es 0 o negativo, devuelve -1.
		 */

		public static Integer multaVelocidad(Integer velocidad, Integer limite) {
		
		    // Datos no válidos
		    if (velocidad < 0 || limite <= 0) {
		        return -1;
		    }
		
		    // Km/h por encima del límite (puede ser 0 o negativo si va bien)
		    Integer exceso = velocidad - limite;
		
		    if (exceso <= 0) {
		        return 0;
		    } else if (exceso <= 20) {
		        return 100;
		    } else if (exceso <= 40) {
		        return 300;
		    } else {
		        return 600;
		    }
		}
		
//  	System.out.println("\n--- MULTA VELOCIDAD ---");
//		System.out.println("(30, 50)= " + Ejercicio01.multaVelocidad(30, 50));    // esperado 0 (va por debajo)
//		System.out.println("(50, 50)= " + Ejercicio01.multaVelocidad(50, 50));    // esperado 0 (justo en el límite)
//		System.out.println("(60, 50)= " + Ejercicio01.multaVelocidad(60, 50));    // esperado 100 (exceso 10)
//		System.out.println("(70, 50)= " + Ejercicio01.multaVelocidad(70, 50));    // esperado 100 (exceso 20, límite)
//		System.out.println("(71, 50)= " + Ejercicio01.multaVelocidad(71, 50));    // esperado 300 (exceso 21)
//		System.out.println("(90, 50)= " + Ejercicio01.multaVelocidad(90, 50));    // esperado 300 (exceso 40, límite)
//		System.out.println("(91, 50)= " + Ejercicio01.multaVelocidad(91, 50));    // esperado 600 (exceso 41)
//		System.out.println("(-5, 50)= " + Ejercicio01.multaVelocidad(-5, 50));    // esperado -1 (velocidad no válida)
//		System.out.println("(50, 0)= " + Ejercicio01.multaVelocidad(50, 0));      // esperado -1 (límite no válido)
		
		
		
		/* Recibe el importe de la compra en euros, si el cliente es socio y un código de cupón, y devuelve el precio final. 
		 * El descuento base depende del importe: 15 % desde 200 €, 10 % desde 100 € y 5 % desde 50 €. 
		 * Los socios suman 5 puntos más. El cupón "EXTRA10" suma 10 puntos, pero solo si el importe es al menos 100 €. 
		 * El descuento total nunca supera el 25 %. El descuento se calcula con enteros (se redondea hacia abajo). 
		 * Si el importe es 0 o negativo, devuelve -1.
		 */
		
		public static Integer precioConDescuento(Integer importe, Boolean socio, String cupon) {

		    // Importe no válido
		    if (importe <= 0) {
		        return -1;
		    }

		    // Porcentaje base según el importe (de mayor a menor)
		    Integer porcentaje;
		    if (importe >= 200) {
		        porcentaje = 15;
		    } else if (importe >= 100) {
		        porcentaje = 10;
		    } else if (importe >= 50) {
		        porcentaje = 5;
		    } else {
		        porcentaje = 0;
		    }

		    // Los descuentos se acumulan, así que son if separados
		    if (socio) {
		        porcentaje = porcentaje + 5;
		    }
		    if (cupon.equals("EXTRA10") && importe >= 100) {
		        porcentaje = porcentaje + 10;
		    }

		    // Tope del 25 %
		    if (porcentaje > 25) {
		        porcentaje = 25;
		    }

		    // Se multiplica antes de dividir para no perder precisión
		    Integer descuento = importe * porcentaje / 100;

		    return importe - descuento;
		}
		
//      System.out.println("\n--- PRECIO CON DESCUENTO ---");
//		System.out.println("(40, false, NINGUNO)= " + Ejercicio01.precioConDescuento(40, false, "NINGUNO"));      // esperado 40 (0 %)
//		System.out.println("(40, true, NINGUNO)= " + Ejercicio01.precioConDescuento(40, true, "NINGUNO"));        // esperado 38 (5 % socio)
//		System.out.println("(50, false, NINGUNO)= " + Ejercicio01.precioConDescuento(50, false, "NINGUNO"));      // esperado 48 (5 % de 50 es 2,5 y se redondea a 2)
//		System.out.println("(100, false, NINGUNO)= " + Ejercicio01.precioConDescuento(100, false, "NINGUNO"));    // esperado 90 (10 %)
//		System.out.println("(200, false, NINGUNO)= " + Ejercicio01.precioConDescuento(200, false, "NINGUNO"));    // esperado 170 (15 %)
//		System.out.println("(100, true, NINGUNO)= " + Ejercicio01.precioConDescuento(100, true, "NINGUNO"));      // esperado 85 (15 %)
//		System.out.println("(100, false, EXTRA10)= " + Ejercicio01.precioConDescuento(100, false, "EXTRA10"));    // esperado 80 (20 %)
//		System.out.println("(100, true, EXTRA10)= " + Ejercicio01.precioConDescuento(100, true, "EXTRA10"));      // esperado 75 (25 %)
//		System.out.println("(200, true, EXTRA10)= " + Ejercicio01.precioConDescuento(200, true, "EXTRA10"));      // esperado 150 (sumaría 30 %, pero el tope es 25 %)
//		System.out.println("(80, false, EXTRA10)= " + Ejercicio01.precioConDescuento(80, false, "EXTRA10"));      // esperado 76 (el cupón no vale con menos de 100: solo 5 %)
//		System.out.println("(80, true, EXTRA10)= " + Ejercicio01.precioConDescuento(80, true, "EXTRA10"));        // esperado 72 (10 %)
//		System.out.println("(0, true, NINGUNO)= " + Ejercicio01.precioConDescuento(0, true, "NINGUNO"));          // esperado -1
//		System.out.println("(-5, false, NINGUNO)= " + Ejercicio01.precioConDescuento(-5, false, "NINGUNO"));      // esperado -1
		
		
		/*
		 * Recibe dos enteros y un operador ("+", "-", "*" o "/") y devuelve el resultado. 
		 * La división es entera. Si el operador no existe o se divide entre 0, devuelve null.
		 */
		
		public static Integer operar(Integer a, Integer b, String operador) {

		    if (operador.equals("+")) {
		        return a + b;
		    } else if (operador.equals("-")) {
		        return a - b;
		    } else if (operador.equals("*")) {
		        return a * b;
		    } else if (operador.equals("/")) {
		        // La división entre 0 no se puede hacer: se devuelve null
		        if (b == 0) {
		            return null;
		        }
		        return a / b;
		    } else {
		        // Operador que no existe
		        return null;
		    }
		}
		
//		System.out.println("\n--- CALCULADORA ---");
//		System.out.println("(6, 3, +)= " + Ejercicio01.operar(6, 3, "+"));    // esperado 9
//		System.out.println("(6, 3, -)= " + Ejercicio01.operar(6, 3, "-"));    // esperado 3
//		System.out.println("(6, 3, *)= " + Ejercicio01.operar(6, 3, "*"));    // esperado 18
//		System.out.println("(6, 3, /)= " + Ejercicio01.operar(6, 3, "/"));    // esperado 2
//		System.out.println("(7, 2, /)= " + Ejercicio01.operar(7, 2, "/"));    // esperado 3 (división entera)
//		System.out.println("(0, 5, /)= " + Ejercicio01.operar(0, 5, "/"));    // esperado 0 (0 dividido entre algo sí se puede)
//		System.out.println("(7, 0, /)= " + Ejercicio01.operar(7, 0, "/"));    // esperado null (división entre 0)
//		System.out.println("(7, 0, *)= " + Ejercicio01.operar(7, 0, "*"));    // esperado 0 (multiplicar por 0 es válido)
//		System.out.println("(5, 2, %)= " + Ejercicio01.operar(5, 2, "%"));    // esperado null (operador que no existe)
		
}
				