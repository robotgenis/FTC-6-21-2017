package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

/**
 * Created by Brandon on 6/26/2017.
 */

abstract public class PineappleConfig {
    public PineappleRobot robotHandler;

    abstract public void config(LinearOpMode linearOpMode);
}
