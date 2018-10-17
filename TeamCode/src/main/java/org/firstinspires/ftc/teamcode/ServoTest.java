package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Basic: Servo", group="Linear Opmode")

public class ServoTest extends LinearOpMode{
    private ElapsedTime runtime = new ElapsedTime();

    private CRServo rightServo;
    private CRServo leftServo;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        rightServo = hardwareMap.get(CRServo.class, "rServo");
        leftServo = hardwareMap.get(CRServo.class, "lServo");

        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            // Setup a variable for each drive wheel to save power level for telemetry


            if(gamepad1.dpad_up){

            }


            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: " + runtime.toString());
           // telemetry.addData("Motors", "left (%.2f), right (%.2f)", leftPower, rightPower);
            telemetry.addData("JoySticks", "left, right", -gamepad1.left_stick_y, gamepad1.right_stick_x);
            telemetry.update();
        }
    }

}
