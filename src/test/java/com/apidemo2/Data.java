package com.apidemo2;

public class Data {
	
	private int id;
	private String firstName;
	private String lastName;
	private String avatar;
	
	public Data(int id,String firstName,String lastName,String avatar) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.avatar=avatar;		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAvatar() {
		return avatar;
	}
	

}
