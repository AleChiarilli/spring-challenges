package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;


// LA CLASE IMPLEMENTA LA INTERFAZ CommandLineRunner Y HACE UN AUTO-ESCANEADO
//	DE LOS BEANS DE SPRING UBICADOS EN LA CARPETA ---> src/spring.

//	@ComponentScan( {"spring","beans"} )	// ... si hay varios paquetes {,,,}.
//	@ComponentScan("*")						// ... si se quiere escanear todo.


@ComponentScan("spring")					// ... escanear sólo este paquete.
public class Inicio implements CommandLineRunner {

	// AUTOINYECCIÓN DE DEPENDENCIAS EN LA CLASE DE PRUEBA:	
	@Autowired
	IConsola consola;
	
	@Autowired
	DonkeyKong juego2;

	
	
	// MÉTODO A EJECUTAR POR EL ARRANQUE (no es estático):
	@Override
	public void run(String ... args) {

		System.out.println("\n\nCONSOLA: " + consola + "\n\n");

		consola.encender();
		
		consola.jugar();

		
		// ----------------------- CAMBIO DE JUEGO -----------------------
		

		consola.apagar();
		
		consola.cambiarJuego(juego2);
		
		consola.encender();
		
		consola.jugar();

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

2024-05-20T15:26:19.127+02:00  INFO 8984 --- [  restartedMain] spring.Prueba                            : Starting Prueba using Java 17.0.7 with PID 8984 (C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_04_AUTODESCUBRIMIENTO_BEANS_ANOTACIONES\bin started by Usuario in C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_04_AUTODESCUBRIMIENTO_BEANS_ANOTACIONES)
2024-05-20T15:26:19.137+02:00  INFO 8984 --- [  restartedMain] spring.Prueba                            : No active profile set, falling back to 1 default profile: "default"
2024-05-20T15:26:19.178+02:00  INFO 8984 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-05-20T15:26:19.390+02:00  INFO 8984 --- [  restartedMain] spring.Prueba                            : Started Prueba in 0.818 seconds (process running for 1.748)


CONSOLA: CONSOLA: SONY PLAYSTATION - numero de serie: 811633840



!! OK !!. Estamos jugando al CASTLEVANIA en la SONY PLAYSTATION.

- - - CAMBIO DE JUEGO - - -


!! OK !!. Estamos jugando al DONKEYKONG en la SONY PLAYSTATION.

*/