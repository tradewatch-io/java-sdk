<a href="https://tradewatch.io/">
  <img src="https://pub-e8bb70a6cc1844138d6a55fa4a44ba42.r2.dev/logo-purple.png" alt="TradeWatch.io logo" title="TradeWatch.io" align="right" height="60" />
</a>

# TradeWatch.io Java SDK

[TradeWatch.io](https://tradewatch.io) offers a comprehensive financial data API designed for developers and businesses. The platform provides real-time access to market data, covering a wide range of assets such as currencies, cryptocurrencies, stocks, indices, and commodities. It emphasizes seamless integration, reliability, and scalability, making it ideal for building financial tools and services. Additional features include serverless functions, customizable API domains, and webhook notifications for market events, all aimed at enhancing business efficiency and informed decision-making.

## Table of Contents
- [Quick start](#-quick-start)
- [Requirements](#-requirements)
- [Installation & usage](#-installation--usage)
- [Authorization](#-authorization)
- [Tests](#-tests)
- [Feedback and Contributions](#-feedback-and-contributions)
- [License](#-license)
- [Contact and Support](#-contact-and-support)

## 🚀 Quick start

Visit our [Dashboard](https://dash.tradewatch.io/register) and register a free account.

Follow the [Getting started](https://tradewatch.io/docs/platform/getting-started) section in our Developer Portal.

## 📝 Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## 🔨 Installation & usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>3.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:3.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-3.1.0.jar`
- `target/lib/*.jar`

## 👨‍💻 Example

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.tradewatch.client.*;
import io.tradewatch.client.auth.*;
import io.tradewatch.client.model.*;
import io.tradewatch.client.api.AccountApi;

public class AccountApiExample {

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

## 📖 Available methods

All URIs are relative to *https://api.tradewatch.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**getUsage**](docs/AccountApi.md#getUsage) | **GET** /account/usage | Usage statistics
*CommoditiesApi* | [**getQuote**](docs/CommoditiesApi.md#getQuote) | **GET** /commodities/symbols/{symbol} | Last Quote
*CommoditiesApi* | [**getSymbols**](docs/CommoditiesApi.md#getSymbols) | **GET** /commodities/symbols | Available Symbols
*CommoditiesApi* | [**getTypes**](docs/CommoditiesApi.md#getTypes) | **GET** /commodities/types | Available Types
*CryptoApi* | [**convert**](docs/CryptoApi.md#convert) | **GET** /crypto/convert/{from}/{to} | Conversion
*CryptoApi* | [**cryptoGetExchanges**](docs/CryptoApi.md#cryptoGetExchanges) | **GET** /crypto/exchanges | Available Exchanges
*CryptoApi* | [**getQuote**](docs/CryptoApi.md#getQuote) | **GET** /crypto/symbols/{symbol} | Last Quote
*CryptoApi* | [**getSymbols**](docs/CryptoApi.md#getSymbols) | **GET** /crypto/symbols | Available Symbols
*CurrenciesApi* | [**convert**](docs/CurrenciesApi.md#convert) | **GET** /currencies/convert/{from}/{to} | Conversion
*CurrenciesApi* | [**getQuote**](docs/CurrenciesApi.md#getQuote) | **GET** /currencies/symbols/{symbol} | Last Quote
*CurrenciesApi* | [**getSymbols**](docs/CurrenciesApi.md#getSymbols) | **GET** /currencies/symbols | Available Symbols
*IndicesApi* | [**getQuote**](docs/IndicesApi.md#getQuote) | **GET** /indices/symbols/{symbol} | Last Quote
*IndicesApi* | [**getSymbols**](docs/IndicesApi.md#getSymbols) | **GET** /indices/symbols | Available Symbols
*StocksApi* | [**getCountries**](docs/StocksApi.md#getCountries) | **GET** /stocks/countries | Available Countries
*StocksApi* | [**getQuote**](docs/StocksApi.md#getQuote) | **GET** /stocks/symbols/{symbol} | Last Quote
*StocksApi* | [**getSymbols**](docs/StocksApi.md#getSymbols) | **GET** /stocks/symbols | Available Symbols


## 📖 Available models

 - [AccountUsageStatisticsInterval](docs/AccountUsageStatisticsInterval.md)
 - [ApiUsageDataTransfer](docs/ApiUsageDataTransfer.md)
 - [ApiUsageEntry](docs/ApiUsageEntry.md)
 - [CommodityType](docs/CommodityType.md)
 - [CommodityTypeObj](docs/CommodityTypeObj.md)
 - [CommodityTypesList](docs/CommodityTypesList.md)
 - [Conversion](docs/Conversion.md)
 - [ConversionInfo](docs/ConversionInfo.md)
 - [ConversionQuery](docs/ConversionQuery.md)
 - [CountriesList](docs/CountriesList.md)
 - [Country](docs/Country.md)
 - [CountryObj](docs/CountryObj.md)
 - [CryptoConversion](docs/CryptoConversion.md)
 - [CryptoConversionQuery](docs/CryptoConversionQuery.md)
 - [CryptoExchangeItem](docs/CryptoExchangeItem.md)
 - [CryptoExchangesList](docs/CryptoExchangesList.md)
 - [CursorPageTCustomizedSymbolsOutFull](docs/CursorPageTCustomizedSymbolsOutFull.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorResponseBody](docs/ErrorResponseBody.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [LastQuote](docs/LastQuote.md)
 - [SymbolsListMode](docs/SymbolsListMode.md)
 - [SymbolsOutFull](docs/SymbolsOutFull.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorLocInner](docs/ValidationErrorLocInner.md)


## 🔑 Authorization


Authentication schemes defined for the API:
<a id="api_key_header"></a>
### api_key_header


- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header

<a id="api_key_query"></a>
### api_key_query


- **Type**: API key
- **API key parameter name**: api-key
- **Location**: URL query string


> [!NOTE]  
> It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## 🤝 Feedback and Contributions

We appreciate your support and look forward to making our product even better with your help!

## ©️ License

This project is licensed under the [MIT License](http://opensource.org/licenses/MIT).

## 🗨️ Contact and Support

For more details about our products, services, or any general information, feel free to reach out to us.

See the list of available [Support Channels](https://tradewatch.io/docs/support/channels).
