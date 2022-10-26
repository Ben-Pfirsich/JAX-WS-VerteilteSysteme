package de.fhac.ws;

import com.sun.xml.ws.developer.Stateful;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.ws.soap.Addressing;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface CounterService {

	@WebMethod
	void setCounter(int c);

	@WebMethod
	void incCounter(int i);

	@WebMethod
	int getCounter();

}