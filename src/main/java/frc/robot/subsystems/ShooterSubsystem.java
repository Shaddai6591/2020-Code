/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConst;

public class ShooterSubsystem extends SubsystemBase {
  /**
   * Creates a new ShooterSubsystem.
   */

   //Creat shooter motor
  public CANSparkMax shooterMotor = new CANSparkMax(ShooterConst.shooterMotor, MotorType.kBrushless);

 
  

  public ShooterSubsystem() {


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
public Object shoot(double slider) {
shooterMotor.set(slider);
    return slider;
}
}
