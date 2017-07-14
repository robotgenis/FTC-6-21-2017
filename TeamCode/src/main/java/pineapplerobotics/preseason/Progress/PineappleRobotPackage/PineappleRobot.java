package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Brandon on 6/26/2017.
 */

public class PineappleRobot {

    public PineappleMotorHandler motorHandler;

    public PineappleDrive drive;

    private PineappleResources resources;

    public PineappleRobot(LinearOpMode LOM){
        resources = new PineappleResources(LOM);
        motorHandler = new PineappleMotorHandler(resources);
        drive = new PineappleDrive(resources);
    }

    public void mapRobot(){
        motorHandler.mapMotors();
    }

}


