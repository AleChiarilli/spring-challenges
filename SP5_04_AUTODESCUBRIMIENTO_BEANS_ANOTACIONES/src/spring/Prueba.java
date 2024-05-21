package spring;


import org.apache.log4j.varia.NullAppender;
import org.springframework.boot.SpringApplication;


public class Prueba {

	public static void main(String[] args) {
		
		// DESACTIVAR LA CONFIGURACIÓN Log4j ASOCIADA A SPRING:
		org.apache.log4j.BasicConfigurator.configure(new NullAppender());

		// LLAMAR AL MÉTODO DE ARRANQUE DE SPRING (la propia clase Prueba hace de escuchador/listener):
		SpringApplication.run(Inicio.class, args);
		
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

2024-05-20T08:16:10.076+02:00  INFO 11284 --- [  restartedMain] spring.Prueba                            : Starting Prueba using Java 17.0.7 with PID 11284 (C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_04_AUTODESCUBRIMIENTO_BEANS_ANOTACIONES\bin started by Usuario in C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_04_AUTODESCUBRIMIENTO_BEANS_ANOTACIONES)
2024-05-20T08:16:10.084+02:00  INFO 11284 --- [  restartedMain] spring.Prueba                            : No active profile set, falling back to 1 default profile: "default"
2024-05-20T08:16:10.139+02:00  INFO 11284 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-05-20T08:16:10.481+02:00  INFO 11284 --- [  restartedMain] spring.Prueba                            : Started Prueba in 0.922 seconds (process running for 1.716)
CONSOLA: spring.Consola@30608cb0


!! OK !!. Estamos jugando al CASTLEVANIA en la SONY PLAYSTATION.

- - - CAMBIO DE JUEGO - - -

!! OK !!. Estamos jugando al DONKEYKONG en la SONY PLAYSTATION.


*/