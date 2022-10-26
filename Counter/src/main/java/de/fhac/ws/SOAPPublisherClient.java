package de.fhac.ws;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;


public class SOAPPublisherClient {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdlURL = new URL("http://localhost:8080/Counter/counterWS?wsdl");
		//check above URL in browser, you should see WSDL file
		
		//creating QName using targetNamespace and name
		QName qname = new QName("http://ws.fhac.de/", "CounterServiceImplService");
		
		Service service = Service.create(wsdlURL, qname);  
		
		//We need to pass interface and model beans to client
		qname = new QName("http://ws.fhac.de/", "CounterServiceImplPort");
		CounterService cs = service.getPort(qname, CounterService.class);


		System.out.println(cs.getCounter());

		cs.incCounter(5);
		System.out.println(cs.getCounter());

		cs.setCounter(3);
		System.out.println(cs.getCounter());



		
	}

}