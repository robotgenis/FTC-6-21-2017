package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Brandon on 6/26/2017.
 */

public class PineappleRobot {

    public PineappleMotorHandler pineappleMotorHandler;

    public PineappleStorage storage;

    public LinearOpMode linearOpMode;

    public PineappleFeedBack pineappleFeedBack;

    public PineappleRobot(LinearOpMode LOM){
        linearOpMode = LOM;
        pineappleMotorHandler = new PineappleMotorHandler(this);
    }

    public void mapRobot(){
        pineappleMotorHandler.mapMotors();
    }

}


