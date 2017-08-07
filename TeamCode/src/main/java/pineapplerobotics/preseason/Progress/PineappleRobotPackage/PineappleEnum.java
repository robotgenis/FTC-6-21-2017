package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

/**
 * Created by ftcpi on 6/29/2017.
 */

public class PineappleEnum {

    public enum MotorLoc{
        RIGHT, LEFT, NONE
    }


    public enum Sensor {
        TOUCH
    }
    public enum PineappleSensorEnum {
        TOUCH, ODSRAWMAX, ODSRAW, ODSLIGHTDETECTED, CSRED, CSGREEN, CSBLUE, CSALPHA, CSARGB, GSX, GSY, GSZ, GSHEADING, GSROTATIONFRACTION
    }

    public enum condition{
        EQUAL, LESSTHAN, GREATERTHAN
    }
}
