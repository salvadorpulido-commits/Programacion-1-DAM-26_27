package ejercicio03;

public class Ejercicio03 {
	
	/* Escribir un programa que pida al usuario un mes y un año y 
	 * que muestre por pantalla el número total de días que tiene ese mes de ese año. 
	 * Hay que considerar que los meses de febrero pueden tener 29 o 28 días 
	 * según el año sea o no bisiesto.
	 */


	public static void main(String[] args) {
		
		// Variables
		
		Integer anio = 2000;
		Integer mes = 6;
		Integer dias = null;
		Boolean bisiesto = anio%400==0 || (anio%4==0 && anio%100!=0);
		
		if (mes == 2) {
			if (bisiesto) {
				dias = 29;
			} else {
				dias = 28;
			}
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dias = 30;
		} else {
			dias = 31;
		}

		System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " días");
	}
}

