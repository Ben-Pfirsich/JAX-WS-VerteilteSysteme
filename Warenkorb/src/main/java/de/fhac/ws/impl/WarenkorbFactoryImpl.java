package de.fhac.ws.impl;

import com.sun.xml.ws.developer.Stateful;
import de.fhac.ws.interfaces.WarenkorbFactory;
import jakarta.jws.WebService;
import jakarta.xml.ws.soap.Addressing;
import jakarta.xml.ws.wsaddressing.W3CEndpointReference;

@WebService
public class WarenkorbFactoryImpl implements WarenkorbFactory {

    @Override
    public synchronized W3CEndpointReference createWarenkorb() {
        WarenkorbImpl service = new WarenkorbImpl();
        return WarenkorbImpl.MANAGER.export(service);
    }
}