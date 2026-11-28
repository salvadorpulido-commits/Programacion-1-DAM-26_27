package tipos;

public class Coche {
	
	private final String matricula;
	private String marca;
	private String modelo;
	private Double precioEstimado;
	private Estado estado;
	
	
	public Coche(String matricula, String marca, String modelo, Double precioEstimado, Estado estado) {
		
		validarTexto(matricula, "La matrícula");
	    validarTexto(marca, "La marca");
	    validarTexto(modelo, "El modelo");
	    
	    validarPrecio(precioEstimado);
	    validarEstado(estado);
	    
	
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.precioEstimado = precioEstimado;
		this.estado = estado;
			
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		validarTexto(marca, "La marca");
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		validarTexto(modelo, "El modelo");
		this.modelo = modelo;
	}


	public Double getPrecioEstimado() {
		return precioEstimado;
	}


	public void setPrecioEstimado(Double precioEstimado) {
		validarPrecio(precioEstimado);
		this.precioEstimado = precioEstimado;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		validarEstado(estado);
		this.estado = estado;
	}


	public String getMatricula() {
		return matricula;
	}


	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", precioEstimado="
				+ precioEstimado + ", estado=" + estado + "]";
	}
	
	private static void validarTexto(String texto, String campo) {
	    if (texto == null || texto.isBlank()) {
	        throw new IllegalArgumentException(campo + " no puede estar vacío");
	    }
	}
	
	private static void validarPrecio(Double precioEstimado) {
		if (precioEstimado == null || precioEstimado <= 0) {
			throw new IllegalArgumentException("El precio debe ser mayor que 0");
		}
	}
	
	private static void validarEstado(Estado estado) {
		if (estado == null) {
			throw new IllegalArgumentException("El estado no puede estar vacio");
		}
	}

		
	public void aplicarDescuento (Double porcentaje) {
		if (porcentaje == null || porcentaje <= 0 || porcentaje > 20 ) {
			throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 20");
		}
		this.precioEstimado = this.precioEstimado - (this.precioEstimado * porcentaje / 100);
		
	}
	
	public Double calcularPrecioConIva() {
		return precioEstimado * 1.21;
		
	}
}
