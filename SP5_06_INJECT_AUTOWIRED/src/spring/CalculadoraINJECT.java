package spring;

//LIBRERÍA Inject PARA AUTO-INYECCIÓN (detecta el modo:A-C-M y el tipo de las dependencias).
import javax.inject.Inject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class CalculadoraINJECT {

	// >>> ATRIBUTO (A):
	
	@Inject			// INYECCIÓN A NIVEL DE ATRIBUTO.
	Pilas pilas;
	
	
	
	// >>> CONSTRUCTORES (C):
	
	public CalculadoraINJECT() {}

	//@Inject			// INYECCIÓN A NIVEL DE CONSTRUCTOR.
	public CalculadoraINJECT(Pilas pilas) {
		System.out.println("\n>>> INYECCION DE LAS PILAS POR CONSTRUCTOR: " + pilas);
		this.pilas = pilas;		
	}
	
	
	
	// >>> MÉTODO SETTER (M):
	
	//@Inject			// INYECCIÓN A NIVEL DE MÉTODO.
	public void colocarPilas(Pilas pilas) {
		System.out.println("\n>>> INYECCION DE LAS PILAS POR METODO SETTER: " + pilas);
		this.pilas = pilas;
	}
	
	// SI ESTÁN ACTIVOS LOS 3 SE HARÁN TODOS ELLOS (supuestamente, el último machaca al
	//		anterior en orden escritura).
	
	
	@Override
	public String toString() {
		return "Calculadora_" + hashCode() + " ---> " + pilas;
	}
	
}