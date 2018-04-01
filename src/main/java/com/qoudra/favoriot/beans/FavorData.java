/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.beans;

import java.util.HashMap;

/**
 *
 * @author mdarweash
 */
public class FavorData {

    String device_developer_id;
    HashMap<String, Object> data = new HashMap<>();

    public String getDevice_developer_id() {
        return device_developer_id;
    }

    public void setDevice_developer_id(String device_developer_id) {
        this.device_developer_id = device_developer_id;
    }

    public Object get(Object key) {
        return data.get(key);
    }

    public Object put(String key, Object value) {
        return data.put(key, value);
    }

    
    
}
