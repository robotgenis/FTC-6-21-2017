package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;

/**
 * Created by young on 8/6/2017.
 */

public class PineappleSensor {

    public PineappleEnum.Sensor sensorType;

    public String sensorName;

    public  PineappleSensor(String name, PineappleEnum.Sensor sensor){
        sensorName = name;
        sensorType = sensor;
    }

    public double getValue(){
        return 0;
    }
}
