/*
 * tradewatch.io
 * Financial market data for Developers
 *
 * The version of the OpenAPI document: 3.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tradewatch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Data interval
 */
@JsonAdapter(AccountUsageStatisticsInterval.Adapter.class)
public enum AccountUsageStatisticsInterval {
  
  _1H("1h"),
  
  _1D("1d");

  private String value;

  AccountUsageStatisticsInterval(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountUsageStatisticsInterval fromValue(String value) {
    for (AccountUsageStatisticsInterval b : AccountUsageStatisticsInterval.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AccountUsageStatisticsInterval> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountUsageStatisticsInterval enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountUsageStatisticsInterval read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountUsageStatisticsInterval.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AccountUsageStatisticsInterval.fromValue(value);
  }
}
