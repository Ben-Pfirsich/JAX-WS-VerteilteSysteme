package de.fhac.Client;

import de.fhac.Adapter.Adapter;
import de.fhac.Adapter.MQTTPublishSubscribe;

public class ClientMain {
    public static void main(String[] args) throws InterruptedException {

        ClientMQTTPublishSubscribe clientMQTTPublishSubscribe = new ClientMQTTPublishSubscribe();
        Thread clientThread = new Thread(clientMQTTPublishSubscribe);

        Adapter adapter = new Adapter();
        Thread adapterThread = new Thread(adapter);

        adapterThread.start();
        System.out.println("Adapter erfolgreich gestartet.");

        Thread.sleep(1000);

        clientThread.start();

        Thread.sleep(1000);

        clientMQTTPublishSubscribe.publishMessage("TraficLights/post/1/streets/Mozartstrasse/colors/red", "");

    }
}
