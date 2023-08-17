package cl.jesu.clinica.modelos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jesu.clinica.modelos.Entity.Especialidad;
import cl.jesu.clinica.modelos.repository.IEspecialidadRepository;

@Service
public class EspecialidadServicio {

	public EspecialidadServicio() {
		
	}
	@Autowired
	private IEspecialidadRepository esRepo;
	
	public ArrayList<Especialidad> obtenerEspecialidades() {
		return (ArrayList<Especialidad>) esRepo.findAll();
	}
	
	public Especialidad obtenerEspecialidad(int id) {
		return esRepo.getOne(id);
	}
	
	public void crearEspecialidad(Especialidad esp) {
		esRepo.save(esp);
	}
	
	public void actualizarEspecialidad(Especialidad esp) {
		esRepo.save(esp);
	}
	
	public void borrarEspecialidad(int id) {
		esRepo.delete(esRepo.getOne(id));
	}
}
