package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Consola implements IConsola {

	@Value("SONY PLAYSTATION")	// iNYECCIÓN DE VALOR DIRECTO.
	private String marca;
	
	
	@Autowired 				// AUTOENLAZADO DE UN TIPO REFERENCIADO.
	private Juego juego;	// 	SE ELEGIRÁ Castlevania PORQUE TIENE LA ANOTACION @Primary.
	
	private boolean encendidaSiNo;	// false.
	
	
	/*
	public Consola() {
		encendidaSiNo = false; // POR DEFECTO LA CONSOLA ESTÁ APAGADA.
	}
	*/
	
	
	@Override
	public void encender() {
		encendidaSiNo = true;		
	}

	@Override
	public void apagar() {
		encendidaSiNo = false;		
	}

	@Override
	public void cambiarJuego(Juego juego) {
		
		if(encendidaSiNo) {
			System.out.println("\n!!! PRIMERO DEBES APAGAR LA CONSOLA !!!");
			return;			
		}
		
		System.out.println("\n- - - CAMBIO DE JUEGO - - -\n");
		
		this.juego = juego;		
	}
	
	
	@Override
	public void jugar() {
		
		if(!encendidaSiNo) {
			System.out.println("\n!!! PRIMERO DEBES ENCENDER LA CONSOLA !!!");
			return;
		}
		
		System.out.println("\n!! OK !!. Estamos jugando al " + juego.consultarNombre().toUpperCase() +
				" en la " + marca + ".");
		
	}
	
	
	@Override
	public String toString() {
		return "CONSOLA: " + marca + " - numero de serie: " + hashCode();
	}

}