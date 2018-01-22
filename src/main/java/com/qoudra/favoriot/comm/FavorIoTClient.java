/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qoudra.favoriot.comm;

import com.qoudra.favoriot.beans.AddProjectResponse;
import com.qoudra.favoriot.beans.FavorApplicationBean;
import com.qoudra.favoriot.beans.FavorProjectBean;
import com.qoudra.favoriot.beans.GetAllProjectsResponse;
import com.qoudra.favoriot.beans.GetApplicationsByProjectBean;
import com.qoudra.favoriot.beans.ResponseBean;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 *
 * @author manara
 */
public interface FavorIoTClient {

    public enum ORDER_ENUM {
        ASC, DESC;
    };
    String CONTENT_TYPE = "application/json;charset=utf-8";

    /**
     * PROJECTS
     */
    @GET(value = "/projects")
    GetAllProjectsResponse getAllProjects(@Query("project_name") String project_name,
            @Query("project_developer_id") String project_developer_id,
            @Query("active") boolean active,
            @Query("created_at") String created_at,
            @Query("created_from_to") String created_from_to,
            @Query("max") int max,
            @Query("order") ORDER_ENUM order,
            @Query("offset") int offset
    ) throws Exception;

    @GET(value = "/projects/{project_developer_id}")
    FavorProjectBean getProject(@Path("project_developer_id") String project_developer_id);

    @POST(value = "/projects")
    AddProjectResponse addProject(@Body FavorProjectBean favorProjectBean);

    @DELETE(value = "/projects/{project_developer_id}")
    ResponseBean deleteProject(@Path("project_developer_id") String project_developer_id);

    @PUT(value = "/projects/{project_developer_id}")
    ResponseBean updateProject(@Path("project_developer_id") String project_developer_id, @Body FavorProjectBean favorProjectBean);

    @GET(value = "/projects/{project_developer_id}/apps")
    GetApplicationsByProjectBean getApplicationsListByProject(@Path("project_developer_id") String project_developer_id);

    @GET(value = "/projects/{project_developer_id}/apps/{application_developer_id}")
    FavorApplicationBean getApplicationByProject(@Path("project_developer_id") String project_developer_id, @Path("application_developer_id") String application_developer_id);

    //----------------Applications-----------------
        
    @POST(value = "/apps")
    FavorProjectBean addApplication(@Body FavorApplicationBean favorApplicationBean);

    @GET(value = "/apps")
    FavorProjectBean getAllApplications(
            @Query("application_name") String aplication_name,
            @Query("application_developer_id") String application_developer_id,
            @Query("created_at") long created_at,
            @Query("created_from_to") String created_from_to,
            @Query("max") int max,
            @Query("sort") int sort,
            @Query("order") ORDER_ENUM order,
            @Query("offset") int offset
    );

    @GET(value = "/apps/{application_developer_id}")
    FavorApplicationBean getApplication(@Query("application_developer_id") String application_developer_id);

    @PUT(value = "/apps/{application_developer_id}")
    FavorApplicationBean updateApplication(@Query("application_developer_id") String application_developer_id, @Body FavorApplicationBean favorApplicationBean);

    @DELETE(value = "/apps/{application_developer_id}")
    ResponseBean deleteApplication(@Query("application_developer_id") String application_developer_id);

    @GET(value = "/applications/{application_developer_id}/groups")
    GetGroupsByApplicationResponse getGroupsByApplication(@Query("application_developer_id") String application_developer_id);

}
