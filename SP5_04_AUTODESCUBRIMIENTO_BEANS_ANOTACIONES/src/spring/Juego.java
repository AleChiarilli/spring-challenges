package spring;


// CLASE MADRE ABSTRACTA DE TODOS LOS JUEGOS ... Reutilización de atributos y funcionalidad.
public abstract class Juego {

	protected String nombre;
	
	
	public Juego() {
		nombre = getClass().getSimpleName(); // Nombre del objeto Hija que invoca a este constructor.
	}
	
	
	public String consultarNombre() {
		return nombre;
	}

}