package spring;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile( {"vegetariano" , /*"default"*/} )	// CON "default" SE SELECCIONA ESTE PERFIL POR DEFECTO.
public class HamburguesaVegetal extends Hamburguesa {
	
	public String queTiene() {
		return "LA HAMBURGUESA ESTA HECHA DE TOFU (sin carne)";
	}
	
}