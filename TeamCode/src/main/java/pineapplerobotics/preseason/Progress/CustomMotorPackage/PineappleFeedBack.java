package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by ftcpi on 6/29/2017.
 */

public class PineappleFeedBack {

    public boolean giveFeedBack = true;

    public Telemetry telemetry;

    public PineappleFeedBack(Telemetry t){
        telemetry = t;
    }

    public void sayFeedBack(String objectName, double amount){
        if(giveFeedBack){
            telemetry.addData(objectName, amount);
        }
    }
}

