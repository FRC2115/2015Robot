package org.usfirst.frc.team2115.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2115.robot.RobotMap;
import org.usfirst.frc.team2115.commands.*;

public class Chassis extends Subsystem {

    private Jaguar rightFrontJag = new Jaguar(RobotMap.RIGHT_FRONT_MOTOR), rightBackJag = new Jaguar(RobotMap.RIGHT_BACK_MOTOR),
    		leftFrontJag = new Jaguar(RobotMap.LEFT_FRONT_MOTOR), leftBackJag = new Jaguar(RobotMap.LEFT_BACK_MOTOR);
    
    private int leftDir = -1, rightDir = 1;
    
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithController());
    }

    public void driveWithController(double leftSpeed, double rightSpeed) {
//        System.out.println("LEFT: " + leftSpeed);
//        System.out.println("RIGHT: " + rightSpeed);
        leftSpeed *= leftDir;
        rightSpeed *= rightDir;
        leftFrontJag.set(-1 * leftSpeed);
        leftBackJag.set(leftSpeed);
        rightFrontJag.set(-1 * rightSpeed);
        rightBackJag.set(rightSpeed);
        
//        System.out.println("Left: " + leftJag.getRaw() + "\nRight: " + rightJag.getRaw()); //will remove
    }

    public void drive(double leftSpeed, double rightSpeed) {
        leftFrontJag.set(-1 * leftSpeed);
        leftBackJag.set(leftSpeed);
        rightFrontJag.set(-1 * rightSpeed);
        rightBackJag.set(rightSpeed);
    }

    public void stop() {
        rightFrontJag.set(0);
        rightBackJag.set(0);
        leftFrontJag.set(0);
        leftBackJag.set(0);
    }
    
    public void switchDir()
    {
        leftDir = -leftDir;
        rightDir = -rightDir;
    }
}