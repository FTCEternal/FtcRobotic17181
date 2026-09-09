package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class UseRobotLocationOpMode extends OpMode {

    //the new declaration with 0 mean the angle is initialized as 0
    RobotLocationPractice robotLocation = new RobotLocationPractice(0 );


    @Override
    public void init() {
        robotLocation.setAngle(0);
        robotLocation.setX(0);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            robotLocation.turnRobot(0.1);
        }
        else if (gamepad1.b) {
            robotLocation.turnRobot(-0.1);
        }

        telemetry.addData("Heading",robotLocation.getHeading());

        if(gamepad1.dpad_left) {
            robotLocation.changX(0.1);
        }
        else if (gamepad1.dpad_right) {
            robotLocation.changX(-0.1);
        }
        telemetry.addData("X value",robotLocation.getX());

    }

}
