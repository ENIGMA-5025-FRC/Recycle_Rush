package org.usfirst.frc.team5025.robot.subsystems;

import org.usfirst.frc.team5025.robot.commands.LiftManualCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new LiftManualCommand());
    }
}

