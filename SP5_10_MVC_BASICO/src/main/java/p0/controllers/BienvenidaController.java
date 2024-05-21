package p0.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;


@Controller 	// ESTA CLASE ES UN CONTROLADOR DE SPRING MVC
public class BienvenidaController {

	//@RequestMapping("/bienvenida") ... MUY GÉNERICO, PARA CUALQUIER TIPO: get, post ... etc.
	
	@GetMapping("/bienvenida")	// ESTE MÉTODO ATIENDE LAS PETICIONES /bienvenida LANZADAS DESDE EL CLIENTE.
	public String bienvenida(Model model) {
		
		model.addAttribute("mensaje", "!! BIENVENIDO A LA APLICACION !!"); // AÑADIR ATRIBUTOS A LA PETICIÓN.
		
		return "bienvenida"; // LA PLANTILLA THYMELEAF QUE SE LLAMARÁ A CONTINUACIÓN.
		
	}
	
}