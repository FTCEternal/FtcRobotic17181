/* template
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp

//Class Name, capital first word
public class IfPractice extends OpMode {

    @Override
    public void init() {
    }

    @Override
    public void loop() {

    }
}
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp

//Class Name, capital first word
public class IfPractice extends OpMode {

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        boolean aButton=gamepad1.a;

        if (aButton) {
            telemetry.addData("A Button","Pressed");
        }
        else if (gamepad1.b) {
            telemetry.addData("B Button","Pressed");
        }
        else {
            telemetry.addData("A/B Button","Not Pressed");
        }
        telemetry.addData("A Button State",aButton);

        //make a turbo button, if a button is not pressed, motor speed by 0.5. otherwise, the standard speed
        double motorSpeed=gamepad1.left_stick_y;
        if (!aButton) {
            motorSpeed *= 0.5;
        }
    }
}

/*
&& --- AND
|| --- OR
!  --- NOT
 */