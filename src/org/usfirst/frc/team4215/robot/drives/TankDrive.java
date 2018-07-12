package org.usfirst.frc.team4215.robot.drives;

import org.usfirst.frc.team4215.robot.wheels.Wheels;

public class TankDrive {
	Wheels wheels;
	
	public TankDrive(Wheels wheels) {
		this.wheels = wheels;
	}
	
	public void drive(double leftPower, double rightPower) {
		System.out.println("Driving with tank drive");
		wheels.left.set(leftPower);
		wheels.right.set(rightPower);
	}
}
