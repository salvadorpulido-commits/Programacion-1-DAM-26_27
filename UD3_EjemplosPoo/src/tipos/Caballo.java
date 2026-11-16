package tipos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


// hacer una clase Caballo con 5 propiedades:
//nombre tipo cadena (consultable)
//fechaNacimiento tipo LocalDate (consultable)
//Velocidad de tipo Doublñe (consultable y modificable)
//tipo de tipò enumerado (consultable y modificable)
//edad de tipo Integer (consultable)

	//Constructor por parametros

public class Caballo {
	//atributos o propiedades basica del tipo (clase)
	private final String nombre;
	private final LocalDate fechaNacimiento;
	private Double velocidad;
	private Tipo tipo;
	
	//boton derecho source + generate constructor using fields
	
	public Caballo(String nombre, LocalDate fechaNacimiento, Double velocidad, Tipo tipo) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.velocidad = velocidad;
		this.tipo = tipo;
	
	}

	//boton derecho source + create getters & setters
	
	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	//La edad es una propiedad derivada
	public Integer getedad() {
		return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.DAYS);
	}

	

	
	//Representacion como cadena:
	//Nombre del caballo y entre parentesis la edad
	
	//Boton derecho + generate to string y se cambia para poner lo que se pida
	
	@Override
	public String toString() {
		return nombre +"(" + getedad() + ")";
	}
	
	public String mostrarTodo() {
		return nombre + "-"  + fechaNacimiento.format(DateTimeFormatter.ofPattern("d:M:yyyy")) + "-" + velocidad + "-" + tipo ;
	}
}
