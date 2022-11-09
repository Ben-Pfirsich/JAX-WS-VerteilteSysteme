package de.fhac.ws;

import de.fhac.ws.client.generated.WarenkorbFactoryImpl;
import de.fhac.ws.client.generated.WarenkorbFactoryImplService;
import de.fhac.ws.client.generated.WarenkorbImpl;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.soap.AddressingFeature;
import jakarta.xml.ws.wsaddressing.W3CEndpointReference;

public class Main {
    public static void main(String[] args) {

        WebServiceFeature[] enabledRequiredwsf = {new AddressingFeature(true, true)};

        WarenkorbFactoryImpl fac = new WarenkorbFactoryImplService().getWarenkorbFactoryImplPort();
        W3CEndpointReference epr = fac.createWarenkorb();
        WarenkorbImpl warenkorb = epr.getPort(WarenkorbImpl.class, enabledRequiredwsf);

        System.out.println(warenkorb.listArtikel());

        warenkorb.addArtikel(1);

        System.out.println();
        System.out.println(warenkorb.showWarenkorb());

        warenkorb.addArtikel(2);
        warenkorb.removeArtikel(1);
        warenkorb.addArtikel(0);
        System.out.println(warenkorb.showWarenkorb());

        warenkorb.addArtikel(1);
        System.out.println(warenkorb.showWarenkorb());
    }
}