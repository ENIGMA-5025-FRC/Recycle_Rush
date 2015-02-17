package org.usfirst.frc.team5025.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team5025.robot.commands.ClosePistonCommand;
import org.usfirst.frc.team5025.robot.commands.ClosePistonCommand_2;
import org.usfirst.frc.team5025.robot.commands.ExampleCommand;
import org.usfirst.frc.team5025.robot.commands.OpenPistonCommand;
import org.usfirst.frc.team5025.robot.commands.OpenPistonCommand_2;
import org.usfirst.frc.team5025.robot.commands.TogglePiston;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick mDriverJoystick = new Joystick(0);
	public static Joystick mManipJoystick = new Joystick(1);
	public static Button mMecanumForceBtn = new JoystickButton(mDriverJoystick, 2);
	public static Button mPistonTriggerBtn = new JoystickButton(mManipJoystick, 1);
	public static Button mClosePistonBtn = new JoystickButton(mManipJoystick, 2);
	public static Button mPistonOpen2 = new JoystickButton(mManipJoystick, 3);
	public static Button mPistonClose2 = new JoystickButton(mManipJoystick, 4);
	
	public OI(){
		mPistonTriggerBtn.whenPressed(new OpenPistonCommand());
		mClosePistonBtn.whenPressed(new ClosePistonCommand());
		mPistonOpen2.whenPressed(new OpenPistonCommand_2());
		mPistonClose2.whenPressed(new ClosePistonCommand_2());
	}
	
	public static double getDriverAxis(int _axis){ return mDriverJoystick.getRawAxis(_axis); }
	public static double getDriverX(){ return mDriverJoystick.getX(); }
	public static double getDriverY(){ return mDriverJoystick.getY(); }
	public static double getDriverZ(){ return mDriverJoystick.getZ(); }
	public static double getDriverTwist(){ return mDriverJoystick.getTwist(); }
	
	public static double getManipulatorX(){ return mManipJoystick.getX(); }
	public static double getManipulatorY(){ return mManipJoystick.getY(); }
	public static double getManipulatorZ(){ return mManipJoystick.getZ(); }
	public static double getManipulatorTwist(){ return mManipJoystick.getTwist(); }
	
	
	public static boolean getMecanumToggle(){ return mMecanumForceBtn.get(); }
	public static boolean getPistonTrigger(){ return mPistonTriggerBtn.get(); }
}

