package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class TipoDenegacionRetorno {

	@XmlElement(name="CausaRechazo")		
	String causaRechazo;

	public String getCausaRechazo() {
		return causaRechazo;
	}

	public void setCausaRechazo(String causaRechazo) {
		this.causaRechazo = causaRechazo;
	}
	
	
	
	
}
