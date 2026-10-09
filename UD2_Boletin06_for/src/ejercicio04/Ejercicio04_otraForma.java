package ejercicio04;

public class Ejercicio04_otraForma {

	public static void main(String[] args) {
		
		
		Integer suma = 0;
		Integer impares = 0;
		Integer n = 1;
		
		
		
		while (impares <= 10) {
			if(n%2!=0) {
				
				suma += n;
				impares++;				
			}
			
			n++;
			
		}
		
		System.out.println();

	}

}
