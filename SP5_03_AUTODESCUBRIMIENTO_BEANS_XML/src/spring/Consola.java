package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Consola implements IConsola {

	@Value("SONY PLAYSTATION")	// iNYECCIÓN DE VALOR DIRECTO (un literal == cadena de texto / número).
	private String marca;
	
	
	@Autowired 				// AUTOENLAZADO DE UN TIPO REFERENCIADO (otro bean registrado en el catálogo de Spring).
	private Juego juego;	// 	SE ELEGIRÁ Castlevania PORQUE TIENE LA ANOTACION @Primary (resuelve ambigüedad por prioridad)
	
	private boolean encendidaSiNo;
	
	
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
			System.out.println("!!! PRIMERO DEBES APAGAR LA CONSOLA !!!");
			return;			
		}
		
		System.out.println("\n- - - CAMBIO DE JUEGO - - -\n");
		
		this.juego = juego;		
	}
	
	
	@Override
	public void jugar() {
		
		if(!encendidaSiNo) {
			System.out.println("!!! PRIMERO DEBES ENCENDER LA CONSOLA !!!");
			return;
		}
		
		System.out.println("!! OK !!. Estamos jugando al " + juego.consultarNombre().toUpperCase() +
				" en la " + marca + ".");
		
	}

}