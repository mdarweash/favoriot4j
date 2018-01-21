/*
 * To change this license header, choose License Headers in FavorProjectBean Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.beans;

/**
 *
 * @author mdarweash
 */
public class FavorProjectBean {
    private String project_id;
    private String project_developer_id;
    private String description;
    private String project_name;
    private boolean active;
    private String user_id;

    public FavorProjectBean() {
    }

    public FavorProjectBean(String project_id, String project_developer_id, String description, String project_name, boolean active, String user_id) {
        this.project_id = project_id;
        this.project_developer_id = project_developer_id;
        this.description = description;
        this.project_name = project_name;
        this.active = active;
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_developer_id() {
        return project_developer_id;
    }

    public void setProject_developer_id(String project_developer_id) {
        this.project_developer_id = project_developer_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    
}
