public abstract class AbstractAnimal implements Animal {
    private double weight;
    private final String name;
    public AbstractAnimal(final String name, final double weight) {
        // TODO initialize the instance variables - very important
        this.weight = weight;
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public abstract double getDailyFoodPercentage();
    public void doDailyFeeding() {
        // TODO increase weight according to daily %

        this.weight = (getDailyFoodPercentage() + 1) * getWeight();

    }
    public void doDailyExercise() {
        // TODO decrease weight according to daily %

        this.weight = getWeight() / (1 + getDailyFoodPercentage());

    }
}
