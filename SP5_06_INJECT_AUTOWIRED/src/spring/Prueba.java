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
		
		System.out.println("\nUTILIZANDO INJECT:\n");
		
		// SOLICITAR 3 OBJETOS O INSTANCIAS DE CalculadoraINJECT:
		System.out.println(spring.getBean(CalculadoraINJECT.class));		
		System.out.println(spring.getBean(CalculadoraINJECT.class));
		System.out.println(spring.getBean(CalculadoraINJECT.class));

		
		
		System.out.println("\n\nUTILIZANDO AUTOWIRED:\n");
		
		// SOLICITAR 3 OBJETOS O INSTANCIAS DE CalculadoraAUTOWIRED:
		System.out.println(spring.getBean(CalculadoraAUTOWIRED.class));		
		System.out.println(spring.getBean(CalculadoraAUTOWIRED.class));
		System.out.println(spring.getBean(CalculadoraAUTOWIRED.class));

		
		// CIERRE DE LA FACTORÍA:
		((ConfigurableApplicationContext) spring).close();		
				
	}
	
}