package cl.jesu.clinica.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cl.jesu.clinica.modelos.Entity.HistorialEntity;
import cl.jesu.clinica.modelos.Entity.PacienteEntity;
import cl.jesu.clinica.modelos.service.PacienteServicio;

@RestController
@RequestMapping("/PacientesRest")
public class PacientesRestController {

	@Autowired
	private PacienteServicio pacServ;

	@GetMapping
	public ArrayList<PacienteEntity> obtenerPacientes() {
		return pacServ.obtenerPacientes();
		
	}

	@GetMapping("${id}")
	public PacienteEntity obtenerPaciente(@PathVariable int id) {
		return pacServ.obtenerPaciente(id);
	}
	
	@PostMapping
	public void crearPaciente(@RequestBody PacienteEntity paciente) {
		pacServ.crearPaciente(paciente);
	}
	
	@PutMapping("/{id}")
	public void actualizarPaciente(@PathVariable int id, @RequestBody PacienteEntity paciente) {
		PacienteEntity pacienteExistente = pacServ.obtenerPaciente(id);
		if(pacienteExistente != null) {
			paciente.setId(id);
			pacServ.actualizarPaciente(paciente);
		}
	}
	
	@DeleteMapping("/{id}")
	public void borrarPaciente(@PathVariable int id) {
		pacServ.borrarPaciente(id);
	}
}
