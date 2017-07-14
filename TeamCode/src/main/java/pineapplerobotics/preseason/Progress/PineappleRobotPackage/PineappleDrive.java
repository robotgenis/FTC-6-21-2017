package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import java.util.ArrayList;

import pineapplerobotics.preseason.Progress.PineappleGamepadPackage.PineappleLinearOpMode;

/**
 * Created by ftcpi on 6/29/2017.
 */

public class PineappleDrive {

    private PineappleResources resources;

    public PineappleDrive(PineappleResources res){
        resources = res;
    }

    public void setPower(double leftPower, double rightPower){
        setMotor(PineappleEnum.MotorLoc.LEFT, leftPower, false);
        setMotor(PineappleEnum.MotorLoc.RIGHT, rightPower, false);
    }

    public void setDirectPower(double leftPower, double rightPower){
        setMotor(PineappleEnum.MotorLoc.LEFT, leftPower, true);
        setMotor(PineappleEnum.MotorLoc.RIGHT, rightPower, true);
    }

    void setMotor(PineappleEnum.MotorLoc location, double power, boolean direct){
        ArrayList<PineappleMotor> motors = resources.storage.getDrivemotors(location);
        for (PineappleMotor motor : motors) {
            if(direct){
                motor.setDirectPower(power);
            }else {
                motor.setPower(power);
            }
        }
    }

}
