// Lo más habitual es que existan varios clientes para una misma dependencia, lo que obligará a adaptarlos a
// todos y a cada uno de ellos. Se requieren muchos cambios, volviéndose el sistema difícil de mantener.


package p2;


public class A {

	private Z z;		// DEPENDENCIA
	
	
	public A() {
		z = new Z(73);
	}	
	
}