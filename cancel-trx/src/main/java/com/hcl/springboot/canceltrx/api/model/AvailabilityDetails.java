package com.hcl.springboot.canceltrx.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * AvailabilityDetails
 */

public class AvailabilityDetails  implements Serializable {
  @JsonProperty("productid")
  private Long productid = null;

  @JsonProperty("zipcode")
  private String zipcode = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  /**
   * Gets or Sets deliverymethod
   */
  public enum DeliverymethodEnum {
    PICKUP("pickup"),
    
    HOME("home");

    private String value;

    DeliverymethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliverymethodEnum fromValue(String text) {
      for (DeliverymethodEnum b : DeliverymethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deliverymethod")
  private DeliverymethodEnum deliverymethod = null;

  public AvailabilityDetails productid(Long productid) {
    this.productid = productid;
    return this;
  }

   /**
   * Get productid
   * @return productid
  **/
  @ApiModelProperty(example = "31219", value = "")
  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public AvailabilityDetails zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Get zipcode
   * @return zipcode
  **/
  @ApiModelProperty(example = "201304", value = "")
  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public AvailabilityDetails quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "2", value = "")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public AvailabilityDetails deliverymethod(DeliverymethodEnum deliverymethod) {
    this.deliverymethod = deliverymethod;
    return this;
  }

   /**
   * Get deliverymethod
   * @return deliverymethod
  **/
  @ApiModelProperty(value = "")
  public DeliverymethodEnum getDeliverymethod() {
    return deliverymethod;
  }

  public void setDeliverymethod(DeliverymethodEnum deliverymethod) {
    this.deliverymethod = deliverymethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityDetails availabilityDetails = (AvailabilityDetails) o;
    return Objects.equals(this.productid, availabilityDetails.productid) &&
        Objects.equals(this.zipcode, availabilityDetails.zipcode) &&
        Objects.equals(this.quantity, availabilityDetails.quantity) &&
        Objects.equals(this.deliverymethod, availabilityDetails.deliverymethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productid, zipcode, quantity, deliverymethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityDetails {\n");
    
    sb.append("    productid: ").append(toIndentedString(productid)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    deliverymethod: ").append(toIndentedString(deliverymethod)).append("\n");
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

