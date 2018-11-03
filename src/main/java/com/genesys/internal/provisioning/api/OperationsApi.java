/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.31.2754
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.provisioning.api;

import com.genesys.internal.common.ApiCallback;
import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;
import com.genesys.internal.common.ApiResponse;
import com.genesys.internal.common.Configuration;
import com.genesys.internal.common.Pair;
import com.genesys.internal.common.ProgressRequestBody;
import com.genesys.internal.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.genesys.internal.provisioning.model.ApiAsyncSuccessResponse;
import com.genesys.internal.provisioning.model.ApiErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationsApi {
    private ApiClient apiClient;

    public OperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUsedSkillsAsync
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsedSkillsAsyncCall(String aioId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/operations/get-used-skills";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (aioId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("_aioId", aioId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsedSkillsAsyncValidateBeforeCall(String aioId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'aioId' is set
        if (aioId == null) {
            throw new ApiException("Missing the required parameter 'aioId' when calling getUsedSkillsAsync(Async)");
        }
        

        com.squareup.okhttp.Call call = getUsedSkillsAsyncCall(aioId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get used skills.
     * Get all [CfgSkill](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgSkill) that are linked to existing [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects. 
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @return ApiAsyncSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiAsyncSuccessResponse getUsedSkillsAsync(String aioId) throws ApiException {
        ApiResponse<ApiAsyncSuccessResponse> resp = getUsedSkillsAsyncWithHttpInfo(aioId);
        return resp.getData();
    }

    /**
     * Get used skills.
     * Get all [CfgSkill](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgSkill) that are linked to existing [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects. 
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @return ApiResponse&lt;ApiAsyncSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiAsyncSuccessResponse> getUsedSkillsAsyncWithHttpInfo(String aioId) throws ApiException {
        com.squareup.okhttp.Call call = getUsedSkillsAsyncValidateBeforeCall(aioId, null, null);
        Type localVarReturnType = new TypeToken<ApiAsyncSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get used skills. (asynchronously)
     * Get all [CfgSkill](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgSkill) that are linked to existing [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects. 
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsedSkillsAsyncAsync(String aioId, final ApiCallback<ApiAsyncSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUsedSkillsAsyncValidateBeforeCall(aioId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiAsyncSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsersAsync
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @param limit Limit the number of users the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned users. (optional)
     * @param order The sort order. (optional)
     * @param sortBy A comma-separated list of fields to sort on. Possible values are firstName, lastName, and userName.  (optional)
     * @param filterName The name of a filter to use on the results. (optional)
     * @param filterParameters A part of the users first or last name, if you use the FirstNameOrLastNameMatches filter.  (optional)
     * @param roles Return only return users who have these Workspace Web Edition roles. The roles can be specified in a comma-separated list. Possible values are ROLE_AGENT and ROLE_ADMIN,ROLE_SUPERVISOR.  (optional)
     * @param skills Return only users who have these skills. The skills can be specified in a comma-separated list.  (optional)
     * @param userEnabled Return only enabled or disabled users. (optional)
     * @param userValid Return only valid or invalid users. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersAsyncCall(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/operations/get-users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (aioId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("_aioId", aioId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
        if (filterName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterName", filterName));
        if (filterParameters != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterParameters", filterParameters));
        if (roles != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("roles", roles));
        if (skills != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skills", skills));
        if (userEnabled != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userEnabled", userEnabled));
        if (userValid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("userValid", userValid));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsersAsyncValidateBeforeCall(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'aioId' is set
        if (aioId == null) {
            throw new ApiException("Missing the required parameter 'aioId' when calling getUsersAsync(Async)");
        }
        

        com.squareup.okhttp.Call call = getUsersAsyncCall(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get users.
     * Get [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects based on the specified filters.
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @param limit Limit the number of users the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned users. (optional)
     * @param order The sort order. (optional)
     * @param sortBy A comma-separated list of fields to sort on. Possible values are firstName, lastName, and userName.  (optional)
     * @param filterName The name of a filter to use on the results. (optional)
     * @param filterParameters A part of the users first or last name, if you use the FirstNameOrLastNameMatches filter.  (optional)
     * @param roles Return only return users who have these Workspace Web Edition roles. The roles can be specified in a comma-separated list. Possible values are ROLE_AGENT and ROLE_ADMIN,ROLE_SUPERVISOR.  (optional)
     * @param skills Return only users who have these skills. The skills can be specified in a comma-separated list.  (optional)
     * @param userEnabled Return only enabled or disabled users. (optional)
     * @param userValid Return only valid or invalid users. (optional)
     * @return ApiAsyncSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiAsyncSuccessResponse getUsersAsync(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid) throws ApiException {
        ApiResponse<ApiAsyncSuccessResponse> resp = getUsersAsyncWithHttpInfo(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid);
        return resp.getData();
    }

    /**
     * Get users.
     * Get [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects based on the specified filters.
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @param limit Limit the number of users the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned users. (optional)
     * @param order The sort order. (optional)
     * @param sortBy A comma-separated list of fields to sort on. Possible values are firstName, lastName, and userName.  (optional)
     * @param filterName The name of a filter to use on the results. (optional)
     * @param filterParameters A part of the users first or last name, if you use the FirstNameOrLastNameMatches filter.  (optional)
     * @param roles Return only return users who have these Workspace Web Edition roles. The roles can be specified in a comma-separated list. Possible values are ROLE_AGENT and ROLE_ADMIN,ROLE_SUPERVISOR.  (optional)
     * @param skills Return only users who have these skills. The skills can be specified in a comma-separated list.  (optional)
     * @param userEnabled Return only enabled or disabled users. (optional)
     * @param userValid Return only valid or invalid users. (optional)
     * @return ApiResponse&lt;ApiAsyncSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiAsyncSuccessResponse> getUsersAsyncWithHttpInfo(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid) throws ApiException {
        com.squareup.okhttp.Call call = getUsersAsyncValidateBeforeCall(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid, null, null);
        Type localVarReturnType = new TypeToken<ApiAsyncSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get users. (asynchronously)
     * Get [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects based on the specified filters.
     * @param aioId A unique ID generated on the client (browser) when sending an API request that returns an asynchronous response. (required)
     * @param limit Limit the number of users the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned users. (optional)
     * @param order The sort order. (optional)
     * @param sortBy A comma-separated list of fields to sort on. Possible values are firstName, lastName, and userName.  (optional)
     * @param filterName The name of a filter to use on the results. (optional)
     * @param filterParameters A part of the users first or last name, if you use the FirstNameOrLastNameMatches filter.  (optional)
     * @param roles Return only return users who have these Workspace Web Edition roles. The roles can be specified in a comma-separated list. Possible values are ROLE_AGENT and ROLE_ADMIN,ROLE_SUPERVISOR.  (optional)
     * @param skills Return only users who have these skills. The skills can be specified in a comma-separated list.  (optional)
     * @param userEnabled Return only enabled or disabled users. (optional)
     * @param userValid Return only valid or invalid users. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersAsyncAsync(String aioId, Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled, String userValid, final ApiCallback<ApiAsyncSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUsersAsyncValidateBeforeCall(aioId, limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiAsyncSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
