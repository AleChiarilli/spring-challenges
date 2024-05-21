// La clase A (cliente) necesita de la clase Z (dependencia) para lo cual crea por si misma (new)
// una instancia de dicha clase Z.

// CUANDO UNA CLASE INSTANCIA A OTRA, SE PRODUCE UN EFECTO DE ACOPLAMIENTO FUERTE, YA QUE NECESITA
// CONOCER EN DETALLE CÓMO ES LA CLASE QUE ESTÁ MATERIALIZANDO (qué constructor debe usar y cuáles
// son los parámetros que debe enviarle).


package p0;


public class A {

	private Z z;		// DEPENDENCIA.

	
	public A() {
		z = new Z();	// ACOPLAMIENTO FUERTE.
	}

}