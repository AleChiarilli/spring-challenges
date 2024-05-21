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
		
		IConsola consola = spring.getBean(IConsola.class);
		
		System.out.println("CONSOLA: " + consola + "\n\n");

		consola.encender();
		
		consola.jugar();

		
		// ----------------------- CAMBIO DE JUEGO -----------------------
		

		consola.apagar();
		
		consola.cambiarJuego(spring.getBean(DonkeyKong.class));
		
		consola.encender();
		
		consola.jugar();

		
		
		// CIERRE DE LA FACTORÍA:
		((ConfigurableApplicationContext) spring).close();
		
	}
	
}


/*

CONSOLA: spring.Consola@18e36d14


!! OK !!. Estamos jugando al CASTLEVANIA en la SONY PLAYSTATION.

- - - CAMBIO DE JUEGO - - -

!! OK !!. Estamos jugando al DONKEYKONG en la SONY PLAYSTATION.

*/