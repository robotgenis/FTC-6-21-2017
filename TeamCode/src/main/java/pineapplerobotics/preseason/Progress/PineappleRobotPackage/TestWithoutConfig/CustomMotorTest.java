package pineapplerobotics.preseason.Progress.PineappleRobotPackage.TestWithoutConfig;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleMotor;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleRobot;

/**
 * Created by Brandon on 6/26/2017.
 */

@TeleOp(name = "PineappleRobotTest", group = "Linear Opmode")

public class CustomMotorTest extends LinearOpMode{
    PineappleRobot robot;

    PineappleMotor testMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        robot = new PineappleRobot(this);

        testMotor = robot.motorHandler.newMotor("test", 1, true , true);

        robot.mapRobot();



        waitForStart();
        while (opModeIsActive()){

            testMotor.update(gamepad1.left_stick_x);


        }
    }
}
