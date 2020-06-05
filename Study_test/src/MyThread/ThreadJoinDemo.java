package MyThread;

public class ThreadJoinDemo {

    public static void main(String[] args) {

        ThreadJoin ts1=new ThreadJoin();
        ThreadJoin ts2=new ThreadJoin();
        ThreadJoin ts3=new ThreadJoin();

        ts1.setName("三阿哥");
        ts2.setName("四阿哥");
        ts3.setName("八阿哥");

        ts1.start();
        try {
            ts1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ts2.start();
        ts3.start();

    }
}
