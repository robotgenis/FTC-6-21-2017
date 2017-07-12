package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Brandon on 6/26/2017.
 */

public class PineappleRobot {

    public PineappleMotorHandler motorHandler;

    public PineappleStorage storage;

    public LinearOpMode linearOpMode;

    public PineappleFeedBack pineappleFeedBack;

    public PineappleRobot(LinearOpMode LOM){
        linearOpMode = LOM;
        storage = new PineappleStorage();
        motorHandler = new PineappleMotorHandler(this);
        pineappleFeedBack = new PineappleFeedBack(linearOpMode.telemetry);
    }

    public void mapRobot(){
        motorHandler.mapMotors();
    }

}


