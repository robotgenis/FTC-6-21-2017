package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.hardware.HardwareMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Brandon on 6/19/2017.
 */

public class MotorHandler {

    HardwareMap hm;
    HashMap<String, CustomMotor> Motors = new HashMap<String, CustomMotor>();;

    public MotorHandler(HardwareMap hardwareMap){
        hm = hardwareMap;
    }

    public CustomMotor newMotor(String name){
        Motors.put(name, new CustomMotor(hm, name, -1, 1, 0 ,1 ,false, true));
        return getMotor(name);
    }

    public CustomMotor newMotor(String name, double scale, boolean exp, boolean deadArea){
        Motors.put(name, new CustomMotor(hm, name, -1, 1, 0 , scale , exp, deadArea));
        return getMotor(name);
    }

    public CustomMotor newMotor(String name, double powerMin, double powerMax, double powerDefault, double scale, boolean exp, boolean deadArea){
        Motors.put(name, new CustomMotor(hm, name, powerMin, powerMax, powerDefault , scale , exp, deadArea));
        return getMotor(name);
    }

    public CustomMotor getMotor(String name){
        if(!Motors.containsKey(name)){
            return null;
        }else{
            return Motors.get(name);
        }
    }

    public void mapMotors(){
        for(Map.Entry<String, CustomMotor> entry : Motors.entrySet()) {
            String name = entry.getKey();
            CustomMotor motor = entry.getValue();

            motor.mapMotor();
        }
    }

}
