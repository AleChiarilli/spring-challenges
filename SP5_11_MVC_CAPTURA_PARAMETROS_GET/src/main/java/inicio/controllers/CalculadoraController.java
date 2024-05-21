package inicio.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// ANOTACIONES A NIVEL DE CLASE (SRCC):

//		@Service		... un bean:	que encapsula lógica de negocio.
//		@Repository		...				relacionado con bases de datos.
//		@Controller		...				controlador del flujo de la aplicación (qué hacer).
//		@Component		...				de uso general (almacena información).


@Controller
public class CalculadoraController {

	// CONVIERTE AUTOMÁTICAMENTE EL VALOR DEL PARÁMETRO DE ENTRADA, QUE SIEMPRE SERÁ 
	//	TEXTO (aunque escribamos un número), EN EL DETERMINADO POR LA VARIABLE LOCAL
	//	DE LA CLASE QUE LO RECIBA.
	
		
	// PULSAR EL ENLACE.
	
	@GetMapping("/elevarAlCuadrado")
	public String elevarAlCuadrado(
									@RequestParam(value="numero", // INYECCIÓN DEL PARÁMETRO DEL REQUEST.
													required=true, 
														defaultValue="0") double numero,									
									Model model) {
								
		System.out.println("\nPARAMETRO DE ENTRADA numero ---> " + numero);
		
		double resultado = Math.pow(numero, 2);
		
		System.out.println("RESULTADO DE ELEVARLO AL CUADRADO ---> " + resultado);
		
		// GUARDAR EN MODEL (ES UN MAPA DE PAREJAS CLAVE-VALOR):
		model.addAttribute("numero", numero);
		model.addAttribute("resultado", resultado);
		
		// DEVOLVER EL NOMBRE DE LA VISTA A SER LLAMADA POR EL CONTROLADOR CENTRAL (DispatcherServlet de Spring MVC).
		return "verResultadoCuadrado";

	}
	
	
	//////////////////////////////////////////////////////////////////////////////
	
	
	// PULSAR EL ENLACE O UTILIZAR EL FORMULARIO.
	
	@GetMapping("/sumar")
	public String elevarAlCuadrado(
									@RequestParam(value="x", 
													required=true, 
														defaultValue="0") double x,

									@RequestParam(value="y", 
													required=true, 
														defaultValue="0") double y,
									
									Model model) {
								
		System.out.println("\nPARAMETRO DE ENTRADA x ---> " + x);
		System.out.println("\nPARAMETRO DE ENTRADA y ---> " + y);
		
		double resultado = x + y;
		
		System.out.println("RESULTADO DE LA SUMA ---> " + resultado);
		
		model.addAttribute("x", x);
		model.addAttribute("y", y);
		model.addAttribute("resultado", resultado);
		
		return "verResultadoSuma";

	}
	
}