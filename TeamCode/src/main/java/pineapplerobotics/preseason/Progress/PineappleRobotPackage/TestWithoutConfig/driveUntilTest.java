package pineapplerobotics.preseason.Progress.PineappleRobotPackage.TestWithoutConfig;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleMotor;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleRobot;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors.PineappleColorSensor;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors.PineappleTouchSensor;

/**
 * Created by young on 8/7/2017.
 */
@TeleOp(name = "PineappleRobotDriveUntil", group = "Linear Opmode")


public class driveUntilTest extends LinearOpMode {
    PineappleRobot robot;

    PineappleMotor motor;
    PineappleColorSensor colorSensor;

    @Override
    public void runOpMode() throws InterruptedException {

        robot = new PineappleRobot(this);

        motor = robot.motorHandler.newDriveMotor("motor", 1, true , true, PineappleEnum.MotorLoc.LEFT, PineappleEnum.MotorType.NEV40);

        colorSensor = robot.sensorHandler.newColorSensor("c");

        robot.mapRobot();

        waitForStart();

        robot.auto.driveUntil(colorSensor, PineappleEnum.PineappleSensorEnum.CSBLUE, PineappleEnum.condition.GREATERTHAN, 10, .3);
    }
}
