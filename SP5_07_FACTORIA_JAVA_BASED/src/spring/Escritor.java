package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;


// ESTA CLASE ACTÚA COMO BEAN DE SPRING CON LÓGICA DE NEGOCIO (método escribir()).
@Service
public class Escritor {

	// INYECCIÓN SOBRE LOS ATRIBUTOS:
	
	// UTILIZAMOS @Autowired PARA LA INYECCIÓN AUTOMÁTICA DE BEANS QUE SE OBTENDRÁN
	//	DE LA FACTORÍA PERSONALIZADA (FactoriaLapizPapel.class):
	@Autowired
	private Lapiz lapiz;

	//@Autowired				// CON @Resource(name="xxx") NO ES NECESARIO EL @Autowired, PERO SIGUE FUNCIONANDO.
	@Resource(name="celulosa")	// UTILIZA EL NOMBRE LÓGICO CON EL QUE SE REGISTRÓ EL BEAN EN LA FACTORÍA.
	private Papel papel;
	
	
	
	public Escritor() {}

	// INYECCIÓN SOBRE EL CONSTRUCTOR PARAMETRIZADO:
	
	//@Autowired
	public Escritor(Lapiz lapiz, Papel papel) {
		this.lapiz = lapiz;
		this.papel = papel;
	}
	
	
	
	// INYECCIÓN SOBRE LOS MÉTODOS SETTER:
	
	//@Autowired
	public void setLapiz(Lapiz lapiz) {
		System.out.println("\n>> SETTER DE LAPIZ\n");
		this.lapiz = lapiz;
	}

	//@Autowired
	public void setPapel(Papel papel) {
		System.out.println("\n>> SETTER DE PAPEL\n");
		this.papel = papel;
	}

	
	
	// LÓGICA DE NEGOCIO DE LA CLASE:
	public void escribir() {
		System.out.println("EL ESCRITOR ... " + hashCode() + 
								"\n\t UTILIZA EL LAPIZ ... " + lapiz.hashCode() + 
										"\n\t\t SOBRE EL PAPEL ... " + papel.hashCode());
	}
	
}