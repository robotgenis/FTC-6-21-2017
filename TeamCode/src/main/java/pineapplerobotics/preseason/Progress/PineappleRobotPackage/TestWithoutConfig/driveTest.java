package pineapplerobotics.preseason.Progress.PineappleRobotPackage.TestWithoutConfig;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleMotor;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleRobot;

/**
 * Created by Brandon on 7/14/2017.
 */

@TeleOp(name = "PineappleRobotDriveTest", group = "Linear Opmode")

public class DriveTest extends LinearOpMode {
    PineappleRobot robot;

    PineappleMotor left;
    PineappleMotor right;

    @Override
    public void runOpMode() throws InterruptedException {

        robot = new PineappleRobot(this);

        left = robot.motorHandler.newDriveMotor("r", 1, true , true, PineappleEnum.MotorLoc.LEFT);
        right = robot.motorHandler.newDriveMotor("l", 1, true , true, PineappleEnum.MotorLoc.RIGHT);

        robot.mapRobot();



        waitForStart();
        while (opModeIsActive()){

            robot.drive.setPower(gamepad1.left_stick_y, gamepad1.right_stick_y);

        }
    }
}
