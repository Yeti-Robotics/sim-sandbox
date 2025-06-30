package frc.robot.subsystems.arm;

import edu.wpi.first.units.Units;
import edu.wpi.first.units.measure.Angle;

public enum ArmPosition {
    DOWN(-0.254),
    UP(0.254),
    ALGAE_STOW(0.169434),
    ALGAE_SCORE(0.2),
    POS_L1(-0.1),
    SCORE_L1(-0.1),
    POS_L2(.15),
    SCORE_L2(.07),
    POS_L3(.13),
    HIGH_ALGAE(.1),
    SCORE_L3(.06),
    POS_L4(.15),
    SCORE_L4(.05),
    AWAY(0),
    GROUND(-0.029785),
    HP(0.158691),
    AWAY_BUMPER(0.05),
    CLIMB_L4(0.35),
    SCORE_CLIMB_L4(0.45),
    CLIMB_L3(0.37),
    SCORE_CLIMB_L3(0.44),
    HOLD(-1); // special case, for when transitions are interrupted

    private final Angle angle;

    ArmPosition(double angle) {
        this(Units.Rotations.of(angle));
    }

    ArmPosition(Angle angle) {
        this.angle = angle;
    }

    public Angle getAngle() {
        return angle;
    }
}
