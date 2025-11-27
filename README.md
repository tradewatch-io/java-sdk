# TradeWatch.io Java SDK

![](https://tradewatch.io/)


<a href="https://tradewatch.io/">
  <img src="https://pub-e8bb70a6cc1844138d6a55fa4a44ba42.r2.dev/logo-purple.png" alt="TradeWatch.io logo" title="TradeWatch.io" align="right" height="60" />
</a>

Official SDK for the [TradeWatch.io API](https://tradewatch.io/docs/api-reference/introduction).

## Other SDKs
[![Python SDK](https://img.shields.io/badge/Python_SDK-3776AB?style=flat-square&logo=python&logoColor=white)](https://github.com/tradewatch-io/python-sdk)
[![TypeScript SDK](https://img.shields.io/badge/TypeScript_SDK-3178C6?style=flat-square&logo=typescript&logoColor=white)](https://github.com/tradewatch-io/typescript-sdk)
[![.NET SDK](https://img.shields.io/badge/.NET_SDK-512BD4?style=flat-square&logo=dotnet&logoColor=white)](https://github.com/tradewatch-io/dotnet-sdk)
[![PHP SDK](https://img.shields.io/badge/PHP_SDK-777BB4?style=flat-square&logo=php&logoColor=white)](https://github.com/tradewatch-io/php-sdk)
[![Go SDK](https://img.shields.io/badge/Go_SDK-00ADD8?style=flat-square&logo=go&logoColor=white)](https://github.com/tradewatch-io/go-sdk)
[![Ruby SDK](https://img.shields.io/badge/Ruby_SDK-CC342D?style=flat-square&logo=ruby&logoColor=white)](https://github.com/tradewatch-io/ruby-sdk)
[![Swift SDK](https://img.shields.io/badge/Swift_SDK-FA7343?style=flat-square&logo=swift&logoColor=white)](https://github.com/tradewatch-io/swift-sdk)
[![Rust SDK](https://img.shields.io/badge/Rust_SDK-000000?style=flat-square&logo=rust&logoColor=white)](https://github.com/tradewatch-io/rust-sdk)
## What is TradeWatch.io?
TradeWatch.io is a market data platform and API for real-time and historical prices across crypto, stocks, indices, currencies, and commodities.

## Try the Interactive API Playground
Want to test endpoints without writing code first? Use the [TradeWatch Interactive API Playground](https://dash.tradewatch.io/api-explorer) to run requests directly in your browser.

[![TradeWatch Interactive API Playground](https://tradewatch.io/api-playground.png)](https://dash.tradewatch.io/api-explorer)

## Resources

- REST API reference: [https://tradewatch.io/docs/api-reference/introduction](https://tradewatch.io/docs/api-reference/introduction)
- WebSocket API reference: [https://tradewatch.io/docs/websocket-api/introduction](https://tradewatch.io/docs/websocket-api/introduction)
- Support channels: [https://tradewatch.io/docs/platform/support](https://tradewatch.io/docs/platform/support)

## Quick Start
1. Create an API key in the [TradeWatch Dashboard](https://dash.tradewatch.io/register).
2. Follow platform setup docs: [Getting started](https://tradewatch.io/docs/quickstart).


## Table of Contents

- [Documentation](#documentation)
- [Reference](#reference)
- [Usage](#usage)
- [Environments](#environments)
- [Base Url](#base-url)
- [Exception Handling](#exception-handling)
- [Advanced](#advanced)
  - [Custom Client](#custom-client)
  - [Retries](#retries)
  - [Timeouts](#timeouts)
  - [Custom Headers](#custom-headers)
  - [Access Raw Response Data](#access-raw-response-data)

## Documentation

API reference documentation is available [here](https://tradewatch.io/docs/api-reference/introduction).

## Reference

A full reference for this library is available [here](./reference.md).

## Usage

Instantiate and use the client with the following:

```java
package com.example.usage;

import io.tradewatch.client.TradewatchApiClient;
import io.tradewatch.client.resources.crypto.requests.CryptoGetQuoteRequest;

public class Example {
    public static void main(String[] args) {
        TradewatchApiClient client = TradewatchApiClient
            .builder()
            .apiKey("<value>")
            .build();

        client.crypto().getQuote(
            CryptoGetQuoteRequest
                .builder()
                .symbol("BTC-USD")
                .precision(2)
                .build()
        );
    }
}
```

## Environments

This SDK allows you to configure different environments for API requests.

```java
import io.tradewatch.client.TradewatchApiClient;
import io.tradewatch.client.core.Environment;

TradewatchApiClient client = TradewatchApiClient
    .builder()
    .environment(Environment.Default)
    .build();
```

## Base Url

You can set a custom base URL when constructing the client.

```java
import io.tradewatch.client.TradewatchApiClient;

TradewatchApiClient client = TradewatchApiClient
    .builder()
    .url("https://example.com")
    .build();
```

## Exception Handling

When the API returns a non-success status code (4xx or 5xx response), an API exception will be thrown.

```java
import io.tradewatch.client.core.TradewatchApiApiException;

try{
    client.crypto().getQuote(...);
} catch (TradewatchApiApiException e){
    // Do something with the API exception...
}
```

## Advanced

### Custom Client

This SDK is built to work with any instance of `OkHttpClient`. By default, if no client is provided, the SDK will construct one.
However, you can pass your own client like so:

```java
import io.tradewatch.client.TradewatchApiClient;
import okhttp3.OkHttpClient;

OkHttpClient customClient = ...;

TradewatchApiClient client = TradewatchApiClient
    .builder()
    .httpClient(customClient)
    .build();
```

### Retries

The SDK is instrumented with automatic retries with exponential backoff. A request will be retried as long
as the request is deemed retryable and the number of retry attempts has not grown larger than the configured
retry limit (default: 2). Before defaulting to exponential backoff, the SDK will first attempt to respect
the `Retry-After` header (as either in seconds or as an HTTP date), and then the `X-RateLimit-Reset` header
(as a Unix timestamp in epoch seconds); failing both of those, it will fall back to exponential backoff.

A request is deemed retryable when any of the following HTTP status codes is returned:

- [408](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/408) (Timeout)
- [429](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429) (Too Many Requests)
- [5XX](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/500) (Internal Server Errors)

Use the `maxRetries` client option to configure this behavior.

```java
import io.tradewatch.client.TradewatchApiClient;

TradewatchApiClient client = TradewatchApiClient
    .builder()
    .maxRetries(1)
    .build();
```

### Timeouts

The SDK defaults to a 60 second timeout. You can configure this with a timeout option at the client or request level.
```java
import io.tradewatch.client.TradewatchApiClient;
import io.tradewatch.client.core.RequestOptions;

// Client level
TradewatchApiClient client = TradewatchApiClient
    .builder()
    .timeout(60)
    .build();

// Request level
client.crypto().getQuote(
    ...,
    RequestOptions
        .builder()
        .timeout(60)
        .build()
);
```

### Custom Headers

The SDK allows you to add custom headers to requests. You can configure headers at the client level or at the request level.

```java
import io.tradewatch.client.TradewatchApiClient;
import io.tradewatch.client.core.RequestOptions;

// Client level
TradewatchApiClient client = TradewatchApiClient
    .builder()
    .addHeader("X-Custom-Header", "custom-value")
    .addHeader("X-Request-Id", "abc-123")
    .build();
;

// Request level
client.crypto().getQuote(
    ...,
    RequestOptions
        .builder()
        .addHeader("X-Request-Header", "request-value")
        .build()
);
```

### Access Raw Response Data

The SDK provides access to raw response data, including headers, through the `withRawResponse()` method.
The `withRawResponse()` method returns a raw client that wraps all responses with `body()` and `headers()` methods.
(A normal client's `response` is identical to a raw client's `response.body()`.)

```java
GetQuoteHttpResponse response = client.crypto().withRawResponse().getQuote(...);

System.out.println(response.body());
System.out.println(response.headers().get("X-My-Header"));
```

## Available Methods

### `account`

| Method | Required Params | Summary | Description |
| --- | --- | --- | --- |
| [`getUsage()`](https://tradewatch.io/docs/api-reference/account/usage-statistics) | - | Usage statistics | Get the usage statistics of your API account |

### `currencies`

| Method | Required Params | Summary | Description |
| --- | --- | --- | --- |
| [`convert(from, to)`](https://tradewatch.io/docs/api-reference/currencies/conversion) | from, to | Conversion | Convert one symbol to another |
| [`getInsights()`](https://tradewatch.io/docs/api-reference/currencies/get-insights) | - | Get Insights | Get recent currencies insights. |
| [`getQuote(symbol)`](https://tradewatch.io/docs/api-reference/currencies/last-quote) | symbol | Last Quote | Get the last quote tick for the provided symbol. |
| [`getQuotes(symbols)`](https://tradewatch.io/docs/api-reference/currencies/last-quotes) | symbols | Last Quotes | Get the last quote tick for the provided symbols. |
| [`getSymbols()`](https://tradewatch.io/docs/api-reference/currencies/available-symbols) | - | Available Symbols | Get list of available symbols |

### `crypto`

| Method | Required Params | Summary | Description |
| --- | --- | --- | --- |
| [`convert(from, to)`](https://tradewatch.io/docs/api-reference/crypto/conversion) | from, to | Conversion | Convert one symbol to another |
| [`getExchanges()`](https://tradewatch.io/docs/api-reference/crypto/available-exchanges) | - | Available Exchanges | Get list of available cryptocurrency exchanges |
| [`getInsights()`](https://tradewatch.io/docs/api-reference/crypto/get-insights) | - | Get Insights | Get recent crypto insights. |
| [`getQuote(symbol)`](https://tradewatch.io/docs/api-reference/crypto/last-quote) | symbol | Last Quote | Get the last quote tick for the provided symbol. |
| [`getQuotes(symbols)`](https://tradewatch.io/docs/api-reference/crypto/last-quotes) | symbols | Last Quotes | Get the last quote tick for the provided symbols. |
| [`getSymbols()`](https://tradewatch.io/docs/api-reference/crypto/available-symbols) | - | Available Symbols | Get list of available symbols |

### `indices`

| Method | Required Params | Summary | Description |
| --- | --- | --- | --- |
| [`getInsights()`](https://tradewatch.io/docs/api-reference/indices/get-insights) | - | Get Insights | Get recent indices insights. |
| [`getQuote(symbol)`](https://tradewatch.io/docs/api-reference/indices/last-quote) | symbol | Last Quote | Get the last quote tick for the provided symbol. |
| [`getQuotes(symbols)`](https://tradewatch.io/docs/api-reference/indices/last-quotes) | symbols | Last Quotes | Get the last quote tick for the provided symbols. |
| [`getSymbols()`](https://tradewatch.io/docs/api-reference/indices/available-symbols) | - | Available Symbols | Get list of available symbols |

### `stocks`

| Method | Required Params | Summary | Description |
| --- | --- | --- | --- |
| [`getHistoricalOhlc(symbol, resolution, start, end)`](https://tradewatch.io/docs/api-reference/stocks/get-historical-ohlc) | symbol, resolution, start, end | Get Historical Ohlc | Get historical OHLC candles for a symbol in a selected resolution and time range. |
| [`getHistoricalTicks(symbol, start, end)`](https://tradewatch.io/docs/api-reference/stocks/get-historical-ticks) | symbol, start, end | Get Historical Ticks | Get raw historical ticks for a symbol in a selected time range using cursor pagination. |
| [`getInsights()`](https://tradewatch.io/docs/api-reference/stocks/get-insights) | - | Get Insights | Get recent stocks insights. |
| [`getMarketHolidays(start, end)`](https://tradewatch.io/docs/api-reference/stocks/get-market-holidays) | start, end | Get Market Holidays | Get market holidays. It takes half-days into account. |
| [`getMarketStatus()`](https://tradewatch.io/docs/api-reference/stocks/get-market-status) | - | Get Market Status | Get the current status (open or closed) of a market. It takes holidays and half-days into account but does not factor in circuit breakers or halts. |
| [`getMarkets()`](https://tradewatch.io/docs/api-reference/stocks/get-markets) | - | Get Markets | Get details about the markets available in this API. |
| [`getQuote(symbol)`](https://tradewatch.io/docs/api-reference/stocks/last-quote) | symbol | Last Quote | Get the last quote tick for the provided symbol. |
| [`getQuotes(symbols)`](https://tradewatch.io/docs/api-reference/stocks/last-quotes) | symbols | Last Quotes | Get the last quote tick for the provided symbols. |
| [`getStockData(symbol)`](https://tradewatch.io/docs/api-reference/stocks/get-stock-data) | symbol | Get Stock Data | Get Stock Data |
| [`getSymbols()`](https://tradewatch.io/docs/api-reference/stocks/available-symbols) | - | Available Symbols | Get list of available symbols |
| [`getTradingHours(start, end)`](https://tradewatch.io/docs/api-reference/stocks/get-trading-hours) | start, end | Get Trading Hours | Get trading hours. It takes half-days into account. |
| [`stockGetCountries()`](https://tradewatch.io/docs/api-reference/stocks/available-countries) | - | Available Countries | Get list of available countries |

### `commodities`

| Method | Required Params | Summary | Description |
| --- | --- | --- | --- |
| [`getInsights()`](https://tradewatch.io/docs/api-reference/commodities/get-insights) | - | Get Insights | Get recent commodities insights. |
| [`getQuote(symbol)`](https://tradewatch.io/docs/api-reference/commodities/last-quote) | symbol | Last Quote | Get the last quote tick for the provided symbol. |
| [`getQuotes(symbols)`](https://tradewatch.io/docs/api-reference/commodities/last-quotes) | symbols | Last Quotes | Get the last quote tick for the provided symbols. |
| [`getSymbols()`](https://tradewatch.io/docs/api-reference/commodities/available-symbols) | - | Available Symbols | Get list of available symbols |
| [`getTypes()`](https://tradewatch.io/docs/api-reference/commodities/available-types) | - | Available Types | Get list of available commodity types |
