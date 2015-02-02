package org.usfirst.frc.team5025.robot.subsystems;

import org.usfirst.frc.team5025.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveCommand());
    }
}

