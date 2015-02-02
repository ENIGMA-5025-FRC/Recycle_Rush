package org.usfirst.frc.team5025.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.TalonSRX;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static TalonSRX L_FRONT_MOTOR = new TalonSRX(1);
	public static TalonSRX L_REAR_MOTOR = new TalonSRX(2);
	public static TalonSRX R_FRONT_MOTOR = new TalonSRX(3);
	public static TalonSRX R_REAR_MOTOR = new TalonSRX(4);
	
	
	//Yes!! I have shot Garfield! Arthur is president! I am a Stalwart!;
	
	public RobotMap(){
		
	}
	
}
