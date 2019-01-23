package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"observaciones","codigoReceptor","codigoCedente","numeracionARetornar","fechaEjecucionRetorno","motivoRetorno","nombreContacto","emailContacto","telefonoContacto","faxContacto"})
public class TipoSolicitudRetorno {
	
	@XmlElement(name="Observaciones")
	String observaciones;
	
	@XmlElement(name="CodigoReceptor")
	String codigoReceptor;
	
	@XmlElement(name="CodigoCedente")
	String codigoCedente;
	
	@XmlElement(name="NumeracionARetornar")
	String numeracionARetornar;
	
	@XmlElement(name="FechaEjecucionRetorno")
	String fechaEjecucionRetorno;
	
	@XmlElement(name="MotivoRetorno")
	String motivoRetorno;
	
	@XmlElement(name="NombreContacto")
	String nombreContacto;
	
	@XmlElement(name="EmailContacto")
	String emailContacto;
	
	@XmlElement(name="TelefonoContacto")
	String telefonoContacto;
	
	@XmlElement(name="FaxContacto")
	String faxContacto;

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCodigoReceptor() {
		return codigoReceptor;
	}

	public void setCodigoReceptor(String codigoReceptor) {
		this.codigoReceptor = codigoReceptor;
	}

	public String getCodigoCedente() {
		return codigoCedente;
	}

	public void setCodigoCedente(String codigoCedente) {
		this.codigoCedente = codigoCedente;
	}

	public String getNumeracionARetornar() {
		return numeracionARetornar;
	}

	public void setNumeracionARetornar(String numeracionARetornar) {
		this.numeracionARetornar = numeracionARetornar;
	}

	public String getFechaEjecucionRetorno() {
		return fechaEjecucionRetorno;
	}

	public void setFechaEjecucionRetorno(String fechaEjecucionRetorno) {
		this.fechaEjecucionRetorno = fechaEjecucionRetorno;
	}

	public String getMotivoRetorno() {
		return motivoRetorno;
	}

	public void setMotivoRetorno(String motivoRetorno) {
		this.motivoRetorno = motivoRetorno;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getFaxContacto() {
		return faxContacto;
	}

	public void setFaxContacto(String faxContacto) {
		this.faxContacto = faxContacto;
	}
	
		
	
	
}
