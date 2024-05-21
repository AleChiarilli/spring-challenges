package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.InterfazFrigopie;

public class Prueba {

	private static final String URLtoAppContext = "spring/frigo.xml";
	
	
	
	public static void main(String[] args) {
		
		ApplicationContext frigo = new ClassPathXmlApplicationContext(URLtoAppContext);
		
		System.out.println("FRIGO: " + frigo);
		
		//FRIGO: org.springframework.context.support.Class....................
		
		
		
		// 1)NO HAY AMBIGUEDAD PERO DEVUELVE Object .class.arrayType(). TIENES QUE HACER CASTING
		Helado helado1 = (Helado) frigo.getBean("frigopie");
		
		System.out.println("HELADO 1 ... " + helado1);
		
		
		// 2) HACE CASTING AUTOMATICO PERO PUEDES TENER PROBLEMAS DE AMBIGUEDAD
		// Helado helado2 = frigo.getBean(Helado.class);
		
		
		
		// 2) DE ÉSTA MANERA SÍ FUNCIONA, PORQUE HAGO REFERENCIA ES A SU CLASO U OBJETO FANTASMA ÚNICO
		Helado helado2 = frigo.getBean(Frigopie.class);
		System.out.println("HELADO 2 ... CON GETBEAN(CLASS)" + helado2);
		
		
		//3)TAMBIÉN PODRÍAS USAR UNA INTERFAZ
		InterfazFrigopie helado3 = frigo.getBean(InterfazFrigopie.class);
		System.out.println("HELADO 3 ... CON INTERFAZ ... " + helado3);
		
		
		// 4) RESUELVO AMBIGUEDAD Y OBTENGO CASTING AUTOMATICO A LA SALIDA
		// NO: Helado helado3 = frigo.getBean("frigopie");
		// NO: Helado helado3 = frigo.getBean(Helado.class);
		// 4)
		Helado helado4 = frigo.getBean("frigopie", Helado.class);
		System.out.println("HELADO 4 ... CON GETBEAN + CASTING ... " + helado4);
		
		
		//CIERRE DE LA FACTORIA:
		((ConfigurableApplicationContext) frigo).close();
	}
	
}
