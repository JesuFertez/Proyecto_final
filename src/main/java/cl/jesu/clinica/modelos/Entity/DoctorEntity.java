package cl.jesu.clinica.modelos.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Doctores")
public class DoctorEntity {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Nombre")
	private String nombre;
	@JoinColumn(name="Especialidad_ID", referencedColumnName="ID")
	private int especialidad;
	@Column(name="Experiencia")
	private int experiencia;
	
	public DoctorEntity() {
		super();
	}

	public DoctorEntity(int id, String nombre, int especialidad, int experiencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}

	public DoctorEntity(String nombre, int especialidad, int experiencia) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(int especialidad) {
		this.especialidad = especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
}
