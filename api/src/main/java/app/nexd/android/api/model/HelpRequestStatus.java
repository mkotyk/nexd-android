/*
 * Nexd API
 * Swagger API description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.nexd.android.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets HelpRequestStatus
 */
@JsonAdapter(HelpRequestStatus.Adapter.class)
public enum HelpRequestStatus {
  
  PENDING("pending"),
  
  ONGOING("ongoing"),
  
  COMPLETED("completed"),
  
  DEACTIVATED("deactivated");

  private String value;

  HelpRequestStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HelpRequestStatus fromValue(String value) {
    for (HelpRequestStatus b : HelpRequestStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<HelpRequestStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final HelpRequestStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HelpRequestStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return HelpRequestStatus.fromValue(value);
    }
  }
}
