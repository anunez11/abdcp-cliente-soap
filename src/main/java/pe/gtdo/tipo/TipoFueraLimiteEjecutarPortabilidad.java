package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"fechaLimiteProgramacionPortabilidad", "fechaLimiteEjecucionPortabilidad"})
public class TipoFueraLimiteEjecutarPortabilidad {
	
	@XmlElement(name="FechaLimiteProgramacionPortabilidad")		
	String fechaLimiteProgramacionPortabilidad;
	
	@XmlElement(name="FechaLimiteEjecucionPortabilidad")		
	String fechaLimiteEjecucionPortabilidad;

	public String getFechaLimiteProgramacionPortabilidad() {
		return fechaLimiteProgramacionPortabilidad;
	}

	public void setFechaLimiteProgramacionPortabilidad(
			String fechaLimiteProgramacionPortabilidad) {
		this.fechaLimiteProgramacionPortabilidad = fechaLimiteProgramacionPortabilidad;
	}

	public String getFechaLimiteEjecucionPortabilidad() {
		return fechaLimiteEjecucionPortabilidad;
	}

	public void setFechaLimiteEjecucionPortabilidad(
			String fechaLimiteEjecucionPortabilidad) {
		this.fechaLimiteEjecucionPortabilidad = fechaLimiteEjecucionPortabilidad;
	}
	
	
	
	
}
