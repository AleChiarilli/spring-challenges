// Otro cliente de Z que debe ajustarse a los cambios que ésta ha realizado.


package p2;


public class B {

	private Z z;		// DEPENDENCIA
	
	
	public B() {
		z = new Z(84);
	}	
	
}