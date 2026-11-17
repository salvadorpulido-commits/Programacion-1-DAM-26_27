package tipos;

public class Caballo {
	private String id;
	private String nombre;
	private Raza raza;
	private Integer victorias;
	private Double velocidad;
	public Caballo(String id, String nombre, Raza raza, Double velocidad) {
		
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.velocidad = velocidad;
		this.victorias = 0;
		
	}
	
	
	
}
