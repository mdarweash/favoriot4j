/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.comm;

import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.converter.GsonConverter;

/**
 *
 * @author mdarweash
 */
public class FavorIotRESTfulBuilder implements retrofit.ErrorHandler {

    Logger log = LogManager.getLogger();
    FavorIoTClient favorIoTClient;

    public FavorIotRESTfulBuilder(String favorIotApiKey) {
        RestAdapter.Builder retrofit = new RestAdapter.Builder();
        RestAdapter adapter = retrofit.setEndpoint("https://api.favoriot.com/v1/")
                .setConverter(new GsonConverter(new GsonBuilder().create()))
                .setRequestInterceptor(new ApiRequestInterceptor(favorIotApiKey))
                .setErrorHandler(this)
                .build();
        log.info("favorIoT RESTful client is ready..");
        favorIoTClient = adapter.create(FavorIoTClient.class);
    }

    @Override
    public Throwable handleError(RetrofitError cause) {
        try {
            log.error("Response error code" + cause.getResponse().getStatus());
        } catch (Exception e) {
        }
        try {
            log.error("Error Stacktrace", cause.getCause());
        } catch (Exception e) {
        }
        return cause.getCause();
    }

    public FavorIoTClient getFavorIoTClient() {
        return favorIoTClient;
    }
    

}
