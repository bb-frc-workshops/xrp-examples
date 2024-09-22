// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Kicker;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class Kick extends SequentialCommandGroup {
  /**
   * Creates a new Kick command using the Kicker subsystem. This will kick,
   * then reset for another kick right after. We need a pause between kicking
   * and resetting to get the servo arm enough time to reach past the kicker
   * mechanism.
   * @param kicker The kicker subsystem on which this command will run
   */
  public Kick(Kicker kicker) {
    addCommands(
        new InstantCommand(() -> kicker.kick()),
        new WaitMS(500),
        new ResetKicker(kicker));
  }
}
