package inicio.beans;


public class FormularioAltaProductoBean {

	// PROPIEDADES DE LA CLASE == CAMPOS DEL FORMULARIO EN EL CLIENTE:
	private String nombre;
	private String departamento;
	private double precio;
	
	
	// GETTERS Y SETTERS:
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	// TO-STRING:
	@Override
	public String toString() {
		return "FormularioBean [nombre=" + nombre + ", departamento=" + departamento + 
					", precio=" + precio + "]";
	}
	
}