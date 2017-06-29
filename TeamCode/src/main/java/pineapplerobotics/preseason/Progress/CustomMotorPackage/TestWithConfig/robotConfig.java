package pineapplerobotics.preseason.Progress.CustomMotorPackage.TestWithConfig;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import pineapplerobotics.preseason.Progress.CustomMotorPackage.PineappleMotor;
import pineapplerobotics.preseason.Progress.CustomMotorPackage.PineappleConfig;
import pineapplerobotics.preseason.Progress.CustomMotorPackage.PineappleRobot;

/**
 * Created by Brandon on 6/26/2017.
 */

public class robotConfig extends PineappleConfig {

    public PineappleMotor testMotor;

    public void config(LinearOpMode linearOpMode){
        robotHandler = new PineappleRobot(linearOpMode);
        testMotor = robotHandler.pineappleMotorHandler.newMotor("testMotor");
        robotHandler.mapRobot();
    }
}
