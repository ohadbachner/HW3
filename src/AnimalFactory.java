public abstract class AnimalFactory {
    private static int numberOfAnimals = 0;
    private static int happiness;
    private static int hunger;
    public AnimalFactory (){
        this.happiness = 2;
        this.hunger = 3;
    }

    public static int getHappiness() {
        return happiness;
    }

    public static int getHunger() {
        return hunger;
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public static void setHappinesshigheorlow(int happiness1) {
        happiness = happiness1;
    }



    public static void setHungerhigheorlow(int hunger1) {
        hunger = hunger1;
    }

    public static void setHunger() {
        AnimalFactory.hunger += 1;
    }

    public static void setHappiness() {
        AnimalFactory.happiness += 1;
    }

    public static void addcount(){
        numberOfAnimals +=1;
    }
    public abstract Animal createAnimal();

}
