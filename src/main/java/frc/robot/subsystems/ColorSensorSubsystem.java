/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.ColorMatch;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ColorSensConst;

public class ColorSensorSubsystem extends SubsystemBase {
  /**
   * Creates a new ColorSensorSubsystem.
   */

  public ColorSensorV3 colorSensor = new ColorSensorV3(ColorSensConst.colorSensorPort);

  public ColorMatch colorMatcher = new ColorMatch();
  public Color detectedColor = colorSensor.getColor();

  /**
   * Run the color match algorithm on our detected color
   */
   public ColorMatchResult match = colorMatcher.matchClosestColor(detectedColor);

 public ColorSensorSubsystem() {

   //Joel added:  Adds the colors to match against to the instance colorMatcher
   // This way you don't have to include them in each command
   colorMatcher.addColorMatch(ColorSensConst.blueTarget);
   colorMatcher.addColorMatch(ColorSensConst.greenTarget);
   colorMatcher.addColorMatch(ColorSensConst.redTarget);
   colorMatcher.addColorMatch(ColorSensConst.yellowTarget);

 }

 @Override
 public void periodic() {
   // This method will be called once per scheduler run
 }
}
