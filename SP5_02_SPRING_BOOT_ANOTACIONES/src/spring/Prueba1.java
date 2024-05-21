package spring;


// IMPORTACIÓN PARA AUTO-INYECCIÓN DE BEANS SEGÚN LA REGLA IS-A.
import org.springframework.beans.factory.annotation.Autowired;

//IMPORTACIONES PARA SPRING 5 - SpringBoot:
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// ESTA ANOTACIÓN (S.B.A) SOBRE LA CLASE IMPLICA AUTO-ESCANEO DE BEANS (todo el proyecto) Y EL IMPLEMENTAR LA INTERFAZ
// CommandLineRunner, QUE LA MISMA ACTÚE COMO ESCUCHADOR PARA EL ARRANQUE (en Prueba2.java + ArranqueExternoSpring.java,
// hemos separado ambas partes)
//
// ASÍ, Prueba1.java ES UN S.B.A Y UN CommandLineRunner, las 2 cosas a la vez (es la forma más rápida de iniciar Spring)
//
@SpringBootApplication
public class Prueba1 implements CommandLineRunner {

	
	@Autowired		// AUTO-INYECCIÓN DE OTRO BEAN DEL CATÁLOGO DE SPRING EN ESTA CLASE PARA QUE LA PUEDA USAR.
	Coche coche;
	
	
	// MÉTODO OBLIGADO POR LA INTERFAZ CommandLineRunner Y QUE ACTUARÁ COMO EL run DE LOS HILOS, ES DECIR,
	//	ESCRIBIR EN ÉL LO QUE QUERAMOS QUE SE HAGA.
	
	// ESTE MÉTODO QUE NO ES ESTÁTICO Y ES LLAMADO POR EL MÉTODO run DE SpringApplication QUE SÍ LO
	// ES Y QUE A SU VEZ, ESTÁ LOCALIZADO DENTRO DEL MÉTODO main QUE TAMBIÉN ES ESTÁTICO.
	//
	// ASÍ, EL ATRIBUTO NO ESTÁTICO Coche ES LLAMADO DESDE EL MÉTODO NO ESTÁTICO run OBLIGADO
	// POR LA INTERFAZ CommandLineRunner.
	
	@Override
	public void run(String ... args) throws Exception {
		System.out.println("\n\n");
		System.out.println(">>> ARRANQUE [1] DE SPRING BOOT \n");		
		System.out.println(">>> COCHE " + coche.hashCode() + " ---> COMBUSTIBLE = " + coche.consultarCombustible());
	}
	
	
	public static void main(String[] args) {
		
		// EL COMPONENTE ESTÁ REGISTRADO EN SPRING Y EL AUTOENLAZADO SE HA APLICADO AL ATRIBUTO
		//	coche DE ESTA CLASE DE PRUEBA (se buscará un bean que cumpla con la regla IS-A con
		//	respecto al tipo Coche ... sólo hay 1, de lo contrario se produciría error por ambigüedad).
		//
		//	SI NO SE ARRANCA/INICIA LA FACTORÍA/CONTEXTO DE SPRING, NO SE PRODUCIRÁ LA INYECCIÓN 
		//	EN EL ATRIBUTO QUEDANDO COMO ESTÁ ORIGINALMENTE, ES DECIR, A null.
				
	
		
		// LA SIGUIENTE LÍNEA HACE QUE SE ARRANQUE LA FACTORÍA DE SPRING (observar como recibe el tipo o .class
		//	de la propia clase Prueba1 y el array de Strings de entrada al método main de la misma).
		//
		// Así, Prueba1.java hace de punto de inicio de la aplicación y a su vez, de arranque de la
		//	factoría de Spring ... sería el equivalente a obtener la referencia a la factoría
		//	definida con el fichero descriptor XML:
		//			ApplicationContext spring = new ClassPathXmlApplicationContext("catalogoSpring.xml");
	
		//	para luego obtener los beans:
		//			Juego juego1 = spring.getBean(Castlevania.class);
		//
		//	Con SpringBoot podemos prescindir del XML y hacerlo todo por @notaciones, incluyendo el
		//	autodescubrimiento de beans ... automatiza más aún todo el proceso.

		// ESTE run DE SpringApplication (estático) DELEGARÁ SOBRE EL MÉTODO run DENTRO DE LA CLASE Prueba1.class
		//	QUE HEMOS PASADO COMO ARGUMENTO:
		SpringApplication.run(Prueba1.class, args);
		
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

2024-05-20T07:56:12.256+02:00  INFO 1632 --- [  restartedMain] spring.Prueba1                           : Starting Prueba1 using Java 17.0.7 with PID 1632 (C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_02_SPRING_BOOT_ANOTACIONES\bin started by Usuario in C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_02_SPRING_BOOT_ANOTACIONES)
2024-05-20T07:56:12.265+02:00  INFO 1632 --- [  restartedMain] spring.Prueba1                           : No active profile set, falling back to 1 default profile: "default"
2024-05-20T07:56:12.355+02:00  INFO 1632 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-05-20T07:56:13.502+02:00  INFO 1632 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-05-20T07:56:13.538+02:00  INFO 1632 --- [  restartedMain] spring.Prueba1                           : Started Prueba1 in 1.805 seconds (process running for 2.625)



>>> ARRANQUE [1] DE SPRING BOOT 

>>> COCHE 537891877 ---> COMBUSTIBLE = TIPO: GASOLINA _ PRECIO: 1.4

*/