
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UpdateDeviceBody {

    private String description;
    private boolean active;
    private String deviceType;
    private String sensorType;
    private String timezone;
    private int latitude;
    private int longitude;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("active", active).append("deviceType", deviceType).append("sensorType", sensorType).append("timezone", timezone).append("latitude", latitude).append("longitude", longitude).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deviceType).append(timezone).append(sensorType).append(latitude).append(description).append(active).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdateDeviceBody) == false) {
            return false;
        }
        UpdateDeviceBody rhs = ((UpdateDeviceBody) other);
        return new EqualsBuilder().append(deviceType, rhs.deviceType).append(timezone, rhs.timezone).append(sensorType, rhs.sensorType).append(latitude, rhs.latitude).append(description, rhs.description).append(active, rhs.active).append(longitude, rhs.longitude).isEquals();
    }

}
