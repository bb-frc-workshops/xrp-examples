// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Kicker;


public class ResetKicker extends Command {
    private final Kicker m_kicker;
    private long m_startTime;
    private final long WAIT_MS = 500;
    private boolean m_finished;

    /**
   * Creates a new ResetKicker Command. This command will reset the kicker so it's ready to kick again.
   *
   * @param kicker The kicker subsystem on which this command will run
   */
    public ResetKicker(Kicker kicker) {
        m_kicker = kicker;
        addRequirements(kicker);
    }

    // Called when the command is initially scheduled. Reset the angle to much lower than the kicker
    @Override
    public void initialize() {
        m_startTime = System.currentTimeMillis();
        m_finished = false;
        m_kicker.setAngle(0.0);
    }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if((System.currentTimeMillis() - m_startTime) >= WAIT_MS) {
        m_kicker.reset();
        m_finished = true;
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    //return (System.currentTimeMillis() - m_startTime) >= m_duration;
    return m_finished;
  }
}
