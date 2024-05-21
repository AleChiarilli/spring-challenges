package spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// EL USO DE LA ANOTACIÓN @Configuration REQUIERE DE LA LIBRERÍA CGLIB:
//		Exception in thread "main" java.lang.IllegalStateException: CGLIB is required to 
//		process @Configuration classes. Either add CGLIB to the classpath or remove the 
//		following @Configuration bean definitions: [factoria]

// ... Y DE LA LIBRERÍA ASM:
//		Exception in thread "main" java.lang.IllegalStateException: Cannot load configuration
//			class: spring.Factoria
//		Caused by: java.lang.NoClassDefFoundError: org/objectweb/asm/Type
//		Caused by: java.lang.ClassNotFoundException: org.objectweb.asm.Type


// ESTA ANOTACIÓN (@Configuration) ESTABLECE / DESIGNA LA CLASE COMO FACTORÍA DE BEANS (Java Based)
//
// ANOTACIÓN A NIVEL DE CLASE:
//
@Configuration
public class FactoriaLapizPapelJavaBased {

	// ANOTACIONES A NIVEL DE MÉTODO:
	
	
	// ES NECESARIO REGISTRAR EL MÉTODO QUE GENERARÁ (new) Y DEVOLVERÁ (return) EL BEAN, 
	//	CON LA ANOTACIÓN @Bean.
	//
	// EL BEAN REGISTRADO ES LA DEVOLUCIÓN (return) Y SU ALIAS ES EL NOMBRE DE LA CLASE 
	//	DEVUELTA CON LA PRIMERA LETRA EN MINÚSCULAS.
	//
	// EN ESTE CASO, EL MÉTODO ObtenerLapiz() DEVUELVE UN BEAN Lapiz --> alias = "lapiz"
	//
	@Bean 
	public Lapiz obtenerLapiz() {		
		System.out.println("\n\t >>> !! FACTORIA: SE SOLICITA EL BEAN Lapiz !!. \n");
		return new Lapiz();
	}

	
	
	// TAMBIÉN PUEDE ASIGNARSE UN ALIAS PERSONALIZADO AL MÉTODO DE FACTORÍA.
	//		@Resource(name="celulosa").
	//		private Papel papel;
	//
	//
	@Bean(name="celulosa")		 
	public Papel obtenerPapel() {		
		System.out.println("\n\t >>> !! FACTORIA: SE SOLICITA EL BEAN Papel (alias celulosa) !!. \n");
		return new Papel();				
	}
	
}