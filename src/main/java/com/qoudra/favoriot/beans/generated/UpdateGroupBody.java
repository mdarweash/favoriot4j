
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class UpdateGroupBody {

    private String description;
    private boolean active;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("active", active).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(active).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdateGroupBody) == false) {
            return false;
        }
        UpdateGroupBody rhs = ((UpdateGroupBody) other);
        return new EqualsBuilder().append(description, rhs.description).append(active, rhs.active).isEquals();
    }

}
