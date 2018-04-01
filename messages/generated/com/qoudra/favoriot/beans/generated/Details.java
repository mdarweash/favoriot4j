
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Details {

    private String id;
    private String groupId;
    private String appId;
    private String description;
    private boolean enabled;
    private String name;
    private String owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("groupId", groupId).append("appId", appId).append("description", description).append("enabled", enabled).append("name", name).append("owner", owner).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(owner).append(groupId).append(appId).append(name).append(description).append(id).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Details) == false) {
            return false;
        }
        Details rhs = ((Details) other);
        return new EqualsBuilder().append(owner, rhs.owner).append(groupId, rhs.groupId).append(appId, rhs.appId).append(name, rhs.name).append(description, rhs.description).append(id, rhs.id).append(enabled, rhs.enabled).isEquals();
    }

}
