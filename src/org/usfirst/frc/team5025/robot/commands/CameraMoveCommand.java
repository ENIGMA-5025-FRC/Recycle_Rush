package org.usfirst.frc.team5025.robot.commands;

import org.usfirst.frc.team5025.robot.OI;
import org.usfirst.frc.team5025.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class CameraMoveCommand extends Command {

    public CameraMoveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.CAMERA_MOUNT.setAngle(90.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }
    
    public void manualRun(){
    	if(OI.getCameraBankLeft()){
    		RobotMap.CAMERA_MOUNT.setAngle(0.0);
    	}else if(OI.getCameraBankRight()){
    		RobotMap.CAMERA_MOUNT.setAngle(180.0);
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
