package spring_3_factoria_java_based;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import factoria.InterfazTelevisor;
import jakarta.annotation.Resource;


@SpringBootApplication
@ComponentScan("factoria")	// SIN EL AUTO-ESCANEO NO SE ENCONTRARÁ EL BEAN Televisor 
							//	A PESAR DE QUE ES LA FACTORÍA QUIÉN REALMENTE LO ENTREGA.
public class SpringBoot_3 implements CommandLineRunner{

	@Autowired
	InterfazTelevisor televisor1;

		
	@Autowired
	@Resource(name="SONY")
	InterfazTelevisor televisor2; // CON LA INTERFAZ NO ENCUENTRA EL BEAN.

	
	
	
	@Override
	public void run(String ... args) throws Exception {
		
		System.out.println("\n>>> INICIO DE SPRING BOOT 3 >>>\n");		

		System.out.println(televisor1);		
		
		System.out.println(televisor2);
		
	}
	
	
	
	
	// INICIO JAVA ESTÁNDAR:
	public static void main(String[] args) {

		SpringApplication.run(SpringBoot_3.class, args);
		
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

2023-09-16T00:18:30.424+02:00  INFO 6012 --- [  restartedMain] spring_3.SpringBoot_3                    : Starting SpringBoot_3 using Java 17.0.7 with PID 6012 (C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\PRUEBA_SPRING_BOOT_ARRANQUE_ANOTACIONES_FACTORIA\bin started by Usuario in C:\_VCG\ECLIPSE\_PROYECTOS_ECLIPSE_STS\PRUEBA_SPRING_BOOT_ARRANQUE_ANOTACIONES_FACTORIA)
2023-09-16T00:18:30.433+02:00  INFO 6012 --- [  restartedMain] spring_3.SpringBoot_3                    : No active profile set, falling back to 1 default profile: "default"
2023-09-16T00:18:30.510+02:00  INFO 6012 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-09-16T00:18:31.568+02:00  INFO 6012 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-09-16T00:18:31.607+02:00  INFO 6012 --- [  restartedMain] spring_3.SpringBoot_3                    : Started SpringBoot_3 in 1.712 seconds (process running for 2.556)

>>> INICIO DE SPRING BOOT 3 >>>

EL TELEVISOR ES DE ... [32] PULGADAS Y TECNOLOGIA ... [Led], MARCA ... [BLANCA] 


EL TELEVISOR ES DE ... [75] PULGADAS Y TECNOLOGIA ... [Qx4Led], MARCA ... [SONY] 

*/