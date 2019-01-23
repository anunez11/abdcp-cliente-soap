package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"identificacionSolicitud","causaRechazo","numeracion","fechaVencimiento","fechaActivacion","fechaTerminoContratoEquipo","monto","moneda"})
public class TipoRechazadaABDCP {
   
	@XmlElement(name="IdentificacionSolicitud")	
	String identificacionSolicitud;
	
	@XmlElement(name="CausaRechazo")	
	String causaRechazo;
	
	@XmlElement(name="Numeracion")	
	String numeracion;
	
	@XmlElement(name="FechaVencimiento")	
	String fechaVencimiento;
	
	@XmlElement(name="FechaActivacion")	
	String fechaActivacion;
	
	@XmlElement(name="FechaTerminoContratoEquipo")	
	String fechaTerminoContratoEquipo;
	
	@XmlElement(name="Monto")	
	String monto;
	
	@XmlElement(name="Moneda")	
	String moneda;

	public String getIdentificacionSolicitud() {
		return identificacionSolicitud;
	}

	public void setIdentificacionSolicitud(String identificacionSolicitud) {
		this.identificacionSolicitud = identificacionSolicitud;
	}

	public String getCausaRechazo() {
		return causaRechazo;
	}

	public void setCausaRechazo(String causaRechazo) {
		this.causaRechazo = causaRechazo;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getFechaActivacion() {
		return fechaActivacion;
	}

	public void setFechaActivacion(String fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}

	public String getFechaTerminoContratoEquipo() {
		return fechaTerminoContratoEquipo;
	}

	public void setFechaTerminoContratoEquipo(String fechaTerminoContratoEquipo) {
		this.fechaTerminoContratoEquipo = fechaTerminoContratoEquipo;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
	
	
	
}
