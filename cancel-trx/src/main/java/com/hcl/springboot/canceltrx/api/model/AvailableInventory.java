package com.hcl.springboot.canceltrx.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * AvailableInventory
 */

public class AvailableInventory  implements Serializable {
  @JsonProperty("availability")
  private Boolean availability = null;

  @JsonProperty("zipcode")
  private Long zipcode = null;

  @JsonProperty("quantity_available")
  private Long quantityAvailable = null;

  public AvailableInventory availability(Boolean availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getAvailability() {
    return availability;
  }

  public void setAvailability(Boolean availability) {
    this.availability = availability;
  }

  public AvailableInventory zipcode(Long zipcode) {
    this.zipcode = zipcode;
    return this;
  }

   /**
   * Get zipcode
   * @return zipcode
  **/
  @ApiModelProperty(example = "201301", value = "")
  public Long getZipcode() {
    return zipcode;
  }

  public void setZipcode(Long zipcode) {
    this.zipcode = zipcode;
  }

  public AvailableInventory quantityAvailable(Long quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
    return this;
  }

   /**
   * Get quantityAvailable
   * @return quantityAvailable
  **/
  @ApiModelProperty(example = "10", value = "")
  public Long getQuantityAvailable() {
    return quantityAvailable;
  }

  public void setQuantityAvailable(Long quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableInventory availableInventory = (AvailableInventory) o;
    return Objects.equals(this.availability, availableInventory.availability) &&
        Objects.equals(this.zipcode, availableInventory.zipcode) &&
        Objects.equals(this.quantityAvailable, availableInventory.quantityAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, zipcode, quantityAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableInventory {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    quantityAvailable: ").append(toIndentedString(quantityAvailable)).append("\n");
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

