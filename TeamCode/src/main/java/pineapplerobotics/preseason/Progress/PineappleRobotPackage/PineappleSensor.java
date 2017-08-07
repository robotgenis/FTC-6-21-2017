package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;

/**
 * Created by young on 8/6/2017.
 */

abstract class PineappleSensor {

    public String sensorName;
    
    abstract void makeSensor(String name);

    abstract void getValue();
}
