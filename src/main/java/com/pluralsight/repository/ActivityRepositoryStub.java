package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.ActivitySearch;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

    @Override
    public List<Activity> findAll() {

        List<Activity> activities = new ArrayList<Activity>();

        Activity activity1 = new Activity()
                .setId("3433")
                .setDescription("Swimming")
                .setDuration(10);

        activities.add(activity1);

        Activity activity2 = new Activity()
                .setId("1234")
                .setDescription("Cycling")
                .setDuration(10);

        activities.add(activity2);

        return activities;

    }

    @Override
    public Activity findActivity(String activityId) {

        if (activityId.equals("7777")) {
            return null;
        }

        Activity activity1 = new Activity()
                .setId("1234")
                .setDescription("Swimming")
                .setDuration(10);

        User user = new User()
                .setId("1234")
                .setName("Noor");

        activity1.setUser(user);

        return activity1;

    }

    @Override
    public void create(Activity activity) {
        System.out.println("Create Activity:" + activity.toString());
    }

    @Override
    public Activity update(Activity activity) {
        System.out.println("Update Activity:" + activity.getId());
        return activity;
    }

    @Override
    public void delete(String activityId) {
        System.out.println("Delete Activity:" + activityId);
    }

    @Override
    public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
        List<Activity> activities = new ArrayList<Activity>();

        Activity activity1 = new Activity()
                .setId("1234")
                .setDescription("Swimming")
                .setDuration(10);

        activities.add(activity1);

        Activity activity2 = new Activity()
                .setId("3445")
                .setDescription("Cycling")
                .setDuration(10);

        activities.add(activity2);

        return activities;
    }

    @Override
    public List<Activity> findByConstraints(ActivitySearch search) {
        List<Activity> activities = new ArrayList<Activity>();

        Activity activity1 = new Activity()
                .setId("1234")
                .setDescription("Swimming")
                .setDuration(10);

        activities.add(activity1);

        Activity activity2 = new Activity()
                .setId("3445")
                .setDescription("Cycling")
                .setDuration(10);

        activities.add(activity2);

        return activities;
    }
}
