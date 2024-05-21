package spring_1_arranque_separado_2_clases;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

import clientes.Cliente;



@ComponentScan("beans,clientes")
public class Inicio implements CommandLineRunner {

	@Autowired
	private Cliente cliente;
	
	
	@Override
	public void run(String ... args) {
		
		System.out.println("\n>>> INICIO DE SPRING BOOT 1 >>>\n");		

		System.out.println(cliente);
		
	}
	
}