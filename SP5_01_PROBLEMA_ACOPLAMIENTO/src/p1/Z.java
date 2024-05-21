package p1;


public class Z {	

	// Reemplazamos el constructor implícito por uno parametrizado (pide un int).
	//
	// La clase A generará error hasta que la adaptemos a las nuevas circunstancias.
	//
	// El qué hacemos con el parámetro valor (nada en este caso) no es relevante para
	//	justificar el problema del acoplamiento.
	public Z(int valor) {}
	
}