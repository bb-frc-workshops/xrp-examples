// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  // For constants used to specify driver/operator configuration. In this case, this
  // is the USB port on our computer we connected the gaming controller to.
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  // Logitech Dual Action Controller
  public static class Logitech {
    public static final int BUTTON_X = 1;
    public static final int BUTTON_A = 2;
    public static final int BUTTON_B = 3;
    public static final int BUTTON_Y = 4;
    public static final int BUTTON_LT = 5;
    public static final int BUTTON_RT = 6;
    public static final int BUTTON_LB = 7;
    public static final int BUTTON_RB = 8;
    public static final int BUTTON_BACK = 9;
    public static final int BUTTON_START = 10;
    public static final int BUTTON_L_ANALOG = 11;
    public static final int BUTTON_R_ANALOG = 12;

    public static final int LEFT_ANALOG_HORIZONTAL = 0;
    public static final int LEFT_ANALOG_VERTICAL = 1;
    public static final int RIGHT_ANALOG_HORIZONTAL = 2;
    public static final int RIGHT_ANALOG_VERTICAL = 3;
    
  }
  // For constants used on the XRP board. These are assigned per
  // https://docs.wpilib.org/en/stable/docs/xrp-robot/getting-to-know-xrp.html
  public static class BoardConstants {
    public static final int MOTOR_PORT2 = 3;
    public static final int MOTOR_PORT3 = 4;
    public static final int SERVO_PORT1 = 4;
    public static final int SERVO_PORT2 = 5;
    public static final int USER_BUTTON_DIO = 0;
    public static final int GREEN_LED_DIO = 1;
    public static final int LEFT_REFLECT_SENSOR_AIN = 0;
    public static final int RIGHT_REFLECT_SENSOR_AIN = 1;
    public static final int RANGEFINDER_AIN = 2;
  }
}
