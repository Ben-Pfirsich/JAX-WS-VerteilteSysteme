package de.fhac.Adapter;

import de.fhac.RESTTrafficLightsClient;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

public class Adapter implements Runnable{

    RESTTrafficLightsClient restClient;
    MQTTPublishSubscribe mqttClient;

    ArrayBlockingQueue<HashMap<String, String>> subQueue;

    public boolean programEnd;


    public Adapter() {
        subQueue = new ArrayBlockingQueue<>(50);
        restClient = new RESTTrafficLightsClient();
        mqttClient = new MQTTPublishSubscribe(subQueue);
        programEnd = false;

        Thread thread = new Thread(mqttClient);
        thread.start();
    }


    public void run(){
        while (programEnd){
            if (subQueue.peek() != null){
                HashMap<String, String> topic_message = subQueue.poll();
                Map.Entry<String, String> next = topic_message.entrySet().iterator().next();
                String topic = next.getKey();

                String[] topic_elems = topic.split("/");
                restClient.setStreetToColor(topic_elems[4], topic_elems[6]);

            }

        }
    }
}
