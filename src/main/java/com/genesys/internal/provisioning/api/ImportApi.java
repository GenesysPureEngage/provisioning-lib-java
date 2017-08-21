/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.00.819
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


import com.genesys.internal.provisioning.model.ApiErrorResponse;
import com.genesys.internal.provisioning.model.ApiSuccessResponse;
import java.io.File;
import com.genesys.internal.provisioning.model.GetImportStatusResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportApi {
    private ApiClient apiClient;

    public ImportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getImportStatus
     * @param adminName Admin login. (required)
     * @param tenantName Tenant name. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getImportStatusCall(String adminName, String tenantName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/import-users/check-status";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (adminName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "adminName", adminName));
        if (tenantName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tenantName", tenantName));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getImportStatusValidateBeforeCall(String adminName, String tenantName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'adminName' is set
        if (adminName == null) {
            throw new ApiException("Missing the required parameter 'adminName' when calling getImportStatus(Async)");
        }
        
        // verify the required parameter 'tenantName' is set
        if (tenantName == null) {
            throw new ApiException("Missing the required parameter 'tenantName' when calling getImportStatus(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getImportStatusCall(adminName, tenantName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get import users status
     * The GET operation will get active importers.
     * @param adminName Admin login. (required)
     * @param tenantName Tenant name. (required)
     * @return GetImportStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetImportStatusResponse getImportStatus(String adminName, String tenantName) throws ApiException {
        ApiResponse<GetImportStatusResponse> resp = getImportStatusWithHttpInfo(adminName, tenantName);
        return resp.getData();
    }

    /**
     * Get import users status
     * The GET operation will get active importers.
     * @param adminName Admin login. (required)
     * @param tenantName Tenant name. (required)
     * @return ApiResponse&lt;GetImportStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetImportStatusResponse> getImportStatusWithHttpInfo(String adminName, String tenantName) throws ApiException {
        com.squareup.okhttp.Call call = getImportStatusValidateBeforeCall(adminName, tenantName, null, null);
        Type localVarReturnType = new TypeToken<GetImportStatusResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get import users status (asynchronously)
     * The GET operation will get active importers.
     * @param adminName Admin login. (required)
     * @param tenantName Tenant name. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImportStatusAsync(String adminName, String tenantName, final ApiCallback<GetImportStatusResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getImportStatusValidateBeforeCall(adminName, tenantName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetImportStatusResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for importFile
     * @param csvfile CSV/XLS file to import. (optional)
     * @param validateBeforeImport Validate file before actual import. (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call importFileCall(File csvfile, Boolean validateBeforeImport, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/import-users/csv";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (csvfile != null)
        localVarFormParams.put("csvfile", csvfile);
        if (validateBeforeImport != null)
        localVarFormParams.put("validateBeforeImport", validateBeforeImport);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call importFileValidateBeforeCall(File csvfile, Boolean validateBeforeImport, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = importFileCall(csvfile, validateBeforeImport, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Import file
     * The POST operation will import file.
     * @param csvfile CSV/XLS file to import. (optional)
     * @param validateBeforeImport Validate file before actual import. (optional, default to false)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse importFile(File csvfile, Boolean validateBeforeImport) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = importFileWithHttpInfo(csvfile, validateBeforeImport);
        return resp.getData();
    }

    /**
     * Import file
     * The POST operation will import file.
     * @param csvfile CSV/XLS file to import. (optional)
     * @param validateBeforeImport Validate file before actual import. (optional, default to false)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> importFileWithHttpInfo(File csvfile, Boolean validateBeforeImport) throws ApiException {
        com.squareup.okhttp.Call call = importFileValidateBeforeCall(csvfile, validateBeforeImport, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Import file (asynchronously)
     * The POST operation will import file.
     * @param csvfile CSV/XLS file to import. (optional)
     * @param validateBeforeImport Validate file before actual import. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importFileAsync(File csvfile, Boolean validateBeforeImport, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = importFileValidateBeforeCall(csvfile, validateBeforeImport, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for terminateImport
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call terminateImportCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/import-users/csv";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call terminateImportValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = terminateImportCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Terminate current import operation
     * The DELETE operation will stop current import..,
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse terminateImport() throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = terminateImportWithHttpInfo();
        return resp.getData();
    }

    /**
     * Terminate current import operation
     * The DELETE operation will stop current import..,
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> terminateImportWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = terminateImportValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Terminate current import operation (asynchronously)
     * The DELETE operation will stop current import..,
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call terminateImportAsync(final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = terminateImportValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for validateImportFile
     * @param csvfile CSV/XLS file to import. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call validateImportFileCall(File csvfile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/import-users/validate-csv";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (csvfile != null)
        localVarFormParams.put("csvfile", csvfile);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call validateImportFileValidateBeforeCall(File csvfile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = validateImportFileCall(csvfile, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Perform import file pre-validation
     * The POST operation validate import file.
     * @param csvfile CSV/XLS file to import. (optional)
     * @return ApiSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiSuccessResponse validateImportFile(File csvfile) throws ApiException {
        ApiResponse<ApiSuccessResponse> resp = validateImportFileWithHttpInfo(csvfile);
        return resp.getData();
    }

    /**
     * Perform import file pre-validation
     * The POST operation validate import file.
     * @param csvfile CSV/XLS file to import. (optional)
     * @return ApiResponse&lt;ApiSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiSuccessResponse> validateImportFileWithHttpInfo(File csvfile) throws ApiException {
        com.squareup.okhttp.Call call = validateImportFileValidateBeforeCall(csvfile, null, null);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Perform import file pre-validation (asynchronously)
     * The POST operation validate import file.
     * @param csvfile CSV/XLS file to import. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validateImportFileAsync(File csvfile, final ApiCallback<ApiSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = validateImportFileValidateBeforeCall(csvfile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
