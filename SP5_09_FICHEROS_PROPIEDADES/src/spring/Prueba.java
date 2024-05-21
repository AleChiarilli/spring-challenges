package spring;


import org.apache.log4j.varia.NullAppender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Prueba {
	
	public static void main(String[] args) {
		
		// DESACTIVAR LA CONFIGURACIÓN Log4j ASOCIADA A SPRING:
		org.apache.log4j.BasicConfigurator.configure(new NullAppender());

		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

		//System.out.println("SPRING: " + spring);
		
		
		
		Cliente cliente = spring.getBean(Cliente.class);
		
		//System.out.println("\nCLIENTE --> " + cliente);
		
		String nombre = cliente.getNombre();
		
		
		
		System.out.println("\n" + nombre + ", ¿cuanto te ha costado el pan, el queso y el jamon?:");
		
		System.out.println("\tPAN ---> " + cliente.getPrecioPan() + " €.");
		System.out.println("\tQUESO ---> " + cliente.getPrecioQueso() + " €/Kg.");
		System.out.println("\tJAMON ---> " + cliente.getPrecioJamon() + " €/Kg.");

		
		// CIERRE DE LA FACTORÍA:
		((ConfigurableApplicationContext) spring).close();	

	}

}

/*

Juan, ¿cuanto te ha costado el pan, el queso y el jamon?:
	PAN ---> 0.75 €.
	QUESO ---> 9.9 €/Kg.
	JAMON ---> 25.5 €/Kg.

*/