package com.apidemo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIdemo1 {
	
	public static void main(String[] args) throws IOException, ParseException {
		
	FileReader fr = new FileReader("C:\\Users\\Dell\\eclipse-workspace\\APIdemo\\src\\test\\resources\\sampleFile.json");
	JSONParser jparse = new JSONParser();
	Object parse = jparse.parse(fr);
	JSONObject obj = (JSONObject) parse;
	
	System.out.println(obj);
	
	Object object = obj.get("data");
	System.out.println(object);
	
	JSONArray j = (JSONArray) object;
	
	for (int i = 0; i < j.size(); i++) {
		
		Object object2 = j.get(i);
		System.out.println(object2);
		
	}
	
	System.out.println("");
	Object object2 = obj.get("support");
	System.out.println(object2);
	
	JSONObject obj2 = (JSONObject) object2;
	Object object3 = obj2.get("text");
	System.out.println(object3);
	System.out.println(obj2.get("url"));
	
//	Object objData = obj.get("data");
//
//	System.out.println(objData);
//	
//	JSONObject obj1 = (JSONObject) objData;
//	Object objEmail = obj1.get("email");
//	System.out.println(objEmail);
//	
//	Object objAvatar = obj1.get("avatar");
//	System.out.println(objAvatar);
//	
//	Object objSupport = obj.get("support");
//	System.out.println(objSupport);
}
}