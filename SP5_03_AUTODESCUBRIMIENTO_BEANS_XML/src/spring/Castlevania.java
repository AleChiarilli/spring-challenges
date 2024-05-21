package spring;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary	// Elige este en caso de ambigüedad ante la regla IS-A 
			//		(Castlevania o DonkeyKong ... ambos son clase hijas de Juego).
public class Castlevania extends Juego {}
