package com.apidemo2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\APIdemo\\src\\test\\resources\\sampleFile2.json");
		
		Data d1 = new Data(1,"First1","Last1","Avatar1");
		Data d2 = new Data(2,"First2","Last2","Avatar2");
		Data d3 = new Data(3,"First3","Last3","Avatar3");
		Data d4 = new Data(4,"First4","Last4","Avatar4");
		Data d5 = new Data(5,"First5","Last5","Avatar5");
		
		List<Data>data = new ArrayList<Data>();
		data.add(d1);
		data.add(d2);
		data.add(d3);
		data.add(d4);
		data.add(d5);
		
		Support s = new Support("www.google.com","Name");
		
		Employee e = new Employee(1, 2, 3, 4, data,s);
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(f, e);
	}

}
