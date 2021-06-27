public class ZebraFactory extends AnimalFactory implements Animal{
    private static int numberOfZebras = 0;
    /**
     * the constructor calling the super class constructor
     */
    public ZebraFactory (){
        super();
    }
    /**
     * the method print what the animal eat
     */
    @Override
    public void feedAnimal() {
        System.out.println("The zebra is eating grass...");
    }
    /**
     * the method print what the animal doing in a show
     */
    @Override
    public void watchAnimal() {
        System.out.println("The zebra is running...");
    }
    /**
     * creating new Zebra adding to the zebra number and adding to the total animal
     * @return new Zebra
     */
    @Override
    public Animal createAnimal() {
        numberOfZebras += 1;
        AnimalFactory.addCount();
        return new ZebraFactory();
    }
    /**
     *
     * @return the numbers of zebra we have
     */
    public static int getNumberOfZebras() {
        return numberOfZebras;
    }
}
