package spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component				// REGISTRAR LA CLASE COMO UN COMPONENTE GENERAL DE SPRING Y EN
@Scope("prototype")		// 	MODO PROTOTYPE (una nueva instancia física cada vez).
public class Coche {

	@Autowired			// INDICA A SPRING LA DEPENDENCIA INTERNA DE ESTA CLASE SOBRE OTRA. REALIZARÁ UN AUTO-RELLENO DE
	ICombustible combustible;	// LA PROPIEDAD, BUSCANDO E INSTANCIANDO UN BEAN QUE CUMPLA IS-A CON ICombustible --> Combustible.
	
	
	public String consultarCombustible() {
		return combustible.consultarTipoPrecio();
	}
	
}
