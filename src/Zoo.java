import java.util.ArrayList;

public class Zoo  {
    private final ArrayList<Animal> animals;
    private final ArrayList<ZooObserver> observers;
    private static Zoo instance = null;
    private static int happiness;
    private static int hunger;
    static final int START_HUNGER = 3;
    static final int START_HAPPINESS = 2;
    static final int MAX_LEVEL = 5;
    static final int MIN_LEVEL = 1;

    /**
     * Class constructor. creates arraylists of animals and observers
     * initializes happiness and hunger levels
     */
    public Zoo() {
        this.animals = new ArrayList<>();
        this.observers = new ArrayList<>();
        happiness = START_HAPPINESS;
        hunger = START_HUNGER;

    }

    /**
     * initializes zoo instance if there isn't an existing one
     */
    public static Zoo getInstance() {
        if (instance == null) {
            System.out.println("Creating zoo...");
            instance = new Zoo();
        } else {
            System.out.println("The zoo already exists...");
        }
        return instance;
    }

    /**
     *adds a new animal to the zoo and updates the observers.
     * @param animal animal which need to be added.
     */
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
        System.out.println("Notifying observers:");
        if (animal instanceof ZebraFactory) {
            for (ZooObserver observer : observers) {
                observer.update("Zebra has been added to the zoo!");
            }
        }
        if (animal instanceof UnicornFactory) {
            for (ZooObserver observer : observers) {
                observer.update("Unicorn has been added to the zoo!");
            }
        }
        if (animal instanceof MonkeyFactory) {
            for (ZooObserver observer : observers) {
                observer.update("Monkey has been added to the zoo!");
            }
        }


    }

    /**
     * @return happiness level
     */
    public static int getHappiness() {
        return Zoo.happiness;
    }

    /**
     * @return hunger level
     */
    public static int getHunger() {
        return Zoo.hunger;
    }

    /**
     *decreases hunger level by one if it's higher than minimum value
     */
    public static void setHungerWhenFeed() {
        if (Zoo.getHunger() - 1 < 1) {
            Zoo.hunger = MIN_LEVEL;
        } else {
            Zoo.hunger -= 1;
        }
    }

    /**
     *increases hunger and happiness levels by one if they are
     * lower the maximum value
     */
    public static void setHappinessAndHungerWhenWatch() {
        if (Zoo.getHappiness() + 1 > MAX_LEVEL) {
            Zoo.happiness = MAX_LEVEL;
        } else {
            Zoo.happiness += 1;
        }
        if (Zoo.getHunger() + 1 > MAX_LEVEL) {
            Zoo.hunger = MAX_LEVEL;
        } else {
            Zoo.hunger += 1;
        }

    }

    /**
     *adds a new a new observer to the observers list.
     * @param observer observer which need to be added.
     */
    public void addObserver(ZooObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(ZooObserver observer) {
        this.observers.remove(observer);

    }

    /**
     * prints happiness and hunger levels, number of animals from each kind
     * and number of animals in the zoo.
     */
    public void showAnimalsInfo() {
        System.out.println("The zoo contains total of " + AnimalFactory.
                getNumberOfAnimals() + " animals:");
        System.out.println("- Zebra: " + ZebraFactory.getNumberOfZebras());
        System.out.println("- Unicorn: " + UnicornFactory.getNumberOfUnicorns());
        System.out.println("- Monkey: " + MonkeyFactory.getNumberOfMonkeys());
        System.out.println("Happiness level: " + Zoo.getHappiness());
        if (Zoo.getHappiness() < 3) {
            System.out.println("The animals are not happy, " +
                    "you should watch them...");
        } else {
            System.out.println("The animals are very happy, " +
                    "keep working hard...");
        }
        System.out.println("Hunger level: " + Zoo.getHunger());
        if (Zoo.getHunger() > 3) {
            System.out.println("The animals are hungry, " +
                    "you should feed them...");
        }
    }

    /**
     * feeds the animals and updates the observes.
     */
    public void feedAnimals() {
        Zoo.setHungerWhenFeed();
        for (Animal animal : animals) {
            animal.feedAnimal();
        }
        System.out.println("Notifying observers:");
        for (ZooObserver observer : observers) {
            observer.update("The animals are being fed");
        }

    }

    /**
     * watches the animals show and updates the observes.
     */
    public void watchAnimals() {
        Zoo.setHappinessAndHungerWhenWatch();
        for (Animal animal : animals) {
            animal.watchAnimal();
        }
        System.out.println("Notifying observers:");
        for (ZooObserver observer : observers) {
            observer.update("The animals are being watched");
        }
    }
}

