public abstract class AnimalFactory {
    private static int numberOfAnimals = 0;

    /**
     * default constructor
     */

    public AnimalFactory() {
    }

    /**
     * static method
     * @return the number of the animals that ever made
     */
    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    /**
     * add on animal every time
     */
    public static void addCount() {
        numberOfAnimals += 1;
    }

    /**
     * abstract class that need to use in other sub class to create new animal
     * @return
     */
    public abstract Animal createAnimal();

}
