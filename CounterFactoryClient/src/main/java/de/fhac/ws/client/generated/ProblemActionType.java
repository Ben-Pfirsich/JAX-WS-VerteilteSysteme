
package de.fhac.ws.client.generated;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProblemActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProblemActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.w3.org/2005/08/addressing}Action" minOccurs="0"/&gt;
 *         &lt;element name="SoapAction" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProblemActionType", propOrder = {
    "action",
    "soapAction"
})
public class ProblemActionType {

    @XmlElement(name = "Action")
    protected AttributedURIType action;
    @XmlElement(name = "SoapAction")
    @XmlSchemaType(name = "anyURI")
    protected String soapAction;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AttributedURIType }
     *     
     */
    public AttributedURIType getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributedURIType }
     *     
     */
    public void setAction(AttributedURIType value) {
        this.action = value;
    }

    /**
     * Ruft den Wert der soapAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapAction() {
        return soapAction;
    }

    /**
     * Legt den Wert der soapAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapAction(String value) {
        this.soapAction = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
