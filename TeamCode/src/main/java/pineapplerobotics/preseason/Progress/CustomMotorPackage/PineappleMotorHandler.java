package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Brandon on 6/26/2017.
 */

public class PineappleMotorHandler {

    private HardwareMap hardwareMap;

    private PineappleStorage storage;

    private Telemetry telemetry;

    public PineappleFeedBack pineappleFeedBack;

    public PineappleMotorHandler(PineappleRobot robot) {
        storage = robot.storage;
        telemetry = robot.linearOpMode.telemetry;
        hardwareMap = robot.linearOpMode.hardwareMap;
        pineappleFeedBack = robot.pineappleFeedBack;
    }


    //Without Enum input

    public PineappleMotor newMotor(String name) {
        storage.insert(new PineappleMotor(hardwareMap, name, -1, 1, 0, 1, false, true, pineappleFeedBack, PineappleEnum.MotorLoc.NONE));
        return getMotor(name);
    }

    public PineappleMotor newMotor(String name, double scale, boolean exp, boolean deadArea) {
        storage.insert(new PineappleMotor(hardwareMap, name, -1, 1, 0, scale, exp, deadArea, pineappleFeedBack, PineappleEnum.MotorLoc.NONE));
        return getMotor(name);
    }

    public PineappleMotor newMotor(String name, double powerMin, double powerMax, double powerDefault, double scale, boolean exp, boolean deadArea) {
        storage.insert(new PineappleMotor(hardwareMap, name, powerMin, powerMax, powerDefault, scale, exp, deadArea, pineappleFeedBack, PineappleEnum.MotorLoc.NONE));
        return getMotor(name);
    }


    //With enum input
    public PineappleMotor newDriveMotor(String name, PineappleEnum.MotorLoc motorLoc) {
        storage.insert(new PineappleMotor(hardwareMap, name, -1, 1, 0, 1, false, true, pineappleFeedBack, motorLoc));
        return getMotor(name);
    }

    public PineappleMotor newDriveMotor(String name, double scale, boolean exp, boolean deadArea, PineappleEnum.MotorLoc motorLoc) {
        storage.insert(new PineappleMotor(hardwareMap, name, -1, 1, 0, scale, exp, deadArea, pineappleFeedBack, motorLoc));
        return getMotor(name);
    }

    public PineappleMotor newDriveMotor(String name, double powerMin, double powerMax, double powerDefault, double scale, boolean exp, boolean deadArea, PineappleEnum.MotorLoc motorLoc) {
        storage.insert(new PineappleMotor(hardwareMap, name, powerMin, powerMax, powerDefault, scale, exp, deadArea, pineappleFeedBack, motorLoc));
        return getMotor(name);
    }

    public PineappleMotor getMotor(String name) {
        if (!storage.motors.containsKey(name)) {
            return null;
        } else {
            return storage.motors.get(name);
        }
    }

    public void mapMotors() {
        /*HashMap<String, PineappleMotor> selects = storage.motors;

        for(Map.Entry<String, PineappleMotor> entry : selects.entrySet()) {
            String key = entry.getKey();
            PineappleMotor value = entry.getValue();
            value.mapMotor();
            // do what you have to do here
            // In your case, an other loop.
        }

        */

        if(storage.motors.isEmpty()){
            pineappleFeedBack.sayFeedBack("Emtpy Storage Error: ", 404);
        }

        Set<Map.Entry<String, PineappleMotor>> set = storage.motors.entrySet();

        for (Map.Entry<String, PineappleMotor> me : set) {
            me.getValue().mapMotor();
        }
    }

}