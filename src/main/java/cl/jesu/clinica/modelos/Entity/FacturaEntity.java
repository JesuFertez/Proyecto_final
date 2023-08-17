package cl.jesu.clinica.modelos.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Facturas")
public class FacturaEntity {

	@Id
	@Column(name="ID")
	private int id_factura;
	@Column(name="Monto")
	private float monto;
	@Column(name="Fecha_Pago")
	private LocalDateTime fechaPago;
	
	public FacturaEntity() {
		super();
	}
	

	public FacturaEntity(int id) {
		super();
		this.id_factura = id;
	}


	public FacturaEntity(float monto, LocalDateTime fechaPago) {
		super();
		this.monto = monto;
		this.fechaPago = fechaPago;
	}

	public FacturaEntity(int id, float monto, LocalDateTime fechaPago) {
		super();
		this.id_factura = id;
		this.monto = monto;
		this.fechaPago = fechaPago;
	}

	public int getId() {
		return id_factura;
	}

	public void setId(int id) {
		this.id_factura = id;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}
	
}
