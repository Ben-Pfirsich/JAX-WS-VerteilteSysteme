package de.fhac.Adapter;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;

public class MQTTPublishSubscribe implements Runnable, MqttCallback {

    private MqttClient myClient;
    private MqttConnectOptions connOpt;
    private final String BROKER_URL = "tcp://localhost:1883";
//    private final String BROKER_URL = "tcp://149.201.206.53:1883";
    private final String CLIENT_ID = "Adapter1";
    private final int QOS = 2;

    private ArrayBlockingQueue<HashMap<String, String>> subQueue;

    public MQTTPublishSubscribe(ArrayBlockingQueue<HashMap<String, String>> subQueue){
        this.subQueue = subQueue;
    }

    public void runClient() {
        connOpt = new MqttConnectOptions();
        connOpt.setCleanSession(true);
        connOpt.setKeepAliveInterval(30);
        connOpt.setAutomaticReconnect(true);

        MemoryPersistence persistence = new MemoryPersistence();

        try {
            myClient = new MqttClient(BROKER_URL, CLIENT_ID, persistence);
            myClient.setCallback(this);
            myClient.connect(connOpt);
        } catch (MqttException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    @Override
    public void run() {
        runClient();

        try {
            myClient.subscribe("TraficLights/#");
        } catch (MqttException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void connectionLost(Throwable throwable) {
        System.out.println("Connection lost!");
        try {
            myClient.disconnect();
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        HashMap<String, String> keyVal = new HashMap<>();
        keyVal.put(topic, mqttMessage.toString());
        subQueue.add(keyVal);
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        // TODO Auto-generated method stub
    }
}
