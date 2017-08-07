package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;

/**
 * Created by young on 8/6/2017.
 */

public abstract class PineappleSensor {

    public String sensorName;
<<<<<<< HEAD
    
    public abstract void makeSensor(String name, PineappleResources pineappleResources);
=======

    abstract void makeSensor(String name);
>>>>>>> 87dc5cf2cc09643810614fcce939ae35c4cc4981

    public abstract double getValue();
}
