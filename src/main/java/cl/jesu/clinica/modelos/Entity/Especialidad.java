package cl.jesu.clinica.modelos.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Especialidades")
public class Especialidad {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Nombre")
	private String nombre;
	
	public Especialidad() {
		super();
	}

	public Especialidad(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Especialidad(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
