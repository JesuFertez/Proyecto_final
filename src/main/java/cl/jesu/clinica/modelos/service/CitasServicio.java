package cl.jesu.clinica.modelos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jesu.clinica.modelos.Entity.CitasEntity;
import cl.jesu.clinica.modelos.repository.ICitasRepository;

@Service
public class CitasServicio {
	
	public CitasServicio() {
		
	}

	@Autowired
	private ICitasRepository citasRepo;
	
	public ArrayList<CitasEntity> obtenerCitas(){
		return (ArrayList<CitasEntity>) citasRepo.findAll();
	}
	
	public CitasEntity obtenerCitas(int id) {
		return citasRepo.findById(id).get();
	}
	
	public void crearCita(CitasEntity cita) {
		citasRepo.save(cita);
	}
	
	public void actualizarCita(CitasEntity cita) {
		citasRepo.save(cita);
	}
	
	public void borrarCita(int id) {
		citasRepo.delete(citasRepo.getOne(id));
	}
}
