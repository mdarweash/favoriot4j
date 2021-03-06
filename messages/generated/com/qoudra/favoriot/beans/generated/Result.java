
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

    private String groupId;
    private String groupDeveloperId;
    private String appDeveloperId;
    private String description;
    private String groupName;
    private boolean active;
    private String userId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupDeveloperId() {
        return groupDeveloperId;
    }

    public void setGroupDeveloperId(String groupDeveloperId) {
        this.groupDeveloperId = groupDeveloperId;
    }

    public String getAppDeveloperId() {
        return appDeveloperId;
    }

    public void setAppDeveloperId(String appDeveloperId) {
        this.appDeveloperId = appDeveloperId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
        return new ToStringBuilder(this).append("groupId", groupId).append("groupDeveloperId", groupDeveloperId).append("appDeveloperId", appDeveloperId).append("description", description).append("groupName", groupName).append("active", active).append("userId", userId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(appDeveloperId).append(groupName).append(groupId).append(description).append(active).append(groupDeveloperId).append(userId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return new EqualsBuilder().append(appDeveloperId, rhs.appDeveloperId).append(groupName, rhs.groupName).append(groupId, rhs.groupId).append(description, rhs.description).append(active, rhs.active).append(groupDeveloperId, rhs.groupDeveloperId).append(userId, rhs.userId).isEquals();
    }

}
