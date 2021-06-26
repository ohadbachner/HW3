import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<ZooObserver> observers;
    private static Zoo instance = null;
    private Zoo(){
    }
    public Zoo getInstance(){
        if(instance == null){
            instance = new Zoo();
        }
        return instance;
    }


    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void addObserver(ZooObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(ZooObserver observer) {
        this.observers.remove(observer);

    }
    public void showAnimalsInfo(){
        
    }
}
