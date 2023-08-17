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
	private int id_historial;
	@JoinColumn(name="Paciente_ID", referencedColumnName="ID")
	private int Paciente_ID;
	@JoinColumn(name="Doctor_ID", referencedColumnName="ID")
	private int Doctor_ID ;
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
	
	
	public HistorialEntity(int id) {
		super();
		this.id_historial = id;
	}


	public HistorialEntity(int id, int Paciente_ID, int doctor, LocalDateTime fechaCita,
			String sintomas, String diagnostico, String tratamiento) {
		super();
		this.id_historial = id;
		this.Paciente_ID = Paciente_ID;
		this.Doctor_ID = doctor;
		this.fechaCita = fechaCita;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public HistorialEntity(int Paciente_ID, int doctor, LocalDateTime fechaCita, String sintomas,
			String diagnostico, String tratamiento) {
		super();
		this.Paciente_ID = Paciente_ID;
		this.Doctor_ID = doctor;
		this.fechaCita = fechaCita;
		this.sintomas = sintomas;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
	}

	public int getId() {
		return id_historial;
	}

	public void setId(int id) {
		this.id_historial = id;
	}

	public int getPaciente() {
		return Paciente_ID;
	}

	public void setPaciente(int Paciente_ID) {
		this.Paciente_ID = Paciente_ID;
	}

	public int getDoctor() {
		return Doctor_ID;
	}

	public void setDoctor(int doctor) {
		this.Doctor_ID = doctor;
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
