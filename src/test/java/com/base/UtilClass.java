package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class UtilClass {
	
	RequestSpecification reqSpec;
	Response response;
	
	public void addHeader() {
		reqSpec = RestAssured.given().header("Content-Type","application/json");
	}
	
	public void basicAuth(String username,String password) {
		reqSpec = reqSpec.auth().preemptive().basic(username, password);
	}
	
	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\Config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}
	
	public void querypara(String key,String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}
	
	public void pathPara(String key,String value) {
		reqSpec = reqSpec.pathParams(key,value);
	}
	
	public void addBody(String reqBody) {
		reqSpec = reqSpec.body(reqBody);
	}
	
	public Response requestType(String reqtype,String endPoint) {
		
		switch (reqtype) {
		case "GET"    : response = reqSpec.get(endPoint);
			            break;
		case "PUT"    : response = reqSpec.put(endPoint);
                        break;	  
		case "POST"   : response = reqSpec.post(endPoint);
					    break;            
		case "DELETE" : response = reqSpec.get(endPoint);
                        break;			    
		default:
			break;
		}
		return response;
	}
	
	public int getStatusCode(Response response) {	
		int statusCode = response.getStatusCode();
		return statusCode;
	}
	
	public ResponseBody getBody(Response response) {
		ResponseBody responseBody = response.getBody();
		return responseBody;
	}
	
	public String getBodyAsString(Response response) {
		String asString = getBody(response).asString();
		return asString;	
	}
	
	public String getBodyAsPrettyString(Response response) {
		String asPrettyString = getBody(response).asPrettyString();
		return asPrettyString;
	}
}
