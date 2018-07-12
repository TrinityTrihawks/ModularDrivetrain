package org.usfirst.frc.team4215.robot.wheels;

public class WheelSnapshot {
	private String[] names;
	private double[] powers;
	private int[] ids;
	
	public WheelSnapshot(OneWheel[] wheelArray) {
		//create a snapshot with multiple wheels
		CreateWheelSnapshot(wheelArray);
	}
	public WheelSnapshot(OneWheel wheel) {
		//create a snapshot with one wheel
		CreateWheelSnapshot(new OneWheel[] {wheel});	
	}
	
	
	private void CreateWheelSnapshot(OneWheel[] wheelArray) {
		//copy all the property values of the wheel(s) at this given moment
		
		int len = wheelArray.length;
		
		names = new String[len];
		ids = new int[len];
		powers = new double[len];
		
		for(int i = 0; i < len; i++) {
			this.names[i] = wheelArray[i].name;
			this.ids[i] = wheelArray[i].id;
			this.powers[i] = wheelArray[i].getPower();
		}
	}
	
	
	//Different methods to print the wheel info
	
	public void printNameAndPower() {
		for(int i = 0; i < names.length; i++) {
			System.out.println("name: "+ names[i] + "  power: " + powers[i]);
		}
	}
	public void printAllPropertiesExpanded() {
		//System.out.println("WheelSnapshot Item");
		for(int i = 0; i < names.length; i++) {
			System.out.println("---");
			System.out.println(" name: " + names[i]);
			System.out.println(" id: " + ids[i]);
			System.out.println(" power: " + powers[i]);
		}
	}
	
	public void printAllProperties() {
		for(int i = 0; i < names.length; i++) {
			System.out.println("name: "+ names[i] +"  id: "+ ids[i] +"  power: "+ powers[i]);
		}
	}
}
