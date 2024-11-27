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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.tradewatch.client.model.ConversionInfo;
import io.tradewatch.client.model.CryptoConversionQuery;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.tradewatch.client.JSON;

/**
 * CryptoConversion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-27T09:52:25.087567834Z[Etc/UTC]", comments = "Generator version: 7.11.0-SNAPSHOT")
public class CryptoConversion {
  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  @javax.annotation.Nonnull
  private ConversionInfo info;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  @javax.annotation.Nonnull
  private CryptoConversionQuery query;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  @javax.annotation.Nonnull
  private BigDecimal result;

  public CryptoConversion() {
  }

  public CryptoConversion info(@javax.annotation.Nonnull ConversionInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nonnull
  public ConversionInfo getInfo() {
    return info;
  }

  public void setInfo(@javax.annotation.Nonnull ConversionInfo info) {
    this.info = info;
  }


  public CryptoConversion query(@javax.annotation.Nonnull CryptoConversionQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nonnull
  public CryptoConversionQuery getQuery() {
    return query;
  }

  public void setQuery(@javax.annotation.Nonnull CryptoConversionQuery query) {
    this.query = query;
  }


  public CryptoConversion result(@javax.annotation.Nonnull BigDecimal result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nonnull
  public BigDecimal getResult() {
    return result;
  }

  public void setResult(@javax.annotation.Nonnull BigDecimal result) {
    this.result = result;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoConversion cryptoConversion = (CryptoConversion) o;
    return Objects.equals(this.info, cryptoConversion.info) &&
        Objects.equals(this.query, cryptoConversion.query) &&
        Objects.equals(this.result, cryptoConversion.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, query, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoConversion {\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("info");
    openapiFields.add("query");
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("info");
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("result");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CryptoConversion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CryptoConversion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CryptoConversion is not found in the empty JSON string", CryptoConversion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CryptoConversion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CryptoConversion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CryptoConversion.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `info`
      ConversionInfo.validateJsonElement(jsonObj.get("info"));
      // validate the required field `query`
      CryptoConversionQuery.validateJsonElement(jsonObj.get("query"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CryptoConversion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CryptoConversion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CryptoConversion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CryptoConversion.class));

       return (TypeAdapter<T>) new TypeAdapter<CryptoConversion>() {
           @Override
           public void write(JsonWriter out, CryptoConversion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CryptoConversion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CryptoConversion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CryptoConversion
   * @throws IOException if the JSON string is invalid with respect to CryptoConversion
   */
  public static CryptoConversion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CryptoConversion.class);
  }

  /**
   * Convert an instance of CryptoConversion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

