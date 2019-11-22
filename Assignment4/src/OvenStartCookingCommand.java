public class OvenStartCookingCommand implements Command {
    Oven oven;

    public OvenStartCookingCommand(Oven oven){
        this.oven = oven;
    }

    @Override
    public void execute() {
        oven.startCooking();
    }

    @Override
    public String getName() {
        return "Start cooking";
    }

}
