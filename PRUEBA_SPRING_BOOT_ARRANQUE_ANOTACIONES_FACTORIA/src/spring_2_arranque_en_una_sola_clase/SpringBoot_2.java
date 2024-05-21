package spring_2_arranque_en_una_sola_clase;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import clientes.Cliente;



@SpringBootApplication
@ComponentScan("beans,clientes")
public class SpringBoot_2 implements CommandLineRunner{

	@Autowired
	Cliente cliente;
	
	
	@Override
	public void run(String ... args) throws Exception {
		
		System.out.println("\n>>> INICIO DE SPRING BOOT 2 >>>\n");		

		System.out.println(cliente);
		
	}
	
	
	
	
	// INICIO JAVA ESTÁNDAR:	
	public static void main(String[] args) {

		SpringApplication.run(SpringBoot_2.class, args);
		
	}

}