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
import io.tradewatch.client.model.SymbolsOutFull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CursorPageTCustomizedSymbolsOutFull
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-05T21:52:21.707209527Z[Etc/UTC]", comments = "Generator version: 7.9.0-SNAPSHOT")
public class CursorPageTCustomizedSymbolsOutFull {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<SymbolsOutFull> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private String currentPage;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_BACKWARDS = "current_page_backwards";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_BACKWARDS)
  private String currentPageBackwards;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previous_page";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "next_page";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public CursorPageTCustomizedSymbolsOutFull() {
  }

  public CursorPageTCustomizedSymbolsOutFull items(List<SymbolsOutFull> items) {
    this.items = items;
    return this;
  }

  public CursorPageTCustomizedSymbolsOutFull addItemsItem(SymbolsOutFull itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @javax.annotation.Nonnull
  public List<SymbolsOutFull> getItems() {
    return items;
  }

  public void setItems(List<SymbolsOutFull> items) {
    this.items = items;
  }


  public CursorPageTCustomizedSymbolsOutFull total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  public CursorPageTCustomizedSymbolsOutFull currentPage(String currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * Get currentPage
   * @return currentPage
   */
  @javax.annotation.Nullable
  public String getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(String currentPage) {
    this.currentPage = currentPage;
  }


  public CursorPageTCustomizedSymbolsOutFull currentPageBackwards(String currentPageBackwards) {
    this.currentPageBackwards = currentPageBackwards;
    return this;
  }

  /**
   * Get currentPageBackwards
   * @return currentPageBackwards
   */
  @javax.annotation.Nullable
  public String getCurrentPageBackwards() {
    return currentPageBackwards;
  }

  public void setCurrentPageBackwards(String currentPageBackwards) {
    this.currentPageBackwards = currentPageBackwards;
  }


  public CursorPageTCustomizedSymbolsOutFull previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }

  /**
   * Get previousPage
   * @return previousPage
   */
  @javax.annotation.Nullable
  public String getPreviousPage() {
    return previousPage;
  }

  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }


  public CursorPageTCustomizedSymbolsOutFull nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * Get nextPage
   * @return nextPage
   */
  @javax.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorPageTCustomizedSymbolsOutFull cursorPageTCustomizedSymbolsOutFull = (CursorPageTCustomizedSymbolsOutFull) o;
    return Objects.equals(this.items, cursorPageTCustomizedSymbolsOutFull.items) &&
        Objects.equals(this.total, cursorPageTCustomizedSymbolsOutFull.total) &&
        Objects.equals(this.currentPage, cursorPageTCustomizedSymbolsOutFull.currentPage) &&
        Objects.equals(this.currentPageBackwards, cursorPageTCustomizedSymbolsOutFull.currentPageBackwards) &&
        Objects.equals(this.previousPage, cursorPageTCustomizedSymbolsOutFull.previousPage) &&
        Objects.equals(this.nextPage, cursorPageTCustomizedSymbolsOutFull.nextPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total, currentPage, currentPageBackwards, previousPage, nextPage);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorPageTCustomizedSymbolsOutFull {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    currentPageBackwards: ").append(toIndentedString(currentPageBackwards)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("total");
    openapiFields.add("current_page");
    openapiFields.add("current_page_backwards");
    openapiFields.add("previous_page");
    openapiFields.add("next_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("items");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CursorPageTCustomizedSymbolsOutFull
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CursorPageTCustomizedSymbolsOutFull.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CursorPageTCustomizedSymbolsOutFull is not found in the empty JSON string", CursorPageTCustomizedSymbolsOutFull.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CursorPageTCustomizedSymbolsOutFull.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CursorPageTCustomizedSymbolsOutFull` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CursorPageTCustomizedSymbolsOutFull.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        SymbolsOutFull.validateJsonElement(jsonArrayitems.get(i));
      };
      if ((jsonObj.get("current_page") != null && !jsonObj.get("current_page").isJsonNull()) && !jsonObj.get("current_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_page").toString()));
      }
      if ((jsonObj.get("current_page_backwards") != null && !jsonObj.get("current_page_backwards").isJsonNull()) && !jsonObj.get("current_page_backwards").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_page_backwards` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_page_backwards").toString()));
      }
      if ((jsonObj.get("previous_page") != null && !jsonObj.get("previous_page").isJsonNull()) && !jsonObj.get("previous_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_page").toString()));
      }
      if ((jsonObj.get("next_page") != null && !jsonObj.get("next_page").isJsonNull()) && !jsonObj.get("next_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_page").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CursorPageTCustomizedSymbolsOutFull.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CursorPageTCustomizedSymbolsOutFull' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CursorPageTCustomizedSymbolsOutFull> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CursorPageTCustomizedSymbolsOutFull.class));

       return (TypeAdapter<T>) new TypeAdapter<CursorPageTCustomizedSymbolsOutFull>() {
           @Override
           public void write(JsonWriter out, CursorPageTCustomizedSymbolsOutFull value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CursorPageTCustomizedSymbolsOutFull read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CursorPageTCustomizedSymbolsOutFull given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CursorPageTCustomizedSymbolsOutFull
   * @throws IOException if the JSON string is invalid with respect to CursorPageTCustomizedSymbolsOutFull
   */
  public static CursorPageTCustomizedSymbolsOutFull fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CursorPageTCustomizedSymbolsOutFull.class);
  }

  /**
   * Convert an instance of CursorPageTCustomizedSymbolsOutFull to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

