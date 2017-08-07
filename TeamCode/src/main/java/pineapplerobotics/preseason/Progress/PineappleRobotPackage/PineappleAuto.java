package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by young on 8/6/2017.
 */

public class PineappleAuto {

    private PineappleResources resources;

    private PineappleDrive drive;

    public PineappleAuto(PineappleResources res ,PineappleDrive drive){
        resources = res;
    }

    public void driveUntil(PineappleSensor sensor, double sensorValue, double power){
        if (sensor.getValue() < sensorValue) {
            drive.setDirectPower(power, power);
            while (sensor.getValue() < sensorValue) {

            }
            drive.stop();
        }
    }

}
