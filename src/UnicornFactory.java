public class UnicornFactory extends AnimalFactory implements Animal{
    private static int numberOfUnicorns = 0;

    /**
     * the constructor calls the super class constructor
     */
    public UnicornFactory(){
        super();

    }

    /**
     * the method prints what the animal eats
     */
    @Override
    public void feedAnimal() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    /**
     * the method prints what the animal is doing in the show
     */
    @Override
    public void watchAnimal() {
        System.out.println("The unicorn is flying...");
    }

    /**
     * creating a new unicorn, adding to the unicorn number and adding to
     * the total animal number
     * @return new unicorn
     */
    @Override
    public Animal createAnimal() {
        AnimalFactory.addCount();
        numberOfUnicorns +=1;
        return new UnicornFactory();
    }

    /**
     *
     * @return the numbers of unicorns we have
     */
    public static int getNumberOfUnicorns() {
        return numberOfUnicorns;
    }
}
