package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoAceptacionRetorno {
   
	@XmlElement(name="FechaEjecucionRetorno")	
	String fechaEjecucionRetorno;

	public String getFechaEjecucionRetorno() {
		return fechaEjecucionRetorno;
	}

	public void setFechaEjecucionRetorno(String fechaEjecucionRetorno) {
		this.fechaEjecucionRetorno = fechaEjecucionRetorno;
	}
	
	
	
}
