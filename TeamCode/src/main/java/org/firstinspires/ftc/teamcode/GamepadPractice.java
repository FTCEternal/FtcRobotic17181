package org.firstinspires.ftc.teamcode; //put a dummy comment

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
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
        double speedForward = gamepad1.left_stick_y / 2.0;  //make it half power
        double diffXJoysticks = gamepad1.left_stick_x-gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger+gamepad1.right_trigger;

        telemetry.addData("left stick x",gamepad1.left_stick_x);
        telemetry.addData("left stick y",gamepad1.left_stick_y);
        telemetry.addData("a button",gamepad1.a);

        telemetry.addData("speed forward",speedForward);
        telemetry.addData("difference x",diffXJoysticks);
        telemetry.addData("sum triggers",sumTriggers);

    }
}
