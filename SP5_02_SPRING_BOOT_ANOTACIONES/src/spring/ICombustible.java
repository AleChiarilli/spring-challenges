package spring;


// INTERFAZ DE USO QUE DECLARA EL CONTRATO (conjunto de métodos que el cliente podrá utilizar).
// 		ESTABLECE UN IS-A ENTRE LA INTERFAZ Y LA CLASE QUE LA IMPLEMENTA.

// !!! LAS INTERFACES NO SE REGISTRAN COMO BEANS DE SPRING, SÓLO LAS CLASES !!!
public interface ICombustible {
	
	public String consultarTipoPrecio();	
	
}