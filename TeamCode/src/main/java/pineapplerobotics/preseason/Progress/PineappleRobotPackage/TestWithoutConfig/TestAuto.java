package pineapplerobotics.preseason.Progress.PineappleRobotPackage.TestWithoutConfig;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleEnum;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleMotor;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleRobot;
import pineapplerobotics.preseason.Progress.PineappleRobotPackage.PineappleSensors.PineappleGyroSensor;

/**
 * Created by Brandon on 8/14/2017.
 */

public class TestAuto extends LinearOpMode{

    PineappleRobot robot;

    PineappleMotor left;
    PineappleMotor right;

    PineappleGyroSensor gyro;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new PineappleRobot(this);

        left = robot.motorHandler.newDriveMotor("left", 2, false, false, PineappleEnum.MotorLoc.LEFT, PineappleEnum.MotorType.NEV40);
        right = robot.motorHandler.newDriveMotor("right", 2, false, false, PineappleEnum.MotorLoc.RIGHT, PineappleEnum.MotorType.NEV40);

        gyro = robot.sensorHandler.newGyroSensor("g");

        waitForStart();

        robot.auto.driveUntil(gyro, PineappleEnum.PineappleSensorEnum.GSHEADING, PineappleEnum.condition.GREATERTHAN, 10, .2);

    }
}
