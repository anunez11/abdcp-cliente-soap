package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"fechaReferenciaABDCP","numeracion","codigoReceptor","codigoCedente","tipoDocumentoIdentidad","numeroDocumentoIdentidad","tipoPortabilidadCedente","nombreContacto","emailContacto","telefonoContacto","faxContacto","tipoServicio","cliente"})
public class TipoEnvioSolicitudCedente {
		
	@XmlElement(name="FechaReferenciaABDCP")	
	String  fechaReferenciaABDCP ;
	
	@XmlElement(name="Numeracion")	
	String  numeracion ;
	
	@XmlElement(name="CodigoReceptor")	
	String  codigoReceptor ;
	
	@XmlElement(name="CodigoCedente")	
	String  codigoCedente ;
	
	@XmlElement(name="TipoDocumentoIdentidad")	
	String  tipoDocumentoIdentidad ;
	
	@XmlElement(name="NumeroDocumentoIdentidad")	
	String  numeroDocumentoIdentidad ;
	
	@XmlElement(name="TipoPortabilidadCedente")	
	String  tipoPortabilidadCedente ;
	
	@XmlElement(name="NombreContacto")	
	String  nombreContacto ;
	
	@XmlElement(name="EmailContacto")	
	String  emailContacto ;
	
	@XmlElement(name="TelefonoContacto")	
	String  telefonoContacto ;
	
	@XmlElement(name="FaxContacto")	
	String  faxContacto ;
	
	@XmlElement(name="TipoServicio")	
	String  tipoServicio ;
	
	@XmlElement(name="Cliente")	
	String  cliente ;

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

	public String getTipoPortabilidadCedente() {
		return tipoPortabilidadCedente;
	}

	public void setTipoPortabilidadCedente(String tipoPortabilidadCedente) {
		this.tipoPortabilidadCedente = tipoPortabilidadCedente;
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
	
	
	
	
	
	
}
