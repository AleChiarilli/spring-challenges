package inicio;


import java.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Sp512MvcCapturaParametrosPostApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(Sp512MvcCapturaParametrosPostApplication.class, args);

		System.out.println("\n\n\t!!! SE HA INICIADO SPRING !!! " + 
								"\t\t TIME: " + LocalTime.now().withNano(0));
		
	}

}