package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.AvailabilityDetails;
import com.hcl.springboot.canceltrx.api.model.ProductInventory;

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

@Api(value = "ProductAvailablilty", description = "the ProductAvailablilty API")
public interface ProductAvailabliltyApi {

    @ApiOperation(value = "search the product availability based on zip code", notes = "", response = ProductInventory.class, responseContainer = "List", tags={ "product availablilty", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProductInventory.class),
        @ApiResponse(code = 400, message = "Invaild product id provided", response = ProductInventory.class),
        @ApiResponse(code = 404, message = "Product not Found", response = ProductInventory.class) })
    @RequestMapping(value = "/product/availability",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<ProductInventory>> productAvailabilityGet(@ApiParam(value = "Search product details by zip code" ,required=true ) @RequestBody AvailabilityDetails body);

}
