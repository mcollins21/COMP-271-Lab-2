public class Zoo {
    public static void main(final String[] args) {

        // create animal instances
        final Animal[] zoo = new Animal[]{
                new Elephant("Huey", 505.2),
                new Elephant("Dewey", 612.9),

                // TODO define two more animal classes
                // TODO create instances thereof here

                new Monkey("Mike",6.7),
                new Monkey("Johnny", 7.2),

                new Tiger("Calvin",270),
                new Tiger("Jerry",243),

        };

        System.out.println("Roll call");
        for (int i = 0; i < zoo.length; i++) {
            final Animal current = zoo[i];
            System.out.println("This is " + current + " weighing " + current.getWeight() + " kg");
        }

        System.out.println("Ready for feeding");
        double food = 0;
        for (int i = 0; i < zoo.length; i++) {
            final Animal current = zoo[i];
            food += current.getDailyFoodPercentage() * current.getWeight();
            current.doDailyFeeding();
        }
        System.out.println("Today we used " + food + " kg of food");

        // TODO check weight again

        System.out.println("Checking weight again");
        for (int i=0; i < zoo.length; i++) {
            final Animal current = zoo[i];
            System.out.println("This is "+ current + " weighing " + current.getWeight() + " kg");
        }
        // TODO exercise

        System.out.println("Exercising");
        for (int i =0; i < zoo.length; i++) {
            final Animal current = zoo[i];
            current.doDailyExercise();
        }

        // TODO check weight one last time

        System.out.println("Checking Weight One Last Time");
        for (int i = 0; i < zoo.length; i ++) {
            final Animal current = zoo[i];
            System.out.println("This is " + current + " weighing " + current.getWeight() + " kg");

        }
    }
}
