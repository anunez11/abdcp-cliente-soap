package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"fechaLimiteProgramacionPortabilidad","fechaLimiteEjecucionPortabilidad","fechaReferenciaABDCP","numeroConsultaPrevia","fechaActivacion","fechaTerminoContratoEquipo"})
public class TipoSolicitudProcedente {

	@XmlElement(name="FechaLimiteProgramacionPortabilidad")		
	String fechaLimiteProgramacionPortabilidad;
	
	@XmlElement(name="FechaLimiteEjecucionPortabilidad")		
	String fechaLimiteEjecucionPortabilidad;
	
	@XmlElement(name="FechaReferenciaABDCP")
	String fechaReferenciaABDCP;
	
	@XmlElement(name="NumeroConsultaPrevia")		
	String numeroConsultaPrevia;
	
	@XmlElement(name="FechaActivacion")		
	String fechaActivacion;
	
	@XmlElement(name="FechaTerminoContratoEquipo")		
	String fechaTerminoContratoEquipo;

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

	public String getFechaReferenciaABDCP() {
		return fechaReferenciaABDCP;
	}

	public void setFechaReferenciaABDCP(String fechaReferenciaABDCP) {
		this.fechaReferenciaABDCP = fechaReferenciaABDCP;
	}

	public String getNumeroConsultaPrevia() {
		return numeroConsultaPrevia;
	}

	public void setNumeroConsultaPrevia(String numeroConsultaPrevia) {
		this.numeroConsultaPrevia = numeroConsultaPrevia;
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
