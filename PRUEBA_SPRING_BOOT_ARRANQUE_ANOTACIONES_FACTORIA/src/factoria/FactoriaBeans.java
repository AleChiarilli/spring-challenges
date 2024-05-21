package factoria;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class FactoriaBeans {

	@Bean
	@Primary		// SE REGISTRAN 2 BEANS DE TIPO Televisor. @Primary RESUELVE CUÁL DEBE
					// UTILIZARSE SI NO SE INDICA UN ALIAS QUE LOS DIFERENCIE.
	public Televisor obtenerTelevisor() {
		return new Televisor();
	}

	
	@Bean(name="SONY")
	public Televisor obtenerTelevisorSONY() {
		return new Televisor("SONY");
	}
	
}
