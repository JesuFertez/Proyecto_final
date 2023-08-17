package cl.jesu.clinica.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import cl.jesu.clinica.modelos.Entity.HistorialEntity;
import cl.jesu.clinica.modelos.service.HistorialServicio;

@RestController
@RequestMapping("/HistorialRest")
public class HistorialRestController {

@Autowired
private HistorialServicio histoServ;
	
@GetMapping
public ArrayList<HistorialEntity>obtenerHistorial(){
	return histoServ.obtenerHisorial();
}

@GetMapping("${id}")
public HistorialEntity obtenerHistorialPorId(@PathVariable int id) {
	return histoServ.obtenerHistorial(id);
}

@PostMapping
public void crearHistorial(@RequestBody HistorialEntity historial) {
	histoServ.crearHistorial(historial);
}

@PutMapping("/{id}")
public void actualizarhistorial(@PathVariable int id, @RequestBody HistorialEntity historial) {
	HistorialEntity historialExitente = histoServ.obtenerHistorial(id);
	if(historialExitente != null) {
		historial.setId(id);
		histoServ.actualizarHistorial(historial);
	}
}

@DeleteMapping("/{id}")
public void borrarHistorial(@PathVariable int id) {
	histoServ.borrarHistorial(id);
}

}
