package spring;


//LIBRERÍA Autowired PARA AUTO-INYECCIÓN (detecta el modo:A-C-M y el tipo de las dependencias).
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class CalculadoraAUTOWIRED {

	// >>> ATRIBUTO (A):
	
	@Autowired			// INYECCIÓN A NIVEL DE ATRIBUTO.
	Pilas pilas;
	
	
	
	// >>> CONSTRUCTORES (C):
	
	public CalculadoraAUTOWIRED() {}

	//@Autowired			// INYECCIÓN A NIVEL DE CONSTRUCTOR.
	public CalculadoraAUTOWIRED(Pilas pilas) {
		System.out.println("\n>>> INYECCION DE LAS PILAS POR CONSTRUCTOR: " + pilas);
		this.pilas = pilas;		
	}
	
	
	
	// >>> MÉTODO SETTER (M):
	
	//@Autowired			// INYECCIÓN A NIVEL DE MÉTODO.
	public void colocarPilas(Pilas pilas) {
		System.out.println("\n>>> INYECCION DE LAS PILAS POR METODO SETTER: " + pilas);
		this.pilas = pilas;
	}
	
	
	
	@Override
	public String toString() {
		return "Calculadora_" + hashCode() + " ---> " + pilas;
	}
	
}