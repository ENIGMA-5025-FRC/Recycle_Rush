package org.usfirst.frc.team5025.robot.commands;

import org.usfirst.frc.team5025.robot.OI;
import org.usfirst.frc.team5025.robot.Robot;
import org.usfirst.frc.team5025.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {
	
	private RobotDrive mDrive = new RobotDrive(RobotMap.L_FRONT_MOTOR, RobotMap.L_REAR_MOTOR, RobotMap.R_FRONT_MOTOR, RobotMap.R_REAR_MOTOR);
	private boolean mMecanumToggle = false;
	
	private double clamp(double in){
		double ret;
		if(in > 1.0){
			ret = 0.95;
		}else if(in < -1.0){
			ret = -0.951;
		}else{
			ret = in;
		}
		return ret;
	}
	
    public DriveCommand() {
    	requires(Robot.mDriveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	mDrive.drive(1.0, 0.0);
    	//mDrive.setSafetyEnabled(false);
    }
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	if(OI.getMecanumToggle()) mMecanumToggle =! mMecanumToggle;
//    	if(!mMecanumToggle){ mDrive.mecanumDrive_Cartesian(OI.getDriverX(), -OI.getDriverZ(), OI.getDriverY(), 0.0); }
//    	else{ mDrive.mecanumDrive_Cartesian(OI.getDriverX(), OI.getDriverY(), 0.0, 0.0); }
    }
    
    /*In case execute doesn't work, use this and call it in teleopPeriodic*/
    public void bypassRun(){
    	System.out.println("Mecanum toggle: " + mMecanumToggle);
//    	if(OI.getMecanumToggle()){ mDrive.mecanumDrive_Cartesian(OI.getDriverX(), 0.0, OI.getDriverY(), 0.0); }else{
//    		mDrive.mecanumDrive_Cartesian(OI.getDriverX(), -OI.getDriverZ(), OI.getDriverY(), 0.0);
//    	}
    	mDrive.mecanumDrive_Cartesian(clamp(OI.getDriverX()), OI.getDriverY(), clamp(OI.getDriverZ()), clamp(OI.getDriverTwist()));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	mDrive.drive(0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
