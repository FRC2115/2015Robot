/*
 * 
 * 
 * 
 * 
 */

package team2115.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import team2115.robot.commands.*;


public class OI {

	public Joystick leftJoy = new Joystick(0), rightJoy = new Joystick(1);
	
	public JoystickButton liftUpButton = new JoystickButton(rightJoy, 2),
			liftDownButton = new JoystickButton(rightJoy, 3);
	
/*    public JoystickButton throwBallButton = new JoystickButton(leftJoy, 1),
            liftBallButton = new JoystickButton(rightJoy, 2),
            rotate = new JoystickButton(leftJoy,4),
            lockButton = new JoystickButton(rightJoy, 3),
            switchDriveButton = new JoystickButton(rightJoy, 6);
*/    
    public OI() {
    	liftUpButton.whileHeld(new LiftUp());
    	liftDownButton.whileHeld(new LiftDown());
    	
        /*
        throwBallButton.whenPressed(new AutonomousFire());
        liftBallButton.whileHeld(new MoveLift(true));
        rotate.whileHeld(new WindTension());
        lockButton.whenPressed(new Lock());
        switchDriveButton.whenPressed(new SwitchDir());
        */
    }
	
}
