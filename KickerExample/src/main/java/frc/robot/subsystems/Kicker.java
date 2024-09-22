// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Kicker extends SubsystemBase {
  private final XRPServo m_Servo;
  private final int RESET_ANGLE = 115; // Determined from trial and error
  private final int KICK_ANGLE = 170; // Enough to "release" the foot to kick 

  /** Creates a new Kicker. */
  public Kicker() {
    // Create a new Servo object leveraging Servo 2 on the XRP board
    m_Servo = new XRPServo(Constants.BoardConstants.SERVO_PORT2);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /**
   * Set the current angle of the arm (0 - 180 degrees).
   *
   * @param angleDeg Desired arm angle in degrees
   */
  public void setAngle(double angleDeg) {
    m_Servo.setAngle(angleDeg);
    System.out.println("Angle = " + angleDeg);
  }

  /**
   * Set kicker tight against XRP frame to prepare for kicking.
   */
  public void reset() {
    m_Servo.setAngle(RESET_ANGLE);
  }

  /** 
   * Extend kicker to kick object.
  */
  public void kick() {
    m_Servo.setAngle(KICK_ANGLE);
  }
}
