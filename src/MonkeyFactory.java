public class MonkeyFactory extends AnimalFactory implements Animal{
    private static int numberOfMonkeys = 0;
    public MonkeyFactory(){
        super();
        numberOfMonkeys += 1;
    }

    @Override
    public void feedAnimals() {
        System.out.println("The monkey is eating a banana...");
        if (super.getHunger() - 1 < 1){
            super.setHunger(1);
        }
        else {
            super.setHunger(super.getHunger() -1);
        }
    }

    @Override
    public void watchAnimals() {
        System.out.println("The monkey is hanging on trees...");
        if (super.getHunger() +1 > 5){
            super.setHunger(5);
        }
        if (super.getHappiness() + 1 > 5){
            super.setHappiness(5);
        }
    }

    @Override
    public Animal createAnimal() {
        return new MonkeyFactory();
    }
}
