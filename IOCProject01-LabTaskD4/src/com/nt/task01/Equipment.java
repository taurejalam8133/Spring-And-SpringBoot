package com.nt.task01;

public class Equipment {
	private String equipmentName;
	private double cost;
	
	Equipment(String equipmentName,double cost){
		this.equipmentName=equipmentName;
		this.cost=cost;
		
	}
	
  public void showEquipment(){
	  System.out.println("EquipmentName: "+equipmentName+" Cost: "+cost);
		
	}
	
}
