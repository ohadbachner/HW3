public class ZooObserver implements Observer {
    private final String name;
    private String desc;

    /**
     * Class constructor.
     * initializes the name of the observer
     */
    public ZooObserver(String name) {
        this.name = name;
    }

    /**
     * updates the observers
     * @param desc saves the messages that need to be sent to the observes.
     */
    @Override
    public void update(String desc) {
        this.desc = desc;
        display();
    }

    /**
     *prints updates for each observer
     */
    private void display() {
        System.out.println("[" + name + "] " + desc);
    }
}
