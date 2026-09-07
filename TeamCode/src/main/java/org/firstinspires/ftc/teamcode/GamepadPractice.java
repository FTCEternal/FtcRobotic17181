package org.firstinspires.ftc.teamcode; //put a dummy comment

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@Disabled
@TeleOp
public class GamepadPractice extends OpMode {

    @Override
    public void init() {

    }

    //hold start button + a to recognize the gamepad as gamepad1
    //hold start button + b to recognize the gamepad as gamepad2
    @Override
    public void loop() {
        // run 2 times of the second
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double differenceX = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.right_trigger + gamepad1.left_trigger;

        telemetry.addData("left x",gamepad1.left_stick_x);
        telemetry.addData("left y",speedForward);
        telemetry.addData("right x",gamepad1.right_stick_x);
        telemetry.addData("right y",gamepad1.right_stick_y);
        telemetry.addData("difference x",differenceX);
        telemetry.addData("Sum Trigger",sumTriggers);


        telemetry.addData("a button",gamepad1.a);
        telemetry.addData("b button", gamepad1.b);

    }



}
