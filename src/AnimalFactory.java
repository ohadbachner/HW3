public abstract class AnimalFactory {
    private static int numberOfAnimals = 0;


    public AnimalFactory() {
    }


    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public static void addCount() {
        numberOfAnimals += 1;
    }

    public abstract Animal createAnimal();

}
