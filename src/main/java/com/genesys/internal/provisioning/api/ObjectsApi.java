/*
 * Provisioning API
 * The provisioning service will be used to create objects in configuration server in a way that is consistent with the BEC model. The \"users\" resource will be used to perform CRUD operations on config server person objects. Note that this API will extend the low level configuration server API to add additional functionality that will allow persons to be created in a way that makes them immediately useable in BEC. Operations on this resource may result in other configuration objects being modified as well. 
 *
 * OpenAPI spec version: 9.0.000.65.3913
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
import com.genesys.internal.provisioning.model.GetObjectsSuccessResponse;
import com.genesys.internal.provisioning.model.GetPermissionsSuccessResponse;
import com.genesys.internal.provisioning.model.PostPermissionsData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectsApi {
    private ApiClient apiClient;

    public ObjectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ObjectsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getObject
     * @param objectType The type of object. Possible values are &#x60;dns&#x60;, &#x60;skills&#x60;, &#x60;dn-groups&#x60;, &#x60;access-groups&#x60; or &#x60;agent-groups&#x60;. (required)
     * @param dnType If the **object_type** is &#x60;dns&#x60;, specify the DN type (for example, CFGRoutingPoint). For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param dnGroups If the **object_type** is &#x60;dns&#x60;, specify a list of DN group names to filter DNs. (optional)
     * @param groupType If the **object_type** is &#x60;agent-groups&#x60;, specify the agent group type. (optional)
     * @param limit The number of objects the Provisioning API should return (up to 100). (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term you want to search for in the object keys. The Provisioning API searches for this term in the value of the key you specify in **search_key**.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in **search_term**. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the **search_term**. Possible values are &#x60;includes&#x60;, &#x60;startsWith&#x60;, &#x60;endsWith&#x60;, and &#x60;isEqual&#x60;.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are &#x60;caseSensitive&#x60;, &#x60;caseInsensitive&#x60; or &#x60;numeric&#x60;.  (optional, default to caseSensitive)
     * @param dbids Comma-separated list of DNs to fetch.  (optional)
     * @param inUse Specifies whether to return only skills actually assigned to agents.  (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getObjectCall(String objectType, String dnType, List<String> dnGroups, String groupType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod, String dbids, Boolean inUse, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/objects/{object_type}"
            .replaceAll("\\{" + "object_type" + "\\}", apiClient.escapeString(objectType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (dnType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dn_type", dnType));
        if (dnGroups != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "dn_groups", dnGroups));
        if (groupType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_type", groupType));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (searchTerm != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search_term", searchTerm));
        if (searchKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("search_key", searchKey));
        if (matchMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("match_method", matchMethod));
        if (sortKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_key", sortKey));
        if (sortAscending != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_ascending", sortAscending));
        if (sortMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort_method", sortMethod));
        if (dbids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dbids", dbids));
        if (inUse != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("in_use", inUse));

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
    private com.squareup.okhttp.Call getObjectValidateBeforeCall(String objectType, String dnType, List<String> dnGroups, String groupType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod, String dbids, Boolean inUse, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'objectType' is set
        if (objectType == null) {
            throw new ApiException("Missing the required parameter 'objectType' when calling getObject(Async)");
        }
        

        com.squareup.okhttp.Call call = getObjectCall(objectType, dnType, dnGroups, groupType, limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod, dbids, inUse, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get DNs or agent groups
     * Get DNs (directory numbers) or agent groups from Configuration Server with the specified filters.
     * @param objectType The type of object. Possible values are &#x60;dns&#x60;, &#x60;skills&#x60;, &#x60;dn-groups&#x60;, &#x60;access-groups&#x60; or &#x60;agent-groups&#x60;. (required)
     * @param dnType If the **object_type** is &#x60;dns&#x60;, specify the DN type (for example, CFGRoutingPoint). For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param dnGroups If the **object_type** is &#x60;dns&#x60;, specify a list of DN group names to filter DNs. (optional)
     * @param groupType If the **object_type** is &#x60;agent-groups&#x60;, specify the agent group type. (optional)
     * @param limit The number of objects the Provisioning API should return (up to 100). (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term you want to search for in the object keys. The Provisioning API searches for this term in the value of the key you specify in **search_key**.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in **search_term**. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the **search_term**. Possible values are &#x60;includes&#x60;, &#x60;startsWith&#x60;, &#x60;endsWith&#x60;, and &#x60;isEqual&#x60;.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are &#x60;caseSensitive&#x60;, &#x60;caseInsensitive&#x60; or &#x60;numeric&#x60;.  (optional, default to caseSensitive)
     * @param dbids Comma-separated list of DNs to fetch.  (optional)
     * @param inUse Specifies whether to return only skills actually assigned to agents.  (optional, default to false)
     * @return GetObjectsSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetObjectsSuccessResponse getObject(String objectType, String dnType, List<String> dnGroups, String groupType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod, String dbids, Boolean inUse) throws ApiException {
        ApiResponse<GetObjectsSuccessResponse> resp = getObjectWithHttpInfo(objectType, dnType, dnGroups, groupType, limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod, dbids, inUse);
        return resp.getData();
    }

    /**
     * Get DNs or agent groups
     * Get DNs (directory numbers) or agent groups from Configuration Server with the specified filters.
     * @param objectType The type of object. Possible values are &#x60;dns&#x60;, &#x60;skills&#x60;, &#x60;dn-groups&#x60;, &#x60;access-groups&#x60; or &#x60;agent-groups&#x60;. (required)
     * @param dnType If the **object_type** is &#x60;dns&#x60;, specify the DN type (for example, CFGRoutingPoint). For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param dnGroups If the **object_type** is &#x60;dns&#x60;, specify a list of DN group names to filter DNs. (optional)
     * @param groupType If the **object_type** is &#x60;agent-groups&#x60;, specify the agent group type. (optional)
     * @param limit The number of objects the Provisioning API should return (up to 100). (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term you want to search for in the object keys. The Provisioning API searches for this term in the value of the key you specify in **search_key**.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in **search_term**. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the **search_term**. Possible values are &#x60;includes&#x60;, &#x60;startsWith&#x60;, &#x60;endsWith&#x60;, and &#x60;isEqual&#x60;.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are &#x60;caseSensitive&#x60;, &#x60;caseInsensitive&#x60; or &#x60;numeric&#x60;.  (optional, default to caseSensitive)
     * @param dbids Comma-separated list of DNs to fetch.  (optional)
     * @param inUse Specifies whether to return only skills actually assigned to agents.  (optional, default to false)
     * @return ApiResponse&lt;GetObjectsSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetObjectsSuccessResponse> getObjectWithHttpInfo(String objectType, String dnType, List<String> dnGroups, String groupType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod, String dbids, Boolean inUse) throws ApiException {
        com.squareup.okhttp.Call call = getObjectValidateBeforeCall(objectType, dnType, dnGroups, groupType, limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod, dbids, inUse, null, null);
        Type localVarReturnType = new TypeToken<GetObjectsSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get DNs or agent groups (asynchronously)
     * Get DNs (directory numbers) or agent groups from Configuration Server with the specified filters.
     * @param objectType The type of object. Possible values are &#x60;dns&#x60;, &#x60;skills&#x60;, &#x60;dn-groups&#x60;, &#x60;access-groups&#x60; or &#x60;agent-groups&#x60;. (required)
     * @param dnType If the **object_type** is &#x60;dns&#x60;, specify the DN type (for example, CFGRoutingPoint). For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param dnGroups If the **object_type** is &#x60;dns&#x60;, specify a list of DN group names to filter DNs. (optional)
     * @param groupType If the **object_type** is &#x60;agent-groups&#x60;, specify the agent group type. (optional)
     * @param limit The number of objects the Provisioning API should return (up to 100). (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned objects. (optional)
     * @param searchTerm The term you want to search for in the object keys. The Provisioning API searches for this term in the value of the key you specify in **search_key**.  (optional)
     * @param searchKey The key you want the Provisioning API to use when searching for the term you specified in **search_term**. You can find valid key names in the Platform SDK documentation for [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN) and [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup).  (optional)
     * @param matchMethod The method the Provisioning API should use to match the **search_term**. Possible values are &#x60;includes&#x60;, &#x60;startsWith&#x60;, &#x60;endsWith&#x60;, and &#x60;isEqual&#x60;.  (optional, default to includes)
     * @param sortKey A key in [CfgDN](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDN), [CfgSkill](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgSkill) or [CfgAgentGroup](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgAgentGroup) to sort the search results.  (optional)
     * @param sortAscending Specifies whether to sort the search results in ascending or descending order.  (optional, default to true)
     * @param sortMethod Specifies the sort method. Possible values are &#x60;caseSensitive&#x60;, &#x60;caseInsensitive&#x60; or &#x60;numeric&#x60;.  (optional, default to caseSensitive)
     * @param dbids Comma-separated list of DNs to fetch.  (optional)
     * @param inUse Specifies whether to return only skills actually assigned to agents.  (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getObjectAsync(String objectType, String dnType, List<String> dnGroups, String groupType, Integer limit, Integer offset, String searchTerm, String searchKey, String matchMethod, String sortKey, Boolean sortAscending, String sortMethod, String dbids, Boolean inUse, final ApiCallback<GetObjectsSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getObjectValidateBeforeCall(objectType, dnType, dnGroups, groupType, limit, offset, searchTerm, searchKey, matchMethod, sortKey, sortAscending, sortMethod, dbids, inUse, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetObjectsSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPermissions
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param dbids Comma-separated list of object DBIDs to query permissions.  (required)
     * @param dnType If the object_type is &#39;dns&#39;, then you may specify the DN type (for example, CFGRoutingPoint). This parameter does not affect request results but may increase performance For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param folderType If the object_type is &#39;folders&#39;, then you may specify the object type of the folders  (for example, CFGPerson). This parameter does not affect request results but may increase performance For possible values, see [CfgObjectType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgObjectType) in the Platform SDK documentation.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPermissionsCall(String objectType, String dbids, String dnType, String folderType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/objects/{object_type}/permissions"
            .replaceAll("\\{" + "object_type" + "\\}", apiClient.escapeString(objectType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (dnType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dn_type", dnType));
        if (folderType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("folder_type", folderType));
        if (dbids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dbids", dbids));

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
    private com.squareup.okhttp.Call getPermissionsValidateBeforeCall(String objectType, String dbids, String dnType, String folderType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'objectType' is set
        if (objectType == null) {
            throw new ApiException("Missing the required parameter 'objectType' when calling getPermissions(Async)");
        }
        
        // verify the required parameter 'dbids' is set
        if (dbids == null) {
            throw new ApiException("Missing the required parameter 'dbids' when calling getPermissions(Async)");
        }
        

        com.squareup.okhttp.Call call = getPermissionsCall(objectType, dbids, dnType, folderType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get permissions for a list of objects.
     * Get permissions from Configuration Server for objects identified by their type and DBIDs.
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param dbids Comma-separated list of object DBIDs to query permissions.  (required)
     * @param dnType If the object_type is &#39;dns&#39;, then you may specify the DN type (for example, CFGRoutingPoint). This parameter does not affect request results but may increase performance For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param folderType If the object_type is &#39;folders&#39;, then you may specify the object type of the folders  (for example, CFGPerson). This parameter does not affect request results but may increase performance For possible values, see [CfgObjectType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgObjectType) in the Platform SDK documentation.  (optional)
     * @return GetPermissionsSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPermissionsSuccessResponse getPermissions(String objectType, String dbids, String dnType, String folderType) throws ApiException {
        ApiResponse<GetPermissionsSuccessResponse> resp = getPermissionsWithHttpInfo(objectType, dbids, dnType, folderType);
        return resp.getData();
    }

    /**
     * Get permissions for a list of objects.
     * Get permissions from Configuration Server for objects identified by their type and DBIDs.
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param dbids Comma-separated list of object DBIDs to query permissions.  (required)
     * @param dnType If the object_type is &#39;dns&#39;, then you may specify the DN type (for example, CFGRoutingPoint). This parameter does not affect request results but may increase performance For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param folderType If the object_type is &#39;folders&#39;, then you may specify the object type of the folders  (for example, CFGPerson). This parameter does not affect request results but may increase performance For possible values, see [CfgObjectType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgObjectType) in the Platform SDK documentation.  (optional)
     * @return ApiResponse&lt;GetPermissionsSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPermissionsSuccessResponse> getPermissionsWithHttpInfo(String objectType, String dbids, String dnType, String folderType) throws ApiException {
        com.squareup.okhttp.Call call = getPermissionsValidateBeforeCall(objectType, dbids, dnType, folderType, null, null);
        Type localVarReturnType = new TypeToken<GetPermissionsSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get permissions for a list of objects. (asynchronously)
     * Get permissions from Configuration Server for objects identified by their type and DBIDs.
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param dbids Comma-separated list of object DBIDs to query permissions.  (required)
     * @param dnType If the object_type is &#39;dns&#39;, then you may specify the DN type (for example, CFGRoutingPoint). This parameter does not affect request results but may increase performance For possible values, see [CfgDNType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgDNType) in the Platform SDK documentation.  (optional)
     * @param folderType If the object_type is &#39;folders&#39;, then you may specify the object type of the folders  (for example, CFGPerson). This parameter does not affect request results but may increase performance For possible values, see [CfgObjectType](https://docs.genesys.com/Documentation/PSDK/9.0.x/ConfigLayerRef/CfgObjectType) in the Platform SDK documentation.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPermissionsAsync(String objectType, String dbids, String dnType, String folderType, final ApiCallback<GetPermissionsSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPermissionsValidateBeforeCall(objectType, dbids, dnType, folderType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPermissionsSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPermissionsPost
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPermissionsPostCall(String objectType, PostPermissionsData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/objects/{object_type}/permissions"
            .replaceAll("\\{" + "object_type" + "\\}", apiClient.escapeString(objectType.toString()));

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
    private com.squareup.okhttp.Call getPermissionsPostValidateBeforeCall(String objectType, PostPermissionsData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'objectType' is set
        if (objectType == null) {
            throw new ApiException("Missing the required parameter 'objectType' when calling getPermissionsPost(Async)");
        }
        

        com.squareup.okhttp.Call call = getPermissionsPostCall(objectType, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get permissions for a list of objects.
     * Get permissions from Configuration Server for objects identified by their type and DBIDs.
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param body  (optional)
     * @return GetPermissionsSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetPermissionsSuccessResponse getPermissionsPost(String objectType, PostPermissionsData body) throws ApiException {
        ApiResponse<GetPermissionsSuccessResponse> resp = getPermissionsPostWithHttpInfo(objectType, body);
        return resp.getData();
    }

    /**
     * Get permissions for a list of objects.
     * Get permissions from Configuration Server for objects identified by their type and DBIDs.
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param body  (optional)
     * @return ApiResponse&lt;GetPermissionsSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetPermissionsSuccessResponse> getPermissionsPostWithHttpInfo(String objectType, PostPermissionsData body) throws ApiException {
        com.squareup.okhttp.Call call = getPermissionsPostValidateBeforeCall(objectType, body, null, null);
        Type localVarReturnType = new TypeToken<GetPermissionsSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get permissions for a list of objects. (asynchronously)
     * Get permissions from Configuration Server for objects identified by their type and DBIDs.
     * @param objectType The type of object. Any type supported by the Config server (folders, business-attributes etc). (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPermissionsPostAsync(String objectType, PostPermissionsData body, final ApiCallback<GetPermissionsSuccessResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPermissionsPostValidateBeforeCall(objectType, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetPermissionsSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
