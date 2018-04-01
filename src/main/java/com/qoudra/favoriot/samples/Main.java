/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.samples;

import com.google.gson.Gson;
import com.qoudra.favoriot.comm.FavorIoTClient;
import com.qoudra.favoriot.comm.FavorIotRESTfulBuilder;

/**
 *
 * @author mdarweash
 */
public class Main {

    static String API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6Ik1kYXJ3ZWFzaCIsInJlYWRfd3JpdGUiOnRydWUsImlhdCI6MTUxNjA2NDI4Mn0.YyWF88SNEtVX1L94mpk1fF0nKyyddLxLl_V-05AHL9g";

    public static void main(String[] args) {

        Gson g = new Gson();
        
        FavorIotRESTfulBuilder favorIotRESTfulBuilder = new FavorIotRESTfulBuilder(API_KEY);
        FavorIoTClient favorIoTClient = favorIotRESTfulBuilder.getFavorIoTClient();

        //--------------Projects----------------------
//        System.out.println(g.toJson(favorIoTClient.getApplicationsListByProject("projectDefault@Mdarweash")));
//        FavorProjectBean favorProjectBean = new FavorProjectBean();
//        favorProjectBean.setDescription("Qoudra Api Test");
//        System.out.println(g.toJson(favorIoTClient.updateProject("projectDefault@Mdarweash", favorProjectBean)));
        
        //--------------Groups----------------------
//        print(favorIoTClient.getGroupsByApplication("applicationDefault@Mdarweash"));
//        print(favorIoTClient.getAllApplications(null, null, 0, null, 0, 0, FavorIoTClient.ORDER_ENUM.DESC, 0));
//        print(favorIoTClient.getApplication("applicationDefault@Mdarweash"));
//        print(favorIoTClient.addApplication("applicationDefault@Mdarweash"));

        

    
    }
    public static void print(Object c)
    {
        Gson g = new Gson();
        System.out.println(g.toJson(c));
    }

}
