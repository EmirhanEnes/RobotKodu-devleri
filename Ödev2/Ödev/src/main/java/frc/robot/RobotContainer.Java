package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.KrakenSubsystem;

public class RobotContainer {

    private final KrakenSubsystem kraken = new KrakenSubsystem();
    private final Joystick joystick = new Joystick(0);

    public RobotContainer() {
    }

    public void teleopPeriodic() {

        if (joystick.getRawButton(1)) {
            kraken.setVoltage(6.0);
        }
        else if (joystick.getRawButton(2)) {
            kraken.setVoltage(-6.0);
        }
        else {
            kraken.setVoltage(0.0);
        }
    }
}

