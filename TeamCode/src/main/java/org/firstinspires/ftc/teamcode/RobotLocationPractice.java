package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {

    double angle;
    double x;

    //constructor method
    public RobotLocationPractice(double angle) {
        this.angle=angle;
    }

    /* alternative way to allow all 3 value to be initialized
    public RobotLocationPractice(double angle, double x, double y) {
        this.angle = angle;
        this.x = x;
        this.y = y;
    }
    */


    //method 1
    public double getHeading () {
        // this method normalizes robot heading between -180 and 180
        double angle = this.angle;
        while (angle >180) {
            angle -=360;
        }

        while (angle <=180) {
            angle += 360;
        }
        return angle;
    }

    //method 2
    public void turnRobot(double angleChange) {
        angle +=angleChange;
    }

    //method 3
    public void setAngle(double angle) {
        this.angle=angle;
    }


    //method 4
    public double getAngle() {
        return this.angle;
    }

//------------------------------
    public void changX(double changeAmount) {
        x += changeAmount;
    }

    public void setX(double x) {
        this.x=x;
    }
    public double getX() {
        return this.x;
    }

}
