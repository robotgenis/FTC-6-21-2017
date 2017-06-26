package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Brandon on 6/26/2017.
 */

public class PineappleRobot {

    private HardwareMap hardwareMap;
    private Telemetry telemetry;

    public MotorHandler motorHandler;

    public PineappleRobot(HardwareMap hm, Telemetry t){
        motorHandler = new MotorHandler(hardwareMap, telemetry);
    }

    public void mapRobot(){
        motorHandler.mapMotors();
    }

}


class FeedBack {

    public boolean giveFeedBack = true;

    public Telemetry telemetry;

    public FeedBack(Telemetry t){
        telemetry = t;
    }

    public void sayFeedBack(String objectName, double amount){
        if(giveFeedBack){
            telemetry.addData(objectName, amount);
        }
    }
}

