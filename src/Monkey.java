public class Monkey extends AbstractAnimal {
    public Monkey(final String name, final double weight) {
        // TODO your job
        super(name, weight);
    }
    @Override public double getDailyFoodPercentage() {
        return 0.1;
    }
    // TODO override toString so that the elephant reports its name (as in the output)
    @Override public String toString(){
        return "Monkey " + getName();
    }
}
