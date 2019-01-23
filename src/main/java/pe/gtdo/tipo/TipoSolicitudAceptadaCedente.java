package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"observaciones", "fechaActivacion", "fechaTerminoContratoEquipo"})
public class TipoSolicitudAceptadaCedente {
	
	
	@XmlElement(name="Observaciones")
	String observaciones;
	@XmlElement(name="FechaActivacion")
	String fechaActivacion;
	@XmlElement(name="FechaTerminoContratoEquipo")
	String fechaTerminoContratoEquipo;
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public String getFechaActivacion() {
		return fechaActivacion;
	}
	public void setFechaActivacion(String fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}
	public String getFechaTerminoContratoEquipo() {
		return fechaTerminoContratoEquipo;
	}
	public void setFechaTerminoContratoEquipo(String fechaTerminoContratoEquipo) {
		this.fechaTerminoContratoEquipo = fechaTerminoContratoEquipo;
	}
	
	
	
	
	
	
}
