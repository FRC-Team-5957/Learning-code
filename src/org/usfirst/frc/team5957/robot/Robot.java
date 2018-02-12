// Don't worry about this stuff. It just tells the program what to use and where it is.
package org.usfirst.frc.team5957.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

// This is our robot. All the code for the robot goes in here
public class Robot extends IterativeRobot {
	// All code to declare parts of the robot goes here, before any of the methods
	// below.
	// An example is
	// int motorChannel = 0;
	// VictorSP motor = new VictorSP(motorChannel);

	// Map:
	// front left drive motor - VictorSP, pwm port 2
	// rear left drive motor - VictorSP, pwm port 3
	// front right drive motor - VictorSP, pwm port 0
	// rear right drive motor - VictorSP, pwm port 1
	// winch motor - VictorSP, pwm port 8
	// coil motor - VictorSP, pwm port 9
	// driver joystick - Joystick, port 0
	// operator joystick - Joystick, port 1

	// Useful things to know:
	// Red underline means it doesn't work, it's wrong unless it's in a comment
	// Hover your mouse over something with an underline to see what's wrong with it
	// Ctrl + Shift + F - clean up your code
	// Ctrl + S - save progress and makes the star next to 'Robot.java' go away
	// Ctrl + Shift + O - auto-import if it yells at you about 'cannot be resolved
	// to a type'
	// Use Differential drive, not RobotDrive for the drive train code, RobotDrive
	// is old and bad

	// This method is for anything you need to do before the robot moves
	// For example, resetting a gyro, calibrating encoders etc.
	@Override
	public void robotInit() {
	}

	// This is autonomous code that runs sequentially
	// That means that any code in this method will run all the way through once and
	// only once
	@Override
	public void autonomousInit() {
	}

	// This is autonomous code that runs in a loop
	// That means that any code in here will run through once and then come back to
	// the top and run again
	// until autonomous mode is over. (That happens about once every 20ms or about
	// 50 times a second)
	@Override
	public void autonomousPeriodic() {
	}

	// This method is just like the autonomousPeriodic method except this one runs
	// during teleop mode
	// This means you want to put any teleop code in here. An example would be
	// controlling any motors on the
	// robot or the driving code.
	@Override
	public void teleopPeriodic() {
	}

	// This method (as the name implies) is used for testing. If you have something
	// you are not sure will
	// work that you want to try on the robot, you can put it in this method. If
	// something goes wrong during testing
	// remember to PRESS THE SPACE BAR!
	@Override
	public void testPeriodic() {
	}
}
