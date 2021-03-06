
package com.qoudra.favoriot.beans.generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CreateGroupResponse {

    private int code;
    private String message;
    private CreateGroupResponseDetails details;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateGroupResponseDetails getDetails() {
        return details;
    }

    public void setDetails(CreateGroupResponseDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("message", message).append("details", details).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(details).append(code).append(message).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateGroupResponse) == false) {
            return false;
        }
        CreateGroupResponse rhs = ((CreateGroupResponse) other);
        return new EqualsBuilder().append(details, rhs.details).append(code, rhs.code).append(message, rhs.message).isEquals();
    }

}
