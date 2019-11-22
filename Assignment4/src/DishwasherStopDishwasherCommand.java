public class DishwasherStopDishwasherCommand implements Command {
    Dishwasher dishwasher;

    public DishwasherStopDishwasherCommand(Dishwasher newDishwasher) { this.dishwasher = newDishwasher;}

    @Override
    public void execute(){ dishwasher.stopDishwasher();}

    @Override
    public String getName() {
        return "Stop dishwasher";
    }


}
