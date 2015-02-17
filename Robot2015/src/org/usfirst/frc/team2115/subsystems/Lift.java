package org.usfirst.frc.team2115.subsystems;

import org.usfirst.frc.team2115.robot.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;

public class Lift extends Subsystem {
	
	public static final boolean UP = true, DOWN = false;
	public static final float SPEED_CHANGE = 0.25f;
	
	private Jaguar frontLiftJag = new Jaguar(RobotMap.FRONT_CHAIN_MOTOR);
			//backLiftJag = new Jaguar(RobotMap.BACK_CHAIN_MOTOR);
	private float speed = 0.0f; // changed
	
	public void initDefaultCommand() {
	}
	
	public void changeSpeed(float f){
		speed += f;
		
		// changed
		// limit speed to range [-1, 1]
		if(speed < -1) speed = -1;
		if(speed >  1) speed =  1;
	}
	
	public void stop(){
		frontLiftJag.set(0);
		//backLiftJag.set(0);
	}
	
	public void moveLift(boolean b){
		if(b == UP){
			frontLiftJag.set(speed);
			//backLiftJag.set(speed);
		}
		
		else{
			frontLiftJag.set(speed); // changed
			//backLiftJag.set(speed);
		}
		
	}
	
	
	
}
