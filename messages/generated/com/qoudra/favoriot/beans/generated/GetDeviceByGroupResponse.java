
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GetDeviceByGroupResponse {

    private String deviceId;
    private String groupDeveloperId;
    private String deviceDeveloperId;
    private String description;
    private String deviceName;
    private boolean active;
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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceId", deviceId).append("groupDeveloperId", groupDeveloperId).append("deviceDeveloperId", deviceDeveloperId).append("description", description).append("deviceName", deviceName).append("active", active).append("userId", userId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(active).append(groupDeveloperId).append(deviceDeveloperId).append(deviceId).append(deviceName).append(userId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetDeviceByGroupResponse) == false) {
            return false;
        }
        GetDeviceByGroupResponse rhs = ((GetDeviceByGroupResponse) other);
        return new EqualsBuilder().append(description, rhs.description).append(active, rhs.active).append(groupDeveloperId, rhs.groupDeveloperId).append(deviceDeveloperId, rhs.deviceDeveloperId).append(deviceId, rhs.deviceId).append(deviceName, rhs.deviceName).append(userId, rhs.userId).isEquals();
    }

}
