
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

    private final static QName _AddArtikel_QNAME = new QName("http://impl.ws.fhac.de/", "addArtikel");
    private final static QName _AddArtikelResponse_QNAME = new QName("http://impl.ws.fhac.de/", "addArtikelResponse");
    private final static QName _ListArtikel_QNAME = new QName("http://impl.ws.fhac.de/", "listArtikel");
    private final static QName _ListArtikelResponse_QNAME = new QName("http://impl.ws.fhac.de/", "listArtikelResponse");
    private final static QName _RemoveArtikel_QNAME = new QName("http://impl.ws.fhac.de/", "removeArtikel");
    private final static QName _RemoveArtikelResponse_QNAME = new QName("http://impl.ws.fhac.de/", "removeArtikelResponse");
    private final static QName _ShowWarenkorb_QNAME = new QName("http://impl.ws.fhac.de/", "showWarenkorb");
    private final static QName _ShowWarenkorbResponse_QNAME = new QName("http://impl.ws.fhac.de/", "showWarenkorbResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.fhac.ws.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddArtikel }
     * 
     */
    public AddArtikel createAddArtikel() {
        return new AddArtikel();
    }

    /**
     * Create an instance of {@link AddArtikelResponse }
     * 
     */
    public AddArtikelResponse createAddArtikelResponse() {
        return new AddArtikelResponse();
    }

    /**
     * Create an instance of {@link ListArtikel }
     * 
     */
    public ListArtikel createListArtikel() {
        return new ListArtikel();
    }

    /**
     * Create an instance of {@link ListArtikelResponse }
     * 
     */
    public ListArtikelResponse createListArtikelResponse() {
        return new ListArtikelResponse();
    }

    /**
     * Create an instance of {@link RemoveArtikel }
     * 
     */
    public RemoveArtikel createRemoveArtikel() {
        return new RemoveArtikel();
    }

    /**
     * Create an instance of {@link RemoveArtikelResponse }
     * 
     */
    public RemoveArtikelResponse createRemoveArtikelResponse() {
        return new RemoveArtikelResponse();
    }

    /**
     * Create an instance of {@link ShowWarenkorb }
     * 
     */
    public ShowWarenkorb createShowWarenkorb() {
        return new ShowWarenkorb();
    }

    /**
     * Create an instance of {@link ShowWarenkorbResponse }
     * 
     */
    public ShowWarenkorbResponse createShowWarenkorbResponse() {
        return new ShowWarenkorbResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArtikel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddArtikel }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "addArtikel")
    public JAXBElement<AddArtikel> createAddArtikel(AddArtikel value) {
        return new JAXBElement<AddArtikel>(_AddArtikel_QNAME, AddArtikel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddArtikelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddArtikelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "addArtikelResponse")
    public JAXBElement<AddArtikelResponse> createAddArtikelResponse(AddArtikelResponse value) {
        return new JAXBElement<AddArtikelResponse>(_AddArtikelResponse_QNAME, AddArtikelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArtikel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListArtikel }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "listArtikel")
    public JAXBElement<ListArtikel> createListArtikel(ListArtikel value) {
        return new JAXBElement<ListArtikel>(_ListArtikel_QNAME, ListArtikel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArtikelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListArtikelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "listArtikelResponse")
    public JAXBElement<ListArtikelResponse> createListArtikelResponse(ListArtikelResponse value) {
        return new JAXBElement<ListArtikelResponse>(_ListArtikelResponse_QNAME, ListArtikelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveArtikel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveArtikel }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "removeArtikel")
    public JAXBElement<RemoveArtikel> createRemoveArtikel(RemoveArtikel value) {
        return new JAXBElement<RemoveArtikel>(_RemoveArtikel_QNAME, RemoveArtikel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveArtikelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveArtikelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "removeArtikelResponse")
    public JAXBElement<RemoveArtikelResponse> createRemoveArtikelResponse(RemoveArtikelResponse value) {
        return new JAXBElement<RemoveArtikelResponse>(_RemoveArtikelResponse_QNAME, RemoveArtikelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowWarenkorb }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowWarenkorb }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "showWarenkorb")
    public JAXBElement<ShowWarenkorb> createShowWarenkorb(ShowWarenkorb value) {
        return new JAXBElement<ShowWarenkorb>(_ShowWarenkorb_QNAME, ShowWarenkorb.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowWarenkorbResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShowWarenkorbResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://impl.ws.fhac.de/", name = "showWarenkorbResponse")
    public JAXBElement<ShowWarenkorbResponse> createShowWarenkorbResponse(ShowWarenkorbResponse value) {
        return new JAXBElement<ShowWarenkorbResponse>(_ShowWarenkorbResponse_QNAME, ShowWarenkorbResponse.class, null, value);
    }

}
