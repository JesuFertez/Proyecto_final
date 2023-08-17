package cl.jesu.clinica.modelos.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Historia_Clinica")
public class HistorialEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@JoinColumn(name="Paciente_ID", referencedColumnName="ID")
	private int paciente;
	@JoinColumn(name="Doctor_ID", referencedColumnName="ID")
	private int doctor;
	@Column(name="Fecha_Cita")
	private LocalDateTime fechaCita;
	@Column(name="Sintomas")
	private String sintomas;
	@Column(name="Diagnostico")
	private String diagnostico;
	@Column(name="Tratamiento")
	private String tratamiento;
	
	public HistorialEntity() {
		super();
	}

	public HistorialEntity(int id, int paciente, int doctor, LocalDateTime fechaCita,
			String sintomas, String diagnostico, String tratamiento) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.doctor = doctor;
		this.fechaCita = fechaCita;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public HistorialEntity(int paciente, int doctor, LocalDateTime fechaCita, String sintomas,
			String diagnostico, String tratamiento) {
		super();
		this.paciente = paciente;
		this.doctor = doctor;
		this.fechaCita = fechaCita;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public int getDoctor() {
		return doctor;
	}

	public void setDoctor(int doctor) {
		this.doctor = doctor;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	
}
