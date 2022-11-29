package ar.com.codoAcodo.exception;

import java.util.Date;

public class Venta {

	private String socio;
	private MedioDePago medioDePago;
	private Date fecha;
	private Double montoVenta;

	public Venta(String socio, MedioDePago medioDePago, Date fecha, Double montoVenta) {
		super();
		this.setSocio(socio);
		this.setMedioDePago(medioDePago);
		this.setFecha(fecha);
		this.setMontoVenta(montoVenta);
	}

	public String getSocio() {
		return socio;
	}

	public void setSocio(String socio) {
		this.socio = socio;
	}

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getMontoVenta() {
		return montoVenta;
	}

	public void setMontoVenta(Double montoVenta) {
		this.montoVenta = montoVenta;
	}

}
