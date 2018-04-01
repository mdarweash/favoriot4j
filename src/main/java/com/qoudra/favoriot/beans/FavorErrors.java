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
public interface FavorErrors {

    public static final int Unable_to_update = 400;
    public static final int UnAuthenticated = 401;
    public static final int forbidden = 403;
    public static final int Not_Found = 404;
    public static final int Not_Unique_Field = 409;
    public static final int Validation_Error = 422;
    public static final int Database_Error = 503;

}
