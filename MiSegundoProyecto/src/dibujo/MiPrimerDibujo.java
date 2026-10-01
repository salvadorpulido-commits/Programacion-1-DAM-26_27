package dibujo;

public class MiPrimerDibujo {

	public static void main(String[] args) {
		// Voy a hacer un dibujo

		for (int j = 0; j < 4; j++) {

			for (int i = 0; i < 5; i++) {

				if (i%2==0) {
					System.out.print(" * ");
				}
				else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
System.out.println(7.0/2);
	}

}