public class MonkeyFactory extends AnimalFactory implements Animal{
    private static int numberOfMonkeys = 0;
    public MonkeyFactory(){
        super();

    }

    @Override
    public void feedAnimal() {
        System.out.println("The monkey is eating a banana...");
    }

    @Override
    public void watchAnimal() {
        System.out.println("The monkey is hanging on trees...");
    }

    @Override
    public Animal createAnimal() {
        numberOfMonkeys += 1;
        AnimalFactory.addCount();
        return new MonkeyFactory();
    }

    public static int getNumberOfMonkeys() {
        return numberOfMonkeys;
    }
}
