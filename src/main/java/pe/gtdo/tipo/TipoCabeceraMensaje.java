package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"identificadorMensaje", "remitente", "destinatario","fechaCreacionMensaje","identificadorProceso"})
public class TipoCabeceraMensaje {
	@XmlElement(name="IdentificadorMensaje" )
	String identificadorMensaje;
	@XmlElement(name="Remitente" )
	String remitente;
	@XmlElement(name="Destinatario" )
	String destinatario;
	@XmlElement(name="FechaCreacionMensaje" )
	String fechaCreacionMensaje;
	@XmlElement(name="IdentificadorProceso" )
	String identificadorProceso;
	public String getIdentificadorMensaje() {
		return identificadorMensaje;
	}
	public void setIdentificadorMensaje(String identificadorMensaje) {
		this.identificadorMensaje = identificadorMensaje;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getFechaCreacionMensaje() {
		return fechaCreacionMensaje;
	}
	public void setFechaCreacionMensaje(String fechaCreacionMensaje) {
		this.fechaCreacionMensaje = fechaCreacionMensaje;
	}
	public String getIdentificadorProceso() {
		return identificadorProceso;
	}
	public void setIdentificadorProceso(String identificadorProceso) {
		this.identificadorProceso = identificadorProceso;
	}
	
	
	
	
	
	
	
}
