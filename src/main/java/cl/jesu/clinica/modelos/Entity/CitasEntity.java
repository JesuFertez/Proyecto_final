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
	private PacienteEntity pacienteId;
	@JoinColumn(name="Doctor_ID", referencedColumnName="ID")
	private DoctorEntity doctorId;
	@Column(name="Fecha")
	private LocalDateTime fecha;
	@JoinColumn(name="Factura_ID", referencedColumnName="ID")
	private FacturaEntity facturaId;
	
	public CitasEntity() {
		super();
	}

	public CitasEntity(int id, PacienteEntity pacienteId, DoctorEntity doctorId, LocalDateTime fecha,
			FacturaEntity facturaId) {
		super();
		this.id = id;
		this.pacienteId = pacienteId;
		this.doctorId = doctorId;
		this.fecha = fecha;
		this.facturaId = facturaId;
	}

	public CitasEntity(PacienteEntity pacienteId, DoctorEntity doctorId, LocalDateTime fecha, FacturaEntity facturaId) {
		super();
		this.pacienteId = pacienteId;
		this.doctorId = doctorId;
		this.fecha = fecha;
		this.facturaId = facturaId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PacienteEntity getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(PacienteEntity pacienteId) {
		this.pacienteId = pacienteId;
	}

	public DoctorEntity getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(DoctorEntity doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public FacturaEntity getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(FacturaEntity facturaId) {
		this.facturaId = facturaId;
	}
	
	
}
