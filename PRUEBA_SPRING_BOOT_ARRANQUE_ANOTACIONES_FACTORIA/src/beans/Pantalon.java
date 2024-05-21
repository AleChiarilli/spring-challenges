package beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Pantalon {
	
	@Value("42")
	private int talla;
	
	@Value("AZUL")
	private String color;
	
	
	public String consultarPantalon() {
		return "... DE LA DE TALLA ... [" + talla + "] Y DE COLOR ... [" + color + "]";
	}

	
	@Override
	public String toString() {
		return consultarPantalon();
	}
	
}