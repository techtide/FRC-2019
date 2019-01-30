package frc.robot.commands; 

import frc.robot.vis.RetrieveCP;
import edu.wpi.first.wpilibj.command.CommandGroup;

/* 
** VisionAlign.java
** Author: Arman Bhalla
** Version: 1.0
** Purpose: Moves the robot in accordance with the feedback provided from my code on the co-processor.
*/

public class VisionAlign extends CommandGroup {
    private RetrieveCP retrieveCP;

    private double[] leftCentroidPoint;
    private double[] rightCentroidPoint;

    public VisionAlign() {
        // Ensure that this is consistent with my co-processor code.

        retrieveCP = new RetrieveCP();

        leftCentroidPoint = getLeftTargetInfo();
        rightCentroidPoint = getRightTargetInfo();

        addSequential(new VisionCenter(findAverage()));
    }

    private double findAverage() {
        return (double)(leftCentroidPoint[0]/rightCentroidPoint[0]);
    }

    private double[] getLeftTargetInfo() {
        // Gets the LEFT vision target in respect to the robot's port (from facing north).
        return retrieveCP.getLeft();
    }

    private double[] getRightTargetInfo() {
        // Gets the RIGHT vision target in respect to the robot's port (from facing north).
        return retrieveCP.getRight();
    }
}