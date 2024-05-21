package spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


// CARGA DE UN FICHERO DE PROPIEDADES (PAREJAS K-V) A TRAVÉS DE LA ANOTACIÓN @PropertySource.
// TODO SON CADENAS DE TEXTO, A PESAR DE QUE ESCRIBAMOS NÚMEROS O BOOLEANOS.

//@PropertySource("classpath:spring/supermercado.properties")

// SE PUEDEN LEER VARIOS FICHEROS DE PROPIEDADES MEDIANTE EL USO DE LAS LLAVES {} Y LOS ELEMENTOS SEPARADOS POR COMAS:
//		@PropertySources( {"A.properties", "B.properties", "C.properties"} )


@Component
@PropertySource("classpath:spring/supermercado.properties")
public class Cliente {

	private final String nombre;

	
	@Value("${pan}")	// SI NO SE UTILIZAN LAS LIBRERÍAS ACTUALIZADAS NO SE EVALUARÁ LA
	private double precioPan;	// EXPRESIÓN ${}, COLOCANDO EN SU LUGAR "${pan}" EN VEZ DEL
								// VALOR 0.75 QUE RESULTA DE LEER EL FICHERO DE PROPIEDADES:
								// "supermercado.properties".
	
	
	@Value("${queso}")	// EN EL FICHERO DE PROPIEDADES TODO ES STRING, PERO EL SISTEMA	
	private double precioQueso;	// CONVERTIRÁ AL TIPO DEL ATRIBUTO (double en este caso, pero)
								// si finalmente no puede, generará error).
	
	
	@Value("${jamon}")
	private double precioJamon;
		
	

	public Cliente() {
		nombre = "Juan";
	}
	
	
	// GETTER DE LA PROPIEDAD NOMBRE:	
	public String getNombre() {
		return nombre;
	}
	
	
	// GETTERS DE LOS VALORES CONSULTADOS SOBRE EL FICHERO DE PROPIEDADES:
	public double getPrecioPan() {
		return precioPan;
	}

	public double getPrecioQueso() {
		return precioQueso;
	}

	public double getPrecioJamon() {
		return precioJamon;
	}

	
	@Override
	public String toString() {
		return "NOMBRE: " + nombre;
	}
	
}