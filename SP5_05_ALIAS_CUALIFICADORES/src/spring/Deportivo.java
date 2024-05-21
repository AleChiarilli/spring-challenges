package spring;


public abstract class Deportivo {

	protected String fabricante;
	
	
	public Deportivo() {
		fabricante = getClass().getSimpleName().toUpperCase();
	}
	
	
	@Override
	public String toString() {
		return fabricante + " -> HASH: " + hashCode();
	}
	
}
