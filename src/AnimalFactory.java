public abstract class AnimalFactory {
    private static int numberOfAnimals = 0;
    private int happiness;
    private int hunger;
    public AnimalFactory (){
        numberOfAnimals += 1;
        this.happiness = 2;
        this.hunger = 3;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public abstract Animal createAnimal();

}
