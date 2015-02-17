package team2115.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	
	public static final int
	 // Sim Vex Motors
		RIGHT_FRONT_MOTOR = 1,
		RIGHT_BACK_MOTOR = 2, //NEEDS TO BE INVERTED
		LEFT_BACK_MOTOR = 3, //NEEDS TO BE INVERTED
		LEFT_FRONT_MOTOR = 4,
	 // Chain Motors
		FRONT_CHAIN_MOTOR = 5,
		BACK_CHAIN_MOTOR = 6;
//		LEFT_CHAIN_MOTOR = 1 or 5;
//		RIGHT_CHAIN_MOTOR = 2 or 6;
	
	
}
