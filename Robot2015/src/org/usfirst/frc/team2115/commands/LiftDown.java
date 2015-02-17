package team2115.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import team2115.robot.subsystems.Lift;

public class LiftDown extends CommandBase
{
	public LiftDown(){
		requires(lift);
	}
	
	protected void initialize() {
		lift.moveLift(Lift.DOWN);
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
