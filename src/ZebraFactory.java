public class ZebraFactory extends AnimalFactory implements Animal{
    private static int numberOfZebras = 0;
    public ZebraFactory (){
        super();

    }
    @Override
    public void feedAnimal() {
        System.out.println("The zebra is eating grass...");
        if (AnimalFactory.getHunger() - 1 < 1){
            AnimalFactory.setHungerhigheorlow(1);
        }
        else {
            AnimalFactory.setLowerHunger();
        }
    }

    @Override
    public void watchAnimal() {
        System.out.println("The zebra is running...");
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
        numberOfZebras += 1;
        AnimalFactory.addcount();
        return new ZebraFactory();
    }

    public static int getNumberOfZebras() {
        return numberOfZebras;
    }
}
