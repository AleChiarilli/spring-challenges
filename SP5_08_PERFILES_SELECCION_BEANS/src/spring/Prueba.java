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

		// SE HAN CREADO 2 BEANS QUE CUMPLEN CON EL MISMO SUPERTIPO (clase abstracta Hamburguesa), PERO
		//	GRACIAS A LA ANOTACIÓN @Profile Y SELECCIONANDO UN PERFIL POR DEFECTO, SE RESUELVE LA
		//	AMBIGÚEDAD.
		
		
		System.out.println(spring.getBean(Hamburguesa.class).queTiene());

		
		// CIERRE DE LA FACTORÍA:
		((ConfigurableApplicationContext) spring).close();	
		
	}

}

// Estudio detallado de perfiles en Spring:
//
// https://www.profesor-p.com/2019/02/28/perfiles-en-spring-boot/