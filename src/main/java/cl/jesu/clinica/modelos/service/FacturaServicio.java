package cl.jesu.clinica.modelos.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import cl.jesu.clinica.modelos.Entity.FacturaEntity;
import cl.jesu.clinica.modelos.repository.IFacturaRepository;

@Service
public class FacturaServicio {

	public FacturaServicio() {
		
	}
	
	private IFacturaRepository facRepo;
	
	public ArrayList<FacturaEntity>obtenerfacturas(){
		return (ArrayList<FacturaEntity>) facRepo.findAll();
	}
	
	public FacturaEntity obtenerFactura(int id) {
		return facRepo.findById(id).get();
	}
	
	public void crearFactura(FacturaEntity factura) {
		facRepo.save(factura);
	}
	
	public void actualizarFactura(FacturaEntity factura) {
		facRepo.save(factura);
	}
	
	public void borrarFactura(int id) {
		facRepo.delete(facRepo.getOne(id));
	}
}
