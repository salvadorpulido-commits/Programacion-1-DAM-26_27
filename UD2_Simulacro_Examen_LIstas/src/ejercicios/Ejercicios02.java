package ejercicios;

public class Ejercicios02 {
	
	//Ejercicio 01

	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
				
		
		if (edad <0) {
			return -1;
		}
		
		Integer precioBase;
			
		switch (dia) {
		case "LUNES":
		case "MARTES":
		case "MIERCOLES":
		case "JUEVES":
			precioBase = 8;
			break;
		case "VIERNES":
			precioBase = 10;
			break;
		case "SABADO":
		case "DOMINGO":
			precioBase = 12;
			break;
			
			default:				
			return -1;
		
		}	
		
		Integer precio = precioBase;

		if (edad < 12 || edad >= 65) {
			precio = precio -3;
						
		}
		
		if (socio) {
			precio = precio -2;
			
		}
		
		return precio;
		
}
	
	// Ejercicio 02
	
	public static void dibujarZ(Integer lado) {
		
		
	 for (int i = 0; i < lado; i++) {
		 for (int j = 0; j < lado ; j++) {
			
			
		}
		
		
	}
		
		
		
	}

}
