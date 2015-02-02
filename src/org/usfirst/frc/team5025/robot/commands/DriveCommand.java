package org.usfirst.frc.team5025.robot.commands;

import org.usfirst.frc.team5025.robot.OI;
import org.usfirst.frc.team5025.robot.Robot;
import org.usfirst.frc.team5025.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {
	
	private RobotDrive mDrive = new RobotDrive(RobotMap.L_FRONT_MOTOR, RobotMap.L_REAR_MOTOR, RobotMap.R_FRONT_MOTOR, RobotMap.R_REAR_MOTOR);

    public DriveCommand() {
    	requires(Robot.mDriveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	mDrive.mecanumDrive_Cartesian(OI.getDriverX(), OI.getDriverZ(), OI.getDriverY(), 0);
    }
    
    /*In case execute doesn't work, use this and call it in teleopPeriodic*/
    public void bypassRun(){
    	mDrive.mecanumDrive_Cartesian(OI.getDriverX(), OI.getDriverZ(), OI.getDriverY(), 0.0);
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
