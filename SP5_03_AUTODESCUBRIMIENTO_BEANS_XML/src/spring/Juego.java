package spring;


// CLASE MADRE ABSTRACTA DE TODOS LOS JUEGOS ... Reutilización de atributos y funcionalidad.
//
// NO SE DEBE TRATAR DE REGISTRAR NI LAS CLASES ABSTRACTAS (no pueden instanciarse y el sistema no
// tendrá ningún problema en reconocerlas como supertipos) NI LAS INTERFACES (no se pueden instanciar,
// ni tienen constructor y de igual forma, se reconocerán como supertipos).

public abstract class Juego {

	protected String nombre;
	
	
	public Juego() {
		nombre = getClass().getSimpleName(); // Nombre del objeto Hija que invoca a este constructor.
	}
	
	
	public String consultarNombre() {
		return nombre;
	}

}