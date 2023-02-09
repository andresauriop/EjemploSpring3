package edu.uda.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraformulario") //Permite consultar por web.  Se añade url
	public String muestraFormulario()
	{
		return "HolaAlumnosFormulario";
		
	}
	@RequestMapping("/procesarformulario") //Permite consultar por web.  Se añade url
	public String procesarFormulario()
	{	return "HolaAlumnosSpring";
	}
}
