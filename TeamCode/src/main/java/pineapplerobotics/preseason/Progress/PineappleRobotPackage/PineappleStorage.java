package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ftcpi on 6/29/2017.
 */

public class PineappleStorage {

    public HashMap<PineappleEnum.MotorLoc, PineappleMotor> driveMotors = new HashMap<PineappleEnum.MotorLoc, PineappleMotor>();

    public HashMap<String, PineappleMotor> motors = new HashMap<String, PineappleMotor>();

    public void insert(PineappleMotor motor){
        if(motor.motorLoc == PineappleEnum.MotorLoc.RIGHT || motor.motorLoc == PineappleEnum.MotorLoc.LEFT){
            driveMotors.put(motor.motorLoc, motor);
        }
        motors.put(motor.motorName, motor);
    }

    public ArrayList<PineappleMotor> getDrivemotors(PineappleEnum.MotorLoc motorLoc){
        ArrayList<PineappleMotor> returnMotors = new ArrayList<PineappleMotor>();
        for (Map.Entry<PineappleEnum.MotorLoc, PineappleMotor> entry : driveMotors.entrySet()) {
            PineappleEnum.MotorLoc loc = entry.getKey();
            PineappleMotor motor = entry.getValue();
            if(loc == motorLoc){
                returnMotors.add(motor);
            }


        }
        return returnMotors;
    }

}
