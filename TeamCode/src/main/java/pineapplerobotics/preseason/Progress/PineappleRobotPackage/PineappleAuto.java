package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * Created by young on 8/6/2017.
 */

public class PineappleAuto {

    private PineappleResources resources;

    private PineappleDrive drive;

    public PineappleAuto(PineappleResources res ,PineappleDrive drive){
        resources = res;
        this.drive = drive;
    }

    public void driveUntil(PineappleSensor sensor, PineappleEnum.PineappleSensorEnum sensorEnum, PineappleEnum.condition condition,double sensorValue, double power){
        if(checkCondition(sensor.getValue(sensorEnum), sensorValue, condition)){
//            drive.setMotor(PineappleEnum.MotorLoc.RIGHT, power, true);
            drive.setMotor(PineappleEnum.MotorLoc.LEFT, power, true);
            while (checkCondition(sensor.getValue(sensorEnum), sensorValue, condition)){
                resources.feedBack.sayFeedBack(sensor.sensorName, sensor.getValue(sensorEnum));
            }

            drive.stop();
        }
    }

    private boolean checkCondition(double sensorValue, double conditionValue, PineappleEnum.condition condition){
        switch (condition) {
            case EQUAL:
                if(sensorValue == conditionValue){
                    return false;
                }
                break;
            case LESSTHAN:
                if(sensorValue < conditionValue){
                    return false;
                }
                break;
            case GREATERTHAN:
                if(sensorValue > conditionValue){
                    return false;
                }
                break;
        }
        return true;
    }

}
