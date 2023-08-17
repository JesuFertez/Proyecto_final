package cl.jesu.clinica.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.jesu.clinica.modelos.Entity.HistorialEntity;
import cl.jesu.clinica.modelos.service.HistorialServicio;

@Controller
public class HistorialController {

	@Autowired
	HistorialServicio hisServ;
	
	@RequestMapping(path = "/Historial", method = RequestMethod.POST)
	public ModelAndView mostrarHistorial(ModelMap model,
			@RequestParam("id_paciente")int id) {

		List<HistorialEntity> historialPaciente = hisServ.finHistorialPaciente(id);
		model.addAttribute("historialPaciente", historialPaciente);
		return new ModelAndView("historial", model);
	}

}
