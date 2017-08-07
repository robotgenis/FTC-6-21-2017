package pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleResources;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleRobot;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensor;

/**
 * Created by ftcpi on 8/7/2017.
 */

public class PineappleOpticalDistanceSensor extends PineappleSensor {
    public OpticalDistanceSensor opticalDistanceSensor;
    private PineappleResources resources;
    public PineappleOpticalDistanceSensor (String name, PineappleResources pineappleResources){
        makeSensor(name, pineappleResources);
        resources = pineappleResources;
    }
    @Override
    public void makeSensor(String name, PineappleResources pineappleResources) {
        sensorName = name;
        opticalDistanceSensor = resources.hardwareMap.opticalDistanceSensor.get(sensorName);
    }
    public void ODSLEDToggle(boolean toggle){
            opticalDistanceSensor.enableLed(toggle);
    }
    public double getValue(PineappleEnum.PineappleSensorEnum opticalDistanceSensorType) {
        double output;
        switch (opticalDistanceSensorType) {
            case ODSRAWMAX:
                output = opticalDistanceSensor.getRawLightDetectedMax();
                break;
            case ODSRAW:
                output = opticalDistanceSensor.getRawLightDetected();
                break;
            case ODSLIGHTDETECTED:
                output= opticalDistanceSensor.getLightDetected();
                break;
            default:
                output=0;
                break;
        }
        return output;
    }
}
