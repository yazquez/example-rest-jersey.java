package com.pluralsight.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.pluralsight.model.Activity;

public class ActivityClient2 {
    private Client client;

    public ActivityClient2() {
        client = ClientBuilder.newClient();
    }

    public Activity get(String id) {
        WebTarget target = client.target("http://localhost:8080/exercise-services/webapi/");

        System.out.println("Activity (XML):" + target.path("activities/" + id).request().get(String.class));
        System.out.println("Activity (JSON):" + target.path("activities/" + id).request(MediaType.APPLICATION_JSON).get(String.class));

        Activity response = target.path("activities/" + id).request().get(Activity.class);

        return response;
    }

    public List<Activity> get() {
        WebTarget target = client.target("http://localhost:8080/exercise-services/webapi/");

        List<Activity> response = target.path("activities").request().get(new GenericType<List<Activity>>() {
        });

        return response;
    }

}
