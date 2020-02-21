/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.78.4173
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


import com.genesys.internal.provisioning.model.OptionsGetResponseError;
import com.genesys.internal.provisioning.model.OptionsGetResponseSuccess;
import com.genesys.internal.provisioning.model.OptionsPost;
import com.genesys.internal.provisioning.model.OptionsPostResponseStatusError;
import com.genesys.internal.provisioning.model.OptionsPostResponseStatusSuccess;
import com.genesys.internal.provisioning.model.OptionsPut;
import com.genesys.internal.provisioning.model.OptionsPutResponseError;
import com.genesys.internal.provisioning.model.OptionsPutResponseStatusSuccess;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionsApi {
    private ApiClient apiClient;

    public OptionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for optionsGet
     * @param personDbid DBID of a person. Options will be merged with the Person&#39;s annex and annexes of it&#39;s agent groups. Mutual with agent_group_dbid. (optional)
     * @param agentGroupDbid DBID of a person. Options will be merged with the Agent Groups&#39;s annex. Mutual with person_dbid. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call optionsGetCall(String personDbid, String agentGroupDbid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/options";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (personDbid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("person_dbid", personDbid));
        if (agentGroupDbid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("agent_group_dbid", agentGroupDbid));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call optionsGetValidateBeforeCall(String personDbid, String agentGroupDbid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = optionsGetCall(personDbid, agentGroupDbid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Receive existing options.
     * The GET operation will fetch CloudCluster/Options and merges it with person and sgent groups annexes.
     * @param personDbid DBID of a person. Options will be merged with the Person&#39;s annex and annexes of it&#39;s agent groups. Mutual with agent_group_dbid. (optional)
     * @param agentGroupDbid DBID of a person. Options will be merged with the Agent Groups&#39;s annex. Mutual with person_dbid. (optional)
     * @return OptionsGetResponseSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OptionsGetResponseSuccess optionsGet(String personDbid, String agentGroupDbid) throws ApiException {
        ApiResponse<OptionsGetResponseSuccess> resp = optionsGetWithHttpInfo(personDbid, agentGroupDbid);
        return resp.getData();
    }

    /**
     * Receive existing options.
     * The GET operation will fetch CloudCluster/Options and merges it with person and sgent groups annexes.
     * @param personDbid DBID of a person. Options will be merged with the Person&#39;s annex and annexes of it&#39;s agent groups. Mutual with agent_group_dbid. (optional)
     * @param agentGroupDbid DBID of a person. Options will be merged with the Agent Groups&#39;s annex. Mutual with person_dbid. (optional)
     * @return ApiResponse&lt;OptionsGetResponseSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OptionsGetResponseSuccess> optionsGetWithHttpInfo(String personDbid, String agentGroupDbid) throws ApiException {
        com.squareup.okhttp.Call call = optionsGetValidateBeforeCall(personDbid, agentGroupDbid, null, null);
        Type localVarReturnType = new TypeToken<OptionsGetResponseSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Receive existing options. (asynchronously)
     * The GET operation will fetch CloudCluster/Options and merges it with person and sgent groups annexes.
     * @param personDbid DBID of a person. Options will be merged with the Person&#39;s annex and annexes of it&#39;s agent groups. Mutual with agent_group_dbid. (optional)
     * @param agentGroupDbid DBID of a person. Options will be merged with the Agent Groups&#39;s annex. Mutual with person_dbid. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call optionsGetAsync(String personDbid, String agentGroupDbid, final ApiCallback<OptionsGetResponseSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = optionsGetValidateBeforeCall(personDbid, agentGroupDbid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OptionsGetResponseSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for optionsPost
     * @param body Body Data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call optionsPostCall(OptionsPost body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/options";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call optionsPostValidateBeforeCall(OptionsPost body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling optionsPost(Async)");
        }
        

        com.squareup.okhttp.Call call = optionsPostCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Replace old options with new.
     * The POST operation will replace CloudCluster/Options with new values
     * @param body Body Data (required)
     * @return OptionsPostResponseStatusSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OptionsPostResponseStatusSuccess optionsPost(OptionsPost body) throws ApiException {
        ApiResponse<OptionsPostResponseStatusSuccess> resp = optionsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Replace old options with new.
     * The POST operation will replace CloudCluster/Options with new values
     * @param body Body Data (required)
     * @return ApiResponse&lt;OptionsPostResponseStatusSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OptionsPostResponseStatusSuccess> optionsPostWithHttpInfo(OptionsPost body) throws ApiException {
        com.squareup.okhttp.Call call = optionsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<OptionsPostResponseStatusSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace old options with new. (asynchronously)
     * The POST operation will replace CloudCluster/Options with new values
     * @param body Body Data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call optionsPostAsync(OptionsPost body, final ApiCallback<OptionsPostResponseStatusSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = optionsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OptionsPostResponseStatusSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for optionsPut
     * @param body Body Data (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call optionsPutCall(OptionsPut body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/options";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call optionsPutValidateBeforeCall(OptionsPut body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling optionsPut(Async)");
        }
        

        com.squareup.okhttp.Call call = optionsPutCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add/Change/Delete options.
     * The PUT operation will add, change or delete values in CloudCluster/Options.
     * @param body Body Data (required)
     * @return OptionsPutResponseStatusSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OptionsPutResponseStatusSuccess optionsPut(OptionsPut body) throws ApiException {
        ApiResponse<OptionsPutResponseStatusSuccess> resp = optionsPutWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add/Change/Delete options.
     * The PUT operation will add, change or delete values in CloudCluster/Options.
     * @param body Body Data (required)
     * @return ApiResponse&lt;OptionsPutResponseStatusSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OptionsPutResponseStatusSuccess> optionsPutWithHttpInfo(OptionsPut body) throws ApiException {
        com.squareup.okhttp.Call call = optionsPutValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<OptionsPutResponseStatusSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add/Change/Delete options. (asynchronously)
     * The PUT operation will add, change or delete values in CloudCluster/Options.
     * @param body Body Data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call optionsPutAsync(OptionsPut body, final ApiCallback<OptionsPutResponseStatusSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = optionsPutValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OptionsPutResponseStatusSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
