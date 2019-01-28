package pe.gtdo.msg;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import pe.gtdo.tipo.MensajeABDCP;
import pe.gtdo.tipo.TipoAceptacionRetorno;
import pe.gtdo.tipo.TipoAcreditacionPagoDeuda;
import pe.gtdo.tipo.TipoAsignacionNumeroSolicitud;
import pe.gtdo.tipo.TipoCabeceraMensaje;
import pe.gtdo.tipo.TipoCancelacionNoProgramacionFecha;
import pe.gtdo.tipo.TipoCuerpoMensaje;
import pe.gtdo.tipo.TipoDenegacionRetorno;
import pe.gtdo.tipo.TipoEnvioSolicitudCedente;
import pe.gtdo.tipo.TipoFueraLimiteEjecutarPortabilidad;
import pe.gtdo.tipo.TipoNoIntegridad;
import pe.gtdo.tipo.TipoNotificacionError;
import pe.gtdo.tipo.TipoObjecionConcesionarioCedente;
import pe.gtdo.tipo.TipoProgramacionPortabilidad;
import pe.gtdo.tipo.TipoProgramadaEjecutarPortabilidad;
import pe.gtdo.tipo.TipoRechazadaABDCP;
import pe.gtdo.tipo.TipoSolicitudAceptadaCedente;
import pe.gtdo.tipo.TipoSolicitudPortabilidad;
import pe.gtdo.tipo.TipoSolicitudProcedente;
import pe.gtdo.tipo.TipoSolicitudRetorno;

public class Builder {
    
	public String codigoMsg;	
	public MensajeABDCP mensaje=new MensajeABDCP();
	public TipoCabeceraMensaje cabecera=new TipoCabeceraMensaje();
	public TipoCuerpoMensaje cuerpo= new TipoCuerpoMensaje();
	
	
	public Builder setCodigoMsg(String codigoMsg){		
		cuerpo.setIdMensaje(codigoMsg);
		return this;		
	}
	
	public Builder setCabeceraDestinatario(String destinatario){		
		cabecera.setDestinatario(destinatario);
		return this;		
	}
	public Builder setCabeceraFechaCreacionMensaje(String fechaCreacionMensaje){		
		cabecera.setFechaCreacionMensaje(fechaCreacionMensaje);
		return this;		
	}
	public Builder setCabeceraIdentificadorMensaje(String identificadorMensaje){		
		cabecera.setIdentificadorMensaje(identificadorMensaje);
		return this;		
	}
	
	public Builder setCabeceraIdentificadorProceso(String identificadorProceso){		
		cabecera.setIdentificadorProceso(identificadorProceso);
		return this;		
	}
	
	public Builder setCabeceraRemitente(String remitente){		
		cabecera.setRemitente(remitente);
		return this;		
	}
	
	
	public Builder setCuerpoIdMensaje(String idMensaje){		
		cuerpo.setIdMensaje(idMensaje);
		return this;		
	}

	
	public Builder setAceptacionRetorno(TipoAceptacionRetorno  aceptacionRetorno){
		cuerpo.setAceptacionRetorno(aceptacionRetorno);		
		return this;		
	}
	public Builder setAcreditacionPagoDeuda(TipoAcreditacionPagoDeuda  acreditacionPagoDeuda){
		cuerpo.setAcreditacionPagoDeuda(acreditacionPagoDeuda);
		
		return this;		
	}
	public Builder setAcreditacionPagoDeudaCedente(TipoAcreditacionPagoDeuda  acreditacionPagoDeudaCedente){
		cuerpo.setAcreditacionPagoDeudaCedente(acreditacionPagoDeudaCedente);		
		return this;		
	}
	
	public Builder setAsignacionNumeroConsultaPrevia(TipoAsignacionNumeroSolicitud  asignacionNumeroConsultaPrevia){
		cuerpo.setAsignacionNumeroConsultaPrevia(asignacionNumeroConsultaPrevia);		
		return this;		
	}
	
	public Builder setAsignacionNumeroSolicitud(TipoAsignacionNumeroSolicitud  asignacionNumeroSolicitud){
		cuerpo.setAsignacionNumeroSolicitud(asignacionNumeroSolicitud);		
		return this;		
	}

	public Builder setCancelacionNoProgramacionFecha(TipoCancelacionNoProgramacionFecha  cancelacionNoProgramacionFecha){
		cuerpo.setCancelacionNoProgramacionFecha(cancelacionNoProgramacionFecha);		
		return this;		
	}
  

	public Builder setConsultaPrevia(TipoSolicitudPortabilidad  consultaPrevia){
		cuerpo.setConsultaPrevia(consultaPrevia);		
		return this;		
	}
  	
	
	public Builder setConsultaPreviaAceptadaCedente(TipoSolicitudAceptadaCedente  consultaPreviaAceptadaCedente){
		cuerpo.setConsultaPreviaAceptadaCedente(consultaPreviaAceptadaCedente);		
		return this;		
	}
	
