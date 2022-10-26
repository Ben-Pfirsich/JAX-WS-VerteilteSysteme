package de.fhac.ws;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import jakarta.jws.WebService;


@WebService()
public class CounterServiceImpl implements CounterService {

	int counter = 0;


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