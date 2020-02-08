/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConst;;

public class ArcadeDriveSubsystem extends SubsystemBase {
  /**
   * Creates a new ArcadeDriveSubsystem.
   */
//Creat 6 motor controllers 
   public CANSparkMax frontLeft = new CANSparkMax(DriveConst.frontLeft, MotorType.kBrushless);
   public CANSparkMax midLeft = new CANSparkMax(DriveConst.midLeft, MotorType.kBrushless);
   public CANSparkMax backLeft = new CANSparkMax(DriveConst.backLeft, MotorType.kBrushless);
   public CANSparkMax frontRight = new CANSparkMax(DriveConst.frontRight, MotorType.kBrushless);
   public CANSparkMax midRight = new CANSparkMax(DriveConst.midRight, MotorType.kBrushless);
   public CANSparkMax backRight = new CANSparkMax(DriveConst.backRight, MotorType.kBrushless);


//Creat speed controller groups   
   public SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeft, midLeft, backLeft);
   public SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRight, midLeft, backRight);

   public DifferentialDrive robotDrive = new DifferentialDrive(leftMotors, rightMotors);



  public ArcadeDriveSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

public Object arcadeDrive(double y, double z) {
	return null;
}
}
