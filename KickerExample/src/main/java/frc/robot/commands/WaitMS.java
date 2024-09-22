// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;

public class WaitMS extends Command {
    private long m_startTime;
    private final long m_duration;

    /**
   * Creates a new WaitMS Command. This command will simply wait the amount of MS before procedding.
   *
   * @param duration How long to wait in milliseconds
   */
    public WaitMS(int duration) {
        m_duration = duration;
    }

    // Called when the command is initially scheduled. Reset the angle to much lower than the kicker
    @Override
    public void initialize() {
        m_startTime = System.currentTimeMillis();
    }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - m_startTime) >= m_duration;
  }
}
