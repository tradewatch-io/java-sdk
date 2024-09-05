# CurrenciesApi

All URIs are relative to *https://api.tradewatch.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convert**](CurrenciesApi.md#convert) | **GET** /currencies/convert/{from}/{to} | Conversion |
| [**getQuote**](CurrenciesApi.md#getQuote) | **GET** /currencies/symbols/{symbol} | Last Quote |
| [**getSymbols**](CurrenciesApi.md#getSymbols) | **GET** /currencies/symbols | Available Symbols |


<a id="convert"></a>
# **convert**
> Conversion convert(from, to)

Conversion

Convert one symbol to another

### Example
```java
// Import classes:
import io.tradewatch.client.ApiClient;
import io.tradewatch.client.ApiException;
import io.tradewatch.client.Configuration;
import io.tradewatch.client.auth.*;
import io.tradewatch.client.models.*;
import io.tradewatch.client.api.CurrenciesApi;

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

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String from = "from_example"; // String | 
    String to = "to_example"; // String | 
    try {
      Conversion result = apiInstance.convert(from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#convert");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

### Return type

[**Conversion**](Conversion.md)

### Authorization

[api_key_query](../README.md#api_key_query), [api_key_header](../README.md#api_key_header)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getQuote"></a>
# **getQuote**
> LastQuote getQuote(symbol, precision)

Last Quote

Get the last quote tick for the provided symbol.

### Example
```java
// Import classes:
import io.tradewatch.client.ApiClient;
import io.tradewatch.client.ApiException;
import io.tradewatch.client.Configuration;
import io.tradewatch.client.auth.*;
import io.tradewatch.client.models.*;
import io.tradewatch.client.api.CurrenciesApi;

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

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    String symbol = "symbol_example"; // String | 
    Integer precision = 5; // Integer | 
    try {
      LastQuote result = apiInstance.getQuote(symbol, precision);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#getQuote");
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
| **symbol** | **String**|  | |
| **precision** | **Integer**|  | [optional] [default to 5] |

### Return type

[**LastQuote**](LastQuote.md)

### Authorization

[api_key_query](../README.md#api_key_query), [api_key_header](../README.md#api_key_header)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getSymbols"></a>
# **getSymbols**
> CursorPageTCustomizedSymbolsOutFull getSymbols(mode, size, page, cursor)

Available Symbols

Get list of available symbols

### Example
```java
// Import classes:
import io.tradewatch.client.ApiClient;
import io.tradewatch.client.ApiException;
import io.tradewatch.client.Configuration;
import io.tradewatch.client.auth.*;
import io.tradewatch.client.models.*;
import io.tradewatch.client.api.CurrenciesApi;

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

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    SymbolsListMode mode = SymbolsListMode.fromValue("full"); // SymbolsListMode | Listing mode
    Integer size = 50; // Integer | Page offset
    Integer page = 1; // Integer | Page number
    String cursor = "cursor_example"; // String | Cursor for the next page
    try {
      CursorPageTCustomizedSymbolsOutFull result = apiInstance.getSymbols(mode, size, page, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#getSymbols");
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
| **mode** | [**SymbolsListMode**](.md)| Listing mode | [enum: full, base] |
| **size** | **Integer**| Page offset | [optional] [default to 50] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **cursor** | **String**| Cursor for the next page | [optional] |

### Return type

[**CursorPageTCustomizedSymbolsOutFull**](CursorPageTCustomizedSymbolsOutFull.md)

### Authorization

[api_key_query](../README.md#api_key_query), [api_key_header](../README.md#api_key_header)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

