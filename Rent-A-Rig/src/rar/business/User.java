package rar.business;

import java.io.Serializable;

public class User implements Serializable {
	
	private String firstName;
	private String lastName;
	private String email;
	private String[] Address;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getAddress() {
		return Address;
	}
	public void setAddress(String[] address) {
		Address = address;
	}
	

}
