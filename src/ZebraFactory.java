public class ZebraFactory extends AnimalFactory implements Animal{
    private static int numberOfZebras = 0;
    public ZebraFactory (){
        super();
        numberOfZebras += 1;
    }
    @Override
    public void feedAnimals() {
        System.out.println("The zebra is eating grass...");
        if (super.getHunger() - 1 < 1){
            super.setHunger(1);
        }
        else {
            super.setHunger(super.getHunger() -1);
        }
    }

    @Override
    public void watchAnimals() {
        System.out.println("The zebra is running...");
        if (super.getHunger() +1 > 5){
            super.setHunger(5);
        }
        if (super.getHappiness() + 1 > 5){
            super.setHappiness(5);
        }
    }

    @Override
    public Animal createAnimal() {
        return new ZebraFactory();
    }
}
