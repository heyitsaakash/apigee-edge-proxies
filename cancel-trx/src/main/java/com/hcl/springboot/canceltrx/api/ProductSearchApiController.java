package com.hcl.springboot.canceltrx.api;

import com.hcl.springboot.canceltrx.api.model.ProductDetails;

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
public class ProductSearchApiController implements ProductSearchApi {
	



    public ResponseEntity<ProductDetails> productSearchIdGet(@ApiParam(value = "The id that needs to be fetched.",required=true ) @PathVariable("id") Integer id) {
       
        return new ResponseEntity<ProductDetails>(    new ProductDetails(),   HttpStatus.OK);
    }

}
