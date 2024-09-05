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
 * Gets or Sets CommodityType
 */
@JsonAdapter(CommodityType.Adapter.class)
public enum CommodityType {
  
  AGRICULTURAL("agricultural"),
  
  ENERGY("energy"),
  
  METAL("metal"),
  
  ALL("all");

  private String value;

  CommodityType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CommodityType fromValue(String value) {
    for (CommodityType b : CommodityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CommodityType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CommodityType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CommodityType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CommodityType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CommodityType.fromValue(value);
  }
}

