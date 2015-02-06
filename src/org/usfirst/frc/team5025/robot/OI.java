package org.usfirst.frc.team5025.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team5025.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick mDriverJoystick = new Joystick(0);
	
	public OI(){
		
	}
	
	public static double getDriverX(){ return mDriverJoystick.getX(); }
	public static double getDriverY(){ return mDriverJoystick.getY(); }
	public static double getDriverZ(){ return mDriverJoystick.getZ(); }
}

