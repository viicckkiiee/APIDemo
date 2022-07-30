package com.task;

import org.testng.annotations.Test;

import com.base.*;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetRequest extends UtilClass {
	
		@Test
		public void get() {
			
		UtilClass util = new UtilClass();
		util.addHeader();
		util.pathPara("page", "2");
		Response requestType = util.requestType("GET", "https://reqres.in/api/users/{page}");
		int statusCode = util.getStatusCode(requestType);
		System.out.println(statusCode);
		String bodyAsPrettyString = util.getBodyAsPrettyString(requestType);
		System.out.println(bodyAsPrettyString);
		
	}
	

}
