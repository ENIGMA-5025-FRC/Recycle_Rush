package org.usfirst.frc.team5025.robot.commands;

import org.usfirst.frc.team5025.robot.OI;
import org.usfirst.frc.team5025.robot.Robot;
import org.usfirst.frc.team5025.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftManualCommand extends Command {

    public LiftManualCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.mLiftSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }
    
    public void manualRun(){
    	//RobotMap.R_LIFT_MOTOR.set(OI.getManipulatorZ() * 0.3);
    	//RobotMap.L_LIFT_MOTOR.set(OI.getManipulatorY() * 0.3);  
    	
    	if(OI.mSemiSpeed_L.get()){
    		RobotMap.L_LIFT_MOTOR.set(OI.getManipulatorY() * 0.6);
    	}else if(OI.mFullSpeed_L.get()){
    		RobotMap.L_LIFT_MOTOR.set(OI.getManipulatorY() * 0.9);
    	}else{
    		RobotMap.L_LIFT_MOTOR.set(OI.getManipulatorY() * 0.3);
    	}
    	
    	if(OI.mSemiSpeed_R.get()){
    		RobotMap.R_LIFT_MOTOR.set(OI.getManipulatorZ() * 0.6);
    	}else if(OI.mFullSpeed_R.get()){
    		RobotMap.R_LIFT_MOTOR.set(OI.getManipulatorZ() * 0.9);
    	}else{
    		RobotMap.R_LIFT_MOTOR.set(OI.getManipulatorZ() * 0.3);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
