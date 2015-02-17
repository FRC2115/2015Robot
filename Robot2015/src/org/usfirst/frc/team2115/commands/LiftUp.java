package team2115.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class LiftUp extends CommandBase
{	
	public LiftUp() {
		requires(lift);
	}
	
	protected void initialize() {
		lift.moveLift(Lift.UP);
	}
	
	protected void end() {
		lift.stop();
	}
	
	protected void interrupted() {
		lift.stop();
	}
	
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
