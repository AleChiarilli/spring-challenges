// MUY IMPORTANTE, CUANDO NO DISPONEMOS DE INTERNET Y TRAS AÑADIR LAS LIBRERIAS DE SPRING AL PROYECTO:
//
//		1) borrar el fichero module o no importará correctamente las clases externas (Spring).
//		2) el fichero de configuración de Spring (xml) genera errores pero funciona OK.

//				.. INVESTIGAR QUÉ PASA CON ESTA VERSIÓN DE SPRING 
//					(error while dowloading - probar con conexión a internet).
//						si cierro el fichero applicationContext.xml ya no muestra punto de error, es sólo
//						cuando lo estoy visualizando.




// Registro y recuperación más básico de un bean que puede darse en Spring.


package p4.spring;


import org.apache.log4j.varia.NullAppender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


// Sólo conocemos Iproducto, no la clase que la implementa (BAJO ACOPLAMIENTO).


public class Prueba {

	public static void main(String[] args) {
		
		// PARA EJECUTAR ESTA CLASE DE PRUEBA:
		//		BOTÓN DERECHO - RUN AS - 1 JAVA APPLICATION.
		
		
		// DESACTIVAR LA CONFIGURACIÓN Log4j ASOCIADA A SPRING:
		org.apache.log4j.BasicConfigurator.configure(new NullAppender());
		
		
		// PROCESO PARA RECUPERAR LOS BEANS REGISTRADOS EN EL CATÁLOGO DE SPRING.
		
		// 1. Obtener la factoría de objetos de Spring ... el catálogo de beans.
		//		el fichero descriptor applicationContext.xml, lo hemos colocado en la carpeta:
		//		p4.spring dentro del classpath de la aplicación (carpeta src)
		ApplicationContext spring = new ClassPathXmlApplicationContext("p4/spring/applicationContext.xml");
		
		
		// 2. Solicitar un objeto del catálogo. OPCIONES:
		// 		2.a. Utilizando el nombre con el que se registró, su id (requiere Casting porque se devuelve como Object).
		// 		Utilizamos IeC ... carga polimórfica ... se devuelve un objeto (referencia C) que cumple "que es" la interfaz I.
		IProducto producto1 = (IProducto)spring.getBean("producto");
		System.out.println("a) (IProducto)catalogo.getBean(\"producto\") --> \n\t" +
													"producto1: " + producto1 + "\n\n");
		
		// 		2.b. Utilizando su .class (no requiere Casting pero sólo 1 bean debe cumplir con la regla IS-A o tendremos ambigüedad == ERROR).
		IProducto producto2 = spring.getBean(IProducto.class);
		System.out.println("b) catalogo.getBean(IProducto.class) --> \n\t" +
													"producto2: " + producto2 + "\n\n");
		
		// 		2.c. Utilizando el nombre con el que se registró y su .class (no requiere casting y resuelve la posible ambigüedad).
		//				* PRIMERO EL NOMBRE_LÓGICO/NOMBRE_REGISTRO Y A CONTINUACIÓN EL CLASS.
		IProducto producto3 = spring.getBean("producto", IProducto.class);
		System.out.println("c) catalogo.getBean(\"producto\", IProducto.class) ---> \n\t" +
													"producto3: " + producto3 + "\n\n");
		
		// SI DECLARAMOS MÉTODOS EN LA INTERFAZ DE NEGOCIO (POJI), PODREMOS HACER USO DE ELLOS A TRAVÉS
		// DE LAZY-BINDING SOBRE EL OBJETO CON EL QUE CARGUEMOS LA REFERENCIA.

		
		
		
		// CIERRE DE LA FACTORÍA:
		((ConfigurableApplicationContext) spring).close();
		
		//System.out.println("\n>>> >>> " + catalogo);
		
		// SI INTENTAMOS SOLICITAR BEANS A LA FACTORÍA YA CERRADA GENERARÁ UNA EXCEPCIÓN (... or already closed):
		//System.out.println("\n... ... " + catalogo.getBean(IProducto.class));
		
		/*
			Exception in thread "main" java.lang.IllegalStateException: BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
				at org.springframework.context.support.AbstractRefreshableApplicationContext.getBeanFactory(AbstractRefreshableApplicationContext.java:172)
				at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1101)
				at p4.spring.Prueba.main(Prueba.java:74)
		 */
		
	}

}



/* 

							RESULTADO:
														
							
							... Se ha llamado al constructor por defecto.
							
							a) (IProducto)catalogo.getBean("producto") --> 
								producto1: NOMBRE = GASOLINA - PRECIO = 1.4
							
							
							b) catalogo.getBean(IProducto.class) --> 
								producto2: NOMBRE = GASOLINA - PRECIO = 1.4
							
							
							c) catalogo.getBean("producto", IProducto.class) ---> 
								producto3: NOMBRE = GASOLINA - PRECIO = 1.4


*/
