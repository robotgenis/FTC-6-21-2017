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
        setMotor(PineappleEnum.MotorLoc.LEFT, leftPower);
        setMotor(PineappleEnum.MotorLoc.RIGHT, rightPower);
    }

    void setMotor(PineappleEnum.MotorLoc location, double power){
        ArrayList<PineappleMotor> motors = resources.storage.getDrivemotors(location);
        for (PineappleMotor motor : motors) {
            motor.setDirectPower(power);
        }
    }

}