	public Builder setConsultaPreviaEnvioCedente(TipoEnvioSolicitudCedente  consultaPreviaEnvioCedente){
		cuerpo.setConsultaPreviaEnvioCedente(consultaPreviaEnvioCedente);		
		return this;		
	}
	
	public Builder setConsultaPreviaObjecionConcesionarioCedente(TipoObjecionConcesionarioCedente  consultaPreviaObjecionConcesionarioCedente){
		cuerpo.setConsultaPreviaObjecionConcesionarioCedente(consultaPreviaObjecionConcesionarioCedente);		
		return this;		
	}
	
	public Builder setConsultaPreviaProcedente(TipoSolicitudProcedente  consultaPreviaProcedente){
		cuerpo.setConsultaPreviaProcedente(consultaPreviaProcedente);		
		return this;		
	}
	
	public Builder setConsultaPreviaRechazadaABDCP(TipoRechazadaABDCP  consultaPreviaRechazadaABDCP){
		cuerpo.setConsultaPreviaRechazadaABDCP(consultaPreviaRechazadaABDCP);		
		return this;		
	}	
	
	public Builder setDenegacionRetorno(TipoDenegacionRetorno  denegacionRetorno){
		cuerpo.setDenegacionRetorno(denegacionRetorno);		
		return this;		
	}
	
	
	public Builder setEnvioSolicitudCedente(TipoEnvioSolicitudCedente  envioSolicitudCedente){
		cuerpo.setEnvioSolicitudCedente(envioSolicitudCedente);		
		return this;		
	}
	
	
	public Builder setEnvioSolicitudCedente(TipoFueraLimiteEjecutarPortabilidad  fueraLimiteEjecutarPortabilidad){
		cuerpo.setFueraLimiteEjecutarPortabilidad(fueraLimiteEjecutarPortabilidad);		
		return this;		
	}
	
	public Builder setNoIntegridad(TipoNoIntegridad  noIntegridad){
		cuerpo.setNoIntegridad(noIntegridad);		
		return this;		
	}
	
	public Builder setNotificacionError(TipoNotificacionError  notificacionError){
		cuerpo.setNotificacionError(notificacionError);	
		return this;		
	}
	
	
	public Builder setObjecionConcesionarioCedente(TipoObjecionConcesionarioCedente  objecionConcesionarioCedente){
		cuerpo.setObjecionConcesionarioCedente(objecionConcesionarioCedente);	
		return this;		
	}
	
	public Builder setProgramacionPortabilidad(TipoProgramacionPortabilidad  programacionPortabilidad){
		cuerpo.setProgramacionPortabilidad(programacionPortabilidad);	
		return this;		
	}
	
	public Builder setProgramadaEjecutarPortabilidad(TipoProgramadaEjecutarPortabilidad  programadaEjecutarPortabilidad){
		cuerpo.setProgramadaEjecutarPortabilidad(programadaEjecutarPortabilidad);	
		return this;		
	}
	
	public Builder setRechazadaABDCP(TipoRechazadaABDCP  rechazadaABDCP){
		cuerpo.setRechazadaABDCP(rechazadaABDCP);	
		return this;		
	}
	
	public Builder setSolicitudAceptadaCedente(TipoSolicitudAceptadaCedente  solicitudAceptadaCedente){
		cuerpo.setSolicitudAceptadaCedente(solicitudAceptadaCedente);	
		return this;		
	}
	
	public Builder setSolicitudPortabilidad(TipoSolicitudPortabilidad  solicitudPortabilidad){
		cuerpo.setSolicitudPortabilidad(solicitudPortabilidad);	
		return this;		
	}
	
	public Builder setSolicitudProcedente(TipoSolicitudProcedente  solicitudProcedente){
		cuerpo.setSolicitudProcedente(solicitudProcedente);	
		return this;		
	}	
	
	public Builder setSolicitudProcedenteConsultaPreviaProcedente(TipoSolicitudProcedente  solicitudProcedenteConsultaPreviaProcedente){
		cuerpo.setSolicitudProcedenteConsultaPreviaProcedente(solicitudProcedenteConsultaPreviaProcedente);	
		return this;		
	}	
	
	public Builder setSolicitudRetorno(TipoSolicitudRetorno  solicitudRetorno){
		cuerpo.setSolicitudRetorno(solicitudRetorno);	
		return this;		
	}
	
	
	public  MensajeABDCP build() throws JAXBException{
		mensaje.setCabeceraMensaje(cabecera);
    	mensaje.setCuerpoMensaje(cuerpo);
      /*  JAXBContext jaxbContext = JAXBContext.newInstance(MensajeABDCP.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(mensaje, sw);*/
       // System.out.println(sw.toString());
        return  mensaje;
        
    }	
	
	
}
