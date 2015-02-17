package org.usfirst.frc.team5025.robot.subsystems;

import org.usfirst.frc.team5025.robot.commands.TogglePiston;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClawSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TogglePiston());
    }
}

