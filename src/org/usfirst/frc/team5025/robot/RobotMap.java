package org.usfirst.frc.team5025.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon L_FRONT_MOTOR = new CANTalon(1);
	public static CANTalon L_REAR_MOTOR = new CANTalon(2);
	public static CANTalon R_FRONT_MOTOR = new CANTalon(3);
	public static CANTalon R_REAR_MOTOR = new CANTalon(4);
	public static VictorSP R_LIFT_MOTOR = new VictorSP(0);
	//public static VictorSP F_LIFT_MOTOR = new VictorSP(1);
	public static VictorSP L_LIFT_MOTOR = new VictorSP(1);
	public static Servo CAMERA_MOUNT = new Servo(3);
	public static DoubleSolenoid R_CLAW_PISTON = new DoubleSolenoid(2, 3);
	public static DoubleSolenoid L_CLAW_PISTON = new DoubleSolenoid(1, 4);
	
	
	//Yes!! I have shot Garfield! Arthur is president! I am a Stalwart!;
	
	public RobotMap(){
		L_FRONT_MOTOR.changeControlMode(ControlMode.PercentVbus);
		L_REAR_MOTOR.changeControlMode(ControlMode.PercentVbus);
		R_FRONT_MOTOR.changeControlMode(ControlMode.PercentVbus);
		R_REAR_MOTOR.changeControlMode(ControlMode.PercentVbus);
		R_CLAW_PISTON.set(DoubleSolenoid.Value.kForward);
		L_CLAW_PISTON.set(DoubleSolenoid.Value.kForward);
	}
	
}
