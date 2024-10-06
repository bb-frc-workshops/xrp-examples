// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Chomper extends SubsystemBase {
  private final XRPServo m_chomperServo;

  /** Creates a new Chomper. */
  public Chomper() {
    // Device number 4 maps to the physical servo 1 port on the XRP
    m_chomperServo = new XRPServo(4);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setPosition(ChomperPosition pos) {
    if (pos == ChomperPosition.OPEN) {
      m_chomperServo.setAngle(120);
    }
    else {
      m_chomperServo.setAngle(20);
    }
  }

  public enum ChomperPosition {
    OPEN,
    CLOSE
  }
}
