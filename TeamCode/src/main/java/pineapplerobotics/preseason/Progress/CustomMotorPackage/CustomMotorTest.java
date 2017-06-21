
package pineapplerobotics.preseason.Progress.CustomMotorPackage;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Brandon on 3/31/2017.
 */

@TeleOp(name = "BlankLinearOpMode", group = "Linear Opmode")
@Disabled


public class CustomMotorTest extends com.qualcomm.robotcore.eventloop.opmode.LinearOpMode {

    MotorHandler motors;

    CustomMotor testMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        motors = new MotorHandler(hardwareMap, telemetry);

        testMotor = motors.newMotor("test", 1, true, true);

        motors.mapMotors();

        waitForStart();

        while (opModeIsActive()) {

            testMotor.update(gamepad1.left_stick_x);


        }
    }

}

