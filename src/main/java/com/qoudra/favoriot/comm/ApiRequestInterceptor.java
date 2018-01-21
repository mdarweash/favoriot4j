/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.comm;

/**
 *
 * @author manara
 */
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import retrofit.RequestInterceptor;

/**
 *
 * Interceptor used to authorize requests.
 *
 */
public class ApiRequestInterceptor implements RequestInterceptor {

    String apiKey;

    public ApiRequestInterceptor(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override

    public void intercept(RequestFacade requestFacade) {

        requestFacade.addHeader("apikey", apiKey);
        requestFacade.addHeader("content-type", "application/json");
        requestFacade.addHeader("cache-control", "no-cache");
    }
}
