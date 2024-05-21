package factoria;


public class Televisor implements InterfazTelevisor {		// REGLA IS-A POR IMPLEMENTACIÓN.

	private int pulgadas;	
	private String tecnologia;
	private String marca = "BLANCA";
	
	
	public Televisor() {
		pulgadas = 32;
		tecnologia = "Led";
	}

	
	public Televisor(String marca) {
		pulgadas = 75;
		tecnologia = "Qx4Led";
		this.marca = marca;
	}
		
	
	
	public String consultarTelevisor() {
		return "EL TELEVISOR ES DE ... [" + pulgadas + "] PULGADAS " +  
					"Y TECNOLOGIA ... [" + tecnologia + "], " + 
						"MARCA ... [" + marca + "] \n\n";
	}
	
	
	@Override
	public String toString() {
		return consultarTelevisor();
	}
	
}