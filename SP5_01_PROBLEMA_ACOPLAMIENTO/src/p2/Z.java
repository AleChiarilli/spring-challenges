package p2;


public class Z {	
	
	private int valor;

	// Hemos reemplazado el constructor implícito por uno parametrizado (pide un int).
	// Todas las clases dependientes generarán error hasta que las adaptemos a las nuevas circunstancias.
	public Z(int valor) {
		this.valor = valor;
	}
	
	
	public int consultarValor() {
		return valor;
	}
	
}
