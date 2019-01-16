
package pe.gtdo.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xmlMsg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachedDoc" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userID",
    "password",
    "xmlMsg",
    "attachedDoc"
})
@XmlRootElement(name = "receiveMessageRequest")
public class ReceiveMessageRequest {

    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String xmlMsg;
    protected byte[] attachedDoc;

    /**
     * Obtiene el valor de la propiedad userID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Define el valor de la propiedad userID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlMsg() {
        return xmlMsg;
    }

    /**
     * Define el valor de la propiedad xmlMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlMsg(String value) {
        this.xmlMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad attachedDoc.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachedDoc() {
        return attachedDoc;
    }

    /**
     * Define el valor de la propiedad attachedDoc.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachedDoc(byte[] value) {
        this.attachedDoc = value;
    }

}
