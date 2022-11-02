package de.fhac.ws.interfaces;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.wsaddressing.W3CEndpointReference;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface WarenkorbFactory {

    @WebMethod
    public W3CEndpointReference createWarenkorb();
}
