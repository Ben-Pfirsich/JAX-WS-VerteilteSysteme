package de.fhac.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


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