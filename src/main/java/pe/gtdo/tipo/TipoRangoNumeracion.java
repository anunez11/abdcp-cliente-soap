package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"inicioRango", "finalRango", "tipoPortabilidadCedente","tipoPortabilidadReceptor"})
public class TipoRangoNumeracion {
  
	@XmlElement(name="InicioRango")		
	String inicioRango; 
	@XmlElement(name="FinalRango")		
	String finalRango;
	@XmlElement(name="TipoPortabilidadCedente")		
	String tipoPortabilidadCedente;
	@XmlElement(name="TipoPortabilidadReceptor")		
	String tipoPortabilidadReceptor;
	public String getInicioRango() {
		return inicioRango;
	}
	public void setInicioRango(String inicioRango) {
		this.inicioRango = inicioRango;
	}
	public String getFinalRango() {
		return finalRango;
	}
	public void setFinalRango(String finalRango) {
		this.finalRango = finalRango;
	}
	public String getTipoPortabilidadCedente() {
		return tipoPortabilidadCedente;
	}
	public void setTipoPortabilidadCedente(String tipoPortabilidadCedente) {
		this.tipoPortabilidadCedente = tipoPortabilidadCedente;
	}
	public String getTipoPortabilidadReceptor() {
		return tipoPortabilidadReceptor;
	}
	public void setTipoPortabilidadReceptor(String tipoPortabilidadReceptor) {
		this.tipoPortabilidadReceptor = tipoPortabilidadReceptor;
	}
	
	
	
	
	
	
	
}
