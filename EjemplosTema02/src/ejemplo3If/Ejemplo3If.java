package ejemplo3If;

public class Ejemplo3If {

	public static void main(String[] args) {
	
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
