package com.pluralsight.model;

import java.util.List;

public class ActivitySearch {
    private int durationFrom;
    private int durationTo;
    private List<String> descriptions;
    private ActivitySearchType searchType;

    public int getDurationFrom() {
        return durationFrom;
    }

    public ActivitySearch setDurationFrom(int durationFrom) {
        this.durationFrom = durationFrom;
        return this;
    }

    public int getDurationTo() {
        return durationTo;
    }

    public ActivitySearch setDurationTo(int durationTo) {
        this.durationTo = durationTo;
        return this;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public ActivitySearch setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    public ActivitySearchType getSearchType() {
        return searchType;
    }

    public ActivitySearch setSearchType(ActivitySearchType searchType) {
        this.searchType = searchType;
        return this;
    }

}
