package cl.jesu.clinica.modelos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jesu.clinica.modelos.Entity.HistorialEntity;
import cl.jesu.clinica.modelos.repository.IHistorialRepository;

@Service
public class HistorialServicio {

	public HistorialServicio() {
		
	}
	
	@Autowired
	private IHistorialRepository hiRepo;
	
	public ArrayList<HistorialEntity> obtenerHisorial(){
		return(ArrayList<HistorialEntity>) hiRepo.findAll();
	}
	
	public List<HistorialEntity>finHistorialPaciente(int id){
		return hiRepo.findHistorialPaciente(id);
	}
	
	public HistorialEntity obtenerHistorial(int id) {
	return hiRepo.findById(id).get();
	}
	
	public void crearHistorial(HistorialEntity historial) {
		hiRepo.save(historial);
	}
	
	public void actualizarHistorial(HistorialEntity historial) {
		hiRepo.save(historial);
	}
	
	public void borrarHistorial(int id) {
		hiRepo.delete(hiRepo.getOne(id));
	}
	

}
