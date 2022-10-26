package de.fhac.ws;

import com.sun.xml.ws.developer.Stateful;
import com.sun.xml.ws.developer.StatefulWebServiceManager;
import jakarta.inject.Inject;
import jakarta.jws.WebService;
import jakarta.xml.ws.soap.Addressing;


@WebService
@Stateful
@Addressing(enabled = true, required = true)
public class CounterServiceImpl implements CounterService {

	int counter = 0;

	public static StatefulWebServiceManager<CounterServiceImpl> MANAGER;


	@Override
	public void setCounter(int c) {
		counter = c;
	}

	@Override
	public void incCounter(int i) {
		counter += i;
	}

	@Override
	public int getCounter() {
		return counter;
	}


}