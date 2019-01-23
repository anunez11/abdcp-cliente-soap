package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"fechaEjecucionPortabilidad"})
public class TipoProgramacionPortabilidad {
   
	@XmlElement(name="FechaEjecucionPortabilidad")	
	String fechaEjecucionPortabilidad;

	public String getFechaEjecucionPortabilidad() {
		return fechaEjecucionPortabilidad;
	}

	public void setFechaEjecucionPortabilidad(String fechaEjecucionPortabilidad) {
		this.fechaEjecucionPortabilidad = fechaEjecucionPortabilidad;
	}
	
	
}
