package p3.dependencia;


// Encapsulación de paquete (la clase no puede verse desde fuera).
// La clase implementa la interfaz IZ, siendo su manejador.

class Z implements IZ {	
	
	private int valor;

	
	public Z(int valor) {
		this.valor = valor;
	}
	
	
	public int consultarValor() {
		return valor;
	}
	
}