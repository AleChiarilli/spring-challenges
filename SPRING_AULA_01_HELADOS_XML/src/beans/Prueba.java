package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {

	private static final String URLtoAppContext = "spring/frigo.xml";
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext frigo = new ClassPathXmlApplicationContext(URLtoAppContext);
		
		System.out.println("FRIGO: " + frigo);
		
	}
	
}
