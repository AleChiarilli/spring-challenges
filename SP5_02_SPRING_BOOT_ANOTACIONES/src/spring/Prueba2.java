package spring;


import org.springframework.boot.SpringApplication;


// ESTA CLASE NO ES UN S.B.A (@SpringBootApplication), SINO UNA CLASE NORMAL Y CORRIENTE
//	QUE HACE USO DEL S.A (SpringApplication) Y SU MÉTODO run, PARA QUE SE INVOQUE LA
//	CLASE QUE REALMENTE DEBE INICIAR EL CONTEXTO DE SPRING (ArranqueExternoSpring.java).
public class Prueba2 {
	
	public static void main(String[] args) {

		// SOLICITAMOS EL ARRANQUE DEL CONTEXTO O FACTORÍA DE SPRING A TRAVÉS DEL MÉTODO ESTÁTICO run DE
		//	LA CLASE SpringApplication (importada) INDICÁNDOLE CUÁL ES LA CLASE QUE HACE DE ESCUCHADOR
		//	DE SPRING (Prueba2.class) Y PROPAGANDO LOS PARÁMETROS DE ENTRADA QUE SE RECIBEN EN EL MÉTODO main.
		
		// El escuchador no es ahora Prueba2.java, sino que lo hemos emplazado en un clase externa
		// que se denomina ArranqueExternoSpring.java, que es la que realmente implementa la interfaz
		// CommandLineRunner.		
		SpringApplication.run(ArranqueExternoSpring.class, args);
		
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

2024-05-20T07:57:01.442+02:00  INFO 3364 --- [  restartedMain] spring.Prueba2                           : Starting Prueba2 using Java 17.0.7 with PID 3364 (C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_02_SPRING_BOOT_ANOTACIONES\bin started by Usuario in C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\SP5_02_SPRING_BOOT_ANOTACIONES)
2024-05-20T07:57:01.451+02:00  INFO 3364 --- [  restartedMain] spring.Prueba2                           : No active profile set, falling back to 1 default profile: "default"
2024-05-20T07:57:01.510+02:00  INFO 3364 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-05-20T07:57:02.743+02:00  INFO 3364 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-05-20T07:57:02.779+02:00  INFO 3364 --- [  restartedMain] spring.Prueba2                           : Started Prueba2 in 1.868 seconds (process running for 2.709)



>>> ARRANQUE [2] DE SPRING BOOT 

>>> COCHE 1097092144 ---> COMBUSTIBLE = TIPO: GASOLINA _ PRECIO: 1.4


TAMBIEN SE ARRANCAN EL RESTO DE LISTENERS (iniciara el [1])



>>> ARRANQUE [1] DE SPRING BOOT 

>>> COCHE 598328854 ---> COMBUSTIBLE = TIPO: GASOLINA _ PRECIO: 1.4


*/