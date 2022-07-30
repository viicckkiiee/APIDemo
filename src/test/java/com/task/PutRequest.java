package com.task;

import org.testng.annotations.Test;

import com.base.UtilClass;

import io.restassured.response.Response;

public class PutRequest extends UtilClass {
	
		@Test
		private void put() {
			
		UtilClass util = new UtilClass();
		util.addHeader();
		util.pathPara("p","2");
		util.addBody("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}");
		Response requestType = util.requestType("PUT", "https://reqres.in/api/users/{p}");
		int statusCode = util.getStatusCode(requestType);
		System.out.println(statusCode);
		String bodyAsPrettyString = util.getBodyAsPrettyString(requestType);
		System.out.println(bodyAsPrettyString);
	}

}
