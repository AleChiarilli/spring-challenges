package spring;


import org.apache.log4j.varia.NullAppender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Prueba {
	
	public static void main(String[] args) {
		
		// DESACTIVAR LA CONFIGURACIÓN Log4j ASOCIADA A SPRING:
		org.apache.log4j.BasicConfigurator.configure(new NullAppender());

		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		
		
		// SE HA CONFIGURADO UNA AUTO-ESCANEADO DE BEANS EN EL XML PARA PODER OBTENER
		//		EL BEAN Escritor. LOS BEANS Lapiz Y Papel NO SE HAN REGISTRADO CON
		//		@Component PORQUE SE OBTIENEN A TRAVÉS DE LA FACTORÍA PERSONALIZADA
		//		(JAVA BASED).
		
		//System.out.println("---> SPRING: " + spring + "\n");
		
		Escritor escritor = spring.getBean(Escritor.class);		
		
		//System.out.println("ESCRITOR ... " + escritor + "\n");
		
		escritor.escribir();
		
	}
	
}


/*
	 >>> !! FACTORIA: SE SOLICITA EL BEAN Papel (alias celulosa) !!. 


	 >>> !! FACTORIA: SE SOLICITA EL BEAN Lapiz !!. 

EL ESCRITOR ... 1638435724
	 UTILIZA EL LAPIZ ... 573136580
		 SOBRE EL PAPEL ... 1524305331

*/