package pineapplerobotics.preseason.Progress.CustomMotorPackage.TestWithoutConfig;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import pineapplerobotics.preseason.Progress.CustomMotorPackage.PineappleMotor;
import pineapplerobotics.preseason.Progress.CustomMotorPackage.PineappleRobot;

/**
 * Created by Brandon on 6/26/2017.
 */

public class CustomMotorTest extends LinearOpMode{
    PineappleRobot robot = new PineappleRobot(this);

    PineappleMotor testMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        testMotor = robot.pineappleMotorHandler.newMotor("test", 1, true , true);

        waitForStart();
        while (opModeIsActive()){

            testMotor.update(gamepad1.left_stick_x);


        }
    }
}
