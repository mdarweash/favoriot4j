
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CreateGroupBody {

    private String groupName;
    private boolean active;
    private String applicationDeveloperId;
    private String description;

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

    public String getApplicationDeveloperId() {
        return applicationDeveloperId;
    }

    public void setApplicationDeveloperId(String applicationDeveloperId) {
        this.applicationDeveloperId = applicationDeveloperId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupName", groupName).append("active", active).append("applicationDeveloperId", applicationDeveloperId).append("description", description).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(active).append(description).append(groupName).append(applicationDeveloperId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateGroupBody) == false) {
            return false;
        }
        CreateGroupBody rhs = ((CreateGroupBody) other);
        return new EqualsBuilder().append(active, rhs.active).append(description, rhs.description).append(groupName, rhs.groupName).append(applicationDeveloperId, rhs.applicationDeveloperId).isEquals();
    }

}
