package ejercicioExamen03;

import java.util.ArrayList;
import java.util.List;

public class EjercicioExamen03 {
	
public static void main(String[] args) {
		
		//Metodo main
		
		List<Integer> lis = new ArrayList<>();
		lis.add(7);lis.add(4);lis.add(3);lis.add(12);
		
		List<Integer> recorrido = List.of(2, 3, 4, -1, 5);
		System.out.println(pasosLaberinto(recorrido));
	}


	public static Integer pasosLaberinto(List<Integer> pasos) {	
		Integer suma = 0;
		int i= 0;
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

}


// Otra solucion mas simple


//package ejercicioExamen03;
//
//import java.util.List;
//
//public class EjercicioExamen03 {
//
//	public static void main(String[] args) {
//		List<Integer> recorrido = List.of(2, 3, 4, -1, 5);
//		System.out.println(pasosLaberinto(recorrido)); // 9
//	}
//
//	public static Integer pasosLaberinto(List<Integer> pasos) {
//		Integer suma = 0;
//		Integer i = 0;
//		while (i < pasos.size()) {
//			Integer paso = pasos.get(i);
//			if (paso < 0) {
//				break; // trampa: el negativo no se suma
//			}
//			suma += paso;
//			i++;
//		}
//		return suma;
//	}
//}
 
