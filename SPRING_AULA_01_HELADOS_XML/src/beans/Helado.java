package beans;

public abstract class Helado {

	protected String nombre;
	protected int precio;
	
	public Helado(int precio) {
		nombre = getClass().getSimpleName().toUpperCase();
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return nombre + " : " + precio + " pesetas";
	}
	
	
}
