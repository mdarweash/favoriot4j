/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.beans;

import java.util.HashMap;
import java.util.Map;

public class CreateDeviceParam {

private String deviceName;
private Boolean active;
private String groupDeveloperId;
private String description;
private String deviceType;
private String sensorType;
private String timezone;
private Integer latitude;
private Integer longitude;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getDeviceName() {
return deviceName;
}

public void setDeviceName(String deviceName) {
this.deviceName = deviceName;
}

public Boolean getActive() {
return active;
}

public void setActive(Boolean active) {
this.active = active;
}

public String getGroupDeveloperId() {
return groupDeveloperId;
}

public void setGroupDeveloperId(String groupDeveloperId) {
this.groupDeveloperId = groupDeveloperId;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
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

public Integer getLatitude() {
return latitude;
}

public void setLatitude(Integer latitude) {
this.latitude = latitude;
}

public Integer getLongitude() {
return longitude;
}

public void setLongitude(Integer longitude) {
this.longitude = longitude;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
