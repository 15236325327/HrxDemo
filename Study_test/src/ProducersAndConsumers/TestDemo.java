package ProducersAndConsumers;

public class TestDemo {

    public static void main(String[] args) {

        Box b=new Box();

        Producers pr=new Producers(b);

        Consumers co=new Consumers(b);

        Thread t1=new Thread(pr);
        Thread t2=new Thread(co);

        t1.start();
        t2.start();

    }
}
