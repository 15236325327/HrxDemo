package LaFunctionalInterface;

public class RunnableDemo {

    public static void main(String[] args) {

        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "启动了");
            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"启动了"));

    }

    private static void startThread(Runnable r) {
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                Thread t = new Thread(r, "兰博基尼");
                t.start();
            } else if (i == 1) {
                Thread t = new Thread(r, "玛莎拉蒂");
                t.start();
            } else {
                Thread t = new Thread(r, "劳斯莱斯");
                t.start();
            }
        }
    }
}
