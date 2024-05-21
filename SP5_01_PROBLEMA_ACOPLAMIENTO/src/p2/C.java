// Y otro cliente más de Z que también debe ajustarse a los cambios que ésta ha realizado ... podemos tener
// decenas de clases dependientes de ésta y que a su vez, ellas mismas sean las dependencias de otras ...
// el código presentará un fuerte nivel de acoplamiento y los cambios serán complejos de realizarse si es
// que finalmente es posible implementarlos (en un castillo de naipes, el mover una simple carta puede hacer
// que todo el conjunto se desplome).


package p2;


public class C {

	private Z z;		// DEPENDENCIA
	
	
	public C() {
		z = new Z(95);
	}	
	
}