/* 
** RetrieveCP.java
** Author: Arman B.
** Version 1.0
** Purpose: Retrieves the co-ordinates from my code running on the co-processor.
*/

package frc.robot.vis;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class RetrieveCP {
    
    NetworkTable centroidNetworkTable;

    public RetrieveCP() {
        centroidNetworkTable = NetworkTable.getTable("rocket-port-targets");
    }

    public double[] getLeft() {
        return centroidNetworkTable.getValue("LeftCentroid").getDoubleArray();
    }

    public double[] getRight() {
        return centroidNetworkTable.getValue("RightCentroid").getDoubleArray();
    }

}