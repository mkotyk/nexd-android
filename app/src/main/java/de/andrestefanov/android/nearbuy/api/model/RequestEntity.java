/*
 * Simple API
 * Simple API Description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.andrestefanov.android.nearbuy.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.andrestefanov.android.nearbuy.api.model.RequestArticle;
import de.andrestefanov.android.nearbuy.api.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * RequestEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-23T00:04:05.467759+01:00[Europe/Berlin]")
public class RequestEntity {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Date createdAt;

  public static final String SERIALIZED_NAME_REQUESTER_ID = "requesterId";
  @SerializedName(SERIALIZED_NAME_REQUESTER_ID)
  private Integer requesterId;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_ADDITIONAL_REQUEST = "additionalRequest";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_REQUEST)
  private String additionalRequest;

  public static final String SERIALIZED_NAME_DELIVERY_COMMENT = "deliveryComment";
  @SerializedName(SERIALIZED_NAME_DELIVERY_COMMENT)
  private String deliveryComment;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("new"),

    PENDING("pending"),
    
    ONGOING("ongoing"),
    
    COMPLETED("completed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.PENDING;

  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<RequestArticle> articles = new ArrayList<RequestArticle>();

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  private User requester;


  public RequestEntity street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public RequestEntity number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public RequestEntity zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public RequestEntity city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public RequestEntity id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public RequestEntity createdAt(Date createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public Date getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public RequestEntity requesterId(Integer requesterId) {
    
    this.requesterId = requesterId;
    return this;
  }

   /**
   * Get requesterId
   * @return requesterId
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getRequesterId() {
    return requesterId;
  }


  public void setRequesterId(Integer requesterId) {
    this.requesterId = requesterId;
  }


  public RequestEntity priority(String priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPriority() {
    return priority;
  }


  public void setPriority(String priority) {
    this.priority = priority;
  }


  public RequestEntity additionalRequest(String additionalRequest) {
    
    this.additionalRequest = additionalRequest;
    return this;
  }

   /**
   * Get additionalRequest
   * @return additionalRequest
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAdditionalRequest() {
    return additionalRequest;
  }


  public void setAdditionalRequest(String additionalRequest) {
    this.additionalRequest = additionalRequest;
  }


  public RequestEntity deliveryComment(String deliveryComment) {
    
    this.deliveryComment = deliveryComment;
    return this;
  }

   /**
   * Get deliveryComment
   * @return deliveryComment
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDeliveryComment() {
    return deliveryComment;
  }


  public void setDeliveryComment(String deliveryComment) {
    this.deliveryComment = deliveryComment;
  }


  public RequestEntity phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public RequestEntity status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RequestEntity articles(List<RequestArticle> articles) {
    
    this.articles = articles;
    return this;
  }

  public RequestEntity addArticlesItem(RequestArticle articlesItem) {
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * Get articles
   * @return articles
  **/
  @ApiModelProperty(required = true, value = "")

  public List<RequestArticle> getArticles() {
    return articles;
  }


  public void setArticles(List<RequestArticle> articles) {
    this.articles = articles;
  }


  public RequestEntity requester(User requester) {
    
    this.requester = requester;
    return this;
  }

   /**
   * Get requester
   * @return requester
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getRequester() {
    return requester;
  }


  public void setRequester(User requester) {
    this.requester = requester;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestEntity requestEntity = (RequestEntity) o;
    return Objects.equals(this.street, requestEntity.street) &&
        Objects.equals(this.number, requestEntity.number) &&
        Objects.equals(this.zipCode, requestEntity.zipCode) &&
        Objects.equals(this.city, requestEntity.city) &&
        Objects.equals(this.id, requestEntity.id) &&
        Objects.equals(this.createdAt, requestEntity.createdAt) &&
        Objects.equals(this.requesterId, requestEntity.requesterId) &&
        Objects.equals(this.priority, requestEntity.priority) &&
        Objects.equals(this.additionalRequest, requestEntity.additionalRequest) &&
        Objects.equals(this.deliveryComment, requestEntity.deliveryComment) &&
        Objects.equals(this.phoneNumber, requestEntity.phoneNumber) &&
        Objects.equals(this.status, requestEntity.status) &&
        Objects.equals(this.articles, requestEntity.articles) &&
        Objects.equals(this.requester, requestEntity.requester);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, number, zipCode, city, id, createdAt, requesterId, priority, additionalRequest, deliveryComment, phoneNumber, status, articles, requester);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestEntity {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    requesterId: ").append(toIndentedString(requesterId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    additionalRequest: ").append(toIndentedString(additionalRequest)).append("\n");
    sb.append("    deliveryComment: ").append(toIndentedString(deliveryComment)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

