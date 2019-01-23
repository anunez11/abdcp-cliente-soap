package pe.gtdo.tipo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoListaRangosNumeracion {
   
	@XmlElement(name="RangoNumeracion")
	List<TipoRangoNumeracion> rangoNumeracion;

	public List<TipoRangoNumeracion> getRangoNumeracion() {
		return rangoNumeracion;
	}

	public void setRangoNumeracion(List<TipoRangoNumeracion> rangoNumeracion) {
		this.rangoNumeracion = rangoNumeracion;
	}
	
	
	
	
}
