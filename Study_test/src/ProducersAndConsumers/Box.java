package ProducersAndConsumers;

public class Box {

    private int milk;

    private boolean starts = false;

    //如果布尔表达式的值为 true，则执行 if 语句中的代码块，否则执行 if 语句块后面的代码。
    public synchronized  void put(int milk) {
        if (starts) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

        starts = true;

        notifyAll();
    }

    public synchronized void get() {
        if (!starts){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("用户拿到第" + this.milk + "瓶奶");

        starts=false;

        notifyAll();
    }
}
