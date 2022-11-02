import de.fhac.ws.client.generated.CounterServiceImpl;
import de.fhac.ws.client.generated.StatefulCounterFactoryImpl;
import de.fhac.ws.client.generated.StatefulCounterFactoryImplService;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.soap.AddressingFeature;
import jakarta.xml.ws.wsaddressing.W3CEndpointReference;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        WebServiceFeature[] enabledRequiredwsf = {new AddressingFeature(true, true)};
        StatefulCounterFactoryImpl fac = new StatefulCounterFactoryImplService().getStatefulCounterFactoryImplPort();
        W3CEndpointReference epr = fac.createCounter();
        CounterServiceImpl cs = epr.getPort(CounterServiceImpl.class, enabledRequiredwsf);


        System.out.println(cs.getCounter());

        cs.incCounter(5);
        System.out.println(cs.getCounter());

        cs.setCounter(3);
        System.out.println(cs.getCounter());
    }
}
