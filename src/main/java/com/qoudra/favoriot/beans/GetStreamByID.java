package com.qoudra.favoriot.beans;


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class GetStreamByID {

    private String streamId;
    private String streamDeveloperD;
    private String deviceDeveloperId;
    private HashMap<String,Object> data;
    private Integer streamCreatedAt;
    private String owner;
    private String code;
    private String message;
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getStreamDeveloperD() {
        return streamDeveloperD;
    }

    public void setStreamDeveloperD(String streamDeveloperD) {
        this.streamDeveloperD = streamDeveloperD;
    }

    public String getDeviceDeveloperId() {
        return deviceDeveloperId;
    }

    public void setDeviceDeveloperId(String deviceDeveloperId) {
        this.deviceDeveloperId = deviceDeveloperId;
    }

    public HashMap getData() {
        return data;
    }

    public void setData(HashMap data) {
        this.data = data;
    }

    public Integer getStreamCreatedAt() {
        return streamCreatedAt;
    }

    public void setStreamCreatedAt(Integer streamCreatedAt) {
        this.streamCreatedAt = streamCreatedAt;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
