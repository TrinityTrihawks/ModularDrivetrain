package org.usfirst.frc.team4215.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4215.robot.Robot;



public class MecanumDrive extends Command {
	
	public MecanumDrive() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.wheels);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		
		//get values from joystick
		double magnitude = Robot.m_oi.getMagnitude();
		double theta = Robot.m_oi.getTheta();
		double rotation = Robot.m_oi.getRotation();
		
		
		rotation *= -0.5;
		
		//joystick deadzone
		if (Math.abs(magnitude) >= 0.08) {
			theta = 0;
			magnitude = 0;
		}

		
		//TODO: rename these vars so it clear which vars refer to which wheels
		double xPower = magnitude * Math.sin(-theta - Math.PI / 4);
		double yPower = magnitude * Math.cos(-theta - Math.PI / 4);
				
		//TODO: fix how rotation is applied to the wheels
		
		//takes values from above doubles and corresponds them with each wheel
		Robot.wheels.backRight.set(xPower - rotation);
		Robot.wheels.frontRight.set(yPower + rotation);
		Robot.wheels.backLeft.set(yPower - rotation);
		Robot.wheels.frontLeft.set(xPower + rotation);
		
		//Note: see Wheels class for which talons are inverted

	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.wheels.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}