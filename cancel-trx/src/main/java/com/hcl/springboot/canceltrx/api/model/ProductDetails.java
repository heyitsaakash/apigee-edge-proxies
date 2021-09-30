package com.hcl.springboot.canceltrx.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.hcl.springboot.canceltrx.api.model.ProductSpecification;
import com.hcl.springboot.canceltrx.api.model.Review;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * ProductDetails
 */

public class ProductDetails  implements Serializable {
  @JsonProperty("productid")
  private Long productid = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("images")
  private List<String> images = new ArrayList<String>();

  @JsonProperty("spec")
  private ProductSpecification spec = null;

  @JsonProperty("reviews")
  private List<Review> reviews = new ArrayList<Review>();

  public ProductDetails productid(Long productid) {
    this.productid = productid;
    return this;
  }

   /**
   * Get productid
   * @return productid
  **/
  @ApiModelProperty(example = "9341", value = "")
  public Long getProductid() {
    return productid;
  }

  public void setProductid(Long productid) {
    this.productid = productid;
  }

  public ProductDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Coil Office Chair", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Coid Office chair with breathable mesh design and easy assemble kit.", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductDetails images(List<String> images) {
    this.images = images;
    return this;
  }

  public ProductDetails addImagesItem(String imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public ProductDetails spec(ProductSpecification spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(value = "")
  public ProductSpecification getSpec() {
    return spec;
  }

  public void setSpec(ProductSpecification spec) {
    this.spec = spec;
  }

  public ProductDetails reviews(List<Review> reviews) {
    this.reviews = reviews;
    return this;
  }

  public ProductDetails addReviewsItem(Review reviewsItem) {
    this.reviews.add(reviewsItem);
    return this;
  }

   /**
   * Get reviews
   * @return reviews
  **/
  @ApiModelProperty(value = "")
  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetails productDetails = (ProductDetails) o;
    return Objects.equals(this.productid, productDetails.productid) &&
        Objects.equals(this.name, productDetails.name) &&
        Objects.equals(this.description, productDetails.description) &&
        Objects.equals(this.images, productDetails.images) &&
        Objects.equals(this.spec, productDetails.spec) &&
        Objects.equals(this.reviews, productDetails.reviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productid, name, description, images, spec, reviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetails {\n");
    
    sb.append("    productid: ").append(toIndentedString(productid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
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

