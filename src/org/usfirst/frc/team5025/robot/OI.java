package org.usfirst.frc.team5025.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5025.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick mDriverJoystick = new Joystick(0);
	public static Button mMecanumForceBtn = new JoystickButton(mDriverJoystick, 2);
	
	public OI(){
		
	}
	
	public static double getDriverAxis(int _axis){ return mDriverJoystick.getRawAxis(_axis); }
	public static double getDriverX(){ return mDriverJoystick.getX(); }
	public static double getDriverY(){ return mDriverJoystick.getY(); }
	public static double getDriverZ(){ return mDriverJoystick.getZ(); }
	public static double getDriverTwist(){ return mDriverJoystick.getTwist(); }
	
	public static boolean getMecanumToggle(){ return mMecanumForceBtn.get(); }
}

