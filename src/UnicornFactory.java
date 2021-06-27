public class UnicornFactory extends AnimalFactory implements Animal{
    private static int numberOfUnicorns = 0;

    /**
     * the constructor calling the super class constructor
     */
    public UnicornFactory(){
        super();

    }

    /**
     * the method print what the animal eat
     */
    @Override
    public void feedAnimal() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    /**
     * the method print what the animal doing in a show
     */
    @Override
    public void watchAnimal() {
        System.out.println("The unicorn is flying...");
    }

    /**
     * creating new unicorn adding to the unicorn number and adding to the total animal
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
     * @return the numbers of unicorn we have
     */
    public static int getNumberOfUnicorns() {
        return numberOfUnicorns;
    }
}
