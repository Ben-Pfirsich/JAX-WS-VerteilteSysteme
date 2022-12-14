package de.fhac.Client;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class ClientMQTTPublishSubscribe implements Runnable, MqttCallback {

    private MqttClient myClient;
    private MqttConnectOptions connOpt;
    private final String BROKER_URL = "tcp://149.201.206.53:1883";
    private final String CLIENT_ID = "Client1";
    private final int QOS = 2;

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

    public void publishMessage(String topic, String pubMsg) {
        MqttTopic mqtt_topic = myClient.getTopic(topic);
        MqttMessage message = new MqttMessage(pubMsg.getBytes());
        message.setQos(QOS);
        message.setRetained(false);

        System.out.println("Publishing to topic \"" + mqtt_topic + "\" qos " + QOS);
        MqttDeliveryToken token = null;
        try {
            // publish message to broker
            token = mqtt_topic.publish(message);
            // Wait until the message has been delivered to the broker
            token.waitForCompletion();
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        runClient();
    }

    @Override
    public void connectionLost(Throwable throwable) {

    }

    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {

    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

    }
}
