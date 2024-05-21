package spring;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Concesionario {

	// TODOS LOS DEPORTIVOS SE RECUPERAN AL UTILIZAR UN TIPO List<Deportivo> COMO
	//	DESTINO DE LA AUTO-INYECCIÓN:
	@Autowired
	private List<Deportivo> deportivos;
	
	
	// AUTO-INYECCIÓN DE BEANS POR SEPARADO:
	@Autowired
	@Qualifier("ITALIANO")
	private Deportivo flecha_roja; 
	

	@Autowired
	@Qualifier("TORO")
	private Deportivo toro; 

	
	@Autowired
	@Qualifier("CARRERA")
	private Deportivo carrera; 
		
	
	
	// MÉTODOS PARA RECUPERAR LOS BEANS:
	
	public List<Deportivo> consultarDeportivos() {
		return deportivos;
	}
	
	
	
	public Deportivo obtenerFlechaRoja() {
		return flecha_roja;				
	}

	
	public Deportivo obtenerToro() {
		return toro;
	}
	
	
	public Deportivo obtenerCarrera() {
		return carrera;
	}
	
}