package edu.uda.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	@RequestMapping  //mapea la vista que queremos ver
	public String muestraPagina()
	{
		return "paginaEjemplo";
	}
}
