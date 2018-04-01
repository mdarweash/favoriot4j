
package com.qoudra.favoriot.beans;

import java.util.HashMap;
import java.util.Map;

public class CreateDeviceResponse {

    private Integer code;
    private String message;
    private CreateDeviceResponseDetails details;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CreateDeviceResponseDetails getDetails() {
        return details;
    }

    public void setDetails(CreateDeviceResponseDetails details) {
        this.details = details;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
