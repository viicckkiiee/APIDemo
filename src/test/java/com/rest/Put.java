package com.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put {
	
	static RequestSpecification reqSpec;
	
	public static void main(String[] args) {
		
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.headers("Content-Type","application/json");
		reqSpec = reqSpec.body("{\r\n" + 
				"    \"name\": \"Vikki\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}");
		Response response = reqSpec.put("https://reqres.in/api/users/2");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}

}
