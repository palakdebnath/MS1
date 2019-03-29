package com.example.MS1.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/ms1")
@Api(value="/ms1",description="Microservice 1",produces ="application/json")
public class SampleController {

    @ApiOperation(value="get random number",response=Integer.class)
	    @ApiResponses(value={
	    @ApiResponse(code=200,message="Random number generated",response=Integer.class),
	   @ApiResponse(code=500,message="Internal Server Error"),
	   @ApiResponse(code=404,message="random number not found")
	})
	@GetMapping("/random") 
	public Integer getRandomNumber() {
		Random r = new Random();
		return r.nextInt();
	}
    
	@GetMapping("/ping") 
	public String pingMe() {
		return "Hi...";
	}
}
