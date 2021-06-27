public class MonkeyFactory extends AnimalFactory implements Animal{
    private static int numberOfMonkeys = 0;
    /**
     * the constructor calling the super class constructor
     */
    public MonkeyFactory(){
        super();
    }
    /**
     * the method print what the animal eat
     */
    @Override
    public void feedAnimal() {
        System.out.println("The monkey is eating a banana...");
    }
    /**
     * the method print what the animal doing in a show
     */
    @Override
    public void watchAnimal() {
        System.out.println("The monkey is hanging on trees...");
    }
    /**
     * creating new monkey adding to the monkey number and adding to the total animal
     * @return new Zebra
     */
    @Override
    public Animal createAnimal() {
        numberOfMonkeys += 1;
        AnimalFactory.addCount();
        return new MonkeyFactory();
    }
    /**
     *
     * @return the numbers of monkeys we have
     */
    public static int getNumberOfMonkeys() {
        return numberOfMonkeys;
    }
}
