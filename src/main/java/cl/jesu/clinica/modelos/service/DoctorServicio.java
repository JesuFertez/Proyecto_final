package cl.jesu.clinica.modelos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jesu.clinica.modelos.Entity.DoctorEntity;
import cl.jesu.clinica.modelos.repository.IDoctorRepository;

@Service
public class DoctorServicio {

	public DoctorServicio() {

	}

	@Autowired
	private IDoctorRepository docRepo;

	public ArrayList<DoctorEntity> obtenerDocs() {
		return (ArrayList<DoctorEntity>) docRepo.findAll();
	}

	public DoctorEntity obtenerDoc(int id) {
		return docRepo.findById(id).get();
	}

	public void crearDoc(DoctorEntity doc) {
		docRepo.save(doc);
	}

	public void actualizarDoc(DoctorEntity doc) {
		docRepo.save(doc);
	}

	public void borrarDoc(int id) {
		docRepo.delete(docRepo.getOne(id));

	}
}
