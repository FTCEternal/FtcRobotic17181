package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

//Class Name, capital first word
public class VariablePractice extends OpMode {
    /*data types example
    int robotHeight;
    double motoSpeed;
    boolean clawClosed;
    robotHeight = 10;
    motoSpeed = 0.5;
    clawClosed =true;
     */
    @Override
    public void init() {
        //Variable name, lower first Word, upper Second word
        int teamNumber =17181;
        string teamName = "Vibranium Vikings";
        double motoSpeed = 0.75;
        boolean clawClosed = true;
        string coachName="Nihar";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Team Name", teamName);
        telemetry.addData("motor speed", motoSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("coach",coachName);
    }

    @Override
    public void loop() {

    }
}
