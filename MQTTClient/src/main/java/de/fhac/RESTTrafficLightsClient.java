package de.fhac;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.api.DefaultApi;
import org.openapitools.client.auth.HttpBasicAuth;
import org.openapitools.client.model.ControlTrafficLights200Response;

import java.util.Objects;

public class RESTTrafficLightsClient {

    String MOZART = "Mozartstrasse";
    String SCHILLER = "Schillerstrasse";
    String RED = "red";
    String GREEN = "green";

    DefaultApi apiInstance;

    public RESTTrafficLightsClient() {

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://149.201.190.77:8000");

        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("admin");
        basicAuth.setPassword("admin");

        apiInstance = new DefaultApi(defaultClient);
    }

    public void setStreetToColor(String street, String color) {

        if ((Objects.equals(street, MOZART) || Objects.equals(street, SCHILLER)) && (Objects.equals(color, RED) || Objects.equals(color, GREEN))) {
            try {
                ControlTrafficLights200Response result = apiInstance.controlTrafficLights(street, color);
                System.out.println(result.toJson());
            } catch (ApiException e) {
                System.err.println("Exception when calling DefaultApi#controlTrafficLights");
                System.err.println("Status code: " + e.getCode());
                System.err.println("Reason: " + e.getResponseBody());
                System.err.println("Response headers: " + e.getResponseHeaders());
                e.printStackTrace();
            } catch (IllegalArgumentException arg) {
                System.out.println("Erwischt");
            }
        } else {
            System.out.println("Ungueltige Eingabe!");
        }
    }


}
