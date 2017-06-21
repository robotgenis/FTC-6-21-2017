package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brandon on 6/19/2017.
 */

public class MotorHandler {

    HardwareMap hm;
    HashMap<String, CustomMotor> Motors = new HashMap<String, CustomMotor>();

    Telemetry t;

    feedBack FeedBack;

    public MotorHandler(HardwareMap hardwareMap, Telemetry telemetry) {
        t = telemetry;
        hm = hardwareMap;
        FeedBack = new feedBack(t);
    }

    public CustomMotor newMotor(String name) {
        Motors.put(name, new CustomMotor(hm, name, -1, 1, 0, 1, false, true, FeedBack));
        return getMotor(name);
    }

    public CustomMotor newMotor(String name, double scale, boolean exp, boolean deadArea) {
        Motors.put(name, new CustomMotor(hm, name, -1, 1, 0, scale, exp, deadArea, FeedBack));
        return getMotor(name);
    }

    public CustomMotor newMotor(String name, double powerMin, double powerMax, double powerDefault, double scale, boolean exp, boolean deadArea) {
        Motors.put(name, new CustomMotor(hm, name, powerMin, powerMax, powerDefault, scale, exp, deadArea, FeedBack));
        return getMotor(name);
    }

    public CustomMotor getMotor(String name) {
        if (!Motors.containsKey(name)) {
            return null;
        } else {
            return Motors.get(name);
        }
    }

    public void mapMotors() {
        for (Map.Entry<String, CustomMotor> entry : Motors.entrySet()) {
            String name = entry.getKey();
            CustomMotor motor = entry.getValue();

            motor.mapMotor();
        }
    }

}

class feedBack{

    public boolean giveFeedBack = true;

    Telemetry t;

    public feedBack(Telemetry telemetry){
        t = telemetry;
    }

    public void sayFeedBack(String motorName, double speed){
        if(giveFeedBack){
            t.addData(motorName, speed);
        }
    }
}
