public class ZooObserver implements Observer{
    private String name;
    private String desc;
    public ZooObserver(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }
    private void display() {
        System.out.println("[" + name + "] " + desc);
    }
}
