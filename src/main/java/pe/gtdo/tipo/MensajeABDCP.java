package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MensajeABDCP")
@XmlAccessorType(XmlAccessType.FIELD)
public class MensajeABDCP {
	@XmlElement(name="CabeceraMensaje")	
	TipoCabeceraMensaje cabeceraMensaje;
	
	@XmlElement(name="CuerpoMensaje")	
	TipoCuerpoMensaje cuerpoMensaje;

	public TipoCabeceraMensaje getCabeceraMensaje() {
		return cabeceraMensaje;
	}

	public void setCabeceraMensaje(TipoCabeceraMensaje cabeceraMensaje) {
		this.cabeceraMensaje = cabeceraMensaje;
	}

	public TipoCuerpoMensaje getCuerpoMensaje() {
		return cuerpoMensaje;
	}

	public void setCuerpoMensaje(TipoCuerpoMensaje cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}


	
	
	
}
