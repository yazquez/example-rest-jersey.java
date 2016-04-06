package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.ActivitySearch;

public interface ActivityRepository {

    List<Activity> findAll();

    Activity findActivity(String activityId);

    void create(Activity setDuration);

    Activity update(Activity activity);

    void delete(String activityId);

    List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo);

    List<Activity> findByConstraints(ActivitySearch search);

}