package cl.jesu.clinica.modelos.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Citas")
public class CitasEntity {

	@Id
	@Column(name="ID")
	private int id;
	@JoinColumn(name="Paciente_ID", referencedColumnName="ID")
	private int pacienteId;
	@JoinColumn(name="Doctor_ID", referencedColumnName="ID")
	private int doctor_id;
	@Column(name="Fecha")
	private LocalDateTime fecha;
	@JoinColumn(name="Factura_ID", referencedColumnName="ID")
	private int facturaId;
	
	public CitasEntity() {
		super();
	}

	public CitasEntity(int id, int pacienteId, int doctorId, LocalDateTime fecha,
			int facturaId) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.doctor_id = doctorId;
		this.fecha = fecha;
		this.facturaId = facturaId;
	}

	public CitasEntity(int pacienteId, int doctorId, LocalDateTime fecha, int facturaId) {
		super();
		this.pacienteId = pacienteId;
		this.doctor_id = doctorId;
		this.fecha = fecha;
		this.facturaId = facturaId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public int getDoctorId() {
		return doctor_id;
	}

	public void setDoctorId(int doctorId) {
		this.doctor_id = doctorId;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public int getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
	}
	
	
}
