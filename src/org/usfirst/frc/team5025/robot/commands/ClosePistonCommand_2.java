package org.usfirst.frc.team5025.robot.commands;

import org.usfirst.frc.team5025.robot.Robot;
import org.usfirst.frc.team5025.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClosePistonCommand_2 extends Command {

    public ClosePistonCommand_2() {
    	requires(Robot.mClawSystem2);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	RobotMap.L_CLAW_PISTON.set(DoubleSolenoid.Value.kReverse);
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
