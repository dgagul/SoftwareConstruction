public class WashingmachineInterruptCommand implements Command {

    Washingmachine machine;

    public WashingmachineInterruptCommand(Washingmachine machine){
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.interrupt();
    }
}
