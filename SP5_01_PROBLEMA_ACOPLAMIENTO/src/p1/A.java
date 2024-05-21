// Ahora vamos a obligar a que la clase Z cambie la forma en la que es instanciada, para lo que
// modificaremos la firma de su constructor simplemente solicitando un valor entero.

// LA CLASE A GENERARÁ UN ERROR AL INSTANCIAR A Z MEDIANTE new Z() DADO QUE DICHO CONSTRUCTOR
// YA NO EXISTE (podríamos haberlo dejado pero queremos ver que con acoplamiento fuerte, si
// cambia la dependencia se obliga a cambiar también al cliente que la usa, lo cual no es
// de ninguna forma aceptable en el diseño de sistemas fácilmente mantenibles ... el 80% del
// ciclo de vida de una aplicación es precisamente mantenimiento - correctivo y evolutivo, luego
// ahí es dónde está el verdadero coste económico de la misma !!! EL DINERO QUÉ CUESTA TENERLA
// EN BUEN FUNCIONAMIENTO !!!).


package p1;


public class A {

	private Z z;		// DEPENDENCIA
	
	
	// ESTE CONSTRUCTOR YA NO SIRVE (no compila).
	/*
	public A() {
		z = new Z();
	}
	*/
	
	// NUEVO CONSTRUCTOR DE A ... NOS VEMOS OBLIGADOS A CAMBIAR EL CLIENTE.
	public A() {
		z = new Z(73);	// RECUERDA SIEMPRE QUE EL SIMPLE USO DE new GENERA ACOPLAMIENTO FUERTE !!!.
	}
	
}