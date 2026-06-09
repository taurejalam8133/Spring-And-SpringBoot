package com.nt.task01;

public class Hospital {
	private String hospitalName;
	private Doctor doctor;
	private Equipment equipment;
	
	Hospital(String hospitalName,Doctor doctor,Equipment equipment){
		this.hospitalName=hospitalName;
		this.doctor=doctor;
		this.equipment=equipment;
	}
	
	public void showDetails() {
		System.out.println("Hospital: "+hospitalName);
		doctor.showDoctor();
		equipment.showEquipment();
	}

}
