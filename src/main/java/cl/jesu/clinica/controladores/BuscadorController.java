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
import cl.jesu.clinica.modelos.Entity.PacienteEntity;
import cl.jesu.clinica.modelos.service.HistorialServicio;
import cl.jesu.clinica.modelos.service.PacienteServicio;

@Controller
public class BuscadorController {
	
	@Autowired
	PacienteServicio pacServ;
	
	@Autowired
	HistorialServicio hisServ;
	
	
	@RequestMapping(path="/Pacientes", method = RequestMethod.GET)
	public ModelAndView mostarPacientes(ModelMap model) {
		
		List<PacienteEntity>listaPacientes= pacServ.obtenerPacientes();
		model.addAttribute("listaPacientes", listaPacientes);
		
		return new ModelAndView("pacientes", model);
	}
	
	@RequestMapping(path="/Pacientes", method = RequestMethod.POST)
	public ModelAndView mostrarPaciente(ModelMap model,
			@RequestParam("buscador")int id) {
		PacienteEntity paciente= pacServ.obtenerPaciente(id);
		model.addAttribute("paciente",paciente);
		return new ModelAndView("paciente-id", model);
	}

}
