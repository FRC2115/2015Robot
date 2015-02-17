package team2115.robot.commands;

public class Drive extends CommandBase {

    private double timeout, leftSpeed, rightSpeed;

    public Drive(double time, double leftSpeed, double rightSpeed) {
        requires(chassis);
        timeout = time;
        this.rightSpeed = rightSpeed * -1;
        this.leftSpeed = leftSpeed;
    }
    
    public Drive(double time, double speed)
    {
        requires(chassis);
        timeout= time;
        rightSpeed = speed *-1;
        leftSpeed = speed;
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(timeout);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        chassis.drive(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        chassis.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
