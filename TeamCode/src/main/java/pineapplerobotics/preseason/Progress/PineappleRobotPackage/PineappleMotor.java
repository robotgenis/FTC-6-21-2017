package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Brandon on 6/19/2017.
 */

public class PineappleMotor {

    public PineappleEnum.MotorLoc motorLoc = PineappleEnum.MotorLoc.NONE;

    public double maxPower = 1;
    public double minPower = -1;

    public double defaultPower = 0;

    public double scaleBy = 1;

    public boolean exponetional = false;

    public boolean doDeadArea = false;

    private final double[] deadAreaArray = {0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.8, 0.9, 1.0};

    public DcMotor motorObject;
    public String motorName;

    private PineappleResources resources;

    public PineappleMotor(PineappleResources res, String name, double powerMin, double powerMax, double powerDefault, double scale, boolean exp, boolean deadArea, PineappleEnum.MotorLoc loc) {
        resources = res;
        motorLoc = loc;
        maxPower = powerMax;
        minPower = powerMin;
        defaultPower = powerDefault;
        scaleBy = scale;
        exponetional = exp;
        doDeadArea = deadArea;
        motorName = name;
    }

    public void mapMotor() {
        motorObject = resources.hardwareMap.dcMotor.get(motorName);
    }

    ///////////////////////
    //Set Power Functions//
    ///////////////////////

    double setPower(double power) {
        power = fixValue(power);
        resources.feedBack.sayFeedBack(motorName, power);
        motorObject.setPower(power);
        return power;
    }

    void setDirectPower(double power){
        motorObject.setPower(power);
    }

    public double update(double power) {
        return setPower(power);
    }

    public double update(boolean on) {
        if (on) return setPower(maxPower);
        else return setPower(defaultPower);
    }

    public double update(boolean forward, boolean backward) {
        if (forward) return setPower(maxPower);
        else if (backward) return setPower(minPower);
        else return setPower(defaultPower);
    }

    /////////////////////
    //Private Functions//
    /////////////////////

    private double fixValue(double input) {
        input = scale(input);
        input = deadArea(input);
        input = clip(input);
        return input;
    }

    private double deadArea(double input) {
        if (doDeadArea) {
            boolean pos = true;
            if (input < 0) {
                pos = false;
            }
            input = Math.abs(input);

            double last = 10000;
            double now = 0;
            double output = 0;

            for (int i = 0; i < deadAreaArray.length; i++) {
                now = deadAreaArray[i] - input;
                now = Math.abs(now);
                if (now < last) {
                    last = now;
                    output = deadAreaArray[i];
                }
            }

            if (pos == false) {
                output = -output;
            }

            return output;
        } else {
            return input;
        }
    }

    private double scale(double input) {
        input = input * scaleBy;
        if (exponetional) input = input * input;
        return input;
    }

    private double clip(double input) {
        input = Range.clip(input, minPower, maxPower);
        input = Range.clip(input, -1, 1);
        return input;
    }

}
