package spring;


import org.apache.log4j.varia.NullAppender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Prueba {
	
	public static void main(String[] args) {
		
		// DESACTIVAR LA CONFIGURACIÓN Log4j ASOCIADA A SPRING:
		org.apache.log4j.BasicConfigurator.configure(new NullAppender());


		// Contenedor de beans ... IeC.
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

		Concesionario concesionario = spring.getBean(Concesionario.class);		
		
		System.out.println("DEPORTIVOS: " + concesionario.consultarDeportivos());		

		
		System.out.println("\n------------------------- @Component('alias') -------------------------\n");
		
		
		// RECUPERAR CADA UNO DE LOS DEPORTIVOS MEDIANTE SUS CUALIFICADORES (NOMBRE PERSONALIZADO):
		
		// ERROR DE AMBIGÜEDAD PORQUE HAY UN TOTAL DE 3 TIPOS DE DEPORTIVOS EN LUGAR DE 1:
		//		Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: 
		//				No unique bean of type [spring.Deportivo] is defined: expected single bean but found 3: 
		//					ferrari,lamborgini,porsche
		//
		//Deportivo d1 = spring.getBean(Deportivo.class);
		
		// POR ESO PODEMOS UTILIZAR ALIAS ( @Component("ROJO") ) Y CUALIFICADORES ( @Qualifier("FLECHA_ROJA") ):
		
		
		//System.out.println("NOMBRE CLASE ---> " + spring.getBean("ferrari",Deportivo.class)); // SI NO USAMOS ALIAS.
		
		System.out.println("ALIAS ROJO ---> " + spring.getBean("ROJO",Deportivo.class));
		System.out.println("ALIAS AMARILLO ---> " + spring.getBean("AMARILLO",Deportivo.class));
		System.out.println("ALIAS AZUL ---> " + spring.getBean("AZUL",Deportivo.class));

		
		System.out.println("\n------------------------- @Qualifiers('alias') -------------------------\n");
		
		
		System.out.println("CUALIFICADOR ITALIANO --> DEPORTIVO 1: " + concesionario.obtenerFlechaRoja());
		System.out.println("CUALIFICADOR TORO --> DEPORTIVO 2: " + concesionario.obtenerToro());
		System.out.println("CUALIFICADOR CARRERA --> DEPORTIVO 3: " + concesionario.obtenerCarrera());
	
		
		
		// CIERRE DE LA FACTORÍA:
		((ConfigurableApplicationContext) spring).close();		
		
	}
		
}



/*

DEPORTIVOS: [FERRARI -> HASH: 477533894, LAMBORGINI -> HASH: 1611241809, PORSCHE -> HASH: 538185145]

------------------------- @Component('alias') -------------------------

ALIAS ROJO ---> FERRARI -> HASH: 510276116
ALIAS AMARILLO ---> LAMBORGINI -> HASH: 1611241809
ALIAS AZUL ---> PORSCHE -> HASH: 538185145

------------------------- @Qualifiers('alias') -------------------------

CUALIFICADOR ITALIANO --> DEPORTIVO 1: FERRARI -> HASH: 914507705
CUALIFICADOR TORO --> DEPORTIVO 2: LAMBORGINI -> HASH: 1611241809
CUALIFICADOR CARRERA --> DEPORTIVO 3: PORSCHE -> HASH: 538185145

*/