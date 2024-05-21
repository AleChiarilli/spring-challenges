package spring;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary	// Elige este en caso de ambigüedad ante la regla IS-A.
public class Castlevania extends Juego {}
