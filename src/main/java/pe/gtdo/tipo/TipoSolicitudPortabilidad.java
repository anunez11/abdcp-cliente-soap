package pe.gtdo.tipo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"codigoReceptor", "codigoCedente", "tipoDocumentoIdentidad","numeroDocumentoIdentidad","cantidadNumeraciones","numeracionSolicitada","observaciones","nombreContacto","emailContacto","telefonoContacto","faxContacto","tipoServicio","cliente","departamentoSolicitud","numeroConsultaPrevia"})
public class TipoSolicitudPortabilidad {

	
	@XmlElement(name="CodigoReceptor")		    
	String codigoReceptor;
	
	@XmlElement(name="CodigoCedente")	
	String codigoCedente;
	
	@XmlElement(name="TipoDocumentoIdentidad")	
	String tipoDocumentoIdentidad;
	
	@XmlElement(name="NumeroDocumentoIdentidad")	
	String numeroDocumentoIdentidad;
	
	@XmlElement(name="CantidadNumeraciones")	
	String cantidadNumeraciones;
	
	@XmlElement(name="NumeracionSolicitada")	
	TipoListaRangosNumeracion numeracionSolicitada;
	
	@XmlElement(name="Observaciones")	
	String observaciones;
	
	@XmlElement(name="NombreContacto")	
	String nombreContacto;
	
	@XmlElement(name="EmailContacto")	
	String emailContacto;
	
	@XmlElement(name="TelefonoContacto")	
	String telefonoContacto;
	
	@XmlElement(name="FaxContacto")	
	String faxContacto;
	
	@XmlElement(name="TipoServicio")	
	String tipoServicio;
	
	@XmlElement(name="Cliente")	
	String cliente;
	
	@XmlElement(name="DepartamentoSolicitud")	
	String departamentoSolicitud;
	
	@XmlElement(name="NumeroConsultaPrevia")	
	String numeroConsultaPrevia;

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

	public String getTipoDocumentoIdentidad() {
		return tipoDocumentoIdentidad;
	}

	public void setTipoDocumentoIdentidad(String tipoDocumentoIdentidad) {
		this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
	}

	public String getNumeroDocumentoIdentidad() {
		return numeroDocumentoIdentidad;
	}

	public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
		this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
	}

	public String getCantidadNumeraciones() {
		return cantidadNumeraciones;
	}

	public void setCantidadNumeraciones(String cantidadNumeraciones) {
		this.cantidadNumeraciones = cantidadNumeraciones;
	}


	
	

	public TipoListaRangosNumeracion getNumeracionSolicitada() {
		return numeracionSolicitada;
	}

	public void setNumeracionSolicitada(
			TipoListaRangosNumeracion numeracionSolicitada) {
		this.numeracionSolicitada = numeracionSolicitada;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDepartamentoSolicitud() {
		return departamentoSolicitud;
	}

	public void setDepartamentoSolicitud(String departamentoSolicitud) {
		this.departamentoSolicitud = departamentoSolicitud;
	}

	public String getNumeroConsultaPrevia() {
		return numeroConsultaPrevia;
	}

	public void setNumeroConsultaPrevia(String numeroConsultaPrevia) {
		this.numeroConsultaPrevia = numeroConsultaPrevia;
	}
	
	
	
	
	
	
}
