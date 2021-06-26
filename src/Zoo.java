import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    private final ArrayList<ZooObserver> observers;
    private static Zoo instance = null;
    public Zoo (){
        this.animals = new ArrayList<Animal>();
        this.observers = new ArrayList<ZooObserver>();

    }


    public static Zoo getInstance(){
        if(instance == null){
            System.out.println("Creating zoo...");
            instance = new Zoo();
        }
        else {
            System.out.println("The zoo already exists...");
        }
        return instance;
    }


    public void addAnimal(Animal animal) {
        this.animals.add(animal);
        System.out.println("Notifying observers:");
        if(animal instanceof ZebraFactory){
            for (int i = 0 ; i < observers.size() ; i++){
                observers.get(i).update("Zebra has been added to the zoo!");
            }
        }
        if(animal instanceof UnicornFactory){
            for (int i = 0 ; i < observers.size() ; i++){
                observers.get(i).update("Unicorn has been added to the zoo!");
            }
        }
        if(animal instanceof MonkeyFactory){
            for (int i = 0 ; i < observers.size() ; i++){
                observers.get(i).update("Monkey has been added to the zoo!");
            }
        }


    }

    public void addObserver(ZooObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(ZooObserver observer) {
        this.observers.remove(observer);

    }
    public void showAnimalsInfo(){
        System.out.println("The zoo contains total of " + AnimalFactory.getNumberOfAnimals()+ " animals:" );
        System.out.println("- Zebra: " + ZebraFactory.getNumberOfZebras() );
        System.out.println("- Unicorn: " + UnicornFactory.getNumberOfUnicorns() );
        System.out.println("- Monkey: " + MonkeyFactory.getNumberOfMonkeys() );
        System.out.println("Happiness level: " + AnimalFactory.getHappiness() );
        if (AnimalFactory.getHappiness() < 3){
            System.out.println("The animals are not happy, you should watch them...");
        }
        else {
            System.out.println("The animals are very happy, keep working hard...");
        }
        System.out.println("Hunger level: " + AnimalFactory.getHunger() );
        if (AnimalFactory.getHunger() > 3){
            System.out.println("The animals are hungry, you should feed them...");
        }
    }
    public void feedAnimals(){
        for(int i = 0 ; i< animals.size() ; i++){
            animals.get(i).feedAnimal();
        }
        System.out.println("Notifying observers:");
        for(int i = 0 ; i< observers.size() ; i++){
            observers.get(i).update("The animals are being fed");
        }

    }
    public void watchAnimals(){
        for(int i = 0 ; i< animals.size() ; i++){
            animals.get(i).watchAnimal();
        }
        System.out.println("Notifying observers:");
        for(int i = 0 ; i< observers.size() ; i++){
            observers.get(i).update("The animals are being watched");
        }
    }
}
