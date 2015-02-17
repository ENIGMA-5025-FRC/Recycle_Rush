package org.usfirst.frc.team5025.robot.subsystems;

import org.usfirst.frc.team5025.robot.commands.TogglePiston_2;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClawSubsystem_2 extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new TogglePiston_2());
    }
}

