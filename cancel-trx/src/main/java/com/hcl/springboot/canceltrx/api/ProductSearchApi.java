package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.ProductDetails;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;

@Api(value = "ProductSearch", description = "the ProductSearch API")
public interface ProductSearchApi {

    @ApiOperation(value = "search the product details", notes = "", response = ProductDetails.class, tags={ "product search", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProductDetails.class),
        @ApiResponse(code = 400, message = "Invalid product id supplied", response = ProductDetails.class),
        @ApiResponse(code = 404, message = "Product not found.", response = ProductDetails.class) })
    @RequestMapping(value = "/product/search/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ProductDetails> productSearchIdGet(@ApiParam(value = "The id that needs to be fetched.",required=true ) @PathVariable("id") Integer id);

}
