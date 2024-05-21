package p3.dependencia;


// Podemos declarar la clase como abstracta y utilizar métodos estáticos (no requiere instanciar la factoría)

public abstract class Factoria {

	// La factoría pertenece al mismo paquete que la clase Z luego puede hacer uso de la misma (tiene
	// derechos de paquete). La factoría, al igual que su método estático, es pública lo que permite
	// a cualquier cliente hacer uso de ella.
	
	public static Z obtenerZ(int valor) {
		return new Z(valor);
	}
	
}