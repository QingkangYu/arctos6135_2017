// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6135.robot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static final double WHEEL_DIAMETER=3.0;
	public static final double PULSE_REDUCTION=48.0;
    public static DigitalInput gearPhotoSensor;
    public static CANTalon fuelIntakeTalon;
    public static CANTalon fuelIndexerTalon;
    public static VictorSP fuelIndexerVictor;
    public static CANTalon climberTalon;
    public static Encoder leftEncoder;
    public static Encoder rightEncoder;
    public static VictorSP rightDriveVictor;
    public static VictorSP leftDriveVictor;
    public static RobotDrive robotDrive;
    public static PowerDistributionPanel miscallaneousPowerDistributionPanel;
    public static CANTalon shooterTalon;
    
    public static boolean lReverse=true;
    public static boolean rReverse=false;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        gearPhotoSensor = new DigitalInput(4);
        LiveWindow.addSensor("Gear", "gearPhotoSensor", gearPhotoSensor);
        
        fuelIntakeTalon = new CANTalon(1);
        LiveWindow.addActuator("FuelIntake", "intakeTalon", fuelIntakeTalon);
        
        fuelIndexerTalon = new CANTalon(2);
        LiveWindow.addActuator("FuelIndexer", "indexerTalon", fuelIndexerTalon);
        
        fuelIndexerVictor = new VictorSP(2);
        LiveWindow.addActuator("FuelIndexer", "indexerVictor", fuelIndexerVictor);
        
        climberTalon = new CANTalon(4);
        LiveWindow.addActuator("Climber", "climberTalon", climberTalon);
        
        leftEncoder = new Encoder(0, 1, true, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "drivetrainLeftEncoder", leftEncoder);
        leftEncoder.setDistancePerPulse(WHEEL_DIAMETER/PULSE_REDUCTION/PULSE_REDUCTION);
        leftEncoder.setPIDSourceType(PIDSourceType.kRate);
        rightEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "drivetrainRightEncoder", rightEncoder);
        rightEncoder.setDistancePerPulse(WHEEL_DIAMETER/PULSE_REDUCTION/PULSE_REDUCTION);
        rightEncoder.setPIDSourceType(PIDSourceType.kRate);
        rightDriveVictor = new VictorSP(1);
        LiveWindow.addActuator("Drivetrain", "rightDriveVictor", rightDriveVictor);
        
        leftDriveVictor = new VictorSP(0);
        LiveWindow.addActuator("Drivetrain", "leftDriveVictor", leftDriveVictor);
        
        robotDrive = new RobotDrive(leftDriveVictor, rightDriveVictor);
        
        robotDrive.setSafetyEnabled(true);
        robotDrive.setExpiration(0.1);
        robotDrive.setSensitivity(0.5);
        robotDrive.setMaxOutput(1.0);
        robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        miscallaneousPowerDistributionPanel = new PowerDistributionPanel(0);
        LiveWindow.addSensor("Miscallaneous", "PowerDistributionPanel", miscallaneousPowerDistributionPanel);
        
        shooterTalon = new CANTalon(3);
        LiveWindow.addActuator("Shooter", "shooterTalon", shooterTalon);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
