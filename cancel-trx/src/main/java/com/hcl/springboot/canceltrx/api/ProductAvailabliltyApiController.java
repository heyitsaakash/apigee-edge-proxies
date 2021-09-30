package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.AvailabilityDetails;
import com.hcl.springboot.canceltrx.api.model.ProductInventory;

import io.swagger.annotations.*;
import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import java.util.List;

import javax.validation.constraints.*;

@Controller
public class ProductAvailabliltyApiController implements ProductAvailabliltyApi {
	



    public ResponseEntity<List<ProductInventory>> productAvailabilityGet(@ApiParam(value = "Search product details by zip code" ,required=true ) @RequestBody AvailabilityDetails body) {
       
        return new ResponseEntity<List<ProductInventory>>( new ArrayList<ProductInventory>(), HttpStatus.OK);
    }

}
