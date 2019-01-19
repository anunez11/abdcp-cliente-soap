package pe.gtdo.msg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoCuerpoMensaje {

	   
	  @XmlElement(name="IdMensaje" )
	  String IdMensaje;
	
	@XmlElement(name="SolicitudPortabilidad" )
	TipoSolicitudPortabilidad solicitudPortabilidad  ;
	
	@XmlElement(name="NoIntegridad" )
    TipoNoIntegridad noIntegridad;

	@XmlElement(name="AsignacionNumeroSolicitud" )
    TipoAsignacionNumeroSolicitud asignacionNumeroSolicitud  ;

	@XmlElement(name="RechazadaABDCP" )
	TipoRechazadaABDCP rechazadaABDCP  ;
	
	@XmlElement(name="EnvioSolicitudCedente" )
	TipoEnvioSolicitudCedente envioSolicitudCedente  ;
	
	@XmlElement(name="ObjecionConcesionarioCedente" )
	TipoObjecionConcesionarioCedente objecionConcesionarioCedente  ;
	
	@XmlElement(name="SolicitudAceptadaCedente" )
	TipoSolicitudAceptadaCedente solicitudAceptadaCedente  ;
	
	@XmlElement(name="SolicitudProcedente" )
	TipoSolicitudProcedente solicitudProcedente  ;
	
	@XmlElement(name="ProgramacionPortabilidad" )
	TipoProgramacionPortabilidad programacionPortabilidad  ;
	
	@XmlElement(name="CancelacionNoProgramacionFecha" )
	TipoCancelacionNoProgramacionFecha cancelacionNoProgramacionFecha  ;
	
	@XmlElement(name="FueraLimiteEjecutarPortabilidad" )
	TipoFueraLimiteEjecutarPortabilidad fueraLimiteEjecutarPortabilidad  ;
	
	@XmlElement(name="programadaEjecutarPortabilidad" )
	TipoProgramadaEjecutarPortabilidad programadaEjecutarPortabilidad  ;
	
	@XmlElement(name="SolicitudRetorno" )
	TipoSolicitudRetorno solicitudRetorno  ;
	
	@XmlElement(name="DenegacionRetorno" )
	TipoDenegacionRetorno denegacionRetorno  ;
	
	@XmlElement(name="AceptacionRetorno" )
	TipoAceptacionRetorno aceptacionRetorno  ;
	
	@XmlElement(name="ConsultaPrevia" )
	TipoSolicitudPortabilidad consultaPrevia  ;
	
	@XmlElement(name="AsignacionNumeroConsultaPrevia" )
	TipoAsignacionNumeroSolicitud asignacionNumeroConsultaPrevia  ;
	
	@XmlElement(name="consultaPreviaRechazadaABDCP" )
	TipoRechazadaABDCP ConsultaPreviaRechazadaABDCP  ;
	
	@XmlElement(name="ConsultaPreviaEnvioCedente" )
	TipoEnvioSolicitudCedente consultaPreviaEnvioCedente  ;
	
	@XmlElement(name="ConsultaPreviaObjecionConcesionarioCedente" )
	TipoObjecionConcesionarioCedente consultaPreviaObjecionConcesionarioCedente  ;
	
	@XmlElement(name="ConsultaPreviaAceptadaCedente" )
	TipoSolicitudAceptadaCedente consultaPreviaAceptadaCedente  ;
	
	@XmlElement(name="ConsultaPreviaProcedente" )
	TipoSolicitudProcedente consultaPreviaProcedente  ;
	
	@XmlElement(name="SolicitudProcedenteConsultaPreviaProcedente" )
	TipoSolicitudProcedente solicitudProcedenteConsultaPreviaProcedente  ;
	
	@XmlElement(name="AcreditacionPagoDeuda" )
	TipoAcreditacionPagoDeuda acreditacionPagoDeuda  ;
	
	@XmlElement(name="AcreditacionPagoDeudaCedente" )
	TipoAcreditacionPagoDeuda acreditacionPagoDeudaCedente  ;
	
	@XmlElement(name="NotificacionError" )
	TipoNotificacionError notificacionError  ;

	public TipoSolicitudPortabilidad getSolicitudPortabilidad() {
		return solicitudPortabilidad;
	}

	public void setSolicitudPortabilidad(TipoSolicitudPortabilidad solicitudPortabilidad) {
		this.solicitudPortabilidad = solicitudPortabilidad;
	}

	public TipoNoIntegridad getNoIntegridad() {
		return noIntegridad;
	}

	public void setNoIntegridad(TipoNoIntegridad noIntegridad) {
		this.noIntegridad = noIntegridad;
	}

	public TipoAsignacionNumeroSolicitud getAsignacionNumeroSolicitud() {
		return asignacionNumeroSolicitud;
	}

	public void setAsignacionNumeroSolicitud(TipoAsignacionNumeroSolicitud asignacionNumeroSolicitud) {
		this.asignacionNumeroSolicitud = asignacionNumeroSolicitud;
	}

	public TipoRechazadaABDCP getRechazadaABDCP() {
		return rechazadaABDCP;
	}

	public void setRechazadaABDCP(TipoRechazadaABDCP rechazadaABDCP) {
		this.rechazadaABDCP = rechazadaABDCP;
	}

	public TipoEnvioSolicitudCedente getEnvioSolicitudCedente() {
		return envioSolicitudCedente;
	}

	public void setEnvioSolicitudCedente(TipoEnvioSolicitudCedente envioSolicitudCedente) {
		this.envioSolicitudCedente = envioSolicitudCedente;
	}

	public TipoObjecionConcesionarioCedente getObjecionConcesionarioCedente() {
		return objecionConcesionarioCedente;
	}

	public void setObjecionConcesionarioCedente(TipoObjecionConcesionarioCedente objecionConcesionarioCedente) {
		this.objecionConcesionarioCedente = objecionConcesionarioCedente;
	}

	public TipoSolicitudAceptadaCedente getSolicitudAceptadaCedente() {
		return solicitudAceptadaCedente;
	}

	public void setSolicitudAceptadaCedente(TipoSolicitudAceptadaCedente solicitudAceptadaCedente) {
		this.solicitudAceptadaCedente = solicitudAceptadaCedente;
	}

	public TipoSolicitudProcedente getSolicitudProcedente() {
		return solicitudProcedente;
	}

	public void setSolicitudProcedente(TipoSolicitudProcedente solicitudProcedente) {
		this.solicitudProcedente = solicitudProcedente;
	}

	public TipoProgramacionPortabilidad getProgramacionPortabilidad() {
		return programacionPortabilidad;
	}

	public void setProgramacionPortabilidad(TipoProgramacionPortabilidad programacionPortabilidad) {
		this.programacionPortabilidad = programacionPortabilidad;
	}

	public TipoCancelacionNoProgramacionFecha getCancelacionNoProgramacionFecha() {
		return cancelacionNoProgramacionFecha;
	}

	public void setCancelacionNoProgramacionFecha(TipoCancelacionNoProgramacionFecha cancelacionNoProgramacionFecha) {
		this.cancelacionNoProgramacionFecha = cancelacionNoProgramacionFecha;
	}

	public TipoFueraLimiteEjecutarPortabilidad getFueraLimiteEjecutarPortabilidad() {
		return fueraLimiteEjecutarPortabilidad;
	}

	public void setFueraLimiteEjecutarPortabilidad(TipoFueraLimiteEjecutarPortabilidad fueraLimiteEjecutarPortabilidad) {
		this.fueraLimiteEjecutarPortabilidad = fueraLimiteEjecutarPortabilidad;
	}

	public TipoProgramadaEjecutarPortabilidad getProgramadaEjecutarPortabilidad() {
		return programadaEjecutarPortabilidad;
	}

	public void setProgramadaEjecutarPortabilidad(TipoProgramadaEjecutarPortabilidad programadaEjecutarPortabilidad) {
		this.programadaEjecutarPortabilidad = programadaEjecutarPortabilidad;
	}

	public TipoSolicitudRetorno getSolicitudRetorno() {
		return solicitudRetorno;
	}

	public void setSolicitudRetorno(TipoSolicitudRetorno solicitudRetorno) {
		this.solicitudRetorno = solicitudRetorno;
	}

	public TipoDenegacionRetorno getDenegacionRetorno() {
		return denegacionRetorno;
	}

	public void setDenegacionRetorno(TipoDenegacionRetorno denegacionRetorno) {
		this.denegacionRetorno = denegacionRetorno;
	}

	public TipoAceptacionRetorno getAceptacionRetorno() {
		return aceptacionRetorno;
	}

	public void setAceptacionRetorno(TipoAceptacionRetorno aceptacionRetorno) {
		this.aceptacionRetorno = aceptacionRetorno;
	}

	public TipoSolicitudPortabilidad getConsultaPrevia() {
		return consultaPrevia;
	}

	public void setConsultaPrevia(TipoSolicitudPortabilidad consultaPrevia) {
		this.consultaPrevia = consultaPrevia;
	}

	public TipoAsignacionNumeroSolicitud getAsignacionNumeroConsultaPrevia() {
		return asignacionNumeroConsultaPrevia;
	}

	public void setAsignacionNumeroConsultaPrevia(TipoAsignacionNumeroSolicitud asignacionNumeroConsultaPrevia) {
		this.asignacionNumeroConsultaPrevia = asignacionNumeroConsultaPrevia;
	}

	public TipoRechazadaABDCP getConsultaPreviaRechazadaABDCP() {
		return ConsultaPreviaRechazadaABDCP;
	}

	public void setConsultaPreviaRechazadaABDCP(TipoRechazadaABDCP consultaPreviaRechazadaABDCP) {
		ConsultaPreviaRechazadaABDCP = consultaPreviaRechazadaABDCP;
	}

	public TipoEnvioSolicitudCedente getConsultaPreviaEnvioCedente() {
		return consultaPreviaEnvioCedente;
	}

	public void setConsultaPreviaEnvioCedente(TipoEnvioSolicitudCedente consultaPreviaEnvioCedente) {
		this.consultaPreviaEnvioCedente = consultaPreviaEnvioCedente;
	}

	public TipoObjecionConcesionarioCedente getConsultaPreviaObjecionConcesionarioCedente() {
		return consultaPreviaObjecionConcesionarioCedente;
	}

	public void setConsultaPreviaObjecionConcesionarioCedente(
			TipoObjecionConcesionarioCedente consultaPreviaObjecionConcesionarioCedente) {
		this.consultaPreviaObjecionConcesionarioCedente = consultaPreviaObjecionConcesionarioCedente;
	}

	public TipoSolicitudAceptadaCedente getConsultaPreviaAceptadaCedente() {
		return consultaPreviaAceptadaCedente;
	}

	public void setConsultaPreviaAceptadaCedente(TipoSolicitudAceptadaCedente consultaPreviaAceptadaCedente) {
		this.consultaPreviaAceptadaCedente = consultaPreviaAceptadaCedente;
	}

	public TipoSolicitudProcedente getConsultaPreviaProcedente() {
		return consultaPreviaProcedente;
	}

	public void setConsultaPreviaProcedente(TipoSolicitudProcedente consultaPreviaProcedente) {
		this.consultaPreviaProcedente = consultaPreviaProcedente;
	}

	public TipoSolicitudProcedente getSolicitudProcedenteConsultaPreviaProcedente() {
		return solicitudProcedenteConsultaPreviaProcedente;
	}

	public void setSolicitudProcedenteConsultaPreviaProcedente(
			TipoSolicitudProcedente solicitudProcedenteConsultaPreviaProcedente) {
		this.solicitudProcedenteConsultaPreviaProcedente = solicitudProcedenteConsultaPreviaProcedente;
	}

	public TipoAcreditacionPagoDeuda getAcreditacionPagoDeuda() {
		return acreditacionPagoDeuda;
	}

	public void setAcreditacionPagoDeuda(TipoAcreditacionPagoDeuda acreditacionPagoDeuda) {
		this.acreditacionPagoDeuda = acreditacionPagoDeuda;
	}

	public TipoAcreditacionPagoDeuda getAcreditacionPagoDeudaCedente() {
		return acreditacionPagoDeudaCedente;
	}

	public void setAcreditacionPagoDeudaCedente(TipoAcreditacionPagoDeuda acreditacionPagoDeudaCedente) {
		this.acreditacionPagoDeudaCedente = acreditacionPagoDeudaCedente;
	}

	public TipoNotificacionError getNotificacionError() {
		return notificacionError;
	}

	public void setNotificacionError(TipoNotificacionError notificacionError) {
		this.notificacionError = notificacionError;
	}

	public String getIdMensaje() {
		return IdMensaje;
	}

	public void setIdMensaje(String idMensaje) {
		IdMensaje = idMensaje;
	}

	
	
	
	
	
}
