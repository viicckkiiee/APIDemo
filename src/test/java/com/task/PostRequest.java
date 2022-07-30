package com.task;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.base.UtilClass;

import io.restassured.response.Response;

public class PostRequest extends UtilClass{
	
		@Test
		private void post() throws FileNotFoundException, IOException {
			
		UtilClass util = new UtilClass();
		util.addHeader();
		util.basicAuth(util.getPropertyFileValue("username"), util.getPropertyFileValue("password"));
		Response requestType = util.requestType("POST", "https://omrbranch.com/api/login");
		int statusCode = util.getStatusCode(requestType);
		System.out.println(statusCode);
		String bodyAsPrettyString = util.getBodyAsPrettyString(requestType);
		System.out.println(bodyAsPrettyString);

	}

}
