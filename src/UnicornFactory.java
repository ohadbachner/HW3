public class UnicornFactory extends AnimalFactory implements Animal{
    private static int numberOfUnicorns = 0;
    public UnicornFactory(){
        super();

    }
    @Override
    public void feedAnimal() {
        System.out.println("The unicorn is eating rainbow cakes...");
        if (AnimalFactory.getHunger() - 1 < 1){
            AnimalFactory.setHungerhigheorlow(1);
        }
        else {
            AnimalFactory.setLowerHunger();
        }
    }

    @Override
    public void watchAnimal() {
        System.out.println("The unicorn is flying...");
        if (AnimalFactory.getHunger() +1 > 5 || AnimalFactory.getHappiness() +1 > 5) {
            if (AnimalFactory.getHunger() +1 > 5) {
                AnimalFactory.setHungerhigheorlow(5);
            }
            if (AnimalFactory.getHappiness() +1 > 5) {
                AnimalFactory.setHappinesshigheorlow(5);
            }
        }
        else{
            AnimalFactory.setHunger();
            AnimalFactory.setHappiness();
        }
    }

    @Override
    public Animal createAnimal() {
        AnimalFactory.addcount();
        numberOfUnicorns +=1;
        return new UnicornFactory();
    }

    public static int getNumberOfUnicorns() {
        return numberOfUnicorns;
    }
}
