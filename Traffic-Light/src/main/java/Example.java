import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://149.201.190.76:8000");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("admin");
        basicAuth.setPassword("admin");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String password = "password_example"; // String | The password for register.
        String role = "role_example"; // String | The user's role for register.
        String username = "username_example"; // String | The username for register.
        try {
//            AddUser200Response result = apiInstance.addUser(password, role, username);
//            ControlTrafficLights200Response result = apiInstance.controlTrafficLights("Mozartstrasse", "green").toJson();
            System.out.println(apiInstance.controlTrafficLights("Mozartstrasse", "red").toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}