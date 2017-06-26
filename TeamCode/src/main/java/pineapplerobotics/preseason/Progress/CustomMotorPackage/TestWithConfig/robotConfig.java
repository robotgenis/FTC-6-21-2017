package pineapplerobotics.preseason.Progress.CustomMotorPackage.TestWithConfig;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import pineapplerobotics.preseason.Progress.CustomMotorPackage.CustomMotor;
import pineapplerobotics.preseason.Progress.CustomMotorPackage.PineappleConfig;
import pineapplerobotics.preseason.Progress.CustomMotorPackage.PineappleRobot;

/**
 * Created by Brandon on 6/26/2017.
 */

public class robotConfig extends PineappleConfig {

    public CustomMotor testMotor;

    public void config(HardwareMap hm, Telemetry t){
        robotHandler = new PineappleRobot(hm, t);
        testMotor = robotHandler.motorHandler.newMotor("testMotor");
    }
}
