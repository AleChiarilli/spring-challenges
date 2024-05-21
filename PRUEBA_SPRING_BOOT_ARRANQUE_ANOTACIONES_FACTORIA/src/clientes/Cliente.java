package clientes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.Pantalon;


@Component
public class Cliente {

	@Autowired
	private Pantalon pantalon;
	
	
	public String toString() {
		return "EL CLIENTE QUIERE COMPRAR UN PANTALON: \n\t " + pantalon;
	}

}