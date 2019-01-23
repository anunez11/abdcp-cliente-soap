package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoCancelacionNoProgramacionFecha {
	
	@XmlElement(name="FechaLimiteProgramacionPortabilidad")		
	String fechaLimiteProgramacionPortabilidad;

	public String getFechaLimiteProgramacionPortabilidad() {
		return fechaLimiteProgramacionPortabilidad;
	}

	public void setFechaLimiteProgramacionPortabilidad(
			String fechaLimiteProgramacionPortabilidad) {
		this.fechaLimiteProgramacionPortabilidad = fechaLimiteProgramacionPortabilidad;
	}
	
	
	
	
}
