package edu.uda.mvc1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/duplicado") //para trabajar con diferentes raices con elementos de igual nombre
public class DuplicadoControlador {
	
	@RequestMapping("/muestraformulario") //Permite consultar por web.  Se añade url
	public String muestraFormulario()
	{
		return "HolaAlumnosFormulario";
		
	}
	@RequestMapping("/procesarformulario") //Permite consultar por web.  Se añade url
	public String procesarFormulario()
	{	return "HolaAlumnosSpring";
	}
	
	//procesa la información y llama a la vista 
	
	@RequestMapping("/procesarformulario2") //Permite consultar por web.  Se añade url
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo)
	
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo)
	{	//leer información 
		//String nombre = request.getParameter("nombreAlumno");
		
		nombre+= " es el mejor alumno";
		
		String mensajeFinal = "Duplicado: ¿Quién es el mejor alumno? " + nombre;
		//agregando info al modelo 
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "HolaAlumnosSpring";
	}
	
	
	
}
