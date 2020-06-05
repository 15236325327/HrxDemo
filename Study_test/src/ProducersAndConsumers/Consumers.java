package ProducersAndConsumers;

public class Consumers implements Runnable {

    private Box b;

    public Consumers(Box b) {
        this.b=b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
