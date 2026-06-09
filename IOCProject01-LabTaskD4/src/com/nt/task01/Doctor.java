package com.nt.task01;

public class Doctor {
	private String name;
	private String specialization;
	
	 Doctor(String name, String specialization){
		this.name=name;
		this.specialization=specialization;
		
	}
  public void showDoctor() {
	  System.out.println("Doctor: "+name+" Specializition: "+specialization);
  }
	
}

