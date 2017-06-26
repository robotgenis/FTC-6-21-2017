
package pineapplerobotics.preseason.Progress.CustomMotorPackage.TestWithConfig;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import pineapplerobotics.preseason.Progress.CustomMotorPackage.TestWithConfig.robotConfig;

/**
 * Created by Brandon on 3/31/2017.
 */

@TeleOp(name = "BlankLinearOpMode", group = "Linear Opmode")
@Disabled


public class CustomMotorTest extends com.qualcomm.robotcore.eventloop.opmode.LinearOpMode {

    robotConfig r = new robotConfig();

    @Override
    public void runOpMode() throws InterruptedException {

        r.config(hardwareMap, telemetry);

        waitForStart();

        while (opModeIsActive()) {

            r.testMotor.update(gamepad1.left_stick_x);


        }
    }

}

