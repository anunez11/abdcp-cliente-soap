package pe.gtdo.tipo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"fechaPago", "entidadPago", "numeracion","numeroOperacionPago","monto","moneda","documentoAdjunto"})
public class TipoAcreditacionPagoDeuda {
	@XmlElement(name="FechaPago")		
	String fechaPago;
	
	@XmlElement(name="EntidadPago")		
	String entidadPago;
	
	@XmlElement(name="Numeracion")		
	String numeracion;
	
	@XmlElement(name="NumeroOperacionPago")
	String numeroOperacionPago;
	
	@XmlElement(name="Monto")		
	String monto;
	
	@XmlElement(name="Moneda")		
	String moneda;
	
	@XmlElement(name="DocumentoAdjunto")		
	String documentoAdjunto;

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getEntidadPago() {
		return entidadPago;
	}

	public void setEntidadPago(String entidadPago) {
		this.entidadPago = entidadPago;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	public String getNumeroOperacionPago() {
		return numeroOperacionPago;
	}

	public void setNumeroOperacionPago(String numeroOperacionPago) {
		this.numeroOperacionPago = numeroOperacionPago;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getDocumentoAdjunto() {
		return documentoAdjunto;
	}

	public void setDocumentoAdjunto(String documentoAdjunto) {
		this.documentoAdjunto = documentoAdjunto;
	}
	
	
	
	
	
}
