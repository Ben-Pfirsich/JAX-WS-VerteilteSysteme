package de.fhac.ws;

import jakarta.jws.WebService;
import jakarta.xml.ws.wsaddressing.W3CEndpointReference;

@WebService
public class StatefulCounterFactoryImpl implements StatefulCounterFactoryService{
    @Override
    public synchronized W3CEndpointReference createCounter() {
        CounterServiceImpl service = new CounterServiceImpl();
        return CounterServiceImpl.MANAGER.export(service);
    }
}
