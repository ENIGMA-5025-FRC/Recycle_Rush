
package org.usfirst.frc.team5025.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.image.NIVisionException;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.vision.USBCamera;
import edu.wpi.first.wpilibj.CameraServer;

import org.usfirst.frc.team5025.robot.commands.CameraMoveCommand;
import org.usfirst.frc.team5025.robot.commands.DriveCommand;
import org.usfirst.frc.team5025.robot.commands.ExampleCommand;
import org.usfirst.frc.team5025.robot.commands.LiftManualCommand;
import org.usfirst.frc.team5025.robot.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static final DriveSubsystem mDriveSubsystem = new DriveSubsystem();
	public static final LiftSubsystem mLiftSystem = new LiftSubsystem();
	public static final ClawSubsystem mClawSystem = new ClawSubsystem();
	public static final ClawSubsystem_2 mClawSystem2 = new ClawSubsystem_2();
	public static OI oi;
	
	Compressor comp = new Compressor(0);

	//CameraServer server;
    Command autonomousCommand;
    Command driveCommand;
    Command manualLiftCommand;
    Command manualCameraControl;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();
        driveCommand = new DriveCommand();
        manualLiftCommand = new LiftManualCommand();
        manualCameraControl = new CameraMoveCommand();
        //server = CameraServer.getInstance();
		//server.setQuality(50);
		//server.startAutomaticCapture("cam0");
		comp.setClosedLoopControl(true);
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
        Timer t = new Timer();
        RobotDrive drive = new RobotDrive(1,  2, 3, 4);
        t.start();
        while(t.get() < 2.0){
        	drive.drive(0.8, 0.0);
        }
        t.stop();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        if(driveCommand != null)driveCommand.start();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	((DriveCommand) driveCommand).bypassRun();
    	((LiftManualCommand)manualLiftCommand).manualRun();
    	((CameraMoveCommand)manualCameraControl).manualRun();
        Scheduler.getInstance().run(); 
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
