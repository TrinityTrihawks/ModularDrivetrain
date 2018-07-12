package org.usfirst.frc.team4215.robot.wheels;

public class OneWheel {
	public final String name;
	public final int id;
	
	private TalonSRX talon;
	
 
	//keeps the state of the power for this wheel
	private double myPower = 0;
	
	public OneWheel(String name, int id) {
		this.name = name;
		this.id = id; // port number
	}
	
	public void set(double power) {
		System.out.println(name + ": set power to " + power);
		myPower = power;
	}
	
	public double getPower() {
		return myPower;
	}
	
	public void setMode(String mode) {
		//this method might include something like talon.setControlMode()
		//right now the mode doesn't affect anything
		System.out.println(name + ": set mode to " + mode);
	}
	
	public WheelSnapshot getSnapshot() {
		//create a snapshot of this wheel
		return new WheelSnapshot(this);
	}
}
