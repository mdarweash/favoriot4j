/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.beans;

/**
 *
 * @author mdarweash
 */
public class AddApplication {

    int code;
    String message;
    ApplicationDetails details;

    class ApplicationDetails {

        String _id;
        String app_id;
        String project_id;
        String description;
        boolean enabled;
        String name;
        String owner;
    }

}
