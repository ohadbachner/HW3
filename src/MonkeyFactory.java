public class MonkeyFactory extends AnimalFactory implements Animal{
    private static int numberOfMonkeys = 0;
    /**
     * the constructor calls the super class constructor
     */
    public MonkeyFactory(){
        super();
    }
    /**
     * the method prints what the animal eat
     */
    @Override
    public void feedAnimal() {
        System.out.println("The monkey is eating a banana...");
    }
    /**
     * the method prints what the animal is doing in the show
     */
    @Override
    public void watchAnimal() {
        System.out.println("The monkey is hanging on trees...");
    }
    /**
     * creating a new monkey, adding to the monkey number and adding to the
     * total animal number
     * @return new monkey
     */
    @Override
    public Animal createAnimal() {
        numberOfMonkeys += 1;
        AnimalFactory.addCount();
        return new MonkeyFactory();
    }
    /**
     *
     * @return the number of monkeys in the zoo
     */
    public static int getNumberOfMonkeys() {
        return numberOfMonkeys;
    }
}
