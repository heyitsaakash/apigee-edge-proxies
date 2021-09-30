package com.hcl.springboot.canceltrx.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hcl.springboot.canceltrx.api.model.AvailableInventory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ProductInventory
 */

public class ProductInventory  implements Serializable {
  @JsonProperty("productid")
  private Long productid = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("avaialble_inventory")
  private List<AvailableInventory> avaialbleInventory = new ArrayList<AvailableInventory>();

  public ProductInventory productid(Long productid) {
    this.productid = productid;
    return this;
  }

   /**
   * Get productid
   * @return productid
  **/
  @ApiModelProperty(example = "iPhone 12", value = "")
  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public ProductInventory description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "iPhone 12 64GB - Blue", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductInventory image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ProductInventory avaialbleInventory(List<AvailableInventory> avaialbleInventory) {
    this.avaialbleInventory = avaialbleInventory;
    return this;
  }

  public ProductInventory addAvaialbleInventoryItem(AvailableInventory avaialbleInventoryItem) {
    this.avaialbleInventory.add(avaialbleInventoryItem);
    return this;
  }

   /**
   * Get avaialbleInventory
   * @return avaialbleInventory
  **/
  @ApiModelProperty(example = "[{&quot;availability&quot;:true,&quot;quantity_available&quot;:4,&quot;zipcode&quot;:201301},{&quot;availability&quot;:true,&quot;quanitity_available&quot;:5,&quot;zipcode&quot;:201302},{&quot;availability&quot;:false,&quot;quanitity_available&quot;:1,&quot;zipcode&quot;:201304}]", value = "")
  public List<AvailableInventory> getAvaialbleInventory() {
    return avaialbleInventory;
  }

  public void setAvaialbleInventory(List<AvailableInventory> avaialbleInventory) {
    this.avaialbleInventory = avaialbleInventory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInventory productInventory = (ProductInventory) o;
    return Objects.equals(this.productid, productInventory.productid) &&
        Objects.equals(this.description, productInventory.description) &&
        Objects.equals(this.image, productInventory.image) &&
        Objects.equals(this.avaialbleInventory, productInventory.avaialbleInventory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productid, description, image, avaialbleInventory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInventory {\n");
    
    sb.append("    productid: ").append(toIndentedString(productid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    avaialbleInventory: ").append(toIndentedString(avaialbleInventory)).append("\n");
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

