package spring_1_arranque_separado_2_clases;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// AVISO: Si se añade la librería slf4j con versión: 1.7.36 EL SISTEMA NO ARRANCARÁ.
//			LA CORRECTA ES LA slf4j-api-2.0.7



@SpringBootApplication
public class SpringBoot_1 {
	
	public static void main(String[] args) {

		SpringApplication.run(Inicio.class, args);
		
	}

}