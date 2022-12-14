/*
 * Traffic Lights
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AddUser200Response;
import org.openapitools.client.model.ControlTrafficLights200Response;
import org.openapitools.client.model.ControlTrafficLights400Response;
import org.openapitools.client.model.ControlTrafficLights401Response;
import org.openapitools.client.model.DeleteUser200Response;
import org.openapitools.client.model.GetAllScheduledTrafficLightsEvents200Response;
import org.openapitools.client.model.GetAllScheduledTrafficLightsEvents401Response;
import org.openapitools.client.model.GetAllUsers200ResponseInnerValue;
import org.openapitools.client.model.GetAvailableStreets200Response;
import org.openapitools.client.model.GetTrafficLightsStatus200Response;
import org.openapitools.client.model.GetTrafficLightsStatus400Response;
import org.openapitools.client.model.GetUserRole200Response;
import org.openapitools.client.model.LoginUser200Response;
import org.openapitools.client.model.LoginUser401Response;
import org.openapitools.client.model.LogoutUser200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Add new user
     *
     * New User will be added
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserTest() throws ApiException {
        String password = null;
        String role = null;
        String username = null;
        AddUser200Response response = api.addUser(password, role, username);
        // TODO: test validations
    }

    /**
     * Controls the traffic lights
     *
     * Controls the traffic lights of the specified street.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void controlTrafficLightsTest() throws ApiException {
        String street = null;
        String color = null;
        ControlTrafficLights200Response response = api.controlTrafficLights(street, color);
        // TODO: test validations
    }

    /**
     * Delete existing user
     *
     * User with id will be deleted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        Integer id = null;
        DeleteUser200Response response = api.deleteUser(id);
        // TODO: test validations
    }

    /**
     * Returns all scheduled traffic lights events
     *
     * Returns all scheduled traffic lights events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllScheduledTrafficLightsEventsTest() throws ApiException {
        GetAllScheduledTrafficLightsEvents200Response response = api.getAllScheduledTrafficLightsEvents();
        // TODO: test validations
    }

    /**
     * Retrieve all users
     *
     * All registered Users will be retrieved (admin only).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllUsersTest() throws ApiException {
        List<Map<String, GetAllUsers200ResponseInnerValue>> response = api.getAllUsers();
        // TODO: test validations
    }

    /**
     * Traffic Lights available streets
     *
     * Traffic Lights available streets will be returned
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAvailableStreetsTest() throws ApiException {
        GetAvailableStreets200Response response = api.getAvailableStreets();
        // TODO: test validations
    }

    /**
     * Traffic Lights status
     *
     * Current Traffic Lights status of the specified street will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTrafficLightsStatusTest() throws ApiException {
        String street = null;
        GetTrafficLightsStatus200Response response = api.getTrafficLightsStatus(street);
        // TODO: test validations
    }

    /**
     * Retrieve User status (role)
     *
     * User&#39;s role will be returned (admin 0, user 1, none -1).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserRoleTest() throws ApiException {
        GetUserRole200Response response = api.getUserRole();
        // TODO: test validations
    }

    /**
     * User login
     *
     * User login. New session will be started.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginUserTest() throws ApiException {
        String password = null;
        String username = null;
        LoginUser200Response response = api.loginUser(password, username);
        // TODO: test validations
    }

    /**
     * User logout
     *
     * User will be logged out.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutUserTest() throws ApiException {
        LogoutUser200Response response = api.logoutUser();
        // TODO: test validations
    }

    /**
     * Scheduled control of the traffic lights
     *
     * Schedules the controlling of the traffic lights of the specified street to green or red.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void scheduleTrafficLightsControlTest() throws ApiException {
        String street = null;
        String color = null;
        Integer day = null;
        Integer hours = null;
        Integer minutes = null;
        Integer month = null;
        Integer seconds = null;
        Integer year = null;
        ControlTrafficLights401Response response = api.scheduleTrafficLightsControl(street, color, day, hours, minutes, month, seconds, year);
        // TODO: test validations
    }

}
