package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/* 
** VisionCenter.java
** Author: Arman Bhalla
** Version: 1.0
** Purpose: Aligns the robot so that it is centered with a given average value.
*/

public class VisionCenter extends Command{
    public VisionCenter(double average) {
        requires(Robot.drivetrain);
        
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}