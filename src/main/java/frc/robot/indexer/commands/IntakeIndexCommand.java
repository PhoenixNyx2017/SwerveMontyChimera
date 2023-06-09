package frc.robot.indexer.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.indexer.Indexer;
import frc.robot.intake.Intake;

public class IntakeIndexCommand extends CommandBase {
    Intake intake;
    Indexer indexer;

    public IntakeIndexCommand(Intake intake, Indexer indexer) {
        this.intake = intake;
        this.indexer = indexer;
        addRequirements(indexer);
    }

    @Override
    public void execute() {
        // if (intake.isDeployed() && !indexer.hasCargo()) {
        if (!indexer.hasCargo()) {
            indexer.intakeIndex();
        } else {
            indexer.stopIndex();
        }
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}