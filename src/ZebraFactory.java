public class ZebraFactory extends AnimalFactory implements Animal{
    private static int numberOfZebras = 0;
    /**
     * the constructor calls the super class constructor
     */
    public ZebraFactory (){
        super();
    }
    /**
     * the method prints what the animal eats
     */
    @Override
    public void feedAnimal() {
        System.out.println("The zebra is eating grass...");
    }
    /**
     * the method prints what the animal is doing in the show
     */
    @Override
    public void watchAnimal() {
        System.out.println("The zebra is running...");
    }
    /**
     * creating new Zebra, adding to the zebra number and adding to the
     * total animal number
     * @return new zebra
     */
    @Override
    public Animal createAnimal() {
        numberOfZebras += 1;
        AnimalFactory.addCount();
        return new ZebraFactory();
    }
    /**
     *
     * @return the number of zebras in the zoo
     */
    public static int getNumberOfZebras() {
        return numberOfZebras;
    }
}
