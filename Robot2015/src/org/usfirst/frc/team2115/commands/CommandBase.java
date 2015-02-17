package org.usfirst.frc.team2115.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team2115.OI;
import team2115.robot.RobotMap;
import team2115.robot.subsystems.*;

public abstract class CommandBase extends Command {
    
    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static Chassis chassis = new Chassis();
    public static Lift lift = new Lift();
	
    public static void init(){
    	// This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();
        
        
     // Show what command your subsystem is running on the SmartDashboard
//        SmartDashboard.putData(chassis);
    	
    	
    }
    
    public CommandBase(String name){
    	super(name);
    }
    
    public CommandBase(){
    	super();
    }
}
