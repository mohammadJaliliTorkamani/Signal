package com.seeds.signal.Entity;

public class ApplicationKey {
    private String applicationKey;
    private String applicationID;

    public ApplicationKey(String applicationKey, String applicationID) {
        this.applicationKey = applicationKey;
        this.applicationID = applicationID;
    }

    public String getApplicationKey() {
        return applicationKey;
    }

    public void setApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }
}
