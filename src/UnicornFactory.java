public class UnicornFactory extends AnimalFactory implements Animal{
    private static int numberOfUnicorns = 0;
    public UnicornFactory(){
        super();

    }
    @Override
    public void feedAnimal() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    @Override
    public void watchAnimal() {
        System.out.println("The unicorn is flying...");
    }

    @Override
    public Animal createAnimal() {
        AnimalFactory.addCount();
        numberOfUnicorns +=1;
        return new UnicornFactory();
    }

    public static int getNumberOfUnicorns() {
        return numberOfUnicorns;
    }
}
