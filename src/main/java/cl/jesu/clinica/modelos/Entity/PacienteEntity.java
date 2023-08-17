package cl.jesu.clinica.modelos.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pacientes")
public class PacienteEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="Nombre")
	private String nombre;
	@Column(name="Fecha_Nacimiento")
	private LocalDateTime fechaNacimiento;
	
	public PacienteEntity() {
		super();
	}

	public PacienteEntity(int id, String nombre, LocalDateTime fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public PacienteEntity(String nombre, LocalDateTime fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
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

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
