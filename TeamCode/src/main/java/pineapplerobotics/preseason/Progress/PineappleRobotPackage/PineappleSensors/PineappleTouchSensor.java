package pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.TouchSensor;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleResources;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleRobot;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensor;

/**
 * Created by ftcpi on 8/7/2017.
 */

public class PineappleTouchSensor extends PineappleSensor {
    public TouchSensor  touchSensor;
    private PineappleResources resources;
    public PineappleTouchSensor (String name, PineappleResources pineappleResources){
        makeSensor(name, pineappleResources);
        resources = pineappleResources;
    }
    @Override
    public void makeSensor(String name, PineappleResources pineappleResources) {
        sensorName = name;
        touchSensor = resources.hardwareMap.touchSensor.get(sensorName);
    }

    @Override
    public double getValue() {
        if (touchSensor.isPressed()) {
            return 1;
        } else{
            return 0;
        }

    }
}
