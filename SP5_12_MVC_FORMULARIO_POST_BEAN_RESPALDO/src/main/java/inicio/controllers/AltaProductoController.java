package inicio.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import inicio.beans.FormularioAltaProductoBean;


@Controller
public class AltaProductoController {

	/*

	// PARA VOLVER A LA PÁGINA DE INICIO ... no es necesario ya que un <a href="/"> lleva a index.html 
	@GetMapping("/")
	public String inicio() {
		return "index";
	}
	
	*/	
	
	
	
	// CREAR Y GUARDAR EL BEAN DE RESPALDO DEL FORMULARIO HTML EN EL MODEL Y LLAMAR A LA
	//	PÁGINA (plantilla Thymeleaf) QUE MOSTRARÁ DICHO FORMULARIO EN PANTALLA ... EL BEAN
	//	SE CARGARÁ CON LOS DATOS QUE INTRODUZCA EL USUARIO AL PULSAR [SUBMIT], DE MODO QUE
	//	ACTUARÁ COMO UN ELEMENTO DE MEMORIA PARA LOS TODOS Y CADA UNO DE LOS CAMPOS DEL MISMO
	//	(propiedades privadas + getters y setters ... carga reflexiva).	
	//
	//	---> ENTRADA POR GET.
	//
	@GetMapping("/mostrarFormularioAltaProducto")
	public String mostrarFormularioAltaProducto(Model model) {
		
		// CREAR EL BEAN DE RESPALDO Y AÑADIRLO AL MODEL (en estos momentos sus propiedades están "vacias",
		//	cargadas con valor por defecto ... campos: nombre, departamento y precio).		
		model.addAttribute("formularioAltaProductoBean", new FormularioAltaProductoBean());
		
		// SOLICITAR AL CONTROLADOR CENTRAL QUE MUESTRE LA PÁGINA CON EL FORMULARIO QUE DEBE RELLENAR EL CLIENTE.
		return "mostrarformularioAltaProducto";
	}
	
	
		
	// MOSTRAR LA PÁGINA CON LOS DATOS INTRODUCIDOS POR EL FORMULARIO (recuperar el bean de respaldo ya rellenado
	//	... se indica el tipo porque los atributos se guardan en JEE como Object).
	//
	//	---> ENTRADA POR POST.
	//
	@PostMapping("/mostrarDatosIntroducidos")
	public String mostrarDatosIntroducidos(@ModelAttribute FormularioAltaProductoBean formularioAltaProductoBean) {		
		// SE LLAMA A LA PÁGINA QUE DEBE MOSTRAR LOS DATOS EN PANTALLA A PARTIR DEL BEAN DE RESPALDO, EL CUAL
		//	SE HA INYECTADO EN EL REQUEST A PARTIR DEL ATRIBUTO QUE TENÍAMOS EN EL MODELO (ya relleno).
		return "mostrarDatosIntroducidos";
	}
	
}