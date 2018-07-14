package org.usfirst.frc.team4215.robot.wheels;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class OneWheel {
	
	public final String name;
	public final int id;
	
	private TalonSRX talon;

	
	public OneWheel(String name, int id) {
		this.name = name;
		this.id = id; // port number
		
		talon = new TalonSRX(this.id);
	}
	
	public void set(double power) {
		System.out.println(name + ": set power to " + power);
		
		talon.set(ControlMode.PercentOutput, power);
	}
	
	public double getPower() {
		return talon.getMotorOutputPercent();
	}
	
	public void setInverted(boolean shouldBeInverted) {
		talon.setInverted(shouldBeInverted);
	}
	
	public boolean isInverted() {
		return talon.getInverted();
	}
	

	
	/*
	public void setMode(String mode) {
		//this method might include something like talon.setControlMode()
		//right now the mode doesn't affect anything
		System.out.println(name + ": set mode to " + mode);
	}
	*/
	
	public WheelSnapshot getSnapshot() {
		//create a snapshot of this wheel
		return new WheelSnapshot(this);
	}
}
