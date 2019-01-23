package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"identificacionSolicitud", "fechaRecepcionMensajeAnterior", "fechaReferenciaABDCP","numeracion"})
public class TipoAsignacionNumeroSolicitud {
	
	@XmlElement(name="IdentificacionSolicitud")		
	String  identificacionSolicitud;
	
	@XmlElement(name="FechaRecepcionMensajeAnterior")		
	String  fechaRecepcionMensajeAnterior;

	@XmlElement(name="FechaReferenciaABDCP")		
	String  fechaReferenciaABDCP;
	
	@XmlElement(name="Numeracion")		
	String  numeracion;

	public String getIdentificacionSolicitud() {
		return identificacionSolicitud;
	}

	public void setIdentificacionSolicitud(String identificacionSolicitud) {
		this.identificacionSolicitud = identificacionSolicitud;
	}

	public String getFechaRecepcionMensajeAnterior() {
		return fechaRecepcionMensajeAnterior;
	}

	public void setFechaRecepcionMensajeAnterior(
			String fechaRecepcionMensajeAnterior) {
		this.fechaRecepcionMensajeAnterior = fechaRecepcionMensajeAnterior;
	}

	public String getFechaReferenciaABDCP() {
		return fechaReferenciaABDCP;
	}

	public void setFechaReferenciaABDCP(String fechaReferenciaABDCP) {
		this.fechaReferenciaABDCP = fechaReferenciaABDCP;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	
	
	
	
	
	
}
