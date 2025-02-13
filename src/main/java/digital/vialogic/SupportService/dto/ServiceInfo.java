/*
 * Support Service
 * This is a Support service API definition. The API is used for support purpose 
 *
 * The version of the OpenAPI document: 2.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package digital.vialogic.SupportService.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * ServiceInfo
 */
@lombok.Builder @lombok.AllArgsConstructor
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IAM = "iam";
  @SerializedName(SERIALIZED_NAME_IAM)
  private String iam;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId;

  public static final String SERIALIZED_NAME_ACCOUNT_PROVIDER_ID = "accountProviderId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PROVIDER_ID)
  private String accountProviderId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private String countryId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private String origin;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private String activity;

  public static final String SERIALIZED_NAME_PARTY_TYPE = "partyType";
  @SerializedName(SERIALIZED_NAME_PARTY_TYPE)
  private String partyType;

  public ServiceInfo() { 
  }

  public ServiceInfo iam(String iam) {
    
    this.iam = iam;
    return this;
  }

   /**
   * Get iam
   * @return iam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wso2", value = "")

  public String getIam() {
    return iam;
  }


  public void setIam(String iam) {
    this.iam = iam;
  }


  public ServiceInfo channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DDDDD", value = "")

  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public ServiceInfo accountProviderId(String accountProviderId) {
    
    this.accountProviderId = accountProviderId;
    return this;
  }

   /**
   * Get accountProviderId
   * @return accountProviderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eeeeee", value = "")

  public String getAccountProviderId() {
    return accountProviderId;
  }


  public void setAccountProviderId(String accountProviderId) {
    this.accountProviderId = accountProviderId;
  }


  public ServiceInfo userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dddd", value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ServiceInfo countryId(String countryId) {
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12df", value = "")

  public String getCountryId() {
    return countryId;
  }


  public void setCountryId(String countryId) {
    this.countryId = countryId;
  }


  public ServiceInfo transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00fee2e6-0e2b-4ebf-899c-35276592a13c", value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public ServiceInfo origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "postman", value = "")

  public String getOrigin() {
    return origin;
  }


  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public ServiceInfo service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support", value = "")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public ServiceInfo instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EEEEEE", value = "")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public ServiceInfo timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-11-16T11:04:00Z", value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public ServiceInfo location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pakistan❤️", value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ServiceInfo activity(String activity) {
    
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Registeration", value = "")

  public String getActivity() {
    return activity;
  }


  public void setActivity(String activity) {
    this.activity = activity;
  }


  public ServiceInfo partyType(String partyType) {
    
    this.partyType = partyType;
    return this;
  }

   /**
   * Get partyType
   * @return partyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support", value = "")

  public String getPartyType() {
    return partyType;
  }


  public void setPartyType(String partyType) {
    this.partyType = partyType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInfo serviceInfo = (ServiceInfo) o;
    return Objects.equals(this.iam, serviceInfo.iam) &&
        Objects.equals(this.channelId, serviceInfo.channelId) &&
        Objects.equals(this.accountProviderId, serviceInfo.accountProviderId) &&
        Objects.equals(this.userId, serviceInfo.userId) &&
        Objects.equals(this.countryId, serviceInfo.countryId) &&
        Objects.equals(this.transactionId, serviceInfo.transactionId) &&
        Objects.equals(this.origin, serviceInfo.origin) &&
        Objects.equals(this.service, serviceInfo.service) &&
        Objects.equals(this.instance, serviceInfo.instance) &&
        Objects.equals(this.timestamp, serviceInfo.timestamp) &&
        Objects.equals(this.location, serviceInfo.location) &&
        Objects.equals(this.activity, serviceInfo.activity) &&
        Objects.equals(this.partyType, serviceInfo.partyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iam, channelId, accountProviderId, userId, countryId, transactionId, origin, service, instance, timestamp, location, activity, partyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInfo {\n");
    sb.append("    iam: ").append(toIndentedString(iam)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    accountProviderId: ").append(toIndentedString(accountProviderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
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

}

