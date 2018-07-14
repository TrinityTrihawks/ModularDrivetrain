/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4215.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//copied from 2018 Project
	
	
	// Joysticks
	public final static int driveStick = 0; 
	public final static int adjutantJoystick = 1;

	// Talons for drivetrain
	public final static int talonWheel_backright = 1;
	public final static int talonWheel_frontright = 2;
	public final static int talonWheel_backleft = 0;
	public final static int talonWheel_frontleft = 3;
	
	/*// Talons for drivetrain //MiniBot
	public final static int talonWheel_backright = 3;
	public final static int talonWheel_frontright = 2;
	public final static int talonWheel_backleft = 1;
	public final static int talonWheel_frontleft = 0;*/
			
	// Victors for Intake
	public final static int intakeVictor1 = 3;
	public final static int intakeVictor2 = 4;
	
	// Joystick button controls for Intake
	public final static int intakeButton = 3;
	public final static int intakeOffButton = 1;
	public final static int spitButton = 4;

	// Victors for Lift
	public final static int liftvictorOne = 0;
	public final static int liftvictorTwo = 1;
	
	// Valuable numbers for Drivetrain
	//public final static int numberOfWheels = 4;
	//18.875
	public final static double wheelCircumference = 18.875; // Essentially 6*pi(C=D*pi), however the C is a little larger in reality

	// Sensor channels
	public final static int gyroChannel = 0;
	// TODO Find and set the actual values for these ports
	public final static int frontLeftUltrasonicChannel = 3;
	public final static int frontRightUltrasonicChannel = 1;
	public final static String sideRightUltrasonic = "/dev/ttyUSB1";
	public final static String sideLeftUltrasonic = "/dev/ttyUSB0";
	public final static int liftUltrasonicChannel = 2;
	
	// Command numbers
	public final static double liftSpeed = .4;
	
	public final static int middleBasicAutoDistance = 120;

}
