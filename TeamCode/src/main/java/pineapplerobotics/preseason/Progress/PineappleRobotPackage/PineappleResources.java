package pineapplerobotics.preseason.Progress.PineappleRobotPackage;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by Brandon on 7/12/2017.
 */

//This will be added after testing of the motor handler and will control all local handlers that are needed by many classes like
    //telemetry and storage

public class PineappleResources {

    /////////
    //LOCAL//
    /////////

    PineappleStorage storage;

    PineappleFeedBack pineappleFeedBack;

    LinearOpMode linearOpMode;

    Telemetry telemetry;

    HardwareMap hardwareMap;

}
