// Lo que nos interesa es diseñar un sistema que permita futuros cambios (rápidos y sencillos) lo que
// pasa OBLIGATORIAMENTE por emplear elementos BAJAMENTE ACOPLADOS (además de altamente cohesivos, algo
// que es más propio de la funcionalidad interna de cada clase, el "qué sabes hacer o para qué vales" y
// el "cada uno a lo suyo" y es que es mejor disponer de 10 clases especializadas que no sólo de 1 que
// se encargue de hacerlo todo, ya que con el tiempo sería simple y llanamente inmantenible).
//
// Ésto se consigue mediante el uso de:
//
//	1. Una factoría que genere los objetos/instancias de dependencia (se encarga de hacer los new).
//
// 	2. El uso de interfaces (el acoplamiento 0 NO EXISTE pero el bajo sí y estos elementos lo ofrecen ...
//		no conocemos cómo funcionan los métodos por dentro, su código, sólo cómo se llaman y los 
//		parámetros de entrada que necesitan).

// Así, la factoría creará la instancia de la dependencia con la que rellenar el atributo de tipo
// interfaz en el cliente y éste se limitará a llamar a los métodos que se hayan declarado en la 
// misma (la máquina virtual efectúa lo que se conoce como resolución dinámica de métodos o "lazy-bidding",
// enlazado tardío o dinámico ... qué método, de qué objeto se ha de llamar, decidiéndose en tiempo de ejecución).

// Así, se llega a la regla IeC_F ... Interface = Class _ Factory ... o lo que es lo mismo, pídele el
// objeto a la factoría y manéjalo a través de su interfaz de negocio ("business interface").


// Pero ¿por qué usar Spring como factoría en lugar de crear la nuestra propia?:
//
// Si la factoría es la propia del framework Spring, estaremos haciendo uso de la mejor solución conocida
// hasta el momento, es decir, conseguiremos el mínimo acoplamiento posible y potenciaremos el mantenimiento
// del proyecto al máximo nivel, pero es que además Spring es una solución ESTÁNDAR por lo que todos los que
// hagan uso de proyectos desarrollados en base a este framework reconocerán rápidamente buena parte del 
// mismo, no teniendo que emplear gran cantidad de tiempo en descubrir cómo funcionan las soluciones propietarias.
//
// Pero es que Spring va mucho más allá de ser una simple factoría, ya que gracias a la denominada como
// inversión de control, ya no nos será ni siquiera necesario solicitar los beans puesto que se entregarán
// automáticamente. Para esta inversión de control (detectar la necesidad) e inyección de dependencias (cumplir
// con la necesidad) se nos ofrecen herramientas como el autodescubrimiento de beans, la inyección de valores
// o referencias a nivel de atributo, constructor o método, el autoenlazado, los cualificadores, la configuración
// por XML, @notaciones o basada en clases Java, junto a los más recientes Spring Boot, Spring Initializer o el
// STS:Spring Tool Suite para gestionar todo el ciclo de vida del proyecto, desde su desarrollo al despliegue,
// sin olvidar el necesario plan de pruebas (mocks - testing).
//
// Algo que hace igualmente potente a Spring es la voluntad y efectividad que siempre ha demostrado en integrarse
// con otras tecnologías de nueva hornada sin olvidar, que es una solución universal, es decir, que todos los 
// aspectos del proyecto pueden ser abordados por Spring ... seguridad, desarrollo web (MVC), servicios REST,
// programación reactiva ... y un largo etcetera.



// Nota: Es lógico pensar que la factoría presentará un acoplamiento fuerte con las clases que maneja, pero lo
// que nos importa, es que los clientes YA NO. De hecho, un cliente puede cambiar una depencia por otra siempre
// que cumpla con la interfaz que haya declarado para su tipo (POLIMORFISMO, una de las 4 bases fundamentales
//	de la Programación Orientada a Objetos).


package p3.cliente;


import p3.dependencia.Factoria;	// ANTES DE MANEJAR ALGO DEBEMOS IMPORTARLO, CONOCERLO.
import p3.dependencia.IZ;

//import p3.dependencia.Z; 	// ERROR, EL CLIENTE Y LA DEPENDENCIA NO ESTÁN EN EL MISMO PAQUETE Y NO SE PUEDE IMPORTAR.
							// ÉSTO OBLIGA A TODOS LOS CLIENTES A SOLICITAR LA INSTANCIA DE Z A LA FACTORÍA Y NO A 
							// FABRICARLA POR ELLOS MISMOS, AÚN A PESAR DE QUE SU CONSTRUCTOR SIGUE SIENDO PÚBLICO.
							//
							// LA ENCAPSULACIÓN DE PAQUETE PARA Z OBLIGA AL USO DE UNA INTERFAZ PÚBLICA CON LA
							// QUE MANEJARLA.

public class A {

	//private Z z;		// ERROR, NO PODEMOS MANEJAR LA CLASE Z DIRECTAMENTE (no se pudo importar) ...
						//
	private IZ z;		// ... PERO SÍ A TRAVÉS DE SU INTERFAZ.

	
	public A() {
		
		//z = new Z(73);	// ERROR, SI NO HEMOS PODIDO IMPORTAR Z TAMPOCO PODREMOS UTILIZARLA (no la conocemos).
		
		z = Factoria.obtenerZ(73); // PÍDELE A LA FACTORÍA (¿fabricas tú el pan o lo compras hecho?).
		
	}
	
	
	public void cuantoValeZ() {
		System.out.println("Z vale ... " + z.consultarValor());
	}

}