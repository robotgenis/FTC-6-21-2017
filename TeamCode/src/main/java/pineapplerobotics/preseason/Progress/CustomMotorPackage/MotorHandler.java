package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brandon on 6/26/2017.
 */

public class MotorHandler {

    private HardwareMap hardwareMap;
    private HashMap<String, CustomMotor> Motors = new HashMap<String, CustomMotor>();

    private Telemetry telemetry;

    private FeedBack feedBack;

    public MotorHandler(HardwareMap hm, Telemetry t) {
        telemetry = t;
        hardwareMap = hm;
        feedBack = new FeedBack(t);
    }

    public CustomMotor newMotor(String name) {
        Motors.put(name, new CustomMotor(hardwareMap, name, -1, 1, 0, 1, false, true, feedBack));
        return getMotor(name);
    }

    public CustomMotor newMotor(String name, double scale, boolean exp, boolean deadArea) {
        Motors.put(name, new CustomMotor(hardwareMap, name, -1, 1, 0, scale, exp, deadArea, feedBack));
        return getMotor(name);
    }

    public CustomMotor newMotor(String name, double powerMin, double powerMax, double powerDefault, double scale, boolean exp, boolean deadArea) {
        Motors.put(name, new CustomMotor(hardwareMap, name, powerMin, powerMax, powerDefault, scale, exp, deadArea, feedBack));
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