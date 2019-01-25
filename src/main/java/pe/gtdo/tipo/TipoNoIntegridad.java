package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"numeroSecuencialSolicitud", "identificadorMensajeErroneo", "causaNoIntegridad","fechaRecepcionMensajeAnterior"})
public class TipoNoIntegridad {

	@XmlElement(name="NumeroSecuencialSolicitud")
	String numeroSecuencialSolicitud;
	
	@XmlElement(name="IdentificadorMensajeErroneo")
	String identificadorMensajeErroneo;
	
	@XmlElement(name="CausaNoIntegridad")
	String causaNoIntegridad;
	
	@XmlElement(name="FechaRecepcionMensajeAnterior")
	String fechaRecepcionMensajeAnterior;

	public String getNumeroSecuencialSolicitud() {
		return numeroSecuencialSolicitud;
	}

	public void setNumeroSecuencialSolicitud(String numeroSecuencialSolicitud) {
		this.numeroSecuencialSolicitud = numeroSecuencialSolicitud;
	}

	public String getIdentificadorMensajeErroneo() {
		return identificadorMensajeErroneo;
	}

	public void setIdentificadorMensajeErroneo(String identificadorMensajeErroneo) {
		this.identificadorMensajeErroneo = identificadorMensajeErroneo;
	}

	public String getCausaNoIntegridad() {
		return causaNoIntegridad;
	}

	public void setCausaNoIntegridad(String causaNoIntegridad) {
		this.causaNoIntegridad = causaNoIntegridad;
	}

	public String getFechaRecepcionMensajeAnterior() {
		return fechaRecepcionMensajeAnterior;
	}

	public void setFechaRecepcionMensajeAnterior(String fechaRecepcionMensajeAnterior) {
		this.fechaRecepcionMensajeAnterior = fechaRecepcionMensajeAnterior;
	}
	
	
	
	
}
