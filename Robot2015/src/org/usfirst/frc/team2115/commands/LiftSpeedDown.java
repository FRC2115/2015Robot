package team2115.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class LiftSpeedDown extends CommandBase {
	
	public LiftSpeedDown(){
		requires(lift);
	}
	
	protected void initialize() {
		lift.changeSpeed(-lift.SPEED_CHANGE);
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

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}
