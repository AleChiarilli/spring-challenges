package spring;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// EL BEAN PUEDE RECUPERARSE POR SU NOMBRE DE CLASE CON LA PRIMERA LETRA MINÚSCULAS ("ferrari") O BIEN
//	MEDIANTE UN ALIAS EXPLÍCITO ASOCIADO ("ROJO") ... una u otra forma, no las 2 a la vez.

//@Component					// SI NO SE DEFINE UN ALIAS SE ASIGNARÁ AUTOMÁTICAMENTE "ferrari" == nombre de la clase en minúsculas.
@Component("ROJO")				// ALIAS PERSONALIZADO ... USAREMOS "ROJO" EN LUGAR DE "ferrari" == para el método getBean(alias).
@Qualifier("ITALIANO")			// SE ADMITE LA DEFINICIÓN SIMULTANEA DE UN ALIAS (getBean) Y UN QUALIFICADOR (solo válido en autoinyección @Autowired).
@Scope("prototype")				// CUANDO QUEREMOS INSTANCIAS FÍSICAMENTE DISTINTAS (por defecto son "singleton")
public class Ferrari extends Deportivo {}


// RECORDAR, EL VALOR DE @Qualifier NO SIRVE PARA SER USADO CON spring.getBean("xxx"), YA QUE SÓLO FUNCIONA CON @Autowired("xxx").