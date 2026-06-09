package com.nt.task02;

public class Professor {
	private String name;
	private int yearsOfExperience;
	
	Professor(String name, int yearsOfExperience){
		this.name=name;
		this.yearsOfExperience=yearsOfExperience;
		
	}
  public void showDoctor() {
	  System.out.println("Professor: "+name+" yearsOfExperience: "+yearsOfExperience);
  }
}
