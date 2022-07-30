package com.apidemo1;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample2 {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\APIdemo\\src\\test\\resources\\sampleFile.json");
		ObjectMapper mapper = new ObjectMapper();
		Sample1 s = mapper.readValue(f, Sample1.class);
		
		System.out.println(s.getPage());
		System.out.println(s.getPer_page());
		System.out.println(s.getTotal());
		System.out.println(s.getTotal_pages());
		
		LinkedList<Data> d = s.getData();
		for (Data data : d) {
			System.out.println(data.getId());
			System.out.println(data.getFirst_name());
			System.out.println(data.getLast_name());
		
			System.out.println(data.getEmail());
			System.out.println(data.getAvatar());	
			
		}
	}

}
