package spring;


// ESTA IMPORTACIÓN PERMITE REGISTRAR EL BEAN EN SPRING SIN NECESIDAD DE UTILIZAR EL FICHERO XML.
import org.springframework.stereotype.Component;

/* 4 TIPOS:
				@Component		componente general (Pojo - JavaBean).
				@Repository		componente para gestión de bases de datos.
				@Controller		componente controlador en un MVC.
				@Service		componente con lógica de negocio (servicios).
				
				Los tipos sólo sirven para aclarar la funcionalidad del bean, el para qué
				sirve, pudiéndose emplear cualquiera de ellos de cara al registro en Spring.
*/


// LA CLASE JAVA (bean) QUE QUEREMOS REGISTRAR EN EL CATÁLOGO DE SPRING.
// Combustible IMPLEMENTA LA INTERFAZ ICombustible (Combustible IS-A ICombustible).

@Component
public class Combustible implements ICombustible {

	// PROPIEDADES SIMPLES:
	private String tipo;
	private double precio;

	
	// CONSTRUCTORES:
	public Combustible() {
		//System.out.println("\n... Se ha llamado al constructor por defecto.\n");
		tipo = "GASOLINA";
		precio = 1.40;
	}

	
	// SETTERS Y GETTERS:
	
	// SETTERS .. NECESARIOS PARA QUE SPRING PUEDA RELLENAR/INYECTAR LAS PROPIEDADES DE UN OBJETO (COMPOSICIÓN DE OBJETOS).
	// GETTERS .. SPRING NUNCA HARÁ USO DE ELLOS, SÓLO LOS UTILIZARÁ EL PROGRAMADOR PARA CONSULTAR LAS PROPIEDADES.
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}	
	
	// EL CONTRATO (métodos declarados en su interfaz de negocio)
	@Override
	public String consultarTipoPrecio() {
		return "TIPO: " + tipo + " _ PRECIO: " + precio;
	}
	

	
	// MÉTODO toString:
	@Override
	public String toString() {
		return consultarTipoPrecio();
	}

}