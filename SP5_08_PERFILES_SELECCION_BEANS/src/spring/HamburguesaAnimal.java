package spring;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile( {"carnivoro" , "default"} )	// CON "default" SE SELECCIONA ESTE PERFIL POR DEFECTO.
public class HamburguesaAnimal extends Hamburguesa {
	
	public String queTiene() {
		return "LA HAMBURGUESA ESTA HECHA DE TERNERA (con carne)";
	}	
	
}