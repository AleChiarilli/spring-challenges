package p4.spring;


// LA CLASE JAVA (POJO) QUE QUEREMOS REGISTRAR EN EL CATÁLOGO DE SPRING (habitualmente se le llamará bean de Spring).
// Producto IMPLEMENTA LA INTERFAZ IProducto (Producto IS-A IProducto ... polimorfismo).


public class Producto implements IProducto {

	// PROPIEDADES SIMPLES:
	private String nombre;
	private double precio;

	
	// CONSTRUCTORES:
	public Producto() {
		System.out.println("\n... Se ha llamado al constructor por defecto.\n");
		nombre = "GASOLINA";
		precio = 1.40;
	}

	
	// SETTERS Y GETTERS:
	
	// SETTERS .. NECESARIOS PARA QUE SPRING PUEDA RELLENAR/INYECTAR LAS PROPIEDADES DE UN OBJETO (COMPOSICIÓN DE OBJETOS).
	// GETTERS .. SPRING NUNCA HARÁ USO DE ELLOS, SÓLO LOS UTILIZARÁ EL PROGRAMADOR PARA CONSULTAR LAS PROPIEDADES.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}	
	
	
	// MÉTODO toString:
	@Override
	public String toString() {
		return "NOMBRE = " + nombre + " - PRECIO = " + precio;
	}
	
}