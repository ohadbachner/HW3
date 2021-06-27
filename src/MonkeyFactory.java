public class MonkeyFactory extends AnimalFactory implements Animal{
    private static int numberOfMonkeys = 0;
    public MonkeyFactory(){
        super();

    }

    @Override
    public void feedAnimal() {
        System.out.println("The monkey is eating a banana...");
        if (AnimalFactory.getHunger() - 1 < 1){
            AnimalFactory.setHungerhigheorlow(1);
        }
        else {
            AnimalFactory.setLowerHunger();
        }
    }

    @Override
    public void watchAnimal() {
        System.out.println("The monkey is hanging on trees...");
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


       /* if (AnimalFactory.getHunger() +1 > 5 && AnimalFactory.getHappiness() + 1 > 5){
            AnimalFactory.setHungerhigheorlow(5);
            AnimalFactory.setHappinesshigheorlow(5);
        }
        if (AnimalFactory.getHappiness() + 1 > 5 && AnimalFactory.getHunger() +1 < 5 ){
            AnimalFactory.setHappinesshigheorlow(5);
            AnimalFactory.setHunger();
        }
        if (AnimalFactory.getHappiness() + 1 <5 && AnimalFactory.getHunger() +1 > 5 ){
            AnimalFactory.setHappiness();
            AnimalFactory.setHungerhigheorlow(5);
        }
        else {
            AnimalFactory.setHappiness();
            AnimalFactory.setHunger();
        }*/
    }

    @Override
    public Animal createAnimal() {
        numberOfMonkeys += 1;
        AnimalFactory.addcount();
        return new MonkeyFactory();
    }

    public static int getNumberOfMonkeys() {
        return numberOfMonkeys;
    }
}
