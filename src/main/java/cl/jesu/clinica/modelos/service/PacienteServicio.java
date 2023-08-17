package cl.jesu.clinica.modelos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jesu.clinica.modelos.Entity.PacienteEntity;
import cl.jesu.clinica.modelos.repository.IPacienteRepository;

@Service
public class PacienteServicio {

	public PacienteServicio() {
		
	}
	
	@Autowired
	private IPacienteRepository pacRepo;
	
	public ArrayList<PacienteEntity>obtenerPacientes(){
		return (ArrayList<PacienteEntity>) pacRepo.findAll();
	}
	
	public PacienteEntity obtenerPaciente(int id) {
		return pacRepo.findById(id).get();
	}
	
	public void crearPaciente(PacienteEntity paciente) {
		pacRepo.save(paciente);
	}
	
	public void actualizarPaciente(PacienteEntity paciente) {
		pacRepo.save(paciente);
	}
	
	public void borrarPaciente(int id) {
		pacRepo.delete(pacRepo.getOne(id));
	}
}
