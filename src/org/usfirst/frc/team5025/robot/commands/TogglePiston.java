package org.usfirst.frc.team5025.robot.commands;

import org.usfirst.frc.team5025.robot.OI;
import org.usfirst.frc.team5025.robot.Robot;
import org.usfirst.frc.team5025.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TogglePiston extends Command {

    public TogglePiston() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.mClawSystem);
    	RobotMap.L_CLAW_PISTON.set(DoubleSolenoid.Value.kForward);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.L_CLAW_PISTON.set(DoubleSolenoid.Value.kForward);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.R_CLAW_PISTON.set(DoubleSolenoid.Value.kForward);
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
