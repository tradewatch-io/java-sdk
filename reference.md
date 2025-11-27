# Reference
## account
<details><summary><code>client.account.getUsage() -> Map&amp;lt;String, Object&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the usage statistics of your API account
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.account().getUsage(
    AccountGetUsageRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**limit:** `Optional<Integer>` — The number of data points to return (max 168).
    
</dd>
</dl>

<dl>
<dd>

**interval:** `Optional<AccountUsageStatisticsInterval>` — The time interval for the usage statistics.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## currencies
<details><summary><code>client.currencies.convert(from, to) -> Conversion</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Convert one symbol to another
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencies().convert(
    "EUR",
    "USD",
    CurrenciesConvertRequest
        .builder()
        .amount(1000.0)
        .precision(2)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**from:** `String` — The symbol you want to convert from.
    
</dd>
</dl>

<dl>
<dd>

**to:** `String` — The symbol you want to convert to.
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional<Double>` — The amount to be converted.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencies.getQuotes() -> LastQuotes</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbols.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencies().getQuotes(
    CurrenciesGetQuotesRequest
        .builder()
        .symbols("symbols")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `String` — Comma separated list of symbols.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencies.getQuote() -> LastQuote</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbol.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencies().getQuote(
    CurrenciesGetQuoteRequest
        .builder()
        .symbol("EUR-USD")
        .precision(4)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` — The symbol to get the quote for.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencies.getSymbols() -> CursorPageTCustomizedSymbolsOutFull</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available symbols
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencies().getSymbols(
    CurrenciesGetSymbolsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>

<dl>
<dd>

**mode:** `Optional<String>` — The mode of the response.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — Type of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencies.getInsights() -> CursorPageTCustomizedNewsOut</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get recent currencies insights.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencies().getInsights(
    CurrenciesGetInsightsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## crypto
<details><summary><code>client.crypto.convert(from, to) -> CryptoConversion</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Convert one symbol to another
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.crypto().convert(
    "from",
    "to",
    CryptoConvertRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**from:** `String` — The symbol you want to convert from.
    
</dd>
</dl>

<dl>
<dd>

**to:** `String` — The symbol you want to convert to.
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional<Double>` — The amount to be converted.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.crypto.getExchanges() -> CryptoExchangesList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available cryptocurrency exchanges
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.crypto().getExchanges();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.crypto.getQuotes() -> LastQuotes</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbols.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.crypto().getQuotes(
    CryptoGetQuotesRequest
        .builder()
        .symbols("BTC-USD,ETH-USD")
        .precision(2)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `String` — Comma separated list of symbols.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.crypto.getQuote() -> LastQuote</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbol.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.crypto().getQuote(
    CryptoGetQuoteRequest
        .builder()
        .symbol("BTC-USD")
        .precision(2)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` — The symbol to get the quote for.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.crypto.getSymbols() -> CursorPageTCustomizedSymbolsOutFull</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available symbols
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.crypto().getSymbols(
    CryptoGetSymbolsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>

<dl>
<dd>

**mode:** `Optional<String>` — The mode of the response.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — Type of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.crypto.getInsights() -> CursorPageTCustomizedNewsOut</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get recent crypto insights.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.crypto().getInsights(
    CryptoGetInsightsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## indices
<details><summary><code>client.indices.getQuotes() -> LastQuotes</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbols.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.indices().getQuotes(
    IndicesGetQuotesRequest
        .builder()
        .symbols("symbols")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `String` — Comma separated list of symbols.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.indices.getQuote() -> LastQuote</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbol.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.indices().getQuote(
    IndicesGetQuoteRequest
        .builder()
        .symbol("DJI")
        .precision(2)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` — The symbol to get the quote for.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.indices.getSymbols() -> CursorPageTCustomizedSymbolsOutFull</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available symbols
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.indices().getSymbols(
    IndicesGetSymbolsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>

<dl>
<dd>

**mode:** `Optional<String>` — The mode of the response.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — Type of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.indices.getInsights() -> CursorPageTCustomizedNewsOut</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get recent indices insights.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.indices().getInsights(
    IndicesGetInsightsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## stocks
<details><summary><code>client.stocks.getQuotes() -> LastQuotes</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbols.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getQuotes(
    StocksGetQuotesRequest
        .builder()
        .symbols("symbols")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `String` — Comma separated list of symbols.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getQuote() -> LastQuote</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbol.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getQuote(
    StocksGetQuoteRequest
        .builder()
        .symbol("symbol")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` — The symbol to get the quote for.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getSymbols() -> CursorPageTCustomizedSymbolsOutFullStocks</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available symbols
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getSymbols(
    StocksGetSymbolsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>

<dl>
<dd>

**mode:** `Optional<String>` — The mode of the response.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — Type of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getInsights() -> CursorPageTCustomizedNewsOut</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get recent stocks insights.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getInsights(
    StocksGetInsightsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.stockGetCountries() -> CountriesList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available countries
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().stockGetCountries();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getMarkets() -> List&amp;lt;MarketResponse&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get details about the markets available in this API.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getMarkets(
    StocksGetMarketsRequest
        .builder()
        .mic("XNYS")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**mic:** `Optional<String>` — Optional list of comma separated MIC codes for which market to show data for. All market will be included if MIC code is not specified.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getMarketStatus() -> List&amp;lt;MarketStatusResponse&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the current status (open or closed) of a market. It takes holidays and half-days into account but does not factor in circuit breakers or halts.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getMarketStatus(
    StocksGetMarketStatusRequest
        .builder()
        .mic("XNYS")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**mic:** `Optional<String>` — Optional list of comma separated MIC codes for which market to show data for. All market will be included if MIC code is not specified.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getTradingHours() -> List&amp;lt;TradingHoursResponse&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get trading hours. It takes half-days into account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getTradingHours(
    StocksGetTradingHoursRequest
        .builder()
        .start("2025-01-01")
        .end("2025-01-31")
        .mic("XNAS")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**mic:** `Optional<String>` — Optional list of comma separated MIC codes for which market to show data for. All market will be included if MIC code is not specified.
    
</dd>
</dl>

<dl>
<dd>

**start:** `String` — Show holidays starting at this date.
    
</dd>
</dl>

<dl>
<dd>

**end:** `String` — Show holidays until this date.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getMarketHolidays() -> List&amp;lt;MarketHolidayResponse&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get market holidays. It takes half-days into account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getMarketHolidays(
    StocksGetMarketHolidaysRequest
        .builder()
        .start("2026-02-17")
        .end("2026-02-24")
        .mic("XNYS")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**mic:** `Optional<String>` — Specify comma separated list of MIC codes for which market to show data for.
    
</dd>
</dl>

<dl>
<dd>

**start:** `String` — Show holidays starting at this date.
    
</dd>
</dl>

<dl>
<dd>

**end:** `String` — Show holidays until this date.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getStockData(symbol) -> StockDataFlatResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getStockData(
    "AAPL",
    StocksGetStockDataRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getHistoricalOhlc(symbol) -> HistoricalOhlcResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get historical OHLC candles for a symbol in a selected resolution and time range.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getHistoricalOhlc(
    "symbol",
    StocksGetHistoricalOhlcRequest
        .builder()
        .resolution(HistoricalDataResolution.VALUE5)
        .start(1)
        .end(1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `HistoricalDataResolution` — Resolution in seconds.
    
</dd>
</dl>

<dl>
<dd>

**start:** `Integer` — Unix timestamp (inclusive).
    
</dd>
</dl>

<dl>
<dd>

**end:** `Integer` — Unix timestamp (exclusive).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.stocks.getHistoricalTicks(symbol) -> CursorPageTCustomizedHistoricalRawTick</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get raw historical ticks for a symbol in a selected time range using cursor pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.stocks().getHistoricalTicks(
    "symbol",
    StocksGetHistoricalTicksRequest
        .builder()
        .start(1)
        .end(1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Integer` — Unix timestamp (inclusive).
    
</dd>
</dl>

<dl>
<dd>

**end:** `Integer` — Unix timestamp (exclusive).
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — The number of ticks per page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## commodities
<details><summary><code>client.commodities.getQuotes() -> LastQuotes</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbols.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodities().getQuotes(
    CommoditiesGetQuotesRequest
        .builder()
        .symbols("symbols")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `String` — Comma separated list of symbols.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodities.getQuote() -> LastQuote</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the last quote tick for the provided symbol.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodities().getQuote(
    CommoditiesGetQuoteRequest
        .builder()
        .symbol("GOLD")
        .precision(2)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbol:** `String` — The symbol to get the quote for.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<Integer>` — The decimal precision of the result.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodities.getSymbols() -> CursorPageTCustomizedSymbolsOutFull</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available symbols
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodities().getSymbols(
    CommoditiesGetSymbolsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>

<dl>
<dd>

**mode:** `Optional<String>` — The mode of the response.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — Type of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country of the instrument.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodities.getInsights() -> CursorPageTCustomizedNewsOut</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get recent commodities insights.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodities().getInsights(
    CommoditiesGetInsightsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for the next page
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` — The number of items per page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodities.getTypes() -> CommodityTypesList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of available commodity types
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodities().getTypes();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
