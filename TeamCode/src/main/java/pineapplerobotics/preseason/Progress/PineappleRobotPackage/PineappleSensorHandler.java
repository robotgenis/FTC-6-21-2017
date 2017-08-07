package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors.PineappleOpticalDistanceSensor;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors.PineappleTouchSensor;

/**
 * Created by young on 8/7/2017.
 */

public class PineappleSensorHandler {

    private PineappleResources resources;

    public PineappleSensorHandler(PineappleResources pineappleResources){
        resources = pineappleResources;
    }

    public PineappleTouchSensor newTouchSensor(String name){
        PineappleTouchSensor sensor = new PineappleTouchSensor(name, resources);
        return sensor;
    }

    public PineappleOpticalDistanceSensor newOpticalDistanceSensor(String name){
        PineappleOpticalDistanceSensor sensor = new PineappleOpticalDistanceSensor(name, resources);
        return sensor;
    }
}
