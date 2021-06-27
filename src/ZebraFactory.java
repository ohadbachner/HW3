public class ZebraFactory extends AnimalFactory implements Animal{
    private static int numberOfZebras = 0;
    public ZebraFactory (){
        super();

    }
    @Override
    public void feedAnimal() {
        System.out.println("The zebra is eating grass...");
    }

    @Override
    public void watchAnimal() {
        System.out.println("The zebra is running...");
    }

    @Override
    public Animal createAnimal() {
        numberOfZebras += 1;
        AnimalFactory.addCount();
        return new ZebraFactory();
    }

    public static int getNumberOfZebras() {
        return numberOfZebras;
    }
}
