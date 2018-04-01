
package com.qoudra.favoriot.beans;

import java.util.HashMap;
import java.util.Map;

public class CreateDeviceResponseDetails {

    private String deviceId;
    private String deviceDeveloperD;
    private String groupId;
    private String description;
    private Boolean active;
    private String deviceName;
    private String deviceType;
    private String sensorType;
    private String timezone;
    private String userId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceDeveloperD() {
        return deviceDeveloperD;
    }

    public void setDeviceDeveloperD(String deviceDeveloperD) {
        this.deviceDeveloperD = deviceDeveloperD;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
