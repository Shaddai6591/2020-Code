/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.ArcadeDriveSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  public static ArcadeDriveSubsystem arcadeDriveSubsystem = new ArcadeDriveSubsystem();
  public static ShooterSubsystem shooterSubsystem = new ShooterSubsystem();

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public static Joystick leftJoystick = new Joystick(Constants.leftJoystickPort);
  public static Joystick rightJoystick = new Joystick(Constants.rightJoystickPort);

  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    arcadeDriveSubsystem.setDefaultCommand(new RunCommand(
        () -> arcadeDriveSubsystem.arcadeDrive(leftJoystick.getY(), leftJoystick.getZ()), arcadeDriveSubsystem));

    new JoystickButton(leftJoystick, Constants.shooterButton).whileHeld(() ->  shooterSubsystem.shoot(leftJoystick.getRawAxis(3)))
      .whenReleased(() -> shooterSubsystem.shoot(0.0));

  
      Shuffleboard.getTab("Shooter value").add("rpm", shooterSubsystem.shooterMotor.getAppliedOutput());
    
  }
  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return null;
    // An ExampleCommand will run in autonomous
   
  }
}
