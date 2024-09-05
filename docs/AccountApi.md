# AccountApi

All URIs are relative to *https://api.tradewatch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUsage**](AccountApi.md#getUsage) | **GET** /account/usage | Usage statistics |


<a id="getUsage"></a>
# **getUsage**
> Object getUsage(limit, interval)

Usage statistics

Get the usage statistics of your API account

### Example
```java
// Import classes:
import io.tradewatch.client.ApiClient;
import io.tradewatch.client.ApiException;
import io.tradewatch.client.Configuration;
import io.tradewatch.client.auth.*;
import io.tradewatch.client.models.*;
import io.tradewatch.client.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.tradewatch.io");
    
    // Configure API key authorization: api_key_query
    ApiKeyAuth api_key_query = (ApiKeyAuth) defaultClient.getAuthentication("api_key_query");
    api_key_query.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_query.setApiKeyPrefix("Token");

    // Configure API key authorization: api_key_header
    ApiKeyAuth api_key_header = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header");
    api_key_header.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_header.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Integer limit = 56; // Integer | 
    AccountUsageStatisticsInterval interval = AccountUsageStatisticsInterval.fromValue("1h"); // AccountUsageStatisticsInterval | 
    try {
      Object result = apiInstance.getUsage(limit, interval);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getUsage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] |
| **interval** | [**AccountUsageStatisticsInterval**](.md)|  | [optional] [enum: 1h, 1d] |

### Return type

**Object**

### Authorization

[api_key_query](../README.md#api_key_query), [api_key_header](../README.md#api_key_header)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **422** | Validation error |  -  |

