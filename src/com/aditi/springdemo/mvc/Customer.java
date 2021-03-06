package com.aditi.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.aditi.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is Required")
	private String lastName;
	
	@Min(value=0, message="Must be Greater than or equal to zero")
	@Max(value=10, message="Must be Less than or equal to Ten")
	private int freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 characters/digits")
	private String postalCode;
	
	@CourseCode(value="TOPS", message="Should start with Tops")
	private String courseCode;

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

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	  
	

}
