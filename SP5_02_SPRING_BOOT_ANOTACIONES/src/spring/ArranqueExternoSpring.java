package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;


// ESTA CLASE SE ENCARGARÁ DE LEVANTAR EL CONTEXTO DE SPRING YA QUE IMPLEMENTA EL ESCUCHADOR
//		CommandLineRunner Y DEFINE SU MÉTODO run(String ... args)

// SERÁ LLAMADA DESDE LA CLASE BÁSICA Prueba2.java Y SU MÉTODO main (Prueba1.java hace de
//	clase de inicio en Java y a la vez de escuchador de arranque de Spring ... ambas formas
//	son válidas pero está es quizás más clara al separar las 2 partes)

// EL AUTOESCANEO POR ANOTACIONES DEBE UBICARSE EN LA CLASE ESCUCHADORA DE CommandLineRunner (salvo que
//	utilicemos S.B.A que ya lo lleva implícitamente, como es el caso de Prueba1.java).

@ComponentScan("spring")
public class ArranqueExternoSpring implements CommandLineRunner {

	// AUTO-INYECCIÓN (Spring buscará un bean que cumpla con la regla IS-A con respecto a esta interfaz).
	@Autowired
	private Coche coche;
	
	
	// MÉTODO OBLIGADO POR LA INTERFAZ CommandLineRunner Y QUE ACTUARÁ COMO EL run DE LOS HILOS, ES DECIR,
	//	ESCRIBIR EN ÉL LO QUE QUERAMOS QUE HAGA LA CLASE.
	@Override
	public void run(String ... args) throws Exception {
		System.out.println("\n\n");
		System.out.println(">>> ARRANQUE [2] DE SPRING BOOT \n");
		System.out.println(">>> COCHE " + coche.hashCode() + " ---> COMBUSTIBLE = " + coche.consultarCombustible());
		
		System.out.println("\n\nTAMBIEN SE ARRANCAN EL RESTO DE LISTENERS (iniciara el [1])");
		
	}

}



/*


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.3)

2023-09-15T22:21:43.919+02:00  INFO 5344 --- [  restartedMain] spring.Prueba2                           : Starting Prueba2 using Java 17.0.7 with PID 5344 (C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_02_SPRING_BOOT_ANOTACIONES\bin started by Usuario in C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_02_SPRING_BOOT_ANOTACIONES)
2023-09-15T22:21:43.930+02:00  INFO 5344 --- [  restartedMain] spring.Prueba2                           : No active profile set, falling back to 1 default profile: "default"
2023-09-15T22:21:43.977+02:00  INFO 5344 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable

... Se ha llamado al constructor por defecto.

2023-09-15T22:21:45.405+02:00  INFO 5344 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-09-15T22:21:45.444+02:00  INFO 5344 --- [  restartedMain] spring.Prueba2                           : Started Prueba2 in 2.088 seconds (process running for 2.959)
>>> ARRANQUE [2] DE SPRING BOOT 

>>> PRODUCTO = NOMBRE: GASOLINA _ PRECIO: 1.4


TAMBIEN SE ARRANCAN EL RESTO DE LISTENERS (iniciara el [1])
>>> ARRANQUE [1] DE SPRING BOOT 

>>> COCHE - COMBUSTIBLE = NOMBRE: GASOLINA _ PRECIO: 1.4

*/