public class UnicornFactory extends AnimalFactory implements Animal{
    private static int numberOfUnicorns = 0;
    public UnicornFactory(){
        super();
        numberOfUnicorns +=1;
    }
    @Override
    public void feedAnimals() {
        System.out.println("The unicorn is eating rainbow cakes...");
        if (super.getHunger() - 1 < 1){
            super.setHunger(1);
        }
        else {
            super.setHunger(super.getHunger() -1);
        }
    }

    @Override
    public void watchAnimals() {
        System.out.println("The unicorn is flying...");
        if (super.getHunger() +1 > 5){
            super.setHunger(5);
        }
        if (super.getHappiness() + 1 > 5){
            super.setHappiness(5);
        }
    }

    @Override
    public Animal createAnimal() {
        return new UnicornFactory();
    }
}
