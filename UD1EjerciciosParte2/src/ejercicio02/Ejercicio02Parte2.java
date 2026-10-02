package ejercicio02;

import java.util.Scanner;

public class Ejercicio02Parte2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer totalSegundos = sc.nextInt();
		Integer horas = totalSegundos/3600;
		Integer minutos = (totalSegundos%3600)/60;
		Integer segundos = (totalSegundos%3600)%60;
		
		
		System.out.println(totalSegundos + " segundos son:");
		System.out.println(horas + " horas " + minutos + "minutos" + segundos + "segundos");
		
		
		sc.close();

	}

}

