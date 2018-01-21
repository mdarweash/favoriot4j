/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.samples;

import com.google.gson.Gson;
import com.qoudra.favoriot.beans.FavorProjectBean;
import com.qoudra.favoriot.comm.FavorIoTClient;
import com.qoudra.favoriot.comm.FavorIotRESTfulBuilder;
import java.io.PrintStream;

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

        System.out.println(g.toJson(favorIoTClient.getApplicationsListByProject("projectDefault@Mdarweash")));
        FavorProjectBean favorProjectBean = new FavorProjectBean();
        favorProjectBean.setDescription("Qoudra Api Test");
        System.out.println(g.toJson(favorIoTClient.updateProject("projectDefault@Mdarweash", favorProjectBean)));
    }

}
