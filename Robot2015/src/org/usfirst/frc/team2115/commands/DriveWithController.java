package org.usfirst.frc.team2115.commands;



public class DriveWithController extends CommandBase {

	public DriveWithController() {
        requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //HARDCORE-SAUR MODE              Play with these numbersvvv
        chassis.driveWithController(CommandBase.oi.leftJoy.getRawAxis(0), CommandBase.oi.rightJoy.getRawAxis(2));
        
        //BABY MODE
//        chassis.driveWithJoystick(CommandBase.oi.leftJoy.getRawAxis(2) - CommandBase.oi.rightJoy.getRawAxis(1), 
//                                  CommandBase.oi.leftJoy.getRawAxis(2) + CommandBase.oi.rightJoy.getRawAxis(1));
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
