package com.pluralsight.client;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.pluralsight.model.Activity;
import com.pluralsight.model.ActivitySearch;
import com.pluralsight.model.ActivitySearchType;

public class ActivityClientTest {

    @Test
    public void testSearchObject() {
        ActivitySearchClient client = new ActivitySearchClient();
        ActivitySearch search = new ActivitySearch();

        List<String> searchValues = new ArrayList<String>();
        searchValues.add("swimming");
        searchValues.add("running");

        search.setDescriptions(searchValues)
                .setDurationFrom(30)
                .setDurationTo(55)
                .setSearchType(ActivitySearchType.SEACH_BY_DESCRIPTION);

        List<Activity> activities = client.search(search);

        System.out.println(activities);

        assertNotNull(activities);
    }

    @Test
    public void testSearch() {
        ActivitySearchClient client = new ActivitySearchClient();

        String param = "description";
        List<String> searchValues = new ArrayList<String>();
        searchValues.add("swimming");
        searchValues.add("running");

        String secondParam = "durationFrom";
        int durationFrom = 30;
        String thirdParam = "durationFrom";
        int durationTo = 55;

        List<Activity> activities = client.search(param, searchValues, secondParam, durationFrom, thirdParam, durationTo);

        assertNotNull(activities);
    }

    @Test
    public void testGet() {
        ActivityClient client = new ActivityClient();
        Activity activity = client.get("0");
        assertNotNull(activity);
    }

    @Test
    public void testGetList() {
        ActivityClient client = new ActivityClient();
        List<Activity> activities = client.get();
        assertNotNull(activities);
    }

    @Test(expected = RuntimeException.class)
    public void testGetWithBadRequest() {
        ActivityClient client = new ActivityClient();

        client.get("");
    }

    @Test(expected = RuntimeException.class)
    public void testGetWithNotFound() {
        ActivityClient client = new ActivityClient();

        client.get("7777");
    }

    @Test
    public void testCreate() {
        ActivityClient client = new ActivityClient();

        Activity activity = new Activity().setDescription("Swimming").setDuration(90);

        activity = client.create(activity);

        assertNotNull(activity);
    }

    @Test
    public void testPut() {
        ActivityClient client = new ActivityClient();

        Activity activity = new Activity()
                .setId("3456")
                .setDescription("Swimming")
                .setDuration(90);

        activity = client.update(activity);

        assertNotNull(activity);
    }

    @Test
    public void testDelete() {
        ActivityClient client = new ActivityClient();

        Activity activity = new Activity().setId("3456");
        client.delete(activity);
    }

}
