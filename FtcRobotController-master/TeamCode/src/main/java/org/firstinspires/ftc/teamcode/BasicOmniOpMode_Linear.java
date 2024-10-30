

package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.drivebase.HDrive;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;



@TeleOp(name="MainCode", group="Linear OpMode")
@Disabled
public class BasicOmniOpMode_Linear extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    @Override

    // OP INIT
    public void runOpMode() {

        // Initialize the hardware variables. Note that the strings used here must correspond
        // to the names assigned during the robot configuration step on the DS or RC devices.
        //leftFrontDrive  = hardwareMap.get(DcMotor.class, "left_front_drive");
       // leftBackDrive  = hardwareMap.get(DcMotor.class, "left_back_drive");
       // rightFrontDrive = hardwareMap.get(DcMotor.class, "right_front_drive");
      //  rightBackDrive = hardwareMap.get(DcMotor.class, "right_back_drive");
        // input motors exactly as shown below

        HDrive xDrive = new HDrive();
        GamepadEx driverOp = new GamepadEx(gamepad1);


        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        // OP MODE START
        while (opModeIsActive()) {

            xDrive.driveRobotCentric(
                    driverOp.getLeftX(),
                    driverOp.getLeftY(),
                    driverOp.getRightY()
                    
            );




        }
    }}
