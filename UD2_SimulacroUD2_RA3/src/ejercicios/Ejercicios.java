package ejercicios;

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

}

//}
//	
//	// Ejercicio 02
//	
//	public static void dibujarZ(Integer lado) {
//		
//		
//	 for (int i = 0; i < lado; i++) {
//		 for (int j = 0; j < lado ; j++) {
//			
//			
//		}
//		
//		
//	}
//		
//		
//		
//	}
//
//}
