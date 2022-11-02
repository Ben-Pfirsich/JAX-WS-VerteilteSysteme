package de.fhac.ws.interfaces;

import de.fhac.ws.entity.Artikel;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.ArrayList;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface Warenkorb {


    @WebMethod
    boolean addArtikel(int id);

    @WebMethod
    boolean removeArtikel(int id);

    @WebMethod
    String listArtikel();

    @WebMethod
    String showWarenkorb();


}
