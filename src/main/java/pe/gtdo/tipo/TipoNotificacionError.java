package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"codigoError", "descripcionCodigoError"})
public class TipoNotificacionError {
	
	@XmlElement(name="CodigoError")
	String codigoError;
	
	@XmlElement(name="DescripcionCodigoError")
	String descripcionCodigoError;

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getDescripcionCodigoError() {
		return descripcionCodigoError;
	}

	public void setDescripcionCodigoError(String descripcionCodigoError) {
		this.descripcionCodigoError = descripcionCodigoError;
	}
	
	
	
	
	
	
	
}
