package pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleResources;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensor;

/**
 * Created by ftcpi on 8/7/2017.
 */

public class PineappleColorSensor extends PineappleSensor {
    public ColorSensor pineappleColorSensor;
    private PineappleResources resources;

    public PineappleColorSensor(String name, PineappleResources pineappleResources) {
        makeSensor(name, pineappleResources);
        resources = pineappleResources;
    }

    @Override
    public void makeSensor(String name, PineappleResources pineappleResources) {
        sensorName = name;
        pineappleColorSensor = resources.hardwareMap.colorSensor.get(sensorName);
    }

    public void CSLEDToggle(boolean toggle) {
        pineappleColorSensor.enableLed(toggle);
    }

    @Override
    public double getValue(PineappleEnum.PineappleSensorEnum pineappleSensorEnum) {
        switch (pineappleSensorEnum) {
            case CSBLUE:
                return (double) pineappleColorSensor.blue();
            case CSGREEN:
                return (double) pineappleColorSensor.green();
            case CSRED:
                return (double) pineappleColorSensor.red();
            case CSALPHA:
                return (double) pineappleColorSensor.alpha();
            case CSARGB:
                return (double) pineappleColorSensor.argb();
            default:
                return 0;

        }
    }


}
