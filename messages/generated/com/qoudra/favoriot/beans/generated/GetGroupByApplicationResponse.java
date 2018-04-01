
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class GetGroupByApplicationResponse {

    private String groupId;
    private String applicationDeveloperId;
    private String groupDeveloperId;
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

    public String getApplicationDeveloperId() {
        return applicationDeveloperId;
    }

    public void setApplicationDeveloperId(String applicationDeveloperId) {
        this.applicationDeveloperId = applicationDeveloperId;
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
        return new ToStringBuilder(this).append("groupId", groupId).append("applicationDeveloperId", applicationDeveloperId).append("groupDeveloperId", groupDeveloperId).append("description", description).append("groupName", groupName).append("active", active).append("userId", userId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupName).append(groupId).append(description).append(active).append(groupDeveloperId).append(userId).append(applicationDeveloperId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetGroupByApplicationResponse) == false) {
            return false;
        }
        GetGroupByApplicationResponse rhs = ((GetGroupByApplicationResponse) other);
        return new EqualsBuilder().append(groupName, rhs.groupName).append(groupId, rhs.groupId).append(description, rhs.description).append(active, rhs.active).append(groupDeveloperId, rhs.groupDeveloperId).append(userId, rhs.userId).append(applicationDeveloperId, rhs.applicationDeveloperId).isEquals();
    }

}
