
package de.fhac.ws.client.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.fhac.ws.client.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCounter_QNAME = new QName("http://ws.fhac.de/", "getCounter");
    private final static QName _GetCounterResponse_QNAME = new QName("http://ws.fhac.de/", "getCounterResponse");
    private final static QName _IncCounter_QNAME = new QName("http://ws.fhac.de/", "incCounter");
    private final static QName _IncCounterResponse_QNAME = new QName("http://ws.fhac.de/", "incCounterResponse");
    private final static QName _SetCounter_QNAME = new QName("http://ws.fhac.de/", "setCounter");
    private final static QName _SetCounterResponse_QNAME = new QName("http://ws.fhac.de/", "setCounterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.fhac.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCounter }
     * 
     */
    public GetCounter createGetCounter() {
        return new GetCounter();
    }

    /**
     * Create an instance of {@link GetCounterResponse }
     * 
     */
    public GetCounterResponse createGetCounterResponse() {
        return new GetCounterResponse();
    }

    /**
     * Create an instance of {@link IncCounter }
     * 
     */
    public IncCounter createIncCounter() {
        return new IncCounter();
    }

    /**
     * Create an instance of {@link IncCounterResponse }
     * 
     */
    public IncCounterResponse createIncCounterResponse() {
        return new IncCounterResponse();
    }

    /**
     * Create an instance of {@link SetCounter }
     * 
     */
    public SetCounter createSetCounter() {
        return new SetCounter();
    }

    /**
     * Create an instance of {@link SetCounterResponse }
     * 
     */
    public SetCounterResponse createSetCounterResponse() {
        return new SetCounterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCounter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCounter }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fhac.de/", name = "getCounter")
    public JAXBElement<GetCounter> createGetCounter(GetCounter value) {
        return new JAXBElement<GetCounter>(_GetCounter_QNAME, GetCounter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCounterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCounterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fhac.de/", name = "getCounterResponse")
    public JAXBElement<GetCounterResponse> createGetCounterResponse(GetCounterResponse value) {
        return new JAXBElement<GetCounterResponse>(_GetCounterResponse_QNAME, GetCounterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncCounter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncCounter }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fhac.de/", name = "incCounter")
    public JAXBElement<IncCounter> createIncCounter(IncCounter value) {
        return new JAXBElement<IncCounter>(_IncCounter_QNAME, IncCounter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncCounterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncCounterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fhac.de/", name = "incCounterResponse")
    public JAXBElement<IncCounterResponse> createIncCounterResponse(IncCounterResponse value) {
        return new JAXBElement<IncCounterResponse>(_IncCounterResponse_QNAME, IncCounterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCounter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCounter }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fhac.de/", name = "setCounter")
    public JAXBElement<SetCounter> createSetCounter(SetCounter value) {
        return new JAXBElement<SetCounter>(_SetCounter_QNAME, SetCounter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCounterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCounterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.fhac.de/", name = "setCounterResponse")
    public JAXBElement<SetCounterResponse> createSetCounterResponse(SetCounterResponse value) {
        return new JAXBElement<SetCounterResponse>(_SetCounterResponse_QNAME, SetCounterResponse.class, null, value);
    }

}
