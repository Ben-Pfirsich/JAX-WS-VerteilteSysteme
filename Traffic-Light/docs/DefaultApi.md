# DefaultApi

All URIs are relative to *http://149.201.190.76:8000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUser**](DefaultApi.md#addUser) | **PUT** /users | Add new user |
| [**controlTrafficLights**](DefaultApi.md#controlTrafficLights) | **POST** /streets/{street}/colors/{color} | Controls the traffic lights |
| [**deleteUser**](DefaultApi.md#deleteUser) | **DELETE** /users/{id} | Delete existing user |
| [**getAllScheduledTrafficLightsEvents**](DefaultApi.md#getAllScheduledTrafficLightsEvents) | **GET** /times | Returns all scheduled traffic lights events |
| [**getAllUsers**](DefaultApi.md#getAllUsers) | **GET** /users | Retrieve all users |
| [**getAvailableStreets**](DefaultApi.md#getAvailableStreets) | **GET** /streets | Traffic Lights available streets |
| [**getTrafficLightsStatus**](DefaultApi.md#getTrafficLightsStatus) | **GET** /streets/{street} | Traffic Lights status |
| [**getUserRole**](DefaultApi.md#getUserRole) | **GET** /users/status | Retrieve User status (role) |
| [**loginUser**](DefaultApi.md#loginUser) | **POST** /users/session | User login |
| [**logoutUser**](DefaultApi.md#logoutUser) | **DELETE** /users/session | User logout |
| [**scheduleTrafficLightsControl**](DefaultApi.md#scheduleTrafficLightsControl) | **POST** /streets/{street}/colors/{color}/time | Scheduled control of the traffic lights |


<a name="addUser"></a>
# **addUser**
> AddUser200Response addUser(password, role, username)

Add new user

New User will be added

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String password = "password_example"; // String | The password for register.
    String role = "role_example"; // String | The user's role for register.
    String username = "username_example"; // String | The username for register.
    try {
      AddUser200Response result = apiInstance.addUser(password, role, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#addUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **password** | **String**| The password for register. | [optional] |
| **role** | **String**| The user&#39;s role for register. | [optional] |
| **username** | **String**| The username for register. | [optional] |

### Return type

[**AddUser200Response**](AddUser200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User successfully added. |  -  |
| **401** | Adding user failed (unauthorized). |  -  |

<a name="controlTrafficLights"></a>
# **controlTrafficLights**
> ControlTrafficLights200Response controlTrafficLights(street, color)

Controls the traffic lights

Controls the traffic lights of the specified street.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String street = "Mozartstrasse"; // String | Street whose corresponding traffic lights will be controlled.
    String color = "green"; // String | Traffic Lights color.
    try {
      ControlTrafficLights200Response result = apiInstance.controlTrafficLights(street, color);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#controlTrafficLights");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **street** | **String**| Street whose corresponding traffic lights will be controlled. | [default to Mozartstrasse] [enum: Mozartstrasse, Schillerstrasse] |
| **color** | **String**| Traffic Lights color. | [default to green] [enum: green, red] |

### Return type

[**ControlTrafficLights200Response**](ControlTrafficLights200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Switching traffic lights status successfully worked. |  -  |
| **400** | Switching traffic lights status failed. |  -  |
| **401** | Switching traffic lights status  failed (unauthorized). |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> DeleteUser200Response deleteUser(id)

Delete existing user

User with id will be deleted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 56; // Integer | Users ID (Username)
    try {
      DeleteUser200Response result = apiInstance.deleteUser(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| Users ID (Username) | |

### Return type

[**DeleteUser200Response**](DeleteUser200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User successfully deleted. |  -  |
| **401** | Deleting user failed (unauthorized). |  -  |

<a name="getAllScheduledTrafficLightsEvents"></a>
# **getAllScheduledTrafficLightsEvents**
> GetAllScheduledTrafficLightsEvents200Response getAllScheduledTrafficLightsEvents()

Returns all scheduled traffic lights events

Returns all scheduled traffic lights events

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      GetAllScheduledTrafficLightsEvents200Response result = apiInstance.getAllScheduledTrafficLightsEvents();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAllScheduledTrafficLightsEvents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAllScheduledTrafficLightsEvents200Response**](GetAllScheduledTrafficLightsEvents200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieving scheduled events successfully worked. |  -  |
| **401** | Retrieving scheduled events failed (unauthorized). |  -  |

<a name="getAllUsers"></a>
# **getAllUsers**
> List&lt;Map&lt;String, GetAllUsers200ResponseInnerValue&gt;&gt; getAllUsers()

Retrieve all users

All registered Users will be retrieved (admin only).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Map<String, GetAllUsers200ResponseInnerValue>> result = apiInstance.getAllUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAllUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Map&lt;String, GetAllUsers200ResponseInnerValue&gt;&gt;**](Map.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned users successfully. |  -  |
| **401** | Retrieving all users failed (unauthorized). |  -  |

<a name="getAvailableStreets"></a>
# **getAvailableStreets**
> GetAvailableStreets200Response getAvailableStreets()

Traffic Lights available streets

Traffic Lights available streets will be returned

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      GetAvailableStreets200Response result = apiInstance.getAvailableStreets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAvailableStreets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAvailableStreets200Response**](GetAvailableStreets200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned Traffic Lights streets successfully. |  -  |
| **401** | Retrieving traffic lights status failed (unauthorized). |  -  |

<a name="getTrafficLightsStatus"></a>
# **getTrafficLightsStatus**
> GetTrafficLightsStatus200Response getTrafficLightsStatus(street)

Traffic Lights status

Current Traffic Lights status of the specified street will be returned.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String street = "Mozartstrasse"; // String | Street whose corresponding traffic lights status will be returned.
    try {
      GetTrafficLightsStatus200Response result = apiInstance.getTrafficLightsStatus(street);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTrafficLightsStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **street** | **String**| Street whose corresponding traffic lights status will be returned. | [default to Mozartstrasse] [enum: Mozartstrasse, Schillerstrasse] |

### Return type

[**GetTrafficLightsStatus200Response**](GetTrafficLightsStatus200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned Traffic Lights status successfully. |  -  |
| **400** | Retrieving traffic lights status failed. |  -  |
| **401** | Retrieving traffic lights status failed (unauthorized). |  -  |

<a name="getUserRole"></a>
# **getUserRole**
> GetUserRole200Response getUserRole()

Retrieve User status (role)

User&#39;s role will be returned (admin 0, user 1, none -1).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      GetUserRole200Response result = apiInstance.getUserRole();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getUserRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUserRole200Response**](GetUserRole200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned users successfully. |  -  |

<a name="loginUser"></a>
# **loginUser**
> LoginUser200Response loginUser(password, username)

User login

User login. New session will be started.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String password = "password_example"; // String | The password for login.
    String username = "username_example"; // String | The username for login.
    try {
      LoginUser200Response result = apiInstance.loginUser(password, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#loginUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **password** | **String**| The password for login. | [optional] |
| **username** | **String**| The username for login. | [optional] |

### Return type

[**LoginUser200Response**](LoginUser200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User successfully logged in. |  -  |
| **401** | User login failed (unauthorized). |  -  |

<a name="logoutUser"></a>
# **logoutUser**
> LogoutUser200Response logoutUser()

User logout

User will be logged out.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      LogoutUser200Response result = apiInstance.logoutUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#logoutUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LogoutUser200Response**](LogoutUser200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User successfully logged out. |  -  |
| **401** | unauthorized. |  -  |

<a name="scheduleTrafficLightsControl"></a>
# **scheduleTrafficLightsControl**
> ControlTrafficLights401Response scheduleTrafficLightsControl(street, color, day, hours, minutes, month, seconds, year)

Scheduled control of the traffic lights

Schedules the controlling of the traffic lights of the specified street to green or red.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://149.201.190.76:8000");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String street = "Mozartstrasse"; // String | 
    String color = "green"; // String | 
    Integer day = 56; // Integer | 
    Integer hours = 56; // Integer | 
    Integer minutes = 56; // Integer | 
    Integer month = 56; // Integer | 
    Integer seconds = 56; // Integer | 
    Integer year = 56; // Integer | 
    try {
      ControlTrafficLights401Response result = apiInstance.scheduleTrafficLightsControl(street, color, day, hours, minutes, month, seconds, year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#scheduleTrafficLightsControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **street** | **String**|  | [default to Mozartstrasse] [enum: Mozartstrasse, Schillerstrasse] |
| **color** | **String**|  | [default to green] [enum: green, red] |
| **day** | **Integer**|  | [optional] |
| **hours** | **Integer**|  | [optional] |
| **minutes** | **Integer**|  | [optional] |
| **month** | **Integer**|  | [optional] |
| **seconds** | **Integer**|  | [optional] |
| **year** | **Integer**|  | [optional] |

### Return type

[**ControlTrafficLights401Response**](ControlTrafficLights401Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Switching traffic lights status successfully worked. |  -  |
| **400** | Switching traffic lights status failed. |  -  |
| **401** | Switching traffic lights status  failed (unauthorized). |  -  |

