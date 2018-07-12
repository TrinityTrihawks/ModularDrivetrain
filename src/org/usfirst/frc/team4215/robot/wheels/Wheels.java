package org.usfirst.frc.team4215.robot.wheels;

public class Wheels {
	public OneWheel frontRight, frontLeft, backRight, backLeft;
	public WheelSet left, right, all, frontLeftBackRight, frontRightBackLeft;
	
	public Wheels() {
		
		//create the individual wheels
		frontRight = new OneWheel("frontRight", 0);
		frontLeft = new OneWheel("frontLeft", 1);
		backRight = new OneWheel("backRight", 2);
		backLeft = new OneWheel("backLeft", 3);
		
		//create the various sets of wheels using the individual wheels
		left = new WheelSet("left", new OneWheel[] {frontLeft, backLeft});
		right = new WheelSet("right", new OneWheel[] {frontRight, backRight});
		all = new WheelSet("all",
				new OneWheel[] {frontLeft, backLeft, frontRight, backRight});
		frontLeftBackRight = new WheelSet("frontLeftBackRight",
				new OneWheel[] {frontLeft, backRight});
		frontRightBackLeft = new WheelSet("frontRightBackLeft",
				new OneWheel[] {frontRight, backLeft});
	}
	
	
	//sets all the wheels to a certain power
	//shortcut for wheels.all.set()
	public void set(double power) {
		all.set(power);
	}
	
	public void stop() {
		all.set(0);
	}
	
	//create a snapshot of all the wheels
	//shortcut for wheels.all.getSnapshot()
	public WheelSnapshot getSnapshot() {
		return all.getSnapshot();
	}
}
