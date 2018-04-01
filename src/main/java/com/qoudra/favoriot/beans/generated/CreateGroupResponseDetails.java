
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CreateGroupResponseDetails {

    private String deviceId;
    private String groupDeveloperId;
    private String deviceDeveloperId;
    private String description;
    private String deveiceName;
    private boolean active;
    private Object latitude;
    private Object longitude;
    private String timezone;
    private String userId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getGroupDeveloperId() {
        return groupDeveloperId;
    }

    public void setGroupDeveloperId(String groupDeveloperId) {
        this.groupDeveloperId = groupDeveloperId;
    }

    public String getDeviceDeveloperId() {
        return deviceDeveloperId;
    }

    public void setDeviceDeveloperId(String deviceDeveloperId) {
        this.deviceDeveloperId = deviceDeveloperId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveiceName() {
        return deveiceName;
    }

    public void setDeveiceName(String deveiceName) {
        this.deveiceName = deveiceName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceId", deviceId).append("groupDeveloperId", groupDeveloperId).append("deviceDeveloperId", deviceDeveloperId).append("description", description).append("deveiceName", deveiceName).append("active", active).append("latitude", latitude).append("longitude", longitude).append("timezone", timezone).append("userId", userId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deveiceName).append(timezone).append(latitude).append(description).append(active).append(groupDeveloperId).append(deviceDeveloperId).append(deviceId).append(userId).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateGroupResponseDetails) == false) {
            return false;
        }
        CreateGroupResponseDetails rhs = ((CreateGroupResponseDetails) other);
        return new EqualsBuilder().append(deveiceName, rhs.deveiceName).append(timezone, rhs.timezone).append(latitude, rhs.latitude).append(description, rhs.description).append(active, rhs.active).append(groupDeveloperId, rhs.groupDeveloperId).append(deviceDeveloperId, rhs.deviceDeveloperId).append(deviceId, rhs.deviceId).append(userId, rhs.userId).append(longitude, rhs.longitude).isEquals();
    }

}
