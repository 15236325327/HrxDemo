package ProducersAndConsumers;

public class Producers  implements Runnable{

    private Box b;

    public Producers(Box b) {
        this.b=b;
    }

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            b.put(i);
        }
    }
}
